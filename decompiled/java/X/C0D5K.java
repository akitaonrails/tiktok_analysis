package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D5K, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5K {
    public static final C0D5K CHECK_LOGIN;
    public static final C0D5K FINISHED;
    public static final C0D5K IDLE;
    public static final C0D5K LAUNCH_CSP;
    public static final C0D5K LAUNCH_UCP;
    public static final /* synthetic */ C0D5K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D5K WAIT_LOGIN;

    public static InterfaceC2044707zh<C0D5K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D5K c0d5k = new C0D5K("IDLE", 0);
        IDLE = c0d5k;
        C0D5K c0d5k2 = new C0D5K("CHECK_LOGIN", 1);
        CHECK_LOGIN = c0d5k2;
        C0D5K c0d5k3 = new C0D5K("WAIT_LOGIN", 2);
        WAIT_LOGIN = c0d5k3;
        C0D5K c0d5k4 = new C0D5K("LAUNCH_CSP", 3);
        LAUNCH_CSP = c0d5k4;
        C0D5K c0d5k5 = new C0D5K("LAUNCH_UCP", 4);
        LAUNCH_UCP = c0d5k5;
        C0D5K c0d5k6 = new C0D5K("FINISHED", 5);
        FINISHED = c0d5k6;
        C0D5K[] c0d5kArr = {c0d5k, c0d5k2, c0d5k3, c0d5k4, c0d5k5, c0d5k6};
        LL = c0d5kArr;
        LLILLJJLI = new C2254308sP(c0d5kArr);
    }

    public static C0D5K[] values() {
        return (C0D5K[]) LL.clone();
    }

    public static C0D5K valueOf(String str) {
        return (C0D5K) C08FF.LIZ(C0D5K.class, str);
    }

    public C0D5K(String str, int i) {
    }
}
