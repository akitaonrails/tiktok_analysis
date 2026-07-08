package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXH extends C09AY implements Function0<Integer> {
    public C0CXH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJ = 0;
        if (C1585030rLh.LJIIJJI() != null && !C1585030rLh.LJIJJLI() && !C1585030rLh.LJIILIIL() && !C1585030rLh.LJIJJ()) {
            C0CUY.LIZ.getClass();
            if (C0CUY.LIZ() != 0) {
                IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
                C844470XAv.LIZ.getClass();
                if (!iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
                    iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_tab_platform_enable", true);
                }
            }
        }
        return Integer.valueOf(iLJIJ);
    }
}
