package X;

/* JADX INFO: renamed from: X.14QL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QL {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14QL fromInt(int i) {
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

    C14QL(int i) {
        this.LL = i;
    }
}
