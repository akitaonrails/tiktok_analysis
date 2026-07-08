package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VUE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUE {
    public static final C0VUE LIZ = new C0VUE();

    public static void LIZIZ(int i) throws JSONException {
        C0VUJ c0vujLIZ;
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it2 = C0VUD.LIZ.values().iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C0VUG) it2.next()).LIZ().LIZ;
        }
        int iLIZ = C08M9.LIZ(j, true);
        jSONObject.put("index", i);
        jSONObject.put("total", iLIZ);
        for (C0VUC c0vuc : C0VUC.getEntries()) {
            Map<C0VUC, C0VUG> map = C0VUD.LIZ;
            C0VUG c0vug = map.get(c0vuc);
            if (c0vug != null) {
                c0vujLIZ = c0vug.LIZ();
            } else {
                c0vujLIZ = C0VUJ.LIZLLL;
            }
            String strName = c0vuc.name();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strName);
            sbLIZ.append("_available");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0VUG c0vug2 = map.get(c0vuc);
            boolean z = false;
            if (c0vug2 != null && c0vug2.LJ.getValue() != null) {
                z = true;
            }
            jSONObject.put(strLIZIZ, z);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strName);
            sbLIZ2.append("_used");
            jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), C08M9.LIZ(c0vujLIZ.LIZ, true));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strName);
            sbLIZ3.append("_overflow");
            jSONObject.put(C2188811AlT.LIZIZ(sbLIZ3), c0vujLIZ.LIZIZ);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strName);
            sbLIZ4.append("_largest");
            jSONObject.put(C2188811AlT.LIZIZ(sbLIZ4), c0vujLIZ.LIZJ);
        }
        C0S4Q.LIZJ(jSONObject);
        C20684815ws.LJIJ("memory_dumpsys_db", jSONObject);
    }

    public static void LIZ(int i, long j, double d, List list) throws JSONException {
        C0VUA c0vuaLIZIZ;
        String string;
        double d2;
        Set<Map.Entry<C0VUC, C0VUG>> setEntrySet = C0VUD.LIZ.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((C0VUG) ((Map.Entry) obj).getValue()).LJ.getValue() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<C0VUC> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Map.Entry) it2.next()).getKey());
        }
        for (C0VUC c0vuc : arrayList2) {
            C0VUG c0vug = C0VUD.LIZ.get(c0vuc);
            if (c0vug == null || (c0vuaLIZIZ = c0vug.LIZIZ()) == null) {
                c0vuaLIZIZ = C0VUA.LJFF;
            }
            for (C0VUH c0vuh : c0vuaLIZIZ.LIZLLL) {
                C0VUE c0vue = LIZ;
                String str = c0vuh.LIZ;
                c0vue.getClass();
                if (str != null && str.length() != 0) {
                    string = a0.LJLIIIL(a0.LJJLJ('/', str, str)).toString();
                } else {
                    string = "";
                }
                if (j <= 0 || c0vuh.LIZJ > j) {
                    int i2 = c0vuh.LJ;
                    long j2 = ((long) i2) + ((long) c0vuh.LJFF);
                    if (j2 <= 0) {
                        d2 = 0.0d;
                    } else {
                        d2 = ((double) i2) / j2;
                    }
                    if (!Intrinsics.LJFF(string, "(attached) temp")) {
                        if (list != null && !list.isEmpty()) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                if (a0.LJJIIZI(string, (String) it3.next(), false)) {
                                    break;
                                }
                            }
                        }
                        if (d <= 0.0d || d2 < d) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("index", i);
                            jSONObject.put("vendor", c0vuc.name());
                            jSONObject.put("dbName", string);
                            jSONObject.put("dbSize", c0vuh.LIZJ);
                            jSONObject.put("hitRate", C08M9.LIZIZ(d2, 2));
                            jSONObject.put("lookaside", c0vuh.LIZLLL);
                            C20684815ws.LJIJ("memory_dumpsys_db_detail", jSONObject);
                        }
                    }
                }
            }
        }
    }
}
