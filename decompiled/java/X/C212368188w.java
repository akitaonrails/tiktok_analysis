package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.188w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212368188w {
    public static C212369188x LIZ(String str) {
        boolean z;
        Iterator<String> itKeys;
        Iterator<String> itKeys2;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("page");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (jSONObjectOptJSONObject != null && (itKeys2 = jSONObjectOptJSONObject.keys()) != null) {
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    C212367188v c212367188v = BcmParams.Companion;
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    c212367188v.getClass();
                    linkedHashMap.put(next, C212367188v.LIZIZ(jSONObjectOptJSONObject2));
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("unit");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (jSONObjectOptJSONObject3 != null && (itKeys = jSONObjectOptJSONObject3.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next2 = itKeys.next();
                    C212367188v c212367188v2 = BcmParams.Companion;
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(next2);
                    c212367188v2.getClass();
                    linkedHashMap2.put(next2, C212367188v.LIZIZ(jSONObjectOptJSONObject4));
                }
            }
            return new C212369188x(linkedHashMap, linkedHashMap2, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
