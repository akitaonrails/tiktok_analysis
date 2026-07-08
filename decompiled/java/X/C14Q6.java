package X;

/* JADX INFO: renamed from: X.14Q6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14Q6 {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14Q6 fromInt(int i) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C14Q6 fromString(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1039592053:
                if (str.equals("nowrap")) {
                    return NO_WRAP;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    return WRAP;
                }
                break;
            case 491642861:
                if (str.equals("wrap_reverse")) {
                    return WRAP_REVERSE;
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown enum value: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C14Q6 valueOf(String str) {
        return (C14Q6) C08FF.LIZ(C14Q6.class, str);
    }

    C14Q6(int i) {
        this.LL = i;
    }
}
