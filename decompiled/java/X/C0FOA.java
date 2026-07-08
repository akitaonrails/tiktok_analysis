package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FOA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOA {
    public static final C0FOA IDEL;
    public static final /* synthetic */ C0FOA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FOA LOADING;
    public static final C0FOA LOAD_FAILED;
    public static final C0FOA LOAD_SUCCESS;
    public static final C0FOA SELECTED;

    public static InterfaceC2044707zh<C0FOA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FOA c0foa = new C0FOA("IDEL", 0);
        IDEL = c0foa;
        C0FOA c0foa2 = new C0FOA("SELECTED", 1);
        SELECTED = c0foa2;
        C0FOA c0foa3 = new C0FOA("LOADING", 2);
        LOADING = c0foa3;
        C0FOA c0foa4 = new C0FOA("LOAD_FAILED", 3);
        LOAD_FAILED = c0foa4;
        C0FOA c0foa5 = new C0FOA("LOAD_SUCCESS", 4);
        LOAD_SUCCESS = c0foa5;
        C0FOA[] c0foaArr = {c0foa, c0foa2, c0foa3, c0foa4, c0foa5};
        LL = c0foaArr;
        LLILLJJLI = new C2254308sP(c0foaArr);
    }

    public static C0FOA[] values() {
        return (C0FOA[]) LL.clone();
    }

    public static C0FOA valueOf(String str) {
        return (C0FOA) C08FF.LIZ(C0FOA.class, str);
    }

    public C0FOA(String str, int i) {
    }
}
