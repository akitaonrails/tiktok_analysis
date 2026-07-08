package X;

/* JADX INFO: renamed from: X.1CUN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CUN {
    Grid,
    Floating;

    public static final C1CUP Companion = new Object() { // from class: X.1CUP
    };

    public static C1CUN valueOf(String str) {
        return (C1CUN) C08FF.LIZ(C1CUN.class, str);
    }

    public final C1CUL into() {
        int i = C1CUO.LIZ[ordinal()];
        if (i == 1) {
            return C1CUL.VAR_LINKMIC_USER_SETTING_LAYOUT_GRID;
        }
        if (i == 2) {
            return C1CUL.VAR_LINKMIC_USER_SETTING_LAYOUT_FLOATING;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CUO.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
