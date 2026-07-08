package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qOC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1548140qOC {
    public static final EnumC1548140qOC CHECK_PREFETCH_CONFIG_BUNDLE_EMPTY;
    public static final EnumC1548140qOC CHECK_PREFETCH_CONFIG_CHANNEL_EMPTY;
    public static final EnumC1548140qOC CHECK_PREFETCH_CONFIG_NOT_ENABLED;
    public static final EnumC1548140qOC CHECK_PREFETCH_NO_CONFIG;
    public static final EnumC1548140qOC FETCH_HTTP_ERROR;
    public static final EnumC1548140qOC FETCH_METHOD_INVALID;
    public static final EnumC1548140qOC FETCH_NETWORK_EXCEPTION;
    public static final EnumC1548140qOC FETCH_NETWORK_RESPONSE_NULL;
    public static final EnumC1548140qOC FETCH_NETWORK_UNKNOWN_ERROR;
    public static final EnumC1548140qOC JSB_GET_PREFETCH_EXCEPTION;
    public static final EnumC1548140qOC JSB_GET_PREFETCH_RESULT_NULL;
    public static final EnumC1548140qOC JSB_GET_PREFETCH_SWITCH_OFF;
    public static final /* synthetic */ EnumC1548140qOC[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1548140qOC LOAD_CONFIG_BUNDLE_FILE_EXCEPTION;
    public static final EnumC1548140qOC LOAD_CONFIG_BUNDLE_FILE_NOT_EXIST;
    public static final EnumC1548140qOC LOAD_CONFIG_CDN_EXCEPTION;
    public static final EnumC1548140qOC LOAD_CONFIG_CDN_RESPONSE_FAILED;
    public static final EnumC1548140qOC LOAD_CONFIG_CDN_RESPONSE_NULL;
    public static final EnumC1548140qOC LOAD_CONFIG_CDN_URL_NULL;
    public static final EnumC1548140qOC LOAD_CONFIG_DIR_INVALID;
    public static final EnumC1548140qOC LOAD_CONFIG_DIR_NOT_EXIST;
    public static final EnumC1548140qOC LOAD_CONFIG_DIR_NULL;
    public static final EnumC1548140qOC PREFETCH_CONFIG_NULL;
    public static final EnumC1548140qOC PREFETCH_DSL_VERSION_NOT_SUPPORT;
    public static final EnumC1548140qOC PREFETCH_NO_PREFETCH_API;
    public static final EnumC1548140qOC STORE_PREFETCH_ITEM_EMPTY;
    public static final EnumC1548140qOC URL_CONFIG_NULL_ERROR;
    public static final EnumC1548140qOC URL_NOT_HTTP_ERROR;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1548140qOC> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1548140qOC enumC1548140qOC = new EnumC1548140qOC("JSB_GET_PREFETCH_SWITCH_OFF", 0, 100, "jsb get prefetch result error, prefetch switch off");
        JSB_GET_PREFETCH_SWITCH_OFF = enumC1548140qOC;
        EnumC1548140qOC enumC1548140qOC2 = new EnumC1548140qOC("JSB_GET_PREFETCH_EXCEPTION", 1, 101, "jsb get prefetch result exception");
        JSB_GET_PREFETCH_EXCEPTION = enumC1548140qOC2;
        EnumC1548140qOC enumC1548140qOC3 = new EnumC1548140qOC("JSB_GET_PREFETCH_RESULT_NULL", 2, 102, "jsb get prefetch result null, pls check internal exception");
        JSB_GET_PREFETCH_RESULT_NULL = enumC1548140qOC3;
        EnumC1548140qOC enumC1548140qOC4 = new EnumC1548140qOC("URL_CONFIG_NULL_ERROR", 3, 200, "prefetch url is configured null or empty");
        URL_CONFIG_NULL_ERROR = enumC1548140qOC4;
        EnumC1548140qOC enumC1548140qOC5 = new EnumC1548140qOC("URL_NOT_HTTP_ERROR", 4, 201, "prefetch url is not a http url");
        URL_NOT_HTTP_ERROR = enumC1548140qOC5;
        EnumC1548140qOC enumC1548140qOC6 = new EnumC1548140qOC("FETCH_METHOD_INVALID", 5, 202, "prefetch method is invalid");
        FETCH_METHOD_INVALID = enumC1548140qOC6;
        EnumC1548140qOC enumC1548140qOC7 = new EnumC1548140qOC("FETCH_HTTP_ERROR", 6, 203, "prefetch api, network http error");
        FETCH_HTTP_ERROR = enumC1548140qOC7;
        EnumC1548140qOC enumC1548140qOC8 = new EnumC1548140qOC("FETCH_NETWORK_EXCEPTION", 7, 204, "prefetch api, network exception");
        FETCH_NETWORK_EXCEPTION = enumC1548140qOC8;
        EnumC1548140qOC enumC1548140qOC9 = new EnumC1548140qOC("FETCH_NETWORK_RESPONSE_NULL", 8, 205, "prefetch api, network response null");
        FETCH_NETWORK_RESPONSE_NULL = enumC1548140qOC9;
        EnumC1548140qOC enumC1548140qOC10 = new EnumC1548140qOC("FETCH_NETWORK_UNKNOWN_ERROR", 9, 206, "prefetch api, network unknown error");
        FETCH_NETWORK_UNKNOWN_ERROR = enumC1548140qOC10;
        EnumC1548140qOC enumC1548140qOC11 = new EnumC1548140qOC("LOAD_CONFIG_DIR_NULL", 10, 301, "load prefetch config, path of directory null");
        LOAD_CONFIG_DIR_NULL = enumC1548140qOC11;
        EnumC1548140qOC enumC1548140qOC12 = new EnumC1548140qOC("LOAD_CONFIG_DIR_INVALID", 11, 301, "load prefetch config, directory invalid");
        LOAD_CONFIG_DIR_INVALID = enumC1548140qOC12;
        EnumC1548140qOC enumC1548140qOC13 = new EnumC1548140qOC("LOAD_CONFIG_DIR_NOT_EXIST", 12, 302, "load prefetch config, directory not exists");
        LOAD_CONFIG_DIR_NOT_EXIST = enumC1548140qOC13;
        EnumC1548140qOC enumC1548140qOC14 = new EnumC1548140qOC("LOAD_CONFIG_BUNDLE_FILE_NOT_EXIST", 13, 303, "load prefetch config, bundle file not exists");
        LOAD_CONFIG_BUNDLE_FILE_NOT_EXIST = enumC1548140qOC14;
        EnumC1548140qOC enumC1548140qOC15 = new EnumC1548140qOC("LOAD_CONFIG_BUNDLE_FILE_EXCEPTION", 14, 304, "load prefetch config, bundle file parse exception");
        LOAD_CONFIG_BUNDLE_FILE_EXCEPTION = enumC1548140qOC15;
        EnumC1548140qOC enumC1548140qOC16 = new EnumC1548140qOC("LOAD_CONFIG_CDN_URL_NULL", 15, 305, "load prefetch config, cdn url null");
        LOAD_CONFIG_CDN_URL_NULL = enumC1548140qOC16;
        EnumC1548140qOC enumC1548140qOC17 = new EnumC1548140qOC("LOAD_CONFIG_CDN_RESPONSE_NULL", 16, 306, "load prefetch config, cdn response null");
        LOAD_CONFIG_CDN_RESPONSE_NULL = enumC1548140qOC17;
        EnumC1548140qOC enumC1548140qOC18 = new EnumC1548140qOC("LOAD_CONFIG_CDN_RESPONSE_FAILED", 17, 307, "load prefetch config, cdn response failed");
        LOAD_CONFIG_CDN_RESPONSE_FAILED = enumC1548140qOC18;
        EnumC1548140qOC enumC1548140qOC19 = new EnumC1548140qOC("LOAD_CONFIG_CDN_EXCEPTION", 18, 308, "load prefetch config, cdn exception");
        LOAD_CONFIG_CDN_EXCEPTION = enumC1548140qOC19;
        EnumC1548140qOC enumC1548140qOC20 = new EnumC1548140qOC("PREFETCH_CONFIG_NULL", 19, 401, "prefetch fail, load config, config == null");
        PREFETCH_CONFIG_NULL = enumC1548140qOC20;
        EnumC1548140qOC enumC1548140qOC21 = new EnumC1548140qOC("PREFETCH_DSL_VERSION_NOT_SUPPORT", 20, 402, "prefetch fail, config dsl not support");
        PREFETCH_DSL_VERSION_NOT_SUPPORT = enumC1548140qOC21;
        EnumC1548140qOC enumC1548140qOC22 = new EnumC1548140qOC("PREFETCH_NO_PREFETCH_API", 21, 403, "prefetch fail, no prefetch api");
        PREFETCH_NO_PREFETCH_API = enumC1548140qOC22;
        EnumC1548140qOC enumC1548140qOC23 = new EnumC1548140qOC("CHECK_PREFETCH_NO_CONFIG", 22, 501, "check need prefetch fail, no matched prefetch config");
        CHECK_PREFETCH_NO_CONFIG = enumC1548140qOC23;
        EnumC1548140qOC enumC1548140qOC24 = new EnumC1548140qOC("CHECK_PREFETCH_CONFIG_NOT_ENABLED", 23, 502, "check need prefetch fail, config not enabled");
        CHECK_PREFETCH_CONFIG_NOT_ENABLED = enumC1548140qOC24;
        EnumC1548140qOC enumC1548140qOC25 = new EnumC1548140qOC("CHECK_PREFETCH_CONFIG_CHANNEL_EMPTY", 24, 503, "check need prefetch fail, channel empty");
        CHECK_PREFETCH_CONFIG_CHANNEL_EMPTY = enumC1548140qOC25;
        EnumC1548140qOC enumC1548140qOC26 = new EnumC1548140qOC("CHECK_PREFETCH_CONFIG_BUNDLE_EMPTY", 25, 504, "check need prefetch fail, bundle empty");
        CHECK_PREFETCH_CONFIG_BUNDLE_EMPTY = enumC1548140qOC26;
        EnumC1548140qOC enumC1548140qOC27 = new EnumC1548140qOC("STORE_PREFETCH_ITEM_EMPTY", 26, 602, "store prefetch fail, prefetch item empty");
        STORE_PREFETCH_ITEM_EMPTY = enumC1548140qOC27;
        EnumC1548140qOC[] enumC1548140qOCArr = {enumC1548140qOC, enumC1548140qOC2, enumC1548140qOC3, enumC1548140qOC4, enumC1548140qOC5, enumC1548140qOC6, enumC1548140qOC7, enumC1548140qOC8, enumC1548140qOC9, enumC1548140qOC10, enumC1548140qOC11, enumC1548140qOC12, enumC1548140qOC13, enumC1548140qOC14, enumC1548140qOC15, enumC1548140qOC16, enumC1548140qOC17, enumC1548140qOC18, enumC1548140qOC19, enumC1548140qOC20, enumC1548140qOC21, enumC1548140qOC22, enumC1548140qOC23, enumC1548140qOC24, enumC1548140qOC25, enumC1548140qOC26, enumC1548140qOC27};
        LLILLL = enumC1548140qOCArr;
        LLILZ = new C2254308sP(enumC1548140qOCArr);
    }

    public static EnumC1548140qOC[] values() {
        return (EnumC1548140qOC[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC1548140qOC valueOf(String str) {
        return (EnumC1548140qOC) C08FF.LIZ(EnumC1548140qOC.class, str);
    }

    public EnumC1548140qOC(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
