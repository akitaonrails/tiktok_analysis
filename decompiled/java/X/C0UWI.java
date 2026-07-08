package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UWI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWI {
    public static final C0UWI CANCELLED;
    public static final C0UWI FAILED;
    public static final /* synthetic */ C0UWI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0UWI SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<C0UWI> getEntries() {
        return LLILLL;
    }

    static {
        C0UWI c0uwi = new C0UWI("SUCCESS", 0, "success");
        SUCCESS = c0uwi;
        C0UWI c0uwi2 = new C0UWI("CANCELLED", 1, "cancelled");
        CANCELLED = c0uwi2;
        C0UWI c0uwi3 = new C0UWI("FAILED", 2, "failed");
        FAILED = c0uwi3;
        C0UWI[] c0uwiArr = {c0uwi, c0uwi2, c0uwi3};
        LLILLJJLI = c0uwiArr;
        LLILLL = new C2254308sP(c0uwiArr);
    }

    public static C0UWI[] values() {
        return (C0UWI[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0UWI valueOf(String str) {
        return (C0UWI) C08FF.LIZ(C0UWI.class, str);
    }

    public C0UWI(String str, int i, String str2) {
        this.LL = str2;
    }
}
