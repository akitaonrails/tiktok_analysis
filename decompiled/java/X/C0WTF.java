package X;

import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0WTF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTF extends C0WTD {
    @Override // X.C0WTD, X.InterfaceC1059260dfg
    public final void LIZ(InterfaceC1541990qEH interfaceC1541990qEH, List<String> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeGlobalProps, size:");
        sbLIZ.append(Integer.valueOf(((ArrayList) list).size()));
        sbLIZ.append(", data:");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        super.LIZ(interfaceC1541990qEH, list);
    }

    @Override // X.C0WTD, X.InterfaceC1059260dfg
    public final void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, Map<String, Object> map) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setGlobalProps, size:");
        Integer numValueOf2 = null;
        if (map != null) {
            numValueOf = Integer.valueOf(map.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", data:");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        List<String> list = MinisConfigSettings.LIZ().supportedGlobalProps;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("globalPropsFilter, size:");
        if (list != null) {
            numValueOf2 = Integer.valueOf(list.size());
        }
        sbLIZ2.append(numValueOf2);
        sbLIZ2.append(", data:");
        sbLIZ2.append(list);
        C2188811AlT.LIZIZ(sbLIZ2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (list.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        super.LIZIZ(interfaceC1541990qEH, linkedHashMap);
    }

    @Override // X.C0WTD, X.InterfaceC1059260dfg
    public final void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH, Map<String, Object> map) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGlobalProps, size:");
        if (map != null) {
            numValueOf = Integer.valueOf(map.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", data:");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        super.LIZJ(interfaceC1541990qEH, map);
    }
}
