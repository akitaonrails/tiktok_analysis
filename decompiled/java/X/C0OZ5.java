package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OZ5 {
    public static final C0OZ5 EMPTY_RESULT;
    public static final C0OZ5 ERROR;
    public static final /* synthetic */ C0OZ5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OZ5 LOADING;
    public static final C0OZ5 SUCCESS;

    public static InterfaceC2044707zh<C0OZ5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OZ5 c0oz5 = new C0OZ5("LOADING", 0);
        LOADING = c0oz5;
        C0OZ5 c0oz52 = new C0OZ5("SUCCESS", 1);
        SUCCESS = c0oz52;
        C0OZ5 c0oz53 = new C0OZ5("EMPTY_RESULT", 2);
        EMPTY_RESULT = c0oz53;
        C0OZ5 c0oz54 = new C0OZ5("ERROR", 3);
        ERROR = c0oz54;
        C0OZ5[] c0oz5Arr = {c0oz5, c0oz52, c0oz53, c0oz54};
        LL = c0oz5Arr;
        LLILLJJLI = new C2254308sP(c0oz5Arr);
    }

    public static C0OZ5[] values() {
        return (C0OZ5[]) LL.clone();
    }

    public static C0OZ5 valueOf(String str) {
        return (C0OZ5) C08FF.LIZ(C0OZ5.class, str);
    }

    public C0OZ5(String str, int i) {
    }
}
