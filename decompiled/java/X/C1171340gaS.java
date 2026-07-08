package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0gaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171340gaS implements InterfaceC736910SvR<InterfaceC1170280gYk> {
    public final InterfaceC1171320gaQ LL;
    public final Keva LLILLJJLI;
    public final C1171300gaO LLILLL;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    public C1171340gaS() {
        InterfaceC1171320gaQ.LIZ.getClass();
        this.LL = (InterfaceC1171320gaQ) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC1171320gaQ.class);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCollection-Keva-");
        sbLIZ.append(curUser.getUid());
        this.LLILLJJLI = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = new C1171300gaO(this);
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLL;
    }
}
