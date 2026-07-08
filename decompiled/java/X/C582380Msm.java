package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0Msm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C582380Msm {
    public static final C584050MvT LIZ = new InterfaceC1477620oYS() { // from class: X.0MvT
        public final SuperResolutionStrategyConfigV2 LIZIZ = C582130MsN.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategyConfigV2();
        public final IECommerceAnchorService LIZJ = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);

        @Override // X.InterfaceC1477620oYS
        public final boolean LIZ(SimVideoUrlModel simVideoUrlModel) {
            boolean zLJIIIZ;
            C01GW c01gw = C1779306xz.LIZ;
            if (C1781506yL.LIZ) {
                zLJIIIZ = ((Boolean) C1779306xz.LJIILLIIL.getValue()).booleanValue();
            } else {
                zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_force_close_self_publish_video_sr", true, false);
            }
            if (zLJIIIZ) {
                if (!TextUtils.isEmpty(LocalVideoPlayerManager.LJ().LIZJ(C1481230oeH.LJIIJ(simVideoUrlModel)))) {
                    return true;
                }
            }
            return false;
        }

        @Override // X.InterfaceC1477620oYS
        public final boolean LIZIZ(String str) {
            IAwemeService iAwemeService;
            Aweme awemeLLILZ;
            SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2;
            if (TextUtils.isEmpty(str) || (iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class)) == null || (awemeLLILZ = iAwemeService.LLILZ(str)) == null) {
                return false;
            }
            IECommerceAnchorService iECommerceAnchorService = this.LIZJ;
            if (iECommerceAnchorService != null && iECommerceAnchorService.LJJJJZ(awemeLLILZ)) {
                SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV22 = this.LIZIZ;
                if (superResolutionStrategyConfigV22 == null || !superResolutionStrategyConfigV22.ecomVideoSr) {
                    return false;
                }
                return true;
            }
            if (awemeLLILZ.isAd()) {
                SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV23 = this.LIZIZ;
                if (superResolutionStrategyConfigV23 == null || !superResolutionStrategyConfigV23.adSr) {
                    return false;
                }
                return true;
            }
            if (!C0SXF.LJJ(awemeLLILZ) || (superResolutionStrategyConfigV2 = this.LIZIZ) == null || !superResolutionStrategyConfigV2.pgcSr) {
                return false;
            }
            return true;
        }

        @Override // X.InterfaceC1477620oYS
        public final boolean LIZJ(SimVideoUrlModel simVideoUrlModel, String str) {
            IECommerceVideoService iECommerceVideoService;
            if (simVideoUrlModel == null || TextUtils.isEmpty(str)) {
                return true;
            }
            str.getClass();
            if (!str.equals("gec_feed_video") || (iECommerceVideoService = (IECommerceVideoService) ServiceManager.get().getService(IECommerceVideoService.class)) == null) {
                return true;
            }
            return iECommerceVideoService.LIZLLL(simVideoUrlModel.getSourceId());
        }
    };
}
