package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcSearchAIAbility;

/* JADX INFO: renamed from: X.0Nmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604270Nmz extends AbstractC604230Nmv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EcSearchAIAbility ecSearchAIAbilityLIZ = C604280Nn0.LIZ(this.IBridgeSdkContext);
        String containerID = null;
        if (ecSearchAIAbilityLIZ != null) {
            ecSearchAIAbilityLIZ.XY();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            InterfaceC604260Nmy interfaceC604260Nmy = (InterfaceC604260Nmy) C1909107dp.LIZJ(InterfaceC604260Nmy.class, containerID);
            interfaceC604260Nmy.setCode(1);
            interfaceC604260Nmy.setMsg("success");
            completionBlock.onSuccess(interfaceC604260Nmy, "");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        InterfaceC604260Nmy interfaceC604260Nmy2 = (InterfaceC604260Nmy) C1909107dp.LIZJ(InterfaceC604260Nmy.class, containerID);
        interfaceC604260Nmy2.setCode(0);
        String str = "EcSearchAIAbility is null";
        interfaceC604260Nmy2.setMsg("EcSearchAIAbility is null");
        String msg = interfaceC604260Nmy2.getMsg();
        if (msg != null) {
            str = msg;
        }
        completionBlock.onFailure(0, str, interfaceC604260Nmy2);
    }
}
