package X;

/* JADX INFO: renamed from: X.0WLU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WLU {
    INHERIT(0),
    LTR(1),
    RTL(2);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C0WLU fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return RTL;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown enum value: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return LTR;
        }
        return INHERIT;
    }

    public static C0WLU valueOf(String str) {
        return (C0WLU) C08FF.LIZ(C0WLU.class, str);
    }

    C0WLU(int i) {
        this.LL = i;
    }
}
