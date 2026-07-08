package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0dIN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044810dIN extends AbstractC1044830dIP {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context contextLIZLLL;
        InterfaceC1044850dIR interfaceC1044850dIR = (InterfaceC1044850dIR) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            contextLIZLLL = interfaceC634840OvC.LIZLLL();
            if (contextLIZLLL == null) {
                contextLIZLLL = interfaceC634840OvC.getContext();
            }
        } else {
            contextLIZLLL = null;
        }
        if (contextLIZLLL == null) {
            C2382909Vj.LIZ(completionBlock, -1, "invalid_context", null, 4);
            return;
        }
        IShoppingTaskHostService iShoppingTaskHostService = (IShoppingTaskHostService) PluggableExtentionKt.pluggableSpi$default(IShoppingTaskHostService.class, false, false, false, 14, null);
        if (iShoppingTaskHostService == null) {
            C2382909Vj.LIZ(completionBlock, -1, "crouter_unavailable", null, 4);
            return;
        }
        AbstractC1044870dIT abstractC1044870dITLIZLLL = iShoppingTaskHostService.LIZLLL(contextLIZLLL, new C1044780dIK(interfaceC1044850dIR.getEvent(), interfaceC1044850dIR.getRefer(), interfaceC1044850dIR.getEnterFrom().intValue(), interfaceC1044850dIR.getAwemeStruct()));
        if (abstractC1044870dITLIZLLL instanceof C1044900dIW) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1044880dIU.class, containerID), "");
            return;
        }
        if (abstractC1044870dITLIZLLL instanceof C1044790dIL) {
            C2382909Vj.LIZ(completionBlock, -1, ((C1044790dIL) abstractC1044870dITLIZLLL).LIZ, null, 4);
            return;
        }
        throw new C1954807lC();
    }
}
