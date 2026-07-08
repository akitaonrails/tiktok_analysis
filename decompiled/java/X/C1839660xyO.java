package X;

/* JADX INFO: renamed from: X.0xyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839660xyO extends Exception {
    public final int LL;
    public final String LLILLJJLI;
    public static final C1839670xyP Companion = new C1839670xyP();
    public static final C1839660xyO SUC = new C1839660xyO(0, "suc");
    public static final C1839660xyO EFFECT_DOWNLOAD_FAILED = new C1839660xyO(1001, "effectDownloadFailed");
    public static final C1839660xyO FONT_DATA_PARSE_FAILED = new C1839660xyO(1002, "font_data_parse_failed");
    public static final C1839660xyO PARSE_FONT_STYLE_FAILED = new C1839660xyO(1003, "parseFontStyleFailed");
    public static final C1839660xyO BOARD_FONT_MANAGER_NULL = new C1839660xyO(2001, "board_font_manager_null");
    public static final C1839660xyO EFFECT_MODEL_NOT_FOUND_ON_PANEL = new C1839660xyO(2002, "effectModelNotFoundOnPanel");
    public static final C1839660xyO VE_PLUGIN_NOT_READY = new C1839660xyO(2003, "ve_plugin_not_ready");
    public static final C1839660xyO FONT_FILE_NOT_FOUND = new C1839660xyO(3001, "fontFileNotFound");
    public static final C1839660xyO DATA_PROVIDER_CREATION_FAILED = new C1839660xyO(4001, "dataProviderCreationFailed");
    public static final C1839660xyO CG_FONT_CREATION_FAILED = new C1839660xyO(4002, "cgFontCreationFailed");
    public static final C1839660xyO MISSING_POST_SCRIPT_NAME = new C1839660xyO(4003, "missingPostScriptName");
    public static final C1839660xyO FONT_REGISTRATION_VERIFICATION_FAILED = new C1839660xyO(4004, "fontRegistrationVerificationFailed");
    public static final C1839660xyO CORE_TEXT_REGISTRATION_FAILED = new C1839660xyO(4005, "coreTextRegistrationFailed");
    public static final C1839660xyO UNKNOWN_ERROR = new C1839660xyO(4006, "unknownError");
    public static final C1839660xyO CONTEXT_NULL = new C1839660xyO(4007, "ensureFontsLoaded context is null");

    public final int getCode() {
        return this.LL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public C1839660xyO(int i, String str) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
