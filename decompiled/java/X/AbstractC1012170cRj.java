package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0cRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1012170cRj implements InterfaceC1000240c8U {
    public static List LIZIZ(List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{e3.d}, 0, 6));
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            int size = ((List) it3.next()).size();
            while (it3.hasNext()) {
                int size2 = ((List) it3.next()).size();
                if (size < size2) {
                    size = size2;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = size - 1; -1 < i; i--) {
                ArrayList<Pair> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (List list2 : arrayList2) {
                    arrayList3.add(new Pair(C13LP.LJJJLZIJ(i - 1, list2), C13LP.LJJJLZIJ(i, list2)));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Pair pair : arrayList3) {
                    String str2 = (String) pair.getFirst();
                    String str3 = (String) pair.getSecond();
                    if (str3 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        if (str2 == null) {
                            str = "root";
                        } else {
                            str = str2;
                        }
                        sbLIZ.append(str);
                        sbLIZ.append('.');
                        sbLIZ.append(str3);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (!linkedHashSet.contains(strLIZIZ)) {
                            linkedHashSet.add(strLIZIZ);
                            C1012260cRs c1012260cRs = new C1012260cRs(str3, (List) linkedHashMap.get(str3));
                            if (str2 != null) {
                                Object arrayList4 = linkedHashMap2.get(str2);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    linkedHashMap2.put(str2, arrayList4);
                                }
                                ((List) arrayList4).add(c1012260cRs);
                            }
                            if (i == 0) {
                                arrayList.add(c1012260cRs);
                            }
                        }
                    }
                }
                if (i == 0) {
                    break;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(linkedHashMap2);
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new NoSuchElementException();
    }

    public static List LIZLLL(JSONObject jSONObject) {
        JSONArray jSONArray;
        Object objOpt = jSONObject.opt("translation_fields");
        if (objOpt != null && (objOpt instanceof JSONArray) && (jSONArray = (JSONArray) objOpt) != null) {
            if (jSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object objOpt2 = jSONArray.opt(i);
                    if (!(objOpt2 instanceof String)) {
                        return null;
                    }
                    arrayList.add(objOpt2);
                }
                return Collections.unmodifiableList(arrayList);
            }
        }
        return null;
    }

    public static List LIZJ(List list, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1012260cRs c1012260cRs = (C1012260cRs) it2.next();
            Object objOpt = jSONObject.opt(c1012260cRs.LIZ());
            if (objOpt != null) {
                arrayList.addAll(LJ(null, c1012260cRs, objOpt));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List LJ(String str, C1012260cRs c1012260cRs, Object obj) {
        String strLIZIZ;
        List<C1012260cRs> list = c1012260cRs.LIZIZ;
        if (list == null) {
            Iterator<InterfaceC1012180cRk> it2 = C1012190cRl.LIZ.iterator();
            while (it2.hasNext()) {
                List<C1012220cRo> listLIZ = it2.next().LIZ(str, c1012260cRs, obj);
                if (listLIZ != null) {
                    return listLIZ;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unsupported element type ");
            sbLIZ.append(obj.getClass().getName());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (str == null) {
            strLIZIZ = c1012260cRs.LIZ;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('.');
            sbLIZ2.append(c1012260cRs.LIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!c1012260cRs.LIZIZ()) {
            if (obj instanceof JSONObject) {
                ArrayList arrayList = new ArrayList();
                for (C1012260cRs c1012260cRs2 : list) {
                    Object objOpt = ((JSONObject) obj).opt(c1012260cRs2.LIZ());
                    if (objOpt != null) {
                        arrayList.addAll(LJ(strLIZIZ, c1012260cRs2, objOpt));
                    }
                }
                return Collections.unmodifiableList(arrayList);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("child must be json object, path: ");
            sbLIZ3.append(strLIZIZ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        String strSubstring = strLIZIZ.substring(0, strLIZIZ.length() - 2);
        if (obj instanceof JSONArray) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object objOpt2 = jSONArray.opt(i);
                if (objOpt2 != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strSubstring);
                    sbLIZ4.append('[');
                    sbLIZ4.append(i);
                    sbLIZ4.append(']');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                    if (objOpt2 instanceof JSONObject) {
                        for (C1012260cRs c1012260cRs3 : list) {
                            Object objOpt3 = ((JSONObject) objOpt2).opt(c1012260cRs3.LIZ());
                            if (objOpt3 != null) {
                                arrayList2.addAll(LJ(strLIZIZ2, c1012260cRs3, objOpt3));
                            }
                        }
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("item must be a JsonObject, path: ");
                        sbLIZ5.append(strLIZIZ2);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
            }
            return Collections.unmodifiableList(arrayList2);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("child must be json array when field name ends with '[]', path: ");
        sbLIZ6.append(strSubstring);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ6));
    }
}
