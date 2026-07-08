package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441390HSn {
    public static final EnumC441390HSn DM_STICKER_FETCH;
    public static final EnumC441390HSn IMAGE_FETCH;
    public static final EnumC441390HSn IMAGE_UPLOAD_KEY;
    public static final /* synthetic */ EnumC441390HSn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC441390HSn MIX_STUDIO_LATEST;
    public static final EnumC441390HSn QUOTA_CHECK;
    public static final EnumC441390HSn STICKER_CREATE_REQ;
    public static final EnumC441390HSn TASK_SUBMISSION;
    public static final EnumC441390HSn TNS_CHECK;
    public static final EnumC441390HSn UPLOAD_IMAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC441390HSn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC441390HSn enumC441390HSn = new EnumC441390HSn("IMAGE_UPLOAD_KEY", 0, "image_upload_key");
        IMAGE_UPLOAD_KEY = enumC441390HSn;
        EnumC441390HSn enumC441390HSn2 = new EnumC441390HSn("UPLOAD_IMAGE", 1, "upload_image");
        UPLOAD_IMAGE = enumC441390HSn2;
        EnumC441390HSn enumC441390HSn3 = new EnumC441390HSn("STICKER_CREATE_REQ", 2, "sticker_create_req");
        STICKER_CREATE_REQ = enumC441390HSn3;
        EnumC441390HSn enumC441390HSn4 = new EnumC441390HSn("QUOTA_CHECK", 3, "quota_check");
        QUOTA_CHECK = enumC441390HSn4;
        EnumC441390HSn enumC441390HSn5 = new EnumC441390HSn("TNS_CHECK", 4, "tns_check");
        TNS_CHECK = enumC441390HSn5;
        EnumC441390HSn enumC441390HSn6 = new EnumC441390HSn("IMAGE_FETCH", 5, "image_fetch");
        IMAGE_FETCH = enumC441390HSn6;
        EnumC441390HSn enumC441390HSn7 = new EnumC441390HSn("TASK_SUBMISSION", 6, "task_submission");
        TASK_SUBMISSION = enumC441390HSn7;
        EnumC441390HSn enumC441390HSn8 = new EnumC441390HSn("MIX_STUDIO_LATEST", 7, "imagine_studio_latest");
        MIX_STUDIO_LATEST = enumC441390HSn8;
        EnumC441390HSn enumC441390HSn9 = new EnumC441390HSn("DM_STICKER_FETCH", 8, "dm_sticker_fetch");
        DM_STICKER_FETCH = enumC441390HSn9;
        EnumC441390HSn[] enumC441390HSnArr = {enumC441390HSn, enumC441390HSn2, enumC441390HSn3, enumC441390HSn4, enumC441390HSn5, enumC441390HSn6, enumC441390HSn7, enumC441390HSn8, enumC441390HSn9};
        LLILLJJLI = enumC441390HSnArr;
        LLILLL = new C2254308sP(enumC441390HSnArr);
    }

    public static EnumC441390HSn[] values() {
        return (EnumC441390HSn[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC441390HSn valueOf(String str) {
        return (EnumC441390HSn) C08FF.LIZ(EnumC441390HSn.class, str);
    }

    public EnumC441390HSn(String str, int i, String str2) {
        this.LL = str2;
    }
}
