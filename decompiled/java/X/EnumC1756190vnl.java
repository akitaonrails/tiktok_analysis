package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756190vnl {
    public static final EnumC1756190vnl AFTER_PAGE_CREATE;
    public static final EnumC1756190vnl BEFORE_PAGE_CREATE;
    public static final EnumC1756190vnl BEFORE_PAGE_OPEN;
    public static final /* synthetic */ EnumC1756190vnl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1756190vnl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1756190vnl enumC1756190vnl = new EnumC1756190vnl("BEFORE_PAGE_OPEN", 0, "before_page_open");
        BEFORE_PAGE_OPEN = enumC1756190vnl;
        EnumC1756190vnl enumC1756190vnl2 = new EnumC1756190vnl("BEFORE_PAGE_CREATE", 1, "before_page_create");
        BEFORE_PAGE_CREATE = enumC1756190vnl2;
        EnumC1756190vnl enumC1756190vnl3 = new EnumC1756190vnl("AFTER_PAGE_CREATE", 2, "after_page_create");
        AFTER_PAGE_CREATE = enumC1756190vnl3;
        EnumC1756190vnl[] enumC1756190vnlArr = {enumC1756190vnl, enumC1756190vnl2, enumC1756190vnl3};
        LLILLJJLI = enumC1756190vnlArr;
        LLILLL = new C2254308sP(enumC1756190vnlArr);
    }

    public static EnumC1756190vnl[] values() {
        return (EnumC1756190vnl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1756190vnl valueOf(String str) {
        return (EnumC1756190vnl) C08FF.LIZ(EnumC1756190vnl.class, str);
    }

    public EnumC1756190vnl(String str, int i, String str2) {
        this.LL = str2;
    }
}
