package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC355970DxT {
    public static final EnumC355970DxT APPLY_TIME_OUT_ERROR;
    public static final EnumC355970DxT ASYNC_TASK_FAIL;
    public static final EnumC355970DxT EFFECT_CACHE_ERROR;
    public static final EnumC355970DxT EFFECT_PATH_NOT_EXIST_ERROR;
    public static final EnumC355970DxT EFFECT_RENDERING_ERROR;
    public static final /* synthetic */ EnumC355970DxT[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC355970DxT NO_FACE_ERROR;
    public static final EnumC355970DxT NO_FULL_BODY_ERROR;
    public static final EnumC355970DxT NO_VALID_IMAGE;
    public static final EnumC355970DxT QUOTA_EXCEED;
    public static final EnumC355970DxT SLOW_MOTION_EFFECT_MSG_PARSE_ERROR;
    public static final EnumC355970DxT SLOW_MOTION_EFFECT_MSG_STATUS_ERROR;
    public static final EnumC355970DxT SLOW_MOTION_EXPORT_VIDEO_ERROR;
    public static final EnumC355970DxT TEMPLATEMODEL_NULL_ERROR;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC355970DxT> getEntries() {
        return LLILZ;
    }

    static {
        EnumC355970DxT enumC355970DxT = new EnumC355970DxT("EFFECT_RENDERING_ERROR", 0, -20000, "EFFECT_RENDERING_ERROR");
        EFFECT_RENDERING_ERROR = enumC355970DxT;
        EnumC355970DxT enumC355970DxT2 = new EnumC355970DxT("EFFECT_CACHE_ERROR", 1, -20001, "EFFECT_CACHE_ERROR");
        EFFECT_CACHE_ERROR = enumC355970DxT2;
        EnumC355970DxT enumC355970DxT3 = new EnumC355970DxT("APPLY_TIME_OUT_ERROR", 2, -20002, "APPLY_TIME_OUT_ERROR");
        APPLY_TIME_OUT_ERROR = enumC355970DxT3;
        EnumC355970DxT enumC355970DxT4 = new EnumC355970DxT("TEMPLATEMODEL_NULL_ERROR", 3, -20003, "TEMPLATEMODEL_NULL_ERROR");
        TEMPLATEMODEL_NULL_ERROR = enumC355970DxT4;
        EnumC355970DxT enumC355970DxT5 = new EnumC355970DxT("EFFECT_PATH_NOT_EXIST_ERROR", 4, -20004, "EFFECT_PATH_NOT_EXIST_ERROR");
        EFFECT_PATH_NOT_EXIST_ERROR = enumC355970DxT5;
        EnumC355970DxT enumC355970DxT6 = new EnumC355970DxT("SLOW_MOTION_EFFECT_MSG_PARSE_ERROR", 5, -20005, "SLOW_MOTION_EFFECT_MSG_PARSE_ERROR");
        SLOW_MOTION_EFFECT_MSG_PARSE_ERROR = enumC355970DxT6;
        EnumC355970DxT enumC355970DxT7 = new EnumC355970DxT("SLOW_MOTION_EFFECT_MSG_STATUS_ERROR", 6, -20006, "SLOW_MOTION_EFFECT_MSG_STATUS_ERROR");
        SLOW_MOTION_EFFECT_MSG_STATUS_ERROR = enumC355970DxT7;
        EnumC355970DxT enumC355970DxT8 = new EnumC355970DxT("SLOW_MOTION_EXPORT_VIDEO_ERROR", 7, -20007, "SLOW_MOTION_EXPORT_VIDEO_ERROR");
        SLOW_MOTION_EXPORT_VIDEO_ERROR = enumC355970DxT8;
        EnumC355970DxT enumC355970DxT9 = new EnumC355970DxT("NO_FULL_BODY_ERROR", 8, -20008, "NO_FULL_BODY_ERROR");
        NO_FULL_BODY_ERROR = enumC355970DxT9;
        EnumC355970DxT enumC355970DxT10 = new EnumC355970DxT("NO_FACE_ERROR", 9, -20009, "NO_FACE_ERROR");
        NO_FACE_ERROR = enumC355970DxT10;
        EnumC355970DxT enumC355970DxT11 = new EnumC355970DxT("ASYNC_TASK_FAIL", 10, -20010, "ASYNC_TASK_FAIL");
        ASYNC_TASK_FAIL = enumC355970DxT11;
        EnumC355970DxT enumC355970DxT12 = new EnumC355970DxT("QUOTA_EXCEED", 11, -20011, "QUATO_EXCEED");
        QUOTA_EXCEED = enumC355970DxT12;
        EnumC355970DxT enumC355970DxT13 = new EnumC355970DxT("NO_VALID_IMAGE", 12, -20012, "NO_VALID_IMAGE");
        NO_VALID_IMAGE = enumC355970DxT13;
        EnumC355970DxT[] enumC355970DxTArr = {enumC355970DxT, enumC355970DxT2, enumC355970DxT3, enumC355970DxT4, enumC355970DxT5, enumC355970DxT6, enumC355970DxT7, enumC355970DxT8, enumC355970DxT9, enumC355970DxT10, enumC355970DxT11, enumC355970DxT12, enumC355970DxT13};
        LLILLL = enumC355970DxTArr;
        LLILZ = new C2254308sP(enumC355970DxTArr);
    }

    public static EnumC355970DxT[] values() {
        return (EnumC355970DxT[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    public static EnumC355970DxT valueOf(String str) {
        return (EnumC355970DxT) C08FF.LIZ(EnumC355970DxT.class, str);
    }

    public EnumC355970DxT(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
