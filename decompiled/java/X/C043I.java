package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.043I, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043I {
    public static final C043I ADD_TO_CART;
    public static final C043I BACK_TO_LIVE;
    public static final C043I BUY;
    public static final C043I CART;
    public static final C043I CHANGE_SKU_ITEM;
    public static final C043I CHECKOUT;
    public static final C043I CONFIRM_SELECTION;
    public static final C043I FAVORITE;
    public static final C043I FIND_SIMILAR;
    public static final /* synthetic */ C043I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C043I ORDER_SUBMIT_ADDON;
    public static final C043I REPORT;
    public static final C043I SCHEMA;
    public static final C043I SET_UP_SUBSCRIBE;
    public static final C043I SUBSCRIPTION_ADD_TO_CART;
    public static final C043I UPDATE_ADDRESS;
    public final int LL;

    public static InterfaceC2044707zh<C043I> getEntries() {
        return LLILLL;
    }

    static {
        C043I c043i = new C043I("CART", 0, 2);
        CART = c043i;
        C043I c043i2 = new C043I("REPORT", 1, 3);
        REPORT = c043i2;
        C043I c043i3 = new C043I("ADD_TO_CART", 2, 4);
        ADD_TO_CART = c043i3;
        C043I c043i4 = new C043I("BUY", 3, 5);
        BUY = c043i4;
        C043I c043i5 = new C043I("SCHEMA", 4, 6);
        SCHEMA = c043i5;
        C043I c043i6 = new C043I("CHECKOUT", 5, 7);
        CHECKOUT = c043i6;
        C043I c043i7 = new C043I("UPDATE_ADDRESS", 6, 8);
        UPDATE_ADDRESS = c043i7;
        C043I c043i8 = new C043I("FIND_SIMILAR", 7, 9);
        FIND_SIMILAR = c043i8;
        C043I c043i9 = new C043I("CHANGE_SKU_ITEM", 8, 11);
        CHANGE_SKU_ITEM = c043i9;
        C043I c043i10 = new C043I("FAVORITE", 9, 12);
        FAVORITE = c043i10;
        C043I c043i11 = new C043I("ORDER_SUBMIT_ADDON", 10, 14);
        ORDER_SUBMIT_ADDON = c043i11;
        C043I c043i12 = new C043I("SET_UP_SUBSCRIBE", 11, 15);
        SET_UP_SUBSCRIBE = c043i12;
        C043I c043i13 = new C043I("BACK_TO_LIVE", 12, 16);
        BACK_TO_LIVE = c043i13;
        C043I c043i14 = new C043I("SUBSCRIPTION_ADD_TO_CART", 13, 17);
        SUBSCRIPTION_ADD_TO_CART = c043i14;
        C043I c043i15 = new C043I("CONFIRM_SELECTION", 14, 18);
        CONFIRM_SELECTION = c043i15;
        C043I[] c043iArr = {c043i, c043i2, c043i3, c043i4, c043i5, c043i6, c043i7, c043i8, c043i9, c043i10, c043i11, c043i12, c043i13, c043i14, c043i15};
        LLILLJJLI = c043iArr;
        LLILLL = new C2254308sP(c043iArr);
    }

    public static C043I[] values() {
        return (C043I[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C043I valueOf(String str) {
        return (C043I) C08FF.LIZ(C043I.class, str);
    }

    public C043I(String str, int i, int i2) {
        this.LL = i2;
    }
}
