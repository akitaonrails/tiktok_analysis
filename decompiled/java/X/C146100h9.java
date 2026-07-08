package X;

/* JADX INFO: renamed from: X.00h9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C146100h9 {
    public static String LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("UNRECOGNIZED(");
                                sbLIZ.append(i);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }
                            return "TIMED_PROP";
                        }
                        return "REJECTED";
                    }
                    return "FINISHED";
                }
                return "SETTLED";
            }
            return "STARTED";
        }
        return "UNKNOWN";
    }
}
