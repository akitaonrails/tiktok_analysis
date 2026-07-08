package X;

import com.ss.android.ugc.aweme.unifiedauth.service.ChannelAuthPopupServiceImpl;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IChannelAuthPopupService;

/* JADX INFO: renamed from: X.04TI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TI {
    public static final /* synthetic */ C04TI LIZ = new C04TI();

    public static IChannelAuthPopupService LIZ() {
        Object objLIZ = C04TD.LIZ(IChannelAuthPopupService.class, false);
        if (objLIZ != null) {
            return (IChannelAuthPopupService) objLIZ;
        }
        if (C04TD.S5 == null) {
            synchronized (IChannelAuthPopupService.class) {
                if (C04TD.S5 == null) {
                    C04TD.S5 = new ChannelAuthPopupServiceImpl();
                }
            }
        }
        return C04TD.S5;
    }
}
