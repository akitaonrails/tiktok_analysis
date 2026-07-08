package X;

/* JADX INFO: renamed from: X.0wja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public enum EnumC1792040wja {
    UNDEFINED(0),
    STORE_CONNECTION_FAILURE(1),
    PRODUCT_NOT_AVAILABLE(2),
    TIME_OUT(3),
    BILLING_NOT_SUPPORTED(4),
    FEATURE_NOT_SUPPORTED(5),
    DEVICE_NOT_SUPPORTED(6),
    INTEGRATION_ERROR(7),
    INTERNAL_ERROR(8),
    PAYMENT_BLOCK(11),
    PRODUCT_ALREADY_OWNED(12),
    CHANNEL_DECLINE(13),
    INSUFFICIENT_FUNDS(14);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1792040wja valueOf(String str) {
        return (EnumC1792040wja) C08FF.LIZ(EnumC1792040wja.class, str);
    }

    EnumC1792040wja(int i) {
        this.LL = i;
    }
}
