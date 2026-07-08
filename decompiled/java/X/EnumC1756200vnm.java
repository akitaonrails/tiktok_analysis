package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756200vnm {
    public static final EnumC1756200vnm AFTER_PAGE_CREATE;
    public static final EnumC1756200vnm BEFORE_PAGE_CREATE;
    public static final EnumC1756200vnm BEFORE_PAGE_OPEN;
    public static final /* synthetic */ EnumC1756200vnm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1756200vnm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1756200vnm enumC1756200vnm = new EnumC1756200vnm("BEFORE_PAGE_OPEN", 0, "before_page_open");
        BEFORE_PAGE_OPEN = enumC1756200vnm;
        EnumC1756200vnm enumC1756200vnm2 = new EnumC1756200vnm("BEFORE_PAGE_CREATE", 1, "before_page_create");
        BEFORE_PAGE_CREATE = enumC1756200vnm2;
        EnumC1756200vnm enumC1756200vnm3 = new EnumC1756200vnm("AFTER_PAGE_CREATE", 2, "after_page_create");
        AFTER_PAGE_CREATE = enumC1756200vnm3;
        EnumC1756200vnm[] enumC1756200vnmArr = {enumC1756200vnm, enumC1756200vnm2, enumC1756200vnm3};
        LLILLJJLI = enumC1756200vnmArr;
        LLILLL = new C2254308sP(enumC1756200vnmArr);
    }

    public static EnumC1756200vnm[] values() {
        return (EnumC1756200vnm[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1756200vnm valueOf(String str) {
        return (EnumC1756200vnm) C08FF.LIZ(EnumC1756200vnm.class, str);
    }

    public EnumC1756200vnm(String str, int i, String str2) {
        this.LL = str2;
    }
}
