package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0uzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724880uzG extends AbstractC1724890uzH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1724900uzI interfaceC1724900uzI = (InterfaceC1724900uzI) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            C1724870uzF c1724870uzF = C1724870uzF.LIZ;
            String requestId = interfaceC1724900uzI.getRequestId();
            String redirectUri = interfaceC1724900uzI.getRedirectUri();
            AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(590);
            c1724870uzF.getClass();
            C1724870uzF.LIZIZ = aFwS268S0000000_26;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://ec/transparent_singpass_handle");
            smartRouteBuildRoute.withParam("request_id", requestId);
            smartRouteBuildRoute.withParam("redirect_uri", redirectUri);
            smartRouteBuildRoute.open();
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1724910uzJ.class, containerID), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "Android context is null", null, 4);
    }
}
