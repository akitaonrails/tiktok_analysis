package X;

/* JADX INFO: renamed from: X.14QD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QD {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static C14QD fromInt(int i) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C14QD fromString(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -892481938:
                if (str.equals("static")) {
                    return STATIC;
                }
                break;
            case -554435892:
                if (str.equals("relative")) {
                    return RELATIVE;
                }
                break;
            case 1728122231:
                if (str.equals("absolute")) {
                    return ABSOLUTE;
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown enum value: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C14QD valueOf(String str) {
        return (C14QD) C08FF.LIZ(C14QD.class, str);
    }

    C14QD(int i) {
        this.LL = i;
    }
}
