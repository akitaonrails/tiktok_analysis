package X;

/* JADX INFO: renamed from: X.0uc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710500uc4 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1710490uc3 LIZ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1993813776:
                    if (str.equals("expiration_month")) {
                        return EnumC1710490uc3.EXPIRATION_DATE_MONTH;
                    }
                    break;
                case -1424063313:
                    if (str.equals("billing_city")) {
                        return EnumC1710490uc3.BILLING_CITY;
                    }
                    break;
                case -1181204019:
                    if (str.equals("billing_state")) {
                        return EnumC1710490uc3.BILLING_STATE;
                    }
                    break;
                case -875605731:
                    if (str.equals("billing_postal_code")) {
                        return EnumC1710490uc3.BILLING_POSTAL_CODE;
                    }
                    break;
                case 98915:
                    if (str.equals("cvv")) {
                        return EnumC1710490uc3.CVV;
                    }
                    break;
                case 100064769:
                    if (str.equals("billing_country_region")) {
                        return EnumC1710490uc3.BILLING_COUNTRY_REGION;
                    }
                    break;
                case 578603864:
                    if (str.equals("card_number")) {
                        return EnumC1710490uc3.CARD_NUMBER;
                    }
                    break;
                case 766686014:
                    if (str.equals("expiration_date")) {
                        return EnumC1710490uc3.EXPIRATION_DATE;
                    }
                    break;
                case 767314893:
                    if (str.equals("expiration_year")) {
                        return EnumC1710490uc3.EXPIRATION_DATE_YEAR;
                    }
                    break;
                case 811667774:
                    if (str.equals("holder_name")) {
                        return EnumC1710490uc3.HOLDER_NAME;
                    }
                    break;
                case 2037873223:
                    if (str.equals("billing_street")) {
                        return EnumC1710490uc3.BILLING_STREET;
                    }
                    break;
            }
        }
        return EnumC1710490uc3.NORMAL;
    }
}
