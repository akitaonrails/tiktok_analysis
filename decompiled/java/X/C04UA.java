package X;

import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService;
import com.bytedance.android.livesdk.streamadaption.LiveStreamAdaptServiceImpl;

/* JADX INFO: renamed from: X.04UA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04UA {
    public static final /* synthetic */ C04UA LIZ = new C04UA();

    public static ILiveStreamAdaptService LIZ() {
        Object objLIZ = C04TD.LIZ(ILiveStreamAdaptService.class, false);
        if (objLIZ != null) {
            return (ILiveStreamAdaptService) objLIZ;
        }
        if (C04TD.LJ == null) {
            synchronized (ILiveStreamAdaptService.class) {
                if (C04TD.LJ == null) {
                    C04TD.LJ = new LiveStreamAdaptServiceImpl();
                }
            }
        }
        return C04TD.LJ;
    }
}
