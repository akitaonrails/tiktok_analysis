package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797400wsE extends AbstractC1793290wlb {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        String containerID;
        C1874950ytJ c1874950ytJ;
        InterfaceC1797410wsF interfaceC1797410wsF;
        InterfaceC1793300wlc interfaceC1793300wlc = (InterfaceC1793300wlc) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 == null || (containerID = interfaceC634840OvC2.getContainerID()) == null) {
                containerID = "";
            }
            if (!activityLIZLLL.isTaskRoot()) {
                if (interfaceC1793300wlc.isCloseCurrentActivity() && C500260Jjc.LJJIIZ(containerID)) {
                    try {
                        C1874950ytJ c1874950ytJ2 = (C1874950ytJ) provideContext(C1874950ytJ.class);
                        if ((c1874950ytJ2 != null && (interfaceC1797410wsF = c1874950ytJ2.LJI) != null) || ((c1874950ytJ = C1874950ytJ.LJIIL) != null && (interfaceC1797410wsF = c1874950ytJ.LJI) != null)) {
                            interfaceC1797410wsF.LIZ(this.IBridgeSdkContext, enumC1063300dmC, containerID, true);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                activityLIZLLL.moveTaskToBack(!activityLIZLLL.isTaskRoot());
                return;
            }
            activityLIZLLL.finishAffinity();
        }
    }
}
