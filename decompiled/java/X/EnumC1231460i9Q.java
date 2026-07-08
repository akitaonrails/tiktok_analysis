package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i9Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1231460i9Q {
    public static final EnumC1231460i9Q ADD_SCHOOL_SHEET_POP_UP;
    public static final EnumC1231460i9Q CAMPUS_DEBUG_TOOL;
    public static final EnumC1231460i9Q EDIT_PROFILE_PAGE;
    public static final EnumC1231460i9Q EXTERNAL;
    public static final EnumC1231460i9Q FIND_FRIENDS_PAGE;
    public static final EnumC1231460i9Q GROUP_CHAT_VERIFY_PAGE;
    public static final EnumC1231460i9Q HOMEPAGE_HOT;
    public static final /* synthetic */ EnumC1231460i9Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1231460i9Q OTHERS_HOMEPAGE;
    public static final EnumC1231460i9Q PERSONAL_HOMEPAGE;
    public static final EnumC1231460i9Q PROFILE_BANNER;
    public static final EnumC1231460i9Q SCHOOL_COMMUNITY_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1231460i9Q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1231460i9Q enumC1231460i9Q = new EnumC1231460i9Q("EDIT_PROFILE_PAGE", 0, "edit_profile_page");
        EDIT_PROFILE_PAGE = enumC1231460i9Q;
        EnumC1231460i9Q enumC1231460i9Q2 = new EnumC1231460i9Q("PERSONAL_HOMEPAGE", 1, "personal_homepage");
        PERSONAL_HOMEPAGE = enumC1231460i9Q2;
        EnumC1231460i9Q enumC1231460i9Q3 = new EnumC1231460i9Q("OTHERS_HOMEPAGE", 2, "others_homepage");
        OTHERS_HOMEPAGE = enumC1231460i9Q3;
        EnumC1231460i9Q enumC1231460i9Q4 = new EnumC1231460i9Q("FIND_FRIENDS_PAGE", 3, "find_friends_page");
        FIND_FRIENDS_PAGE = enumC1231460i9Q4;
        EnumC1231460i9Q enumC1231460i9Q5 = new EnumC1231460i9Q("ADD_SCHOOL_SHEET_POP_UP", 4, "add_school_sheet_pop_up");
        ADD_SCHOOL_SHEET_POP_UP = enumC1231460i9Q5;
        EnumC1231460i9Q enumC1231460i9Q6 = new EnumC1231460i9Q("SCHOOL_COMMUNITY_PAGE", 5, "school_community_page");
        SCHOOL_COMMUNITY_PAGE = enumC1231460i9Q6;
        EnumC1231460i9Q enumC1231460i9Q7 = new EnumC1231460i9Q("GROUP_CHAT_VERIFY_PAGE", 6, "group_chat_verify_page");
        GROUP_CHAT_VERIFY_PAGE = enumC1231460i9Q7;
        EnumC1231460i9Q enumC1231460i9Q8 = new EnumC1231460i9Q("CAMPUS_DEBUG_TOOL", 7, "campus_debug_tool");
        CAMPUS_DEBUG_TOOL = enumC1231460i9Q8;
        EnumC1231460i9Q enumC1231460i9Q9 = new EnumC1231460i9Q("HOMEPAGE_HOT", 8, "homepage_hot");
        HOMEPAGE_HOT = enumC1231460i9Q9;
        EnumC1231460i9Q enumC1231460i9Q10 = new EnumC1231460i9Q("PROFILE_BANNER", 9, "profile_banner");
        PROFILE_BANNER = enumC1231460i9Q10;
        EnumC1231460i9Q enumC1231460i9Q11 = new EnumC1231460i9Q("EXTERNAL", 10, "external");
        EXTERNAL = enumC1231460i9Q11;
        EnumC1231460i9Q[] enumC1231460i9QArr = {enumC1231460i9Q, enumC1231460i9Q2, enumC1231460i9Q3, enumC1231460i9Q4, enumC1231460i9Q5, enumC1231460i9Q6, enumC1231460i9Q7, enumC1231460i9Q8, enumC1231460i9Q9, enumC1231460i9Q10, enumC1231460i9Q11};
        LLILLJJLI = enumC1231460i9QArr;
        LLILLL = new C2254308sP(enumC1231460i9QArr);
    }

    public static EnumC1231460i9Q[] values() {
        return (EnumC1231460i9Q[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC1231460i9Q valueOf(String str) {
        return (EnumC1231460i9Q) C08FF.LIZ(EnumC1231460i9Q.class, str);
    }

    public EnumC1231460i9Q(String str, int i, String str2) {
        this.LL = str2;
    }
}
