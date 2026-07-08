package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1729006ps {
    public static final EnumC1729006ps CHAT_GAME_BANNER;
    public static final EnumC1729006ps CHAT_GAME_NOTICE;
    public static final EnumC1729006ps CLICK_PLAYGROUND_THUMBNAIL;
    public static final EnumC1729006ps GAME_BATTLE_RESULT_PAGE;
    public static final /* synthetic */ EnumC1729006ps[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1729006ps LONG_PRESS_CHAT_GAME_BANNER;
    public static final EnumC1729006ps LONG_PRESS_PLAYGROUND_THUMBNAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1729006ps> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1729006ps enumC1729006ps = new EnumC1729006ps("CLICK_PLAYGROUND_THUMBNAIL", 0, "click_playground_thumbnail");
        CLICK_PLAYGROUND_THUMBNAIL = enumC1729006ps;
        EnumC1729006ps enumC1729006ps2 = new EnumC1729006ps("LONG_PRESS_PLAYGROUND_THUMBNAIL", 1, "long_press_playground_thumbnail");
        LONG_PRESS_PLAYGROUND_THUMBNAIL = enumC1729006ps2;
        EnumC1729006ps enumC1729006ps3 = new EnumC1729006ps("GAME_BATTLE_RESULT_PAGE", 2, "game_battle_result_page");
        GAME_BATTLE_RESULT_PAGE = enumC1729006ps3;
        EnumC1729006ps enumC1729006ps4 = new EnumC1729006ps("CHAT_GAME_BANNER", 3, "chat_game_banner");
        CHAT_GAME_BANNER = enumC1729006ps4;
        EnumC1729006ps enumC1729006ps5 = new EnumC1729006ps("LONG_PRESS_CHAT_GAME_BANNER", 4, "long_press_chat_game_banner");
        LONG_PRESS_CHAT_GAME_BANNER = enumC1729006ps5;
        EnumC1729006ps enumC1729006ps6 = new EnumC1729006ps("CHAT_GAME_NOTICE", 5, "chat_game_notice");
        CHAT_GAME_NOTICE = enumC1729006ps6;
        EnumC1729006ps[] enumC1729006psArr = {enumC1729006ps, enumC1729006ps2, enumC1729006ps3, enumC1729006ps4, enumC1729006ps5, enumC1729006ps6};
        LLILLJJLI = enumC1729006psArr;
        LLILLL = new C2254308sP(enumC1729006psArr);
    }

    public static EnumC1729006ps[] values() {
        return (EnumC1729006ps[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1729006ps valueOf(String str) {
        return (EnumC1729006ps) C08FF.LIZ(EnumC1729006ps.class, str);
    }

    public EnumC1729006ps(String str, int i, String str2) {
        this.LL = str2;
    }
}
