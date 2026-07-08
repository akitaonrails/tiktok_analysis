package X;

/* JADX INFO: renamed from: X.1CUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231171CUh {
    Invite,
    Reply,
    Permit;

    public static final C2231181CUi Companion = new Object() { // from class: X.1CUi
    };

    public static EnumC2231171CUh valueOf(String str) {
        return (EnumC2231171CUh) C08FF.LIZ(EnumC2231171CUh.class, str);
    }

    public final EnumC2231221CUm into() {
        int i = C2231161CUg.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231221CUm.VAR_LINK_MIC_COMPENSATE_IM_TYPE_INVITE;
        }
        if (i == 2) {
            return EnumC2231221CUm.VAR_LINK_MIC_COMPENSATE_IM_TYPE_REPLY;
        }
        if (i == 3) {
            return EnumC2231221CUm.VAR_LINK_MIC_COMPENSATE_IM_TYPE_PERMIT;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2231161CUg.LIZ[ordinal()];
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
