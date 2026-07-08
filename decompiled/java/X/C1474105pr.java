package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.05pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1474105pr extends AbstractC1474305pt {
    public static Map LIZJ(Object obj) {
        Map map;
        if (!(obj instanceof Map)) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((key instanceof String) && (value instanceof Map) && (map = (Map) value) != null) {
                for (Map.Entry entry2 : map.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if ((key2 instanceof String) && value2 != null) {
                        linkedHashMap.put(key2, value2);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1474205ps interfaceC1474205ps = (InterfaceC1474205ps) xBaseParamModel;
        Map mapLIZJ = LIZJ(interfaceC1474205ps.getFirstMap());
        Map mapLIZJ2 = LIZJ(interfaceC1474205ps.getEndMap());
        Map<String, Object> midMap = interfaceC1474205ps.getMidMap();
        if (midMap == null) {
            midMap = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapLIZJ);
        linkedHashMap.putAll(midMap);
        linkedHashMap.putAll(mapLIZJ2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if (!(value instanceof String) || !a0.LJJJIL((CharSequence) value)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1474405pu.class, containerID);
        ((InterfaceC1474405pu) xBaseModelLIZJ).setResultMap(linkedHashMap2);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
