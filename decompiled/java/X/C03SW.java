package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03SW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03SW {
    public static final C03SW COMBINED_SKU_FLOW;
    public static final C03SW DEFAULT_FLOW;
    public static final C03SW EXPRESS_FLOW;
    public static final C03SW GOOGLE_ADS_FLOW;
    public static final /* synthetic */ C03SW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03SW MINI_FLOW;
    public final int LL;

    public static InterfaceC2044707zh<C03SW> getEntries() {
        return LLILLL;
    }

    static {
        C03SW c03sw = new C03SW("DEFAULT_FLOW", 0, 0);
        DEFAULT_FLOW = c03sw;
        C03SW c03sw2 = new C03SW("EXPRESS_FLOW", 1, 1);
        EXPRESS_FLOW = c03sw2;
        C03SW c03sw3 = new C03SW("GOOGLE_ADS_FLOW", 2, 2);
        GOOGLE_ADS_FLOW = c03sw3;
        C03SW c03sw4 = new C03SW("COMBINED_SKU_FLOW", 3, 4);
        COMBINED_SKU_FLOW = c03sw4;
        C03SW c03sw5 = new C03SW("MINI_FLOW", 4, 5);
        MINI_FLOW = c03sw5;
        C03SW[] c03swArr = {c03sw, c03sw2, c03sw3, c03sw4, c03sw5};
        LLILLJJLI = c03swArr;
        LLILLL = new C2254308sP(c03swArr);
    }

    public static C03SW[] values() {
        return (C03SW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03SW valueOf(String str) {
        return (C03SW) C08FF.LIZ(C03SW.class, str);
    }

    public C03SW(String str, int i, int i2) {
        this.LL = i2;
    }
}
