package X;

import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptConfigService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid.LiveStreamAdaptConfigServiceImpl;

/* JADX INFO: renamed from: X.04Te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1103204Te {
    public static final /* synthetic */ C1103204Te LIZ = new C1103204Te();

    public static ILiveStreamAdaptConfigService LIZ() {
        Object objLIZ = C04TD.LIZ(ILiveStreamAdaptConfigService.class, false);
        if (objLIZ != null) {
            return (ILiveStreamAdaptConfigService) objLIZ;
        }
        if (C04TD.d0 == null) {
            synchronized (ILiveStreamAdaptConfigService.class) {
                if (C04TD.d0 == null) {
                    C04TD.d0 = new LiveStreamAdaptConfigServiceImpl();
                }
            }
        }
        return C04TD.d0;
    }
}
