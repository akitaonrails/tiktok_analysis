package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NJK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJK {
    public static final C0NJK CACHE_AVAILABLE;
    public static final C0NJK COMPLETE;
    public static final /* synthetic */ C0NJK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NJK LOADING;
    public static final C0NJK UNINITIALIZED;

    public static InterfaceC2044707zh<C0NJK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NJK c0njk = new C0NJK("UNINITIALIZED", 0);
        UNINITIALIZED = c0njk;
        C0NJK c0njk2 = new C0NJK("LOADING", 1);
        LOADING = c0njk2;
        C0NJK c0njk3 = new C0NJK("CACHE_AVAILABLE", 2);
        CACHE_AVAILABLE = c0njk3;
        C0NJK c0njk4 = new C0NJK("COMPLETE", 3);
        COMPLETE = c0njk4;
        C0NJK[] c0njkArr = {c0njk, c0njk2, c0njk3, c0njk4};
        LL = c0njkArr;
        LLILLJJLI = new C2254308sP(c0njkArr);
    }

    public static C0NJK[] values() {
        return (C0NJK[]) LL.clone();
    }

    public static C0NJK valueOf(String str) {
        return (C0NJK) C08FF.LIZ(C0NJK.class, str);
    }

    public C0NJK(String str, int i) {
    }
}
