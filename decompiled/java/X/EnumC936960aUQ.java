package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC936960aUQ {
    public static final EnumC936960aUQ COUNTDOWN_FOR_ALL;
    public static final EnumC936960aUQ GUEST_SHOWDOWN;
    public static final EnumC936960aUQ LETS_DANCE;
    public static final EnumC936960aUQ LIVE_SHOW;
    public static final /* synthetic */ EnumC936960aUQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC936960aUQ NONE;
    public static final EnumC936960aUQ NOTICE_BOARD;
    public static final EnumC936960aUQ TEXT_HEADER;
    public static final EnumC936960aUQ TOP_GUEST;
    public static final EnumC936960aUQ WALLPAPER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC936960aUQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC936960aUQ enumC936960aUQ = new EnumC936960aUQ("NONE", 0, "unknown");
        NONE = enumC936960aUQ;
        EnumC936960aUQ enumC936960aUQ2 = new EnumC936960aUQ("GUEST_SHOWDOWN", 1, "guest_showdown");
        GUEST_SHOWDOWN = enumC936960aUQ2;
        EnumC936960aUQ enumC936960aUQ3 = new EnumC936960aUQ("LIVE_SHOW", 2, "live_show");
        LIVE_SHOW = enumC936960aUQ3;
        EnumC936960aUQ enumC936960aUQ4 = new EnumC936960aUQ("COUNTDOWN_FOR_ALL", 3, "count_down_for_all");
        COUNTDOWN_FOR_ALL = enumC936960aUQ4;
        EnumC936960aUQ enumC936960aUQ5 = new EnumC936960aUQ("NOTICE_BOARD", 4, "notice_board");
        NOTICE_BOARD = enumC936960aUQ5;
        EnumC936960aUQ enumC936960aUQ6 = new EnumC936960aUQ("WALLPAPER", 5, "shared_background");
        WALLPAPER = enumC936960aUQ6;
        EnumC936960aUQ enumC936960aUQ7 = new EnumC936960aUQ("TOP_GUEST", 6, "top_guests");
        TOP_GUEST = enumC936960aUQ7;
        EnumC936960aUQ enumC936960aUQ8 = new EnumC936960aUQ("TEXT_HEADER", 7, "header");
        TEXT_HEADER = enumC936960aUQ8;
        EnumC936960aUQ enumC936960aUQ9 = new EnumC936960aUQ("LETS_DANCE", 8, "lets_dance");
        LETS_DANCE = enumC936960aUQ9;
        EnumC936960aUQ[] enumC936960aUQArr = {enumC936960aUQ, enumC936960aUQ2, enumC936960aUQ3, enumC936960aUQ4, enumC936960aUQ5, enumC936960aUQ6, enumC936960aUQ7, enumC936960aUQ8, enumC936960aUQ9};
        LLILLJJLI = enumC936960aUQArr;
        LLILLL = new C2254308sP(enumC936960aUQArr);
    }

    public static EnumC936960aUQ[] values() {
        return (EnumC936960aUQ[]) LLILLJJLI.clone();
    }

    public final String getToolName() {
        return this.LL;
    }

    public static EnumC936960aUQ valueOf(String str) {
        return (EnumC936960aUQ) C08FF.LIZ(EnumC936960aUQ.class, str);
    }

    public EnumC936960aUQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
