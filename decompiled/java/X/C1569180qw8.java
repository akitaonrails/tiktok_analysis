package X;

/* JADX INFO: renamed from: X.0qw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569180qw8 {
    public static final boolean LIZ(int i) {
        int iLIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return C1209404oG.LIZ();
                }
                int iLIZIZ2 = C1209404oG.LIZIZ();
                if (iLIZIZ2 == 0) {
                    return false;
                }
                if (iLIZIZ2 != 1) {
                    if (iLIZIZ2 == 2 || iLIZIZ2 != 3) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            if (C1209404oG.LIZIZ() == 0) {
                return false;
            }
            return true;
        }
        if (C319860CgK.LIZ() || (iLIZIZ = C1209404oG.LIZIZ()) == 0) {
            return false;
        }
        if (iLIZIZ != 1 && iLIZIZ != 2) {
            return false;
        }
        return true;
    }

    public static final AbstractC1569120qw2 LIZIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return C1569160qw6.LIZIZ;
                }
                return C1569140qw4.LIZIZ;
            }
            return C1569130qw3.LIZIZ;
        }
        return C1569150qw5.LIZIZ;
    }
}
