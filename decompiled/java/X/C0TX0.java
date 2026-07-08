package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TX0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TX0 extends AbstractC748290TWx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC748300TWy interfaceC748300TWy = (InterfaceC748300TWy) xBaseParamModel;
        try {
            if (C297490BlL.LIZ() < 0) {
                C2382909Vj.LIZ(completionBlock, 0, "not hit the fyp gps card exp", null, 4);
            }
            String creationId = interfaceC748300TWy.getCreationId();
            C0TX1.LIZ = true;
            C0TX1.LIZJ = creationId;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC748280TWw.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
            ((InterfaceC748280TWw) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "notify auth success");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2382909Vj.LIZ(completionBlock, 0, "notify auth failed", null, 4);
        }
    }
}
