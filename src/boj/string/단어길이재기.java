package boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어길이재기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().split(" ")[0].length());

    }

}
