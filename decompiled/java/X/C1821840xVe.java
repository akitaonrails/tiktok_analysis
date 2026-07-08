package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkWebviewAssem;
import com.bytedance.hybrid.spark.third.container.SparkThirdWebViewInner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821840xVe extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsThirdPartyLinkWebviewAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821840xVe(PcsThirdPartyLinkWebviewAssem pcsThirdPartyLinkWebviewAssem) {
        super(0);
        this.LL = pcsThirdPartyLinkWebviewAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1BHX c1bhx;
        C1BHX c1bhx2 = this.LL.LLJJIII;
        if (c1bhx2 != null && c1bhx2.LLJ.canGoForward() && (c1bhx = this.LL.LLJJIII) != null) {
            SparkThirdWebViewInner sparkThirdWebViewInner = c1bhx.LLJ;
            if (sparkThirdWebViewInner.canGoForward()) {
                sparkThirdWebViewInner.goForward();
            }
        }
        return Unit.LIZ;
    }
}
