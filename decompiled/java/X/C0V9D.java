package X;

/* JADX INFO: renamed from: X.0V9D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0V9D {
    UNKNOWN,
    TOP_APP,
    FOREGROUND,
    BACKGROUND;

    public static C0V9D valueOf(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return UNKNOWN;
                    }
                    return BACKGROUND;
                }
                return FOREGROUND;
            }
            return TOP_APP;
        }
        return UNKNOWN;
    }

    public static C0V9D valueOf(String str) {
        return (C0V9D) C08FF.LIZ(C0V9D.class, str);
    }
}
