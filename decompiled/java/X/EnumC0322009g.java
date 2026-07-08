package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0322009g {
    public static final /* synthetic */ EnumC0322009g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0322009g LYNX_ON_FIRST_SCREEN;
    public static final EnumC0322009g LYNX_ON_LOAD_SUCCESS;
    public static final EnumC0322009g LYNX_ON_PAGE_START;
    public static final EnumC0322009g LYNX_ON_RECEIVED_ERROR;
    public static final EnumC0322009g LYNX_ON_RUNTIME_READY;
    public static final EnumC0322009g LYNX_ON_TIMING_SETUP;
    public static final EnumC0322009g LYNX_ON_TIMING_UPDATE;
    public static final EnumC0322009g SPARK_ON_LOAD_FAILED;
    public static final EnumC0322009g SPARK_ON_LOAD_FINISH;
    public static final EnumC0322009g SPARK_ON_LOAD_START;
    public static final EnumC0322009g SPARK_ON_POSTKIT_CREATED;
    public static final EnumC0322009g SPARK_ON_PREKIT_CREATE;
    public static final EnumC0322009g SPARK_ON_RUNTIME_READY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC0322009g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0322009g enumC0322009g = new EnumC0322009g("LYNX_ON_PAGE_START", 0, "lynx_on_page_start");
        LYNX_ON_PAGE_START = enumC0322009g;
        EnumC0322009g enumC0322009g2 = new EnumC0322009g("LYNX_ON_LOAD_SUCCESS", 1, "lynx_on_load_success");
        LYNX_ON_LOAD_SUCCESS = enumC0322009g2;
        EnumC0322009g enumC0322009g3 = new EnumC0322009g("LYNX_ON_FIRST_SCREEN", 2, "lynx_on_first_screen");
        LYNX_ON_FIRST_SCREEN = enumC0322009g3;
        EnumC0322009g enumC0322009g4 = new EnumC0322009g("LYNX_ON_RUNTIME_READY", 3, "lynx_on_runtime_ready");
        LYNX_ON_RUNTIME_READY = enumC0322009g4;
        EnumC0322009g enumC0322009g5 = new EnumC0322009g("LYNX_ON_RECEIVED_ERROR", 4, "lynx_on_received_error");
        LYNX_ON_RECEIVED_ERROR = enumC0322009g5;
        EnumC0322009g enumC0322009g6 = new EnumC0322009g("LYNX_ON_TIMING_SETUP", 5, "lynx_on_timing_setup");
        LYNX_ON_TIMING_SETUP = enumC0322009g6;
        EnumC0322009g enumC0322009g7 = new EnumC0322009g("LYNX_ON_TIMING_UPDATE", 6, "lynx_on_timing_update");
        LYNX_ON_TIMING_UPDATE = enumC0322009g7;
        EnumC0322009g enumC0322009g8 = new EnumC0322009g("SPARK_ON_PREKIT_CREATE", 7, "spark_on_prekit_create");
        SPARK_ON_PREKIT_CREATE = enumC0322009g8;
        EnumC0322009g enumC0322009g9 = new EnumC0322009g("SPARK_ON_POSTKIT_CREATED", 8, "spark_on_postkit_created");
        SPARK_ON_POSTKIT_CREATED = enumC0322009g9;
        EnumC0322009g enumC0322009g10 = new EnumC0322009g("SPARK_ON_LOAD_START", 9, "spark_on_load_start");
        SPARK_ON_LOAD_START = enumC0322009g10;
        EnumC0322009g enumC0322009g11 = new EnumC0322009g("SPARK_ON_RUNTIME_READY", 10, "spark_on_runtime_ready");
        SPARK_ON_RUNTIME_READY = enumC0322009g11;
        EnumC0322009g enumC0322009g12 = new EnumC0322009g("SPARK_ON_LOAD_FINISH", 11, "spark_on_load_finish");
        SPARK_ON_LOAD_FINISH = enumC0322009g12;
        EnumC0322009g enumC0322009g13 = new EnumC0322009g("SPARK_ON_LOAD_FAILED", 12, "spark_on_load_failed");
        SPARK_ON_LOAD_FAILED = enumC0322009g13;
        EnumC0322009g[] enumC0322009gArr = {enumC0322009g, enumC0322009g2, enumC0322009g3, enumC0322009g4, enumC0322009g5, enumC0322009g6, enumC0322009g7, enumC0322009g8, enumC0322009g9, enumC0322009g10, enumC0322009g11, enumC0322009g12, enumC0322009g13};
        LLILLJJLI = enumC0322009gArr;
        LLILLL = new C2254308sP(enumC0322009gArr);
    }

    public static EnumC0322009g[] values() {
        return (EnumC0322009g[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC0322009g valueOf(String str) {
        return (EnumC0322009g) C08FF.LIZ(EnumC0322009g.class, str);
    }

    public EnumC0322009g(String str, int i, String str2) {
        this.LL = str2;
    }
}
