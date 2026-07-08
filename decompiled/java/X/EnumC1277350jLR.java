package X;

/* JADX INFO: renamed from: X.0jLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277350jLR {
    None,
    CoHost,
    MultiGuest,
    GameLink;

    public static final C1277360jLS Companion = new Object() { // from class: X.0jLS
    };

    public static EnumC1277350jLR valueOf(String str) {
        return (EnumC1277350jLR) C08FF.LIZ(EnumC1277350jLR.class, str);
    }

    public final EnumC1282190jTF into() {
        int i = C1277310jLN.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1282190jTF.VAR_RTC_LINK_MIC_TYPE_NONE;
        }
        if (i == 2) {
            return EnumC1282190jTF.VAR_RTC_LINK_MIC_TYPE_CO_HOST;
        }
        if (i == 3) {
            return EnumC1282190jTF.VAR_RTC_LINK_MIC_TYPE_MULTI_GUEST;
        }
        if (i == 4) {
            return EnumC1282190jTF.VAR_RTC_LINK_MIC_TYPE_GAME_LINK;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1277310jLN.LIZ[ordinal()];
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
