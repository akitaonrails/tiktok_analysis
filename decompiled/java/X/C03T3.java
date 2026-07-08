package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03T3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03T3 {
    public static final /* synthetic */ C03T3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03T3 SKC;
    public static final C03T3 SKU;
    public final int LL;

    public static InterfaceC2044707zh<C03T3> getEntries() {
        return LLILLL;
    }

    static {
        C03T3 c03t3 = new C03T3("SKU", 0, 0);
        SKU = c03t3;
        C03T3 c03t32 = new C03T3("SKC", 1, 1);
        SKC = c03t32;
        C03T3[] c03t3Arr = {c03t3, c03t32};
        LLILLJJLI = c03t3Arr;
        LLILLL = new C2254308sP(c03t3Arr);
    }

    public static C03T3[] values() {
        return (C03T3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03T3 valueOf(String str) {
        return (C03T3) C08FF.LIZ(C03T3.class, str);
    }

    public C03T3(String str, int i, int i2) {
        this.LL = i2;
    }
}
