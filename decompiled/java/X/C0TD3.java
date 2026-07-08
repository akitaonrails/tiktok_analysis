package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TD3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TD3 {
    public static final /* synthetic */ C0TD3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TD3 STATE_CONNECTED;
    public static final C0TD3 STATE_END;
    public static final C0TD3 STATE_IDLE;
    public static final C0TD3 STATE_PAUSE;
    public static final C0TD3 STATE_RESTARTED;
    public static final C0TD3 STATE_RESUMING;
    public static final C0TD3 STATE_START;

    public static InterfaceC2044707zh<C0TD3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TD3 c0td3 = new C0TD3("STATE_IDLE", 0);
        STATE_IDLE = c0td3;
        C0TD3 c0td32 = new C0TD3("STATE_START", 1);
        STATE_START = c0td32;
        C0TD3 c0td33 = new C0TD3("STATE_RESTARTED", 2);
        STATE_RESTARTED = c0td33;
        C0TD3 c0td34 = new C0TD3("STATE_CONNECTED", 3);
        STATE_CONNECTED = c0td34;
        C0TD3 c0td35 = new C0TD3("STATE_RESUMING", 4);
        STATE_RESUMING = c0td35;
        C0TD3 c0td36 = new C0TD3("STATE_PAUSE", 5);
        STATE_PAUSE = c0td36;
        C0TD3 c0td37 = new C0TD3("STATE_END", 6);
        STATE_END = c0td37;
        C0TD3[] c0td3Arr = {c0td3, c0td32, c0td33, c0td34, c0td35, c0td36, c0td37};
        LL = c0td3Arr;
        LLILLJJLI = new C2254308sP(c0td3Arr);
    }

    public static C0TD3[] values() {
        return (C0TD3[]) LL.clone();
    }

    public static C0TD3 valueOf(String str) {
        return (C0TD3) C08FF.LIZ(C0TD3.class, str);
    }

    public C0TD3(String str, int i) {
    }
}
