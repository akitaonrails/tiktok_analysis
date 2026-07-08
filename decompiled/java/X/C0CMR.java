package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CMR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CMR {
    public static final C0CMR HIGH_PRIORITY;
    public static final /* synthetic */ C0CMR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CMR NORMAL_PRIORITY;
    public static final C0CMR TOP_PRIORITY;
    public final int LL;

    public static InterfaceC2044707zh<C0CMR> getEntries() {
        return LLILLL;
    }

    static {
        C0CMR c0cmr = new C0CMR("TOP_PRIORITY", 0, 3);
        TOP_PRIORITY = c0cmr;
        C0CMR c0cmr2 = new C0CMR("HIGH_PRIORITY", 1, 2);
        HIGH_PRIORITY = c0cmr2;
        C0CMR c0cmr3 = new C0CMR("NORMAL_PRIORITY", 2, 1);
        NORMAL_PRIORITY = c0cmr3;
        C0CMR[] c0cmrArr = {c0cmr, c0cmr2, c0cmr3};
        LLILLJJLI = c0cmrArr;
        LLILLL = new C2254308sP(c0cmrArr);
    }

    public static C0CMR[] values() {
        return (C0CMR[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0CMR valueOf(String str) {
        return (C0CMR) C08FF.LIZ(C0CMR.class, str);
    }

    public C0CMR(String str, int i, int i2) {
        this.LL = i2;
    }
}
