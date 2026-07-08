package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TCU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCU {
    public static final /* synthetic */ C0TCU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TCU StateConnected;
    public static final C0TCU StateDisconnected;
    public static final C0TCU StateIdle;
    public static final C0TCU StateServerStart;
    public static final C0TCU StateServerStop;

    public static InterfaceC2044707zh<C0TCU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TCU c0tcu = new C0TCU("StateIdle", 0);
        StateIdle = c0tcu;
        C0TCU c0tcu2 = new C0TCU("StateServerStart", 1);
        StateServerStart = c0tcu2;
        C0TCU c0tcu3 = new C0TCU("StateConnected", 2);
        StateConnected = c0tcu3;
        C0TCU c0tcu4 = new C0TCU("StateDisconnected", 3);
        StateDisconnected = c0tcu4;
        C0TCU c0tcu5 = new C0TCU("StateServerStop", 4);
        StateServerStop = c0tcu5;
        C0TCU[] c0tcuArr = {c0tcu, c0tcu2, c0tcu3, c0tcu4, c0tcu5};
        LL = c0tcuArr;
        LLILLJJLI = new C2254308sP(c0tcuArr);
    }

    public static C0TCU[] values() {
        return (C0TCU[]) LL.clone();
    }

    public static C0TCU valueOf(String str) {
        return (C0TCU) C08FF.LIZ(C0TCU.class, str);
    }

    public C0TCU(String str, int i) {
    }
}
