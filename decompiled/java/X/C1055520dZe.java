package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0dZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055520dZe {
    public static final C1055520dZe LIZ = new C1055520dZe();

    public static final boolean LIZ() {
        return ((IPluginService) ServiceManager.get().getService(IPluginService.class)).checkPluginInstalled("com.bytedance.tiktok.ship");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            X.01GW r0 = X.C1055540dZg.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2 r0 = (com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2) r0
            if (r0 == 0) goto L13
            int r0 = r0.considerBizAdPriority
            r2 = 1
            if (r0 == r2) goto L13
        Lf:
            r1 = -1
            if (r2 != 0) goto L15
            return r1
        L13:
            r2 = 0
            goto Lf
        L15:
            if (r3 == 0) goto L2f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.getAwemeRawAd()
            if (r0 == 0) goto L2f
            com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel r0 = r0.getFeature()
            if (r0 == 0) goto L2f
            com.ss.android.ugc.aweme.feed.model.ad.VodStrategies r0 = r0.vodStrategies
            if (r0 == 0) goto L2f
            java.lang.Integer r0 = r0.superResolutionPriority
            if (r0 == 0) goto L2f
            int r1 = r0.intValue()
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1055520dZe.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):int");
    }
}
