package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209611Bdv {
    public static final List<String> LIZ = Collections.singletonList("EventPriorityLoader");

    public static void LIZ(C2209901BeO c2209901BeO, C2209571Bdr c2209571Bdr, C2209621Bdw c2209621Bdw, JSONArray jSONArray) {
        JSONArray jSONArrayOptJSONArray;
        Object objOpt;
        JSONArray jSONArrayOptJSONArray2;
        HashMap map = new HashMap();
        c2209621Bdw.LJFF = new HashMap();
        if (jSONArray != null && jSONArray.length() > 0) {
            c2209621Bdw.LJI = jSONArray;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        C2209631Bdx c2209631Bdx = new C2209631Bdx();
                        int iOptInt = jSONObjectOptJSONObject.optInt("priority");
                        c2209631Bdx.LIZ = iOptInt;
                        if (iOptInt > c2209621Bdw.LIZJ) {
                            c2209621Bdw.LIZJ = iOptInt;
                        }
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("interval_multiple");
                        c2209631Bdx.LIZJ = iOptInt2;
                        if (iOptInt2 <= 0) {
                            c2209631Bdx.LIZJ = 1;
                        }
                        long j = ((long) (c2209621Bdw.LIZIZ * c2209631Bdx.LIZJ)) * 1000;
                        c2209631Bdx.LIZLLL = j;
                        c2209631Bdx.LJIIJ = new C2209641Bdy(c2209901BeO, c2209571Bdr, j);
                        c2209631Bdx.LJI = jSONObjectOptJSONObject.optString("report_host");
                        c2209631Bdx.LJII = jSONObjectOptJSONObject.optString("report_path");
                        JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("events");
                        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                                String strOptString = jSONArrayOptJSONArray3.optString(i2);
                                if (!TextUtils.isEmpty(strOptString)) {
                                    ((HashMap) c2209621Bdw.LJFF).put(strOptString, Integer.valueOf(c2209631Bdx.LIZ));
                                }
                            }
                        }
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("param_keys");
                        if (jSONObjectOptJSONObject2 != null) {
                            c2209631Bdx.LJ = new HashMap();
                            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!TextUtils.isEmpty(next) && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(next)) != null && jSONArrayOptJSONArray2.length() > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                                        JSONArray jSONArrayOptJSONArray4 = jSONArrayOptJSONArray2.optJSONArray(i3);
                                        if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
                                            HashSet hashSet = new HashSet();
                                            for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                                                String strOptString2 = jSONArrayOptJSONArray4.optString(i4);
                                                if (!TextUtils.isEmpty(strOptString2)) {
                                                    hashSet.add(strOptString2);
                                                }
                                            }
                                            arrayList.add(hashSet);
                                        }
                                    }
                                    ((HashMap) c2209631Bdx.LJ).put(next, arrayList);
                                }
                            }
                        }
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("param_key_values");
                        if (jSONObjectOptJSONObject3 != null) {
                            c2209631Bdx.LJFF = new HashMap();
                            Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                if (!TextUtils.isEmpty(next2) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray(next2)) != null && jSONArrayOptJSONArray.length() > 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i5);
                                        if (jSONObjectOptJSONObject4 != null) {
                                            HashMap map2 = new HashMap();
                                            Iterator<String> itKeys3 = jSONObjectOptJSONObject4.keys();
                                            while (itKeys3.hasNext()) {
                                                String next3 = itKeys3.next();
                                                if (!TextUtils.isEmpty(next3) && (objOpt = jSONObjectOptJSONObject4.opt(next3)) != null) {
                                                    map2.put(next3, objOpt);
                                                }
                                            }
                                            arrayList2.add(map2);
                                        }
                                    }
                                    ((HashMap) c2209631Bdx.LJFF).put(next2, arrayList2);
                                }
                            }
                        }
                        map.put(Integer.valueOf(c2209631Bdx.LIZ), c2209631Bdx);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c2209901BeO.LJJZZI.LJIIZILJ(LIZ, "parsePriorityMapFromJsonArray failed", th, new Object[0]);
                    return;
                }
            }
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                ((C2209631Bdx) it2.next()).LIZIZ = c2209621Bdw.LIZJ;
            }
            c2209621Bdw.LIZIZ(map);
        }
    }
}
