package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0j6S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1268060j6S {
    public String adaptiveStrategyName;
    public String direction;
    public HashMap<String, Object> resultToParams;
    public String ruleName;
    public String scene;
    public int success = -1;
    public String adaptiveStrategyStatus = "default";
    public Map<String, Object> adaptiveResultMap = new HashMap();
    public Map<String, Object> adaptiveStrategyLevelMap = new HashMap();
    public String resolutionStrategyExtraStatus = "default";
    public String adaptiveStrategyStatusListItem = "";

    public abstract EnumC1268100j6W getCommandType();

    public void parseReportMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        Object obj;
        try {
            this.adaptiveResultMap = map2;
            if (map2.containsKey("rule_name")) {
                this.ruleName = map2.get("rule_name").toString();
            }
            if (map2.containsKey("direction")) {
                this.direction = map2.get("direction").toString();
            }
            Object obj2 = map2.get("to_params");
            if (obj2 != null && (obj2 instanceof HashMap)) {
                this.resultToParams = (HashMap) obj2;
            }
            if (map != null && (obj = map.get("report")) != null && (obj instanceof HashMap)) {
                HashMap map3 = (HashMap) obj;
                this.adaptiveStrategyName = map3.get("adaptive_strategy_name").toString();
                this.adaptiveStrategyStatus = map3.get("adaptive_strategy_status").toString();
                Object obj3 = map3.get("adaptive_strategy_level_list");
                if (obj3 != null && (obj3 instanceof HashMap)) {
                    this.adaptiveStrategyLevelMap = (HashMap) obj3;
                }
                if (map3.containsKey("resolution_strategy_extra_status")) {
                    this.resolutionStrategyExtraStatus = map3.get("resolution_strategy_extra_status").toString();
                }
                if (map3.containsKey("adaptive_strategy_status_list")) {
                    this.adaptiveStrategyStatusListItem = map3.get("adaptive_strategy_status_list").toString();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
