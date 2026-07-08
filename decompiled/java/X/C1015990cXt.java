package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015990cXt extends AbstractC1016000cXu {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(355));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
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
        if (C1017180cZo.LJIILL(awemeRawAd) || C1017180cZo.LJIIZILJ(awemeRawAd)) {
            ((InterfaceC1013940cUa) this.LLILLL.getValue()).LJI();
        }
        completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID, C13LE.LIZ(InterfaceC1016020cXw.class)), "");
    }
}
