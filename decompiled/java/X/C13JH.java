package X;

/* JADX INFO: renamed from: X.13JH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13JH {
    public static final char[] LIZ = new char[117];
    public static final byte[] LIZIZ = new byte[126];

    static {
        int i = 0;
        int i2 = 0;
        do {
            LIZ('u', i2);
            i2++;
        } while (i2 < 32);
        LIZ('b', 8);
        LIZ('t', 9);
        LIZ('n', 10);
        LIZ('f', 12);
        LIZ('r', 13);
        LIZ('/', 47);
        LIZ('\"', 34);
        LIZ('\\', 92);
        do {
            LIZIZ[i] = 127;
            i++;
        } while (i < 33);
        byte[] bArr = LIZIZ;
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void LIZ(char c, int i) {
        if (c != 'u') {
            LIZ[c] = (char) i;
        }
    }
}
