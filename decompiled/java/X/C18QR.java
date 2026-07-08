package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.model.PronounResponse;

/* JADX INFO: renamed from: X.18QR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18QR implements InterfaceC736910SvR<InterfaceC1233240iCI> {
    public final C18RQ LL = new InterfaceC1233240iCI() { // from class: X.18RQ
        @Override // X.InterfaceC1233240iCI
        public final C11NZ<PronounResponse> LIZJ(String str) {
            C18RR.LIZ.getClass();
            return ((C18RR) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(C18RR.class)).LIZJ(str);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
