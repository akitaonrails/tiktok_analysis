package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.049E, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C049E {
    public static final C049E AUTHENTICITY_PROTECTION;
    public static final C049E BEST_SELLER;
    public static final /* synthetic */ C049E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C049E PRODUCT_TRUST;
    public final int LL;

    public static InterfaceC2044707zh<C049E> getEntries() {
        return LLILLL;
    }

    static {
        C049E c049e = new C049E("BEST_SELLER", 0, 1);
        BEST_SELLER = c049e;
        C049E c049e2 = new C049E("PRODUCT_TRUST", 1, 2);
        PRODUCT_TRUST = c049e2;
        C049E c049e3 = new C049E("AUTHENTICITY_PROTECTION", 2, 3);
        AUTHENTICITY_PROTECTION = c049e3;
        C049E[] c049eArr = {c049e, c049e2, c049e3};
        LLILLJJLI = c049eArr;
        LLILLL = new C2254308sP(c049eArr);
    }

    public static C049E[] values() {
        return (C049E[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C049E valueOf(String str) {
        return (C049E) C08FF.LIZ(C049E.class, str);
    }

    public C049E(String str, int i, int i2) {
        this.LL = i2;
    }
}
