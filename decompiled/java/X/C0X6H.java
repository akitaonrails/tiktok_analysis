package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X6H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6H {
    public static final C0X6H CRONET_IO_EXCEPTION_ERROR;
    public static final C0X6H DATA_STR_NULL_ERROR;
    public static final C0X6H FAIL_NET_RESPONSE;
    public static final C0X6H FORM_DATA_METHOD_ERROR;
    public static final C0X6H INIT_CODE;
    public static final /* synthetic */ C0X6H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0X6H NETWORK_NOT_AVAILABLE_EXCEPTION;
    public static final C0X6H UNEXPECTED_METHOD_ERROR_1;
    public static final C0X6H UNEXPECTED_METHOD_ERROR_2;
    public static final C0X6H UNKNOWN_EXCEPTION;
    public final int LL;

    public static InterfaceC2044707zh<C0X6H> getEntries() {
        return LLILLL;
    }

    static {
        C0X6H c0x6h = new C0X6H("INIT_CODE", 0, 0);
        INIT_CODE = c0x6h;
        C0X6H c0x6h2 = new C0X6H("FAIL_NET_RESPONSE", 1, 1);
        FAIL_NET_RESPONSE = c0x6h2;
        C0X6H c0x6h3 = new C0X6H("DATA_STR_NULL_ERROR", 2, -1);
        DATA_STR_NULL_ERROR = c0x6h3;
        C0X6H c0x6h4 = new C0X6H("FORM_DATA_METHOD_ERROR", 3, -2);
        FORM_DATA_METHOD_ERROR = c0x6h4;
        C0X6H c0x6h5 = new C0X6H("UNEXPECTED_METHOD_ERROR_2", 4, -3);
        UNEXPECTED_METHOD_ERROR_2 = c0x6h5;
        C0X6H c0x6h6 = new C0X6H("UNEXPECTED_METHOD_ERROR_1", 5, -4);
        UNEXPECTED_METHOD_ERROR_1 = c0x6h6;
        C0X6H c0x6h7 = new C0X6H("CRONET_IO_EXCEPTION_ERROR", 6, -5);
        CRONET_IO_EXCEPTION_ERROR = c0x6h7;
        C0X6H c0x6h8 = new C0X6H("NETWORK_NOT_AVAILABLE_EXCEPTION", 7, -6);
        NETWORK_NOT_AVAILABLE_EXCEPTION = c0x6h8;
        C0X6H c0x6h9 = new C0X6H("UNKNOWN_EXCEPTION", 8, -7);
        UNKNOWN_EXCEPTION = c0x6h9;
        C0X6H[] c0x6hArr = {c0x6h, c0x6h2, c0x6h3, c0x6h4, c0x6h5, c0x6h6, c0x6h7, c0x6h8, c0x6h9};
        LLILLJJLI = c0x6hArr;
        LLILLL = new C2254308sP(c0x6hArr);
    }

    public static C0X6H[] values() {
        return (C0X6H[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C0X6H valueOf(String str) {
        return (C0X6H) C08FF.LIZ(C0X6H.class, str);
    }

    public C0X6H(String str, int i, int i2) {
        this.LL = i2;
    }
}
