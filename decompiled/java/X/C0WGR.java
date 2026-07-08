package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WGR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WGR {
    public static final C0WGR ASK;
    public static final C0WGR DENIED;
    public static final C0WGR GRANTED;
    public static final /* synthetic */ C0WGR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0WGR UNKNOWN;

    public static InterfaceC2044707zh<C0WGR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0WGR c0wgr = new C0WGR("DENIED", 0);
        DENIED = c0wgr;
        C0WGR c0wgr2 = new C0WGR("GRANTED", 1);
        GRANTED = c0wgr2;
        C0WGR c0wgr3 = new C0WGR("ASK", 2);
        ASK = c0wgr3;
        C0WGR c0wgr4 = new C0WGR("UNKNOWN", 3);
        UNKNOWN = c0wgr4;
        C0WGR[] c0wgrArr = {c0wgr, c0wgr2, c0wgr3, c0wgr4};
        LL = c0wgrArr;
        LLILLJJLI = new C2254308sP(c0wgrArr);
    }

    public static C0WGR[] values() {
        return (C0WGR[]) LL.clone();
    }

    public static C0WGR valueOf(String str) {
        return (C0WGR) C08FF.LIZ(C0WGR.class, str);
    }

    public C0WGR(String str, int i) {
    }
}
