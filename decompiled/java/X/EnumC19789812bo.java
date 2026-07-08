package X;

/* JADX INFO: renamed from: X.12bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19789812bo {
    DEBUG,
    ERROR,
    INFO,
    VERBOSE,
    WARN;

    public static EnumC19789812bo zza(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        return INFO;
                    }
                    return ERROR;
                }
                return WARN;
            }
            return DEBUG;
        }
        return VERBOSE;
    }
}
