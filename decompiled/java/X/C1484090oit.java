package X;

import Y.AObjectS73S0000000_23;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484090oit {
    public static final HashMap<String, List<String>> LIZ = C582130MsN.LIZ().getConfig().getCommonConfig().getSceneLoudnessConfig().sceneStrategyMap;
    public static final HashSet<InterfaceC1484110oiv<String>> LIZIZ = new HashSet<>();
    public static final C01GW<C1484090oit> LIZJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AObjectS73S0000000_23(11));

    public static int LIZ(String str, String str2) {
        HashMap<String, List<String>> map = LIZ;
        int iIntValue = 0;
        if (!map.containsKey(str2)) {
            return 0;
        }
        List<String> list = (List) C2097608Jq.LJFF(str2, map);
        HashMap map2 = new HashMap();
        HashSet<InterfaceC1484100oiu> hashSet = new HashSet();
        for (InterfaceC1484110oiv<String> interfaceC1484110oiv : LIZIZ) {
            if (interfaceC1484110oiv.LIZIZ(str).booleanValue()) {
                hashSet.add(interfaceC1484110oiv);
            }
        }
        for (InterfaceC1484100oiu interfaceC1484100oiu : hashSet) {
            interfaceC1484100oiu.getStrategyName();
            map2.put("CommerceVideo", interfaceC1484100oiu);
        }
        int iLIZ = 0;
        for (String str3 : list) {
            if (map2.containsKey(str3)) {
                iLIZ += ((InterfaceC1484110oiv) C2097608Jq.LJFF(str3, map2)).LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SceneLoudnessStrategyHandler::getLoudnessOffset: sceneTag=");
                sbLIZ.append(str2);
                sbLIZ.append(", strategyName=");
                sbLIZ.append(str3);
                sbLIZ.append(", offset=");
                sbLIZ.append(iLIZ);
                sbLIZ.append(", aid=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(str3);
                if (numLJIIJJI != null) {
                    iIntValue = numLJIIJJI.intValue();
                }
                return iLIZ + iIntValue;
            }
        }
        return iLIZ;
    }

    public static int LIZIZ(String str, Map map) {
        int iLIZ;
        int i = 0;
        if (map != null && !map.isEmpty()) {
            HashMap<String, List<String>> map2 = LIZ;
            if (!C13LP.LJJL(map2.keySet(), C13LP.LLIIJLIL(map.keySet(), C13LP.LLIIJI(map.values()))).isEmpty()) {
                if (map.containsKey("ads") && map2.containsKey("ads")) {
                    return LIZ(str, "ads");
                }
                if (map.containsKey("gec") && map2.containsKey(C2097608Jq.LJFF("gec", map))) {
                    return LIZ(str, "gec_feed_video");
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    HashMap<String, List<String>> map3 = LIZ;
                    if (map3.containsKey(str3)) {
                        iLIZ = LIZ(str, str3);
                    } else if (map3.containsKey(str2)) {
                        iLIZ = LIZ(str, str2);
                    }
                    i += iLIZ;
                }
            }
        }
        return i;
    }
}
