package X;

/* JADX INFO: renamed from: X.0TYC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TYC {
    public static final int LIZ(C745220TLc c745220TLc) {
        long j = c745220TLc.LIZ;
        if (j == -1) {
            return 1;
        }
        if (j == 5) {
            return 2;
        }
        if (j == 30) {
            return 3;
        }
        if (j == 60) {
            return 4;
        }
        if (j == 300) {
            return 5;
        }
        return 0;
    }

    public static final String LIZIZ(C745220TLc c745220TLc) {
        long j = c745220TLc.LIZ;
        if (j == -1) {
            return C497740JfY.LJIJI(2131842784);
        }
        if (j < 60) {
            return C497740JfY.LJIIL(2131755582, (int) j, Integer.valueOf((int) j));
        }
        int i = (int) (j / ((long) 60));
        return C497740JfY.LJIIL(2131755581, i, Integer.valueOf(i));
    }

    public static final C745220TLc LIZJ(Integer num) {
        C745220TLc c745220TLcLIZ = C751460Tdo.LIZ();
        if (num != null && num.intValue() != 0) {
            if (num.intValue() == 1) {
                return C745220TLc.LIZIZ;
            }
            if (num.intValue() == 2) {
                return new C745220TLc(5L);
            }
            if (num.intValue() == 3) {
                return new C745220TLc(30L);
            }
            if (num.intValue() == 4) {
                return new C745220TLc(60L);
            }
            if (num.intValue() != 5) {
                return c745220TLcLIZ;
            }
            return new C745220TLc(300L);
        }
        return c745220TLcLIZ;
    }
}
