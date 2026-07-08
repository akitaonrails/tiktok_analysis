package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XFN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XFN {
    public static final C0XFN BLOB_DIGEST_GET_FAILED;
    public static final C0XFN BLOB_DIGEST_IS_EMPTY;
    public static final C0XFN BLOB_GAID_IS_EMPTY;
    public static final C0XFN BLOB_GAID_IS_LIMITED;
    public static final C0XFN BLOB_GET_GAID_FAILED;
    public static final C0XFN BLOB_NO_AVAILABLE_TOKEN;
    public static final C0XFN BLOB_OS_VERSION_TOO_LOW;
    public static final C0XFN BLOB_PARSE_TOKEN_FAILED;
    public static final C0XFN BLOB_READ_BLOB_FAILED;
    public static final C0XFN BLOB_SUCCESS;
    public static final C0XFN BLOB_TIKTOK_VERSION_TOO_LOW;
    public static final C0XFN BLOB_UNKNOWN_ERROR;
    public static final C0XFN INTERNAL_ERROR;
    public static final C0XFN INVALID_PARAMS;
    public static final /* synthetic */ C0XFN[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0XFN NO_AVAILABLE_TOKEN;
    public static final C0XFN NO_AVAILABLE_TT_INSTALLED;
    public static final C0XFN NO_BROWSER_ERROR;
    public static final C0XFN NO_CURSOR_RESPOND_ERROR;
    public static final C0XFN TIMEOUT_ERROR;
    public static final C0XFN UNKNOWN_ERROR;
    public static final C0XFN USER_CANCEL;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0XFN> getEntries() {
        return LLILZ;
    }

    static {
        C0XFN c0xfn = new C0XFN("UNKNOWN_ERROR", 0, -1);
        UNKNOWN_ERROR = c0xfn;
        int i = 1;
        C0XFN c0xfn2 = new C0XFN("USER_CANCEL", i, i);
        USER_CANCEL = c0xfn2;
        int i2 = 2;
        C0XFN c0xfn3 = new C0XFN("INTERNAL_ERROR", i2, i2);
        INTERNAL_ERROR = c0xfn3;
        int i3 = 3;
        C0XFN c0xfn4 = new C0XFN("INVALID_PARAMS", i3, i3);
        INVALID_PARAMS = c0xfn4;
        int i4 = 4;
        C0XFN c0xfn5 = new C0XFN("NO_AVAILABLE_TOKEN", i4, i4);
        NO_AVAILABLE_TOKEN = c0xfn5;
        int i5 = 5;
        C0XFN c0xfn6 = new C0XFN("TIMEOUT_ERROR", i5, i5);
        TIMEOUT_ERROR = c0xfn6;
        int i6 = 6;
        C0XFN c0xfn7 = new C0XFN("NO_BROWSER_ERROR", i6, i6);
        NO_BROWSER_ERROR = c0xfn7;
        int i7 = 7;
        C0XFN c0xfn8 = new C0XFN("NO_CURSOR_RESPOND_ERROR", i7, i7);
        NO_CURSOR_RESPOND_ERROR = c0xfn8;
        int i8 = 8;
        C0XFN c0xfn9 = new C0XFN("NO_AVAILABLE_TT_INSTALLED", i8, i8);
        NO_AVAILABLE_TT_INSTALLED = c0xfn9;
        C0XFN c0xfn10 = new C0XFN("BLOB_SUCCESS", 9, 0, "");
        BLOB_SUCCESS = c0xfn10;
        C0XFN c0xfn11 = new C0XFN("BLOB_UNKNOWN_ERROR", 10, -2, "unknown error");
        BLOB_UNKNOWN_ERROR = c0xfn11;
        C0XFN c0xfn12 = new C0XFN("BLOB_OS_VERSION_TOO_LOW", 11, 11, "os version is too low");
        BLOB_OS_VERSION_TOO_LOW = c0xfn12;
        C0XFN c0xfn13 = new C0XFN("BLOB_GAID_IS_EMPTY", 12, 12, "gaid is empty");
        BLOB_GAID_IS_EMPTY = c0xfn13;
        C0XFN c0xfn14 = new C0XFN("BLOB_GAID_IS_LIMITED", 13, 13, "gaid is limited");
        BLOB_GAID_IS_LIMITED = c0xfn14;
        C0XFN c0xfn15 = new C0XFN("BLOB_DIGEST_IS_EMPTY", 14, 14, "digest is empty");
        BLOB_DIGEST_IS_EMPTY = c0xfn15;
        C0XFN c0xfn16 = new C0XFN("BLOB_NO_AVAILABLE_TOKEN", 15, 15, "no available token");
        BLOB_NO_AVAILABLE_TOKEN = c0xfn16;
        C0XFN c0xfn17 = new C0XFN("BLOB_GET_GAID_FAILED", 16, 16, "get gaid exception");
        BLOB_GET_GAID_FAILED = c0xfn17;
        C0XFN c0xfn18 = new C0XFN("BLOB_READ_BLOB_FAILED", 17, 17, "read blob exception");
        BLOB_READ_BLOB_FAILED = c0xfn18;
        C0XFN c0xfn19 = new C0XFN("BLOB_PARSE_TOKEN_FAILED", 18, 18, "parse token exception");
        BLOB_PARSE_TOKEN_FAILED = c0xfn19;
        C0XFN c0xfn20 = new C0XFN("BLOB_TIKTOK_VERSION_TOO_LOW", 19, 19, "tiktok version is too low");
        BLOB_TIKTOK_VERSION_TOO_LOW = c0xfn20;
        C0XFN c0xfn21 = new C0XFN("BLOB_DIGEST_GET_FAILED", 20, 20, "digest get failed");
        BLOB_DIGEST_GET_FAILED = c0xfn21;
        C0XFN[] c0xfnArr = {c0xfn, c0xfn2, c0xfn3, c0xfn4, c0xfn5, c0xfn6, c0xfn7, c0xfn8, c0xfn9, c0xfn10, c0xfn11, c0xfn12, c0xfn13, c0xfn14, c0xfn15, c0xfn16, c0xfn17, c0xfn18, c0xfn19, c0xfn20, c0xfn21};
        LLILLL = c0xfnArr;
        LLILZ = new C2254308sP(c0xfnArr);
    }

    public static C0XFN[] values() {
        return (C0XFN[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public static C0XFN valueOf(String str) {
        return (C0XFN) C08FF.LIZ(C0XFN.class, str);
    }

    public /* synthetic */ C0XFN(String str, int i, int i2) {
        this(str, i, i2, "");
    }

    public C0XFN(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
