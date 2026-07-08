package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19597511lt {
    public static final EnumC19597511lt CAPTION_MODE;
    public static final /* synthetic */ EnumC19597511lt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19597511lt POST_BACKWARDS_MENTION;
    public static final EnumC19597511lt STICKER;
    public static final EnumC19597511lt STORY_ANNIVERSARY_MENTION;
    public static final EnumC19597511lt STORY_BACKWARDS_MENTION;
    public static final EnumC19597511lt STORY_STREAK_PET_MENTION;
    public static final EnumC19597511lt TEXT_MODE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19597511lt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19597511lt enumC19597511lt = new EnumC19597511lt("STICKER", 0, 0);
        STICKER = enumC19597511lt;
        EnumC19597511lt enumC19597511lt2 = new EnumC19597511lt("CAPTION_MODE", 1, 1);
        CAPTION_MODE = enumC19597511lt2;
        EnumC19597511lt enumC19597511lt3 = new EnumC19597511lt("STORY_BACKWARDS_MENTION", 2, 2);
        STORY_BACKWARDS_MENTION = enumC19597511lt3;
        EnumC19597511lt enumC19597511lt4 = new EnumC19597511lt("TEXT_MODE", 3, 3);
        TEXT_MODE = enumC19597511lt4;
        EnumC19597511lt enumC19597511lt5 = new EnumC19597511lt("POST_BACKWARDS_MENTION", 4, 4);
        POST_BACKWARDS_MENTION = enumC19597511lt5;
        EnumC19597511lt enumC19597511lt6 = new EnumC19597511lt("STORY_ANNIVERSARY_MENTION", 5, 5);
        STORY_ANNIVERSARY_MENTION = enumC19597511lt6;
        EnumC19597511lt enumC19597511lt7 = new EnumC19597511lt("STORY_STREAK_PET_MENTION", 6, 6);
        STORY_STREAK_PET_MENTION = enumC19597511lt7;
        EnumC19597511lt[] enumC19597511ltArr = {enumC19597511lt, enumC19597511lt2, enumC19597511lt3, enumC19597511lt4, enumC19597511lt5, enumC19597511lt6, enumC19597511lt7};
        LLILLJJLI = enumC19597511ltArr;
        LLILLL = new C2254308sP(enumC19597511ltArr);
    }

    public static EnumC19597511lt[] values() {
        return (EnumC19597511lt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19597511lt valueOf(String str) {
        return (EnumC19597511lt) C08FF.LIZ(EnumC19597511lt.class, str);
    }

    public EnumC19597511lt(String str, int i, int i2) {
        this.LL = i2;
    }
}
