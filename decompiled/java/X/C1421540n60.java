package X;

import com.bytedance.services.apm.api.IEnsure;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* JADX INFO: renamed from: X.0n60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421540n60 extends AbstractC2255721DQs<InterfaceC1652740t6u> implements InterfaceC1652740t6u, InterfaceC379610EuV, C0F1U {
    public static final int LLILZ = 8;
    public final C1DRG LLILLJJLI;
    public final /* synthetic */ C1421530n5z LL = C1421530n5z.LL;
    public final C1421540n60 LLILLL = this;

    @Override // X.InterfaceC204613154p
    public String EN(String str) {
        return this.LL.EN(str);
    }

    @Override // X.InterfaceC204613154p
    public void HA0(String str) {
        this.LL.HA0(str);
    }

    @Override // X.InterfaceC204613154p
    public C11NZ<List<MusicModel>> Lk() {
        return this.LL.Lk();
    }

    @Override // X.InterfaceC204613154p
    public void Lu0(String str, boolean z) {
        this.LL.Lu0(str, z);
    }

    @Override // X.InterfaceC204613154p
    public boolean VS() {
        return this.LL.VS();
    }

    @Override // X.InterfaceC1453610nvj
    public void ZN(MusicModel musicModel, String str) {
        this.LL.ZN(musicModel, str);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        AccountUserService accountUserServiceLJIIJ;
        super.onCreate();
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        String curUserId = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(getComponentName());
        sbLIZ.append("] UserId is null");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IEnsure iEnsure = C1AF0.LIZ;
        if (iEnsure != null) {
            iEnsure.ensureNotNull(curUserId, strLIZIZ);
        }
        C1421530n5z c1421530n5z = C1421530n5z.LL;
        if (curUserId == null) {
            curUserId = "";
        }
        c1421530n5z.LIZJ(curUserId);
    }

    public C1421540n60 W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C1421540n60(C1DRG c1drg) {
        this.LLILLJJLI = c1drg;
    }
}
