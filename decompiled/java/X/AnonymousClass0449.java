package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0449, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0449 {
    public static final AnonymousClass0449 CHANGE_PURCHASE_METHOD;
    public static final AnonymousClass0449 CHANGE_SKU_QUANTITY;
    public static final AnonymousClass0449 FAVORITE_ACTION;
    public static final AnonymousClass0449 GET_SHOP_SCHEMA;
    public static final AnonymousClass0449 HALF_SCREEN_SCROLL;
    public static final /* synthetic */ AnonymousClass0449[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0449 OPEN_COUPON_DETAILS;
    public static final AnonymousClass0449 PICTURE_IN_PICTURE_ACTION;
    public static final AnonymousClass0449 SHARE_ACTION;
    public static final AnonymousClass0449 SWITCH_SKU;
    public static final AnonymousClass0449 UNKNOWN;
    public static final AnonymousClass0449 UPDATE_BUNDLE_SELECTION_CTA;
    public static final AnonymousClass0449 UPDATE_BUNDLE_SELECTION_EVENT;
    public static final AnonymousClass0449 UPDATE_INSURANCE_DATA;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0449> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0449 anonymousClass0449 = new AnonymousClass0449("UNKNOWN", 0, "ecUnknown");
        UNKNOWN = anonymousClass0449;
        AnonymousClass0449 anonymousClass04492 = new AnonymousClass0449("HALF_SCREEN_SCROLL", 1, "ecPdpHalfScreenScroll");
        HALF_SCREEN_SCROLL = anonymousClass04492;
        AnonymousClass0449 anonymousClass04493 = new AnonymousClass0449("SWITCH_SKU", 2, "ecSwitchSku");
        SWITCH_SKU = anonymousClass04493;
        AnonymousClass0449 anonymousClass04494 = new AnonymousClass0449("CHANGE_SKU_QUANTITY", 3, "ecChangeSkuQuantity");
        CHANGE_SKU_QUANTITY = anonymousClass04494;
        AnonymousClass0449 anonymousClass04495 = new AnonymousClass0449("OPEN_COUPON_DETAILS", 4, "ecOpenCouponDetails");
        OPEN_COUPON_DETAILS = anonymousClass04495;
        AnonymousClass0449 anonymousClass04496 = new AnonymousClass0449("FAVORITE_ACTION", 5, "ecFavoriteAction");
        FAVORITE_ACTION = anonymousClass04496;
        AnonymousClass0449 anonymousClass04497 = new AnonymousClass0449("SHARE_ACTION", 6, "ecShareAction");
        SHARE_ACTION = anonymousClass04497;
        AnonymousClass0449 anonymousClass04498 = new AnonymousClass0449("GET_SHOP_SCHEMA", 7, "ecGetShopSchema");
        GET_SHOP_SCHEMA = anonymousClass04498;
        AnonymousClass0449 anonymousClass04499 = new AnonymousClass0449("CHANGE_PURCHASE_METHOD", 8, "ecChangePurchaseMethod");
        CHANGE_PURCHASE_METHOD = anonymousClass04499;
        AnonymousClass0449 anonymousClass044910 = new AnonymousClass0449("PICTURE_IN_PICTURE_ACTION", 9, "ecPictureInPictureAction");
        PICTURE_IN_PICTURE_ACTION = anonymousClass044910;
        AnonymousClass0449 anonymousClass044911 = new AnonymousClass0449("UPDATE_BUNDLE_SELECTION_EVENT", 10, "ecBundleSelectionDataUpdated");
        UPDATE_BUNDLE_SELECTION_EVENT = anonymousClass044911;
        AnonymousClass0449 anonymousClass044912 = new AnonymousClass0449("UPDATE_BUNDLE_SELECTION_CTA", 11, "ecBundleSelectionPanelCTA");
        UPDATE_BUNDLE_SELECTION_CTA = anonymousClass044912;
        AnonymousClass0449 anonymousClass044913 = new AnonymousClass0449("UPDATE_INSURANCE_DATA", 12, "ecUpdateInsuranceData");
        UPDATE_INSURANCE_DATA = anonymousClass044913;
        AnonymousClass0449[] anonymousClass0449Arr = {anonymousClass0449, anonymousClass04492, anonymousClass04493, anonymousClass04494, anonymousClass04495, anonymousClass04496, anonymousClass04497, anonymousClass04498, anonymousClass04499, anonymousClass044910, anonymousClass044911, anonymousClass044912, anonymousClass044913};
        LLILLJJLI = anonymousClass0449Arr;
        LLILLL = new C2254308sP(anonymousClass0449Arr);
    }

    public static AnonymousClass0449[] values() {
        return (AnonymousClass0449[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static AnonymousClass0449 valueOf(String str) {
        return (AnonymousClass0449) C08FF.LIZ(AnonymousClass0449.class, str);
    }

    public AnonymousClass0449(String str, int i, String str2) {
        this.LL = str2;
    }
}
