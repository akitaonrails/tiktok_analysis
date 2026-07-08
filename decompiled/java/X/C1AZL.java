package X;

/* JADX INFO: renamed from: X.1AZL, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public enum C1AZL {
    Unknown,
    Pk,
    BigParty,
    AudioChat,
    GameLink;

    public static final C1AZM Companion = new Object() { // from class: X.1AZM
    };

    public static C1AZL valueOf(String str) {
        return (C1AZL) C08FF.LIZ(C1AZL.class, str);
    }

    public final EnumC2182371Ab5 into() {
        int i = C1AZK.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2182371Ab5.VAR_LINK_MIC_STREAM_VENDOR_VERSION_UNKNOWN;
        }
        if (i == 2) {
            return EnumC2182371Ab5.VAR_LINK_MIC_STREAM_VENDOR_VERSION_PK;
        }
        if (i == 3) {
            return EnumC2182371Ab5.VAR_LINK_MIC_STREAM_VENDOR_VERSION_BIG_PARTY;
        }
        if (i == 4) {
            return EnumC2182371Ab5.VAR_LINK_MIC_STREAM_VENDOR_VERSION_AUDIO_CHAT;
        }
        if (i == 5) {
            return EnumC2182371Ab5.VAR_LINK_MIC_STREAM_VENDOR_VERSION_GAME_LINK;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1AZK.LIZ[ordinal()];
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
