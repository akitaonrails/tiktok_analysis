package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18PU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18PU {
    public static final C18PU BENEFIT_IMPACT_VSA_CARD_BG;
    public static final C18PU BENEFIT_IMPACT_VSA_CARD_PRODUCT;
    public static final C18PU LARGET_VSA_CLOSE;
    public static final C18PU LARGE_VSA_BUTTON;
    public static final C18PU LARGE_VSA_CARD_BG;
    public static final C18PU LARGE_VSA_CARD_PRODUCT;
    public static final /* synthetic */ C18PU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C18PU SHOP_TAB_ICON;
    public static final C18PU SMALL_VSA_CARD_BG;
    public static final C18PU SMALL_VSA_CARD_PRODUCT;
    public final String LL;

    public static InterfaceC2044707zh<C18PU> getEntries() {
        return LLILLL;
    }

    static {
        C18PU c18pu = new C18PU("LARGE_VSA_CARD_PRODUCT", 0, "large_vsa_card_product");
        LARGE_VSA_CARD_PRODUCT = c18pu;
        C18PU c18pu2 = new C18PU("LARGE_VSA_CARD_BG", 1, "large_vsa_card_bg");
        LARGE_VSA_CARD_BG = c18pu2;
        C18PU c18pu3 = new C18PU("LARGE_VSA_BUTTON", 2, "large_vsa_button");
        LARGE_VSA_BUTTON = c18pu3;
        C18PU c18pu4 = new C18PU("LARGET_VSA_CLOSE", 3, "large_vsa_close");
        LARGET_VSA_CLOSE = c18pu4;
        C18PU c18pu5 = new C18PU("SMALL_VSA_CARD_PRODUCT", 4, "small_vsa_card_product");
        SMALL_VSA_CARD_PRODUCT = c18pu5;
        C18PU c18pu6 = new C18PU("SMALL_VSA_CARD_BG", 5, "small_vsa_card_bg");
        SMALL_VSA_CARD_BG = c18pu6;
        C18PU c18pu7 = new C18PU("SHOP_TAB_ICON", 6, "shop_tab_icon");
        SHOP_TAB_ICON = c18pu7;
        C18PU c18pu8 = new C18PU("BENEFIT_IMPACT_VSA_CARD_PRODUCT", 7, "benefit_impact_vsa_card_product");
        BENEFIT_IMPACT_VSA_CARD_PRODUCT = c18pu8;
        C18PU c18pu9 = new C18PU("BENEFIT_IMPACT_VSA_CARD_BG", 8, "benefit_impact_vsa_card_bg");
        BENEFIT_IMPACT_VSA_CARD_BG = c18pu9;
        C18PU[] c18puArr = {c18pu, c18pu2, c18pu3, c18pu4, c18pu5, c18pu6, c18pu7, c18pu8, c18pu9};
        LLILLJJLI = c18puArr;
        LLILLL = new C2254308sP(c18puArr);
    }

    public static C18PU[] values() {
        return (C18PU[]) LLILLJJLI.clone();
    }

    public final String getArea() {
        return this.LL;
    }

    public static C18PU valueOf(String str) {
        return (C18PU) C08FF.LIZ(C18PU.class, str);
    }

    public C18PU(String str, int i, String str2) {
        this.LL = str2;
    }
}
