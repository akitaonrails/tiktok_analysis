package X;

/* JADX INFO: renamed from: X.1E91, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E91 {
    public static int LIZIZ(char c) {
        int i = c - 19968;
        if (i >= 0 && i < 7000) {
            return LIZ(C1E92.LIZ, i, C1E92.LIZIZ);
        }
        if (7000 <= i && i < 14000) {
            return LIZ(C1E93.LIZ, i - 7000, C1E93.LIZIZ);
        }
        return LIZ(C1E94.LIZ, i - 14000, C1E94.LIZIZ);
    }

    public static String LIZJ(char c) {
        if (19968 <= c) {
            if (c <= 40869 && LIZIZ(c) > 0) {
                return C2280541EOe.LIZIZ[LIZIZ(c)];
            }
        } else if (12295 == c) {
            return "LING";
        }
        return String.valueOf(c);
    }

    public static short LIZ(byte[] bArr, int i, byte[] bArr2) {
        short s = (short) (bArr2[i] & 255);
        if ((bArr[i / 8] & C2280541EOe.LIZ[i % 8]) != 0) {
            return (short) (s | 256);
        }
        return s;
    }
}
