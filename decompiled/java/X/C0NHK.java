package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NHK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NHK {
    public static final C0NHK CACHE_AVAILABLE;
    public static final C0NHK DISABLED;
    public static final C0NHK INIT_DONE;
    public static final /* synthetic */ C0NHK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NHK LOADING;
    public static final C0NHK UNINITIALIZED;

    public static InterfaceC2044707zh<C0NHK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NHK c0nhk = new C0NHK("UNINITIALIZED", 0);
        UNINITIALIZED = c0nhk;
        C0NHK c0nhk2 = new C0NHK("LOADING", 1);
        LOADING = c0nhk2;
        C0NHK c0nhk3 = new C0NHK("CACHE_AVAILABLE", 2);
        CACHE_AVAILABLE = c0nhk3;
        C0NHK c0nhk4 = new C0NHK("INIT_DONE", 3);
        INIT_DONE = c0nhk4;
        C0NHK c0nhk5 = new C0NHK("DISABLED", 4);
        DISABLED = c0nhk5;
        C0NHK[] c0nhkArr = {c0nhk, c0nhk2, c0nhk3, c0nhk4, c0nhk5};
        LL = c0nhkArr;
        LLILLJJLI = new C2254308sP(c0nhkArr);
    }

    public static C0NHK[] values() {
        return (C0NHK[]) LL.clone();
    }

    public static C0NHK valueOf(String str) {
        return (C0NHK) C08FF.LIZ(C0NHK.class, str);
    }

    public C0NHK(String str, int i) {
    }
}
