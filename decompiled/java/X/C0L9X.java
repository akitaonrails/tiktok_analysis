package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9X {
    public static final C0L9X CANCELLED;
    public static final C0L9X FAILED;
    public static final /* synthetic */ C0L9X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9X START;
    public static final C0L9X SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0L9X> getEntries() {
        return LLILLL;
    }

    static {
        C0L9X c0l9x = new C0L9X("START", 0, 0);
        START = c0l9x;
        C0L9X c0l9x2 = new C0L9X("SUCCESS", 1, 1);
        SUCCESS = c0l9x2;
        C0L9X c0l9x3 = new C0L9X("FAILED", 2, 2);
        FAILED = c0l9x3;
        C0L9X c0l9x4 = new C0L9X("CANCELLED", 3, 3);
        CANCELLED = c0l9x4;
        C0L9X[] c0l9xArr = {c0l9x, c0l9x2, c0l9x3, c0l9x4};
        LLILLJJLI = c0l9xArr;
        LLILLL = new C2254308sP(c0l9xArr);
    }

    public static C0L9X[] values() {
        return (C0L9X[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0L9X valueOf(String str) {
        return (C0L9X) C08FF.LIZ(C0L9X.class, str);
    }

    public C0L9X(String str, int i, int i2) {
        this.LL = i2;
    }
}
