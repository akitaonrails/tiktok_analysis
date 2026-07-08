package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1471750oOz {
    public static final EnumC1471750oOz INS;
    public static final /* synthetic */ EnumC1471750oOz[] LLILLL;
    public final Map<C1474420oTI, LinkedList<C1471760oP0>> LL = new HashMap();
    public int LLILLJJLI = 100;

    static {
        EnumC1471750oOz enumC1471750oOz = new EnumC1471750oOz();
        INS = enumC1471750oOz;
        LLILLL = new EnumC1471750oOz[]{enumC1471750oOz};
    }

    public static EnumC1471750oOz[] values() {
        return (EnumC1471750oOz[]) LLILLL.clone();
    }

    public static EnumC1471750oOz valueOf(String str) {
        return (EnumC1471750oOz) C08FF.LIZ(EnumC1471750oOz.class, str);
    }

    public JSONObject getTracesJson(C1474420oTI c1474420oTI) {
        Pair pair;
        JSONObject jSONObject = new JSONObject();
        if (c1474420oTI != null) {
            if (c1474420oTI.LIZLLL != null) {
                pair = new Pair("video_model", c1474420oTI.LIZ);
            } else if (!TextUtils.isEmpty(null)) {
                pair = new Pair("local_url", null);
            } else if (!TextUtils.isEmpty(c1474420oTI.LJ)) {
                pair = new Pair("video_url", c1474420oTI.LJ);
            } else {
                pair = new Pair("vid", c1474420oTI.LIZ);
            }
        } else {
            pair = null;
        }
        if (pair != null) {
            try {
                jSONObject.put((String) pair.first, pair.second);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        List<C1471760oP0> listRemoveTraceList = removeTraceList(c1474420oTI);
        if (listRemoveTraceList == null || listRemoveTraceList.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (C1471760oP0 c1471760oP0 : listRemoveTraceList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("pathId", c1471760oP0.LIZ);
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, c1471760oP0.LIZIZ);
                jSONObject2.put("timestamp", c1471760oP0.LIZJ);
                jSONObject2.put("level", c1471760oP0.LIZLLL);
                jSONObject2.put("errCode", 0);
                Map<String, String> map = c1471760oP0.LJ;
                if (map != null) {
                    HashMap map2 = (HashMap) map;
                    if (!map2.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (Map.Entry entry : map2.entrySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put((String) entry.getKey(), entry.getValue());
                            jSONArray2.put(jSONObject3);
                        }
                        jSONObject2.put("data", jSONArray2);
                    }
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("traces", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return jSONObject;
        }
    }

    public List<C1471760oP0> removeTraceList(C1474420oTI c1474420oTI) {
        List<C1471760oP0> list = (List) ((HashMap) this.LL).remove(c1474420oTI);
        if (list != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeTraceList title:");
            c1474420oTI.getClass();
            sbLIZ.append((String) null);
            sbLIZ.append(" map.size:");
            sbLIZ.append(((HashMap) this.LL).size());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return list;
    }

    public void setMaxTraceCount(int i) {
        this.LLILLJJLI = i;
    }

    public void addTrace(C1474420oTI c1474420oTI, C1471760oP0 c1471760oP0) {
        if (c1474420oTI != null && c1471760oP0 != null) {
            LinkedList linkedList = (LinkedList) ((HashMap) this.LL).get(c1474420oTI);
            if (linkedList == null) {
                LinkedList linkedList2 = new LinkedList();
                ((HashMap) this.LL).put(c1474420oTI, linkedList2);
                linkedList2.add(c1471760oP0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addTrace title:");
                sbLIZ.append((String) null);
                sbLIZ.append(" trace:");
                sbLIZ.append(c1471760oP0.LIZIZ);
                sbLIZ.append(" map.size:");
                sbLIZ.append(((HashMap) this.LL).size());
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            if (this.LLILLJJLI < linkedList.size()) {
                linkedList.removeFirst();
                linkedList.add(c1471760oP0);
            } else {
                linkedList.add(c1471760oP0);
            }
        }
    }
}
