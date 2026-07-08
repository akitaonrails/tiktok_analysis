package X;

/* JADX INFO: renamed from: X.1AaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2181801AaA {
    InRoom,
    Feed,
    Search,
    PadPortrait,
    PadLandscape;

    public static final C2182191Aan Companion = new Object() { // from class: X.1Aan
    };

    public static EnumC2181801AaA valueOf(String str) {
        return (EnumC2181801AaA) C08FF.LIZ(EnumC2181801AaA.class, str);
    }

    public final EnumC2182351Ab3 into() {
        int i = C2181791Aa9.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2182351Ab3.VAR_LINK_MIC_LAYOUT_SCENE_IN_ROOM;
        }
        if (i == 2) {
            return EnumC2182351Ab3.VAR_LINK_MIC_LAYOUT_SCENE_FEED;
        }
        if (i == 3) {
            return EnumC2182351Ab3.VAR_LINK_MIC_LAYOUT_SCENE_SEARCH;
        }
        if (i == 4) {
            return EnumC2182351Ab3.VAR_LINK_MIC_LAYOUT_SCENE_PAD_PORTRAIT;
        }
        if (i == 5) {
            return EnumC2182351Ab3.VAR_LINK_MIC_LAYOUT_SCENE_PAD_LANDSCAPE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2181791Aa9.LIZ[ordinal()];
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
