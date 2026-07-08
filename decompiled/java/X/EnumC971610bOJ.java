package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bOJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC971610bOJ {
    public static final EnumC971610bOJ BOARD;
    public static final EnumC971610bOJ CANVAS;
    public static final EnumC971610bOJ CREATE_PAGE;
    public static final EnumC971610bOJ EDU;
    public static final EnumC971610bOJ FAQ;
    public static final EnumC971610bOJ HEADER;
    public static final EnumC971610bOJ HISTORY;
    public static final /* synthetic */ EnumC971610bOJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC971610bOJ TEMPLATES;
    public final String LL;

    public static InterfaceC2044707zh<EnumC971610bOJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC971610bOJ enumC971610bOJ = new EnumC971610bOJ("FAQ", 0, "faq");
        FAQ = enumC971610bOJ;
        EnumC971610bOJ enumC971610bOJ2 = new EnumC971610bOJ("CANVAS", 1, "canvas");
        CANVAS = enumC971610bOJ2;
        EnumC971610bOJ enumC971610bOJ3 = new EnumC971610bOJ("HISTORY", 2, "history");
        HISTORY = enumC971610bOJ3;
        EnumC971610bOJ enumC971610bOJ4 = new EnumC971610bOJ("TEMPLATES", 3, "templates");
        TEMPLATES = enumC971610bOJ4;
        EnumC971610bOJ enumC971610bOJ5 = new EnumC971610bOJ("HEADER", 4, "header_page");
        HEADER = enumC971610bOJ5;
        EnumC971610bOJ enumC971610bOJ6 = new EnumC971610bOJ("EDU", 5, "edu_page");
        EDU = enumC971610bOJ6;
        EnumC971610bOJ enumC971610bOJ7 = new EnumC971610bOJ("BOARD", 6, "board_page");
        BOARD = enumC971610bOJ7;
        EnumC971610bOJ enumC971610bOJ8 = new EnumC971610bOJ("CREATE_PAGE", 7, "create_page");
        CREATE_PAGE = enumC971610bOJ8;
        EnumC971610bOJ[] enumC971610bOJArr = {enumC971610bOJ, enumC971610bOJ2, enumC971610bOJ3, enumC971610bOJ4, enumC971610bOJ5, enumC971610bOJ6, enumC971610bOJ7, enumC971610bOJ8};
        LLILLJJLI = enumC971610bOJArr;
        LLILLL = new C2254308sP(enumC971610bOJArr);
    }

    public static EnumC971610bOJ[] values() {
        return (EnumC971610bOJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC971610bOJ valueOf(String str) {
        return (EnumC971610bOJ) C08FF.LIZ(EnumC971610bOJ.class, str);
    }

    public EnumC971610bOJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
