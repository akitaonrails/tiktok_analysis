package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4M {
    public static final C0N4M EMPTY_POI;
    public static final /* synthetic */ C0N4M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4M NOT_FOUND_POI;
    public static final C0N4M SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0N4M> getEntries() {
        return LLILLL;
    }

    static {
        C0N4M c0n4m = new C0N4M("SUCCESS", 0, 1);
        SUCCESS = c0n4m;
        C0N4M c0n4m2 = new C0N4M("EMPTY_POI", 1, 2);
        EMPTY_POI = c0n4m2;
        C0N4M c0n4m3 = new C0N4M("NOT_FOUND_POI", 2, 3);
        NOT_FOUND_POI = c0n4m3;
        C0N4M[] c0n4mArr = {c0n4m, c0n4m2, c0n4m3};
        LLILLJJLI = c0n4mArr;
        LLILLL = new C2254308sP(c0n4mArr);
    }

    public static C0N4M[] values() {
        return (C0N4M[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C0N4M valueOf(String str) {
        return (C0N4M) C08FF.LIZ(C0N4M.class, str);
    }

    public C0N4M(String str, int i, int i2) {
        this.LL = i2;
    }
}
