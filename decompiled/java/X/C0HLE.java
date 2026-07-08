package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLE {
    public static final C0HLE CLOSE;
    public static final /* synthetic */ C0HLE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HLE RETRY;
    public static final C0HLE SHOW;
    public final String LL;

    public static InterfaceC2044707zh<C0HLE> getEntries() {
        return LLILLL;
    }

    static {
        C0HLE c0hle = new C0HLE("SHOW", 0, "show");
        SHOW = c0hle;
        C0HLE c0hle2 = new C0HLE("RETRY", 1, "retry");
        RETRY = c0hle2;
        C0HLE c0hle3 = new C0HLE("CLOSE", 2, "close");
        CLOSE = c0hle3;
        C0HLE[] c0hleArr = {c0hle, c0hle2, c0hle3};
        LLILLJJLI = c0hleArr;
        LLILLL = new C2254308sP(c0hleArr);
    }

    public static C0HLE[] values() {
        return (C0HLE[]) LLILLJJLI.clone();
    }

    public final String getReportValue() {
        return this.LL;
    }

    public static C0HLE valueOf(String str) {
        return (C0HLE) C08FF.LIZ(C0HLE.class, str);
    }

    public C0HLE(String str, int i, String str2) {
        this.LL = str2;
    }
}
