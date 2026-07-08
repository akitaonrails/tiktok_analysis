package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429014wi {
    public static final EnumC20429014wi BACKGROUND_EFFECT;
    public static final /* synthetic */ EnumC20429014wi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429014wi MUSIC;
    public static final EnumC20429014wi PROPS;
    public static final EnumC20429014wi SHARED_BACKGROUND_EFFECT;
    public static final EnumC20429014wi STICKER_EFFECT;
    public static final EnumC20429014wi VOICE_EFFECT;

    public static InterfaceC2044707zh<EnumC20429014wi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429014wi enumC20429014wi = new EnumC20429014wi("SHARED_BACKGROUND_EFFECT", 0);
        SHARED_BACKGROUND_EFFECT = enumC20429014wi;
        EnumC20429014wi enumC20429014wi2 = new EnumC20429014wi("BACKGROUND_EFFECT", 1);
        BACKGROUND_EFFECT = enumC20429014wi2;
        EnumC20429014wi enumC20429014wi3 = new EnumC20429014wi("MUSIC", 2);
        MUSIC = enumC20429014wi3;
        EnumC20429014wi enumC20429014wi4 = new EnumC20429014wi("VOICE_EFFECT", 3);
        VOICE_EFFECT = enumC20429014wi4;
        EnumC20429014wi enumC20429014wi5 = new EnumC20429014wi("PROPS", 4);
        PROPS = enumC20429014wi5;
        EnumC20429014wi enumC20429014wi6 = new EnumC20429014wi("STICKER_EFFECT", 5);
        STICKER_EFFECT = enumC20429014wi6;
        EnumC20429014wi[] enumC20429014wiArr = {enumC20429014wi, enumC20429014wi2, enumC20429014wi3, enumC20429014wi4, enumC20429014wi5, enumC20429014wi6};
        LL = enumC20429014wiArr;
        LLILLJJLI = new C2254308sP(enumC20429014wiArr);
    }

    public static EnumC20429014wi[] values() {
        return (EnumC20429014wi[]) LL.clone();
    }

    public static EnumC20429014wi valueOf(String str) {
        return (EnumC20429014wi) C08FF.LIZ(EnumC20429014wi.class, str);
    }

    public EnumC20429014wi(String str, int i) {
    }
}
