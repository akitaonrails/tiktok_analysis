package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC346100DhY {
    public static final EnumC346100DhY CLICK_BACK;
    public static final EnumC346100DhY CLICK_CANCEL_GRADUATION_YEAR_POPUP;
    public static final EnumC346100DhY CLICK_CONNECTION;
    public static final EnumC346100DhY CLICK_EDIT;
    public static final EnumC346100DhY CLICK_GRADUATION_YEAR;
    public static final EnumC346100DhY CLICK_POPULAR;
    public static final EnumC346100DhY CLICK_SEARCH;
    public static final EnumC346100DhY CLICK_TAB;
    public static final EnumC346100DhY FETCH_DATA;
    public static final /* synthetic */ EnumC346100DhY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC346100DhY SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC346100DhY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC346100DhY enumC346100DhY = new EnumC346100DhY("SHOW", 0, "show");
        SHOW = enumC346100DhY;
        EnumC346100DhY enumC346100DhY2 = new EnumC346100DhY("FETCH_DATA", 1, "fetch_data");
        FETCH_DATA = enumC346100DhY2;
        EnumC346100DhY enumC346100DhY3 = new EnumC346100DhY("CLICK_BACK", 2, "click_back");
        CLICK_BACK = enumC346100DhY3;
        EnumC346100DhY enumC346100DhY4 = new EnumC346100DhY("CLICK_EDIT", 3, "click_edit");
        CLICK_EDIT = enumC346100DhY4;
        EnumC346100DhY enumC346100DhY5 = new EnumC346100DhY("CLICK_GRADUATION_YEAR", 4, "click_graduation_year");
        CLICK_GRADUATION_YEAR = enumC346100DhY5;
        EnumC346100DhY enumC346100DhY6 = new EnumC346100DhY("CLICK_CANCEL_GRADUATION_YEAR_POPUP", 5, "click_cancel_graduation_year_popup");
        CLICK_CANCEL_GRADUATION_YEAR_POPUP = enumC346100DhY6;
        EnumC346100DhY enumC346100DhY7 = new EnumC346100DhY("CLICK_POPULAR", 6, "click_popular");
        CLICK_POPULAR = enumC346100DhY7;
        EnumC346100DhY enumC346100DhY8 = new EnumC346100DhY("CLICK_CONNECTION", 7, "click_connection");
        CLICK_CONNECTION = enumC346100DhY8;
        EnumC346100DhY enumC346100DhY9 = new EnumC346100DhY("CLICK_SEARCH", 8, "click_search");
        CLICK_SEARCH = enumC346100DhY9;
        EnumC346100DhY enumC346100DhY10 = new EnumC346100DhY("CLICK_TAB", 9, "click_tab");
        CLICK_TAB = enumC346100DhY10;
        EnumC346100DhY[] enumC346100DhYArr = {enumC346100DhY, enumC346100DhY2, enumC346100DhY3, enumC346100DhY4, enumC346100DhY5, enumC346100DhY6, enumC346100DhY7, enumC346100DhY8, enumC346100DhY9, enumC346100DhY10};
        LLILLJJLI = enumC346100DhYArr;
        LLILLL = new C2254308sP(enumC346100DhYArr);
    }

    public static EnumC346100DhY[] values() {
        return (EnumC346100DhY[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC346100DhY valueOf(String str) {
        return (EnumC346100DhY) C08FF.LIZ(EnumC346100DhY.class, str);
    }

    public EnumC346100DhY(String str, int i, String str2) {
        this.LL = str2;
    }
}
