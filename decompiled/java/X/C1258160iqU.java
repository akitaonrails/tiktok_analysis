package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import java.util.List;

/* JADX INFO: renamed from: X.0iqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1258160iqU implements InterfaceC1167840gUo {
    public final /* synthetic */ AwemeListFragmentImpl LIZ;

    public /* synthetic */ C1258160iqU(AwemeListFragmentImpl awemeListFragmentImpl) {
        this.LIZ = awemeListFragmentImpl;
    }

    public final void LIZ(boolean z, MixListResponse mixListResponse) {
        AwemeListFragmentImpl awemeListFragmentImpl = this.LIZ;
        awemeListFragmentImpl.getClass();
        ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (mixListResponse != null) {
            List<MixStruct> mixList = mixListResponse.getMixList();
            User user = awemeListFragmentImpl.LLILZLL;
            if (user != null && !user.isSecret()) {
                if (z) {
                    if (!Boolean.valueOf(((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LIZIZ()).booleanValue() && awemeListFragmentImpl.LLJILLL) {
                        awemeListFragmentImpl.LLJJJ.LLLLLLIL(false, null);
                        return;
                    }
                    if (mixList != null) {
                        if (mixList.size() > 0) {
                            if (C297020Bka.LIZ() && awemeListFragmentImpl.LLLZIL) {
                                awemeListFragmentImpl.LLLZIL = false;
                                C1259360isQ c1259360isQ = awemeListFragmentImpl.LLJJJ;
                                c1259360isQ.LLJLL = null;
                                InterfaceC653650PkR interfaceC653650PkR = c1259360isQ.LLLLII;
                                if (interfaceC653650PkR != null) {
                                    interfaceC653650PkR.W4(null, c1259360isQ.LLJJJJJIL, c1259360isQ.LLJJL);
                                }
                            }
                            awemeListFragmentImpl.LLJJJ.LLLLLLIL(true, mixListResponse);
                            return;
                        }
                        if (mixList.size() == 0 && awemeListFragmentImpl.LLJILLL && ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).getPushLiveState()) {
                            awemeListFragmentImpl.LLJJJ.LLLLLLIL(true, null);
                            return;
                        } else if (mixList.size() != 0) {
                            return;
                        }
                    } else if (awemeListFragmentImpl.LLJILLL && ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).getPushLiveState()) {
                        awemeListFragmentImpl.LLJJJ.LLLLLLIL(true, null);
                        return;
                    }
                    awemeListFragmentImpl.LLJJJ.LLLLLLIL(false, null);
                    return;
                }
                awemeListFragmentImpl.LLJJJ.LLLLLLIL(false, null);
                return;
            }
            awemeListFragmentImpl.LLJJJ.LLLLLLIL(false, null);
        }
    }
}
