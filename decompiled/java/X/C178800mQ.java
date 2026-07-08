package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.00mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C178800mQ {
    public static final /* synthetic */ int LIZ = 0;

    public static LinkedHashMap LIZLLL(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                String string = key.toString();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put(string, value);
            }
        }
        return linkedHashMap;
    }

    public static void LIZ(String str, List list, Map map, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        int i = 0;
        for (Object obj : arrayList2) {
            int i2 = i + 1;
            if (i >= 0) {
                if (obj instanceof Number) {
                    if (Math.abs(((Number) obj).doubleValue()) > Double.MAX_VALUE) {
                        if (z) {
                            arrayList.add(obj);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("->&");
                        sbLIZ.append(i);
                        map.put(C2188811AlT.LIZIZ(sbLIZ), obj);
                    }
                } else if (obj instanceof Map) {
                    LIZIZ(str, LIZLLL((Map) obj), map, z);
                } else if (obj instanceof List) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        if (obj2 != null) {
                            arrayList3.add(obj2);
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append("->");
                    sbLIZ2.append(i);
                    sbLIZ2.append("&List");
                    LIZ(C2188811AlT.LIZIZ(sbLIZ2), arrayList3, map, z);
                    ListProtector.set(list, i, arrayList3);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.remove(it2.next());
        }
    }

    public static void LIZIZ(String str, Map map, Map map2, boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        for (String str2 : linkedHashMap.keySet()) {
            Object obj = linkedHashMap.get(str2);
            if (obj instanceof Number) {
                if (Math.abs(((Number) obj).doubleValue()) > Double.MAX_VALUE) {
                    if (z) {
                        arrayList.add(str2);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("->");
                    sbLIZ.append(str2);
                    map2.put(C2188811AlT.LIZIZ(sbLIZ), obj);
                }
            } else if (obj instanceof Map) {
                LinkedHashMap linkedHashMapLIZLLL = LIZLLL((Map) obj);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("->");
                sbLIZ2.append(str2);
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), linkedHashMapLIZLLL, map2, z);
                map.put(str2, linkedHashMapLIZLLL);
            } else if (obj instanceof List) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 != null) {
                        arrayList2.add(obj2);
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append("->");
                sbLIZ3.append(str2);
                sbLIZ3.append("&List");
                LIZ(C2188811AlT.LIZIZ(sbLIZ3), arrayList2, map2, z);
                map.put(str2, arrayList2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            map.remove(it2.next());
        }
    }

    public static LinkedHashMap LIZJ(Map map, Integer num, boolean z, String str) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj2 = null;
        if (map == null) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMapLIZLLL = LIZLLL(map);
            LIZIZ(str, linkedHashMapLIZLLL, linkedHashMap, z);
            if (!linkedHashMap.isEmpty()) {
                C1AF0.LIZJ("photo search root_enter_from_type: " + num + " \nerrorParams: " + linkedHashMap);
            }
            C189200o6.m2constructorimpl(linkedHashMapLIZLLL);
            obj = linkedHashMapLIZLLL;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (LinkedHashMap) obj2;
    }
}
