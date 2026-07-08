package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ceE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019920ceE extends AbstractC1019930ceF {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Integer numValueOf;
        InterfaceC1019940ceG interfaceC1019940ceG = (InterfaceC1019940ceG) xBaseParamModel;
        String containerID = null;
        if (interfaceC1019940ceG.getStatus() == null) {
            C2382909Vj.LIZ(completionBlock, -1, "status is empty", null, 4);
            return;
        }
        Number status = interfaceC1019940ceG.getStatus();
        if (status != null && (numValueOf = Integer.valueOf(status.intValue())) != null) {
            C1440005kM.LIZ(new C824380WVo(numValueOf.intValue()));
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1019950ceH.class, containerID), "post status success");
    }
}
