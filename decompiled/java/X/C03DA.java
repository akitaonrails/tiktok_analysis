package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03DA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DA {
    public static final /* synthetic */ C03DA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03DA OSP;
    public static final C03DA PDP;
    public static final C03DA POP_CARD;
    public static final C03DA SKU;
    public static final C03DA VSA;

    public static InterfaceC2044707zh<C03DA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03DA c03da = new C03DA("POP_CARD", 0);
        POP_CARD = c03da;
        C03DA c03da2 = new C03DA("PDP", 1);
        PDP = c03da2;
        C03DA c03da3 = new C03DA("OSP", 2);
        OSP = c03da3;
        C03DA c03da4 = new C03DA("SKU", 3);
        SKU = c03da4;
        C03DA c03da5 = new C03DA("VSA", 4);
        VSA = c03da5;
        C03DA[] c03daArr = {c03da, c03da2, c03da3, c03da4, c03da5};
        LL = c03daArr;
        LLILLJJLI = new C2254308sP(c03daArr);
    }

    public static C03DA[] values() {
        return (C03DA[]) LL.clone();
    }

    public static C03DA valueOf(String str) {
        return (C03DA) C08FF.LIZ(C03DA.class, str);
    }

    public C03DA(String str, int i) {
    }
}
