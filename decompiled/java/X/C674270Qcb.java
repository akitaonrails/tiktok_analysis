package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: renamed from: X.0Qcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674270Qcb {
    public final C054G LIZ;
    public final C674290Qcd LIZIZ;
    public List<EcSearchAIHistoryWord> LIZJ;
    public String LIZLLL;

    public final List<EcSearchAIHistoryWord> LIZ() {
        C674290Qcd c674290Qcd;
        List<EcSearchAIHistoryWord> listLIZIZ = this.LIZJ;
        return ((listLIZIZ.isEmpty() ^ true) || !((c674290Qcd = this.LIZIZ) == null || (listLIZIZ = c674290Qcd.LIZIZ()) == null || !(listLIZIZ.isEmpty() ^ true))) ? listLIZIZ : C13BV.INSTANCE;
    }

    public C674270Qcb() {
        AccountUserService accountUserServiceLJIIJ;
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        this.LIZ = c054gLIZ;
        this.LIZJ = C13BV.INSTANCE;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        this.LIZIZ = new C674290Qcd((iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.isLogin()) ? "FAKE_USER" : accountUserServiceLJIIJ.getCurUserId());
        C23250099c.LIZLLL(c054gLIZ, null, null, new C674280Qcc(this, null), 3);
    }
}
