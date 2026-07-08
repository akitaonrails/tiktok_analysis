package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC852630Xcb {
    public static final EnumC852630Xcb CHANGE_EMAIL;
    public static final EnumC852630Xcb CHANGE_MOBILE;
    public static final EnumC852630Xcb CHANGE_PASSWORD;
    public static final /* synthetic */ EnumC852630Xcb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC852630Xcb ONE_P_POPUP;
    public static final EnumC852630Xcb SECURITY_CHECKUP_TOOL;
    public static final EnumC852630Xcb UNBIND_EMAIL;
    public static final EnumC852630Xcb UNBIND_MOBILE;
    public static final EnumC852630Xcb UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC852630Xcb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC852630Xcb enumC852630Xcb = new EnumC852630Xcb("UNKNOWN", 0, 0);
        UNKNOWN = enumC852630Xcb;
        EnumC852630Xcb enumC852630Xcb2 = new EnumC852630Xcb("CHANGE_EMAIL", 1, 1);
        CHANGE_EMAIL = enumC852630Xcb2;
        EnumC852630Xcb enumC852630Xcb3 = new EnumC852630Xcb("UNBIND_EMAIL", 2, 2);
        UNBIND_EMAIL = enumC852630Xcb3;
        EnumC852630Xcb enumC852630Xcb4 = new EnumC852630Xcb("CHANGE_MOBILE", 3, 3);
        CHANGE_MOBILE = enumC852630Xcb4;
        EnumC852630Xcb enumC852630Xcb5 = new EnumC852630Xcb("UNBIND_MOBILE", 4, 4);
        UNBIND_MOBILE = enumC852630Xcb5;
        EnumC852630Xcb enumC852630Xcb6 = new EnumC852630Xcb("SECURITY_CHECKUP_TOOL", 5, 6);
        SECURITY_CHECKUP_TOOL = enumC852630Xcb6;
        EnumC852630Xcb enumC852630Xcb7 = new EnumC852630Xcb("CHANGE_PASSWORD", 6, 10);
        CHANGE_PASSWORD = enumC852630Xcb7;
        EnumC852630Xcb enumC852630Xcb8 = new EnumC852630Xcb("ONE_P_POPUP", 7, 11);
        ONE_P_POPUP = enumC852630Xcb8;
        EnumC852630Xcb[] enumC852630XcbArr = {enumC852630Xcb, enumC852630Xcb2, enumC852630Xcb3, enumC852630Xcb4, enumC852630Xcb5, enumC852630Xcb6, enumC852630Xcb7, enumC852630Xcb8};
        LLILLJJLI = enumC852630XcbArr;
        LLILLL = new C2254308sP(enumC852630XcbArr);
    }

    public static EnumC852630Xcb[] values() {
        return (EnumC852630Xcb[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC852630Xcb valueOf(String str) {
        return (EnumC852630Xcb) C08FF.LIZ(EnumC852630Xcb.class, str);
    }

    public EnumC852630Xcb(String str, int i, int i2) {
        this.LL = i2;
    }
}
