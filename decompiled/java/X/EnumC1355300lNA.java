package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lNA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1355300lNA {
    public static final EnumC1355300lNA CAMERA;
    public static final EnumC1355300lNA COMMENT_VOICE;
    public static final EnumC1355300lNA DM_CAMERA;
    public static final EnumC1355300lNA GAME;
    public static final EnumC1355300lNA GO_LIVE;
    public static final /* synthetic */ EnumC1355300lNA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1355300lNA TAKO_AIVIDEO;
    public static final EnumC1355300lNA TAKO_VOICE_MESSAGE;
    public static final EnumC1355300lNA VOICE_CALL;
    public static final EnumC1355300lNA VOICE_MESSAGE;
    public static final EnumC1355300lNA WATCH_LIVE;

    public static InterfaceC2044707zh<EnumC1355300lNA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1355300lNA enumC1355300lNA = new EnumC1355300lNA("VOICE_CALL", 0);
        VOICE_CALL = enumC1355300lNA;
        EnumC1355300lNA enumC1355300lNA2 = new EnumC1355300lNA("GO_LIVE", 1);
        GO_LIVE = enumC1355300lNA2;
        EnumC1355300lNA enumC1355300lNA3 = new EnumC1355300lNA("WATCH_LIVE", 2);
        WATCH_LIVE = enumC1355300lNA3;
        EnumC1355300lNA enumC1355300lNA4 = new EnumC1355300lNA("CAMERA", 3);
        CAMERA = enumC1355300lNA4;
        EnumC1355300lNA enumC1355300lNA5 = new EnumC1355300lNA("GAME", 4);
        GAME = enumC1355300lNA5;
        EnumC1355300lNA enumC1355300lNA6 = new EnumC1355300lNA("DM_CAMERA", 5);
        DM_CAMERA = enumC1355300lNA6;
        EnumC1355300lNA enumC1355300lNA7 = new EnumC1355300lNA("VOICE_MESSAGE", 6);
        VOICE_MESSAGE = enumC1355300lNA7;
        EnumC1355300lNA enumC1355300lNA8 = new EnumC1355300lNA("COMMENT_VOICE", 7);
        COMMENT_VOICE = enumC1355300lNA8;
        EnumC1355300lNA enumC1355300lNA9 = new EnumC1355300lNA("TAKO_VOICE_MESSAGE", 8);
        TAKO_VOICE_MESSAGE = enumC1355300lNA9;
        EnumC1355300lNA enumC1355300lNA10 = new EnumC1355300lNA("TAKO_AIVIDEO", 9);
        TAKO_AIVIDEO = enumC1355300lNA10;
        EnumC1355300lNA[] enumC1355300lNAArr = {enumC1355300lNA, enumC1355300lNA2, enumC1355300lNA3, enumC1355300lNA4, enumC1355300lNA5, enumC1355300lNA6, enumC1355300lNA7, enumC1355300lNA8, enumC1355300lNA9, enumC1355300lNA10};
        LL = enumC1355300lNAArr;
        LLILLJJLI = new C2254308sP(enumC1355300lNAArr);
    }

    public static EnumC1355300lNA[] values() {
        return (EnumC1355300lNA[]) LL.clone();
    }

    public static EnumC1355300lNA valueOf(String str) {
        return (EnumC1355300lNA) C08FF.LIZ(EnumC1355300lNA.class, str);
    }

    public EnumC1355300lNA(String str, int i) {
    }
}
