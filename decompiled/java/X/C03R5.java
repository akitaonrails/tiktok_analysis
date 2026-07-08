package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03R5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03R5 {
    public static final C03R5 COMBINED_SKU;
    public static final /* synthetic */ C03R5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03R5 NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<C03R5> getEntries() {
        return LLILLL;
    }

    static {
        C03R5 c03r5 = new C03R5("NORMAL", 0, 0);
        NORMAL = c03r5;
        C03R5 c03r52 = new C03R5("COMBINED_SKU", 1, 1);
        COMBINED_SKU = c03r52;
        C03R5[] c03r5Arr = {c03r5, c03r52};
        LLILLJJLI = c03r5Arr;
        LLILLL = new C2254308sP(c03r5Arr);
    }

    public static C03R5[] values() {
        return (C03R5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03R5 valueOf(String str) {
        return (C03R5) C08FF.LIZ(C03R5.class, str);
    }

    public C03R5(String str, int i, int i2) {
        this.LL = i2;
    }
}
