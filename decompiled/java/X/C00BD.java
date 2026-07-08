package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BD {
    public static final C00BD CLICK_SELECT_TEXT_OCR;
    public static final /* synthetic */ C00BD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00BD MANUAL_DRAW_OCR;
    public static final C00BD MANUAL_SELECT_OCR;
    public final String LL;

    public static InterfaceC2044707zh<C00BD> getEntries() {
        return LLILLL;
    }

    static {
        C00BD c00bd = new C00BD("CLICK_SELECT_TEXT_OCR", 0, "click_select_text_ocr");
        CLICK_SELECT_TEXT_OCR = c00bd;
        C00BD c00bd2 = new C00BD("MANUAL_SELECT_OCR", 1, "manual_select_ocr");
        MANUAL_SELECT_OCR = c00bd2;
        C00BD c00bd3 = new C00BD("MANUAL_DRAW_OCR", 2, "manual_draw_ocr");
        MANUAL_DRAW_OCR = c00bd3;
        C00BD[] c00bdArr = {c00bd, c00bd2, c00bd3};
        LLILLJJLI = c00bdArr;
        LLILLL = new C2254308sP(c00bdArr);
    }

    public static C00BD[] values() {
        return (C00BD[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C00BD valueOf(String str) {
        return (C00BD) C08FF.LIZ(C00BD.class, str);
    }

    public C00BD(String str, int i, String str2) {
        this.LL = str2;
    }
}
