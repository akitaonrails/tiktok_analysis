package X;

/* JADX INFO: renamed from: X.1CUS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CUS {
    Checked,
    NotChecked,
    Hide,
    Open,
    Close;

    public static final C1CUU Companion = new Object() { // from class: X.1CUU
    };

    public static C1CUS valueOf(String str) {
        return (C1CUS) C08FF.LIZ(C1CUS.class, str);
    }

    public final C1CUQ into() {
        int i = C1CUT.LIZ[ordinal()];
        if (i == 1) {
            return C1CUQ.VAR_LINKMIC_USER_SETTING_SHOW_ACTION_CHECKED;
        }
        if (i == 2) {
            return C1CUQ.VAR_LINKMIC_USER_SETTING_SHOW_ACTION_NOT_CHECKED;
        }
        if (i == 3) {
            return C1CUQ.VAR_LINKMIC_USER_SETTING_SHOW_ACTION_HIDE;
        }
        if (i == 4) {
            return C1CUQ.VAR_LINKMIC_USER_SETTING_SHOW_ACTION_OPEN;
        }
        if (i == 5) {
            return C1CUQ.VAR_LINKMIC_USER_SETTING_SHOW_ACTION_CLOSE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CUT.LIZ[ordinal()];
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
