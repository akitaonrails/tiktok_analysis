package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZL9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZL9 {
    public static final C0ZL9 BANNER_DISMISS;
    public static final C0ZL9 KEYWORD_AND_BANNER_DISMISS;
    public static final C0ZL9 KEYWORD_DISMISS;
    public static final /* synthetic */ C0ZL9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZL9 NONE;

    public static InterfaceC2044707zh<C0ZL9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZL9 c0zl9 = new C0ZL9("NONE", 0);
        NONE = c0zl9;
        C0ZL9 c0zl92 = new C0ZL9("KEYWORD_DISMISS", 1);
        KEYWORD_DISMISS = c0zl92;
        C0ZL9 c0zl93 = new C0ZL9("BANNER_DISMISS", 2);
        BANNER_DISMISS = c0zl93;
        C0ZL9 c0zl94 = new C0ZL9("KEYWORD_AND_BANNER_DISMISS", 3);
        KEYWORD_AND_BANNER_DISMISS = c0zl94;
        C0ZL9[] c0zl9Arr = {c0zl9, c0zl92, c0zl93, c0zl94};
        LL = c0zl9Arr;
        LLILLJJLI = new C2254308sP(c0zl9Arr);
    }

    public static C0ZL9[] values() {
        return (C0ZL9[]) LL.clone();
    }

    public static C0ZL9 valueOf(String str) {
        return (C0ZL9) C08FF.LIZ(C0ZL9.class, str);
    }

    public C0ZL9(String str, int i) {
    }
}
