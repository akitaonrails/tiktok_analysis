package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ake, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC947020ake {
    public static final EnumC947020ake GAME_BG_LOTTIE;
    public static final EnumC947020ake GAME_MATERIAL;
    public static final EnumC947020ake LAYOUT_RESOURCE;
    public static final /* synthetic */ EnumC947020ake[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC947020ake SCORE_EFFECT;

    public static InterfaceC2044707zh<EnumC947020ake> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC947020ake enumC947020ake = new EnumC947020ake("SCORE_EFFECT", 0);
        SCORE_EFFECT = enumC947020ake;
        EnumC947020ake enumC947020ake2 = new EnumC947020ake("GAME_MATERIAL", 1);
        GAME_MATERIAL = enumC947020ake2;
        EnumC947020ake enumC947020ake3 = new EnumC947020ake("GAME_BG_LOTTIE", 2);
        GAME_BG_LOTTIE = enumC947020ake3;
        EnumC947020ake enumC947020ake4 = new EnumC947020ake("LAYOUT_RESOURCE", 3);
        LAYOUT_RESOURCE = enumC947020ake4;
        EnumC947020ake[] enumC947020akeArr = {enumC947020ake, enumC947020ake2, enumC947020ake3, enumC947020ake4};
        LL = enumC947020akeArr;
        LLILLJJLI = new C2254308sP(enumC947020akeArr);
    }

    public static EnumC947020ake[] values() {
        return (EnumC947020ake[]) LL.clone();
    }

    public static EnumC947020ake valueOf(String str) {
        return (EnumC947020ake) C08FF.LIZ(EnumC947020ake.class, str);
    }

    public EnumC947020ake(String str, int i) {
    }
}
