package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC513400KBm {
    public static final /* synthetic */ EnumC513400KBm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC513400KBm PACKAGE_PAGE;
    public static final EnumC513400KBm PACKAGE_PAGE_V2;
    public static final EnumC513400KBm PLAN_CHANGE_PAGE;
    public static final EnumC513400KBm UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC513400KBm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC513400KBm enumC513400KBm = new EnumC513400KBm("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC513400KBm;
        EnumC513400KBm enumC513400KBm2 = new EnumC513400KBm("PACKAGE_PAGE", 1, "package_page");
        PACKAGE_PAGE = enumC513400KBm2;
        EnumC513400KBm enumC513400KBm3 = new EnumC513400KBm("PLAN_CHANGE_PAGE", 2, "plan_change");
        PLAN_CHANGE_PAGE = enumC513400KBm3;
        EnumC513400KBm enumC513400KBm4 = new EnumC513400KBm("PACKAGE_PAGE_V2", 3, "package_page_new");
        PACKAGE_PAGE_V2 = enumC513400KBm4;
        EnumC513400KBm[] enumC513400KBmArr = {enumC513400KBm, enumC513400KBm2, enumC513400KBm3, enumC513400KBm4};
        LLILLJJLI = enumC513400KBmArr;
        LLILLL = new C2254308sP(enumC513400KBmArr);
    }

    public static EnumC513400KBm[] values() {
        return (EnumC513400KBm[]) LLILLJJLI.clone();
    }

    public final String getPageName() {
        return this.LL;
    }

    public static EnumC513400KBm valueOf(String str) {
        return (EnumC513400KBm) C08FF.LIZ(EnumC513400KBm.class, str);
    }

    public EnumC513400KBm(String str, int i, String str2) {
        this.LL = str2;
    }
}
