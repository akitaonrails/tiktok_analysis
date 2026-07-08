package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1587000rOs {
    public static final EnumC1587000rOs COLD_START;
    public static final EnumC1587000rOs COMPENSATE_BY_FOREGROUND;
    public static final EnumC1587000rOs FYP_GUIDE_CARD;
    public static final EnumC1587000rOs HOMEPAGE_RECREATE;
    public static final /* synthetic */ EnumC1587000rOs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1587000rOs NON_PERSONALIZED_FEED_CHANGE;
    public static final EnumC1587000rOs NULL;
    public static final EnumC1587000rOs NUMBER_DOT_CHANGE;
    public static final EnumC1587000rOs POLLING;
    public static final EnumC1587000rOs POST_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1587000rOs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1587000rOs enumC1587000rOs = new EnumC1587000rOs("NULL", 0, "null");
        NULL = enumC1587000rOs;
        EnumC1587000rOs enumC1587000rOs2 = new EnumC1587000rOs("COLD_START", 1, "cold_start");
        COLD_START = enumC1587000rOs2;
        EnumC1587000rOs enumC1587000rOs3 = new EnumC1587000rOs("HOMEPAGE_RECREATE", 2, "homepage_recreate");
        HOMEPAGE_RECREATE = enumC1587000rOs3;
        EnumC1587000rOs enumC1587000rOs4 = new EnumC1587000rOs("POLLING", 3, "polling");
        POLLING = enumC1587000rOs4;
        EnumC1587000rOs enumC1587000rOs5 = new EnumC1587000rOs("NUMBER_DOT_CHANGE", 4, "number_dot_change");
        NUMBER_DOT_CHANGE = enumC1587000rOs5;
        EnumC1587000rOs enumC1587000rOs6 = new EnumC1587000rOs("COMPENSATE_BY_FOREGROUND", 5, "compensate_by_foreground");
        COMPENSATE_BY_FOREGROUND = enumC1587000rOs6;
        EnumC1587000rOs enumC1587000rOs7 = new EnumC1587000rOs("NON_PERSONALIZED_FEED_CHANGE", 6, "non_personalized_feed_change");
        NON_PERSONALIZED_FEED_CHANGE = enumC1587000rOs7;
        EnumC1587000rOs enumC1587000rOs8 = new EnumC1587000rOs("FYP_GUIDE_CARD", 7, "redirect_to_friends_tab_card");
        FYP_GUIDE_CARD = enumC1587000rOs8;
        EnumC1587000rOs enumC1587000rOs9 = new EnumC1587000rOs("POST_PAGE", 8, "post_page");
        POST_PAGE = enumC1587000rOs9;
        EnumC1587000rOs[] enumC1587000rOsArr = {enumC1587000rOs, enumC1587000rOs2, enumC1587000rOs3, enumC1587000rOs4, enumC1587000rOs5, enumC1587000rOs6, enumC1587000rOs7, enumC1587000rOs8, enumC1587000rOs9};
        LLILLJJLI = enumC1587000rOsArr;
        LLILLL = new C2254308sP(enumC1587000rOsArr);
    }

    public static EnumC1587000rOs[] values() {
        return (EnumC1587000rOs[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1587000rOs valueOf(String str) {
        return (EnumC1587000rOs) C08FF.LIZ(EnumC1587000rOs.class, str);
    }

    public EnumC1587000rOs(String str, int i, String str2) {
        this.LL = str2;
    }
}
