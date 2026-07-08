package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ufr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC778210Ufr {
    public static final EnumC778210Ufr BANNER;
    public static final EnumC778210Ufr GO_LIVE_POPUP;
    public static final EnumC778210Ufr H5;
    public static final EnumC778210Ufr LIVE_POPUP;
    public static final /* synthetic */ EnumC778210Ufr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC778210Ufr OUT_TOAST;
    public static final EnumC778210Ufr POPUP;
    public static final EnumC778210Ufr RED_TOAST;
    public static final EnumC778210Ufr SETTING_POPUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC778210Ufr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC778210Ufr enumC778210Ufr = new EnumC778210Ufr("BANNER", 0, "golive_banner");
        BANNER = enumC778210Ufr;
        EnumC778210Ufr enumC778210Ufr2 = new EnumC778210Ufr("POPUP", 1, "popup");
        POPUP = enumC778210Ufr2;
        EnumC778210Ufr enumC778210Ufr3 = new EnumC778210Ufr("OUT_TOAST", 2, "out_toast");
        OUT_TOAST = enumC778210Ufr3;
        EnumC778210Ufr enumC778210Ufr4 = new EnumC778210Ufr("H5", 3, "H5");
        H5 = enumC778210Ufr4;
        EnumC778210Ufr enumC778210Ufr5 = new EnumC778210Ufr("SETTING_POPUP", 4, "go_setting_popup");
        SETTING_POPUP = enumC778210Ufr5;
        EnumC778210Ufr enumC778210Ufr6 = new EnumC778210Ufr("RED_TOAST", 5, "red_toast");
        RED_TOAST = enumC778210Ufr6;
        EnumC778210Ufr enumC778210Ufr7 = new EnumC778210Ufr("LIVE_POPUP", 6, "live_popup");
        LIVE_POPUP = enumC778210Ufr7;
        EnumC778210Ufr enumC778210Ufr8 = new EnumC778210Ufr("GO_LIVE_POPUP", 7, "golive_popup");
        GO_LIVE_POPUP = enumC778210Ufr8;
        EnumC778210Ufr[] enumC778210UfrArr = {enumC778210Ufr, enumC778210Ufr2, enumC778210Ufr3, enumC778210Ufr4, enumC778210Ufr5, enumC778210Ufr6, enumC778210Ufr7, enumC778210Ufr8};
        LLILLJJLI = enumC778210UfrArr;
        LLILLL = new C2254308sP(enumC778210UfrArr);
    }

    public static EnumC778210Ufr[] values() {
        return (EnumC778210Ufr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC778210Ufr valueOf(String str) {
        return (EnumC778210Ufr) C08FF.LIZ(EnumC778210Ufr.class, str);
    }

    public EnumC778210Ufr(String str, int i, String str2) {
        this.LL = str2;
    }
}
