package X;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.03Zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C864803Zm {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("pm_pi_ins_pipobnpl_c_d", "pm_pi_cci_all", "pm_pi_cci_mastercard_c_d", "pm_pi_cci_visa_c_d");
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"pm_pi_dd_bpi_c_r", "pm_pi_dd_ubp_c_r", "pm_pi_dd_maybank_c_r", "pm_pi_dd_rhbbank_c_r", "pm_pi_dd_ambank_c_r"});
    public static final List<String> LIZJ = Collections.singletonList("pm_pi_atmcard_all");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("eg_pi_vnatmcard_c_d_issue_date_issue_month", "eg_ccdc_global_expiration_month", "eg_pi_vnatmcard_c_d_expiration_date_expiration_month", "eg_ccdc_global_bancontact_expiration_month");
    public static final List<String> LJ = C1697810uHb.LJIIJJI("eg_pi_vnatmcard_c_d_issue_date_issue_year", "eg_ccdc_global_expiration_year", "eg_pi_vnatmcard_c_d_expiration_date_expiration_year", "eg_ccdc_global_bancontact_expiration_year");
    public static final List<String> LJFF = C1697810uHb.LJIIJJI("eg_pi_vnatmcard_c_d_expiration_date_expiration_date", "eg_pi_vnatmcard_c_d_issue_date_issue_date", "eg_ccdc_global_expiration_date", "eg_ccdc_global_bancontact_expiration_date");
    public static final List<String> LJI = C1697810uHb.LJIIJJI("eg_pi_vnatmcard_c_d_issue_date_holder_name", "eg_pi_vnatmcard_c_d_expiration_date_holder_name", "eg_ccdc_global_holder_name");
    public static final List<String> LJII = C1697810uHb.LJIIJJI("eg_pi_vnatmcard_c_d_issue_date_card_number", "eg_pi_vnatmcard_c_d_expiration_date_card_number", "eg_ccdc_global_card_number");

    public static boolean LIZ(String str) {
        if (str != null && C770702zh.LIZIZ(str)) {
            return C1697810uHb.LJIIJJI("pm_pi_ew_pipocredit_c_d", "pm_pi_ew_pipowallet_c_d").contains(str);
        }
        return false;
    }
}
