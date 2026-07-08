package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcSearchAIAbility;

/* JADX INFO: renamed from: X.0Nn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604300Nn2 extends AbstractC604310Nn3 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC604330Nn5 interfaceC604330Nn5 = (InterfaceC604330Nn5) xBaseParamModel;
        EcSearchAIAbility ecSearchAIAbilityLIZ = C604280Nn0.LIZ(this.IBridgeSdkContext);
        String containerID = null;
        if (ecSearchAIAbilityLIZ != null) {
            ecSearchAIAbilityLIZ.TB1(interfaceC604330Nn5.getRequestParams(), interfaceC604330Nn5.isRetry());
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            InterfaceC604320Nn4 interfaceC604320Nn4 = (InterfaceC604320Nn4) C1909107dp.LIZJ(InterfaceC604320Nn4.class, containerID);
            interfaceC604320Nn4.setCode(1);
            interfaceC604320Nn4.setMsg("");
            completionBlock.onSuccess(interfaceC604320Nn4, "");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        InterfaceC604320Nn4 interfaceC604320Nn42 = (InterfaceC604320Nn4) C1909107dp.LIZJ(InterfaceC604320Nn4.class, containerID);
        interfaceC604320Nn42.setCode(0);
        String str = "EcSearchAIAbility is null";
        interfaceC604320Nn42.setMsg("EcSearchAIAbility is null");
        String msg = interfaceC604320Nn42.getMsg();
        if (msg != null) {
            str = msg;
        }
        completionBlock.onFailure(0, str, interfaceC604320Nn42);
    }
}
