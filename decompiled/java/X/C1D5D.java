package X;

/* JADX INFO: renamed from: X.1D5D, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D5D {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZ(String str) {
        if (str == null) {
            return "df";
        }
        switch (str.hashCode()) {
            case -1146830912:
                if (!str.equals("business")) {
                    return "x";
                }
                return "bs";
            case -1081415738:
                if (!str.equals("manual")) {
                    return "x";
                }
                return "ml";
            case 106940336:
                if (!str.equals("probe")) {
                    return "x";
                }
                return "pb";
            case 1544803905:
                if (str.equals("default")) {
                    return "df";
                }
                return "x";
            case 2007610451:
                if (!str.equals("gearshift")) {
                    return "x";
                }
                return "gs";
            default:
                return "x";
        }
    }
}
