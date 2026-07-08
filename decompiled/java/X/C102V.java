package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.business.settings.ComplianceApi;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.102V, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C102V {
    public final C01GW LIZ;

    public C102V() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C102W());
        this.LIZ = c01gwLIZIZ;
        if (((Boolean) C07OX.LIZLLL.getValue()).booleanValue()) {
            return;
        }
        c01gwLIZIZ.getValue().toString();
    }

    public final void LIZ(InterfaceC191809102d interfaceC191809102d, int i) {
        int userMode;
        User currentUser;
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        ComplianceApi complianceApi = (ComplianceApi) this.LIZ.getValue();
        int iVe = ComplianceServiceProvider.LJIL().Ve();
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            userMode = currentUser.getUserMode();
        } else {
            userMode = 0;
        }
        C632140Oqq.LIZLLL(complianceApi.getComplianceSetting(iVe, userMode, i), "/aweme/v1/compliance/settings/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336410ks(interfaceC191809102d, this, 2));
    }

    public final void LIZIZ(String str, String str2, InterfaceC191808102c interfaceC191808102c) {
        ((ComplianceApi) this.LIZ.getValue()).setComplianceSettings(str, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336510kt(interfaceC191808102c, 0));
    }
}
