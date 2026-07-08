package X;

/* JADX INFO: renamed from: X.1CKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2228601CKk {
    PlayModeNormal,
    PlayModePk,
    PlayModeFm,
    PlayModeBigParty,
    PlayModeMultiLinker;

    public static final C2228631CKn Companion = new Object() { // from class: X.1CKn
    };

    public static EnumC2228601CKk valueOf(String str) {
        return (EnumC2228601CKk) C08FF.LIZ(EnumC2228601CKk.class, str);
    }

    public final EnumC2228611CKl into() {
        int i = C2228591CKj.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2228611CKl.VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_NORMAL;
        }
        if (i == 2) {
            return EnumC2228611CKl.VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_PK;
        }
        if (i == 3) {
            return EnumC2228611CKl.VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_FM;
        }
        if (i == 4) {
            return EnumC2228611CKl.VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_BIG_PARTY;
        }
        if (i == 5) {
            return EnumC2228611CKl.VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_MULTI_LINKER;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2228591CKj.LIZ[ordinal()];
        int i2 = 1;
        if (i == 1) {
            return 0;
        }
        int i3 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i3 = 4;
                if (i != 4) {
                    if (i != 5) {
                        throw new C1954807lC();
                    }
                }
            }
            return i3;
        }
        return i2;
    }
}
