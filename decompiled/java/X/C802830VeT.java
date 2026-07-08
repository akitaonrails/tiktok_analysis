package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802830VeT {
    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        JSONArray jSONArray;
        C803140Vey c803140Vey;
        String strSubstring;
        String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "process_group.txt"));
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!TextUtils.isEmpty(strLJFF)) {
            jSONArray = new JSONArray(strLJFF);
        } else {
            jSONArray = null;
        }
        int iOptInt = jSONObject.optInt("pid");
        int size = 0;
        if (jSONArray != null && jSONArray.length() != 0 && iOptInt != 0) {
            HashMap map = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("name");
                int iOptInt2 = jSONObjectOptJSONObject.optInt("pid");
                map.put(Integer.valueOf(iOptInt2), new C803140Vey(iOptInt2, jSONObjectOptJSONObject.optLong("rss"), jSONObjectOptJSONObject.optLong("swap"), jSONObjectOptJSONObject.optInt("ppid"), strOptString));
            }
            if (!map.isEmpty() && (c803140Vey = (C803140Vey) map.get(Integer.valueOf(iOptInt))) != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    C803140Vey c803140Vey2 = (C803140Vey) ((Map.Entry) it2.next()).getValue();
                    C803140Vey c803140Vey3 = c803140Vey2;
                    int i2 = 0;
                    while (true) {
                        if (c803140Vey3 != null) {
                            if (c803140Vey3.LJFF == c803140Vey.LJFF) {
                                if (c803140Vey3.LJ == iOptInt) {
                                    if (i2 != 0) {
                                        ((ArrayList) c803140Vey.LIZ).add(c803140Vey2);
                                    }
                                } else if (i2 != 0) {
                                    ((ArrayList) c803140Vey3.LIZ).add(c803140Vey2);
                                } else {
                                    ((ArrayList) c803140Vey.LIZIZ).add(c803140Vey2);
                                }
                            } else {
                                i2++;
                                c803140Vey3 = (C803140Vey) map.get(Integer.valueOf(c803140Vey2.LJFF));
                            }
                        } else if (c803140Vey2 != null) {
                            ((ArrayList) c803140Vey.LIZJ).add(c803140Vey2);
                        }
                    }
                }
                int size2 = ((ArrayList) c803140Vey.LIZIZ).size();
                C0VJO.LJIIIIZZ(jSONObject2, "npth_pgrp_sibling_count", Integer.valueOf(size2));
                C0VJO.LJIIIIZZ(jSONObject2, "npth_pgrp_child_count", Integer.valueOf(((ArrayList) c803140Vey.LIZ).size()));
                if (size2 > 0) {
                    C802910Veb c802910Veb = new C802910Veb("MB");
                    long j = 0;
                    c802910Veb.LIZJ(new Long[]{0L, 16L, 32L, 64L, 128L, 256L, 512L, 768L, 1024L, 2048L, 4096L, 8192L});
                    for (C803140Vey c803140Vey4 : (ArrayList) c803140Vey.LIZIZ) {
                        size += ((ArrayList) c803140Vey4.LIZ).size();
                        j += c803140Vey4.LJI + c803140Vey4.LJII;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("npth_pgrp_sibling_");
                        int iLastIndexOf = c803140Vey4.LIZLLL.lastIndexOf(58);
                        if (iLastIndexOf >= 0 && iLastIndexOf != c803140Vey4.LIZLLL.length() - 1) {
                            strSubstring = c803140Vey4.LIZLLL.substring(iLastIndexOf + 1);
                        } else {
                            strSubstring = c803140Vey4.LIZLLL;
                        }
                        sbLIZ.append(strSubstring);
                        sbLIZ.append("_memory_size");
                        C0VJO.LJIIIIZZ(jSONObject2, C2188811AlT.LIZIZ(sbLIZ), c802910Veb.LIZ((c803140Vey4.LJI + c803140Vey4.LJII) / 1024));
                    }
                    C0VJO.LJIIIIZZ(jSONObject2, "npth_pgrp_sibling_child_count", Integer.valueOf(size));
                    C0VJO.LJIIIIZZ(jSONObject2, "npth_pgrp_sibling_memory_size", c802910Veb.LIZ(j / 1024));
                }
                C0VJO.LJIIIIZZ(jSONObject2, "npth_pgrp_unrelated_count", Integer.valueOf(((ArrayList) c803140Vey.LIZJ).size()));
            }
        }
    }
}
