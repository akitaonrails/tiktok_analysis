package X;

/* JADX INFO: renamed from: X.1CXK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXK {
    Undefined,
    Normal,
    Disconnect;

    public static final C2232301CYq Companion = new Object() { // from class: X.1CYq
    };

    public static C1CXK valueOf(String str) {
        return (C1CXK) C08FF.LIZ(C1CXK.class, str);
    }

    public final C1CWY into() {
        int i = C1CY6.LIZ[ordinal()];
        if (i == 1) {
            return C1CWY.VAR_LINK_MIC_RTC_CONNECTION_STATE_UNDEFINED;
        }
        if (i == 2) {
            return C1CWY.VAR_LINK_MIC_RTC_CONNECTION_STATE_NORMAL;
        }
        if (i == 3) {
            return C1CWY.VAR_LINK_MIC_RTC_CONNECTION_STATE_DISCONNECT;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CY6.LIZ[ordinal()];
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
