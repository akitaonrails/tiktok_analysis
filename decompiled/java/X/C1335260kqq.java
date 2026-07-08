package X;

/* JADX INFO: renamed from: X.0kqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335260kqq {
    public static final long LIZ(long j, EnumC1335420kr6 enumC1335420kr6, EnumC1335310kqv enumC1335310kqv) {
        int i = C1335270kqr.LIZLLL[enumC1335420kr6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return j;
                    }
                    throw new C1954807lC();
                }
                int i2 = C1335270kqr.LIZJ[enumC1335310kqv.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        return j;
                    }
                    return 20971520L;
                }
                return 10485760L;
            }
            int i3 = C1335270kqr.LIZIZ[enumC1335310kqv.ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    return j;
                }
                return 10485760L;
            }
            return 0L;
        }
        int i4 = C1335270kqr.LIZ[enumC1335310kqv.ordinal()];
        if (i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                return j;
            }
            return 10485760L;
        }
        return 1048576L;
    }
}
