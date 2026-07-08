package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QWT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWT {
    public static final C0QWT FLEX_COLOR_FONT;
    public static final C0QWT LEFT_ICON_RIGHT_TEXT;
    public static final /* synthetic */ C0QWT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QWT RED_FONT;
    public static final C0QWT RED_FONT_WITH_DOT_SEPARATOR;
    public static final C0QWT ROUND_RECTANGLE;
    public static final C0QWT ROUND_RECTANGLE_WITH_OVAL;
    public static final C0QWT WATCHED_IMAGE_TEXT;
    public static final C0QWT YELLOW_FONT;
    public final String LL;

    public static InterfaceC2044707zh<C0QWT> getEntries() {
        return LLILLL;
    }

    static {
        C0QWT c0qwt = new C0QWT("RED_FONT", 0, "1");
        RED_FONT = c0qwt;
        C0QWT c0qwt2 = new C0QWT("YELLOW_FONT", 1, "2");
        YELLOW_FONT = c0qwt2;
        C0QWT c0qwt3 = new C0QWT("ROUND_RECTANGLE_WITH_OVAL", 2, "3");
        ROUND_RECTANGLE_WITH_OVAL = c0qwt3;
        C0QWT c0qwt4 = new C0QWT("ROUND_RECTANGLE", 3, "4");
        ROUND_RECTANGLE = c0qwt4;
        C0QWT c0qwt5 = new C0QWT("RED_FONT_WITH_DOT_SEPARATOR", 4, "5");
        RED_FONT_WITH_DOT_SEPARATOR = c0qwt5;
        C0QWT c0qwt6 = new C0QWT("FLEX_COLOR_FONT", 5, "6");
        FLEX_COLOR_FONT = c0qwt6;
        C0QWT c0qwt7 = new C0QWT("WATCHED_IMAGE_TEXT", 6, "7");
        WATCHED_IMAGE_TEXT = c0qwt7;
        C0QWT c0qwt8 = new C0QWT("LEFT_ICON_RIGHT_TEXT", 7, "8");
        LEFT_ICON_RIGHT_TEXT = c0qwt8;
        C0QWT[] c0qwtArr = {c0qwt, c0qwt2, c0qwt3, c0qwt4, c0qwt5, c0qwt6, c0qwt7, c0qwt8};
        LLILLJJLI = c0qwtArr;
        LLILLL = new C2254308sP(c0qwtArr);
    }

    public static C0QWT[] values() {
        return (C0QWT[]) LLILLJJLI.clone();
    }

    public final String getStyleCode() {
        return this.LL;
    }

    public static C0QWT valueOf(String str) {
        return (C0QWT) C08FF.LIZ(C0QWT.class, str);
    }

    public C0QWT(String str, int i, String str2) {
        this.LL = str2;
    }
}
