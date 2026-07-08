package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1914300zum {
    public static final EnumC1914300zum BLOCK;
    public static final EnumC1914300zum BOTTOM_SHEET;
    public static final EnumC1914300zum COMPLIANCE_DIALOG;
    public static final EnumC1914300zum DIALOG;
    public static final EnumC1914300zum DIALOG_WIDE;
    public static final EnumC1914300zum FULLSCREEN;
    public static final /* synthetic */ EnumC1914300zum[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1914300zum PANEL;
    public static final EnumC1914300zum WEBVIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1914300zum> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1914300zum enumC1914300zum = new EnumC1914300zum("FULLSCREEN", 0, "fullscreen");
        FULLSCREEN = enumC1914300zum;
        EnumC1914300zum enumC1914300zum2 = new EnumC1914300zum("BOTTOM_SHEET", 1, "bottom");
        BOTTOM_SHEET = enumC1914300zum2;
        EnumC1914300zum enumC1914300zum3 = new EnumC1914300zum("DIALOG", 2, "pop");
        DIALOG = enumC1914300zum3;
        EnumC1914300zum enumC1914300zum4 = new EnumC1914300zum("DIALOG_WIDE", 3, "pop_wide");
        DIALOG_WIDE = enumC1914300zum4;
        EnumC1914300zum enumC1914300zum5 = new EnumC1914300zum("WEBVIEW", 4, "webview");
        WEBVIEW = enumC1914300zum5;
        EnumC1914300zum enumC1914300zum6 = new EnumC1914300zum("BLOCK", 5, "blocks");
        BLOCK = enumC1914300zum6;
        EnumC1914300zum enumC1914300zum7 = new EnumC1914300zum("PANEL", 6, "panel");
        PANEL = enumC1914300zum7;
        EnumC1914300zum enumC1914300zum8 = new EnumC1914300zum("COMPLIANCE_DIALOG", 7, "compliance_pop");
        COMPLIANCE_DIALOG = enumC1914300zum8;
        EnumC1914300zum[] enumC1914300zumArr = {enumC1914300zum, enumC1914300zum2, enumC1914300zum3, enumC1914300zum4, enumC1914300zum5, enumC1914300zum6, enumC1914300zum7, enumC1914300zum8};
        LLILLJJLI = enumC1914300zumArr;
        LLILLL = new C2254308sP(enumC1914300zumArr);
    }

    public static EnumC1914300zum[] values() {
        return (EnumC1914300zum[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1914300zum valueOf(String str) {
        return (EnumC1914300zum) C08FF.LIZ(EnumC1914300zum.class, str);
    }

    public EnumC1914300zum(String str, int i, String str2) {
        this.LL = str2;
    }
}
