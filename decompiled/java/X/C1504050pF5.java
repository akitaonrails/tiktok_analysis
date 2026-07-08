package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;

/* JADX INFO: renamed from: X.0pF5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504050pF5 extends AbstractC1504040pF4 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zLJII;
        String containerID;
        String str;
        InterfaceC1504030pF3 interfaceC1504030pF3 = (InterfaceC1504030pF3) xBaseParamModel;
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null) {
            zLJII = iProbeService.LJII(interfaceC1504030pF3.getParams());
        } else {
            zLJII = false;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1504060pF6.class, containerID);
        InterfaceC1504060pF6 interfaceC1504060pF6 = (InterfaceC1504060pF6) xBaseModelLIZJ;
        if (zLJII) {
            str = "success";
        } else {
            str = "malformed";
        }
        interfaceC1504060pF6.setResult(str);
        interfaceC1504060pF6.setSupported(Boolean.TRUE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
