package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryAdInfo;
import com.ss.android.ugc.aweme.history.model.IabHistorySaveDetail;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.09jG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2452409jG {
    public String LIZ = "history";
    public final List<IabHistorySaveDetail> LIZIZ = new ArrayList();
    public final String LIZJ;
    public AdWebHistoryAdInfo LIZLLL;
    public Long LJ;
    public int LJFF;
    public C1035880d3y LJI;
    public final C01GW LJII;

    public final synchronized void LIZ() {
        ((ArrayList) this.LIZIZ).clear();
        try {
            LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ(e);
        }
    }

    public final synchronized List<IabHistorySaveDetail> LIZJ() {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            LJFF();
        }
        return this.LIZIZ;
    }

    public final void LIZIZ() {
        try {
            File[] fileArrListFiles = ((File) this.LJII.getValue()).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ(e);
        }
    }

    public final void LJFF() {
        try {
            AdWebHistoryAdInfo adWebHistoryAdInfo = this.LIZLLL;
            C0VSJ c0vsjLIZLLL = LIZLLL(adWebHistoryAdInfo != null ? adWebHistoryAdInfo.awemeId : null);
            if (c0vsjLIZLLL.exists()) {
                String strLIZ = AnonymousClass0935.LIZ(c0vsjLIZLLL);
                Type type = new TypeToken<List<IabHistorySaveDetail>>() { // from class: X.09jH
                }.getType();
                C1227904rF.LIZ.getClass();
                List list = (List) C1227904rF.LIZJ(strLIZ, type);
                ((ArrayList) this.LIZIZ).clear();
                ((ArrayList) this.LIZIZ).addAll(list);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ(e);
        }
    }

    public C2452409jG() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LIZJ = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? "" : accountUserServiceLJIIJ.getCurUserId();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 150));
        this.LJII = c01gwLIZIZ;
        if (((File) c01gwLIZIZ.getValue()).exists()) {
            return;
        }
        ((File) c01gwLIZIZ.getValue()).mkdirs();
    }

    public final C0VSJ LIZLLL(String str) {
        File file = (File) this.LJII.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ad_web_history__");
        sbLIZ.append(str);
        sbLIZ.append("_tempHistoryList.json");
        return new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJ(Exception exc) {
        try {
            File file = (File) this.LJII.getValue();
            if (file.exists()) {
                file.delete();
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1AF0.LJ(exc);
    }
}
