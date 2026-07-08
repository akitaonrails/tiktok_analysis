package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;

/* JADX INFO: renamed from: X.03iE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C917203iE extends AbstractC918203iO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C03M2.LIZ.getClass();
        MiniOspActivity miniOspActivityLIZ = C03M2.LIZ();
        String containerID = null;
        boolean z = false;
        if (miniOspActivityLIZ == null) {
            C2382909Vj.LIZ(completionBlock, 0, "can't find osp activity", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC918103iN.class, containerID);
        InterfaceC918103iN interfaceC918103iN = (InterfaceC918103iN) xBaseModelLIZJ;
        if (miniOspActivityLIZ.LLLLZLLLI().getState().LLJJLIIIJLLLLLLLZ && miniOspActivityLIZ.LLLLZLLLI().LLIZLLLIL == null) {
            z = true;
        }
        interfaceC918103iN.setSuccess(Boolean.valueOf(z));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "Success");
    }
}
