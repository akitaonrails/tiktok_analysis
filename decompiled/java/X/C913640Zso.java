package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0Zso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913640Zso implements InterfaceC913650Zsp {
    public static final C913640Zso LIZJ = new C913640Zso();

    @Override // X.InterfaceC913650Zsp
    public final void LJJIIJZLJL(Activity activity, C913140Zs0 c913140Zs0, int i) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//im/detail/group");
        smartRouteBuildRoute.withParam("key_conversation_id", c913140Zs0.getConversationId());
        smartRouteBuildRoute.open(i);
    }
}
