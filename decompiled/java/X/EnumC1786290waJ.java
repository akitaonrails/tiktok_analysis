package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0waJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1786290waJ {
    public static final EnumC1786290waJ ACTION_BAR;
    public static final EnumC1786290waJ AUTO_OPEN_FROM_GROUP;
    public static final C1786280waI Companion;
    public static final EnumC1786290waJ GROUP_SHOT_CARD;
    public static final EnumC1786290waJ INBOX_BANNER;
    public static final EnumC1786290waJ INBOX_POPUP;
    public static final EnumC1786290waJ INLINE_MSG;
    public static final EnumC1786290waJ INNER_PUSH;
    public static final EnumC1786290waJ IN_CHAT_ANCHOR;
    public static final /* synthetic */ EnumC1786290waJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1786290waJ ONGOING_TOP_BANNER;
    public static final EnumC1786290waJ OUT_CHAT_ANCHOR;
    public static final EnumC1786290waJ TRY_DETAIL_PAGE;
    public static final EnumC1786290waJ TRY_GROUP_SHOT_BUTTON;
    public static final EnumC1786290waJ UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1786290waJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1786290waJ enumC1786290waJ = new EnumC1786290waJ("ACTION_BAR", 0, "action_bar");
        ACTION_BAR = enumC1786290waJ;
        EnumC1786290waJ enumC1786290waJ2 = new EnumC1786290waJ("INLINE_MSG", 1, "inline_message");
        INLINE_MSG = enumC1786290waJ2;
        EnumC1786290waJ enumC1786290waJ3 = new EnumC1786290waJ("TRY_GROUP_SHOT_BUTTON", 2, "try_group_shot");
        TRY_GROUP_SHOT_BUTTON = enumC1786290waJ3;
        EnumC1786290waJ enumC1786290waJ4 = new EnumC1786290waJ("IN_CHAT_ANCHOR", 3, "anchor");
        IN_CHAT_ANCHOR = enumC1786290waJ4;
        EnumC1786290waJ enumC1786290waJ5 = new EnumC1786290waJ("OUT_CHAT_ANCHOR", 4, "anchor");
        OUT_CHAT_ANCHOR = enumC1786290waJ5;
        EnumC1786290waJ enumC1786290waJ6 = new EnumC1786290waJ("ONGOING_TOP_BANNER", 5, "chat_top_banner");
        ONGOING_TOP_BANNER = enumC1786290waJ6;
        EnumC1786290waJ enumC1786290waJ7 = new EnumC1786290waJ("GROUP_SHOT_CARD", 6, "main_card");
        GROUP_SHOT_CARD = enumC1786290waJ7;
        EnumC1786290waJ enumC1786290waJ8 = new EnumC1786290waJ("INNER_PUSH", 7, "inner_push");
        INNER_PUSH = enumC1786290waJ8;
        EnumC1786290waJ enumC1786290waJ9 = new EnumC1786290waJ("INBOX_BANNER", 8, "inbox_banner");
        INBOX_BANNER = enumC1786290waJ9;
        EnumC1786290waJ enumC1786290waJ10 = new EnumC1786290waJ("INBOX_POPUP", 9, "inbox_pop_up");
        INBOX_POPUP = enumC1786290waJ10;
        EnumC1786290waJ enumC1786290waJ11 = new EnumC1786290waJ("AUTO_OPEN_FROM_GROUP", 10, "auto_open_from_group");
        AUTO_OPEN_FROM_GROUP = enumC1786290waJ11;
        EnumC1786290waJ enumC1786290waJ12 = new EnumC1786290waJ("UNKNOWN", 11, "others");
        UNKNOWN = enumC1786290waJ12;
        EnumC1786290waJ enumC1786290waJ13 = new EnumC1786290waJ("TRY_DETAIL_PAGE", 12, "try_detail_page");
        TRY_DETAIL_PAGE = enumC1786290waJ13;
        EnumC1786290waJ[] enumC1786290waJArr = {enumC1786290waJ, enumC1786290waJ2, enumC1786290waJ3, enumC1786290waJ4, enumC1786290waJ5, enumC1786290waJ6, enumC1786290waJ7, enumC1786290waJ8, enumC1786290waJ9, enumC1786290waJ10, enumC1786290waJ11, enumC1786290waJ12, enumC1786290waJ13};
        LLILLJJLI = enumC1786290waJArr;
        LLILLL = new C2254308sP(enumC1786290waJArr);
        Companion = new C1786280waI();
    }

    public static EnumC1786290waJ[] values() {
        return (EnumC1786290waJ[]) LLILLJJLI.clone();
    }

    public final String getEntranceValue() {
        return this.LL;
    }

    public static EnumC1786290waJ valueOf(String str) {
        return (EnumC1786290waJ) C08FF.LIZ(EnumC1786290waJ.class, str);
    }

    public EnumC1786290waJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
