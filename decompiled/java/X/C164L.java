package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.164L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164L {
    public static final C164L ASR;
    public static final C164L CAPCUT_CREATOR;
    public static final C164L CEC;
    public static final C164L CLOSED_CREATOR;
    public static final /* synthetic */ C164L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C164L STICKER_CREATOR;
    public static final C164L TP_CREATOR;
    public final String LL;

    public static InterfaceC2044707zh<C164L> getEntries() {
        return LLILLL;
    }

    static {
        C164L c164l = new C164L("ASR", 0, "asr");
        ASR = c164l;
        C164L c164l2 = new C164L("CAPCUT_CREATOR", 1, "capcut_creator");
        CAPCUT_CREATOR = c164l2;
        C164L c164l3 = new C164L("CEC", 2, "cec");
        CEC = c164l3;
        C164L c164l4 = new C164L("CLOSED_CREATOR", 3, "closed_creator");
        CLOSED_CREATOR = c164l4;
        C164L c164l5 = new C164L("STICKER_CREATOR", 4, "sticker_creator");
        STICKER_CREATOR = c164l5;
        C164L c164l6 = new C164L("TP_CREATOR", 5, "tp_creator");
        TP_CREATOR = c164l6;
        C164L[] c164lArr = {c164l, c164l2, c164l3, c164l4, c164l5, c164l6};
        LLILLJJLI = c164lArr;
        LLILLL = new C2254308sP(c164lArr);
    }

    public static C164L[] values() {
        return (C164L[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C164L valueOf(String str) {
        return (C164L) C08FF.LIZ(C164L.class, str);
    }

    public C164L(String str, int i, String str2) {
        this.LL = str2;
    }
}
