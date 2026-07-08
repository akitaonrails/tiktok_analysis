package X;

/* JADX INFO: renamed from: X.19JM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C19JM {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C19JM fromInt(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown enum value: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static C19JM valueOf(String str) {
        return (C19JM) C08FF.LIZ(C19JM.class, str);
    }

    C19JM(int i) {
        this.LL = i;
    }
}
