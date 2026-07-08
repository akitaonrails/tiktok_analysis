package X;

/* JADX INFO: renamed from: X.14QI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QI {
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

    public static C14QI fromInt(int i) {
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

    C14QI(int i) {
        this.LL = i;
    }
}
