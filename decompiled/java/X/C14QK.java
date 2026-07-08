package X;

/* JADX INFO: renamed from: X.14QK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QK {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14QK fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return ROW_REVERSE;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown enum value: ");
                    sbLIZ.append(i);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return ROW;
            }
            return COLUMN_REVERSE;
        }
        return COLUMN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C14QK fromString(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    return COLUMN_REVERSE;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    return COLUMN;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    return ROW_REVERSE;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    return ROW;
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown enum value: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C14QK valueOf(String str) {
        return (C14QK) C08FF.LIZ(C14QK.class, str);
    }

    C14QK(int i) {
        this.LL = i;
    }
}
