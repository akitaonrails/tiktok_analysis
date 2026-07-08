package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JJR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJR {
    public static final C0JJR INVALID_PATH;
    public static final /* synthetic */ C0JJR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0JJR MISSING_COMPULSORY_PARAM;
    public final int LL;

    public static InterfaceC2044707zh<C0JJR> getEntries() {
        return LLILLL;
    }

    static {
        C0JJR c0jjr = new C0JJR("INVALID_PATH", 0, -101);
        INVALID_PATH = c0jjr;
        C0JJR c0jjr2 = new C0JJR("MISSING_COMPULSORY_PARAM", 1, -102);
        MISSING_COMPULSORY_PARAM = c0jjr2;
        C0JJR[] c0jjrArr = {c0jjr, c0jjr2};
        LLILLJJLI = c0jjrArr;
        LLILLL = new C2254308sP(c0jjrArr);
    }

    public static C0JJR[] values() {
        return (C0JJR[]) LLILLJJLI.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public static C0JJR valueOf(String str) {
        return (C0JJR) C08FF.LIZ(C0JJR.class, str);
    }

    public C0JJR(String str, int i, int i2) {
        this.LL = i2;
    }
}
