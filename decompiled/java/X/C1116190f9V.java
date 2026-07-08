package X;

/* JADX INFO: renamed from: X.0f9V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116190f9V {
    public static final String LIZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "paying_user" : "admin" : "anchor" : "audience";
    }

    public static final String LIZIZ(EnumC1116160f9S enumC1116160f9S) {
        int i = C1116170f9T.LIZ[enumC1116160f9S.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "unknown";
                    }
                    throw new C1954807lC();
                }
                return "blank";
            }
            return "self_waiting";
        }
        return "displaying";
    }

    public static final String LIZJ(EnumC1116180f9U enumC1116180f9U) {
        int i;
        if (enumC1116180f9U != null && (i = C1116170f9T.LIZIZ[enumC1116180f9U.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "deleted";
                    }
                    throw new C1954807lC();
                }
                return "waiting_time";
            }
            return "manage_info";
        }
        return "hide";
    }
}
