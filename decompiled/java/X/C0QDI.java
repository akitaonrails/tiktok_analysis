package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.entry.searchbox.viewmodel.SearchBoxFYPViewModel;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0QDI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDI {
    public static final C0QDI LIZ = new C0QDI();

    public static void LIZ(AbstractC738140SxQ abstractC738140SxQ) {
        SearchBoxFYPViewModel.LLJIJIL.getClass();
        if (SearchBoxFYPViewModel.LLJILJILJ == EnumC682820QqO.HIDDEN || SearchBoxFYPViewModel.LLJILLL || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            return;
        }
        IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
        if (iFamilyPairingServiceLJIIL != null && iFamilyPairingServiceLJIIL.LJIIIZ()) {
            return;
        }
        C723850SaN.LIZJ(abstractC738140SxQ, new AwS581S0100000_2(abstractC738140SxQ, 443));
        SearchBoxFYPViewModel.LLJILLL = true;
    }
}
