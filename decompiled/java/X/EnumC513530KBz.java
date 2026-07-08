package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC513530KBz {
    public static final EnumC513530KBz CONTENT_FIT;
    public static final C0KC3 Companion;
    public static final EnumC513530KBz FIXED_6;
    public static final EnumC513530KBz FIXED_7;
    public static final EnumC513530KBz FULL_PAGE;
    public static final /* synthetic */ EnumC513530KBz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC513530KBz MAX_6;
    public static final EnumC513530KBz PACKAGE_PAGE;
    public static final EnumC513530KBz PRIVILEGE_POPUP;
    public static final EnumC513530KBz UNCONSTRAINED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC513530KBz> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0KC3] */
    static {
        EnumC513530KBz enumC513530KBz = new EnumC513530KBz("CONTENT_FIT", 0, "content_fit");
        CONTENT_FIT = enumC513530KBz;
        EnumC513530KBz enumC513530KBz2 = new EnumC513530KBz("MAX_6", 1, "max_6");
        MAX_6 = enumC513530KBz2;
        EnumC513530KBz enumC513530KBz3 = new EnumC513530KBz("FIXED_6", 2, "fixed_6");
        FIXED_6 = enumC513530KBz3;
        EnumC513530KBz enumC513530KBz4 = new EnumC513530KBz("FIXED_7", 3, "fixed_7");
        FIXED_7 = enumC513530KBz4;
        EnumC513530KBz enumC513530KBz5 = new EnumC513530KBz("PACKAGE_PAGE", 4, "package_page");
        PACKAGE_PAGE = enumC513530KBz5;
        EnumC513530KBz enumC513530KBz6 = new EnumC513530KBz("PRIVILEGE_POPUP", 5, "privilege_popup");
        PRIVILEGE_POPUP = enumC513530KBz6;
        EnumC513530KBz enumC513530KBz7 = new EnumC513530KBz("FULL_PAGE", 6, "full_page");
        FULL_PAGE = enumC513530KBz7;
        EnumC513530KBz enumC513530KBz8 = new EnumC513530KBz("UNCONSTRAINED", 7, "unconstrained");
        UNCONSTRAINED = enumC513530KBz8;
        EnumC513530KBz[] enumC513530KBzArr = {enumC513530KBz, enumC513530KBz2, enumC513530KBz3, enumC513530KBz4, enumC513530KBz5, enumC513530KBz6, enumC513530KBz7, enumC513530KBz8};
        LLILLJJLI = enumC513530KBzArr;
        LLILLL = new C2254308sP(enumC513530KBzArr);
        Companion = new Object() { // from class: X.0KC3
        };
    }

    public static EnumC513530KBz[] values() {
        return (EnumC513530KBz[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC513530KBz valueOf(String str) {
        return (EnumC513530KBz) C08FF.LIZ(EnumC513530KBz.class, str);
    }

    public EnumC513530KBz(String str, int i, String str2) {
        this.LL = str2;
    }
}
