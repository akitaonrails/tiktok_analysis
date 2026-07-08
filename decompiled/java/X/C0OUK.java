package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0OUK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OUK extends C0OUL {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        C0OUJ c0ouj = (C0OUJ) xBaseParamModel;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c0ouj.getBulletinBoardId());
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        String containerID = null;
        if (jLongValue == 0) {
            C2382909Vj.LIZ(completionBlock, 1, "bbId is null", null, 4);
            return;
        }
        C1440005kM.LIZ(new C0ORN(c0ouj.getBulletinBoardId(), c0ouj.getScene(), null));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0OUM.class, containerID), "success");
    }
}
