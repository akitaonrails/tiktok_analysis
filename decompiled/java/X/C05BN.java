package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05BN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05BN {
    public static final C05BN DM_CARD;
    public static final /* synthetic */ C05BN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 3;

    public static InterfaceC2044707zh<C05BN> getEntries() {
        return LLILLL;
    }

    static {
        C05BN c05bn = new C05BN();
        DM_CARD = c05bn;
        C05BN[] c05bnArr = {c05bn};
        LLILLJJLI = c05bnArr;
        LLILLL = new C2254308sP(c05bnArr);
    }

    public static C05BN[] values() {
        return (C05BN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C05BN valueOf(String str) {
        return (C05BN) C08FF.LIZ(C05BN.class, str);
    }
}
