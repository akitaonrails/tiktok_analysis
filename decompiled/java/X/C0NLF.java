package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NLF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NLF {
    public static final C0NLF ALGORITHMIC_COUPON;
    public static final C592240NKs Companion;
    public static final C0NLF EXISTING_COUPON_REMINDER;
    public static final C0NLF FREE_SHIPPING_ADDON_REMINDER;
    public static final C0NLF INVALID;
    public static final /* synthetic */ C0NLF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NLF MANUAL_CLAIM_QCPX_COUPON_REMINDER;
    public static final C0NLF OVERSEAS_SHIPPING_REMINDER;
    public static final C0NLF POPUPTYPE_AUTHENTICITY_PROTECTION;
    public static final C0NLF POPUPTYPE_NEW_CUSTOMER_OFFER;
    public static final C0NLF POPUP_TYPE_INSURANCE_SHEET;
    public static final C0NLF PRE_SCENE_AUTO_CLAIMED_POPUP;
    public static final C0NLF PRODUCT_SPECIFICATIONS;
    public static final C0NLF PROMOTION_TRIGGER_POPUP;
    public static final C0NLF REVIEW_BOTTOM_MYNA_BANNER;
    public static final C0NLF REWARDS_PROGRAM;
    public static final C0NLF SURPRISE_COUPON;
    public static final C0NLF USER_SURVEY;
    public static final C0NLF US_MEMBERSHIP;
    public final int LL;

    public static InterfaceC2044707zh<C0NLF> getEntries() {
        return LLILLL;
    }

    static {
        C0NLF c0nlf = new C0NLF("INVALID", 0, 0);
        INVALID = c0nlf;
        C0NLF c0nlf2 = new C0NLF("ALGORITHMIC_COUPON", 1, 1);
        ALGORITHMIC_COUPON = c0nlf2;
        C0NLF c0nlf3 = new C0NLF("FREE_SHIPPING_ADDON_REMINDER", 2, 2);
        FREE_SHIPPING_ADDON_REMINDER = c0nlf3;
        C0NLF c0nlf4 = new C0NLF("REWARDS_PROGRAM", 3, 4);
        REWARDS_PROGRAM = c0nlf4;
        C0NLF c0nlf5 = new C0NLF("EXISTING_COUPON_REMINDER", 4, 5);
        EXISTING_COUPON_REMINDER = c0nlf5;
        C0NLF c0nlf6 = new C0NLF("POPUPTYPE_AUTHENTICITY_PROTECTION", 5, 6);
        POPUPTYPE_AUTHENTICITY_PROTECTION = c0nlf6;
        C0NLF c0nlf7 = new C0NLF("PROMOTION_TRIGGER_POPUP", 6, 7);
        PROMOTION_TRIGGER_POPUP = c0nlf7;
        C0NLF c0nlf8 = new C0NLF("MANUAL_CLAIM_QCPX_COUPON_REMINDER", 7, 8);
        MANUAL_CLAIM_QCPX_COUPON_REMINDER = c0nlf8;
        C0NLF c0nlf9 = new C0NLF("PRE_SCENE_AUTO_CLAIMED_POPUP", 8, 9);
        PRE_SCENE_AUTO_CLAIMED_POPUP = c0nlf9;
        C0NLF c0nlf10 = new C0NLF("POPUPTYPE_NEW_CUSTOMER_OFFER", 9, 10);
        POPUPTYPE_NEW_CUSTOMER_OFFER = c0nlf10;
        C0NLF c0nlf11 = new C0NLF("POPUP_TYPE_INSURANCE_SHEET", 10, 11);
        POPUP_TYPE_INSURANCE_SHEET = c0nlf11;
        C0NLF c0nlf12 = new C0NLF("PRODUCT_SPECIFICATIONS", 11, 12);
        PRODUCT_SPECIFICATIONS = c0nlf12;
        C0NLF c0nlf13 = new C0NLF("SURPRISE_COUPON", 12, 13);
        SURPRISE_COUPON = c0nlf13;
        C0NLF c0nlf14 = new C0NLF("REVIEW_BOTTOM_MYNA_BANNER", 13, 14);
        REVIEW_BOTTOM_MYNA_BANNER = c0nlf14;
        C0NLF c0nlf15 = new C0NLF("OVERSEAS_SHIPPING_REMINDER", 14, 15);
        OVERSEAS_SHIPPING_REMINDER = c0nlf15;
        C0NLF c0nlf16 = new C0NLF("USER_SURVEY", 15, 16);
        USER_SURVEY = c0nlf16;
        C0NLF c0nlf17 = new C0NLF("US_MEMBERSHIP", 16, 17);
        US_MEMBERSHIP = c0nlf17;
        C0NLF[] c0nlfArr = {c0nlf, c0nlf2, c0nlf3, c0nlf4, c0nlf5, c0nlf6, c0nlf7, c0nlf8, c0nlf9, c0nlf10, c0nlf11, c0nlf12, c0nlf13, c0nlf14, c0nlf15, c0nlf16, c0nlf17};
        LLILLJJLI = c0nlfArr;
        LLILLL = new C2254308sP(c0nlfArr);
        Companion = new C592240NKs();
    }

    public static C0NLF[] values() {
        return (C0NLF[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0NLF valueOf(String str) {
        return (C0NLF) C08FF.LIZ(C0NLF.class, str);
    }

    public C0NLF(String str, int i, int i2) {
        this.LL = i2;
    }
}
