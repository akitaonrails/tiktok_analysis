package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916250zxv {
    public final IAccountService LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C01GW LJ;
    public FBVCheckResponse LJFF;

    public final Keva LIZIZ() {
        return (Keva) this.LJ.getValue();
    }

    public C1916250zxv() {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LIZ = iAccountService;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iAccountService.LJIIJ().getCurUserId());
        sbLIZ.append("_fbv_status");
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(iAccountService.LJIIJ().getCurUserId());
        sbLIZ2.append("_fbv_validity");
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(iAccountService.LJIIJ().getCurUserId());
        sbLIZ3.append("_fbv_ApprovalFail");
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
        this.LJ = C452501pT.LIZIZ(new C1916260zxw());
    }

    public final void LIZ() {
        LIZIZ().storeBoolean(this.LIZIZ, true);
        LIZIZ().storeBoolean(this.LIZLLL, false);
    }
}
