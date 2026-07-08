package X;

import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195030hCf extends AbstractC1195040hCg {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object obj;
        IRavenEventAbility iRavenEventAbility;
        Object objLIZ;
        Object obj2;
        long jCurrentTimeMillis;
        Number number;
        C1059860dge c1059860dge;
        InterfaceC1076710e7p interfaceC1076710e7p;
        InterfaceC1195050hCh interfaceC1195050hCh = (InterfaceC1195050hCh) xBaseParamModel;
        String eventName = interfaceC1195050hCh.getEventName();
        String containerID = null;
        if (a0.LJJJIL(eventName)) {
            C2382909Vj.LIZ(completionBlock, 0, "event_name is blank", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (c1059860dge = (C1059860dge) interfaceC634840OvC.LIZIZ(C1059860dge.class)) != null && (interfaceC1076710e7p = (InterfaceC1076710e7p) c1059860dge.LIZ(InterfaceC1076710e7p.class)) != null) {
            obj = interfaceC1076710e7p.get("raven_event_center");
        } else {
            obj = null;
        }
        if ((obj instanceof IRavenEventAbility) && (iRavenEventAbility = (IRavenEventAbility) obj) != null) {
            Map<String, Object> params = interfaceC1195050hCh.getParams();
            if (params != null) {
                objLIZ = C1543800qHC.LIZ(params);
                obj2 = params.get("timestamp");
            } else {
                objLIZ = params;
                obj2 = null;
            }
            if ((obj2 instanceof Number) && (number = (Number) obj2) != null) {
                jCurrentTimeMillis = number.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            RavenEvent ravenEvent = new RavenEvent(eventName, jCurrentTimeMillis, objLIZ);
            Boolean boolIsSticky = interfaceC1195050hCh.isSticky();
            if (boolIsSticky != null) {
                ravenEvent.LL = boolIsSticky.booleanValue();
            }
            iRavenEventAbility.dZ1(ravenEvent);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1195060hCi.class, containerID), "execute successfully");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "ravenEventCenter is null (not injected)", null, 4);
    }
}
