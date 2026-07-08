package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2M implements InterfaceC593520NPq<Integer> {
    public static final /* synthetic */ C0N2M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N2M REQUEST;
    public static final C0N2M REQUEST_START;
    public final int LL;

    public static InterfaceC2044707zh<C0N2M> getEntries() {
        return LLILLL;
    }

    static {
        C0N2M c0n2m = new C0N2M("REQUEST_START", 0, 0);
        REQUEST_START = c0n2m;
        C0N2M c0n2m2 = new C0N2M("REQUEST", 1, 1);
        REQUEST = c0n2m2;
        C0N2M[] c0n2mArr = {c0n2m, c0n2m2};
        LLILLJJLI = c0n2mArr;
        LLILLL = new C2254308sP(c0n2mArr);
    }

    public static C0N2M[] values() {
        return (C0N2M[]) LLILLJJLI.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC593520NPq
    public Integer getParamValue() {
        return Integer.valueOf(this.LL);
    }

    public static C0N2M valueOf(String str) {
        return (C0N2M) C08FF.LIZ(C0N2M.class, str);
    }

    public C0N2M(String str, int i, int i2) {
        this.LL = i2;
    }
}
