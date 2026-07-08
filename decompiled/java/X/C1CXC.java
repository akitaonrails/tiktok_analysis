package X;

/* JADX INFO: renamed from: X.1CXC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXC {
    Idle,
    Request,
    Wait,
    Connecting,
    Linked;

    public static final C2232361CYw Companion = new Object() { // from class: X.1CYw
    };

    public static C1CXC valueOf(String str) {
        return (C1CXC) C08FF.LIZ(C1CXC.class, str);
    }

    public final C1CXW into() {
        int i = C1CY2.LIZ[ordinal()];
        if (i == 1) {
            return C1CXW.VAR_USER_LINK_STATE_IDLE;
        }
        if (i == 2) {
            return C1CXW.VAR_USER_LINK_STATE_REQUEST;
        }
        if (i == 3) {
            return C1CXW.VAR_USER_LINK_STATE_WAIT;
        }
        if (i == 4) {
            return C1CXW.VAR_USER_LINK_STATE_CONNECTING;
        }
        if (i == 5) {
            return C1CXW.VAR_USER_LINK_STATE_LINKED;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CY2.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new C1954807lC();
    }
}
