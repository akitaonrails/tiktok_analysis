package X;

/* JADX INFO: renamed from: X.0Y83, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y83 {
    public static C0Y82 LIZ(C0YFV c0yfv) {
        int i = C0Y84.LIZ[c0yfv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return C0Y82.UNKNOWN;
                    }
                    return C0Y82.PRIORITY_CHAIN;
                }
                return C0Y82.STATUS_MSG_CHAIN;
            }
            return C0Y82.RECENT_CONV_CHAIN;
        }
        return C0Y82.USER_CHAIN;
    }
}
