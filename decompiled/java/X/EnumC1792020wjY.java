package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1792020wjY {
    public static final EnumC1792020wjY BILLING_NOT_SUPPORTED;
    public static final EnumC1792020wjY CHANNEL_DECLINE;
    public static final C1792080wje Companion;
    public static final EnumC1792020wjY DEVICE_NOT_SUPPORTED;
    public static final EnumC1792020wjY FEATURE_NOT_SUPPORTED;
    public static final EnumC1792020wjY INSUFFICIENT_FUNDS;
    public static final EnumC1792020wjY INTEGRATION_ERROR;
    public static final EnumC1792020wjY INTERNAL_ERROR;
    public static final /* synthetic */ EnumC1792020wjY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1792020wjY PAYMENT_BLOCK;
    public static final EnumC1792020wjY PRODUCT_ALREADY_OWNED;
    public static final EnumC1792020wjY PRODUCT_NOT_AVAILABLE;
    public static final EnumC1792020wjY STORE_CONNECTION_FAILURE;
    public static final EnumC1792020wjY TIME_OUT;
    public static final EnumC1792020wjY UNDEFINED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1792020wjY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1792020wjY enumC1792020wjY = new EnumC1792020wjY("UNDEFINED", 0, 0);
        UNDEFINED = enumC1792020wjY;
        EnumC1792020wjY enumC1792020wjY2 = new EnumC1792020wjY("STORE_CONNECTION_FAILURE", 1, 1);
        STORE_CONNECTION_FAILURE = enumC1792020wjY2;
        EnumC1792020wjY enumC1792020wjY3 = new EnumC1792020wjY("PRODUCT_NOT_AVAILABLE", 2, 2);
        PRODUCT_NOT_AVAILABLE = enumC1792020wjY3;
        EnumC1792020wjY enumC1792020wjY4 = new EnumC1792020wjY("TIME_OUT", 3, 3);
        TIME_OUT = enumC1792020wjY4;
        EnumC1792020wjY enumC1792020wjY5 = new EnumC1792020wjY("BILLING_NOT_SUPPORTED", 4, 4);
        BILLING_NOT_SUPPORTED = enumC1792020wjY5;
        EnumC1792020wjY enumC1792020wjY6 = new EnumC1792020wjY("FEATURE_NOT_SUPPORTED", 5, 5);
        FEATURE_NOT_SUPPORTED = enumC1792020wjY6;
        EnumC1792020wjY enumC1792020wjY7 = new EnumC1792020wjY("DEVICE_NOT_SUPPORTED", 6, 6);
        DEVICE_NOT_SUPPORTED = enumC1792020wjY7;
        EnumC1792020wjY enumC1792020wjY8 = new EnumC1792020wjY("INTEGRATION_ERROR", 7, 7);
        INTEGRATION_ERROR = enumC1792020wjY8;
        EnumC1792020wjY enumC1792020wjY9 = new EnumC1792020wjY("INTERNAL_ERROR", 8, 8);
        INTERNAL_ERROR = enumC1792020wjY9;
        EnumC1792020wjY enumC1792020wjY10 = new EnumC1792020wjY("PAYMENT_BLOCK", 9, 11);
        PAYMENT_BLOCK = enumC1792020wjY10;
        EnumC1792020wjY enumC1792020wjY11 = new EnumC1792020wjY("PRODUCT_ALREADY_OWNED", 10, 12);
        PRODUCT_ALREADY_OWNED = enumC1792020wjY11;
        EnumC1792020wjY enumC1792020wjY12 = new EnumC1792020wjY("CHANNEL_DECLINE", 11, 13);
        CHANNEL_DECLINE = enumC1792020wjY12;
        EnumC1792020wjY enumC1792020wjY13 = new EnumC1792020wjY("INSUFFICIENT_FUNDS", 12, 14);
        INSUFFICIENT_FUNDS = enumC1792020wjY13;
        EnumC1792020wjY[] enumC1792020wjYArr = {enumC1792020wjY, enumC1792020wjY2, enumC1792020wjY3, enumC1792020wjY4, enumC1792020wjY5, enumC1792020wjY6, enumC1792020wjY7, enumC1792020wjY8, enumC1792020wjY9, enumC1792020wjY10, enumC1792020wjY11, enumC1792020wjY12, enumC1792020wjY13};
        LLILLJJLI = enumC1792020wjYArr;
        LLILLL = new C2254308sP(enumC1792020wjYArr);
        Companion = new C1792080wje();
    }

    public static EnumC1792020wjY[] values() {
        return (EnumC1792020wjY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1792020wjY valueOf(String str) {
        return (EnumC1792020wjY) C08FF.LIZ(EnumC1792020wjY.class, str);
    }

    public EnumC1792020wjY(String str, int i, int i2) {
        this.LL = i2;
    }
}
