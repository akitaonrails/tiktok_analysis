package X;

import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14Ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20279614Ws {
    public static final void LIZ(String str) {
        String upperCase;
        String storeRegion;
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            String value = EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue();
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            if (iPNSChangeRegionService != null && (storeRegion = iPNSChangeRegionService.getStoreRegion()) != null) {
                upperCase = storeRegion.toUpperCase(Locale.ROOT);
            } else {
                upperCase = null;
            }
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(value, str, false, true, true, upperCase, false, 68), new InterfaceC1913620ztg() { // from class: X.10hs
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    public static final void LIZJ(String str, String str2) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    public static final C1692220u8a LIZIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(1048138994);
        String strLIZIZ = C0MBB.LIZIZ(i2, interfaceC1680500tpg);
        String strLIZJ = C0MBB.LIZJ(i, new Object[]{strLIZIZ}, interfaceC1680500tpg);
        int iLJJJ = a0.LJJJ(strLIZJ, strLIZIZ, 0, false, 6);
        int length = strLIZIZ.length() + iLJJJ;
        C1692230u8b c1692230u8b = new C1692230u8b();
        c1692230u8b.LIZLLL(strLIZJ);
        interfaceC1680500tpg.LJJIIJZLJL(-2055729406);
        if (iLJJJ >= 0 && length <= strLIZJ.length()) {
            c1692230u8b.LIZIZ(C1693430uAX.LIZ(0, 0, 16777214, C1670400tZO.LIZIZ(interfaceC1680500tpg).V2(), 0L, 0L, 0L, null, C1670400tZO.LJ(interfaceC1680500tpg).LJIIJ, null, null).LIZ, iLJJJ, length);
        }
        interfaceC1680500tpg.LJ();
        C1692220u8a c1692220u8aLJIIL = c1692230u8b.LJIIL();
        interfaceC1680500tpg.LJ();
        return c1692220u8aLJIIL;
    }
}
