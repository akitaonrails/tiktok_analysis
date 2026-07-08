package X;

/* JADX INFO: renamed from: X.19jf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21622119jf {
    public static final int[] LIZ = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static C21622019je LIZJ(int i, C21622019je c21622019je) {
        C21622019je c21622019je2 = new C21622019je();
        int i2 = c21622019je.LLILLJJLI;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || c21622019je.LIZLLL(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                c21622019je2.LIZIZ(i8, i);
            } else if (i8 == 0) {
                c21622019je2.LIZIZ(i5 | 1, i);
            } else {
                c21622019je2.LIZIZ(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return c21622019je2;
    }

    public static void LIZ(C21621919jd c21621919jd, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    c21621919jd.LIZIZ(i5, i4);
                    c21621919jd.LIZIZ(i5, i6);
                    c21621919jd.LIZIZ(i4, i5);
                    c21621919jd.LIZIZ(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        c21621919jd.LIZIZ(i7, i7);
        int i8 = i7 + 1;
        c21621919jd.LIZIZ(i8, i7);
        c21621919jd.LIZIZ(i7, i8);
        int i9 = i + i2;
        c21621919jd.LIZIZ(i9, i7);
        c21621919jd.LIZIZ(i9, i8);
        c21621919jd.LIZIZ(i9, i9 - 1);
    }

    public static C21622019je LIZIZ(C21622019je c21622019je, int i, int i2) {
        C21622219jg c21622219jg;
        int i3;
        int i4 = c21622019je.LLILLJJLI / i2;
        if (i2 != 4) {
            if (i2 != 6) {
                if (i2 != 8) {
                    if (i2 != 10) {
                        if (i2 == 12) {
                            c21622219jg = C21622219jg.LJI;
                        } else {
                            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
                        }
                    } else {
                        c21622219jg = C21622219jg.LJII;
                    }
                } else {
                    c21622219jg = C21622219jg.LJIIJJI;
                }
            } else {
                c21622219jg = C21622219jg.LJIIIIZZ;
            }
        } else {
            c21622219jg = C21622219jg.LJIIIZ;
        }
        C21622319jh c21622319jh = new C21622319jh(c21622219jg);
        int i5 = i / i2;
        int[] iArr = new int[i5];
        int i6 = c21622019je.LLILLJJLI / i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = 0;
            int i9 = 0;
            do {
                if (c21622019je.LIZLLL((i7 * i2) + i8)) {
                    i3 = 1 << ((i2 - i8) - 1);
                } else {
                    i3 = 0;
                }
                i9 |= i3;
                i8++;
            } while (i8 < i2);
            iArr[i7] = i9;
        }
        c21622319jh.LIZ(i5 - i4, iArr);
        C21622019je c21622019je2 = new C21622019je();
        c21622019je2.LIZIZ(0, i % i2);
        for (int i10 = 0; i10 < i5; i10++) {
            c21622019je2.LIZIZ(iArr[i10], i2);
        }
        return c21622019je2;
    }
}
