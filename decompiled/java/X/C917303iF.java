package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;

/* JADX INFO: renamed from: X.03iF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C917303iF extends AbstractC917703iJ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int value;
        InterfaceC918003iM interfaceC918003iM = (InterfaceC918003iM) xBaseParamModel;
        C03M2.LIZ.getClass();
        MiniOspActivity miniOspActivityLIZ = C03M2.LIZ();
        String containerID = null;
        if (miniOspActivityLIZ == null) {
            C2382909Vj.LIZ(completionBlock, 0, "can't find osp activity", null, 4);
            return;
        }
        MiniOspViewModel miniOspViewModelLLLLZLLLI = miniOspActivityLIZ.LLLLZLLLI();
        Number changeType = interfaceC918003iM.getChangeType();
        if (changeType != null) {
            value = changeType.intValue();
        } else {
            value = C03DI.DEFAULT.getValue();
        }
        MiniOspViewModel.eR2(miniOspViewModelLLLLZLLLI, false, false, false, new ChangeInfo(value, null, null, null), null, 95);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC918903iV.class, containerID), "Success");
    }
}
