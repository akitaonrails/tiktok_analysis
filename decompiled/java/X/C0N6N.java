package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6N {
    public static final /* synthetic */ C0N6N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N6N MINIS_AD_PLACEMENT_INTERSTITIAL;
    public static final C0N6N MINIS_AD_PLACEMENT_REWARD;
    public static final C0N6N MINIS_AD_PLACEMENT_UNKNOWN;

    public static InterfaceC2044707zh<C0N6N> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N6N c0n6n = new C0N6N("MINIS_AD_PLACEMENT_UNKNOWN", 0);
        MINIS_AD_PLACEMENT_UNKNOWN = c0n6n;
        C0N6N c0n6n2 = new C0N6N("MINIS_AD_PLACEMENT_REWARD", 1);
        MINIS_AD_PLACEMENT_REWARD = c0n6n2;
        C0N6N c0n6n3 = new C0N6N("MINIS_AD_PLACEMENT_INTERSTITIAL", 2);
        MINIS_AD_PLACEMENT_INTERSTITIAL = c0n6n3;
        C0N6N[] c0n6nArr = {c0n6n, c0n6n2, c0n6n3};
        LL = c0n6nArr;
        LLILLJJLI = new C2254308sP(c0n6nArr);
    }

    public static C0N6N[] values() {
        return (C0N6N[]) LL.clone();
    }

    public static C0N6N valueOf(String str) {
        return (C0N6N) C08FF.LIZ(C0N6N.class, str);
    }

    public C0N6N(String str, int i) {
    }
}
