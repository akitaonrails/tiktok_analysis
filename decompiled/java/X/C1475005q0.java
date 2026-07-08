package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.05q0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1475005q0 extends AbstractC1475105q1 {
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.util.HashMap, java.util.LinkedHashMap] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1475205q2 interfaceC1475205q2 = (InterfaceC1475205q2) xBaseParamModel;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC1475205q2.getMap();
        if (interfaceC1475205q2.getExcludedList() != null) {
            Map map = (Map) c259800zU.element;
            ?? linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!r6.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            c259800zU.element = linkedHashMap;
        }
        List<String> includedList = interfaceC1475205q2.getIncludedList();
        if (includedList != null) {
            Map map2 = (Map) c259800zU.element;
            ?? linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (includedList.contains(entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            c259800zU.element = linkedHashMap2;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1475305q3.class, containerID);
        InterfaceC1475305q3 interfaceC1475305q3 = (InterfaceC1475305q3) xBaseModelLIZJ;
        Map map3 = (Map) c259800zU.element;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : map3.entrySet()) {
            Object value = entry3.getValue();
            if (!(value instanceof String) || !a0.LJJJIL((CharSequence) value)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        interfaceC1475305q3.setResultMap(linkedHashMap3);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
