package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1841480y1K {
    public static final EnumC1841480y1K AI_SERVICE_ERROR;
    public static final EnumC1841480y1K DOWNLOAD_ERROR;
    public static final EnumC1841480y1K DOWNLOAD_PARAM_ERROR;
    public static final EnumC1841480y1K EMPTY_PARAM;
    public static final EnumC1841480y1K IMAGE_CONTENT_VIOLATION;
    public static final EnumC1841480y1K INVALID_PARAM;
    public static final /* synthetic */ EnumC1841480y1K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1841480y1K NETWORK_ERROR;
    public static final EnumC1841480y1K PARAM_ERROR;
    public static final EnumC1841480y1K QUOTA_EXCEEDED;
    public static final EnumC1841480y1K SERVICE_ERROR;
    public static final EnumC1841480y1K TEXT_CONTENT_VIOLATION;
    public static final EnumC1841480y1K UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1841480y1K> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1841480y1K enumC1841480y1K = new EnumC1841480y1K("PARAM_ERROR", 0, "1000");
        PARAM_ERROR = enumC1841480y1K;
        EnumC1841480y1K enumC1841480y1K2 = new EnumC1841480y1K("EMPTY_PARAM", 1, "1001");
        EMPTY_PARAM = enumC1841480y1K2;
        EnumC1841480y1K enumC1841480y1K3 = new EnumC1841480y1K("TEXT_CONTENT_VIOLATION", 2, "1002");
        TEXT_CONTENT_VIOLATION = enumC1841480y1K3;
        EnumC1841480y1K enumC1841480y1K4 = new EnumC1841480y1K("INVALID_PARAM", 3, "1003");
        INVALID_PARAM = enumC1841480y1K4;
        EnumC1841480y1K enumC1841480y1K5 = new EnumC1841480y1K("IMAGE_CONTENT_VIOLATION", 4, "1004");
        IMAGE_CONTENT_VIOLATION = enumC1841480y1K5;
        EnumC1841480y1K enumC1841480y1K6 = new EnumC1841480y1K("QUOTA_EXCEEDED", 5, "2001");
        QUOTA_EXCEEDED = enumC1841480y1K6;
        EnumC1841480y1K enumC1841480y1K7 = new EnumC1841480y1K("SERVICE_ERROR", 6, "3000");
        SERVICE_ERROR = enumC1841480y1K7;
        EnumC1841480y1K enumC1841480y1K8 = new EnumC1841480y1K("AI_SERVICE_ERROR", 7, "3001");
        AI_SERVICE_ERROR = enumC1841480y1K8;
        EnumC1841480y1K enumC1841480y1K9 = new EnumC1841480y1K("NETWORK_ERROR", 8, "3002");
        NETWORK_ERROR = enumC1841480y1K9;
        EnumC1841480y1K enumC1841480y1K10 = new EnumC1841480y1K("DOWNLOAD_ERROR", 9, "7009");
        DOWNLOAD_ERROR = enumC1841480y1K10;
        EnumC1841480y1K enumC1841480y1K11 = new EnumC1841480y1K("DOWNLOAD_PARAM_ERROR", 10, "7010");
        DOWNLOAD_PARAM_ERROR = enumC1841480y1K11;
        EnumC1841480y1K enumC1841480y1K12 = new EnumC1841480y1K("UNKNOWN", 11, "9999");
        UNKNOWN = enumC1841480y1K12;
        EnumC1841480y1K[] enumC1841480y1KArr = {enumC1841480y1K, enumC1841480y1K2, enumC1841480y1K3, enumC1841480y1K4, enumC1841480y1K5, enumC1841480y1K6, enumC1841480y1K7, enumC1841480y1K8, enumC1841480y1K9, enumC1841480y1K10, enumC1841480y1K11, enumC1841480y1K12};
        LLILLJJLI = enumC1841480y1KArr;
        LLILLL = new C2254308sP(enumC1841480y1KArr);
    }

    public static EnumC1841480y1K[] values() {
        return (EnumC1841480y1K[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1841480y1K valueOf(String str) {
        return (EnumC1841480y1K) C08FF.LIZ(EnumC1841480y1K.class, str);
    }

    public EnumC1841480y1K(String str, int i, String str2) {
        this.LL = str2;
    }
}
