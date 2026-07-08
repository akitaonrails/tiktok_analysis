package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AQ {
    public static final C00AQ IN_ORDER;
    public static final /* synthetic */ C00AQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00AQ USE_IMMEDIATELY;

    public static InterfaceC2044707zh<C00AQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00AQ c00aq = new C00AQ("USE_IMMEDIATELY", 0);
        USE_IMMEDIATELY = c00aq;
        C00AQ c00aq2 = new C00AQ("IN_ORDER", 1);
        IN_ORDER = c00aq2;
        C00AQ[] c00aqArr = {c00aq, c00aq2};
        LL = c00aqArr;
        LLILLJJLI = new C2254308sP(c00aqArr);
    }

    public static C00AQ[] values() {
        return (C00AQ[]) LL.clone();
    }

    public static C00AQ valueOf(String str) {
        return (C00AQ) C08FF.LIZ(C00AQ.class, str);
    }

    public C00AQ(String str, int i) {
    }
}
