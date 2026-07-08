package X;

import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195180hCu extends AbstractC1195190hCv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Object obj;
        IRavenEventAbility iRavenEventAbility;
        Set<String> setRemove;
        Iterable iterableLLIIJI;
        Set<String> set;
        C1059860dge c1059860dge;
        InterfaceC1076710e7p interfaceC1076710e7p;
        InterfaceC1195200hCw interfaceC1195200hCw = (InterfaceC1195200hCw) xBaseParamModel;
        String eventName = interfaceC1195200hCw.getEventName();
        String sessionId = interfaceC1195200hCw.getSessionId();
        if (a0.LJJJIL(eventName)) {
            C2382909Vj.LIZ(completionBlock, -3, "event_name is blank", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null && containerID.length() != 0) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null && (c1059860dge = (C1059860dge) interfaceC634840OvC2.LIZIZ(C1059860dge.class)) != null && (interfaceC1076710e7p = (InterfaceC1076710e7p) c1059860dge.LIZ(InterfaceC1076710e7p.class)) != null) {
                obj = interfaceC1076710e7p.get("raven_event_center");
            } else {
                obj = null;
            }
            if ((obj instanceof IRavenEventAbility) && (iRavenEventAbility = (IRavenEventAbility) obj) != null) {
                if (sessionId != null && !a0.LJJJIL(sessionId)) {
                    iRavenEventAbility.Fk2(eventName, sessionId);
                    ConcurrentHashMap<String, ConcurrentHashMap<String, Set<String>>> concurrentHashMap = C1093604Pm.LIZ;
                    ConcurrentHashMap<String, Set<String>> concurrentHashMap2 = concurrentHashMap.get(containerID);
                    if (concurrentHashMap2 != null && (set = concurrentHashMap2.get(eventName)) != null) {
                        set.remove(sessionId);
                        if (set.isEmpty()) {
                            concurrentHashMap2.remove(eventName);
                        }
                        if (concurrentHashMap2.isEmpty()) {
                            concurrentHashMap.remove(containerID);
                        }
                    }
                } else {
                    ConcurrentHashMap<String, ConcurrentHashMap<String, Set<String>>> concurrentHashMap3 = C1093604Pm.LIZ;
                    ConcurrentHashMap<String, Set<String>> concurrentHashMap4 = concurrentHashMap3.get(containerID);
                    if (concurrentHashMap4 == null || (setRemove = concurrentHashMap4.remove(eventName)) == null) {
                        iterableLLIIJI = C08CX.INSTANCE;
                    } else {
                        if (concurrentHashMap4.isEmpty()) {
                            concurrentHashMap3.remove(containerID);
                        }
                        iterableLLIIJI = C13LP.LLIIJI(setRemove);
                    }
                    Iterator it2 = iterableLLIIJI.iterator();
                    while (it2.hasNext()) {
                        iRavenEventAbility.Fk2(eventName, (String) it2.next());
                    }
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1195210hCx.class, containerID), "success");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "ravenEventCenter is null (not injected)", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, -3, "containerId is null", null, 4);
    }
}
