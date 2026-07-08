package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pns.engine.RuleEngineService;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WRI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WRI extends C0WRL {
    public static final C0WRI LIZIZ = new C0WRI();

    @Override // X.C0WRP
    public final String name() {
        return "report";
    }

    @Override // X.C0WRL
    public final boolean LIZIZ(C0WRN c0wrn) {
        Map<String, C0WR6> mapLJ;
        C0WRM c0wrm;
        PrivacyEvent privacyEvent = c0wrn.LJ;
        String str = (String) c0wrn.LIZ.LIZJ.get("merge_stash_key");
        int i = 0;
        if (str != null && !a0.LJJJIL(str)) {
            C0WR6 c0wr6Query = privacyEvent.query(str);
            if (c0wr6Query == null) {
                this.LIZ = "can not found merge_stash_key in event";
                return false;
            }
            C0WQE<String, Map<String, C0WR6>> c0wqe = C0WRK.LIZJ;
            if (c0wqe == null) {
                this.LIZ = "stash cache not init!";
                return false;
            }
            synchronized (c0wqe) {
                try {
                    Object objLIZ = c0wr6Query.LIZ();
                    if (objLIZ == null) {
                        LIZIZ.LIZ = "value of merge_stash_key is null!";
                        return false;
                    }
                    mapLJ = c0wqe.pop(objLIZ.toString());
                    if (mapLJ == null) {
                        LIZIZ.LIZ = "can not found in stashed cache";
                        return false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(C823240WRe.LIZ().commonFields);
        Object obj = c0wrn.LIZ.LIZJ.get("fields");
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                linkedHashSet.add(jSONArray.optString(i2));
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                linkedHashSet.add(ListProtector.get(list, i3));
            }
        }
        Object obj2 = c0wrn.LIZ.LIZJ.get("additional_report_fields");
        if (obj2 instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj2;
            int length2 = jSONArray2.length();
            for (int i4 = 0; i4 < length2; i4++) {
                linkedHashSet.add(jSONArray2.optString(i4));
            }
        } else if (obj2 instanceof List) {
            List list2 = (List) obj2;
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                linkedHashSet.add(ListProtector.get(list2, i5));
            }
        }
        Object obj3 = c0wrn.LIZ.LIZJ.get("force_stash_fields");
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (obj3 instanceof JSONArray) {
            JSONArray jSONArray3 = (JSONArray) obj3;
            int length3 = jSONArray3.length();
            while (i < length3) {
                linkedHashSet2.add(jSONArray3.optString(i));
                i++;
            }
        } else if (obj3 instanceof List) {
            List list3 = (List) obj3;
            int size3 = list3.size();
            while (i < size3) {
                linkedHashSet2.add(ListProtector.get(list3, i));
                i++;
            }
        }
        for (String str2 : linkedHashSet) {
            C0WQ7 c0wq7 = C0WQ7.LIZ;
            String strTriggerBiz = privacyEvent.triggerBiz();
            c0wq7.getClass();
            C0WQG c0wqgLIZ = C0WQ7.LIZ(strTriggerBiz, str2);
            if (c0wqgLIZ != null) {
                c0wrm = c0wqgLIZ.LIZ;
            } else {
                c0wrm = null;
            }
            if (c0wrm == C0WRM.Engine) {
                linkedHashMap.put(str2, new C0WQ8(c0wqgLIZ.LIZIZ, c0wrn.LIZ.LIZJ.get(str2)));
            } else if (!linkedHashSet2.contains(str2)) {
                C0WR6 c0wr6Query2 = privacyEvent.contextInfo().query(str2);
                if (c0wr6Query2 == null) {
                    C0WR6 c0wr6 = mapLJ.get(str2);
                    if (c0wr6 == null) {
                        c0wr6 = C0WQ8.LIZLLL;
                    }
                    linkedHashMap.put(str2, c0wr6);
                } else {
                    linkedHashMap.put(str2, new C0WQ8(c0wr6Query2.LIZ, c0wr6Query2.LIZ()));
                }
            } else {
                C0WR6 c0wr62 = mapLJ.get(str2);
                if (c0wr62 == null) {
                    c0wr62 = C0WQ8.LIZLLL;
                }
                linkedHashMap.put(str2, c0wr62);
            }
        }
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        linkedHashMap.put("graph_path", new C0WQ8(enumC823400WRu, c0wrn.LIZLLL));
        linkedHashMap.put("trigger_id", new C0WQ8(enumC823400WRu, privacyEvent.triggerId()));
        linkedHashMap.put("trigger_biz", new C0WQ8(enumC823400WRu, privacyEvent.triggerBiz()));
        linkedHashMap.put("report_sample", new C0WQ8(EnumC823400WRu.Double, Double.valueOf(c0wrn.LIZJ)));
        linkedHashMap.put("report_category", new C0WQ8(enumC823400WRu, c0wrn.LIZ.LIZJ.get("report_category")));
        linkedHashMap.put("strategy_id", new C0WQ8(enumC823400WRu, c0wrn.LIZIZ));
        linkedHashMap.put("strategy_version", new C0WQ8(enumC823400WRu, String.valueOf(String.valueOf(RuleEngineService.getStrategyVersion()))));
        linkedHashMap.put("const_pool_version", new C0WQ8(enumC823400WRu, String.valueOf(String.valueOf(RuleEngineService.getConstPoolVersion()))));
        C0WQ6.LIZIZ(linkedHashMap);
        return true;
    }
}
