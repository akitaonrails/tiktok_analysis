package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044980dIe extends AbstractC1044990dIf {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1045000dIg interfaceC1045000dIg = (InterfaceC1045000dIg) xBaseParamModel;
        String containerID = null;
        if (a0.LJJJIL(interfaceC1045000dIg.getAwemeStruct())) {
            C2382909Vj.LIZ(completionBlock, -1, "invalid_aweme", null, 4);
            return;
        }
        IShoppingTaskHostService iShoppingTaskHostService = (IShoppingTaskHostService) PluggableExtentionKt.pluggableSpi$default(IShoppingTaskHostService.class, false, false, false, 14, null);
        if (iShoppingTaskHostService == null) {
            C2382909Vj.LIZ(completionBlock, -1, "invalid_aweme", null, 4);
            return;
        }
        iShoppingTaskHostService.LJ(new C1044740dIG(interfaceC1045000dIg.getLabel(), interfaceC1045000dIg.getTag(), interfaceC1045000dIg.getRefer(), interfaceC1045000dIg.getAwemeStruct(), interfaceC1045000dIg.getAdExtra()));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1045010dIh.class, containerID);
        InterfaceC1045010dIh interfaceC1045010dIh = (InterfaceC1045010dIh) xBaseModelLIZJ;
        interfaceC1045010dIh.setCode(1);
        interfaceC1045010dIh.setMsg("success");
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
