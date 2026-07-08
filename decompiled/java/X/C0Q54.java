package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q54, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q54 implements C0Q0Q {
    public static final C0Q54 COMMON;
    public static final /* synthetic */ C0Q54[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0Q54 PERFORMANCE;
    public final String LL;
    public final String LLILLJJLI;

    public C0Q54() {
        throw null;
    }

    public static InterfaceC2044707zh<C0Q54> getEntries() {
        return LLILZ;
    }

    static {
        C0Q54 c0q54 = new C0Q54("COMMON", 0, "common");
        COMMON = c0q54;
        C0Q54 c0q542 = new C0Q54("PERFORMANCE", 1, "performance");
        PERFORMANCE = c0q542;
        C0Q54[] c0q54Arr = {c0q54, c0q542};
        LLILLL = c0q54Arr;
        LLILZ = new C2254308sP(c0q54Arr);
    }

    public static C0Q54[] values() {
        return (C0Q54[]) LLILLL.clone();
    }

    @Override // X.InterfaceC664500Q4q
    public String getCatalog() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC664500Q4q
    public String getSubcategory() {
        return this.LL;
    }

    public static C0Q54 valueOf(String str) {
        return (C0Q54) C08FF.LIZ(C0Q54.class, str);
    }

    public C0Q54(String str, int i, String str2) {
        this.LL = str2;
        this.LLILLJJLI = "EVENT_LOG";
    }
}
