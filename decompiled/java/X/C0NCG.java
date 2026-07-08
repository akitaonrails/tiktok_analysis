package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCG {
    public static final C0NCG BILLING_CASHIER_DESTROY;
    public static final C0NCG BILLING_CASHIER_RESUME;
    public static final /* synthetic */ C0NCG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0NCG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NCG c0ncg = new C0NCG("BILLING_CASHIER_RESUME", 0);
        BILLING_CASHIER_RESUME = c0ncg;
        C0NCG c0ncg2 = new C0NCG("BILLING_CASHIER_DESTROY", 1);
        BILLING_CASHIER_DESTROY = c0ncg2;
        C0NCG[] c0ncgArr = {c0ncg, c0ncg2};
        LL = c0ncgArr;
        LLILLJJLI = new C2254308sP(c0ncgArr);
    }

    public static C0NCG[] values() {
        return (C0NCG[]) LL.clone();
    }

    public static C0NCG valueOf(String str) {
        return (C0NCG) C08FF.LIZ(C0NCG.class, str);
    }

    public C0NCG(String str, int i) {
    }
}
