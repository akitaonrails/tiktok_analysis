package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q45, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q45 implements InterfaceC654480Plm {
    public static final C0Q45 COMMON;
    public static final /* synthetic */ C0Q45[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0Q45 MOB;
    public final String LL;
    public final String LLILLJJLI;

    public C0Q45() {
        throw null;
    }

    public static InterfaceC2044707zh<C0Q45> getEntries() {
        return LLILZ;
    }

    static {
        C0Q45 c0q45 = new C0Q45("COMMON", 0, "common");
        COMMON = c0q45;
        C0Q45 c0q452 = new C0Q45("MOB", 1, "mob");
        MOB = c0q452;
        C0Q45[] c0q45Arr = {c0q45, c0q452};
        LLILLL = c0q45Arr;
        LLILZ = new C2254308sP(c0q45Arr);
    }

    public static C0Q45[] values() {
        return (C0Q45[]) LLILLL.clone();
    }

    @Override // X.InterfaceC664500Q4q
    public String getCatalog() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC664500Q4q
    public String getSubcategory() {
        return this.LL;
    }

    public static C0Q45 valueOf(String str) {
        return (C0Q45) C08FF.LIZ(C0Q45.class, str);
    }

    public C0Q45(String str, int i, String str2) {
        this.LL = str2;
        this.LLILLJJLI = "common";
    }
}
