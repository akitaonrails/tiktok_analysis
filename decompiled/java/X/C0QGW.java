package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QGW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGW {
    public static final C0QGW CUSTOM;
    public static final /* synthetic */ C0QGW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QGW NONE;
    public static final C0QGW ROUND;

    public static InterfaceC2044707zh<C0QGW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QGW c0qgw = new C0QGW("NONE", 0);
        NONE = c0qgw;
        C0QGW c0qgw2 = new C0QGW("ROUND", 1);
        ROUND = c0qgw2;
        C0QGW c0qgw3 = new C0QGW("CUSTOM", 2);
        CUSTOM = c0qgw3;
        C0QGW[] c0qgwArr = {c0qgw, c0qgw2, c0qgw3};
        LL = c0qgwArr;
        LLILLJJLI = new C2254308sP(c0qgwArr);
    }

    public static C0QGW[] values() {
        return (C0QGW[]) LL.clone();
    }

    public static C0QGW valueOf(String str) {
        return (C0QGW) C08FF.LIZ(C0QGW.class, str);
    }

    public C0QGW(String str, int i) {
    }
}
