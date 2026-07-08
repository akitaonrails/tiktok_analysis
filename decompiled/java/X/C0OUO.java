package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0OUO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OUO extends C0OUP {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0OUQ c0ouq = (C0OUQ) xBaseParamModel;
        String containerID = null;
        if (!C0OU6.LIZ()) {
            C2382909Vj.LIZ(completionBlock, 1, "client not enable", null, 4);
            return;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c0ouq.getBulletinBoardId());
        if (lLJIILIIL != null) {
            long jLongValue = lLJIILIIL.longValue();
            if (jLongValue != 0) {
                C1440005kM.LIZ(new C0OU5(jLongValue));
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0OUR.class, containerID), "success");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, 1, "bbId is null", null, 4);
    }
}
