package X;

import com.bytedance.pns.engine.RuleEngineService;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tiktok.pns.ldp.api.ILDPService;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WRJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WRJ extends C0WRL {
    public static final C0WRJ LIZIZ = new C0WRJ();

    @Override // X.C0WRP
    public final String name() {
        return "ldp_report";
    }

    public static String LIZJ(Object obj) {
        if (obj instanceof C0WR6) {
            return LIZJ(((C0WR6) obj).LIZ());
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
            return obj.toString();
        }
        return "pns-null";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0WRR] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.0WRQ] */
    @Override // X.C0WRL
    public final boolean LIZIZ(C0WRN c0wrn) {
        C0WRM c0wrm;
        PrivacyEvent privacyEvent = c0wrn.LJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(C823240WRe.LIZ().commonFields);
        Object obj = c0wrn.LIZ.LIZJ.get("fields");
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                linkedHashSet.add(jSONArray.optString(i));
            }
        }
        for (String str : linkedHashSet) {
            C0WQ7 c0wq7 = C0WQ7.LIZ;
            String strTriggerBiz = privacyEvent.triggerBiz();
            c0wq7.getClass();
            C0WQG c0wqgLIZ = C0WQ7.LIZ(strTriggerBiz, str);
            if (c0wqgLIZ != null) {
                c0wrm = c0wqgLIZ.LIZ;
            } else {
                c0wrm = null;
            }
            if (c0wrm == C0WRM.Engine) {
                C0WRJ c0wrj = LIZIZ;
                C0WQ8 c0wq8 = new C0WQ8(c0wqgLIZ.LIZIZ, c0wrn.LIZ.LIZJ.get(str));
                c0wrj.getClass();
                linkedHashMap.put(str, LIZJ(c0wq8));
            } else {
                C0WR6 c0wr6Query = privacyEvent.contextInfo().query(str);
                if (c0wr6Query == null) {
                    C0WRJ c0wrj2 = LIZIZ;
                    C0WQ8 c0wq82 = C0WQ8.LIZLLL;
                    c0wrj2.getClass();
                    linkedHashMap.put(str, LIZJ(c0wq82));
                } else {
                    C0WRJ c0wrj3 = LIZIZ;
                    C0WQ8 c0wq83 = new C0WQ8(c0wr6Query.LIZ, c0wr6Query.LIZ());
                    c0wrj3.getClass();
                    linkedHashMap.put(str, LIZJ(c0wq83));
                }
            }
        }
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        linkedHashMap.put("trigger_id", LIZJ(new C0WQ8(enumC823400WRu, privacyEvent.triggerId())));
        linkedHashMap.put("trigger_biz", LIZJ(new C0WQ8(enumC823400WRu, privacyEvent.triggerBiz())));
        linkedHashMap.put("report_sample", LIZJ(new C0WQ8(EnumC823400WRu.Double, Double.valueOf(c0wrn.LIZJ))));
        linkedHashMap.put("strategy_id", LIZJ(new C0WQ8(enumC823400WRu, c0wrn.LIZIZ)));
        linkedHashMap.put("strategy_version", LIZJ(new C0WQ8(enumC823400WRu, String.valueOf(RuleEngineService.getStrategyVersion()))));
        Object obj2 = c0wrn.LIZ.LIZJ.get("sensitive");
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet();
        if (obj2 instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj2;
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                linkedHashSet2.add(jSONArray2.optString(i2));
            }
        }
        for (String str2 : linkedHashSet2) {
            C0WR6 c0wr6Query2 = privacyEvent.contextInfo().query(str2);
            if (c0wr6Query2 == null) {
                C0WRJ c0wrj4 = LIZIZ;
                C0WQ8 c0wq84 = C0WQ8.LIZLLL;
                c0wrj4.getClass();
                linkedHashMap2.put(str2, LIZJ(c0wq84));
            } else {
                C0WRJ c0wrj5 = LIZIZ;
                C0WQ8 c0wq85 = new C0WQ8(c0wr6Query2.LIZ, c0wr6Query2.LIZ());
                c0wrj5.getClass();
                linkedHashMap2.put(str2, LIZJ(c0wq85));
            }
        }
        ILDPService iLDPService = (ILDPService) ServiceManager.get().getService(ILDPService.class);
        if (iLDPService != 0) {
            iLDPService.LIZJ(linkedHashMap2, new C0W6I("odr_event", linkedHashMap), new Object() { // from class: X.0WRQ
            }, new Object() { // from class: X.0WRR
            });
            return true;
        }
        return true;
    }
}
