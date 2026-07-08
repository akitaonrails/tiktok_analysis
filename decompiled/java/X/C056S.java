package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056S {
    public static final C056S CREATOR_PRIOR;
    public static final /* synthetic */ C056S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C056S PINNED_SKU_ORDER;
    public final String LL;

    public static InterfaceC2044707zh<C056S> getEntries() {
        return LLILLL;
    }

    static {
        C056S c056s = new C056S("CREATOR_PRIOR", 0, "creator_prior");
        CREATOR_PRIOR = c056s;
        C056S c056s2 = new C056S("PINNED_SKU_ORDER", 1, "pinned_sku_order");
        PINNED_SKU_ORDER = c056s2;
        C056S[] c056sArr = {c056s, c056s2};
        LLILLJJLI = c056sArr;
        LLILLL = new C2254308sP(c056sArr);
    }

    public static C056S[] values() {
        return (C056S[]) LLILLJJLI.clone();
    }

    public final String getTrackingValue() {
        return this.LL;
    }

    public static C056S valueOf(String str) {
        return (C056S) C08FF.LIZ(C056S.class, str);
    }

    public C056S(String str, int i, String str2) {
        this.LL = str2;
    }
}
