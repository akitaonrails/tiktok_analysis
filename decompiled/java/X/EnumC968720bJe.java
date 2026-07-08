package X;

/* JADX INFO: renamed from: X.0bJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC968720bJe {
    None,
    PrivateMsg,
    Deeplink,
    Lineup;

    public static final C968780bJk Companion = new Object() { // from class: X.0bJk
    };

    public static EnumC968720bJe valueOf(String str) {
        return (EnumC968720bJe) C08FF.LIZ(EnumC968720bJe.class, str);
    }

    public final EnumC2231921CXe into() {
        int i = C968710bJd.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231921CXe.VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_NONE;
        }
        if (i == 2) {
            return EnumC2231921CXe.VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_PRIVATE_MSG;
        }
        if (i == 3) {
            return EnumC2231921CXe.VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_DEEPLINK;
        }
        if (i == 4) {
            return EnumC2231921CXe.VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_LINEUP;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C968710bJd.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }
}
