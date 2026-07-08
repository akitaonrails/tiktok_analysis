package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OR6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OR6 {
    public static final C0OR6 ERROR_CODE_NO_COPYRIGHT;
    public static final C0OR6 ERROR_CODE_UNKNOWN;
    public static final /* synthetic */ C0OR6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0OR6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OR6 c0or6 = new C0OR6("ERROR_CODE_UNKNOWN", 0);
        ERROR_CODE_UNKNOWN = c0or6;
        C0OR6 c0or62 = new C0OR6("ERROR_CODE_NO_COPYRIGHT", 1);
        ERROR_CODE_NO_COPYRIGHT = c0or62;
        C0OR6[] c0or6Arr = {c0or6, c0or62};
        LL = c0or6Arr;
        LLILLJJLI = new C2254308sP(c0or6Arr);
    }

    public static C0OR6[] values() {
        return (C0OR6[]) LL.clone();
    }

    public static C0OR6 valueOf(String str) {
        return (C0OR6) C08FF.LIZ(C0OR6.class, str);
    }

    public C0OR6(String str, int i) {
    }
}
