package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A3T, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3T {
    public static final C1A3T ERROR;
    public static final C1A3T INIT;
    public static final /* synthetic */ C1A3T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1A3T LOADING;
    public static final C1A3T NO_NETWORK;
    public static final C1A3T NO_RECORD;
    public static final C1A3T SUCCESS;

    public static InterfaceC2044707zh<C1A3T> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1A3T c1a3t = new C1A3T("INIT", 0);
        INIT = c1a3t;
        C1A3T c1a3t2 = new C1A3T("LOADING", 1);
        LOADING = c1a3t2;
        C1A3T c1a3t3 = new C1A3T("NO_NETWORK", 2);
        NO_NETWORK = c1a3t3;
        C1A3T c1a3t4 = new C1A3T("ERROR", 3);
        ERROR = c1a3t4;
        C1A3T c1a3t5 = new C1A3T("SUCCESS", 4);
        SUCCESS = c1a3t5;
        C1A3T c1a3t6 = new C1A3T("NO_RECORD", 5);
        NO_RECORD = c1a3t6;
        C1A3T[] c1a3tArr = {c1a3t, c1a3t2, c1a3t3, c1a3t4, c1a3t5, c1a3t6};
        LL = c1a3tArr;
        LLILLJJLI = new C2254308sP(c1a3tArr);
    }

    public static C1A3T[] values() {
        return (C1A3T[]) LL.clone();
    }

    public static C1A3T valueOf(String str) {
        return (C1A3T) C08FF.LIZ(C1A3T.class, str);
    }

    public C1A3T(String str, int i) {
    }
}
