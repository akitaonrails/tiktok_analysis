package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC773040UUc {
    public static final EnumC773040UUc BACKGROUND;
    public static final EnumC773040UUc DRAW_GUESS;
    public static final EnumC773040UUc EFFECTS;
    public static final EnumC773040UUc ENHANCE;
    public static final EnumC773040UUc LIGHTING_QUESTION;
    public static final /* synthetic */ EnumC773040UUc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC773040UUc MUSIC;
    public static final EnumC773040UUc NONE;
    public static final EnumC773040UUc POLL_CUSTOMIZABLE;
    public static final EnumC773040UUc POLL_NORMAL;
    public static final EnumC773040UUc POLL_QUICK_GIFT;
    public static final EnumC773040UUc SOUND_EFFECTS;
    public static final EnumC773040UUc STICKER;
    public static final EnumC773040UUc VOICE_EFFECTS;

    public static InterfaceC2044707zh<EnumC773040UUc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC773040UUc enumC773040UUc = new EnumC773040UUc("NONE", 0);
        NONE = enumC773040UUc;
        EnumC773040UUc enumC773040UUc2 = new EnumC773040UUc("DRAW_GUESS", 1);
        DRAW_GUESS = enumC773040UUc2;
        EnumC773040UUc enumC773040UUc3 = new EnumC773040UUc("LIGHTING_QUESTION", 2);
        LIGHTING_QUESTION = enumC773040UUc3;
        EnumC773040UUc enumC773040UUc4 = new EnumC773040UUc("POLL_NORMAL", 3);
        POLL_NORMAL = enumC773040UUc4;
        EnumC773040UUc enumC773040UUc5 = new EnumC773040UUc("POLL_QUICK_GIFT", 4);
        POLL_QUICK_GIFT = enumC773040UUc5;
        EnumC773040UUc enumC773040UUc6 = new EnumC773040UUc("POLL_CUSTOMIZABLE", 5);
        POLL_CUSTOMIZABLE = enumC773040UUc6;
        EnumC773040UUc enumC773040UUc7 = new EnumC773040UUc("VOICE_EFFECTS", 6);
        VOICE_EFFECTS = enumC773040UUc7;
        EnumC773040UUc enumC773040UUc8 = new EnumC773040UUc("MUSIC", 7);
        MUSIC = enumC773040UUc8;
        EnumC773040UUc enumC773040UUc9 = new EnumC773040UUc("SOUND_EFFECTS", 8);
        SOUND_EFFECTS = enumC773040UUc9;
        EnumC773040UUc enumC773040UUc10 = new EnumC773040UUc("STICKER", 9);
        STICKER = enumC773040UUc10;
        EnumC773040UUc enumC773040UUc11 = new EnumC773040UUc("BACKGROUND", 10);
        BACKGROUND = enumC773040UUc11;
        EnumC773040UUc enumC773040UUc12 = new EnumC773040UUc("ENHANCE", 11);
        ENHANCE = enumC773040UUc12;
        EnumC773040UUc enumC773040UUc13 = new EnumC773040UUc("EFFECTS", 12);
        EFFECTS = enumC773040UUc13;
        EnumC773040UUc[] enumC773040UUcArr = {enumC773040UUc, enumC773040UUc2, enumC773040UUc3, enumC773040UUc4, enumC773040UUc5, enumC773040UUc6, enumC773040UUc7, enumC773040UUc8, enumC773040UUc9, enumC773040UUc10, enumC773040UUc11, enumC773040UUc12, enumC773040UUc13};
        LL = enumC773040UUcArr;
        LLILLJJLI = new C2254308sP(enumC773040UUcArr);
    }

    public static EnumC773040UUc[] values() {
        return (EnumC773040UUc[]) LL.clone();
    }

    public static EnumC773040UUc valueOf(String str) {
        return (EnumC773040UUc) C08FF.LIZ(EnumC773040UUc.class, str);
    }

    public EnumC773040UUc(String str, int i) {
    }
}
