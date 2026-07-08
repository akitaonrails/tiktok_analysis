package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC696450RTn {
    public static final /* synthetic */ EnumC696450RTn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC696450RTn MANAGE;
    public static final EnumC696450RTn NOTICE;
    public static final EnumC696450RTn TOP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC696450RTn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC696450RTn enumC696450RTn = new EnumC696450RTn("TOP", 0, "popup_page_top");
        TOP = enumC696450RTn;
        EnumC696450RTn enumC696450RTn2 = new EnumC696450RTn("NOTICE", 1, "popup_page_notice");
        NOTICE = enumC696450RTn2;
        EnumC696450RTn enumC696450RTn3 = new EnumC696450RTn("MANAGE", 2, "topic_manage_page");
        MANAGE = enumC696450RTn3;
        EnumC696450RTn[] enumC696450RTnArr = {enumC696450RTn, enumC696450RTn2, enumC696450RTn3};
        LLILLJJLI = enumC696450RTnArr;
        LLILLL = new C2254308sP(enumC696450RTnArr);
    }

    public static EnumC696450RTn[] values() {
        return (EnumC696450RTn[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC696450RTn valueOf(String str) {
        return (EnumC696450RTn) C08FF.LIZ(EnumC696450RTn.class, str);
    }

    public EnumC696450RTn(String str, int i, String str2) {
        this.LL = str2;
    }
}
