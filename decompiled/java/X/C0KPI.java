package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KPI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KPI {
    public static final C0KPI CANCELLED;
    public static final C0KPI FAILED;
    public static final /* synthetic */ C0KPI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KPI PENDING;
    public static final C0KPI SUCCESS;
    public static final C0KPI UNDEFINED;
    public final int LL;

    public static InterfaceC2044707zh<C0KPI> getEntries() {
        return LLILLL;
    }

    static {
        C0KPI c0kpi = new C0KPI("SUCCESS", 0, 0);
        SUCCESS = c0kpi;
        C0KPI c0kpi2 = new C0KPI("PENDING", 1, 1);
        PENDING = c0kpi2;
        C0KPI c0kpi3 = new C0KPI("FAILED", 2, 2);
        FAILED = c0kpi3;
        C0KPI c0kpi4 = new C0KPI("CANCELLED", 3, 3);
        CANCELLED = c0kpi4;
        C0KPI c0kpi5 = new C0KPI("UNDEFINED", 4, 4);
        UNDEFINED = c0kpi5;
        C0KPI[] c0kpiArr = {c0kpi, c0kpi2, c0kpi3, c0kpi4, c0kpi5};
        LLILLJJLI = c0kpiArr;
        LLILLL = new C2254308sP(c0kpiArr);
    }

    public static C0KPI[] values() {
        return (C0KPI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0KPI valueOf(String str) {
        return (C0KPI) C08FF.LIZ(C0KPI.class, str);
    }

    public C0KPI(String str, int i, int i2) {
        this.LL = i2;
    }
}
