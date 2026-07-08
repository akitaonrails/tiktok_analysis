package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.017z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2837017z {
    public final Keva LIZ;
    public final String LIZIZ;

    public final List<Map<String, Long>> LIZ() {
        String string = this.LIZ.getString(this.LIZIZ, null);
        if (string == null || string.length() == 0) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (jSONObject.isNull(next)) {
                        linkedHashMap.put(next, null);
                    } else {
                        linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
                    }
                }
                arrayList.add(linkedHashMap);
            }
            return arrayList;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public C2837017z() {
        C2837017z c2837017z = C1484940okG.LIZ;
        this.LIZ = Keva.getRepo("AbnormalColdBootChecker");
        this.LIZIZ = "boot_history_core_stages";
    }

    public final void LIZIZ(Map<String, Long> map) {
        ArrayList<Map> arrayList = new ArrayList(LIZ());
        ListProtector.add(arrayList, 0, map);
        while (arrayList.size() > 5) {
            ListProtector.remove(arrayList, arrayList.size() - 1);
        }
        JSONArray jSONArray = new JSONArray();
        for (Map map2 : arrayList) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                Long l = (Long) entry.getValue();
                if (l == null) {
                    try {
                        jSONObject.put(str, JSONObject.NULL);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    jSONObject.put(str, l.longValue());
                }
            }
            jSONArray.put(jSONObject);
        }
        this.LIZ.storeString(this.LIZIZ, jSONArray.toString());
    }
}
