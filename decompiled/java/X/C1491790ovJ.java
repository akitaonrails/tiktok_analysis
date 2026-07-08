package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ovJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491790ovJ {
    public static C1491800ovK LIZ(String str) throws JSONException {
        HashMap map = new HashMap();
        Map<String, Object> map2 = EnumC1521110pgb.cachedEntries.get(str);
        if (map2 != null) {
            EnumC1521110pgb[] enumC1521110pgbArrValues = EnumC1521110pgb.values();
            ArrayList<EnumC1521110pgb> arrayList = new ArrayList();
            for (EnumC1521110pgb enumC1521110pgb : enumC1521110pgbArrValues) {
                if (enumC1521110pgb.getType() == 1) {
                    arrayList.add(enumC1521110pgb);
                }
            }
            for (EnumC1521110pgb enumC1521110pgb2 : arrayList) {
                Object obj = map2.get(enumC1521110pgb2.getKey());
                if (obj != null) {
                    map.put(enumC1521110pgb2.getSlardarKey(), obj);
                }
            }
            JSONObject jSONObject = new JSONObject();
            EnumC1521110pgb[] enumC1521110pgbArrValues2 = EnumC1521110pgb.values();
            ArrayList<EnumC1521110pgb> arrayList2 = new ArrayList();
            for (EnumC1521110pgb enumC1521110pgb3 : enumC1521110pgbArrValues2) {
                if (enumC1521110pgb3.getType() == 3) {
                    arrayList2.add(enumC1521110pgb3);
                }
            }
            for (EnumC1521110pgb enumC1521110pgb4 : arrayList2) {
                Object obj2 = map2.get(enumC1521110pgb4.getKey());
                if (obj2 != null) {
                    jSONObject.putOpt(enumC1521110pgb4.getSlardarKey(), obj2);
                }
            }
            map.put("context", jSONObject);
        }
        return new C1491800ovK(map);
    }

    public static void LIZIZ(String str, Map map) {
        try {
            EnumC1521110pgb.Companion.getClass();
            Map<String, Map<String, Object>> map2 = EnumC1521110pgb.cachedEntries;
            Map<String, Object> concurrentHashMap = map2.get(str);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                map2.put(str, concurrentHashMap);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if ((value instanceof Number) || (value instanceof String) || (value instanceof Boolean)) {
                    EnumC1521110pgb.Companion.getClass();
                    if (EnumC1521110pgb.keys$delegate.getValue().contains(str2)) {
                        if (value instanceof String) {
                            concurrentHashMap.put(str2, ((String) value).substring(0, Math.min(SpeechEngineDefines.TTS_WORK_MODE_BOTH, ((String) value).length())));
                        } else {
                            concurrentHashMap.put(str2, value);
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
