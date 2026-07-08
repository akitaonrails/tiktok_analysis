package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BS {
    public static final /* synthetic */ C00BS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BS RERANK_ON_SCROLLING;
    public static final C00BS RERANK_ON_SELECTED;

    public static InterfaceC2044707zh<C00BS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BS c00bs = new C00BS("RERANK_ON_SCROLLING", 0);
        RERANK_ON_SCROLLING = c00bs;
        C00BS c00bs2 = new C00BS("RERANK_ON_SELECTED", 1);
        RERANK_ON_SELECTED = c00bs2;
        C00BS[] c00bsArr = {c00bs, c00bs2};
        LL = c00bsArr;
        LLILLJJLI = new C2254308sP(c00bsArr);
    }

    public static C00BS[] values() {
        return (C00BS[]) LL.clone();
    }

    public static C00BS valueOf(String str) {
        return (C00BS) C08FF.LIZ(C00BS.class, str);
    }

    public C00BS(String str, int i) {
    }
}
