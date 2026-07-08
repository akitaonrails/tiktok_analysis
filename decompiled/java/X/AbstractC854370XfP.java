package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0XfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC854370XfP implements InterfaceC1237490iJ9 {
    public static final int $stable = 0;

    @Override // X.InterfaceC1237490iJ9
    public abstract /* synthetic */ String getFirstStepId();

    @Override // X.InterfaceC1237490iJ9
    public abstract /* synthetic */ HashMap<String, HashMap<String, String>> getFlowGraph();

    @Override // X.InterfaceC1237490iJ9
    public String getNextStepId(String str, String str2) {
        HashMap<String, String> map = getFlowGraph().get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // X.InterfaceC1237490iJ9
    public void addEdge(String str, String str2, String str3) {
        HashMap<String, String> map = getFlowGraph().get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey(str2)) {
            map.put(str2, str3);
        }
        getFlowGraph().put(str, map);
    }

    @Override // X.InterfaceC1237490iJ9
    public void addFlow(String str, String str2, InterfaceC1237490iJ9 interfaceC1237490iJ9) {
        addEdge(str, str2, interfaceC1237490iJ9.getFirstStepId());
        for (Map.Entry<String, HashMap<String, String>> entry : interfaceC1237490iJ9.getFlowGraph().entrySet()) {
            Iterator<Map.Entry<String, String>> it2 = entry.getValue().entrySet().iterator();
            while (it2.hasNext()) {
                addEdge(entry.getKey(), str2, it2.next().getValue());
            }
        }
    }
}
