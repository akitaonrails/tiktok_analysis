package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NL6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NL6 {
    public static final C0NL7 Companion;
    public static final C0NL6 EXISTING_COUPON_REMINDER_SCENE;
    public static final C0NL6 FREE_SHIPPING_ADD_ON_REMINDER_SCENE;
    public static final C0NL6 INVALID;
    public static final /* synthetic */ C0NL6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NL6 MANUAL_CLAIM_QCPX_COUPON_SCENE;
    public static final C0NL6 NEW_CUSTOMER_OFFER;
    public static final C0NL6 PDP_REFRESH;
    public static final C0NL6 PRE_CART_INFO;
    public static final C0NL6 PRE_SCENE_AUTO_CLAIMED_POPUP_SCENE;
    public static final C0NL6 PROMOTION_TRIGGER_POPUP_SCENE;
    public static final C0NL6 REWARDS_PROGRAM_LYNX_SCENE;
    public static final C0NL6 REWARDS_PROGRAM_SCENE;
    public static final C0NL6 USER_SURVEY;
    public static final C0NL6 US_MEMBERSHIP;
    public final int LL;

    public static InterfaceC2044707zh<C0NL6> getEntries() {
        return LLILLL;
    }

    static {
        C0NL6 c0nl6 = new C0NL6("INVALID", 0, 0);
        INVALID = c0nl6;
        C0NL6 c0nl62 = new C0NL6("FREE_SHIPPING_ADD_ON_REMINDER_SCENE", 1, 1);
        FREE_SHIPPING_ADD_ON_REMINDER_SCENE = c0nl62;
        C0NL6 c0nl63 = new C0NL6("REWARDS_PROGRAM_SCENE", 2, 3);
        REWARDS_PROGRAM_SCENE = c0nl63;
        C0NL6 c0nl64 = new C0NL6("REWARDS_PROGRAM_LYNX_SCENE", 3, 4);
        REWARDS_PROGRAM_LYNX_SCENE = c0nl64;
        C0NL6 c0nl65 = new C0NL6("EXISTING_COUPON_REMINDER_SCENE", 4, 5);
        EXISTING_COUPON_REMINDER_SCENE = c0nl65;
        C0NL6 c0nl66 = new C0NL6("PRE_CART_INFO", 5, 7);
        PRE_CART_INFO = c0nl66;
        C0NL6 c0nl67 = new C0NL6("PDP_REFRESH", 6, 8);
        PDP_REFRESH = c0nl67;
        C0NL6 c0nl68 = new C0NL6("PROMOTION_TRIGGER_POPUP_SCENE", 7, 9);
        PROMOTION_TRIGGER_POPUP_SCENE = c0nl68;
        C0NL6 c0nl69 = new C0NL6("MANUAL_CLAIM_QCPX_COUPON_SCENE", 8, 10);
        MANUAL_CLAIM_QCPX_COUPON_SCENE = c0nl69;
        C0NL6 c0nl610 = new C0NL6("PRE_SCENE_AUTO_CLAIMED_POPUP_SCENE", 9, 11);
        PRE_SCENE_AUTO_CLAIMED_POPUP_SCENE = c0nl610;
        C0NL6 c0nl611 = new C0NL6("NEW_CUSTOMER_OFFER", 10, 12);
        NEW_CUSTOMER_OFFER = c0nl611;
        C0NL6 c0nl612 = new C0NL6("USER_SURVEY", 11, 13);
        USER_SURVEY = c0nl612;
        C0NL6 c0nl613 = new C0NL6("US_MEMBERSHIP", 12, 14);
        US_MEMBERSHIP = c0nl613;
        C0NL6[] c0nl6Arr = {c0nl6, c0nl62, c0nl63, c0nl64, c0nl65, c0nl66, c0nl67, c0nl68, c0nl69, c0nl610, c0nl611, c0nl612, c0nl613};
        LLILLJJLI = c0nl6Arr;
        LLILLL = new C2254308sP(c0nl6Arr);
        Companion = new C0NL7();
    }

    public static C0NL6[] values() {
        return (C0NL6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0NL6 valueOf(String str) {
        return (C0NL6) C08FF.LIZ(C0NL6.class, str);
    }

    public C0NL6(String str, int i, int i2) {
        this.LL = i2;
    }
}
