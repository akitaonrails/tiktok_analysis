package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse;
import java.io.File;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.09jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2452609jI {
    public final String LIZ;
    public final C1227904rF LIZIZ;
    public final C01GW LIZJ;

    public final synchronized void LIZ() {
        File file;
        try {
            file = (File) this.LIZJ.getValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (file.exists()) {
            file.delete();
        }
    }

    public final AdWebHistoryListCommonResponse LIZIZ() {
        if (!((File) this.LIZJ.getValue()).exists()) {
            return null;
        }
        try {
            String strLIZ = AnonymousClass0935.LIZ((File) this.LIZJ.getValue());
            this.LIZIZ.getClass();
            return (AdWebHistoryListCommonResponse) C1227904rF.LIZIZ(strLIZ, AdWebHistoryListCommonResponse.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ();
            C1AF0.LJ(e);
            return null;
        }
    }

    public C2452609jI() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LIZ = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? "" : accountUserServiceLJIIJ.getCurUserId();
        this.LIZIZ = C1227904rF.LIZ;
        this.LIZJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 149));
    }

    public final synchronized void LIZJ(AdWebHistoryListCommonResponse adWebHistoryListCommonResponse) {
        this.LIZIZ.getClass();
        String strLJI = C1227904rF.LJI(adWebHistoryListCommonResponse);
        if (strLJI != null) {
            try {
                AnonymousClass0935.LIZIZ((File) this.LIZJ.getValue(), strLJI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZ();
                C1AF0.LJ(e);
            }
        }
    }
}
