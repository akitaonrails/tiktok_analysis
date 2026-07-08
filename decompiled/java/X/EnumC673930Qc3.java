package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC673930Qc3 {
    public static final EnumC673930Qc3 ACTIVITY_CREATE;
    public static final EnumC673930Qc3 ASSEMBLE_START;
    public static final EnumC673930Qc3 ASSEM_SHOW;
    public static final EnumC673930Qc3 BLANK_INIT;
    public static final EnumC673930Qc3 FIRST_SCREEN;
    public static final EnumC673930Qc3 GUESS_RESPONSE;
    public static final EnumC673930Qc3 INTERCEPT_END;
    public static final EnumC673930Qc3 INTERCEPT_START;
    public static final /* synthetic */ EnumC673930Qc3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC673930Qc3 LYNX_FIRST_SCREEN;
    public static final EnumC673930Qc3 LYNX_INIT;
    public static final EnumC673930Qc3 PITAYA_END_TIME;
    public static final EnumC673930Qc3 PITAYA_START_TIME;
    public static final EnumC673930Qc3 REQUEST_TIME;
    public static final EnumC673930Qc3 RESPONSE_TIME;
    public static final EnumC673930Qc3 ROOT_FRAGMENT_CREATE;
    public static final EnumC673930Qc3 ROUTE_START;
    public static final EnumC673930Qc3 START;
    public final String LL;

    public static InterfaceC2044707zh<EnumC673930Qc3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC673930Qc3 enumC673930Qc3 = new EnumC673930Qc3("ROUTE_START", 0, "route_start");
        ROUTE_START = enumC673930Qc3;
        EnumC673930Qc3 enumC673930Qc32 = new EnumC673930Qc3("INTERCEPT_START", 1, "intercept_start");
        INTERCEPT_START = enumC673930Qc32;
        EnumC673930Qc3 enumC673930Qc33 = new EnumC673930Qc3("INTERCEPT_END", 2, "intercept_end");
        INTERCEPT_END = enumC673930Qc33;
        EnumC673930Qc3 enumC673930Qc34 = new EnumC673930Qc3("START", 3, "start_time");
        START = enumC673930Qc34;
        EnumC673930Qc3 enumC673930Qc35 = new EnumC673930Qc3("ACTIVITY_CREATE", 4, "activity_create");
        ACTIVITY_CREATE = enumC673930Qc35;
        EnumC673930Qc3 enumC673930Qc36 = new EnumC673930Qc3("ROOT_FRAGMENT_CREATE", 5, "root_fragment_create");
        ROOT_FRAGMENT_CREATE = enumC673930Qc36;
        EnumC673930Qc3 enumC673930Qc37 = new EnumC673930Qc3("BLANK_INIT", 6, "blank_init_time");
        BLANK_INIT = enumC673930Qc37;
        EnumC673930Qc3 enumC673930Qc38 = new EnumC673930Qc3("ASSEMBLE_START", 7, "assemble_start");
        ASSEMBLE_START = enumC673930Qc38;
        EnumC673930Qc3 enumC673930Qc39 = new EnumC673930Qc3("ASSEM_SHOW", 8, "assem_show");
        ASSEM_SHOW = enumC673930Qc39;
        EnumC673930Qc3 enumC673930Qc310 = new EnumC673930Qc3("LYNX_INIT", 9, "lynx_init_time");
        LYNX_INIT = enumC673930Qc310;
        EnumC673930Qc3 enumC673930Qc311 = new EnumC673930Qc3("FIRST_SCREEN", 10, "first_screen_time");
        FIRST_SCREEN = enumC673930Qc311;
        EnumC673930Qc3 enumC673930Qc312 = new EnumC673930Qc3("LYNX_FIRST_SCREEN", 11, "lynx_first_screen_time");
        LYNX_FIRST_SCREEN = enumC673930Qc312;
        EnumC673930Qc3 enumC673930Qc313 = new EnumC673930Qc3("GUESS_RESPONSE", 12, "guess_response_time");
        GUESS_RESPONSE = enumC673930Qc313;
        EnumC673930Qc3 enumC673930Qc314 = new EnumC673930Qc3("PITAYA_START_TIME", 13, "pitaya_start_time");
        PITAYA_START_TIME = enumC673930Qc314;
        EnumC673930Qc3 enumC673930Qc315 = new EnumC673930Qc3("PITAYA_END_TIME", 14, "pitaya_end_time");
        PITAYA_END_TIME = enumC673930Qc315;
        EnumC673930Qc3 enumC673930Qc316 = new EnumC673930Qc3("REQUEST_TIME", 15, "request_time");
        REQUEST_TIME = enumC673930Qc316;
        EnumC673930Qc3 enumC673930Qc317 = new EnumC673930Qc3("RESPONSE_TIME", 16, "response_time");
        RESPONSE_TIME = enumC673930Qc317;
        EnumC673930Qc3[] enumC673930Qc3Arr = {enumC673930Qc3, enumC673930Qc32, enumC673930Qc33, enumC673930Qc34, enumC673930Qc35, enumC673930Qc36, enumC673930Qc37, enumC673930Qc38, enumC673930Qc39, enumC673930Qc310, enumC673930Qc311, enumC673930Qc312, enumC673930Qc313, enumC673930Qc314, enumC673930Qc315, enumC673930Qc316, enumC673930Qc317};
        LLILLJJLI = enumC673930Qc3Arr;
        LLILLL = new C2254308sP(enumC673930Qc3Arr);
    }

    public static EnumC673930Qc3[] values() {
        return (EnumC673930Qc3[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC673930Qc3 valueOf(String str) {
        return (EnumC673930Qc3) C08FF.LIZ(EnumC673930Qc3.class, str);
    }

    public EnumC673930Qc3(String str, int i, String str2) {
        this.LL = str2;
    }
}
