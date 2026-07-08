package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0yxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877590yxZ extends AbstractC1877570yxX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1877580yxY interfaceC1877580yxY = (InterfaceC1877580yxY) xBaseParamModel;
        try {
            long jLongValue = interfaceC1877580yxY.getInterestId().longValue();
            C15TW c15tw = C15TW.LIZ;
            C15TW.LIZIZ(interfaceC1877580yxY.getAwemeIds(), jLongValue, interfaceC1877580yxY.isPinTopic(), interfaceC1877580yxY.getInterestName());
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1877550yxV.class, containerID);
            ((InterfaceC1877550yxV) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "exploreUgCardShow failed";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
