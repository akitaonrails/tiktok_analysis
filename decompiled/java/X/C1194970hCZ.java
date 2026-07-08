package X;

import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194970hCZ extends AbstractC747250TSx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object obj;
        IRavenDataAbility iRavenDataAbility;
        Object objLJ;
        Object obj2;
        long jCurrentTimeMillis;
        Number number;
        C1059860dge c1059860dge;
        InterfaceC1076710e7p interfaceC1076710e7p;
        C0TT0 c0tt0 = (C0TT0) xBaseParamModel;
        String key = c0tt0.getKey();
        String containerID = null;
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
            Map<String, Object> data = c0tt0.getData();
            if (data == null || (objLJ = C1543800qHC.LIZ(data)) == null) {
                objLJ = C2097608Jq.LJ();
            }
            if (data != null) {
                obj2 = data.get("timestamp");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof Number) && (number = (Number) obj2) != null) {
                jCurrentTimeMillis = number.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            iRavenDataAbility.uJ(key, new RavenData<>(objLJ, jCurrentTimeMillis));
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC747260TSy.class, containerID), "execute successfully");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "ravenDataCenter is null (not injected)", null, 4);
    }
}
