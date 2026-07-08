package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0by4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993780by4 {
    public static final EnumC993780by4 BOTTOM_TAB_VIEW;
    public static final EnumC993780by4 CORNER_TAB_VIEW;
    public static final /* synthetic */ EnumC993780by4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993780by4 TOP_TAB_VIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993780by4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993780by4 enumC993780by4 = new EnumC993780by4("TOP_TAB_VIEW", 0, "top_tab_view");
        TOP_TAB_VIEW = enumC993780by4;
        EnumC993780by4 enumC993780by42 = new EnumC993780by4("BOTTOM_TAB_VIEW", 1, "bottom_tab_view");
        BOTTOM_TAB_VIEW = enumC993780by42;
        EnumC993780by4 enumC993780by43 = new EnumC993780by4("CORNER_TAB_VIEW", 2, "corner_tab_view");
        CORNER_TAB_VIEW = enumC993780by43;
        EnumC993780by4[] enumC993780by4Arr = {enumC993780by4, enumC993780by42, enumC993780by43};
        LLILLJJLI = enumC993780by4Arr;
        LLILLL = new C2254308sP(enumC993780by4Arr);
    }

    public static EnumC993780by4[] values() {
        return (EnumC993780by4[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC993780by4 valueOf(String str) {
        return (EnumC993780by4) C08FF.LIZ(EnumC993780by4.class, str);
    }

    public EnumC993780by4(String str, int i, String str2) {
        this.LL = str2;
    }
}
