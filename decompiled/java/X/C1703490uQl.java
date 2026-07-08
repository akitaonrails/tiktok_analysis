package X;

import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0uQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703490uQl {
    public static String LIZ() {
        String currentRegionCode;
        IPNSChangeRegionDep iPNSChangeRegionDep = (IPNSChangeRegionDep) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionDep.class, false, false, false, 14, null);
        return (iPNSChangeRegionDep == null || (currentRegionCode = iPNSChangeRegionDep.getCurrentRegionCode()) == null) ? "" : currentRegionCode;
    }

    public static String LIZIZ() {
        C1703510uQn c1703510uQn = C1703500uQm.LIZJ;
        String str = c1703510uQn.LJI;
        if (str != null) {
            return str;
        }
        String str2 = c1703510uQn.LIZLLL;
        return str2 == null ? c1703510uQn.LIZ : str2;
    }

    public static void LIZJ() {
        for (InterfaceC1703520uQo interfaceC1703520uQo : C1703500uQm.LIZIZ) {
            String strLIZIZ = LIZIZ();
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            C1703510uQn c1703510uQn = C1703500uQm.LIZJ;
            String str = c1703510uQn.LJFF;
            Country country = new Country(strLIZIZ, (str == null && (str = c1703510uQn.LJ) == null && (str = c1703510uQn.LIZIZ) == null) ? "" : str);
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            if (iPNSChangeRegionService != null) {
                iPNSChangeRegionService.LJIIJJI();
            }
            interfaceC1703520uQo.LIZ(country);
        }
    }
}
