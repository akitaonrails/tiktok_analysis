package X;

/* JADX INFO: renamed from: X.14Q9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14Q9 {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14Q9 fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return WRAP_REVERSE;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown enum value: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return WRAP;
        }
        return NO_WRAP;
    }

    C14Q9(int i) {
        this.LL = i;
    }
}
