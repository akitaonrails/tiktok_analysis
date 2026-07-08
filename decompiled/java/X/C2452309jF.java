package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2452309jF {
    public static final C2452309jF LIZ = new C2452309jF();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1374));

    public static final boolean LIZ() {
        IFamilyPairingService iFamilyPairingServiceLJIIL;
        return ((Number) LIZIZ.getValue()).intValue() == 1 && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() && ((iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL()) == null || !iFamilyPairingServiceLJIIL.LJIIIZ());
    }
}
