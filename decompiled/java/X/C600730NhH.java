package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600730NhH extends AbstractC600740NhI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC600750NhJ interfaceC600750NhJ = (InterfaceC600750NhJ) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC == null) {
            C2382909Vj.LIZ(completionBlock, -1, "bridge context is empty", null, 4);
            return;
        }
        if (interfaceC600750NhJ.getCallbackId().length() == 0) {
            C2382909Vj.LIZ(completionBlock, -1, "empty callback id when trigger responsive event", null, 4);
            return;
        }
        InterfaceC600380Ngi interfaceC600380Ngi = (InterfaceC600380Ngi) interfaceC634840OvC.LIZIZ(InterfaceC600380Ngi.class);
        if (interfaceC600380Ngi != null) {
            String callbackId = interfaceC600750NhJ.getCallbackId();
            Map<String, Object> data = interfaceC600750NhJ.getData();
            interfaceC600380Ngi.q2(interfaceC600750NhJ.getCode().intValue(), callbackId, interfaceC600750NhJ.getMsg(), data);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC600760NhK.class, containerID), "");
            return;
        }
        C600390Ngj.LIZ("lack region context");
        C2382909Vj.LIZ(completionBlock, -1, "lack region context", null, 4);
    }
}
