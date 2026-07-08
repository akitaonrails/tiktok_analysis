package X;

/* JADX INFO: renamed from: X.1Caf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2233071Caf {
    Union,
    CoHost,
    MultiGuest,
    GameLink;

    public static final C2233091Cah Companion = new Object() { // from class: X.1Cah
    };

    public static EnumC2233071Caf valueOf(String str) {
        return (EnumC2233071Caf) C08FF.LIZ(EnumC2233071Caf.class, str);
    }

    public final EnumC2231941CXg into() {
        int i = C2233081Cag.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231941CXg.VAR_LINK_MIC_SDK_SCENE_UNION;
        }
        if (i == 2) {
            return EnumC2231941CXg.VAR_LINK_MIC_SDK_SCENE_CO_HOST;
        }
        if (i == 3) {
            return EnumC2231941CXg.VAR_LINK_MIC_SDK_SCENE_MULTI_GUEST;
        }
        if (i == 4) {
            return EnumC2231941CXg.VAR_LINK_MIC_SDK_SCENE_GAME_LINK;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2233081Cag.LIZ[ordinal()];
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
