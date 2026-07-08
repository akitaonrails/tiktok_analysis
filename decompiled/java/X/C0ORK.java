package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ORK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORK {
    public static final C0ORK EMPTY_RESULT;
    public static final C0ORK ERROR;
    public static final /* synthetic */ C0ORK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ORK LOADING;
    public static final C0ORK SUCCESS;

    public static InterfaceC2044707zh<C0ORK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ORK c0ork = new C0ORK("LOADING", 0);
        LOADING = c0ork;
        C0ORK c0ork2 = new C0ORK("SUCCESS", 1);
        SUCCESS = c0ork2;
        C0ORK c0ork3 = new C0ORK("EMPTY_RESULT", 2);
        EMPTY_RESULT = c0ork3;
        C0ORK c0ork4 = new C0ORK("ERROR", 3);
        ERROR = c0ork4;
        C0ORK[] c0orkArr = {c0ork, c0ork2, c0ork3, c0ork4};
        LL = c0orkArr;
        LLILLJJLI = new C2254308sP(c0orkArr);
    }

    public static C0ORK[] values() {
        return (C0ORK[]) LL.clone();
    }

    public static C0ORK valueOf(String str) {
        return (C0ORK) C08FF.LIZ(C0ORK.class, str);
    }

    public C0ORK(String str, int i) {
    }
}
