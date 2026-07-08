package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC881070YhN {
    public static final EnumC881070YhN INFERENCE_ERROR;
    public static final EnumC881070YhN INFERENCE_SUCCESS;
    public static final /* synthetic */ EnumC881070YhN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC881070YhN OBSERVER_ENV_ERROR;
    public static final EnumC881070YhN OBSERVER_ENV_SUCCESS;
    public static final EnumC881070YhN PRE_DOWNLOAD_ERROR;
    public static final EnumC881070YhN PRE_DOWNLOAD_SUCCESS;
    public static final EnumC881070YhN RELEASE_END;
    public final String LL;

    public static InterfaceC2044707zh<EnumC881070YhN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC881070YhN enumC881070YhN = new EnumC881070YhN("PRE_DOWNLOAD_ERROR", 0, "pre_download_error");
        PRE_DOWNLOAD_ERROR = enumC881070YhN;
        EnumC881070YhN enumC881070YhN2 = new EnumC881070YhN("PRE_DOWNLOAD_SUCCESS", 1, "pre_download_success");
        PRE_DOWNLOAD_SUCCESS = enumC881070YhN2;
        EnumC881070YhN enumC881070YhN3 = new EnumC881070YhN("INFERENCE_ERROR", 2, "inference_error");
        INFERENCE_ERROR = enumC881070YhN3;
        EnumC881070YhN enumC881070YhN4 = new EnumC881070YhN("INFERENCE_SUCCESS", 3, "inference_success");
        INFERENCE_SUCCESS = enumC881070YhN4;
        EnumC881070YhN enumC881070YhN5 = new EnumC881070YhN("OBSERVER_ENV_ERROR", 4, "observer_env_error");
        OBSERVER_ENV_ERROR = enumC881070YhN5;
        EnumC881070YhN enumC881070YhN6 = new EnumC881070YhN("OBSERVER_ENV_SUCCESS", 5, "observer_env_success");
        OBSERVER_ENV_SUCCESS = enumC881070YhN6;
        EnumC881070YhN enumC881070YhN7 = new EnumC881070YhN("RELEASE_END", 6, "release_success");
        RELEASE_END = enumC881070YhN7;
        EnumC881070YhN[] enumC881070YhNArr = {enumC881070YhN, enumC881070YhN2, enumC881070YhN3, enumC881070YhN4, enumC881070YhN5, enumC881070YhN6, enumC881070YhN7};
        LLILLJJLI = enumC881070YhNArr;
        LLILLL = new C2254308sP(enumC881070YhNArr);
    }

    public static EnumC881070YhN[] values() {
        return (EnumC881070YhN[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC881070YhN valueOf(String str) {
        return (EnumC881070YhN) C08FF.LIZ(EnumC881070YhN.class, str);
    }

    public EnumC881070YhN(String str, int i, String str2) {
        this.LL = str2;
    }
}
