package X;

/* JADX INFO: renamed from: X.14QF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QF {
    FLEX(0),
    NONE(1);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14QF fromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return NONE;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown enum value: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return FLEX;
    }

    C14QF(int i) {
        this.LL = i;
    }
}
