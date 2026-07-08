package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2008607ts {
    public static final /* synthetic */ EnumC2008607ts[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2008607ts PAYMENT_METHOD_IAP_AMAZON;
    public static final EnumC2008607ts PAYMENT_METHOD_IAP_APPLE;
    public static final EnumC2008607ts PAYMENT_METHOD_IAP_GOOGLE;
    public static final EnumC2008607ts PAYMENT_METHOD_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2008607ts> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2008607ts enumC2008607ts = new EnumC2008607ts("PAYMENT_METHOD_UNKNOWN", 0, 0);
        PAYMENT_METHOD_UNKNOWN = enumC2008607ts;
        EnumC2008607ts enumC2008607ts2 = new EnumC2008607ts("PAYMENT_METHOD_IAP_APPLE", 1, 51);
        PAYMENT_METHOD_IAP_APPLE = enumC2008607ts2;
        EnumC2008607ts enumC2008607ts3 = new EnumC2008607ts("PAYMENT_METHOD_IAP_GOOGLE", 2, 52);
        PAYMENT_METHOD_IAP_GOOGLE = enumC2008607ts3;
        EnumC2008607ts enumC2008607ts4 = new EnumC2008607ts("PAYMENT_METHOD_IAP_AMAZON", 3, 53);
        PAYMENT_METHOD_IAP_AMAZON = enumC2008607ts4;
        EnumC2008607ts[] enumC2008607tsArr = {enumC2008607ts, enumC2008607ts2, enumC2008607ts3, enumC2008607ts4};
        LLILLJJLI = enumC2008607tsArr;
        LLILLL = new C2254308sP(enumC2008607tsArr);
    }

    public static EnumC2008607ts[] values() {
        return (EnumC2008607ts[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2008607ts valueOf(String str) {
        return (EnumC2008607ts) C08FF.LIZ(EnumC2008607ts.class, str);
    }

    public EnumC2008607ts(String str, int i, int i2) {
        this.LL = i2;
    }
}
