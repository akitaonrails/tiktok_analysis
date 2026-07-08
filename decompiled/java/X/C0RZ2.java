package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZ2 {
    public static final C0RZ2 FAILED;
    public static final /* synthetic */ C0RZ2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0RZ2 SUCCEED;
    public final int LL;

    public static InterfaceC2044707zh<C0RZ2> getEntries() {
        return LLILLL;
    }

    static {
        C0RZ2 c0rz2 = new C0RZ2("SUCCEED", 0, 0);
        SUCCEED = c0rz2;
        C0RZ2 c0rz22 = new C0RZ2("FAILED", 1, -1);
        FAILED = c0rz22;
        C0RZ2[] c0rz2Arr = {c0rz2, c0rz22};
        LLILLJJLI = c0rz2Arr;
        LLILLL = new C2254308sP(c0rz2Arr);
    }

    public static C0RZ2[] values() {
        return (C0RZ2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0RZ2 valueOf(String str) {
        return (C0RZ2) C08FF.LIZ(C0RZ2.class, str);
    }

    public C0RZ2(String str, int i, int i2) {
        this.LL = i2;
    }
}
