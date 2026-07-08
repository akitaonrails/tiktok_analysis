package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Dd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343300Dd2 extends AbstractC343320Dd4 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        Aweme awemeXr;
        C1035880d3y c1035880d3y;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        SparkContext.Companion.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if ((c1537480q70LIZIZ == null || (((c1035880d3y = (C1035880d3y) c1537480q70LIZIZ.LJFF(C1035880d3y.class)) == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null) && (awemeRawAd = (AwemeRawAd) c1537480q70LIZIZ.LJFF(AwemeRawAd.class)) == null)) && (!C123100dR.LIZ(null) || (awemeXr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).xr(null)) == null || (awemeRawAd = awemeXr.getAwemeRawAd()) == null)) {
            C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
            if (c1019830ce5LIZ != null && (aweme = c1019830ce5LIZ.LJIIL) != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
        }
        if (awemeRawAd == null) {
            C2382909Vj.LIZ(completionBlock, 0, "no raw ad data", null, 4);
            return;
        }
        JSONObject frontendData = awemeRawAd.getFrontendData();
        if (frontendData == null) {
            C2382909Vj.LIZ(completionBlock, 0, "no frontend data", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC343310Dd3.class, containerID2);
        ((InterfaceC343310Dd3) xBaseModelLIZJ).setFrontendData(frontendData);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
