package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;

/* JADX INFO: renamed from: X.03iD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C917103iD extends AbstractC917603iI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC918303iP interfaceC918303iP = (InterfaceC918303iP) xBaseParamModel;
        C03M2.LIZ.getClass();
        MiniOspActivity miniOspActivityLIZ = C03M2.LIZ();
        String containerID = null;
        if (miniOspActivityLIZ == null) {
            C2382909Vj.LIZ(completionBlock, 0, "can't find osp activity", null, 4);
            return;
        }
        MiniOspViewModel miniOspViewModelLLLLZLLLI = miniOspActivityLIZ.LLLLZLLLI();
        MiniOspViewModel.vQ2(miniOspViewModelLLLLZLLLI, miniOspActivityLIZ, null, null, interfaceC918303iP.getPaymentToken(), 14);
        miniOspViewModelLLLLZLLLI.LLILZLL.LJIJI(miniOspViewModelLLLLZLLLI.hi1(false));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC918803iU.class, containerID), "Success");
    }
}
