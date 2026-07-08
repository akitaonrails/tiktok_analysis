package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.043M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043M {
    public static final /* synthetic */ C043M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C043M PDP;
    public static final C043M SKU;
    public static final C043M UNDEFINED;
    public final int LL;

    public static InterfaceC2044707zh<C043M> getEntries() {
        return LLILLL;
    }

    static {
        C043M c043m = new C043M("UNDEFINED", 0, 0);
        UNDEFINED = c043m;
        C043M c043m2 = new C043M("PDP", 1, 1);
        PDP = c043m2;
        C043M c043m3 = new C043M("SKU", 2, 2);
        SKU = c043m3;
        C043M[] c043mArr = {c043m, c043m2, c043m3};
        LLILLJJLI = c043mArr;
        LLILLL = new C2254308sP(c043mArr);
    }

    public static C043M[] values() {
        return (C043M[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C043M valueOf(String str) {
        return (C043M) C08FF.LIZ(C043M.class, str);
    }

    public C043M(String str, int i, int i2) {
        this.LL = i2;
    }
}
