package X;

/* JADX INFO: renamed from: X.14QG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QG {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7),
    SPACE_EVENLY(8);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14QG fromInt(int i) {
        switch (i) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            case 8:
                return SPACE_EVENLY;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown enum value: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C14QG fromString(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return STRETCH;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    return BASELINE;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    return CENTER;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    return SPACE_AROUND;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    return AUTO;
                }
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    return FLEX_START;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    return SPACE_BETWEEN;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    return FLEX_END;
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown enum value: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C14QG valueOf(String str) {
        return (C14QG) C08FF.LIZ(C14QG.class, str);
    }

    C14QG(int i) {
        this.LL = i;
    }
}
