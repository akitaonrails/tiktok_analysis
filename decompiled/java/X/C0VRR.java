package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VRR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VRR {
    public static final C0VRR INSERT;
    public static final /* synthetic */ C0VRR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0VRR REPLACE;
    public static final C0VRR UNKNOWN;

    public static InterfaceC2044707zh<C0VRR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VRR c0vrr = new C0VRR("UNKNOWN", 0);
        UNKNOWN = c0vrr;
        C0VRR c0vrr2 = new C0VRR("INSERT", 1);
        INSERT = c0vrr2;
        C0VRR c0vrr3 = new C0VRR("REPLACE", 2);
        REPLACE = c0vrr3;
        C0VRR[] c0vrrArr = {c0vrr, c0vrr2, c0vrr3};
        LL = c0vrrArr;
        LLILLJJLI = new C2254308sP(c0vrrArr);
    }

    public static C0VRR[] values() {
        return (C0VRR[]) LL.clone();
    }

    public static C0VRR valueOf(String str) {
        return (C0VRR) C08FF.LIZ(C0VRR.class, str);
    }

    public C0VRR(String str, int i) {
    }
}
