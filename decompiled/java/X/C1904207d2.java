package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: X.07d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1904207d2 {
    public static final C1904207d2 LIZ = new C1904207d2();
    public static Map<String, C07ZM> LIZIZ;
    public static boolean LIZJ;

    public static void LJFF(Map map) {
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            entry.getKey();
            ArrayList arrayList = (ArrayList) LJ((C07ZM) entry.getValue(), "");
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
    }

    public static Map LJI(Map map) {
        C1904107d1 c1904107d1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            C1904107d1 c1904107d12 = new C1904107d1();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJ = a0.LJJLIIIJ((String) it2.next(), new char[]{'.'}, false, 0, 6);
                if (!listLJJLIIIJ.isEmpty()) {
                    int size = listLJJLIIIJ.size() - 1;
                    C1904107d1 c1904107d13 = c1904107d12;
                    for (int i = 0; i < size; i++) {
                        Object obj = ListProtector.get(listLJJLIIIJ, i);
                        if (Intrinsics.LJFF(obj, "<item>")) {
                            c1904107d1 = c1904107d13.LIZJ;
                            if (c1904107d1 == null) {
                                c1904107d1 = new C1904107d1();
                                c1904107d13.LIZJ = c1904107d1;
                            }
                        } else {
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1904107d13.LIZIZ;
                            Object c1904107d14 = linkedHashMap2.get(obj);
                            if (c1904107d14 == null) {
                                c1904107d14 = new C1904107d1();
                                linkedHashMap2.put(obj, c1904107d14);
                            }
                            c1904107d1 = (C1904107d1) c1904107d14;
                        }
                        c1904107d13 = c1904107d1;
                    }
                    Object objLJJLIIIJJI = C13LP.LJJLIIIJJI(listLJJLIIIJ);
                    if (Intrinsics.LJFF(objLJJLIIIJJI, "<item>")) {
                        C1904107d1 c1904107d15 = c1904107d13.LIZJ;
                        if (c1904107d15 == null) {
                            c1904107d15 = new C1904107d1();
                            c1904107d13.LIZJ = c1904107d15;
                        }
                        c1904107d15.LIZLLL = true;
                    } else {
                        c1904107d13.LIZ.add((String) objLJJLIIIJJI);
                    }
                }
            }
            linkedHashMap.put(key, c1904107d12.LIZ());
        }
        return linkedHashMap;
    }

    public static List LJ(C07ZM c07zm, String str) {
        String strLIZIZ;
        ArrayList arrayList = new ArrayList();
        for (String strLIZIZ2 : c07zm.LIZ) {
            if (str.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('.');
                sbLIZ.append(strLIZIZ2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            arrayList.add(strLIZIZ2);
        }
        for (Map.Entry<String, C07ZM> entry : c07zm.LIZIZ.entrySet()) {
            String key = entry.getKey();
            C07ZM value = entry.getValue();
            if (str.length() != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('.');
                sbLIZ2.append(key);
                key = C2188811AlT.LIZIZ(sbLIZ2);
            }
            arrayList.addAll(LJ(value, key));
        }
        C07ZM c07zm2 = c07zm.LIZJ;
        if (c07zm2 != null) {
            if (str.length() == 0) {
                strLIZIZ = "<item>";
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(".<item>");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            if (c07zm2.LIZLLL) {
                arrayList.add(strLIZIZ);
            } else {
                arrayList.addAll(LJ(c07zm2, strLIZIZ));
                return arrayList;
            }
        }
        return arrayList;
    }

    public final JSONObject LIZ(JSONObject jSONObject, C07ZM c07zm) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (!c07zm.LIZ.contains(next)) {
                if (c07zm.LIZIZ.containsKey(next)) {
                    C07ZM c07zm2 = c07zm.LIZIZ.get(next);
                    if (objOpt instanceof JSONObject) {
                        objOpt = LIZ((JSONObject) objOpt, c07zm2);
                    } else if (objOpt instanceof JSONArray) {
                        objOpt = LIZJ((JSONArray) objOpt, c07zm2);
                    } else if ((objOpt instanceof String) && ((!c07zm2.LIZ.isEmpty()) || (!c07zm2.LIZIZ.isEmpty()) || c07zm2.LIZJ != null)) {
                        objOpt = LIZLLL(c07zm2, (String) objOpt);
                    }
                    jSONObject2.put(next, objOpt);
                } else {
                    jSONObject2.put(next, objOpt);
                }
            }
        }
        return jSONObject2;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        C07ZM c07zm;
        if (!LIZJ) {
            new Pair(Boolean.TRUE, jSONObject);
            return;
        }
        Map<String, C07ZM> map = LIZIZ;
        if (map != null && (c07zm = (C07ZM) ((LinkedHashMap) map).get(str)) != null) {
            JSONObject jSONObjectLIZ = LIZ(jSONObject, c07zm);
            ArrayList arrayList = new ArrayList();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                arrayList.add(itKeys.next());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jSONObject.remove((String) it2.next());
            }
            Iterator<String> itKeys2 = jSONObjectLIZ.keys();
            while (itKeys2.hasNext()) {
                String next = itKeys2.next();
                jSONObject.put(next, jSONObjectLIZ.get(next));
            }
            new Pair(Boolean.TRUE, jSONObjectLIZ);
            return;
        }
        new Pair(Boolean.TRUE, jSONObject);
    }

    public final JSONArray LIZJ(JSONArray jSONArray, C07ZM c07zm) throws JSONException {
        C07ZM c07zm2 = c07zm.LIZJ;
        if (c07zm2 == null) {
            return jSONArray;
        }
        if (c07zm2.LIZLLL) {
            return new JSONArray();
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                objOpt = LIZ((JSONObject) objOpt, c07zm2);
            } else if (objOpt instanceof JSONArray) {
                objOpt = LIZJ((JSONArray) objOpt, c07zm2);
            } else if ((objOpt instanceof String) && ((!c07zm2.LIZ.isEmpty()) || (!c07zm2.LIZIZ.isEmpty()) || c07zm2.LIZJ != null)) {
                objOpt = LIZLLL(c07zm2, (String) objOpt);
            }
            jSONArray2.put(objOpt);
        }
        return jSONArray2;
    }

    public final Object LIZLLL(C07ZM c07zm, String str) {
        Object objLIZJ;
        try {
            Object objNextValue = new JSONTokener(str).nextValue();
            if (objNextValue instanceof JSONObject) {
                objLIZJ = LIZ((JSONObject) objNextValue, c07zm);
            } else if (objNextValue instanceof JSONArray) {
                objLIZJ = LIZJ((JSONArray) objNextValue, c07zm);
            } else {
                return str;
            }
            str = objLIZJ.toString();
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }
}
