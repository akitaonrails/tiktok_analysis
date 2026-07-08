package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC645590PTx {
    public static final EnumC645590PTx ECOM;
    public static final EnumC645590PTx ECOM_RECOMMEND_PRODUCTS;
    public static final EnumC645590PTx GENERAL;
    public static final /* synthetic */ EnumC645590PTx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC645590PTx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC645590PTx enumC645590PTx = new EnumC645590PTx("GENERAL", 0);
        GENERAL = enumC645590PTx;
        EnumC645590PTx enumC645590PTx2 = new EnumC645590PTx("ECOM", 1);
        ECOM = enumC645590PTx2;
        EnumC645590PTx enumC645590PTx3 = new EnumC645590PTx("ECOM_RECOMMEND_PRODUCTS", 2);
        ECOM_RECOMMEND_PRODUCTS = enumC645590PTx3;
        EnumC645590PTx[] enumC645590PTxArr = {enumC645590PTx, enumC645590PTx2, enumC645590PTx3};
        LL = enumC645590PTxArr;
        LLILLJJLI = new C2254308sP(enumC645590PTxArr);
    }

    public static EnumC645590PTx[] values() {
        return (EnumC645590PTx[]) LL.clone();
    }

    public static EnumC645590PTx valueOf(String str) {
        return (EnumC645590PTx) C08FF.LIZ(EnumC645590PTx.class, str);
    }

    public EnumC645590PTx(String str, int i) {
    }
}
