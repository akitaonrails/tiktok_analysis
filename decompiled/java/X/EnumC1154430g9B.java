package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154430g9B {
    public static final /* synthetic */ EnumC1154430g9B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154430g9B SHOP_TAB_90SEARCH;
    public static final EnumC1154430g9B SHOP_TAB_CARAVEL;
    public static final EnumC1154430g9B SHOP_TAB_LYNX;
    public static final EnumC1154430g9B SHOP_TAB_PDP;
    public static final EnumC1154430g9B SHOP_TAB_PLP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1154430g9B> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154430g9B enumC1154430g9B = new EnumC1154430g9B("SHOP_TAB_PDP", 0, "shop_tab_pdp");
        SHOP_TAB_PDP = enumC1154430g9B;
        EnumC1154430g9B enumC1154430g9B2 = new EnumC1154430g9B("SHOP_TAB_PLP", 1, "shop_tab_plp");
        SHOP_TAB_PLP = enumC1154430g9B2;
        EnumC1154430g9B enumC1154430g9B3 = new EnumC1154430g9B("SHOP_TAB_LYNX", 2, "shop_tab_lynx");
        SHOP_TAB_LYNX = enumC1154430g9B3;
        EnumC1154430g9B enumC1154430g9B4 = new EnumC1154430g9B("SHOP_TAB_CARAVEL", 3, "shop_tab_caravel");
        SHOP_TAB_CARAVEL = enumC1154430g9B4;
        EnumC1154430g9B enumC1154430g9B5 = new EnumC1154430g9B("SHOP_TAB_90SEARCH", 4, "shop_tab_90search");
        SHOP_TAB_90SEARCH = enumC1154430g9B5;
        EnumC1154430g9B[] enumC1154430g9BArr = {enumC1154430g9B, enumC1154430g9B2, enumC1154430g9B3, enumC1154430g9B4, enumC1154430g9B5};
        LLILLJJLI = enumC1154430g9BArr;
        LLILLL = new C2254308sP(enumC1154430g9BArr);
    }

    public static EnumC1154430g9B[] values() {
        return (EnumC1154430g9B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1154430g9B valueOf(String str) {
        return (EnumC1154430g9B) C08FF.LIZ(EnumC1154430g9B.class, str);
    }

    public EnumC1154430g9B(String str, int i, String str2) {
        this.LL = str2;
    }
}
