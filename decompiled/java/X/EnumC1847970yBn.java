package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1847970yBn {
    public static final EnumC1847970yBn APP_EVENT;
    public static final EnumC1847970yBn CLICK_EVENT;
    public static final EnumC1847970yBn CUSTOM_EVENT;
    public static final /* synthetic */ EnumC1847970yBn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1847970yBn PAGE;
    public static final EnumC1847970yBn SUBPAGE;
    public static final EnumC1847970yBn UNDEFINED_XPATH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1847970yBn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1847970yBn enumC1847970yBn = new EnumC1847970yBn("PAGE", 0, 0);
        PAGE = enumC1847970yBn;
        EnumC1847970yBn enumC1847970yBn2 = new EnumC1847970yBn("SUBPAGE", 1, 1);
        SUBPAGE = enumC1847970yBn2;
        EnumC1847970yBn enumC1847970yBn3 = new EnumC1847970yBn("APP_EVENT", 2, 2);
        APP_EVENT = enumC1847970yBn3;
        EnumC1847970yBn enumC1847970yBn4 = new EnumC1847970yBn("CLICK_EVENT", 3, 3);
        CLICK_EVENT = enumC1847970yBn4;
        EnumC1847970yBn enumC1847970yBn5 = new EnumC1847970yBn("CUSTOM_EVENT", 4, 4);
        CUSTOM_EVENT = enumC1847970yBn5;
        EnumC1847970yBn enumC1847970yBn6 = new EnumC1847970yBn("UNDEFINED_XPATH", 5, 5);
        UNDEFINED_XPATH = enumC1847970yBn6;
        EnumC1847970yBn[] enumC1847970yBnArr = {enumC1847970yBn, enumC1847970yBn2, enumC1847970yBn3, enumC1847970yBn4, enumC1847970yBn5, enumC1847970yBn6};
        LLILLJJLI = enumC1847970yBnArr;
        LLILLL = new C2254308sP(enumC1847970yBnArr);
    }

    public static EnumC1847970yBn[] values() {
        return (EnumC1847970yBn[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1847970yBn valueOf(String str) {
        return (EnumC1847970yBn) C08FF.LIZ(EnumC1847970yBn.class, str);
    }

    public EnumC1847970yBn(String str, int i, int i2) {
        this.LL = i2;
    }
}
