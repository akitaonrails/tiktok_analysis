package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5C {
    public static final C0N5C DEFAULT_C_CODE;
    public static final /* synthetic */ C0N5C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N5C PROFILE_PRODUCT_COLLECTION_TAB;
    public static final C0N5C PROFILE_SHOP_TAB;
    public static final C0N5C PROFILE_SHOW_CASE_TAB;
    public static final C0N5C TOP_MALL_LEFT_LIVE_ICON;
    public static final C0N5C TOP_MALL_RIGHT_SHOP_CAR;
    public final String LL;

    public static InterfaceC2044707zh<C0N5C> getEntries() {
        return LLILLL;
    }

    static {
        C0N5C c0n5c = new C0N5C("DEFAULT_C_CODE", 0, "c0");
        DEFAULT_C_CODE = c0n5c;
        C0N5C c0n5c2 = new C0N5C("PROFILE_PRODUCT_COLLECTION_TAB", 1, "c1746");
        PROFILE_PRODUCT_COLLECTION_TAB = c0n5c2;
        C0N5C c0n5c3 = new C0N5C("PROFILE_SHOP_TAB", 2, "c9203");
        PROFILE_SHOP_TAB = c0n5c3;
        C0N5C c0n5c4 = new C0N5C("PROFILE_SHOW_CASE_TAB", 3, "c8467");
        PROFILE_SHOW_CASE_TAB = c0n5c4;
        C0N5C c0n5c5 = new C0N5C("TOP_MALL_LEFT_LIVE_ICON", 4, "c8203");
        TOP_MALL_LEFT_LIVE_ICON = c0n5c5;
        C0N5C c0n5c6 = new C0N5C("TOP_MALL_RIGHT_SHOP_CAR", 5, "c1773");
        TOP_MALL_RIGHT_SHOP_CAR = c0n5c6;
        C0N5C[] c0n5cArr = {c0n5c, c0n5c2, c0n5c3, c0n5c4, c0n5c5, c0n5c6};
        LLILLJJLI = c0n5cArr;
        LLILLL = new C2254308sP(c0n5cArr);
    }

    public static C0N5C[] values() {
        return (C0N5C[]) LLILLJJLI.clone();
    }

    public final String getCCode() {
        return this.LL;
    }

    public static C0N5C valueOf(String str) {
        return (C0N5C) C08FF.LIZ(C0N5C.class, str);
    }

    public C0N5C(String str, int i, String str2) {
        this.LL = str2;
    }
}
