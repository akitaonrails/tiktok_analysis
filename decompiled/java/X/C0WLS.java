package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLS {
    public static final C0WLS DEBUG;
    public static final C0WLS ERROR;
    public static final C0WLS INFO;
    public static final /* synthetic */ C0WLS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0WLS VERBOSE;
    public static final C0WLS WARN;

    public static InterfaceC2044707zh<C0WLS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0WLS c0wls = new C0WLS("VERBOSE", 0);
        VERBOSE = c0wls;
        C0WLS c0wls2 = new C0WLS("INFO", 1);
        INFO = c0wls2;
        C0WLS c0wls3 = new C0WLS("DEBUG", 2);
        DEBUG = c0wls3;
        C0WLS c0wls4 = new C0WLS("WARN", 3);
        WARN = c0wls4;
        C0WLS c0wls5 = new C0WLS("ERROR", 4);
        ERROR = c0wls5;
        C0WLS[] c0wlsArr = {c0wls, c0wls2, c0wls3, c0wls4, c0wls5};
        LL = c0wlsArr;
        LLILLJJLI = new C2254308sP(c0wlsArr);
    }

    public static C0WLS[] values() {
        return (C0WLS[]) LL.clone();
    }

    public static C0WLS valueOf(String str) {
        return (C0WLS) C08FF.LIZ(C0WLS.class, str);
    }

    public C0WLS(String str, int i) {
    }
}
