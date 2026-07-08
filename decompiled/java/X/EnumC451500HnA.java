package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC451500HnA {
    public static final EnumC451500HnA AIMOJI;
    public static final EnumC451500HnA AISELF;
    public static final EnumC451500HnA EMOJI;
    public static final EnumC451500HnA FAVOURITES;
    public static final EnumC451500HnA GIF;
    public static final /* synthetic */ EnumC451500HnA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC451500HnA POPULAR;
    public static final EnumC451500HnA SEARCH;
    public static final EnumC451500HnA STICKER_SET;
    public static final EnumC451500HnA STORE;
    public static final EnumC451500HnA STREAK_STICKER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC451500HnA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC451500HnA enumC451500HnA = new EnumC451500HnA("STICKER_SET", 0, "sticker_set");
        STICKER_SET = enumC451500HnA;
        EnumC451500HnA enumC451500HnA2 = new EnumC451500HnA("FAVOURITES", 1, "favourites");
        FAVOURITES = enumC451500HnA2;
        EnumC451500HnA enumC451500HnA3 = new EnumC451500HnA("AIMOJI", 2, "aimoji");
        AIMOJI = enumC451500HnA3;
        EnumC451500HnA enumC451500HnA4 = new EnumC451500HnA("EMOJI", 3, "emoji");
        EMOJI = enumC451500HnA4;
        EnumC451500HnA enumC451500HnA5 = new EnumC451500HnA("SEARCH", 4, "search");
        SEARCH = enumC451500HnA5;
        EnumC451500HnA enumC451500HnA6 = new EnumC451500HnA("STORE", 5, "store");
        STORE = enumC451500HnA6;
        EnumC451500HnA enumC451500HnA7 = new EnumC451500HnA("GIF", 6, "gif");
        GIF = enumC451500HnA7;
        EnumC451500HnA enumC451500HnA8 = new EnumC451500HnA("AISELF", 7, "ai_self_sticker");
        AISELF = enumC451500HnA8;
        EnumC451500HnA enumC451500HnA9 = new EnumC451500HnA("STREAK_STICKER", 8, "streak_sticker");
        STREAK_STICKER = enumC451500HnA9;
        EnumC451500HnA enumC451500HnA10 = new EnumC451500HnA("POPULAR", 9, "popular_sticker");
        POPULAR = enumC451500HnA10;
        EnumC451500HnA[] enumC451500HnAArr = {enumC451500HnA, enumC451500HnA2, enumC451500HnA3, enumC451500HnA4, enumC451500HnA5, enumC451500HnA6, enumC451500HnA7, enumC451500HnA8, enumC451500HnA9, enumC451500HnA10};
        LLILLJJLI = enumC451500HnAArr;
        LLILLL = new C2254308sP(enumC451500HnAArr);
    }

    public static EnumC451500HnA[] values() {
        return (EnumC451500HnA[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC451500HnA valueOf(String str) {
        return (EnumC451500HnA) C08FF.LIZ(EnumC451500HnA.class, str);
    }

    public EnumC451500HnA(String str, int i, String str2) {
        this.LL = str2;
    }
}
