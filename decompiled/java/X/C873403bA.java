package X;

/* JADX INFO: renamed from: X.03bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C873403bA {
    public static final String LIZ(EnumC872903b5 enumC872903b5) {
        if (enumC872903b5 == null) {
            return "";
        }
        switch (C873303b9.LIZ[enumC872903b5.ordinal()]) {
            case 1:
                return "atm_card_info";
            case 2:
                return "ccdc_card_info";
            case 3:
                return "info_update";
            case 4:
                return "installment_card_info";
            case 5:
                return "cc_installment_plan";
            case 6:
                return "installment_plan_selection";
            case 7:
                return "hsa_fsa_card_info";
            default:
                return "";
        }
    }
}
