package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BN {
    public static final /* synthetic */ C00BN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00BN PAID_COUPON;
    public final int LL = 1;

    public static InterfaceC2044707zh<C00BN> getEntries() {
        return LLILLL;
    }

    static {
        C00BN c00bn = new C00BN();
        PAID_COUPON = c00bn;
        C00BN[] c00bnArr = {c00bn};
        LLILLJJLI = c00bnArr;
        LLILLL = new C2254308sP(c00bnArr);
    }

    public static C00BN[] values() {
        return (C00BN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00BN valueOf(String str) {
        return (C00BN) C08FF.LIZ(C00BN.class, str);
    }
}
