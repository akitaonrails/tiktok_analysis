package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13eA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20059213eA {
    public long[] LIZ = new long[192];
    public long[] LIZIZ = new long[192];
    public int LIZJ;

    public final void LIZIZ(int i, InterfaceC1631630sYr interfaceC1631630sYr) {
        int i2 = i & 67108863;
        long[] jArr = this.LIZ;
        int i3 = this.LIZJ;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                interfaceC1631630sYr.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public static void LIZ(C20059213eA c20059213eA, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i & 67108863;
        long[] jArr = c20059213eA.LIZ;
        int i8 = c20059213eA.LIZJ;
        int i9 = i8 + 3;
        c20059213eA.LIZJ = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            c20059213eA.LIZ = Arrays.copyOf(jArr, iMax);
            c20059213eA.LIZIZ = Arrays.copyOf(c20059213eA.LIZIZ, iMax);
        }
        long[] jArr2 = c20059213eA.LIZ;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i5) & 4294967295L) | (((long) i4) << 32);
        int i10 = i6 & 67108863;
        jArr2[i8 + 2] = (((long) 0) << 63) | (((long) 0) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i10) << 26) | (((long) (i7 & 67108863)) << 0);
        if (i6 >= 0) {
            for (int i11 = i8 - 3; i11 >= 0; i11 -= 3) {
                int i12 = i11 + 2;
                long j = jArr2[i12];
                if ((((int) j) & 67108863) == i10) {
                    jArr2[i12] = (j & (-2301339409586323457L)) | (((long) ((i8 - i11) & 511)) << 52);
                    return;
                }
            }
        }
    }
}
