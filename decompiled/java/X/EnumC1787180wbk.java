package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1787180wbk {
    public static final EnumC1787180wbk BILLING_NOT_SUPPORTED;
    public static final EnumC1787180wbk CHANNEL_DECLINED;
    public static final EnumC1787180wbk CONNECTION_ERROR;
    public static final C1787170wbj Companion;
    public static final EnumC1787180wbk DEVICE_NOT_SUPPORTED;
    public static final EnumC1787180wbk FEATURE_NOT_SUPPORTED;
    public static final EnumC1787180wbk INSUFFICIENT_FUNDS;
    public static final EnumC1787180wbk INTEGRATION_ERROR;
    public static final EnumC1787180wbk INTERNAL_ERROR;
    public static final /* synthetic */ EnumC1787180wbk[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1787180wbk PAYMENT_BLOCKED;
    public static final EnumC1787180wbk PRODUCT_ALREADY_OWNED;
    public static final EnumC1787180wbk PRODUCT_NOT_AVAILABLE;
    public static final EnumC1787180wbk TIMEOUT;
    public static final EnumC1787180wbk UNKNOWN_ERROR;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1787180wbk> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.0wbj] */
    static {
        EnumC1787180wbk enumC1787180wbk = new EnumC1787180wbk("UNKNOWN_ERROR", 0, 0, "Unknown error occurred");
        UNKNOWN_ERROR = enumC1787180wbk;
        EnumC1787180wbk enumC1787180wbk2 = new EnumC1787180wbk("CONNECTION_ERROR", 1, 1, "Connection error occurred on channel");
        CONNECTION_ERROR = enumC1787180wbk2;
        EnumC1787180wbk enumC1787180wbk3 = new EnumC1787180wbk("PRODUCT_NOT_AVAILABLE", 2, 2, "Product is not available or outdated");
        PRODUCT_NOT_AVAILABLE = enumC1787180wbk3;
        EnumC1787180wbk enumC1787180wbk4 = new EnumC1787180wbk("TIMEOUT", 3, 3, "Timeout");
        TIMEOUT = enumC1787180wbk4;
        EnumC1787180wbk enumC1787180wbk5 = new EnumC1787180wbk("BILLING_NOT_SUPPORTED", 4, 4, "User account is not allowed to make payment");
        BILLING_NOT_SUPPORTED = enumC1787180wbk5;
        EnumC1787180wbk enumC1787180wbk6 = new EnumC1787180wbk("FEATURE_NOT_SUPPORTED", 5, 5, "Feature not supported");
        FEATURE_NOT_SUPPORTED = enumC1787180wbk6;
        EnumC1787180wbk enumC1787180wbk7 = new EnumC1787180wbk("DEVICE_NOT_SUPPORTED", 6, 6, "Device is not allowed to make payment");
        DEVICE_NOT_SUPPORTED = enumC1787180wbk7;
        EnumC1787180wbk enumC1787180wbk8 = new EnumC1787180wbk("INTEGRATION_ERROR", 7, 7, "Integration error occurred");
        INTEGRATION_ERROR = enumC1787180wbk8;
        EnumC1787180wbk enumC1787180wbk9 = new EnumC1787180wbk("INTERNAL_ERROR", 8, 8, "Internal error occurred in MP system");
        INTERNAL_ERROR = enumC1787180wbk9;
        EnumC1787180wbk enumC1787180wbk10 = new EnumC1787180wbk("PAYMENT_BLOCKED", 9, 11, "Another order is being processed");
        PAYMENT_BLOCKED = enumC1787180wbk10;
        EnumC1787180wbk enumC1787180wbk11 = new EnumC1787180wbk("PRODUCT_ALREADY_OWNED", 10, 12, "The channel account has already purchased this product");
        PRODUCT_ALREADY_OWNED = enumC1787180wbk11;
        EnumC1787180wbk enumC1787180wbk12 = new EnumC1787180wbk("CHANNEL_DECLINED", 11, 13, "Internal error occurred on channel");
        CHANNEL_DECLINED = enumC1787180wbk12;
        EnumC1787180wbk enumC1787180wbk13 = new EnumC1787180wbk("INSUFFICIENT_FUNDS", 12, 14, "Insufficient funds in payment method");
        INSUFFICIENT_FUNDS = enumC1787180wbk13;
        EnumC1787180wbk[] enumC1787180wbkArr = {enumC1787180wbk, enumC1787180wbk2, enumC1787180wbk3, enumC1787180wbk4, enumC1787180wbk5, enumC1787180wbk6, enumC1787180wbk7, enumC1787180wbk8, enumC1787180wbk9, enumC1787180wbk10, enumC1787180wbk11, enumC1787180wbk12, enumC1787180wbk13};
        LLILLL = enumC1787180wbkArr;
        LLILZ = new C2254308sP(enumC1787180wbkArr);
        Companion = new Object() { // from class: X.0wbj
        };
    }

    public static EnumC1787180wbk[] values() {
        return (EnumC1787180wbk[]) LLILLL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name());
        sbLIZ.append("(code=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC1787180wbk valueOf(String str) {
        return (EnumC1787180wbk) C08FF.LIZ(EnumC1787180wbk.class, str);
    }

    public EnumC1787180wbk(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
