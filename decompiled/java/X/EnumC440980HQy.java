package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440980HQy {
    public static final EnumC440980HQy BACK;
    public static final EnumC440980HQy FAVORITE;
    public static final EnumC440980HQy GENERATE_MORE;
    public static final /* synthetic */ EnumC440980HQy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440980HQy MAKE_ALIVE;
    public static final EnumC440980HQy OTHER_STICKER;
    public static final EnumC440980HQy POST_TO_STORY;
    public static final EnumC440980HQy SAVE;
    public static final EnumC440980HQy SEND;
    public static final EnumC440980HQy SHARE;
    public static final EnumC440980HQy STOP;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final EnumC440980HQy f119X;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440980HQy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440980HQy enumC440980HQy = new EnumC440980HQy("BACK", 0, "back");
        BACK = enumC440980HQy;
        EnumC440980HQy enumC440980HQy2 = new EnumC440980HQy("X", 1, "close");
        f119X = enumC440980HQy2;
        EnumC440980HQy enumC440980HQy3 = new EnumC440980HQy("GENERATE_MORE", 2, "generate_more");
        GENERATE_MORE = enumC440980HQy3;
        EnumC440980HQy enumC440980HQy4 = new EnumC440980HQy("SAVE", 3, "save");
        SAVE = enumC440980HQy4;
        EnumC440980HQy enumC440980HQy5 = new EnumC440980HQy("SEND", 4, "send");
        SEND = enumC440980HQy5;
        EnumC440980HQy enumC440980HQy6 = new EnumC440980HQy("FAVORITE", 5, "favorite");
        FAVORITE = enumC440980HQy6;
        EnumC440980HQy enumC440980HQy7 = new EnumC440980HQy("OTHER_STICKER", 6, "other_sticker");
        OTHER_STICKER = enumC440980HQy7;
        EnumC440980HQy enumC440980HQy8 = new EnumC440980HQy("SHARE", 7, "share");
        SHARE = enumC440980HQy8;
        EnumC440980HQy enumC440980HQy9 = new EnumC440980HQy("POST_TO_STORY", 8, "post_to_story");
        POST_TO_STORY = enumC440980HQy9;
        EnumC440980HQy enumC440980HQy10 = new EnumC440980HQy("STOP", 9, "stop");
        STOP = enumC440980HQy10;
        EnumC440980HQy enumC440980HQy11 = new EnumC440980HQy("MAKE_ALIVE", 10, "make_alive");
        MAKE_ALIVE = enumC440980HQy11;
        EnumC440980HQy[] enumC440980HQyArr = {enumC440980HQy, enumC440980HQy2, enumC440980HQy3, enumC440980HQy4, enumC440980HQy5, enumC440980HQy6, enumC440980HQy7, enumC440980HQy8, enumC440980HQy9, enumC440980HQy10, enumC440980HQy11};
        LLILLJJLI = enumC440980HQyArr;
        LLILLL = new C2254308sP(enumC440980HQyArr);
    }

    public static EnumC440980HQy[] values() {
        return (EnumC440980HQy[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440980HQy valueOf(String str) {
        return (EnumC440980HQy) C08FF.LIZ(EnumC440980HQy.class, str);
    }

    public EnumC440980HQy(String str, int i, String str2) {
        this.LL = str2;
    }
}
