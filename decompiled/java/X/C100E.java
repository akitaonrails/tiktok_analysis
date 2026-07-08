package X;

import com.appsflyer.AppsFlyerLib;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.100E, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100E implements InterfaceC191809102d {
    public final /* synthetic */ C100F LIZ;

    @Override // X.InterfaceC191809102d
    public final void LIZJ() {
        C100F c100f = this.LIZ;
        if (c100f != null) {
            c100f.LIZIZ(false);
        }
    }

    @Override // X.InterfaceC191809102d
    public final void onSuccess() {
        ((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJIJ();
        C102U.LIZ.getClass();
        if (C102U.LJ()) {
            AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        }
        C100F c100f = this.LIZ;
        if (c100f != null) {
            c100f.LIZIZ(true);
        }
    }

    public C100E(C100F c100f) {
        this.LIZ = c100f;
    }
}
