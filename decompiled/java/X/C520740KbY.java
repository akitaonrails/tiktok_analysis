package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520740KbY extends AbstractC520750KbZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC520760Kba interfaceC520760Kba = (InterfaceC520760Kba) xBaseParamModel;
        Number serviceId = interfaceC520760Kba.getServiceId();
        Number methodId = interfaceC520760Kba.getMethodId();
        Map<String, InterfaceC486470J5x> map = C07WY.LIZ;
        String containerID2 = null;
        if (((LinkedHashMap) map).get(C07WY.LIZ(serviceId, methodId)) != null) {
            C2203431BLp.LIZIZ.LJII(interfaceC520760Kba.getServiceId().intValue(), interfaceC520760Kba.getMethodId().intValue());
            map.remove(C07WY.LIZ(interfaceC520760Kba.getServiceId(), interfaceC520760Kba.getMethodId()));
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID2 = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC520770Kbb.class, containerID2), "Success");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        } else {
            containerID = null;
        }
        C1909107dp.LIZJ(InterfaceC520770Kbb.class, containerID);
        C2382909Vj.LIZ(completionBlock, 0, "Fail", null, 4);
    }
}
