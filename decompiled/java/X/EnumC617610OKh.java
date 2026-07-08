package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC617610OKh {
    public static final EnumC617610OKh ACCESS_CONTROL_FAILED;
    public static final EnumC617610OKh API_PARAMETER_LOST_ERROR;
    public static final /* synthetic */ EnumC617610OKh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC617610OKh LOCAL_ANALYSE_FAILED;
    public static final EnumC617610OKh LOCAL_CRASH;
    public static final EnumC617610OKh LOCAL_LIBRA_CONTROL;
    public static final EnumC617610OKh LOCAL_NETWORK_AVAILABLE;
    public static final EnumC617610OKh LYNX_LOAD_ERROR;
    public static final EnumC617610OKh PHOTO_UPLOAD_FAILED;
    public static final EnumC617610OKh QUOTA_LIMIT;
    public static final EnumC617610OKh REQUEST_JOB_CANCEL;
    public static final EnumC617610OKh VIDEO_UPLOAD_FAILED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC617610OKh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC617610OKh enumC617610OKh = new EnumC617610OKh("QUOTA_LIMIT", 0, 3002386);
        QUOTA_LIMIT = enumC617610OKh;
        EnumC617610OKh enumC617610OKh2 = new EnumC617610OKh("LOCAL_LIBRA_CONTROL", 1, 9001000);
        LOCAL_LIBRA_CONTROL = enumC617610OKh2;
        EnumC617610OKh enumC617610OKh3 = new EnumC617610OKh("LOCAL_NETWORK_AVAILABLE", 2, 9001001);
        LOCAL_NETWORK_AVAILABLE = enumC617610OKh3;
        EnumC617610OKh enumC617610OKh4 = new EnumC617610OKh("LOCAL_ANALYSE_FAILED", 3, 9001002);
        LOCAL_ANALYSE_FAILED = enumC617610OKh4;
        EnumC617610OKh enumC617610OKh5 = new EnumC617610OKh("PHOTO_UPLOAD_FAILED", 4, 9001003);
        PHOTO_UPLOAD_FAILED = enumC617610OKh5;
        EnumC617610OKh enumC617610OKh6 = new EnumC617610OKh("API_PARAMETER_LOST_ERROR", 5, 9001004);
        API_PARAMETER_LOST_ERROR = enumC617610OKh6;
        EnumC617610OKh enumC617610OKh7 = new EnumC617610OKh("REQUEST_JOB_CANCEL", 6, 9001005);
        REQUEST_JOB_CANCEL = enumC617610OKh7;
        EnumC617610OKh enumC617610OKh8 = new EnumC617610OKh("VIDEO_UPLOAD_FAILED", 7, 9001006);
        VIDEO_UPLOAD_FAILED = enumC617610OKh8;
        EnumC617610OKh enumC617610OKh9 = new EnumC617610OKh("LOCAL_CRASH", 8, 9002000);
        LOCAL_CRASH = enumC617610OKh9;
        EnumC617610OKh enumC617610OKh10 = new EnumC617610OKh("ACCESS_CONTROL_FAILED", 9, 9003000);
        ACCESS_CONTROL_FAILED = enumC617610OKh10;
        EnumC617610OKh enumC617610OKh11 = new EnumC617610OKh("LYNX_LOAD_ERROR", 10, 9005000);
        LYNX_LOAD_ERROR = enumC617610OKh11;
        EnumC617610OKh[] enumC617610OKhArr = {enumC617610OKh, enumC617610OKh2, enumC617610OKh3, enumC617610OKh4, enumC617610OKh5, enumC617610OKh6, enumC617610OKh7, enumC617610OKh8, enumC617610OKh9, enumC617610OKh10, enumC617610OKh11};
        LLILLJJLI = enumC617610OKhArr;
        LLILLL = new C2254308sP(enumC617610OKhArr);
    }

    public static EnumC617610OKh[] values() {
        return (EnumC617610OKh[]) LLILLJJLI.clone();
    }

    public final int getStatusCode() {
        return this.LL;
    }

    public static EnumC617610OKh valueOf(String str) {
        return (EnumC617610OKh) C08FF.LIZ(EnumC617610OKh.class, str);
    }

    public EnumC617610OKh(String str, int i, int i2) {
        this.LL = i2;
    }
}
