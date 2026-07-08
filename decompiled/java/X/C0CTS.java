package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CTS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CTS {
    public static final C0CTS LLILLJJLI;
    public static final C0CTS LLILLL;
    public static final C0CTS LLILZ;
    public static final C0CTS LLILZIL;
    public static final C0CTS LLILZLL;
    public static final /* synthetic */ C0CTS[] LLIZ;
    public final String LL;

    static {
        C0CTS c0cts = new C0CTS("AB_NOT_READY", 0, "ab_not_ready");
        LLILLJJLI = c0cts;
        C0CTS c0cts2 = new C0CTS("AB_PARSE_ERROR", 1, "ab_parse_error");
        LLILLL = c0cts2;
        C0CTS c0cts3 = new C0CTS("TAB_FCP_CONFIG_ILLEGAL", 2, "tab_fcp_config_illegal");
        LLILZ = c0cts3;
        C0CTS c0cts4 = new C0CTS("NUJ_FINISHED", 3, "nuj_finished");
        LLILZIL = c0cts4;
        C0CTS c0cts5 = new C0CTS("GET_ABILITY_NULL", 4, "get_ability_null");
        LLILZLL = c0cts5;
        C0CTS[] c0ctsArr = {c0cts, c0cts2, c0cts3, c0cts4, c0cts5};
        LLIZ = c0ctsArr;
        new C2254308sP(c0ctsArr);
    }

    public static C0CTS[] values() {
        return (C0CTS[]) LLIZ.clone();
    }

    public static C0CTS valueOf(String str) {
        return (C0CTS) C08FF.LIZ(C0CTS.class, str);
    }

    public C0CTS(String str, int i, String str2) {
        this.LL = str2;
    }
}
