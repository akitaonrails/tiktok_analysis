package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0QFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667300QFk extends AbstractC667310QFl {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Integer numValueOf;
        int iIntValue;
        InterfaceC667320QFm interfaceC667320QFm = (InterfaceC667320QFm) xBaseParamModel;
        String id = interfaceC667320QFm.getId();
        String containerID = null;
        if (id != null && id.length() > 0) {
            Number status = interfaceC667320QFm.getStatus();
            if (status != null && ((iIntValue = (numValueOf = Integer.valueOf(status.intValue())).intValue()) == 1 || iIntValue == 0)) {
                C1440005kM.LIZ(new C0OGJ(id, numValueOf.intValue(), true));
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC667330QFn.class, containerID), "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "collect status is not valid", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "music id is not valid", null, 4);
    }
}
