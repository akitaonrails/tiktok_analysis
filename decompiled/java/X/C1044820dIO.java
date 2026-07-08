package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044820dIO extends AbstractC1044840dIQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1044860dIS interfaceC1044860dIS = (InterfaceC1044860dIS) xBaseParamModel;
        String containerID = null;
        if (a0.LJJJIL(interfaceC1044860dIS.getAwemeStruct())) {
            C2382909Vj.LIZ(completionBlock, -1, "invalid_aweme", null, 4);
            return;
        }
        IShoppingTaskHostService iShoppingTaskHostService = (IShoppingTaskHostService) PluggableExtentionKt.pluggableSpi$default(IShoppingTaskHostService.class, false, false, false, 14, null);
        if (iShoppingTaskHostService == null) {
            C2382909Vj.LIZ(completionBlock, -1, "invalid_aweme", null, 4);
            return;
        }
        iShoppingTaskHostService.LIZJ(new C1044800dIM(interfaceC1044860dIS.getLabel(), interfaceC1044860dIS.getAwemeStruct()));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1044890dIV.class, containerID), "");
    }
}
