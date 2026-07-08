package X;

import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194960hCY extends AbstractC747220TSu {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object obj;
        IRavenDataAbility iRavenDataAbility;
        String containerID;
        Object obj2;
        Map<String, ? extends Object> map;
        C1059860dge c1059860dge;
        InterfaceC1076710e7p interfaceC1076710e7p;
        String key = ((InterfaceC747230TSv) xBaseParamModel).getKey();
        Long lValueOf = null;
        if (a0.LJJJIL(key)) {
            C2382909Vj.LIZ(completionBlock, 0, "key is blank", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (c1059860dge = (C1059860dge) interfaceC634840OvC.LIZIZ(C1059860dge.class)) != null && (interfaceC1076710e7p = (InterfaceC1076710e7p) c1059860dge.LIZ(InterfaceC1076710e7p.class)) != null) {
            obj = interfaceC1076710e7p.get("raven_data_center");
        } else {
            obj = null;
        }
        if ((obj instanceof IRavenDataAbility) && (iRavenDataAbility = (IRavenDataAbility) obj) != null) {
            RavenData<Object> ravenDataNH = iRavenDataAbility.nH(key);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            InterfaceC747210TSt interfaceC747210TSt = (InterfaceC747210TSt) C1909107dp.LIZJ(InterfaceC747210TSt.class, containerID);
            if (ravenDataNH != null) {
                obj2 = ravenDataNH.data;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Map) {
                map = (Map) obj2;
            } else {
                map = null;
            }
            interfaceC747210TSt.setData(map);
            if (ravenDataNH != null) {
                lValueOf = Long.valueOf(ravenDataNH.timestamp);
            }
            interfaceC747210TSt.setTimestamp(lValueOf);
            completionBlock.onSuccess(interfaceC747210TSt, "execute successfully");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "ravenDataCenter is null (not injected)", null, 4);
    }
}
