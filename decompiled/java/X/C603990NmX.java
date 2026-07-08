package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.IWebAuthSyncLoginServer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0NmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603990NmX extends AbstractC603970NmV {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID = null;
        if (((IWebAuthSyncLoginServer) ServiceManager.get().getService(IWebAuthSyncLoginServer.class)).LIZ()) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC603980NmW.class, containerID);
            ((InterfaceC603980NmW) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC603980NmW.class, containerID);
        ((InterfaceC603980NmW) xBaseModelLIZJ2).setCode(-3);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
    }
}
