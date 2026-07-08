package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441430HSr {
    public static final EnumC441430HSr ALL_TASK_FAIL;
    public static final /* synthetic */ EnumC441430HSr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC441430HSr MISSING_IMAGE;
    public static final EnumC441430HSr NETWORK_EXCEPTION;
    public static final EnumC441430HSr NO_QUOTA;
    public static final EnumC441430HSr SERVER_ERROR;
    public static final EnumC441430HSr TIMEOUT;
    public static final EnumC441430HSr TNS_CHECK_FAIL;
    public static final EnumC441430HSr UPLOAD_FAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC441430HSr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC441430HSr enumC441430HSr = new EnumC441430HSr("NETWORK_EXCEPTION", 0, "network_exception");
        NETWORK_EXCEPTION = enumC441430HSr;
        EnumC441430HSr enumC441430HSr2 = new EnumC441430HSr("TIMEOUT", 1, "timeout");
        TIMEOUT = enumC441430HSr2;
        EnumC441430HSr enumC441430HSr3 = new EnumC441430HSr("SERVER_ERROR", 2, "server_error");
        SERVER_ERROR = enumC441430HSr3;
        EnumC441430HSr enumC441430HSr4 = new EnumC441430HSr("UPLOAD_FAIL", 3, "upload_fail");
        UPLOAD_FAIL = enumC441430HSr4;
        EnumC441430HSr enumC441430HSr5 = new EnumC441430HSr("NO_QUOTA", 4, "no_quota");
        NO_QUOTA = enumC441430HSr5;
        EnumC441430HSr enumC441430HSr6 = new EnumC441430HSr("TNS_CHECK_FAIL", 5, "tns_check_fail");
        TNS_CHECK_FAIL = enumC441430HSr6;
        EnumC441430HSr enumC441430HSr7 = new EnumC441430HSr("MISSING_IMAGE", 6, "missing_image");
        MISSING_IMAGE = enumC441430HSr7;
        EnumC441430HSr enumC441430HSr8 = new EnumC441430HSr("ALL_TASK_FAIL", 7, "all_task_fail");
        ALL_TASK_FAIL = enumC441430HSr8;
        EnumC441430HSr[] enumC441430HSrArr = {enumC441430HSr, enumC441430HSr2, enumC441430HSr3, enumC441430HSr4, enumC441430HSr5, enumC441430HSr6, enumC441430HSr7, enumC441430HSr8};
        LLILLJJLI = enumC441430HSrArr;
        LLILLL = new C2254308sP(enumC441430HSrArr);
    }

    public static EnumC441430HSr[] values() {
        return (EnumC441430HSr[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC441430HSr valueOf(String str) {
        return (EnumC441430HSr) C08FF.LIZ(EnumC441430HSr.class, str);
    }

    public EnumC441430HSr(String str, int i, String str2) {
        this.LL = str2;
    }
}
