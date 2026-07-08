package X;

/* JADX INFO: renamed from: X.19kK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21626219kK {
    public static int LIZ(C21625619kE c21625619kE, boolean z) {
        int i;
        int i2;
        byte b;
        if (z) {
            i = c21625619kE.LIZJ;
            i2 = c21625619kE.LIZIZ;
        } else {
            i = c21625619kE.LIZIZ;
            i2 = c21625619kE.LIZJ;
        }
        byte[][] bArr = c21625619kE.LIZ;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                if (z) {
                    b = bArr[i4][i6];
                } else {
                    b = bArr[i6][i4];
                }
                if (b == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    i5 = 1;
                    b2 = b;
                }
            }
            if (i5 >= 5) {
                i3 += (i5 - 5) + 3;
            }
        }
        return i3;
    }
}
