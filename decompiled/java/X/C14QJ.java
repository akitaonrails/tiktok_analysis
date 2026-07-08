package X;

/* JADX INFO: renamed from: X.14QJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QJ {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14QJ fromInt(int i) {
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
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown enum value: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    C14QJ(int i) {
        this.LL = i;
    }
}
