package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268070j6T extends AbstractC1268060j6S implements Serializable {
    public HashMap<String, Object> dataMap;
    public HashMap<String, C1268080j6U> strategyBeanHashMap;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHEffectStrategyCommand{strategyBeanHashMap=");
        sbLIZ.append(this.strategyBeanHashMap);
        sbLIZ.append(", dataMap=");
        sbLIZ.append(this.dataMap);
        sbLIZ.append(", ruleName=");
        sbLIZ.append(this.ruleName);
        sbLIZ.append(", direction=");
        sbLIZ.append(this.direction);
        sbLIZ.append(", resultParams=");
        sbLIZ.append(this.resultToParams);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.EFFECT_MODEL;
    }

    public static C1268070j6T fromHashMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        C1268070j6T c1268070j6T = new C1268070j6T();
        c1268070j6T.parseReportMap(map, map2);
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                jSONObject.optInt("level");
                jSONObject.optInt("force_downgrade_to_bottom");
                c1268070j6T.strategyBeanHashMap.put(key, (C1268080j6U) new Object() { // from class: X.0j6U
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c1268070j6T.dataMap = map;
        return c1268070j6T;
    }
}
