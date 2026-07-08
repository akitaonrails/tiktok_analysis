package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.FriendsFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.IFriendTabExpApi;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXJ extends C09AY implements Function0<Integer> {
    public C0CXJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C0CXL.LIZ.getClass();
        int iLJIJ = 0;
        if (((Number) C0CXL.LJ.getValue()).intValue() != 1 && C1585030rLh.LJIIJJI() != null && !C1585030rLh.LJIJJLI() && !C1585030rLh.LJIILIIL() && !C1585030rLh.LJIIZILJ()) {
            C0CXC.LIZ.getClass();
            IFriendTabExpApi iFriendTabExpApiLJ = FriendsFeedServiceImpl.LJ();
            if (iFriendTabExpApiLJ.LIZJ() || iFriendTabExpApiLJ.LIZLLL() != -1) {
                IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
                C844470XAv.LIZ.getClass();
                if (!iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
                    iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_tab_platform_enable_for_profile", true);
                }
            }
        }
        return Integer.valueOf(iLJIJ);
    }
}
