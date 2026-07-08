package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;

/* JADX INFO: renamed from: X.0pFB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504110pFB extends AbstractC1504080pF8 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1504100pFA interfaceC1504100pFA = (InterfaceC1504100pFA) xBaseParamModel;
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null) {
            iProbeService.LJIIJJI(new C1504130pFD(interfaceC1504100pFA.getEntrance()));
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1504090pF9.class, containerID);
        ((InterfaceC1504090pF9) xBaseModelLIZJ).setSupported(Boolean.TRUE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
