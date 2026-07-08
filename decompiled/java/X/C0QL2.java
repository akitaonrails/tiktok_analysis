package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QL2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QL2 {
    public static final /* synthetic */ C0QL2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QL2 MALL;
    public static final C0QL2 SEARCH_MIDDLE;
    public static final C0QL2 SEARCH_MIDDLE_AI;
    public static final C0QL2 SEARCH_RESULT;

    public static InterfaceC2044707zh<C0QL2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QL2 c0ql2 = new C0QL2("MALL", 0);
        MALL = c0ql2;
        C0QL2 c0ql22 = new C0QL2("SEARCH_MIDDLE", 1);
        SEARCH_MIDDLE = c0ql22;
        C0QL2 c0ql23 = new C0QL2("SEARCH_RESULT", 2);
        SEARCH_RESULT = c0ql23;
        C0QL2 c0ql24 = new C0QL2("SEARCH_MIDDLE_AI", 3);
        SEARCH_MIDDLE_AI = c0ql24;
        C0QL2[] c0ql2Arr = {c0ql2, c0ql22, c0ql23, c0ql24};
        LL = c0ql2Arr;
        LLILLJJLI = new C2254308sP(c0ql2Arr);
    }

    public static C0QL2[] values() {
        return (C0QL2[]) LL.clone();
    }

    public static C0QL2 valueOf(String str) {
        return (C0QL2) C08FF.LIZ(C0QL2.class, str);
    }

    public C0QL2(String str, int i) {
    }
}
