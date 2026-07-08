package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC578980MnI {
    public static final EnumC578980MnI CLICK_RECORD_BUTTON;
    public static final /* synthetic */ EnumC578980MnI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC578980MnI TAP_TO_START;
    public static final EnumC578980MnI UPLOAD_IMAGE;
    public static final EnumC578980MnI UPLOAD_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC578980MnI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC578980MnI enumC578980MnI = new EnumC578980MnI("CLICK_RECORD_BUTTON", 0, "click_record_button");
        CLICK_RECORD_BUTTON = enumC578980MnI;
        EnumC578980MnI enumC578980MnI2 = new EnumC578980MnI("TAP_TO_START", 1, "tap_to_start");
        TAP_TO_START = enumC578980MnI2;
        EnumC578980MnI enumC578980MnI3 = new EnumC578980MnI("UPLOAD_IMAGE", 2, "upload_image");
        UPLOAD_IMAGE = enumC578980MnI3;
        EnumC578980MnI enumC578980MnI4 = new EnumC578980MnI("UPLOAD_VIDEO", 3, "upload_video");
        UPLOAD_VIDEO = enumC578980MnI4;
        EnumC578980MnI[] enumC578980MnIArr = {enumC578980MnI, enumC578980MnI2, enumC578980MnI3, enumC578980MnI4};
        LLILLJJLI = enumC578980MnIArr;
        LLILLL = new C2254308sP(enumC578980MnIArr);
    }

    public static EnumC578980MnI[] values() {
        return (EnumC578980MnI[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC578980MnI valueOf(String str) {
        return (EnumC578980MnI) C08FF.LIZ(EnumC578980MnI.class, str);
    }

    public EnumC578980MnI(String str, int i, String str2) {
        this.LL = str2;
    }
}
