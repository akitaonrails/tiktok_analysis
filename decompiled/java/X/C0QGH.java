package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.i;

/* JADX INFO: renamed from: X.0QGH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGH extends i {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        try {
            String page = ((i.b) xBaseParamModel).getPage();
            if (page != null && page.length() != 0) {
                C1440005kM.LIZ(new C7840034k(page));
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(i.c.class, containerID), "");
                return;
            }
            throw new Exception("page null");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "hide loading fail";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
