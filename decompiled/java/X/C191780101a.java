package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.MaskExtraModule;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.101a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C191780101a extends C2217421BqW implements Function1<String, Unit> {
    public C191780101a(C101N c101n) {
        super(1, c101n, C101N.class, "onPolicyLinkClick", "onPolicyLinkClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2;
        MaskExtraModule maskExtraModule;
        C101N c101n = (C101N) this.receiver;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c101n.LIZ, "//webview");
        VideoMaskInfo contentClassificationMaskInfo = c101n.LIZIZ.getContentClassificationMaskInfo();
        if (contentClassificationMaskInfo != null && (maskExtraModule = contentClassificationMaskInfo.policyModule) != null) {
            str2 = maskExtraModule.url;
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("url", str2);
        smartRouteBuildRoute.withParam("hide_nav_bar", true);
        smartRouteBuildRoute.withParam("hide_status_bar", true);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }
}
