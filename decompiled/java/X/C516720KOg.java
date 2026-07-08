package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516720KOg extends AbstractC516730KOh {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        final InterfaceC516710KOf interfaceC516710KOf = (InterfaceC516710KOf) xBaseParamModel;
        Number serviceId = interfaceC516710KOf.getServiceId();
        Number methodId = interfaceC516710KOf.getMethodId();
        Map<String, InterfaceC486470J5x> map = C07WY.LIZ;
        String containerID2 = null;
        if (((LinkedHashMap) map).get(C07WY.LIZ(serviceId, methodId)) == null) {
            InterfaceC486470J5x interfaceC486470J5x = new InterfaceC486470J5x() { // from class: X.0J8X
                @Override // X.InterfaceC486470J5x
                public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                    C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(new JSONObject(new String(wsChannelMsg.LIZ(), Charsets.UTF_8))), interfaceC516710KOf.getEventName()));
                }
            };
            map.put(C07WY.LIZ(interfaceC516710KOf.getServiceId(), interfaceC516710KOf.getMethodId()), interfaceC486470J5x);
            C2203431BLp.LIZIZ.LJI(interfaceC516710KOf.getServiceId().intValue(), interfaceC516710KOf.getMethodId().intValue(), interfaceC486470J5x);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID2 = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC516740KOi.class, containerID2), "Success");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        } else {
            containerID = null;
        }
        C1909107dp.LIZJ(InterfaceC516740KOi.class, containerID);
        C2382909Vj.LIZ(completionBlock, 0, "Fail, you have already subscribed the same frontier msg", null, 4);
    }
}
