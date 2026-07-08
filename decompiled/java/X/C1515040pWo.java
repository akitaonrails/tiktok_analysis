package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;

/* JADX INFO: renamed from: X.0pWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515040pWo extends AbstractC1515030pWn {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        PdpViewModel pdpViewModel;
        Activity activityLIZLLL;
        C19EG c19eg;
        InterfaceC1515050pWp interfaceC1515050pWp = (InterfaceC1515050pWp) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            pdpViewModel = (PdpViewModel) interfaceC634840OvC.LIZIZ(PdpViewModel.class);
        } else {
            pdpViewModel = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            activityLIZLLL = interfaceC634840OvC2.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if ((activityLIZLLL instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL) != null && pdpViewModel != null) {
            String strLIZ = C10347042v.LIZ(pdpViewModel, c19eg, interfaceC1515050pWp.getSchema(), interfaceC1515050pWp.getEntrance());
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID = interfaceC634840OvC3.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1515060pWq.class, containerID);
            ((InterfaceC1515060pWq) xBaseModelLIZJ).setSchema(strLIZ);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
    }
}
