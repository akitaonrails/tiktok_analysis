package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkWebviewAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821830xVd extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ PcsThirdPartyLinkWebviewAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821830xVd(PcsThirdPartyLinkWebviewAssem pcsThirdPartyLinkWebviewAssem) {
        super(0);
        this.LL = pcsThirdPartyLinkWebviewAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1BHX c1bhx = this.LL.LLJJIII;
        boolean z = false;
        if (c1bhx != null && c1bhx.canGoBack()) {
            C1BHX c1bhx2 = this.LL.LLJJIII;
            if (c1bhx2 != null) {
                c1bhx2.LIZIZ();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
