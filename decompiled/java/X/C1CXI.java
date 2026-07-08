package X;

/* JADX INFO: renamed from: X.1CXI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXI {
    Unknown,
    Guest,
    Host;

    public static final C2232291CYp Companion = new Object() { // from class: X.1CYp
    };

    public static C1CXI valueOf(String str) {
        return (C1CXI) C08FF.LIZ(C1CXI.class, str);
    }

    public final EnumC2232011CXn into() {
        int i = C1CY4.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2232011CXn.VAR_LINKER_USER_TYPE_UNKNOWN;
        }
        if (i == 2) {
            return EnumC2232011CXn.VAR_LINKER_USER_TYPE_GUEST;
        }
        if (i == 3) {
            return EnumC2232011CXn.VAR_LINKER_USER_TYPE_HOST;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CY4.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new C1954807lC();
    }
}
