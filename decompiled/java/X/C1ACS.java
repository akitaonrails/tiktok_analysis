package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1ACS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACS {
    public static final C1ACS CLIENT_INTELLIGENCE;
    public static final C1ACS IDLE;
    public static final C1ACS INTERRUPT_STOP;
    public static final /* synthetic */ C1ACS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1ACS PLAYING;
    public static final C1ACS SCHEDULING;
    public static final C1ACS STOP;
    public static final C1ACS STRATEGY_SUCCESS;
    public static final C1ACS TRAFFIC_CONTROL;

    public static InterfaceC2044707zh<C1ACS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1ACS c1acs = new C1ACS("IDLE", 0);
        IDLE = c1acs;
        C1ACS c1acs2 = new C1ACS("PLAYING", 1);
        PLAYING = c1acs2;
        C1ACS c1acs3 = new C1ACS("STOP", 2);
        STOP = c1acs3;
        C1ACS c1acs4 = new C1ACS("SCHEDULING", 3);
        SCHEDULING = c1acs4;
        C1ACS c1acs5 = new C1ACS("INTERRUPT_STOP", 4);
        INTERRUPT_STOP = c1acs5;
        C1ACS c1acs6 = new C1ACS("TRAFFIC_CONTROL", 5);
        TRAFFIC_CONTROL = c1acs6;
        C1ACS c1acs7 = new C1ACS("STRATEGY_SUCCESS", 6);
        STRATEGY_SUCCESS = c1acs7;
        C1ACS c1acs8 = new C1ACS("CLIENT_INTELLIGENCE", 7);
        CLIENT_INTELLIGENCE = c1acs8;
        C1ACS[] c1acsArr = {c1acs, c1acs2, c1acs3, c1acs4, c1acs5, c1acs6, c1acs7, c1acs8};
        LL = c1acsArr;
        LLILLJJLI = new C2254308sP(c1acsArr);
    }

    public static C1ACS[] values() {
        return (C1ACS[]) LL.clone();
    }

    public static C1ACS valueOf(String str) {
        return (C1ACS) C08FF.LIZ(C1ACS.class, str);
    }

    public C1ACS(String str, int i) {
    }
}
