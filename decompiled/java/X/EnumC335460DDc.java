package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC335460DDc {
    public static final EnumC335460DDc CHECKOUT;
    public static final /* synthetic */ EnumC335460DDc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC335460DDc ORDER_DETAIL;
    public static final EnumC335460DDc ORDER_LIST;
    public static final EnumC335460DDc PDP;
    public static final EnumC335460DDc SHOP;
    public static final EnumC335460DDc THANK_YOU;

    public static InterfaceC2044707zh<EnumC335460DDc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC335460DDc enumC335460DDc = new EnumC335460DDc("PDP", 0);
        PDP = enumC335460DDc;
        EnumC335460DDc enumC335460DDc2 = new EnumC335460DDc("CHECKOUT", 1);
        CHECKOUT = enumC335460DDc2;
        EnumC335460DDc enumC335460DDc3 = new EnumC335460DDc("THANK_YOU", 2);
        THANK_YOU = enumC335460DDc3;
        EnumC335460DDc enumC335460DDc4 = new EnumC335460DDc("ORDER_LIST", 3);
        ORDER_LIST = enumC335460DDc4;
        EnumC335460DDc enumC335460DDc5 = new EnumC335460DDc("ORDER_DETAIL", 4);
        ORDER_DETAIL = enumC335460DDc5;
        EnumC335460DDc enumC335460DDc6 = new EnumC335460DDc("SHOP", 5);
        SHOP = enumC335460DDc6;
        EnumC335460DDc[] enumC335460DDcArr = {enumC335460DDc, enumC335460DDc2, enumC335460DDc3, enumC335460DDc4, enumC335460DDc5, enumC335460DDc6};
        LL = enumC335460DDcArr;
        LLILLJJLI = new C2254308sP(enumC335460DDcArr);
    }

    public static EnumC335460DDc[] values() {
        return (EnumC335460DDc[]) LL.clone();
    }

    public final String getDisplayName() {
        switch (C335540DDk.LIZ[ordinal()]) {
            case 1:
                return "PDP";
            case 2:
                return "Checkout";
            case 3:
                return "Thank You";
            case 4:
                return "Order List";
            case 5:
                return "Order Detail";
            case 6:
                return "Shop";
            default:
                throw new C1954807lC();
        }
    }

    public static EnumC335460DDc valueOf(String str) {
        return (EnumC335460DDc) C08FF.LIZ(EnumC335460DDc.class, str);
    }

    public EnumC335460DDc(String str, int i) {
    }
}
