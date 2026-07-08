package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1725040uzW {
    public static final EnumC1725040uzW DISABLED_ERROR_UI_TYPE;
    public static final EnumC1725040uzW FETCH_CLIENT_VE_HTTP_ERROR;
    public static final EnumC1725040uzW FETCH_CLIENT_VE_NETWORK_EXCEPTION;
    public static final EnumC1725040uzW FETCH_CLIENT_VE_SERVER_ERROR;
    public static final EnumC1725040uzW FIND_NULL_ERROR_ACTION_FROM_SE;
    public static final /* synthetic */ EnumC1725040uzW[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1725040uzW PARSE_JSON_STRING_ERROR;
    public static final EnumC1725040uzW PERFORM_BUTTON_ACTION_SCHEMA_PARAM_NULL;
    public static final EnumC1725040uzW PERFORM_BUTTON_ACTION_UNKNOWN_ACTION;
    public static final EnumC1725040uzW UI_DATA_NULL_ERROR;
    public static final EnumC1725040uzW UNKNOWN_UI_TYPE_ERROR;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1725040uzW> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1725040uzW enumC1725040uzW = new EnumC1725040uzW("PARSE_JSON_STRING_ERROR", 0, 100, "Failed to parse ErrorAction from json encoded string");
        PARSE_JSON_STRING_ERROR = enumC1725040uzW;
        EnumC1725040uzW enumC1725040uzW2 = new EnumC1725040uzW("UI_DATA_NULL_ERROR", 1, 101, "Null uiDara from ErrorActionResponse");
        UI_DATA_NULL_ERROR = enumC1725040uzW2;
        EnumC1725040uzW enumC1725040uzW3 = new EnumC1725040uzW("UNKNOWN_UI_TYPE_ERROR", 2, 102, "Unknown uiType in ErrorActionResponse");
        UNKNOWN_UI_TYPE_ERROR = enumC1725040uzW3;
        EnumC1725040uzW enumC1725040uzW4 = new EnumC1725040uzW("DISABLED_ERROR_UI_TYPE", 3, 103, "Disabled uiType in ErrorActionResponse by settings");
        DISABLED_ERROR_UI_TYPE = enumC1725040uzW4;
        EnumC1725040uzW enumC1725040uzW5 = new EnumC1725040uzW("FIND_NULL_ERROR_ACTION_FROM_SE", 4, 104, "Cannot find error action from Client SE");
        FIND_NULL_ERROR_ACTION_FROM_SE = enumC1725040uzW5;
        EnumC1725040uzW enumC1725040uzW6 = new EnumC1725040uzW("FETCH_CLIENT_VE_SERVER_ERROR", 5, 201, "request client ve, network success, but server returns fail");
        FETCH_CLIENT_VE_SERVER_ERROR = enumC1725040uzW6;
        EnumC1725040uzW enumC1725040uzW7 = new EnumC1725040uzW("FETCH_CLIENT_VE_HTTP_ERROR", 6, 202, "request client ve, network http error");
        FETCH_CLIENT_VE_HTTP_ERROR = enumC1725040uzW7;
        EnumC1725040uzW enumC1725040uzW8 = new EnumC1725040uzW("FETCH_CLIENT_VE_NETWORK_EXCEPTION", 7, 203, "request client ve, network exception");
        FETCH_CLIENT_VE_NETWORK_EXCEPTION = enumC1725040uzW8;
        EnumC1725040uzW enumC1725040uzW9 = new EnumC1725040uzW("PERFORM_BUTTON_ACTION_SCHEMA_PARAM_NULL", 8, 301, "Perform open schema action, but schema null");
        PERFORM_BUTTON_ACTION_SCHEMA_PARAM_NULL = enumC1725040uzW9;
        EnumC1725040uzW enumC1725040uzW10 = new EnumC1725040uzW("PERFORM_BUTTON_ACTION_UNKNOWN_ACTION", 9, 302, "Perform button action, unknown action type");
        PERFORM_BUTTON_ACTION_UNKNOWN_ACTION = enumC1725040uzW10;
        EnumC1725040uzW[] enumC1725040uzWArr = {enumC1725040uzW, enumC1725040uzW2, enumC1725040uzW3, enumC1725040uzW4, enumC1725040uzW5, enumC1725040uzW6, enumC1725040uzW7, enumC1725040uzW8, enumC1725040uzW9, enumC1725040uzW10};
        LLILLL = enumC1725040uzWArr;
        LLILZ = new C2254308sP(enumC1725040uzWArr);
    }

    public static EnumC1725040uzW[] values() {
        return (EnumC1725040uzW[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC1725040uzW valueOf(String str) {
        return (EnumC1725040uzW) C08FF.LIZ(EnumC1725040uzW.class, str);
    }

    public EnumC1725040uzW(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
