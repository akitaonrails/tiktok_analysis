package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0v1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1726510v1t {
    public static final EnumC1726510v1t GENERATE_KEYPAIR_CSR_ERROR;
    public static final EnumC1726510v1t GENERATE_SIGNATURE_ERROR;
    public static final EnumC1726510v1t GET_CERT_FROM_CACHE_ERROR;
    public static final EnumC1726510v1t GET_REQUEST_BODY_ERROR;
    public static final EnumC1726510v1t INIT_CERT_ERROR;
    public static final /* synthetic */ EnumC1726510v1t[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1726510v1t VERIFY_CERT_EXPIRED_ERROR;
    public static final EnumC1726510v1t VERIFY_EMPTY_SERVER_SIGN_ERROR;
    public static final EnumC1726510v1t VERIFY_INVALID_SIGN_ERROR;
    public static final EnumC1726510v1t VERIFY_SIGN_ERROR;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1726510v1t> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1726510v1t enumC1726510v1t = new EnumC1726510v1t("GENERATE_KEYPAIR_CSR_ERROR", 0, 100, "Failed to generate key pair and CSR");
        GENERATE_KEYPAIR_CSR_ERROR = enumC1726510v1t;
        EnumC1726510v1t enumC1726510v1t2 = new EnumC1726510v1t("INIT_CERT_ERROR", 1, 101, "Failed to init cert");
        INIT_CERT_ERROR = enumC1726510v1t2;
        EnumC1726510v1t enumC1726510v1t3 = new EnumC1726510v1t("GET_CERT_FROM_CACHE_ERROR", 2, 200, "Failed to get cert from cache");
        GET_CERT_FROM_CACHE_ERROR = enumC1726510v1t3;
        EnumC1726510v1t enumC1726510v1t4 = new EnumC1726510v1t("GET_REQUEST_BODY_ERROR", 3, 201, "Failed to get request body");
        GET_REQUEST_BODY_ERROR = enumC1726510v1t4;
        EnumC1726510v1t enumC1726510v1t5 = new EnumC1726510v1t("GENERATE_SIGNATURE_ERROR", 4, 202, "Failed to generate signature");
        GENERATE_SIGNATURE_ERROR = enumC1726510v1t5;
        EnumC1726510v1t enumC1726510v1t6 = new EnumC1726510v1t("VERIFY_CERT_EXPIRED_ERROR", 5, 301, "Failed to verify as cert expired");
        VERIFY_CERT_EXPIRED_ERROR = enumC1726510v1t6;
        EnumC1726510v1t enumC1726510v1t7 = new EnumC1726510v1t("VERIFY_INVALID_SIGN_ERROR", 6, 302, "Failed to verify as invalid signature");
        VERIFY_INVALID_SIGN_ERROR = enumC1726510v1t7;
        EnumC1726510v1t enumC1726510v1t8 = new EnumC1726510v1t("VERIFY_EMPTY_SERVER_SIGN_ERROR", 7, 303, "Failed to verify as empty signature or cert from server");
        VERIFY_EMPTY_SERVER_SIGN_ERROR = enumC1726510v1t8;
        EnumC1726510v1t enumC1726510v1t9 = new EnumC1726510v1t("VERIFY_SIGN_ERROR", 8, 304, "Failed to verify as client verification");
        VERIFY_SIGN_ERROR = enumC1726510v1t9;
        EnumC1726510v1t[] enumC1726510v1tArr = {enumC1726510v1t, enumC1726510v1t2, enumC1726510v1t3, enumC1726510v1t4, enumC1726510v1t5, enumC1726510v1t6, enumC1726510v1t7, enumC1726510v1t8, enumC1726510v1t9};
        LLILLL = enumC1726510v1tArr;
        LLILZ = new C2254308sP(enumC1726510v1tArr);
    }

    public static EnumC1726510v1t[] values() {
        return (EnumC1726510v1t[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC1726510v1t valueOf(String str) {
        return (EnumC1726510v1t) C08FF.LIZ(EnumC1726510v1t.class, str);
    }

    public EnumC1726510v1t(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
