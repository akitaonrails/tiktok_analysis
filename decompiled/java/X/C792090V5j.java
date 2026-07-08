package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792090V5j implements InterfaceC792210V5v {
    public volatile C205100qf LIZ;

    public C792090V5j() {
        C0V70.LIZ().LIZIZ();
        C0V70.LIZ().LIZJ(new C0V73() { // from class: X.0V5i
            @Override // X.C0V73
            public final void LIZ(JSONObject jSONObject) {
                C792090V5j c792090V5j = this.LIZ;
                c792090V5j.getClass();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("custom_event_settings");
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("service_high_priority_list");
                    if (jSONArrayOptJSONArray != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i, null);
                            if (!TextUtils.isEmpty(strOptString)) {
                                if (C792190V5t.LIZ()) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("markHighPriority=");
                                    sbLIZ.append(strOptString);
                                    C792910V8n.LIZ("APM-Config", C2188811AlT.LIZIZ(sbLIZ));
                                }
                                ((HashSet) C0V1T.LIZ.LIZ).add(C0V1S.LIZJ("service_monitor", strOptString));
                            }
                        }
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("allow_service_name");
                    HashSet hashSet = new HashSet();
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                        while (itKeys.hasNext()) {
                            hashSet.add(itKeys.next());
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("allow_log_type");
                    if (jSONObjectOptJSONObject3 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                        while (itKeys2.hasNext()) {
                            String next = itKeys2.next();
                            if (jSONObjectOptJSONObject3.optInt(next) == 1) {
                                hashSet2.add(next);
                            }
                        }
                    }
                    HashMap map = new HashMap();
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("custom_allow_log_type");
                    if (jSONObjectOptJSONObject4 != null) {
                        Iterator<String> itKeys3 = jSONObjectOptJSONObject4.keys();
                        while (itKeys3.hasNext()) {
                            String next2 = itKeys3.next();
                            map.put(next2, jSONObjectOptJSONObject4.optString(next2));
                        }
                    }
                    c792090V5j.LIZ = new C205100qf(map, hashSet, hashSet2);
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("received customEventSettings=");
                        sbLIZ2.append(jSONObjectOptJSONObject);
                        C792910V8n.LIZ("APM-Config", C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("parsed CommonEventConfig=");
                        sbLIZ3.append(c792090V5j.LIZ);
                        C792910V8n.LIZ("APM-Config", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    C0V6Y.LJII(c792090V5j.LIZ);
                }
            }
        });
    }

    @Override // X.InterfaceC792210V5v
    public final C205100qf getConfig() {
        return this.LIZ;
    }
}
