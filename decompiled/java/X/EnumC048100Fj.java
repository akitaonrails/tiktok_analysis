package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC048100Fj {
    public static final EnumC048100Fj CLOSE_POI_LIST;
    public static final EnumC048100Fj DELETE_POI;
    public static final EnumC048100Fj EMPTY_SEARCH;
    public static final EnumC048100Fj ENTER_POST_PAGE;
    public static final EnumC048100Fj GIVE_UP_POST;
    public static final /* synthetic */ EnumC048100Fj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC048100Fj OPEN_POI_LIST;
    public static final EnumC048100Fj POST;
    public static final EnumC048100Fj SAVE_DRAFT;
    public static final EnumC048100Fj SEARCH_KEY_WORD;
    public static final EnumC048100Fj SEARCH_RESULT_CALLBACK;
    public static final EnumC048100Fj SELECT_POI_FROM_LIST;
    public static final EnumC048100Fj SELECT_POI_FROM_RECOMMEND;
    public static final EnumC048100Fj SLIDE_RECOMMEND;
    public static final EnumC048100Fj TURN_PAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC048100Fj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC048100Fj enumC048100Fj = new EnumC048100Fj("ENTER_POST_PAGE", 0, 1001);
        ENTER_POST_PAGE = enumC048100Fj;
        EnumC048100Fj enumC048100Fj2 = new EnumC048100Fj("POST", 1, 1002);
        POST = enumC048100Fj2;
        EnumC048100Fj enumC048100Fj3 = new EnumC048100Fj("SAVE_DRAFT", 2, 1003);
        SAVE_DRAFT = enumC048100Fj3;
        EnumC048100Fj enumC048100Fj4 = new EnumC048100Fj("GIVE_UP_POST", 3, 1004);
        GIVE_UP_POST = enumC048100Fj4;
        EnumC048100Fj enumC048100Fj5 = new EnumC048100Fj("TURN_PAGE", 4, 1005);
        TURN_PAGE = enumC048100Fj5;
        EnumC048100Fj enumC048100Fj6 = new EnumC048100Fj("SELECT_POI_FROM_LIST", 5, 1006);
        SELECT_POI_FROM_LIST = enumC048100Fj6;
        EnumC048100Fj enumC048100Fj7 = new EnumC048100Fj("SELECT_POI_FROM_RECOMMEND", 6, 1007);
        SELECT_POI_FROM_RECOMMEND = enumC048100Fj7;
        EnumC048100Fj enumC048100Fj8 = new EnumC048100Fj("DELETE_POI", 7, 1008);
        DELETE_POI = enumC048100Fj8;
        EnumC048100Fj enumC048100Fj9 = new EnumC048100Fj("SLIDE_RECOMMEND", 8, 1009);
        SLIDE_RECOMMEND = enumC048100Fj9;
        EnumC048100Fj enumC048100Fj10 = new EnumC048100Fj("OPEN_POI_LIST", 9, 1010);
        OPEN_POI_LIST = enumC048100Fj10;
        EnumC048100Fj enumC048100Fj11 = new EnumC048100Fj("CLOSE_POI_LIST", 10, 1011);
        CLOSE_POI_LIST = enumC048100Fj11;
        EnumC048100Fj enumC048100Fj12 = new EnumC048100Fj("SEARCH_KEY_WORD", 11, 1012);
        SEARCH_KEY_WORD = enumC048100Fj12;
        EnumC048100Fj enumC048100Fj13 = new EnumC048100Fj("EMPTY_SEARCH", 12, 1013);
        EMPTY_SEARCH = enumC048100Fj13;
        EnumC048100Fj enumC048100Fj14 = new EnumC048100Fj("SEARCH_RESULT_CALLBACK", 13, 1014);
        SEARCH_RESULT_CALLBACK = enumC048100Fj14;
        EnumC048100Fj[] enumC048100FjArr = {enumC048100Fj, enumC048100Fj2, enumC048100Fj3, enumC048100Fj4, enumC048100Fj5, enumC048100Fj6, enumC048100Fj7, enumC048100Fj8, enumC048100Fj9, enumC048100Fj10, enumC048100Fj11, enumC048100Fj12, enumC048100Fj13, enumC048100Fj14};
        LLILLJJLI = enumC048100FjArr;
        LLILLL = new C2254308sP(enumC048100FjArr);
    }

    public static EnumC048100Fj[] values() {
        return (EnumC048100Fj[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC048100Fj valueOf(String str) {
        return (EnumC048100Fj) C08FF.LIZ(EnumC048100Fj.class, str);
    }

    public EnumC048100Fj(String str, int i, int i2) {
        this.LL = i2;
    }
}
