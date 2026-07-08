package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15DA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DA {
    public static final C15DA BOOSTING;
    public static final C15DA EMOJI;
    public static final /* synthetic */ C15DA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15DA STAND_BY;
    public static final C15DA STRONG;
    public static final C15DA WEAK;

    public static InterfaceC2044707zh<C15DA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15DA c15da = new C15DA("STAND_BY", 0);
        STAND_BY = c15da;
        C15DA c15da2 = new C15DA("WEAK", 1);
        WEAK = c15da2;
        C15DA c15da3 = new C15DA("STRONG", 2);
        STRONG = c15da3;
        C15DA c15da4 = new C15DA("EMOJI", 3);
        EMOJI = c15da4;
        C15DA c15da5 = new C15DA("BOOSTING", 4);
        BOOSTING = c15da5;
        C15DA[] c15daArr = {c15da, c15da2, c15da3, c15da4, c15da5};
        LL = c15daArr;
        LLILLJJLI = new C2254308sP(c15daArr);
    }

    public static C15DA[] values() {
        return (C15DA[]) LL.clone();
    }

    public static C15DA valueOf(String str) {
        return (C15DA) C08FF.LIZ(C15DA.class, str);
    }

    public C15DA(String str, int i) {
    }
}
