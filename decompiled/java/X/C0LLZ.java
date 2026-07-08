package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LLZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LLZ {
    public static final C0LLZ CLIENT_BUSINESS;
    public static final C0LLZ CLIENT_NATIVE;
    public static final C0LLZ CLIENT_SDK_BDIMAGEX_UPLOADER;
    public static final C0LLZ CLIENT_SDK_BDVIDEO_UPLOADER;
    public static final C0LLZ CLIENT_SDK_DM;
    public static final C0LLZ CLIENT_SDK_DOWNLOADER;
    public static final C0LLZ CLIENT_SDK_TTNET;
    public static final /* synthetic */ C0LLZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LLZ SERVER_BUSINESS;
    public static final C0LLZ SERVER_QUOTA;
    public static final C0LLZ SERVER_TNS;
    public static final C0LLZ UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0LLZ> getEntries() {
        return LLILLL;
    }

    static {
        C0LLZ c0llz = new C0LLZ("CLIENT_BUSINESS", 0, "client_business");
        CLIENT_BUSINESS = c0llz;
        C0LLZ c0llz2 = new C0LLZ("CLIENT_NATIVE", 1, "client_native");
        CLIENT_NATIVE = c0llz2;
        C0LLZ c0llz3 = new C0LLZ("CLIENT_SDK_TTNET", 2, "client_sdk_ttnet");
        CLIENT_SDK_TTNET = c0llz3;
        C0LLZ c0llz4 = new C0LLZ("CLIENT_SDK_BDIMAGEX_UPLOADER", 3, "client_sdk_bdimagex_uploader");
        CLIENT_SDK_BDIMAGEX_UPLOADER = c0llz4;
        C0LLZ c0llz5 = new C0LLZ("CLIENT_SDK_BDVIDEO_UPLOADER", 4, "client_sdk_bdvideo_uploader");
        CLIENT_SDK_BDVIDEO_UPLOADER = c0llz5;
        C0LLZ c0llz6 = new C0LLZ("CLIENT_SDK_DOWNLOADER", 5, "client_sdk_downloader");
        CLIENT_SDK_DOWNLOADER = c0llz6;
        C0LLZ c0llz7 = new C0LLZ("CLIENT_SDK_DM", 6, "client_sdk_dm");
        CLIENT_SDK_DM = c0llz7;
        C0LLZ c0llz8 = new C0LLZ("SERVER_BUSINESS", 7, "server_business");
        SERVER_BUSINESS = c0llz8;
        C0LLZ c0llz9 = new C0LLZ("SERVER_TNS", 8, "server_tns");
        SERVER_TNS = c0llz9;
        C0LLZ c0llz10 = new C0LLZ("SERVER_QUOTA", 9, "server_quota");
        SERVER_QUOTA = c0llz10;
        C0LLZ c0llz11 = new C0LLZ("UNKNOWN", 10, "unknown");
        UNKNOWN = c0llz11;
        C0LLZ[] c0llzArr = {c0llz, c0llz2, c0llz3, c0llz4, c0llz5, c0llz6, c0llz7, c0llz8, c0llz9, c0llz10, c0llz11};
        LLILLJJLI = c0llzArr;
        LLILLL = new C2254308sP(c0llzArr);
    }

    public static C0LLZ[] values() {
        return (C0LLZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0LLZ valueOf(String str) {
        return (C0LLZ) C08FF.LIZ(C0LLZ.class, str);
    }

    public C0LLZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
