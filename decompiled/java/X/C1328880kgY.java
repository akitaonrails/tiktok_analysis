package X;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0kgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328880kgY {
    public static void LIZ(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static Pair<Integer, Integer> LIZIZ(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        short s = (short) (inputStream.read() & 255);
        short s2 = (short) (inputStream.read() & 255);
        short s3 = (short) (inputStream.read() & 255);
        if (s == 157 && s2 == 1 && s3 == 42) {
            byte b = (byte) inputStream.read();
            return new Pair<>(Integer.valueOf((b & 255) | ((((byte) inputStream.read()) << 8) & 65280)), Integer.valueOf(((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255)));
        }
        return null;
    }

    public static Pair<Integer, Integer> LIZJ(InputStream inputStream) throws IOException {
        LIZ(inputStream);
        if (((byte) (inputStream.read() & 255)) != 47) {
            return null;
        }
        int i = ((byte) inputStream.read()) & 255;
        int i2 = ((byte) inputStream.read()) & 255;
        int i3 = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | (i3 << 2) | ((i2 & 192) >> 6)) + 1));
    }

    public static int LIZLLL(InputStream inputStream) {
        byte b = (byte) (inputStream.read() & 255);
        return ((((byte) (inputStream.read() & 255)) << 16) & 16711680) | ((((byte) (inputStream.read() & 255)) << 8) & 65280) | (b & 255);
    }
}
