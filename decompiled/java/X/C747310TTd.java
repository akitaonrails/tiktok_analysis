package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.privacy.setting.tpsc.account.ui.privateaccount.QuitBaAccountProcessor;

/* JADX INFO: renamed from: X.0TTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747310TTd {
    public static final /* synthetic */ C747310TTd LIZ = new C747310TTd();
    public static final QuitBaAccountProcessor.CanQuitBusinessAccountApi LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        String str = C344670DfF.LIZ;
        LIZIZ = (QuitBaAccountProcessor.CanQuitBusinessAccountApi) iRetrofitFactory.LIZ(C344670DfF.LIZ).create(QuitBaAccountProcessor.CanQuitBusinessAccountApi.class);
    }
}
