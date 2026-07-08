package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A14, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A14 {
    public static final C1A14 FOLD;
    public static final C1A14 INIT;
    public static final C1A14 INIT_FOLD_EXCHANGE;
    public static final C1A14 INIT_FOLD_RECHARGE;
    public static final /* synthetic */ C1A14[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1A14 NO_FOLD;
    public static final C1A14 UNFOLD;

    public static InterfaceC2044707zh<C1A14> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1A14 c1a14 = new C1A14("INIT", 0);
        INIT = c1a14;
        C1A14 c1a142 = new C1A14("NO_FOLD", 1);
        NO_FOLD = c1a142;
        C1A14 c1a143 = new C1A14("FOLD", 2);
        FOLD = c1a143;
        C1A14 c1a144 = new C1A14("UNFOLD", 3);
        UNFOLD = c1a144;
        C1A14 c1a145 = new C1A14("INIT_FOLD_RECHARGE", 4);
        INIT_FOLD_RECHARGE = c1a145;
        C1A14 c1a146 = new C1A14("INIT_FOLD_EXCHANGE", 5);
        INIT_FOLD_EXCHANGE = c1a146;
        C1A14[] c1a14Arr = {c1a14, c1a142, c1a143, c1a144, c1a145, c1a146};
        LL = c1a14Arr;
        LLILLJJLI = new C2254308sP(c1a14Arr);
    }

    public static C1A14[] values() {
        return (C1A14[]) LL.clone();
    }

    public static C1A14 valueOf(String str) {
        return (C1A14) C08FF.LIZ(C1A14.class, str);
    }

    public C1A14(String str, int i) {
    }
}
