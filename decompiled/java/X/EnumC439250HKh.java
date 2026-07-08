package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439250HKh {
    public static final EnumC439250HKh FAILURE_IMAGE_FACE_DETECTION_CHECK;
    public static final EnumC439250HKh FAILURE_IMAGE_INTERNAL_ERROR;
    public static final EnumC439250HKh FAILURE_IMAGE_TNS_CHECK;
    public static final EnumC439250HKh FAILURE_IMAGE_UPLOADING;
    public static final EnumC439250HKh FAILURE_INTERNET;
    public static final EnumC439250HKh FAILURE_MODEL_DOWNLOAD;
    public static final EnumC439250HKh FAILURE_SOCIAL_AVATAR_CREATE;
    public static final EnumC439250HKh FAILURE_SOCIAL_AVATAR_PROGRESS;
    public static final /* synthetic */ EnumC439250HKh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC439250HKh NORMAL;

    public static InterfaceC2044707zh<EnumC439250HKh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439250HKh enumC439250HKh = new EnumC439250HKh("NORMAL", 0);
        NORMAL = enumC439250HKh;
        EnumC439250HKh enumC439250HKh2 = new EnumC439250HKh("FAILURE_MODEL_DOWNLOAD", 1);
        FAILURE_MODEL_DOWNLOAD = enumC439250HKh2;
        EnumC439250HKh enumC439250HKh3 = new EnumC439250HKh("FAILURE_IMAGE_UPLOADING", 2);
        FAILURE_IMAGE_UPLOADING = enumC439250HKh3;
        EnumC439250HKh enumC439250HKh4 = new EnumC439250HKh("FAILURE_IMAGE_TNS_CHECK", 3);
        FAILURE_IMAGE_TNS_CHECK = enumC439250HKh4;
        EnumC439250HKh enumC439250HKh5 = new EnumC439250HKh("FAILURE_IMAGE_FACE_DETECTION_CHECK", 4);
        FAILURE_IMAGE_FACE_DETECTION_CHECK = enumC439250HKh5;
        EnumC439250HKh enumC439250HKh6 = new EnumC439250HKh("FAILURE_IMAGE_INTERNAL_ERROR", 5);
        FAILURE_IMAGE_INTERNAL_ERROR = enumC439250HKh6;
        EnumC439250HKh enumC439250HKh7 = new EnumC439250HKh("FAILURE_INTERNET", 6);
        FAILURE_INTERNET = enumC439250HKh7;
        EnumC439250HKh enumC439250HKh8 = new EnumC439250HKh("FAILURE_SOCIAL_AVATAR_CREATE", 7);
        FAILURE_SOCIAL_AVATAR_CREATE = enumC439250HKh8;
        EnumC439250HKh enumC439250HKh9 = new EnumC439250HKh("FAILURE_SOCIAL_AVATAR_PROGRESS", 8);
        FAILURE_SOCIAL_AVATAR_PROGRESS = enumC439250HKh9;
        EnumC439250HKh[] enumC439250HKhArr = {enumC439250HKh, enumC439250HKh2, enumC439250HKh3, enumC439250HKh4, enumC439250HKh5, enumC439250HKh6, enumC439250HKh7, enumC439250HKh8, enumC439250HKh9};
        LL = enumC439250HKhArr;
        LLILLJJLI = new C2254308sP(enumC439250HKhArr);
    }

    public static EnumC439250HKh[] values() {
        return (EnumC439250HKh[]) LL.clone();
    }

    public static EnumC439250HKh valueOf(String str) {
        return (EnumC439250HKh) C08FF.LIZ(EnumC439250HKh.class, str);
    }

    public EnumC439250HKh(String str, int i) {
    }
}
