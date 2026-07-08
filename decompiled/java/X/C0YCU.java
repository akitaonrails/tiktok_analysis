package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YCU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCU {
    public static final C0YCU COMPLETED;
    public static final C0YCU DATA_SYNC;
    public static final C0YCU INSTANTIATE;
    public static final /* synthetic */ C0YCU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0YCU LOGIN;
    public final String LL;

    public static InterfaceC2044707zh<C0YCU> getEntries() {
        return LLILLL;
    }

    static {
        C0YCU c0ycu = new C0YCU("INSTANTIATE", 0, "INSTANTIATE");
        INSTANTIATE = c0ycu;
        C0YCU c0ycu2 = new C0YCU("LOGIN", 1, "LOGIN");
        LOGIN = c0ycu2;
        C0YCU c0ycu3 = new C0YCU("DATA_SYNC", 2, "DATA_SYNC");
        DATA_SYNC = c0ycu3;
        C0YCU c0ycu4 = new C0YCU("COMPLETED", 3, "COMPLETED");
        COMPLETED = c0ycu4;
        C0YCU[] c0ycuArr = {c0ycu, c0ycu2, c0ycu3, c0ycu4};
        LLILLJJLI = c0ycuArr;
        LLILLL = new C2254308sP(c0ycuArr);
    }

    public static C0YCU[] values() {
        return (C0YCU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0YCU valueOf(String str) {
        return (C0YCU) C08FF.LIZ(C0YCU.class, str);
    }

    public C0YCU(String str, int i, String str2) {
        this.LL = str2;
    }
}
