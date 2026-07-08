package X;

/* JADX INFO: renamed from: X.1CXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXJ {
    Undefined,
    Normal,
    Paused;

    public static final C1CY7 Companion = new C1CY7();

    public static C1CXJ valueOf(String str) {
        return (C1CXJ) C08FF.LIZ(C1CXJ.class, str);
    }

    public final C1CWW into() {
        int i = C1CY5.LIZ[ordinal()];
        if (i == 1) {
            return C1CWW.VAR_LINK_MIC_ONLINE_USER_STATE_UNDEFINED;
        }
        if (i == 2) {
            return C1CWW.VAR_LINK_MIC_ONLINE_USER_STATE_NORMAL;
        }
        if (i == 3) {
            return C1CWW.VAR_LINK_MIC_ONLINE_USER_STATE_PAUSED;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CY5.LIZ[ordinal()];
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
