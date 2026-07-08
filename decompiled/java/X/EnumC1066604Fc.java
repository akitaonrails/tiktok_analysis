package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04Fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1066604Fc {
    public static final EnumC1066604Fc BUTTON_CLICK;
    public static final EnumC1066604Fc BUTTON_SHOW;
    public static final EnumC1066604Fc CONFIRM_CART_RESULT;
    public static final EnumC1066604Fc CONFIRM_SKU;
    public static final EnumC1066604Fc ENTER_PRODUCT_DETAIL;
    public static final /* synthetic */ EnumC1066604Fc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1066604Fc MODULE_CLICK;
    public static final EnumC1066604Fc MODULE_SHOW;
    public static final EnumC1066604Fc PRODUCT_CLICK;
    public static final EnumC1066604Fc PRODUCT_SHOW;
    public static final EnumC1066604Fc STAY_PRODUCT_DETAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1066604Fc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1066604Fc enumC1066604Fc = new EnumC1066604Fc("MODULE_SHOW", 0, "module_show");
        MODULE_SHOW = enumC1066604Fc;
        EnumC1066604Fc enumC1066604Fc2 = new EnumC1066604Fc("MODULE_CLICK", 1, "module_click");
        MODULE_CLICK = enumC1066604Fc2;
        EnumC1066604Fc enumC1066604Fc3 = new EnumC1066604Fc("PRODUCT_SHOW", 2, "product_show");
        PRODUCT_SHOW = enumC1066604Fc3;
        EnumC1066604Fc enumC1066604Fc4 = new EnumC1066604Fc("PRODUCT_CLICK", 3, "product_click");
        PRODUCT_CLICK = enumC1066604Fc4;
        EnumC1066604Fc enumC1066604Fc5 = new EnumC1066604Fc("BUTTON_SHOW", 4, "button_show");
        BUTTON_SHOW = enumC1066604Fc5;
        EnumC1066604Fc enumC1066604Fc6 = new EnumC1066604Fc("BUTTON_CLICK", 5, "button_click");
        BUTTON_CLICK = enumC1066604Fc6;
        EnumC1066604Fc enumC1066604Fc7 = new EnumC1066604Fc("ENTER_PRODUCT_DETAIL", 6, "enter_product_detail");
        ENTER_PRODUCT_DETAIL = enumC1066604Fc7;
        EnumC1066604Fc enumC1066604Fc8 = new EnumC1066604Fc("STAY_PRODUCT_DETAIL", 7, "stay_product_detail");
        STAY_PRODUCT_DETAIL = enumC1066604Fc8;
        EnumC1066604Fc enumC1066604Fc9 = new EnumC1066604Fc("CONFIRM_SKU", 8, "confirm_sku");
        CONFIRM_SKU = enumC1066604Fc9;
        EnumC1066604Fc enumC1066604Fc10 = new EnumC1066604Fc("CONFIRM_CART_RESULT", 9, "confirm_cart_result");
        CONFIRM_CART_RESULT = enumC1066604Fc10;
        EnumC1066604Fc[] enumC1066604FcArr = {enumC1066604Fc, enumC1066604Fc2, enumC1066604Fc3, enumC1066604Fc4, enumC1066604Fc5, enumC1066604Fc6, enumC1066604Fc7, enumC1066604Fc8, enumC1066604Fc9, enumC1066604Fc10};
        LLILLJJLI = enumC1066604FcArr;
        LLILLL = new C2254308sP(enumC1066604FcArr);
    }

    public static EnumC1066604Fc[] values() {
        return (EnumC1066604Fc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1066604Fc valueOf(String str) {
        return (EnumC1066604Fc) C08FF.LIZ(EnumC1066604Fc.class, str);
    }

    public EnumC1066604Fc(String str, int i, String str2) {
        this.LL = str2;
    }
}
