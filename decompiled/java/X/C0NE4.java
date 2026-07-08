package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NE4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NE4 {
    public static final C0NE4 COLD_CACHE_DB;
    public static final C0NE4 GOLDEN_CACHE;
    public static final /* synthetic */ C0NE4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NE4 UNCONSUMED_CACHE;

    public static InterfaceC2044707zh<C0NE4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NE4 c0ne4 = new C0NE4("COLD_CACHE_DB", 0);
        COLD_CACHE_DB = c0ne4;
        C0NE4 c0ne42 = new C0NE4("UNCONSUMED_CACHE", 1);
        UNCONSUMED_CACHE = c0ne42;
        C0NE4 c0ne43 = new C0NE4("GOLDEN_CACHE", 2);
        GOLDEN_CACHE = c0ne43;
        C0NE4[] c0ne4Arr = {c0ne4, c0ne42, c0ne43};
        LL = c0ne4Arr;
        LLILLJJLI = new C2254308sP(c0ne4Arr);
    }

    public static C0NE4[] values() {
        return (C0NE4[]) LL.clone();
    }

    public static C0NE4 valueOf(String str) {
        return (C0NE4) C08FF.LIZ(C0NE4.class, str);
    }

    public C0NE4(String str, int i) {
    }
}
