package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MSF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSF {
    public static final C0MSF FILL_HEIGHT;
    public static final C0MSF FILL_WIDTH;
    public static final /* synthetic */ C0MSF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MSF NONE;

    public static InterfaceC2044707zh<C0MSF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MSF c0msf = new C0MSF("NONE", 0);
        NONE = c0msf;
        C0MSF c0msf2 = new C0MSF("FILL_WIDTH", 1);
        FILL_WIDTH = c0msf2;
        C0MSF c0msf3 = new C0MSF("FILL_HEIGHT", 2);
        FILL_HEIGHT = c0msf3;
        C0MSF[] c0msfArr = {c0msf, c0msf2, c0msf3};
        LL = c0msfArr;
        LLILLJJLI = new C2254308sP(c0msfArr);
    }

    public static C0MSF[] values() {
        return (C0MSF[]) LL.clone();
    }

    public static C0MSF valueOf(String str) {
        return (C0MSF) C08FF.LIZ(C0MSF.class, str);
    }

    public C0MSF(String str, int i) {
    }
}
