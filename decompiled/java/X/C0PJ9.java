package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PJ9 {
    public static final /* synthetic */ C0PJ9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PJ9 RERANK_ALL;
    public static final C0PJ9 RERANK_SWAP;

    public static InterfaceC2044707zh<C0PJ9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PJ9 c0pj9 = new C0PJ9("RERANK_ALL", 0);
        RERANK_ALL = c0pj9;
        C0PJ9 c0pj92 = new C0PJ9("RERANK_SWAP", 1);
        RERANK_SWAP = c0pj92;
        C0PJ9[] c0pj9Arr = {c0pj9, c0pj92};
        LL = c0pj9Arr;
        LLILLJJLI = new C2254308sP(c0pj9Arr);
    }

    public static C0PJ9[] values() {
        return (C0PJ9[]) LL.clone();
    }

    public static C0PJ9 valueOf(String str) {
        return (C0PJ9) C08FF.LIZ(C0PJ9.class, str);
    }

    public C0PJ9(String str, int i) {
    }
}
