package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQI {
    public static final C0RQI AUTO_PLAY_NEXT_USER;
    public static final /* synthetic */ C0RQI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0RQI LOOP_CURRENT_USER;
    public static final C0RQI LOOP_CURRENT_VIDEO;
    public static final C0RQI LOOP_LAST_VIDEO_AFTER_ONE_USER_FINISH;
    public static final C0RQI QUIT_AFTER_FINISH;

    public static InterfaceC2044707zh<C0RQI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0RQI c0rqi = new C0RQI("LOOP_CURRENT_USER", 0);
        LOOP_CURRENT_USER = c0rqi;
        C0RQI c0rqi2 = new C0RQI("LOOP_CURRENT_VIDEO", 1);
        LOOP_CURRENT_VIDEO = c0rqi2;
        C0RQI c0rqi3 = new C0RQI("LOOP_LAST_VIDEO_AFTER_ONE_USER_FINISH", 2);
        LOOP_LAST_VIDEO_AFTER_ONE_USER_FINISH = c0rqi3;
        C0RQI c0rqi4 = new C0RQI("AUTO_PLAY_NEXT_USER", 3);
        AUTO_PLAY_NEXT_USER = c0rqi4;
        C0RQI c0rqi5 = new C0RQI("QUIT_AFTER_FINISH", 4);
        QUIT_AFTER_FINISH = c0rqi5;
        C0RQI[] c0rqiArr = {c0rqi, c0rqi2, c0rqi3, c0rqi4, c0rqi5};
        LL = c0rqiArr;
        LLILLJJLI = new C2254308sP(c0rqiArr);
    }

    public static C0RQI[] values() {
        return (C0RQI[]) LL.clone();
    }

    public static C0RQI valueOf(String str) {
        return (C0RQI) C08FF.LIZ(C0RQI.class, str);
    }

    public C0RQI(String str, int i) {
    }
}
