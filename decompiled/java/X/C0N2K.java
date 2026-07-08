package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2K implements InterfaceC593520NPq<Integer> {
    public static final C0N2K AFTER;
    public static final C0N2K BEFORE;
    public static final /* synthetic */ C0N2K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0N2K> getEntries() {
        return LLILLL;
    }

    static {
        C0N2K c0n2k = new C0N2K("BEFORE", 0, 1);
        BEFORE = c0n2k;
        C0N2K c0n2k2 = new C0N2K("AFTER", 1, 0);
        AFTER = c0n2k2;
        C0N2K[] c0n2kArr = {c0n2k, c0n2k2};
        LLILLJJLI = c0n2kArr;
        LLILLL = new C2254308sP(c0n2kArr);
    }

    public static C0N2K[] values() {
        return (C0N2K[]) LLILLJJLI.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC593520NPq
    public Integer getParamValue() {
        return Integer.valueOf(this.LL);
    }

    public static C0N2K valueOf(String str) {
        return (C0N2K) C08FF.LIZ(C0N2K.class, str);
    }

    public C0N2K(String str, int i, int i2) {
        this.LL = i2;
    }
}
