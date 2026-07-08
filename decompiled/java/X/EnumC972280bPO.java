package X;

/* JADX INFO: renamed from: X.0bPO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972280bPO {
    Grid,
    Floating;

    public static final C972310bPR Companion = new Object() { // from class: X.0bPR
    };

    public static EnumC972280bPO valueOf(String str) {
        return (EnumC972280bPO) C08FF.LIZ(EnumC972280bPO.class, str);
    }

    public final EnumC2232101CXw into() {
        int i = C972270bPN.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2232101CXw.VAR_LINK_MIC_BIZ_USER_SETTING_LAYOUT_GRID;
        }
        if (i == 2) {
            return EnumC2232101CXw.VAR_LINK_MIC_BIZ_USER_SETTING_LAYOUT_FLOATING;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C972270bPN.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
