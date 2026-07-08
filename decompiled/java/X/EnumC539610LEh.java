package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC539610LEh {
    public static final EnumC539610LEh ALBUM_AUTH_DENY;
    public static final EnumC539610LEh IMAGE_BITMAP_NULL;
    public static final EnumC539610LEh IMAGE_BITMAP_OUT_OF_MEMORY_ERROR;
    public static final EnumC539610LEh IMAGE_SAVE_BITMAP_WRONG;
    public static final /* synthetic */ EnumC539610LEh[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC539610LEh RECORD_AUTH_DENY;
    public static final EnumC539610LEh RECORD_COROUTINE_SCOPE_INACTIVE;
    public static final EnumC539610LEh RECORD_PHOTO_PROCESS_TIMEOUT;
    public static final EnumC539610LEh RECORD_VIDEO_PROCESS_TIMEOUT;
    public static final EnumC539610LEh UPLOAD_COROUTINE_SCOPE_INACTIVE;
    public static final EnumC539610LEh UPLOAD_MIX_PROCESS_TIMEOUT;
    public static final EnumC539610LEh VIDEO_COMPRESS_TASK_CANCEL;
    public static final EnumC539610LEh VIDEO_COMPRESS_TASK_ERROR;
    public static final EnumC539610LEh VIDEO_COVER_BIMAP_NULL;
    public static final EnumC539610LEh VIDEO_EXTRACT_FRAME_NULL;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC539610LEh> getEntries() {
        return LLILZ;
    }

    static {
        EnumC539610LEh enumC539610LEh = new EnumC539610LEh("RECORD_COROUTINE_SCOPE_INACTIVE", 0, 1, "buildRecordReturnArguments is not active");
        RECORD_COROUTINE_SCOPE_INACTIVE = enumC539610LEh;
        EnumC539610LEh enumC539610LEh2 = new EnumC539610LEh("UPLOAD_COROUTINE_SCOPE_INACTIVE", 1, 2, "buildUploadReturnArguments is not active");
        UPLOAD_COROUTINE_SCOPE_INACTIVE = enumC539610LEh2;
        EnumC539610LEh enumC539610LEh3 = new EnumC539610LEh("IMAGE_BITMAP_NULL", 2, 3, "image_bitmap_null");
        IMAGE_BITMAP_NULL = enumC539610LEh3;
        EnumC539610LEh enumC539610LEh4 = new EnumC539610LEh("IMAGE_BITMAP_OUT_OF_MEMORY_ERROR", 3, 4, "image_bitmap_OutOfMemoryError");
        IMAGE_BITMAP_OUT_OF_MEMORY_ERROR = enumC539610LEh4;
        EnumC539610LEh enumC539610LEh5 = new EnumC539610LEh("IMAGE_SAVE_BITMAP_WRONG", 4, 5, "image save bitmap wrong");
        IMAGE_SAVE_BITMAP_WRONG = enumC539610LEh5;
        EnumC539610LEh enumC539610LEh6 = new EnumC539610LEh("VIDEO_COMPRESS_TASK_ERROR", 5, 6, "video compress task error");
        VIDEO_COMPRESS_TASK_ERROR = enumC539610LEh6;
        EnumC539610LEh enumC539610LEh7 = new EnumC539610LEh("VIDEO_COMPRESS_TASK_CANCEL", 6, 7, "video compress task cancel");
        VIDEO_COMPRESS_TASK_CANCEL = enumC539610LEh7;
        EnumC539610LEh enumC539610LEh8 = new EnumC539610LEh("VIDEO_EXTRACT_FRAME_NULL", 7, 8, "video extract frame is null");
        VIDEO_EXTRACT_FRAME_NULL = enumC539610LEh8;
        EnumC539610LEh enumC539610LEh9 = new EnumC539610LEh("VIDEO_COVER_BIMAP_NULL", 8, 9, "video cover bimap is null");
        VIDEO_COVER_BIMAP_NULL = enumC539610LEh9;
        EnumC539610LEh enumC539610LEh10 = new EnumC539610LEh("RECORD_PHOTO_PROCESS_TIMEOUT", 9, 10, "record photo compress procedure timeout");
        RECORD_PHOTO_PROCESS_TIMEOUT = enumC539610LEh10;
        EnumC539610LEh enumC539610LEh11 = new EnumC539610LEh("RECORD_VIDEO_PROCESS_TIMEOUT", 10, 11, "record video compress procedure timeout");
        RECORD_VIDEO_PROCESS_TIMEOUT = enumC539610LEh11;
        EnumC539610LEh enumC539610LEh12 = new EnumC539610LEh("UPLOAD_MIX_PROCESS_TIMEOUT", 11, 12, "upload mix compress procedure timeout");
        UPLOAD_MIX_PROCESS_TIMEOUT = enumC539610LEh12;
        EnumC539610LEh enumC539610LEh13 = new EnumC539610LEh("RECORD_AUTH_DENY", 12, 13, "record authority deny");
        RECORD_AUTH_DENY = enumC539610LEh13;
        EnumC539610LEh enumC539610LEh14 = new EnumC539610LEh("ALBUM_AUTH_DENY", 13, 14, "album authority deny");
        ALBUM_AUTH_DENY = enumC539610LEh14;
        EnumC539610LEh[] enumC539610LEhArr = {enumC539610LEh, enumC539610LEh2, enumC539610LEh3, enumC539610LEh4, enumC539610LEh5, enumC539610LEh6, enumC539610LEh7, enumC539610LEh8, enumC539610LEh9, enumC539610LEh10, enumC539610LEh11, enumC539610LEh12, enumC539610LEh13, enumC539610LEh14};
        LLILLL = enumC539610LEhArr;
        LLILZ = new C2254308sP(enumC539610LEhArr);
    }

    public static EnumC539610LEh[] values() {
        return (EnumC539610LEh[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorDesc() {
        return this.LLILLJJLI;
    }

    public static EnumC539610LEh valueOf(String str) {
        return (EnumC539610LEh) C08FF.LIZ(EnumC539610LEh.class, str);
    }

    public EnumC539610LEh(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
