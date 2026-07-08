package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.0X53, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X53 implements InterfaceC19256010Va {
    public final /* synthetic */ C0X54 LIZ;
    public final /* synthetic */ Activity LIZIZ;

    @Override // X.InterfaceC19256010Va
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    public final void LIZJ() {
        if (C10EU.LJIIIIZZ()) {
            Object service = ServiceManager.get().getService(IExternalService.class);
            IExternalService iExternalService = (IExternalService) service;
            iExternalService.publishService().cancelSynthesis(this.LIZIZ, "ftc_login");
            iExternalService.abilityService().effectService().clearCacheInFTC();
            C20684815ws.onEventV3("kids_log_in");
            Context contextLJFF = C2214201BlK.LJFF();
            if (contextLJFF == null) {
                C844470XAv.LIZ.getClass();
                contextLJFF = C844470XAv.LIZ();
            }
            ComplianceServiceProvider.LJII().LJJI(contextLJFF);
        }
    }

    public C0X53(C0NR0 c0nr0, Activity activity) {
        this.LIZ = c0nr0;
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC19256010Va
    public final void LIZ(String str, boolean z) {
        this.LIZ.LIZ();
    }
}
