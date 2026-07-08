package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308720C8g {
    public static final EnumC308720C8g ENABLE_VISION_SEARCH;
    public static final EnumC308720C8g IS_EC_MIDDLE;
    public static final /* synthetic */ EnumC308720C8g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC308720C8g NO_BLANK_PAGE_ID;
    public static final EnumC308720C8g SHOW_VISUAL_SEARCH_ENTRANCE;
    public static final EnumC308720C8g UNDER_18;
    public final String LL;

    public static InterfaceC2044707zh<EnumC308720C8g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC308720C8g enumC308720C8g = new EnumC308720C8g("UNDER_18", 0, "under_18");
        UNDER_18 = enumC308720C8g;
        EnumC308720C8g enumC308720C8g2 = new EnumC308720C8g("IS_EC_MIDDLE", 1, "is_ec_middle");
        IS_EC_MIDDLE = enumC308720C8g2;
        EnumC308720C8g enumC308720C8g3 = new EnumC308720C8g("SHOW_VISUAL_SEARCH_ENTRANCE", 2, "show_visual_search_entrance");
        SHOW_VISUAL_SEARCH_ENTRANCE = enumC308720C8g3;
        EnumC308720C8g enumC308720C8g4 = new EnumC308720C8g("ENABLE_VISION_SEARCH", 3, "enable_vision_search");
        ENABLE_VISION_SEARCH = enumC308720C8g4;
        EnumC308720C8g enumC308720C8g5 = new EnumC308720C8g("NO_BLANK_PAGE_ID", 4, "no_blank_page_id");
        NO_BLANK_PAGE_ID = enumC308720C8g5;
        EnumC308720C8g[] enumC308720C8gArr = {enumC308720C8g, enumC308720C8g2, enumC308720C8g3, enumC308720C8g4, enumC308720C8g5};
        LLILLJJLI = enumC308720C8gArr;
        LLILLL = new C2254308sP(enumC308720C8gArr);
    }

    public static EnumC308720C8g[] values() {
        return (EnumC308720C8g[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC308720C8g valueOf(String str) {
        return (EnumC308720C8g) C08FF.LIZ(EnumC308720C8g.class, str);
    }

    public EnumC308720C8g(String str, int i, String str2) {
        this.LL = str2;
    }
}
