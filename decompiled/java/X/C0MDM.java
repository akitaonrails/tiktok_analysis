package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;

/* JADX INFO: renamed from: X.0MDM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MDM {
    public static final C0MDM LIZ = new C0MDM();

    public static boolean LIZ() {
        IAVServiceProxy iAVServiceProxy;
        InterfaceC566960MLm storyService;
        return C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ() && (iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null)) != null && (storyService = iAVServiceProxy.getStoryService()) != null && storyService.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_main_camera_ai_alive", true) > 0;
    }
}
