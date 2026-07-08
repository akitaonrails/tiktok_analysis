package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC513390KBl {
    public static final /* synthetic */ EnumC513390KBl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC513390KBl PACKAGE_PAGE;
    public static final EnumC513390KBl PACKAGE_PAGE_V2;
    public static final EnumC513390KBl PLAN_CHANGE_PAGE;
    public static final EnumC513390KBl UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC513390KBl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC513390KBl enumC513390KBl = new EnumC513390KBl("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC513390KBl;
        EnumC513390KBl enumC513390KBl2 = new EnumC513390KBl("PACKAGE_PAGE", 1, "package_page");
        PACKAGE_PAGE = enumC513390KBl2;
        EnumC513390KBl enumC513390KBl3 = new EnumC513390KBl("PLAN_CHANGE_PAGE", 2, "plan_change");
        PLAN_CHANGE_PAGE = enumC513390KBl3;
        EnumC513390KBl enumC513390KBl4 = new EnumC513390KBl("PACKAGE_PAGE_V2", 3, "package_page_new");
        PACKAGE_PAGE_V2 = enumC513390KBl4;
        EnumC513390KBl[] enumC513390KBlArr = {enumC513390KBl, enumC513390KBl2, enumC513390KBl3, enumC513390KBl4};
        LLILLJJLI = enumC513390KBlArr;
        LLILLL = new C2254308sP(enumC513390KBlArr);
    }

    public static EnumC513390KBl[] values() {
        return (EnumC513390KBl[]) LLILLJJLI.clone();
    }

    public final String getPageName() {
        return this.LL;
    }

    public static EnumC513390KBl valueOf(String str) {
        return (EnumC513390KBl) C08FF.LIZ(EnumC513390KBl.class, str);
    }

    public EnumC513390KBl(String str, int i, String str2) {
        this.LL = str2;
    }
}
