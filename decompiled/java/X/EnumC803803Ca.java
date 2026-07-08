package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC803803Ca {
    public static final EnumC803803Ca AVAILABLE;
    public static final /* synthetic */ EnumC803803Ca[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC803803Ca OUT_OF_STOCK;
    public static final EnumC803803Ca QUANTITY_LIMIT;
    public static final EnumC803803Ca UNAVAILABLE_OVERWEIGHT;
    public static final EnumC803803Ca UNAVAILABLE_SHIPPING_UNREACHABLE;
    public static final EnumC803803Ca UNAVAILABLE_SHOP_CLOSE;
    public static final EnumC803803Ca UNAVAILABLE_WAREHOUSE_UNREACHABLE;
    public static final EnumC803803Ca UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC803803Ca> getEntries() {
        return LLILLL;
    }

    static {
        EnumC803803Ca enumC803803Ca = new EnumC803803Ca("UNKNOWN", 0, 0);
        UNKNOWN = enumC803803Ca;
        EnumC803803Ca enumC803803Ca2 = new EnumC803803Ca("AVAILABLE", 1, 1);
        AVAILABLE = enumC803803Ca2;
        EnumC803803Ca enumC803803Ca3 = new EnumC803803Ca("UNAVAILABLE_SHOP_CLOSE", 2, 2);
        UNAVAILABLE_SHOP_CLOSE = enumC803803Ca3;
        EnumC803803Ca enumC803803Ca4 = new EnumC803803Ca("UNAVAILABLE_SHIPPING_UNREACHABLE", 3, 3);
        UNAVAILABLE_SHIPPING_UNREACHABLE = enumC803803Ca4;
        EnumC803803Ca enumC803803Ca5 = new EnumC803803Ca("UNAVAILABLE_WAREHOUSE_UNREACHABLE", 4, 4);
        UNAVAILABLE_WAREHOUSE_UNREACHABLE = enumC803803Ca5;
        EnumC803803Ca enumC803803Ca6 = new EnumC803803Ca("UNAVAILABLE_OVERWEIGHT", 5, 5);
        UNAVAILABLE_OVERWEIGHT = enumC803803Ca6;
        EnumC803803Ca enumC803803Ca7 = new EnumC803803Ca("QUANTITY_LIMIT", 6, 6);
        QUANTITY_LIMIT = enumC803803Ca7;
        EnumC803803Ca enumC803803Ca8 = new EnumC803803Ca("OUT_OF_STOCK", 7, 8);
        OUT_OF_STOCK = enumC803803Ca8;
        EnumC803803Ca[] enumC803803CaArr = {enumC803803Ca, enumC803803Ca2, enumC803803Ca3, enumC803803Ca4, enumC803803Ca5, enumC803803Ca6, enumC803803Ca7, enumC803803Ca8};
        LLILLJJLI = enumC803803CaArr;
        LLILLL = new C2254308sP(enumC803803CaArr);
    }

    public static EnumC803803Ca[] values() {
        return (EnumC803803Ca[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC803803Ca valueOf(String str) {
        return (EnumC803803Ca) C08FF.LIZ(EnumC803803Ca.class, str);
    }

    public EnumC803803Ca(String str, int i, int i2) {
        this.LL = i2;
    }
}
