package X;

/* JADX INFO: renamed from: X.14wt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public enum EnumC20430114wt {
    Verbose,
    Info,
    Debug,
    Warn,
    Error;

    public static final C20430214wu Companion = new Object() { // from class: X.14wu
    };

    public static EnumC20430114wt valueOf(String str) {
        return (EnumC20430114wt) C08FF.LIZ(EnumC20430114wt.class, str);
    }

    public final C1CXX into() {
        int i = C20427414wS.LIZ[ordinal()];
        if (i == 1) {
            return C1CXX.VAR_LIVE_LOG_LEVEL_VERBOSE;
        }
        if (i == 2) {
            return C1CXX.VAR_LIVE_LOG_LEVEL_INFO;
        }
        if (i == 3) {
            return C1CXX.VAR_LIVE_LOG_LEVEL_DEBUG;
        }
        if (i == 4) {
            return C1CXX.VAR_LIVE_LOG_LEVEL_WARN;
        }
        if (i == 5) {
            return C1CXX.VAR_LIVE_LOG_LEVEL_ERROR;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C20427414wS.LIZ[ordinal()];
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
