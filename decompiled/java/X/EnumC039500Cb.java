package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC039500Cb {
    public static final EnumC039500Cb CROP_ICON;
    public static final EnumC039500Cb INSPECTOR;
    public static final /* synthetic */ EnumC039500Cb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC039500Cb ONBOARDING;
    public static final EnumC039500Cb PROMOTION_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC039500Cb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC039500Cb enumC039500Cb = new EnumC039500Cb("PROMOTION_PAGE", 0, "promotion_page");
        PROMOTION_PAGE = enumC039500Cb;
        EnumC039500Cb enumC039500Cb2 = new EnumC039500Cb("ONBOARDING", 1, "onboarding");
        ONBOARDING = enumC039500Cb2;
        EnumC039500Cb enumC039500Cb3 = new EnumC039500Cb("INSPECTOR", 2, "inspector");
        INSPECTOR = enumC039500Cb3;
        EnumC039500Cb enumC039500Cb4 = new EnumC039500Cb("CROP_ICON", 3, "crop_icon");
        CROP_ICON = enumC039500Cb4;
        EnumC039500Cb[] enumC039500CbArr = {enumC039500Cb, enumC039500Cb2, enumC039500Cb3, enumC039500Cb4};
        LLILLJJLI = enumC039500CbArr;
        LLILLL = new C2254308sP(enumC039500CbArr);
    }

    public static EnumC039500Cb[] values() {
        return (EnumC039500Cb[]) LLILLJJLI.clone();
    }

    public final String getFromName() {
        return this.LL;
    }

    public static EnumC039500Cb valueOf(String str) {
        return (EnumC039500Cb) C08FF.LIZ(EnumC039500Cb.class, str);
    }

    public EnumC039500Cb(String str, int i, String str2) {
        this.LL = str2;
    }
}
