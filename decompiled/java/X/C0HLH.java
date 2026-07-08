package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLH {
    public static final C0HLH CANCEL;
    public static final C0HLH CLICK;
    public static final /* synthetic */ C0HLH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HLH SHOW;
    public static final C0HLH TURN_AUTO_ON;
    public static final C0HLH TURN_FLASH_AND_AUTO_OFF;
    public static final C0HLH TURN_FLASH_ON;
    public final String LL;

    public static InterfaceC2044707zh<C0HLH> getEntries() {
        return LLILLL;
    }

    static {
        C0HLH c0hlh = new C0HLH("SHOW", 0, "show");
        SHOW = c0hlh;
        C0HLH c0hlh2 = new C0HLH("CLICK", 1, "click");
        CLICK = c0hlh2;
        C0HLH c0hlh3 = new C0HLH("CANCEL", 2, "cancel");
        CANCEL = c0hlh3;
        C0HLH c0hlh4 = new C0HLH("TURN_FLASH_AND_AUTO_OFF", 3, "turn_flash_n_auto_off");
        TURN_FLASH_AND_AUTO_OFF = c0hlh4;
        C0HLH c0hlh5 = new C0HLH("TURN_FLASH_ON", 4, "turn_flash_on");
        TURN_FLASH_ON = c0hlh5;
        C0HLH c0hlh6 = new C0HLH("TURN_AUTO_ON", 5, "turn_auto_on");
        TURN_AUTO_ON = c0hlh6;
        C0HLH[] c0hlhArr = {c0hlh, c0hlh2, c0hlh3, c0hlh4, c0hlh5, c0hlh6};
        LLILLJJLI = c0hlhArr;
        LLILLL = new C2254308sP(c0hlhArr);
    }

    public static C0HLH[] values() {
        return (C0HLH[]) LLILLJJLI.clone();
    }

    public final String getReportValue() {
        return this.LL;
    }

    public static C0HLH valueOf(String str) {
        return (C0HLH) C08FF.LIZ(C0HLH.class, str);
    }

    public C0HLH(String str, int i, String str2) {
        this.LL = str2;
    }
}
