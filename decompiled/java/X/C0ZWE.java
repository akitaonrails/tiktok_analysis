package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZWE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZWE {
    public static final C0ZWE FAILED;
    public static final C0ZWE INIT;
    public static final C0ZWE IN_PROGRESS;
    public static final /* synthetic */ C0ZWE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZWE SUCCESS;

    public static InterfaceC2044707zh<C0ZWE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZWE c0zwe = new C0ZWE("INIT", 0);
        INIT = c0zwe;
        C0ZWE c0zwe2 = new C0ZWE("IN_PROGRESS", 1);
        IN_PROGRESS = c0zwe2;
        C0ZWE c0zwe3 = new C0ZWE("SUCCESS", 2);
        SUCCESS = c0zwe3;
        C0ZWE c0zwe4 = new C0ZWE("FAILED", 3);
        FAILED = c0zwe4;
        C0ZWE[] c0zweArr = {c0zwe, c0zwe2, c0zwe3, c0zwe4};
        LL = c0zweArr;
        LLILLJJLI = new C2254308sP(c0zweArr);
    }

    public static C0ZWE[] values() {
        return (C0ZWE[]) LL.clone();
    }

    public static C0ZWE valueOf(String str) {
        return (C0ZWE) C08FF.LIZ(C0ZWE.class, str);
    }

    public C0ZWE(String str, int i) {
    }
}
