package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1018180cbQ implements InterfaceC593520NPq<String> {
    public static final EnumC1018180cbQ DOWNLOAD_SERVICE_NULL;
    public static final EnumC1018180cbQ IS_DOWNLOADING;
    public static final /* synthetic */ EnumC1018180cbQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1018180cbQ LOW_DEVICE;
    public static final EnumC1018180cbQ NO_NETWORK;
    public static final EnumC1018180cbQ PAST_DATA;
    public static final EnumC1018180cbQ PREVIEW_SERVIE_NULL;
    public static final EnumC1018180cbQ SPLASH_INFO_NULL;
    public static final EnumC1018180cbQ TEENAGE_MODE;
    public static final EnumC1018180cbQ VIDEO_EXISTS;
    public static final EnumC1018180cbQ VIDEO_NULL;
    public static final EnumC1018180cbQ VIDEO_URL_FIRST_NULL;
    public static final EnumC1018180cbQ VIDEO_URL_LIST_NULL;
    public static final EnumC1018180cbQ VIDEO_URL_MODEL_NULL;
    public static final EnumC1018180cbQ WIFI_ONLY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1018180cbQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1018180cbQ enumC1018180cbQ = new EnumC1018180cbQ("TEENAGE_MODE", 0, "teenage_mode");
        TEENAGE_MODE = enumC1018180cbQ;
        EnumC1018180cbQ enumC1018180cbQ2 = new EnumC1018180cbQ("LOW_DEVICE", 1, "low_device");
        LOW_DEVICE = enumC1018180cbQ2;
        EnumC1018180cbQ enumC1018180cbQ3 = new EnumC1018180cbQ("PAST_DATA", 2, "past_data");
        PAST_DATA = enumC1018180cbQ3;
        EnumC1018180cbQ enumC1018180cbQ4 = new EnumC1018180cbQ("SPLASH_INFO_NULL", 3, "splash_info_null");
        SPLASH_INFO_NULL = enumC1018180cbQ4;
        EnumC1018180cbQ enumC1018180cbQ5 = new EnumC1018180cbQ("NO_NETWORK", 4, "no_network");
        NO_NETWORK = enumC1018180cbQ5;
        EnumC1018180cbQ enumC1018180cbQ6 = new EnumC1018180cbQ("WIFI_ONLY", 5, "wifi_only");
        WIFI_ONLY = enumC1018180cbQ6;
        EnumC1018180cbQ enumC1018180cbQ7 = new EnumC1018180cbQ("IS_DOWNLOADING", 6, "is_downloading");
        IS_DOWNLOADING = enumC1018180cbQ7;
        EnumC1018180cbQ enumC1018180cbQ8 = new EnumC1018180cbQ("VIDEO_NULL", 7, "video_null");
        VIDEO_NULL = enumC1018180cbQ8;
        EnumC1018180cbQ enumC1018180cbQ9 = new EnumC1018180cbQ("VIDEO_URL_MODEL_NULL", 8, "video_url_model_null");
        VIDEO_URL_MODEL_NULL = enumC1018180cbQ9;
        EnumC1018180cbQ enumC1018180cbQ10 = new EnumC1018180cbQ("VIDEO_URL_LIST_NULL", 9, "video_url_list_null");
        VIDEO_URL_LIST_NULL = enumC1018180cbQ10;
        EnumC1018180cbQ enumC1018180cbQ11 = new EnumC1018180cbQ("VIDEO_EXISTS", 10, "video_exists");
        VIDEO_EXISTS = enumC1018180cbQ11;
        EnumC1018180cbQ enumC1018180cbQ12 = new EnumC1018180cbQ("VIDEO_URL_FIRST_NULL", 11, "video_url_first_null");
        VIDEO_URL_FIRST_NULL = enumC1018180cbQ12;
        EnumC1018180cbQ enumC1018180cbQ13 = new EnumC1018180cbQ("DOWNLOAD_SERVICE_NULL", 12, "download_service_null");
        DOWNLOAD_SERVICE_NULL = enumC1018180cbQ13;
        EnumC1018180cbQ enumC1018180cbQ14 = new EnumC1018180cbQ("PREVIEW_SERVIE_NULL", 13, "preview_service_null");
        PREVIEW_SERVIE_NULL = enumC1018180cbQ14;
        EnumC1018180cbQ[] enumC1018180cbQArr = {enumC1018180cbQ, enumC1018180cbQ2, enumC1018180cbQ3, enumC1018180cbQ4, enumC1018180cbQ5, enumC1018180cbQ6, enumC1018180cbQ7, enumC1018180cbQ8, enumC1018180cbQ9, enumC1018180cbQ10, enumC1018180cbQ11, enumC1018180cbQ12, enumC1018180cbQ13, enumC1018180cbQ14};
        LLILLJJLI = enumC1018180cbQArr;
        LLILLL = new C2254308sP(enumC1018180cbQArr);
    }

    public static EnumC1018180cbQ[] values() {
        return (EnumC1018180cbQ[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1018180cbQ valueOf(String str) {
        return (EnumC1018180cbQ) C08FF.LIZ(EnumC1018180cbQ.class, str);
    }

    public EnumC1018180cbQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
