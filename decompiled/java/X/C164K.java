package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.164K, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164K {
    public static final C164K ASR;
    public static final C164K CAPCUT_CREATOR;
    public static final C164K CEC;
    public static final C164K CLOSED_CREATOR;
    public static final /* synthetic */ C164K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C164K STICKER_CREATOR;
    public static final C164K TP_CREATOR;
    public final String LL;

    public static InterfaceC2044707zh<C164K> getEntries() {
        return LLILLL;
    }

    static {
        C164K c164k = new C164K("ASR", 0, "asr");
        ASR = c164k;
        C164K c164k2 = new C164K("CAPCUT_CREATOR", 1, "capcut_creator");
        CAPCUT_CREATOR = c164k2;
        C164K c164k3 = new C164K("CEC", 2, "cec");
        CEC = c164k3;
        C164K c164k4 = new C164K("CLOSED_CREATOR", 3, "closed_creator");
        CLOSED_CREATOR = c164k4;
        C164K c164k5 = new C164K("STICKER_CREATOR", 4, "sticker_creator");
        STICKER_CREATOR = c164k5;
        C164K c164k6 = new C164K("TP_CREATOR", 5, "tp_creator");
        TP_CREATOR = c164k6;
        C164K[] c164kArr = {c164k, c164k2, c164k3, c164k4, c164k5, c164k6};
        LLILLJJLI = c164kArr;
        LLILLL = new C2254308sP(c164kArr);
    }

    public static C164K[] values() {
        return (C164K[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C164K valueOf(String str) {
        return (C164K) C08FF.LIZ(C164K.class, str);
    }

    public C164K(String str, int i, String str2) {
        this.LL = str2;
    }
}
