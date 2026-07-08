package X;

/* JADX INFO: renamed from: X.1DYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257631DYb {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final EnumC2257641DYc LIZ(String str) {
        switch (str.hashCode()) {
            case -1984141450:
                if (str.equals("vertical")) {
                    return EnumC2257641DYc.VERTICAL;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    return EnumC2257641DYc.BOTTOM;
                }
                break;
            case 96673:
                if (str.equals("all")) {
                    return EnumC2257641DYc.ALL;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return EnumC2257641DYc.END;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    return EnumC2257641DYc.TOP;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    return EnumC2257641DYc.LEFT;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    return EnumC2257641DYc.RIGHT;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return EnumC2257641DYc.START;
                }
                break;
            case 1387629604:
                if (str.equals("horizontal")) {
                    return EnumC2257641DYc.HORIZONTAL;
                }
                break;
        }
        return EnumC2257641DYc.ALL;
    }

    public static final EnumC2257621DYa LIZIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1354837162) {
            if (iHashCode != 96673) {
                if (iHashCode == 113114 && str.equals("row")) {
                    return EnumC2257621DYa.ROW;
                }
                return null;
            }
            if (str.equals("all")) {
                return EnumC2257621DYa.ALL;
            }
            return null;
        }
        if (str.equals("column")) {
            return EnumC2257621DYa.COLUMN;
        }
        return null;
    }
}
