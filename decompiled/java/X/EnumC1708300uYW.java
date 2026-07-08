package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1708300uYW {
    public static final EnumC1708300uYW BIND_ERROR_BIND_BIND_CAN_NOT_OPEN_APP_TO_BIND;
    public static final EnumC1708300uYW BIND_ERROR_BIND_BIND_CAN_NOT_OPEN_BROWSER;
    public static final EnumC1708300uYW BIND_ERROR_BIND_BIND_COMMUTE_TYPE_IS_NOT_VALID;
    public static final EnumC1708300uYW BIND_ERROR_BIND_BIND_PI_API_ERROR;
    public static final EnumC1708300uYW BIND_ERROR_BIND_BIND_PI_HTTP_ERROR;
    public static final EnumC1708300uYW BIND_ERROR_BIND_BIND_PI_RESPONSE_DATA_NOT_VALID;
    public static final EnumC1708300uYW BIND_ERROR_BIND_SCHEMA_FORMAT_NOT_RIGHT;
    public static final EnumC1708300uYW BIND_ERROR_ERROR_EXCEPTION;
    public static final EnumC1708300uYW BIND_ERROR_ERROR_PARAMS_ERROR;
    public static final EnumC1708300uYW BIND_ERROR_NO_NEED_BIND;
    public static final /* synthetic */ EnumC1708300uYW[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC1708300uYW> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1708300uYW enumC1708300uYW = new EnumC1708300uYW("BIND_ERROR_NO_NEED_BIND", 0, 2001, C1948907kF.LIZ(), "no need bind");
        BIND_ERROR_NO_NEED_BIND = enumC1708300uYW;
        EnumC1708300uYW enumC1708300uYW2 = new EnumC1708300uYW("BIND_ERROR_BIND_SCHEMA_FORMAT_NOT_RIGHT", 1, 2002, C1948907kF.LIZ(), "schema format is not right");
        BIND_ERROR_BIND_SCHEMA_FORMAT_NOT_RIGHT = enumC1708300uYW2;
        EnumC1708300uYW enumC1708300uYW3 = new EnumC1708300uYW("BIND_ERROR_BIND_BIND_PI_API_ERROR", 2, 2003, C1948907kF.LIZ(), "bind api pipo api error");
        BIND_ERROR_BIND_BIND_PI_API_ERROR = enumC1708300uYW3;
        EnumC1708300uYW enumC1708300uYW4 = new EnumC1708300uYW("BIND_ERROR_BIND_BIND_PI_HTTP_ERROR", 3, 2004, C1948907kF.LIZ(), "bind api http error");
        BIND_ERROR_BIND_BIND_PI_HTTP_ERROR = enumC1708300uYW4;
        EnumC1708300uYW enumC1708300uYW5 = new EnumC1708300uYW("BIND_ERROR_BIND_BIND_PI_RESPONSE_DATA_NOT_VALID", 4, 2005, C1948907kF.LIZ(), "bind api response data is not valid");
        BIND_ERROR_BIND_BIND_PI_RESPONSE_DATA_NOT_VALID = enumC1708300uYW5;
        EnumC1708300uYW enumC1708300uYW6 = new EnumC1708300uYW("BIND_ERROR_BIND_BIND_CAN_NOT_OPEN_APP_TO_BIND", 5, 2006, C1948907kF.LIZ(), "can not open app to bind");
        BIND_ERROR_BIND_BIND_CAN_NOT_OPEN_APP_TO_BIND = enumC1708300uYW6;
        EnumC1708300uYW enumC1708300uYW7 = new EnumC1708300uYW("BIND_ERROR_BIND_BIND_CAN_NOT_OPEN_BROWSER", 6, 2007, C1948907kF.LIZ(), "can not open browser");
        BIND_ERROR_BIND_BIND_CAN_NOT_OPEN_BROWSER = enumC1708300uYW7;
        EnumC1708300uYW enumC1708300uYW8 = new EnumC1708300uYW("BIND_ERROR_BIND_BIND_COMMUTE_TYPE_IS_NOT_VALID", 7, 2008, C1948907kF.LIZ(), "bind commute is not valid");
        BIND_ERROR_BIND_BIND_COMMUTE_TYPE_IS_NOT_VALID = enumC1708300uYW8;
        EnumC1708300uYW enumC1708300uYW9 = new EnumC1708300uYW("BIND_ERROR_ERROR_PARAMS_ERROR", 8, 2009, C1948907kF.LIZ(), "params is error");
        BIND_ERROR_ERROR_PARAMS_ERROR = enumC1708300uYW9;
        EnumC1708300uYW enumC1708300uYW10 = new EnumC1708300uYW("BIND_ERROR_ERROR_EXCEPTION", 9, 2010, C1948907kF.LIZ(), "exception");
        BIND_ERROR_ERROR_EXCEPTION = enumC1708300uYW10;
        EnumC1708300uYW[] enumC1708300uYWArr = {enumC1708300uYW, enumC1708300uYW2, enumC1708300uYW3, enumC1708300uYW4, enumC1708300uYW5, enumC1708300uYW6, enumC1708300uYW7, enumC1708300uYW8, enumC1708300uYW9, enumC1708300uYW10};
        LLILZ = enumC1708300uYWArr;
        LLILZIL = new C2254308sP(enumC1708300uYWArr);
    }

    public static EnumC1708300uYW[] values() {
        return (EnumC1708300uYW[]) LLILZ.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessageForToast() {
        return this.LLILLJJLI;
    }

    public final String getRealError() {
        return this.LLILLL;
    }

    public static EnumC1708300uYW valueOf(String str) {
        return (EnumC1708300uYW) C08FF.LIZ(EnumC1708300uYW.class, str);
    }

    public EnumC1708300uYW(String str, int i, int i2, String str2, String str3) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
