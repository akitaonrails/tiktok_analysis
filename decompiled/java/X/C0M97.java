package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;

/* JADX INFO: renamed from: X.0M97, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M97 {
    public static final C0M97 LIZ = new C0M97();

    public static boolean LIZ() {
        IAVServiceProxy iAVServiceProxy;
        InterfaceC566960MLm storyService;
        return C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ() && (iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null)) != null && (storyService = iAVServiceProxy.getStoryService()) != null && storyService.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_story_ai_live_photo", true) > 0;
    }
}
