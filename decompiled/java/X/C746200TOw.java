package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C746200TOw extends C2217421BqW implements Function0<Unit> {
    public C746200TOw(Object obj) {
        super(0, obj, AdEntryShareSheetFragment.class, "onClickManageAdsTopics", "onClickManageAdsTopics()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Fragment fragment = (Fragment) this.receiver;
        fragment.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment, "//privacy/setting/personalization/topic");
        C0TOM.LIZ.getClass();
        smartRouteBuildRoute.withParam("keyHitDisconnectFeatureExperiment", C0TOM.LJII());
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }
}
