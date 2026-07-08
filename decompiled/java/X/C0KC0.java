package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KC0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KC0 {
    public static final C0KC0 ABNORMAL;
    public static final C0KC0 EMPTY;
    public static final C0KC0 ERROR;
    public static final /* synthetic */ C0KC0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KC0 LOADING;
    public final String LL;

    public static InterfaceC2044707zh<C0KC0> getEntries() {
        return LLILLL;
    }

    static {
        C0KC0 c0kc0 = new C0KC0("LOADING", 0, "loading");
        LOADING = c0kc0;
        C0KC0 c0kc02 = new C0KC0("EMPTY", 1, "empty");
        EMPTY = c0kc02;
        C0KC0 c0kc03 = new C0KC0("ERROR", 2, "error");
        ERROR = c0kc03;
        C0KC0 c0kc04 = new C0KC0("ABNORMAL", 3, "abnormal");
        ABNORMAL = c0kc04;
        C0KC0[] c0kc0Arr = {c0kc0, c0kc02, c0kc03, c0kc04};
        LLILLJJLI = c0kc0Arr;
        LLILLL = new C2254308sP(c0kc0Arr);
    }

    public static C0KC0[] values() {
        return (C0KC0[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0KC0 valueOf(String str) {
        return (C0KC0) C08FF.LIZ(C0KC0.class, str);
    }

    public C0KC0(String str, int i, String str2) {
        this.LL = str2;
    }
}
