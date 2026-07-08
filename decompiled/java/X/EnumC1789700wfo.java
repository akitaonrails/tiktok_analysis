package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1789700wfo {
    public static final /* synthetic */ EnumC1789700wfo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1789700wfo PAYMENT_CHANNEL_AGGREATE_CASHIER;
    public static final EnumC1789700wfo PAYMENT_CHANNEL_APPLE_PAY;
    public static final EnumC1789700wfo PAYMENT_CHANNEL_CASH;
    public static final EnumC1789700wfo PAYMENT_CHANNEL_GOOGLE_PAY;
    public static final EnumC1789700wfo PAYMENT_CHANNEL_UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1789700wfo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1789700wfo enumC1789700wfo = new EnumC1789700wfo("PAYMENT_CHANNEL_UNKNOWN", 0, "unknown");
        PAYMENT_CHANNEL_UNKNOWN = enumC1789700wfo;
        EnumC1789700wfo enumC1789700wfo2 = new EnumC1789700wfo("PAYMENT_CHANNEL_CASH", 1, "cash");
        PAYMENT_CHANNEL_CASH = enumC1789700wfo2;
        EnumC1789700wfo enumC1789700wfo3 = new EnumC1789700wfo("PAYMENT_CHANNEL_APPLE_PAY", 2, "apple_pay");
        PAYMENT_CHANNEL_APPLE_PAY = enumC1789700wfo3;
        EnumC1789700wfo enumC1789700wfo4 = new EnumC1789700wfo("PAYMENT_CHANNEL_GOOGLE_PAY", 3, "google_pay");
        PAYMENT_CHANNEL_GOOGLE_PAY = enumC1789700wfo4;
        EnumC1789700wfo enumC1789700wfo5 = new EnumC1789700wfo("PAYMENT_CHANNEL_AGGREATE_CASHIER", 4, "aggregate_cashier");
        PAYMENT_CHANNEL_AGGREATE_CASHIER = enumC1789700wfo5;
        EnumC1789700wfo[] enumC1789700wfoArr = {enumC1789700wfo, enumC1789700wfo2, enumC1789700wfo3, enumC1789700wfo4, enumC1789700wfo5};
        LLILLJJLI = enumC1789700wfoArr;
        LLILLL = new C2254308sP(enumC1789700wfoArr);
    }

    public static EnumC1789700wfo[] values() {
        return (EnumC1789700wfo[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1789700wfo valueOf(String str) {
        return (EnumC1789700wfo) C08FF.LIZ(EnumC1789700wfo.class, str);
    }

    public EnumC1789700wfo(String str, int i, String str2) {
        this.LL = str2;
    }
}
