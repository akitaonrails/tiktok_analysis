package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1710490uc3 {
    public static final EnumC1710490uc3 BILLING_CITY;
    public static final EnumC1710490uc3 BILLING_COUNTRY_REGION;
    public static final EnumC1710490uc3 BILLING_POSTAL_CODE;
    public static final EnumC1710490uc3 BILLING_STATE;
    public static final EnumC1710490uc3 BILLING_STREET;
    public static final EnumC1710490uc3 CARD_NUMBER;
    public static final EnumC1710490uc3 CVV;
    public static final EnumC1710490uc3 EXPIRATION_DATE;
    public static final EnumC1710490uc3 EXPIRATION_DATE_MONTH;
    public static final EnumC1710490uc3 EXPIRATION_DATE_YEAR;
    public static final EnumC1710490uc3 HOLDER_NAME;
    public static final /* synthetic */ EnumC1710490uc3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1710490uc3 NORMAL;

    public static InterfaceC2044707zh<EnumC1710490uc3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1710490uc3 enumC1710490uc3 = new EnumC1710490uc3("CARD_NUMBER", 0);
        CARD_NUMBER = enumC1710490uc3;
        EnumC1710490uc3 enumC1710490uc32 = new EnumC1710490uc3("CVV", 1);
        CVV = enumC1710490uc32;
        EnumC1710490uc3 enumC1710490uc33 = new EnumC1710490uc3("HOLDER_NAME", 2);
        HOLDER_NAME = enumC1710490uc33;
        EnumC1710490uc3 enumC1710490uc34 = new EnumC1710490uc3("EXPIRATION_DATE", 3);
        EXPIRATION_DATE = enumC1710490uc34;
        EnumC1710490uc3 enumC1710490uc35 = new EnumC1710490uc3("EXPIRATION_DATE_MONTH", 4);
        EXPIRATION_DATE_MONTH = enumC1710490uc35;
        EnumC1710490uc3 enumC1710490uc36 = new EnumC1710490uc3("EXPIRATION_DATE_YEAR", 5);
        EXPIRATION_DATE_YEAR = enumC1710490uc36;
        EnumC1710490uc3 enumC1710490uc37 = new EnumC1710490uc3("BILLING_COUNTRY_REGION", 6);
        BILLING_COUNTRY_REGION = enumC1710490uc37;
        EnumC1710490uc3 enumC1710490uc38 = new EnumC1710490uc3("BILLING_CITY", 7);
        BILLING_CITY = enumC1710490uc38;
        EnumC1710490uc3 enumC1710490uc39 = new EnumC1710490uc3("BILLING_STREET", 8);
        BILLING_STREET = enumC1710490uc39;
        EnumC1710490uc3 enumC1710490uc310 = new EnumC1710490uc3("BILLING_STATE", 9);
        BILLING_STATE = enumC1710490uc310;
        EnumC1710490uc3 enumC1710490uc311 = new EnumC1710490uc3("BILLING_POSTAL_CODE", 10);
        BILLING_POSTAL_CODE = enumC1710490uc311;
        EnumC1710490uc3 enumC1710490uc312 = new EnumC1710490uc3("NORMAL", 11);
        NORMAL = enumC1710490uc312;
        EnumC1710490uc3[] enumC1710490uc3Arr = {enumC1710490uc3, enumC1710490uc32, enumC1710490uc33, enumC1710490uc34, enumC1710490uc35, enumC1710490uc36, enumC1710490uc37, enumC1710490uc38, enumC1710490uc39, enumC1710490uc310, enumC1710490uc311, enumC1710490uc312};
        LL = enumC1710490uc3Arr;
        LLILLJJLI = new C2254308sP(enumC1710490uc3Arr);
    }

    public static EnumC1710490uc3[] values() {
        return (EnumC1710490uc3[]) LL.clone();
    }

    public static EnumC1710490uc3 valueOf(String str) {
        return (EnumC1710490uc3) C08FF.LIZ(EnumC1710490uc3.class, str);
    }

    public EnumC1710490uc3(String str, int i) {
    }
}
