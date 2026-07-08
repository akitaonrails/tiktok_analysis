package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513820pUq extends AbstractC1513790pUn {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1513830pUr interfaceC1513830pUr = (InterfaceC1513830pUr) xBaseParamModel;
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null) {
            String entrance = interfaceC1513830pUr.getEntrance();
            String eventName = interfaceC1513830pUr.getEventName();
            HashMap map = new HashMap();
            Map<String, Object> params = interfaceC1513830pUr.getParams();
            if (params != null) {
                map.putAll(params);
            }
            iProbeService.LJIIIIZZ(new AnonymousClass1489(entrance, eventName, map, null, 248));
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1513800pUo.class, containerID);
        ((InterfaceC1513800pUo) xBaseModelLIZJ).setSupported(Boolean.TRUE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
