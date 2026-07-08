package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.046U, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C046U {
    public static final C046U AUTHORIZED;
    public static final C046U BLUE_V;
    public static final /* synthetic */ C046U[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C046U MALL;
    public static final C046U NONE;
    public static final C046U OFFICIAL;
    public static final C046U STAR_SHOP;
    public static final C046U TOP_BRAND;
    public static final C046U TOP_CHOICE;
    public final int LL;

    public static InterfaceC2044707zh<C046U> getEntries() {
        return LLILLL;
    }

    static {
        C046U c046u = new C046U("NONE", 0, 0);
        NONE = c046u;
        C046U c046u2 = new C046U("OFFICIAL", 1, 1);
        OFFICIAL = c046u2;
        C046U c046u3 = new C046U("AUTHORIZED", 2, 2);
        AUTHORIZED = c046u3;
        C046U c046u4 = new C046U("BLUE_V", 3, 3);
        BLUE_V = c046u4;
        C046U c046u5 = new C046U("TOP_CHOICE", 4, 4);
        TOP_CHOICE = c046u5;
        C046U c046u6 = new C046U("MALL", 5, 5);
        MALL = c046u6;
        C046U c046u7 = new C046U("TOP_BRAND", 6, 6);
        TOP_BRAND = c046u7;
        C046U c046u8 = new C046U("STAR_SHOP", 7, 7);
        STAR_SHOP = c046u8;
        C046U[] c046uArr = {c046u, c046u2, c046u3, c046u4, c046u5, c046u6, c046u7, c046u8};
        LLILLJJLI = c046uArr;
        LLILLL = new C2254308sP(c046uArr);
    }

    public static C046U[] values() {
        return (C046U[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C046U valueOf(String str) {
        return (C046U) C08FF.LIZ(C046U.class, str);
    }

    public C046U(String str, int i, int i2) {
        this.LL = i2;
    }
}
