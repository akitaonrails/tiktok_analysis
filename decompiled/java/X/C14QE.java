package X;

/* JADX INFO: renamed from: X.14QE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QE {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14QE fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return ABSOLUTE;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown enum value: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return RELATIVE;
        }
        return STATIC;
    }

    C14QE(int i) {
        this.LL = i;
    }
}
