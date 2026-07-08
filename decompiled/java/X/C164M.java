package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.164M, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164M {
    public static final C164M ASR;
    public static final C164M CAPCUT_CREATOR;
    public static final C164M CEC;
    public static final C164M CLOSED_CREATOR;
    public static final /* synthetic */ C164M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C164M STICKER_CREATOR;
    public static final C164M TP_CREATOR;
    public final String LL;

    public static InterfaceC2044707zh<C164M> getEntries() {
        return LLILLL;
    }

    static {
        C164M c164m = new C164M("ASR", 0, "asr");
        ASR = c164m;
        C164M c164m2 = new C164M("CAPCUT_CREATOR", 1, "capcut_creator");
        CAPCUT_CREATOR = c164m2;
        C164M c164m3 = new C164M("CEC", 2, "cec");
        CEC = c164m3;
        C164M c164m4 = new C164M("CLOSED_CREATOR", 3, "closed_creator");
        CLOSED_CREATOR = c164m4;
        C164M c164m5 = new C164M("STICKER_CREATOR", 4, "sticker_creator");
        STICKER_CREATOR = c164m5;
        C164M c164m6 = new C164M("TP_CREATOR", 5, "tp_creator");
        TP_CREATOR = c164m6;
        C164M[] c164mArr = {c164m, c164m2, c164m3, c164m4, c164m5, c164m6};
        LLILLJJLI = c164mArr;
        LLILLL = new C2254308sP(c164mArr);
    }

    public static C164M[] values() {
        return (C164M[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C164M valueOf(String str) {
        return (C164M) C08FF.LIZ(C164M.class, str);
    }

    public C164M(String str, int i, String str2) {
        this.LL = str2;
    }
}
