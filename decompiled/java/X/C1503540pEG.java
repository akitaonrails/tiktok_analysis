package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pEG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503540pEG extends AbstractC1503560pEI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        IHostLogDepend iHostLogDepend;
        InterfaceC1503550pEH interfaceC1503550pEH = (InterfaceC1503550pEH) xBaseParamModel;
        String eventName = interfaceC1503550pEH.getEventName();
        boolean zBooleanValue = false;
        if (eventName != null && eventName.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String containerID = null;
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, null, null, 6);
            return;
        }
        Map<String, Object> params = interfaceC1503550pEH.getParams();
        Boolean addCommonParams = interfaceC1503550pEH.getAddCommonParams();
        if (addCommonParams != null) {
            zBooleanValue = addCommonParams.booleanValue();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                if (entry.getValue() != null) {
                    Object value = entry.getValue();
                    if (value instanceof Map) {
                        try {
                            String key = entry.getKey();
                            Gson gson = C2348609Ie.LIZ;
                            linkedHashMap.put(key, C786410Ut5.J3(C2348609Ie.LIZLLL((Map) entry.getValue())));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else if (value instanceof List) {
                        try {
                            String key2 = entry.getKey();
                            Gson gson2 = C2348609Ie.LIZ;
                            linkedHashMap.put(key2, C2348609Ie.LIZJ((List) entry.getValue()).toString());
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        }
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostLogDepend = c1874950ytJ.LJ) != null) {
            iHostLogDepend.onEventV3Map(this.IBridgeSdkContext, eventName, linkedHashMap, zBooleanValue);
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1503570pEJ.class, containerID), "");
    }
}
