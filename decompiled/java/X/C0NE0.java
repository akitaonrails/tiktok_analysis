package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NE0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NE0 {
    public static final C0NE0 COLD_CACHE_AIDS;
    public static final C0NE0 CUR_UID_ALL_AIDS;
    public static final C0NE0 ELIMINATE_AIDS;
    public static final C0NE0 FOR_OTHER_AIDS;
    public static final /* synthetic */ C0NE0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NE0 UNCONSUMED_CACHE_AIDS;

    public static InterfaceC2044707zh<C0NE0> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NE0 c0ne0 = new C0NE0("CUR_UID_ALL_AIDS", 0);
        CUR_UID_ALL_AIDS = c0ne0;
        C0NE0 c0ne02 = new C0NE0("FOR_OTHER_AIDS", 1);
        FOR_OTHER_AIDS = c0ne02;
        C0NE0 c0ne03 = new C0NE0("COLD_CACHE_AIDS", 2);
        COLD_CACHE_AIDS = c0ne03;
        C0NE0 c0ne04 = new C0NE0("UNCONSUMED_CACHE_AIDS", 3);
        UNCONSUMED_CACHE_AIDS = c0ne04;
        C0NE0 c0ne05 = new C0NE0("ELIMINATE_AIDS", 4);
        ELIMINATE_AIDS = c0ne05;
        C0NE0[] c0ne0Arr = {c0ne0, c0ne02, c0ne03, c0ne04, c0ne05};
        LL = c0ne0Arr;
        LLILLJJLI = new C2254308sP(c0ne0Arr);
    }

    public static C0NE0[] values() {
        return (C0NE0[]) LL.clone();
    }

    public static C0NE0 valueOf(String str) {
        return (C0NE0) C08FF.LIZ(C0NE0.class, str);
    }

    public C0NE0(String str, int i) {
    }
}
