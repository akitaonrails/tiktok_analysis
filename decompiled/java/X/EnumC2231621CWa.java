package X;

/* JADX INFO: renamed from: X.1CWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231621CWa {
    Unknown,
    Inner,
    Cross,
    Mixed;

    public static final C2231641CWc Companion = new Object() { // from class: X.1CWc
    };

    public static EnumC2231621CWa valueOf(String str) {
        return (EnumC2231621CWa) C08FF.LIZ(EnumC2231621CWa.class, str);
    }

    public final C1CW0 into() {
        int i = C2231631CWb.LIZ[ordinal()];
        if (i == 1) {
            return C1CW0.VAR_LINKER_MODE_UNKNOWN;
        }
        if (i == 2) {
            return C1CW0.VAR_LINKER_MODE_INNER;
        }
        if (i == 3) {
            return C1CW0.VAR_LINKER_MODE_CROSS;
        }
        if (i == 4) {
            return C1CW0.VAR_LINKER_MODE_MIXED;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2231631CWb.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }
}
