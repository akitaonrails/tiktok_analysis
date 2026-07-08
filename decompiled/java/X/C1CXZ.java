package X;

/* JADX INFO: renamed from: X.1CXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXZ {
    Bool,
    Integer,
    Long,
    Float,
    String;

    public static final C2232351CYv Companion = new Object() { // from class: X.1CYv
    };

    public static C1CXZ valueOf(String str) {
        return (C1CXZ) C08FF.LIZ(C1CXZ.class, str);
    }

    public final C1CXY into() {
        int i = C1CY1.LIZ[ordinal()];
        if (i == 1) {
            return C1CXY.VAR_LIVE_SETTING_TYPE_BOOL;
        }
        if (i == 2) {
            return C1CXY.VAR_LIVE_SETTING_TYPE_INTEGER;
        }
        if (i == 3) {
            return C1CXY.VAR_LIVE_SETTING_TYPE_LONG;
        }
        if (i == 4) {
            return C1CXY.VAR_LIVE_SETTING_TYPE_FLOAT;
        }
        if (i == 5) {
            return C1CXY.VAR_LIVE_SETTING_TYPE_STRING;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CY1.LIZ[ordinal()];
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
