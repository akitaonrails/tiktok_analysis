package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992340bvk {
    public static final EnumC992340bvk CASHIER_PAYMENT_INFO;
    public static final /* synthetic */ EnumC992340bvk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992340bvk PRODUCT_CODE;

    public static InterfaceC2044707zh<EnumC992340bvk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992340bvk enumC992340bvk = new EnumC992340bvk("CASHIER_PAYMENT_INFO", 0);
        CASHIER_PAYMENT_INFO = enumC992340bvk;
        EnumC992340bvk enumC992340bvk2 = new EnumC992340bvk("PRODUCT_CODE", 1);
        PRODUCT_CODE = enumC992340bvk2;
        EnumC992340bvk[] enumC992340bvkArr = {enumC992340bvk, enumC992340bvk2};
        LL = enumC992340bvkArr;
        LLILLJJLI = new C2254308sP(enumC992340bvkArr);
    }

    public static EnumC992340bvk[] values() {
        return (EnumC992340bvk[]) LL.clone();
    }

    public static EnumC992340bvk valueOf(String str) {
        return (EnumC992340bvk) C08FF.LIZ(EnumC992340bvk.class, str);
    }

    public EnumC992340bvk(String str, int i) {
    }
}
