package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19378910rj {
    public static final HashMap<String, HashMap<String, Integer>> LIZ = new HashMap<>();
    public static final HashMap<String, HashMap<String, List<InterfaceC19379010rk>>> LIZIZ = new HashMap<>();

    public static int LIZ(String str, String str2) {
        Integer num;
        HashMap<String, Integer> map = LIZ.get(str);
        if (map != null && (num = map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    public static void LIZJ(String str, String str2) {
        HashMap<String, Integer> map = LIZ.get(str);
        if (map != null) {
            map.remove(str2);
        }
    }

    public static void LIZIZ(String str, String str2, InterfaceC19379010rk interfaceC19379010rk) {
        HashMap<String, HashMap<String, List<InterfaceC19379010rk>>> map = LIZIZ;
        HashMap<String, List<InterfaceC19379010rk>> map2 = map.get(str);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(str, map2);
        }
        HashMap<String, List<InterfaceC19379010rk>> map3 = map2;
        List<InterfaceC19379010rk> arrayList = map3.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map3.put(str2, arrayList);
        }
        arrayList.add(interfaceC19379010rk);
    }

    public static void LJ(String str, String str2, InterfaceC19379010rk interfaceC19379010rk) {
        List<InterfaceC19379010rk> list;
        HashMap<String, List<InterfaceC19379010rk>> map = LIZIZ.get(str);
        if (map != null && (list = map.get(str2)) != null) {
            list.remove(interfaceC19379010rk);
        }
    }

    public static void LIZLLL(int i, String str, Integer num, String str2) {
        List<InterfaceC19379010rk> list;
        HashMap<String, HashMap<String, Integer>> map = LIZ;
        HashMap<String, Integer> map2 = map.get(str);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(str, map2);
        }
        map2.put(str2, Integer.valueOf(i));
        HashMap<String, List<InterfaceC19379010rk>> map3 = LIZIZ.get(str);
        if (map3 != null && (list = map3.get(str2)) != null) {
            Iterator<InterfaceC19379010rk> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF(i, str2, num, str);
            }
        }
    }
}
