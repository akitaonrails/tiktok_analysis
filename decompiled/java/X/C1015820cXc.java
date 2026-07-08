package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.PlayableData;

/* JADX INFO: renamed from: X.0cXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015820cXc extends AbstractC1015830cXd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String str;
        PlayableData playableData;
        C1035880d3y c1035880d3y;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        AwemeRawAd awemeRawAd = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        SparkContext.Companion.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && ((c1035880d3y = (C1035880d3y) c1537480q70LIZIZ.LJFF(C1035880d3y.class)) == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null)) {
            awemeRawAd = (AwemeRawAd) c1537480q70LIZIZ.LJFF(AwemeRawAd.class);
        }
        XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, C13LE.LIZ(InterfaceC1015840cXe.class));
        InterfaceC1015840cXe interfaceC1015840cXe = (InterfaceC1015840cXe) xBaseModelLIZJ;
        if (awemeRawAd == null || (playableData = awemeRawAd.getPlayableData()) == null || (str = playableData.playableStyle) == null) {
            str = "";
        }
        interfaceC1015840cXe.setPlayableStyle(str);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
