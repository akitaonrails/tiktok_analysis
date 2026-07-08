package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1115870f8z {
    public static final EnumC1115870f8z ECOMMERCE;
    public static final EnumC1115870f8z LEADS_BUSINESS;
    public static final /* synthetic */ EnumC1115870f8z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1115870f8z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1115870f8z enumC1115870f8z = new EnumC1115870f8z("ECOMMERCE", 0, "ecom");
        ECOMMERCE = enumC1115870f8z;
        EnumC1115870f8z enumC1115870f8z2 = new EnumC1115870f8z("LEADS_BUSINESS", 1, "leads_biz");
        LEADS_BUSINESS = enumC1115870f8z2;
        EnumC1115870f8z[] enumC1115870f8zArr = {enumC1115870f8z, enumC1115870f8z2};
        LLILLJJLI = enumC1115870f8zArr;
        LLILLL = new C2254308sP(enumC1115870f8zArr);
    }

    public static EnumC1115870f8z[] values() {
        return (EnumC1115870f8z[]) LLILLJJLI.clone();
    }

    public final String getBizType() {
        return this.LL;
    }

    public static EnumC1115870f8z valueOf(String str) {
        return (EnumC1115870f8z) C08FF.LIZ(EnumC1115870f8z.class, str);
    }

    public EnumC1115870f8z(String str, int i, String str2) {
        this.LL = str2;
    }
}
