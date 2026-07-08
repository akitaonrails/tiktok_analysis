package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X6F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6F {
    public static final C0X6F BLOCK_BY_INTERCEPTOR;
    public static final C0X6F CRONET_IO_EXCEPTION_ERROR;
    public static final C0X6F DATA_STR_NULL_ERROR;
    public static final C0X6F FAIL_NET_RESPONSE;
    public static final C0X6F FORM_DATA_METHOD_ERROR;
    public static final C0X6F INIT_CODE;
    public static final /* synthetic */ C0X6F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0X6F NETWORK_NOT_AVAILABLE_EXCEPTION;
    public static final C0X6F UNEXPECTED_METHOD_ERROR_1;
    public static final C0X6F UNEXPECTED_METHOD_ERROR_2;
    public static final C0X6F UNKNOWN_EXCEPTION;
    public final int LL;

    public static InterfaceC2044707zh<C0X6F> getEntries() {
        return LLILLL;
    }

    static {
        C0X6F c0x6f = new C0X6F("INIT_CODE", 0, 0);
        INIT_CODE = c0x6f;
        C0X6F c0x6f2 = new C0X6F("FAIL_NET_RESPONSE", 1, 1);
        FAIL_NET_RESPONSE = c0x6f2;
        C0X6F c0x6f3 = new C0X6F("DATA_STR_NULL_ERROR", 2, -1);
        DATA_STR_NULL_ERROR = c0x6f3;
        C0X6F c0x6f4 = new C0X6F("FORM_DATA_METHOD_ERROR", 3, -2);
        FORM_DATA_METHOD_ERROR = c0x6f4;
        C0X6F c0x6f5 = new C0X6F("UNEXPECTED_METHOD_ERROR_2", 4, -3);
        UNEXPECTED_METHOD_ERROR_2 = c0x6f5;
        C0X6F c0x6f6 = new C0X6F("UNEXPECTED_METHOD_ERROR_1", 5, -4);
        UNEXPECTED_METHOD_ERROR_1 = c0x6f6;
        C0X6F c0x6f7 = new C0X6F("CRONET_IO_EXCEPTION_ERROR", 6, -5);
        CRONET_IO_EXCEPTION_ERROR = c0x6f7;
        C0X6F c0x6f8 = new C0X6F("NETWORK_NOT_AVAILABLE_EXCEPTION", 7, -6);
        NETWORK_NOT_AVAILABLE_EXCEPTION = c0x6f8;
        C0X6F c0x6f9 = new C0X6F("UNKNOWN_EXCEPTION", 8, -7);
        UNKNOWN_EXCEPTION = c0x6f9;
        C0X6F c0x6f10 = new C0X6F("BLOCK_BY_INTERCEPTOR", 9, -8);
        BLOCK_BY_INTERCEPTOR = c0x6f10;
        C0X6F[] c0x6fArr = {c0x6f, c0x6f2, c0x6f3, c0x6f4, c0x6f5, c0x6f6, c0x6f7, c0x6f8, c0x6f9, c0x6f10};
        LLILLJJLI = c0x6fArr;
        LLILLL = new C2254308sP(c0x6fArr);
    }

    public static C0X6F[] values() {
        return (C0X6F[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C0X6F valueOf(String str) {
        return (C0X6F) C08FF.LIZ(C0X6F.class, str);
    }

    public C0X6F(String str, int i, int i2) {
        this.LL = i2;
    }
}
