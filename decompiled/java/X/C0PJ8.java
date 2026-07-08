package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PJ8 {
    public static final /* synthetic */ C0PJ8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PJ8 RERANK_NEXT;
    public static final C0PJ8 RERANK_SKIP;

    public static InterfaceC2044707zh<C0PJ8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PJ8 c0pj8 = new C0PJ8("RERANK_NEXT", 0);
        RERANK_NEXT = c0pj8;
        C0PJ8 c0pj82 = new C0PJ8("RERANK_SKIP", 1);
        RERANK_SKIP = c0pj82;
        C0PJ8[] c0pj8Arr = {c0pj8, c0pj82};
        LL = c0pj8Arr;
        LLILLJJLI = new C2254308sP(c0pj8Arr);
    }

    public static C0PJ8[] values() {
        return (C0PJ8[]) LL.clone();
    }

    public static C0PJ8 valueOf(String str) {
        return (C0PJ8) C08FF.LIZ(C0PJ8.class, str);
    }

    public C0PJ8(String str, int i) {
    }
}
