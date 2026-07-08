package X;

/* JADX INFO: renamed from: X.0fpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142340fpg {
    public static int LJIIJJI(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int LJI(int i) {
        return C1142350fph.LIZ(i) + 1;
    }

    public static int LJIIIIZZ(int i) {
        return C1142350fph.LIZ(i) + 8;
    }

    public static int LJIILJJIL(String str) {
        long j;
        char cCharAt;
        if (str == null || str.length() == 0) {
            return 0;
        }
        long j2 = 0;
        int i = 0;
        while (i < str.length()) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                j2++;
            } else {
                if (cCharAt2 < 2048) {
                    j = 2;
                } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                    int i2 = i + 1;
                    if (i2 < str.length()) {
                        cCharAt = str.charAt(i2);
                    } else {
                        cCharAt = 0;
                    }
                    if (cCharAt2 <= 56319 && cCharAt >= 56320 && cCharAt <= 57343) {
                        j2 += 4;
                        i += 2;
                    } else {
                        j2++;
                        i = i2;
                    }
                } else {
                    j = 3;
                }
                j2 += j;
            }
            i++;
        }
        return (int) j2;
    }

    public static int LJII(int i, Boolean bool) {
        if (bool == null) {
            return 0;
        }
        bool.booleanValue();
        return 1 + C1142350fph.LIZ(i);
    }

    public static int LJIIIZ(int i, int i2) {
        int iLIZIZ;
        if (i2 >= 0) {
            iLIZIZ = C1142350fph.LIZIZ(i2);
        } else {
            iLIZIZ = 10;
        }
        return iLIZIZ + C1142350fph.LIZ(i);
    }

    public static int LJIIJ(int i, Integer num) {
        int iLIZIZ;
        if (num == null) {
            return 0;
        }
        int iIntValue = num.intValue();
        if (iIntValue >= 0) {
            iLIZIZ = C1142350fph.LIZIZ(iIntValue);
        } else {
            iLIZIZ = 10;
        }
        return iLIZIZ + C1142350fph.LIZ(i);
    }

    public static int LJIIL(int i, long j) {
        return LJIIJJI(j) + C1142350fph.LIZ(i);
    }

    public static int LJIILIIL(int i, Long l) {
        if (l == null) {
            return 0;
        }
        return LJIIJJI(l.longValue()) + C1142350fph.LIZ(i);
    }

    public static int LJIILL(int i, String str) {
        if (str != null && str.length() != 0) {
            int iLJIILJJIL = LJIILJJIL(str);
            return iLJIILJJIL + C1142350fph.LIZIZ(iLJIILJJIL) + C1142350fph.LIZ(i);
        }
        return 0;
    }

    public static void LIZ(C1142350fph c1142350fph, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 0);
        c1142350fph.LJ(bool.booleanValue() ? 1 : 0);
    }

    public static void LIZIZ(C1142350fph c1142350fph, int i, double d) {
        c1142350fph.LIZLLL(i, 1);
        c1142350fph.LIZ.LJLLLLLL(Double.doubleToLongBits(d));
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, float f) {
        c1142350fph.LIZLLL(i, 5);
        c1142350fph.LIZ.LL(Float.floatToIntBits(f));
    }

    public static void LIZLLL(C1142350fph c1142350fph, int i, Integer num) {
        if (num == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 0);
        c1142350fph.LIZJ(num.intValue());
    }

    public static void LJ(C1142350fph c1142350fph, int i, Long l) {
        if (l == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 0);
        c1142350fph.LJFF(l.longValue());
    }

    public static void LJFF(C1142350fph c1142350fph, int i, String str) {
        if (str != null && str.length() != 0) {
            c1142350fph.LIZLLL(i, 2);
            c1142350fph.LJ(LJIILJJIL(str));
            c1142350fph.LIZ.LJLLILLLL(str);
        }
    }
}
