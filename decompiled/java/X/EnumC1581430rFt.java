package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1581430rFt {
    public static final EnumC1581430rFt CLICK_SCHOOL_CARD;
    public static final EnumC1581430rFt ENTER_PERSONAL_DETAIL;
    public static final EnumC1581430rFt ENTER_SEARCH;
    public static final EnumC1581430rFt EXIT_APP;
    public static final EnumC1581430rFt EXIT_SCHOOL_POSTS_TAB;
    public static final /* synthetic */ EnumC1581430rFt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1581430rFt OTHER;
    public static final EnumC1581430rFt REFRESH;
    public static final EnumC1581430rFt SLIDE_SHOW_MORE_CONTENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1581430rFt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1581430rFt enumC1581430rFt = new EnumC1581430rFt("SLIDE_SHOW_MORE_CONTENT", 0, "slide_show_more_content");
        SLIDE_SHOW_MORE_CONTENT = enumC1581430rFt;
        EnumC1581430rFt enumC1581430rFt2 = new EnumC1581430rFt("EXIT_SCHOOL_POSTS_TAB", 1, "exit_school_posts_tab");
        EXIT_SCHOOL_POSTS_TAB = enumC1581430rFt2;
        EnumC1581430rFt enumC1581430rFt3 = new EnumC1581430rFt("CLICK_SCHOOL_CARD", 2, "click_school_card");
        CLICK_SCHOOL_CARD = enumC1581430rFt3;
        EnumC1581430rFt enumC1581430rFt4 = new EnumC1581430rFt("REFRESH", 3, "refresh");
        REFRESH = enumC1581430rFt4;
        EnumC1581430rFt enumC1581430rFt5 = new EnumC1581430rFt("EXIT_APP", 4, "exit_app");
        EXIT_APP = enumC1581430rFt5;
        EnumC1581430rFt enumC1581430rFt6 = new EnumC1581430rFt("ENTER_SEARCH", 5, "enter_search");
        ENTER_SEARCH = enumC1581430rFt6;
        EnumC1581430rFt enumC1581430rFt7 = new EnumC1581430rFt("ENTER_PERSONAL_DETAIL", 6, "enter_personal_detail");
        ENTER_PERSONAL_DETAIL = enumC1581430rFt7;
        EnumC1581430rFt enumC1581430rFt8 = new EnumC1581430rFt("OTHER", 7, "other");
        OTHER = enumC1581430rFt8;
        EnumC1581430rFt[] enumC1581430rFtArr = {enumC1581430rFt, enumC1581430rFt2, enumC1581430rFt3, enumC1581430rFt4, enumC1581430rFt5, enumC1581430rFt6, enumC1581430rFt7, enumC1581430rFt8};
        LLILLJJLI = enumC1581430rFtArr;
        LLILLL = new C2254308sP(enumC1581430rFtArr);
    }

    public static EnumC1581430rFt[] values() {
        return (EnumC1581430rFt[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1581430rFt valueOf(String str) {
        return (EnumC1581430rFt) C08FF.LIZ(EnumC1581430rFt.class, str);
    }

    public EnumC1581430rFt(String str, int i, String str2) {
        this.LL = str2;
    }
}
