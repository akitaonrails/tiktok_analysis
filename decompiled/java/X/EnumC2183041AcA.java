package X;

/* JADX INFO: renamed from: X.1AcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2183041AcA {
    Verbose,
    Info,
    Debug,
    Warn,
    Error;

    public static final C2183051AcB Companion = new Object() { // from class: X.1AcB
    };

    public static EnumC2183041AcA valueOf(String str) {
        return (EnumC2183041AcA) C08FF.LIZ(EnumC2183041AcA.class, str);
    }

    public final EnumC2183061AcC into() {
        int i = C2183031Ac9.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2183061AcC.VAR_LINK_MIC_LOG_LEVEL_VERBOSE;
        }
        if (i == 2) {
            return EnumC2183061AcC.VAR_LINK_MIC_LOG_LEVEL_INFO;
        }
        if (i == 3) {
            return EnumC2183061AcC.VAR_LINK_MIC_LOG_LEVEL_DEBUG;
        }
        if (i == 4) {
            return EnumC2183061AcC.VAR_LINK_MIC_LOG_LEVEL_WARN;
        }
        if (i == 5) {
            return EnumC2183061AcC.VAR_LINK_MIC_LOG_LEVEL_ERROR;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2183031Ac9.LIZ[ordinal()];
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
