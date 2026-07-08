package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0K0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0Y extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0K0S LL;
    public final /* synthetic */ C510560K0o LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K0Y(C0K0S c0k0s, C510560K0o c510560K0o, String str, String str2) {
        super(0);
        this.LL = c0k0s;
        this.LLILLJJLI = c510560K0o;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LL.LJ;
        if (subscriptionPrivilegeDetailFragment != null) {
            subscriptionPrivilegeDetailFragment.cS(this.LLILLJJLI.LIZ, C2097608Jq.LJ());
        }
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = this.LL.LJ;
        if (subscriptionPrivilegeDetailFragment2 != null && (context = subscriptionPrivilegeDetailFragment2.getContext()) != null) {
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://mix/playlist/viewAll");
            smartRouteBuildRoute.withParam("uid", str);
            smartRouteBuildRoute.withParam("sec_uid", str2);
            smartRouteBuildRoute.withParam("playlist_previous_page", "subscription_privilege_page");
            smartRouteBuildRoute.withParam("enter_from", "subscription_privilege_page");
            smartRouteBuildRoute.withParam(Scene.SCENE_SERVICE, 1);
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }
}
