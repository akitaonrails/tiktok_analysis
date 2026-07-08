package X;

/* JADX INFO: renamed from: X.13BD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BD {
    public static final boolean LIZJ(long j) {
        return (j & 2) != 0;
    }

    public static final boolean LIZLLL(long j) {
        return (j & 1) != 0;
    }

    public static final float LIZIZ(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final int LIZ(long j, long j2) {
        boolean zLIZLLL = LIZLLL(j);
        if (zLIZLLL != LIZLLL(j2)) {
            if (zLIZLLL) {
                return -1;
            }
            return 1;
        }
        int iSignum = (int) Math.signum(LIZIZ(j) - LIZIZ(j2));
        if (Math.min(LIZIZ(j), LIZIZ(j2)) >= 0.0f && LIZJ(j) != LIZJ(j2)) {
            if (LIZJ(j)) {
                return -1;
            }
            return 1;
        }
        return iSignum;
    }
}
