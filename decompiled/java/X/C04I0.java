package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;

/* JADX INFO: renamed from: X.04I0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04I0 extends AbstractC1074104Hz {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        PdpViewModel pdpViewModel;
        View view;
        InterfaceC1074004Hy interfaceC1074004Hy = (InterfaceC1074004Hy) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            pdpViewModel = (PdpViewModel) interfaceC634840OvC.LIZIZ(PdpViewModel.class);
        } else {
            pdpViewModel = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            view = (View) interfaceC634840OvC2.LIZIZ(View.class);
        } else {
            view = null;
        }
        if (pdpViewModel != null && view != null) {
            if (interfaceC1074004Hy.getReviewId() == null) {
                pdpViewModel.LLLLLILLIL.LIZIZ(view, "all_customer_review", null, pdpViewModel.LLILZIL.LJIIIZ(), interfaceC1074004Hy);
            } else {
                pdpViewModel.LLLLLILLIL.LIZIZ(view, "review", interfaceC1074004Hy.getReviewId(), pdpViewModel.LLILZIL.LJIIIZ(), interfaceC1074004Hy);
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C04I2.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
    }
}
