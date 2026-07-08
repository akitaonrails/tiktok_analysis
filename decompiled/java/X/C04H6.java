package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04H6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04H6 {
    public static final C04H6 ADD_TO_CART;
    public static final C04H6 CHECK_POPUP;
    public static final C04H6 CLAIM_COUPON;
    public static final C04H6 CLOSE_POP_UP;
    public static final C04H6 FOLLOW_CLAIM_COUPON;
    public static final /* synthetic */ C04H6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C04H6 OPEN_COUPON_PAGE;
    public static final C04H6 OPEN_DIALOG;
    public static final C04H6 OPEN_SCHEMA;
    public static final C04H6 OPEN_SKU;
    public static final C04H6 SHOW_LYNX_SHEET;
    public static final C04H6 SHOW_POP_UP;
    public static final C04H6 UPGRADE_COUPON;
    public final int LL;

    public static InterfaceC2044707zh<C04H6> getEntries() {
        return LLILLL;
    }

    static {
        C04H6 c04h6 = new C04H6("SHOW_POP_UP", 0, 1);
        SHOW_POP_UP = c04h6;
        C04H6 c04h62 = new C04H6("CLOSE_POP_UP", 1, 2);
        CLOSE_POP_UP = c04h62;
        C04H6 c04h63 = new C04H6("CLAIM_COUPON", 2, 3);
        CLAIM_COUPON = c04h63;
        C04H6 c04h64 = new C04H6("UPGRADE_COUPON", 3, 4);
        UPGRADE_COUPON = c04h64;
        C04H6 c04h65 = new C04H6("ADD_TO_CART", 4, 5);
        ADD_TO_CART = c04h65;
        C04H6 c04h66 = new C04H6("SHOW_LYNX_SHEET", 5, 7);
        SHOW_LYNX_SHEET = c04h66;
        C04H6 c04h67 = new C04H6("OPEN_SCHEMA", 6, 8);
        OPEN_SCHEMA = c04h67;
        C04H6 c04h68 = new C04H6("OPEN_COUPON_PAGE", 7, 9);
        OPEN_COUPON_PAGE = c04h68;
        C04H6 c04h69 = new C04H6("OPEN_DIALOG", 8, 10);
        OPEN_DIALOG = c04h69;
        C04H6 c04h610 = new C04H6("OPEN_SKU", 9, 11);
        OPEN_SKU = c04h610;
        C04H6 c04h611 = new C04H6("CHECK_POPUP", 10, 12);
        CHECK_POPUP = c04h611;
        C04H6 c04h612 = new C04H6("FOLLOW_CLAIM_COUPON", 11, 18);
        FOLLOW_CLAIM_COUPON = c04h612;
        C04H6[] c04h6Arr = {c04h6, c04h62, c04h63, c04h64, c04h65, c04h66, c04h67, c04h68, c04h69, c04h610, c04h611, c04h612};
        LLILLJJLI = c04h6Arr;
        LLILLL = new C2254308sP(c04h6Arr);
    }

    public static C04H6[] values() {
        return (C04H6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C04H6 valueOf(String str) {
        return (C04H6) C08FF.LIZ(C04H6.class, str);
    }

    public C04H6(String str, int i, int i2) {
        this.LL = i2;
    }
}
