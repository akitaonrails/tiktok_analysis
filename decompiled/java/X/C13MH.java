package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13MH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13MH {
    public static final C13MH DEBUG;
    public static final C13MH ERROR;
    public static final C13MH INFO;
    public static final /* synthetic */ C13MH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C13MH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C13MH c13mh = new C13MH("ERROR", 0);
        ERROR = c13mh;
        C13MH c13mh2 = new C13MH("INFO", 1);
        INFO = c13mh2;
        C13MH c13mh3 = new C13MH("DEBUG", 2);
        DEBUG = c13mh3;
        C13MH[] c13mhArr = {c13mh, c13mh2, c13mh3};
        LL = c13mhArr;
        LLILLJJLI = new C2254308sP(c13mhArr);
    }

    public static C13MH[] values() {
        return (C13MH[]) LL.clone();
    }

    public static C13MH valueOf(String str) {
        return (C13MH) C08FF.LIZ(C13MH.class, str);
    }

    public C13MH(String str, int i) {
    }
}
