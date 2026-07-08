package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H60, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H60 {
    public static final C0H60 DOUBLE_COL_AD_CARD;
    public static final C0H60 FYP_SEARCH_ICON;
    public static final C0H60 KEYWORD_CLEAR;
    public static final C0H60 KEYWORD_INPUT_BOX;
    public static final /* synthetic */ C0H60[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0H60 SEARCH_HUB_OPTION;
    public final String LL;

    public static InterfaceC2044707zh<C0H60> getEntries() {
        return LLILLL;
    }

    static {
        C0H60 c0h60 = new C0H60("KEYWORD_INPUT_BOX", 0, "input_box");
        KEYWORD_INPUT_BOX = c0h60;
        C0H60 c0h602 = new C0H60("KEYWORD_CLEAR", 1, "Clear text");
        KEYWORD_CLEAR = c0h602;
        C0H60 c0h603 = new C0H60("FYP_SEARCH_ICON", 2, "Search");
        FYP_SEARCH_ICON = c0h603;
        C0H60 c0h604 = new C0H60("SEARCH_HUB_OPTION", 3, "option");
        SEARCH_HUB_OPTION = c0h604;
        C0H60 c0h605 = new C0H60("DOUBLE_COL_AD_CARD", 4, "video");
        DOUBLE_COL_AD_CARD = c0h605;
        C0H60[] c0h60Arr = {c0h60, c0h602, c0h603, c0h604, c0h605};
        LLILLJJLI = c0h60Arr;
        LLILLL = new C2254308sP(c0h60Arr);
    }

    public static C0H60[] values() {
        return (C0H60[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static C0H60 valueOf(String str) {
        return (C0H60) C08FF.LIZ(C0H60.class, str);
    }

    public C0H60(String str, int i, String str2) {
        this.LL = str2;
    }
}
