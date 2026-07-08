package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679010QkF extends AbstractC679020QkG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC679030QkH interfaceC679030QkH = (InterfaceC679030QkH) xBaseParamModel;
        try {
            String keyword = interfaceC679030QkH.getKeyword();
            Number correctLevel = interfaceC679030QkH.getCorrectLevel();
            if (correctLevel != null) {
                correctLevel.intValue();
            }
            C1440005kM.LIZ(new C668900QLo(keyword));
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC679040QkI.class, containerID), "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "query correct fail";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
