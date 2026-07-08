package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YLC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLC {
    public static final C0YLC COLD_LAUNCH_SYNC;
    public static final /* synthetic */ C0YLC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0YLC LOAD_CONV_LIST;
    public static final C0YLC LOAD_MSG_LIST;
    public static final C0YLC SEND_MESSAGE_DISPLAY;

    public static InterfaceC2044707zh<C0YLC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0YLC c0ylc = new C0YLC("LOAD_MSG_LIST", 0);
        LOAD_MSG_LIST = c0ylc;
        C0YLC c0ylc2 = new C0YLC("LOAD_CONV_LIST", 1);
        LOAD_CONV_LIST = c0ylc2;
        C0YLC c0ylc3 = new C0YLC("SEND_MESSAGE_DISPLAY", 2);
        SEND_MESSAGE_DISPLAY = c0ylc3;
        C0YLC c0ylc4 = new C0YLC("COLD_LAUNCH_SYNC", 3);
        COLD_LAUNCH_SYNC = c0ylc4;
        C0YLC[] c0ylcArr = {c0ylc, c0ylc2, c0ylc3, c0ylc4};
        LL = c0ylcArr;
        LLILLJJLI = new C2254308sP(c0ylcArr);
    }

    public static C0YLC[] values() {
        return (C0YLC[]) LL.clone();
    }

    public static C0YLC valueOf(String str) {
        return (C0YLC) C08FF.LIZ(C0YLC.class, str);
    }

    public C0YLC(String str, int i) {
    }
}
