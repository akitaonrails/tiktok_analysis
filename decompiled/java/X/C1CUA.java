package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1CUA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CUA extends C1CUC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        Object c098200Yq;
        String containerID;
        C1CUB c1cub = (C1CUB) xBaseParamModel;
        try {
            c098200Yq = (Aweme) C7740030o.LIZ().getGson().LJII(C2817017f.LIZIZ(c1cub.getAwemeStruct()), Aweme.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        View view = null;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = null;
        }
        Aweme aweme = (Aweme) c098200Yq;
        if (aweme == null) {
            C2382909Vj.LIZ(completionBlock, 1, "aweme converted failed", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        }
        String scene = c1cub.getScene();
        String videoFrom = c1cub.getVideoFrom();
        Map<String, Object> innerFlowContext = c1cub.getInnerFlowContext();
        String keyword = c1cub.getKeyword();
        String searchId = c1cub.getSearchId();
        c1cub.getEnterMethod();
        String enterFrom = c1cub.getEnterFrom();
        String autoRouteSchema = c1cub.getAutoRouteSchema();
        Boolean autoOpenBag = c1cub.getAutoOpenBag();
        String bagPageParams = c1cub.getBagPageParams();
        c1cub.getPlayerSessionId();
        C0Q4U.LIZIZ(view, aweme, new C0Q4V(scene, videoFrom, innerFlowContext, keyword, searchId, enterFrom, autoRouteSchema, autoOpenBag, bagPageParams, c1cub.getLogExtra(), c1cub.getExtraQueryParams(), c1cub.getSearchChannel(), c1cub.getTracker(), c1cub.getTrafficSourceList(), c1cub.getPageData(), c1cub.getExtra()));
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C1CUD.class, containerID), "");
    }
}
