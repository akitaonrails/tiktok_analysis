package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6L {
    public static final /* synthetic */ C0N6L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N6L SEARCH_TOP1_POV_CARD;
    public static final C0N6L SEARCH_TOP1_SUG_CARD;
    public static final C0N6L SEARCH_TOP1_TAKO_CARD;

    public static InterfaceC2044707zh<C0N6L> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N6L c0n6l = new C0N6L("SEARCH_TOP1_TAKO_CARD", 0);
        SEARCH_TOP1_TAKO_CARD = c0n6l;
        C0N6L c0n6l2 = new C0N6L("SEARCH_TOP1_SUG_CARD", 1);
        SEARCH_TOP1_SUG_CARD = c0n6l2;
        C0N6L c0n6l3 = new C0N6L("SEARCH_TOP1_POV_CARD", 2);
        SEARCH_TOP1_POV_CARD = c0n6l3;
        C0N6L[] c0n6lArr = {c0n6l, c0n6l2, c0n6l3};
        LL = c0n6lArr;
        LLILLJJLI = new C2254308sP(c0n6lArr);
    }

    public static C0N6L[] values() {
        return (C0N6L[]) LL.clone();
    }

    public static C0N6L valueOf(String str) {
        return (C0N6L) C08FF.LIZ(C0N6L.class, str);
    }

    public C0N6L(String str, int i) {
    }
}
