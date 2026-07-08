package X;

/* JADX INFO: renamed from: X.1CWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CWQ {
    InitState,
    PreparingState,
    LinkedState;

    public static final C1CWS Companion = new Object() { // from class: X.1CWS
    };

    public static C1CWQ valueOf(String str) {
        return (C1CWQ) C08FF.LIZ(C1CWQ.class, str);
    }

    public final C1CWO into() {
        int i = C1CWR.LIZ[ordinal()];
        if (i == 1) {
            return C1CWO.VAR_LAYOUT_RENDER_WINDOW_STATE_INIT_STATE;
        }
        if (i == 2) {
            return C1CWO.VAR_LAYOUT_RENDER_WINDOW_STATE_PREPARING_STATE;
        }
        if (i == 3) {
            return C1CWO.VAR_LAYOUT_RENDER_WINDOW_STATE_LINKED_STATE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CWR.LIZ[ordinal()];
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
