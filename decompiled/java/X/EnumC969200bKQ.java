package X;

/* JADX INFO: renamed from: X.0bKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC969200bKQ {
    Close,
    Idle,
    Wait,
    Connecting,
    Linked;

    public static final C969210bKR Companion = new Object() { // from class: X.0bKR
    };

    public static EnumC969200bKQ valueOf(String str) {
        return (EnumC969200bKQ) C08FF.LIZ(EnumC969200bKQ.class, str);
    }

    public final C1CXS into() {
        int i = C968790bJl.LIZ[ordinal()];
        if (i == 1) {
            return C1CXS.VAR_LINK_STATE_CLOSE;
        }
        if (i == 2) {
            return C1CXS.VAR_LINK_STATE_IDLE;
        }
        if (i == 3) {
            return C1CXS.VAR_LINK_STATE_WAIT;
        }
        if (i == 4) {
            return C1CXS.VAR_LINK_STATE_CONNECTING;
        }
        if (i == 5) {
            return C1CXS.VAR_LINK_STATE_LINKED;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C968790bJl.LIZ[ordinal()];
        int i2 = 1;
        if (i == 1) {
            return 0;
        }
        int i3 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i3 = 4;
                if (i != 4) {
                    if (i != 5) {
                        throw new C1954807lC();
                    }
                }
            }
            return i3;
        }
        return i2;
    }
}
