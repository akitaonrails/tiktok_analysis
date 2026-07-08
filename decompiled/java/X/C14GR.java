package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14GR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14GR {
    public static final C14GR CAPTURE_FAILED;
    public static final C14GR CAPTURE_SUCCESS;
    public static final C14GR ENTRANCE_DISAPPEAR;
    public static final C14GR ENTRANCE_SHOW;
    public static final C14GR JSB_EVENT_RECEIVED;
    public static final /* synthetic */ C14GR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C14GR MESSAGE_RECEIVED;
    public static final C14GR ROOM_DATA_MET;
    public static final C14GR START_CAPTURE;

    public static InterfaceC2044707zh<C14GR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C14GR c14gr = new C14GR("ENTRANCE_SHOW", 0);
        ENTRANCE_SHOW = c14gr;
        C14GR c14gr2 = new C14GR("ENTRANCE_DISAPPEAR", 1);
        ENTRANCE_DISAPPEAR = c14gr2;
        C14GR c14gr3 = new C14GR("MESSAGE_RECEIVED", 2);
        MESSAGE_RECEIVED = c14gr3;
        C14GR c14gr4 = new C14GR("ROOM_DATA_MET", 3);
        ROOM_DATA_MET = c14gr4;
        C14GR c14gr5 = new C14GR("JSB_EVENT_RECEIVED", 4);
        JSB_EVENT_RECEIVED = c14gr5;
        C14GR c14gr6 = new C14GR("START_CAPTURE", 5);
        START_CAPTURE = c14gr6;
        C14GR c14gr7 = new C14GR("CAPTURE_FAILED", 6);
        CAPTURE_FAILED = c14gr7;
        C14GR c14gr8 = new C14GR("CAPTURE_SUCCESS", 7);
        CAPTURE_SUCCESS = c14gr8;
        C14GR[] c14grArr = {c14gr, c14gr2, c14gr3, c14gr4, c14gr5, c14gr6, c14gr7, c14gr8};
        LL = c14grArr;
        LLILLJJLI = new C2254308sP(c14grArr);
    }

    public static C14GR[] values() {
        return (C14GR[]) LL.clone();
    }

    public static C14GR valueOf(String str) {
        return (C14GR) C08FF.LIZ(C14GR.class, str);
    }

    public C14GR(String str, int i) {
    }
}
