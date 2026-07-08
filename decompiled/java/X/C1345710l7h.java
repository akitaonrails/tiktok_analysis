package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.service.IPostModeService;

/* JADX INFO: renamed from: X.0l7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345710l7h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZ(InterfaceC214902198i interfaceC214902198i) {
        if (interfaceC214902198i == 0) {
            return false;
        }
        SAFHelper.LIZ.getClass();
        if (!SAFHelper.LJIIJ()) {
            return false;
        }
        if (interfaceC214902198i instanceof InterfaceC1603190roz) {
            C1345730l7j c1345730l7j = C1345730l7j.LIZ;
            c1345730l7j.getClass();
            if (C1345730l7j.LIZ().disableMainPageVMSingleAct) {
                return false;
            }
            if (C1345750l7l.LIZ) {
                return true;
            }
            c1345730l7j.getClass();
            if (!C1345730l7j.LIZ().disableMainPageSingleAct) {
                C295150BhZ.LIZ.getClass();
                if (C295150BhZ.LIZ()) {
                    if (C1345730l7j.LIZ().needCacheIsSupportMainPage) {
                        C1345750l7l.LIZ = true;
                    }
                    return true;
                }
            }
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && iDetailFeedSafService.LIZLLL((Fragment) interfaceC214902198i) != null) {
            return true;
        }
        IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
        if (iPostModeService != null) {
            C1345730l7j.LIZ.getClass();
            if (!C1345730l7j.LIZ().disablePostModeSingleAct && iPostModeService.LJJIIZI((Fragment) interfaceC214902198i)) {
                return true;
            }
        }
        return false;
    }
}
