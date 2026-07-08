package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709470uaP {
    public static final EnumC1709470uaP DIRECT_CHECKOUT;
    public static final EnumC1709470uaP EMPTY_OTHER_WHEN_HYBRID;
    public static final EnumC1709470uaP EMPTY_PAYMENT_METHOD;
    public static final EnumC1709470uaP INDEPENDENT_CVV;
    public static final EnumC1709470uaP INVALID_CVV;
    public static final EnumC1709470uaP INVALID_PAYLATER_PLAN;
    public static final /* synthetic */ EnumC1709470uaP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1709470uaP SUCCESS;

    public static InterfaceC2044707zh<EnumC1709470uaP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1709470uaP enumC1709470uaP = new EnumC1709470uaP("SUCCESS", 0);
        SUCCESS = enumC1709470uaP;
        EnumC1709470uaP enumC1709470uaP2 = new EnumC1709470uaP("EMPTY_PAYMENT_METHOD", 1);
        EMPTY_PAYMENT_METHOD = enumC1709470uaP2;
        EnumC1709470uaP enumC1709470uaP3 = new EnumC1709470uaP("INVALID_CVV", 2);
        INVALID_CVV = enumC1709470uaP3;
        EnumC1709470uaP enumC1709470uaP4 = new EnumC1709470uaP("EMPTY_OTHER_WHEN_HYBRID", 3);
        EMPTY_OTHER_WHEN_HYBRID = enumC1709470uaP4;
        EnumC1709470uaP enumC1709470uaP5 = new EnumC1709470uaP("INDEPENDENT_CVV", 4);
        INDEPENDENT_CVV = enumC1709470uaP5;
        EnumC1709470uaP enumC1709470uaP6 = new EnumC1709470uaP("DIRECT_CHECKOUT", 5);
        DIRECT_CHECKOUT = enumC1709470uaP6;
        EnumC1709470uaP enumC1709470uaP7 = new EnumC1709470uaP("INVALID_PAYLATER_PLAN", 6);
        INVALID_PAYLATER_PLAN = enumC1709470uaP7;
        EnumC1709470uaP[] enumC1709470uaPArr = {enumC1709470uaP, enumC1709470uaP2, enumC1709470uaP3, enumC1709470uaP4, enumC1709470uaP5, enumC1709470uaP6, enumC1709470uaP7};
        LL = enumC1709470uaPArr;
        LLILLJJLI = new C2254308sP(enumC1709470uaPArr);
    }

    public static EnumC1709470uaP[] values() {
        return (EnumC1709470uaP[]) LL.clone();
    }

    public static EnumC1709470uaP valueOf(String str) {
        return (EnumC1709470uaP) C08FF.LIZ(EnumC1709470uaP.class, str);
    }

    public EnumC1709470uaP(String str, int i) {
    }
}
