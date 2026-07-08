package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0TSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747080TSg extends AbstractC747050TSd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC747070TSf interfaceC747070TSf = (InterfaceC747070TSf) xBaseParamModel;
        InterfaceC747060TSe interfaceC747060TSe = (InterfaceC747060TSe) C1909107dp.LIZJ(InterfaceC747060TSe.class, null);
        try {
            interfaceC747070TSf.getCardHeight();
            C747090TSh c747090TSh = C747090TSh.LIZ;
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
                containerID = "";
            }
            synchronized (c747090TSh) {
                Iterator it2 = ((ArrayList) C747090TSh.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC747100TSi) it2.next()).LIZ(containerID, interfaceC747070TSf);
                }
            }
            interfaceC747060TSe.setResult(1);
            completionBlock.onSuccess(interfaceC747060TSe, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            C2382909Vj.LIZ(completionBlock, -1, message, null, 4);
            C1AF0.LJ(th);
        }
    }
}
