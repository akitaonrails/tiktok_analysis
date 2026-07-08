package X;

/* JADX INFO: renamed from: X.14QH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QH {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14QH fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return SPACE_EVENLY;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unknown enum value: ");
                            sbLIZ.append(i);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return SPACE_AROUND;
                    }
                    return SPACE_BETWEEN;
                }
                return FLEX_END;
            }
            return CENTER;
        }
        return FLEX_START;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C14QH fromString(String str) {
        str.getClass();
        switch (str.hashCode()) {
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
            case -814425728:
                if (str.equals("space_evenly")) {
                    return SPACE_EVENLY;
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

    public static C14QH valueOf(String str) {
        return (C14QH) C08FF.LIZ(C14QH.class, str);
    }

    C14QH(int i) {
        this.LL = i;
    }
}
