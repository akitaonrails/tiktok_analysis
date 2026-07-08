package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454380Hro {
    public static final /* synthetic */ EnumC454380Hro[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC454380Hro PRE_SHOWN_BANNER;
    public static final EnumC454380Hro REPOST_BANNER;
    public static final EnumC454380Hro STICKER_PANEL;
    public static final EnumC454380Hro STICKER_REACTION;
    public static final EnumC454380Hro STORY_REACTION;

    public static InterfaceC2044707zh<EnumC454380Hro> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC454380Hro enumC454380Hro = new EnumC454380Hro("STICKER_PANEL", 0);
        STICKER_PANEL = enumC454380Hro;
        EnumC454380Hro enumC454380Hro2 = new EnumC454380Hro("PRE_SHOWN_BANNER", 1);
        PRE_SHOWN_BANNER = enumC454380Hro2;
        EnumC454380Hro enumC454380Hro3 = new EnumC454380Hro("STICKER_REACTION", 2);
        STICKER_REACTION = enumC454380Hro3;
        EnumC454380Hro enumC454380Hro4 = new EnumC454380Hro("REPOST_BANNER", 3);
        REPOST_BANNER = enumC454380Hro4;
        EnumC454380Hro enumC454380Hro5 = new EnumC454380Hro("STORY_REACTION", 4);
        STORY_REACTION = enumC454380Hro5;
        EnumC454380Hro[] enumC454380HroArr = {enumC454380Hro, enumC454380Hro2, enumC454380Hro3, enumC454380Hro4, enumC454380Hro5};
        LL = enumC454380HroArr;
        LLILLJJLI = new C2254308sP(enumC454380HroArr);
    }

    public static EnumC454380Hro[] values() {
        return (EnumC454380Hro[]) LL.clone();
    }

    public static EnumC454380Hro valueOf(String str) {
        return (EnumC454380Hro) C08FF.LIZ(EnumC454380Hro.class, str);
    }

    public EnumC454380Hro(String str, int i) {
    }
}
