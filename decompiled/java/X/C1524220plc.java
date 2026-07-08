package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.spark.business.AnchorCommonContext;
import com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext;

/* JADX INFO: renamed from: X.0plc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524220plc extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        WebKitView webKitView;
        AnchorCommonContext anchorCommonContext;
        C0V1Y c0v1yLIZ = LIZ();
        if (!(c0v1yLIZ instanceof WebKitView) || (webKitView = (WebKitView) c0v1yLIZ) == null) {
            return;
        }
        C1537480q70 hybridContext = webKitView.getHybridContext();
        if (!(hybridContext instanceof SparkContext) || hybridContext == null || (anchorCommonContext = (AnchorCommonContext) hybridContext.LJFF(AnchorCommonContext.class)) == null) {
            return;
        }
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new BaseThirdPartyContext.a(anchorCommonContext));
    }
}
