package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KQD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQD {
    public static final C0KQD CANCEL;
    public static final /* synthetic */ C0KQD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KQD PLAN_CHANGE;
    public static final C0KQD PURCHASES;
    public static final C0KQD RESIGN_UP;
    public static final C0KQD UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0KQD> getEntries() {
        return LLILLL;
    }

    static {
        C0KQD c0kqd = new C0KQD("UNKNOWN", 0, -1);
        UNKNOWN = c0kqd;
        C0KQD c0kqd2 = new C0KQD("PURCHASES", 1, 0);
        PURCHASES = c0kqd2;
        C0KQD c0kqd3 = new C0KQD("RESIGN_UP", 2, 1);
        RESIGN_UP = c0kqd3;
        C0KQD c0kqd4 = new C0KQD("PLAN_CHANGE", 3, 2);
        PLAN_CHANGE = c0kqd4;
        C0KQD c0kqd5 = new C0KQD("CANCEL", 4, 3);
        CANCEL = c0kqd5;
        C0KQD[] c0kqdArr = {c0kqd, c0kqd2, c0kqd3, c0kqd4, c0kqd5};
        LLILLJJLI = c0kqdArr;
        LLILLL = new C2254308sP(c0kqdArr);
    }

    public static C0KQD[] values() {
        return (C0KQD[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0KQD valueOf(String str) {
        return (C0KQD) C08FF.LIZ(C0KQD.class, str);
    }

    public C0KQD(String str, int i, int i2) {
        this.LL = i2;
    }
}
