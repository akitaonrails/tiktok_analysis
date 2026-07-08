package X;

/* JADX INFO: renamed from: X.11UP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UP {
    public static final C11UN LIZ(int i, int i2) {
        if (i == 0) {
            if (i2 == 1) {
                return C11UN.ONLY;
            }
            return C11UN.FIRST;
        }
        if (i == i2 - 1) {
            return C11UN.LAST;
        }
        return C11UN.MIDDLE;
    }

    public static final void LIZIZ(C127K c127k, C11UN c11un) {
        int i = C11UO.LIZ[c11un.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        c127k.LJ(true, true);
                        return;
                    }
                    throw new C1954807lC();
                }
                c127k.LJ(false, false);
                return;
            }
            c127k.LJ(false, true);
            return;
        }
        c127k.LJ(true, false);
    }
}
