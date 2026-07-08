package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9A {
    public static final /* synthetic */ C0L9A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L9A NINE_TO_SIXTEEN;
    public static final C0L9A ONE_TO_ONE;
    public static final C0L9A THREE_TO_FOUR;

    public static InterfaceC2044707zh<C0L9A> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L9A c0l9a = new C0L9A("ONE_TO_ONE", 0);
        ONE_TO_ONE = c0l9a;
        C0L9A c0l9a2 = new C0L9A("THREE_TO_FOUR", 1);
        THREE_TO_FOUR = c0l9a2;
        C0L9A c0l9a3 = new C0L9A("NINE_TO_SIXTEEN", 2);
        NINE_TO_SIXTEEN = c0l9a3;
        C0L9A[] c0l9aArr = {c0l9a, c0l9a2, c0l9a3};
        LL = c0l9aArr;
        LLILLJJLI = new C2254308sP(c0l9aArr);
    }

    public static C0L9A[] values() {
        return (C0L9A[]) LL.clone();
    }

    public static C0L9A valueOf(String str) {
        return (C0L9A) C08FF.LIZ(C0L9A.class, str);
    }

    public C0L9A(String str, int i) {
    }
}
