package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672070QXt {
    public static final /* synthetic */ EnumC672070QXt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC672070QXt TYPE_BRAND_BUDGET;
    public static final EnumC672070QXt TYPE_FASHION;
    public static final EnumC672070QXt TYPE_FLASH_SALE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC672070QXt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC672070QXt enumC672070QXt = new EnumC672070QXt("TYPE_FASHION", 0, "ttf");
        TYPE_FASHION = enumC672070QXt;
        EnumC672070QXt enumC672070QXt2 = new EnumC672070QXt("TYPE_FLASH_SALE", 1, "flash_sale");
        TYPE_FLASH_SALE = enumC672070QXt2;
        EnumC672070QXt enumC672070QXt3 = new EnumC672070QXt("TYPE_BRAND_BUDGET", 2, "brand_diskon");
        TYPE_BRAND_BUDGET = enumC672070QXt3;
        EnumC672070QXt[] enumC672070QXtArr = {enumC672070QXt, enumC672070QXt2, enumC672070QXt3};
        LLILLJJLI = enumC672070QXtArr;
        LLILLL = new C2254308sP(enumC672070QXtArr);
    }

    public static EnumC672070QXt[] values() {
        return (EnumC672070QXt[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC672070QXt valueOf(String str) {
        return (EnumC672070QXt) C08FF.LIZ(EnumC672070QXt.class, str);
    }

    public EnumC672070QXt(String str, int i, String str2) {
        this.LL = str2;
    }
}
