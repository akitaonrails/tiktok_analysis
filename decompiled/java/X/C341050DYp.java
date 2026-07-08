package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ab.EcUserActMultiDataMaxLengthAB;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS55S1000000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.0DYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341050DYp {
    public static final C2232408os LIZ = C08YE.LIZ("UserActManagerNew");
    public static String LIZIZ = "";
    public static final Map<String, Map<String, EnumC313620CRc>> LIZJ;
    public static final Map<String, String> LIZLLL;
    public static final Map<String, Map<String, C313600CRa>> LJ;
    public static final Map<String, LinkedList<Map<String, Object>>> LJFF;

    static {
        EnumC313620CRc enumC313620CRc = EnumC313620CRc.OVERRIDE;
        EnumC313620CRc enumC313620CRc2 = EnumC313620CRc.ACCUMULATE;
        EnumC313620CRc enumC313620CRc3 = EnumC313620CRc.MERGE;
        LIZJ = C2097608Jq.LJIIJ(new Pair("goods_view_action", C2097608Jq.LJIIJ(new Pair("query", enumC313620CRc), new Pair("filter_data", enumC313620CRc), new Pair("sorter_data", enumC313620CRc), new Pair("timestamp", enumC313620CRc), new Pair("id_str", enumC313620CRc), new Pair("pid_str", enumC313620CRc), new Pair("type_i32", enumC313620CRc), new Pair("aid_str", enumC313620CRc), new Pair("favorite", enumC313620CRc), new Pair("enter_from_merge", enumC313620CRc), new Pair("stay_time", enumC313620CRc2), new Pair("clk_cnt", enumC313620CRc2), new Pair("cart", enumC313620CRc3), new Pair("buy", enumC313620CRc3), new Pair("shop_id", enumC313620CRc), new Pair("title", enumC313620CRc))), new Pair("live_view_action", C2097608Jq.LJIIJ(new Pair("product_id_list", enumC313620CRc), new Pair("room_id", enumC313620CRc), new Pair("author_id", enumC313620CRc), new Pair("timestamp", enumC313620CRc), new Pair("enter_from_merge", enumC313620CRc), new Pair("show_product_id", enumC313620CRc))), new Pair("video_view_action", C2097608Jq.LJIIJ(new Pair("video_id", enumC313620CRc), new Pair("has_good_anchor", enumC313620CRc), new Pair("author_id", enumC313620CRc), new Pair("product_id_list", enumC313620CRc), new Pair("like", enumC313620CRc), new Pair("fav", enumC313620CRc), new Pair("duration", enumC313620CRc2), new Pair("video_duration", enumC313620CRc), new Pair("timestamp", enumC313620CRc), new Pair("play_time", enumC313620CRc), new Pair("is_followed", enumC313620CRc), new Pair("comment_button_click", enumC313620CRc), new Pair("is_dislike", enumC313620CRc), new Pair("enter_from_merge", enumC313620CRc))), new Pair("search_action", C2097608Jq.LJIIJ(new Pair("query", enumC313620CRc), new Pair("channel", enumC313620CRc), new Pair("search_method", enumC313620CRc), new Pair("timestamp", enumC313620CRc), new Pair("has_effective_click", enumC313620CRc), new Pair("browse_depth", enumC313620CRc), new Pair("session_id", enumC313620CRc))));
        LIZLLL = C2097608Jq.LJIIJ(new Pair("goods_view_action", "pid_str"), new Pair("video_view_action", "video_id"), new Pair("live_view_action", "room_id"), new Pair("search_action", "timestamp"));
        LJ = new LinkedHashMap();
        LJFF = new LinkedHashMap();
    }

    public static String LIZ(Integer num) {
        String strLJIILL = null;
        try {
            Map<String, LinkedList<Map<String, Object>>> map = LJFF;
            if (map.isEmpty()) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (num != null) {
                    if (num.intValue() < ((LinkedList) entry.getValue()).size()) {
                        linkedHashMap.put(entry.getKey(), ((LinkedList) entry.getValue()).subList(0, num.intValue()));
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            strLJIILL = C08JS.LIZIZ().LJIILL(linkedHashMap);
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIILL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r6) {
        /*
            int r5 = X.C0C90.LIZ(r6)
            r4 = 0
            java.util.Map<java.lang.String, java.util.LinkedList<java.util.Map<java.lang.String, java.lang.Object>>> r3 = X.C341050DYp.LJFF     // Catch: java.lang.Exception -> L60
            r0 = r3
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Exception -> L60
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L64
            r0 = r3
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Exception -> L60
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L60
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Exception -> L60
            r2 = 0
            if (r0 == 0) goto L24
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L60
            r0 = 1
            if (r1 != r0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L64
            r0 = r3
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Exception -> L60
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L60
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L64
            int r0 = r0.size()     // Catch: java.lang.Exception -> L60
            if (r5 >= r0) goto L51
            com.google.gson.Gson r1 = X.C08JS.LIZIZ()     // Catch: java.lang.Exception -> L60
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Exception -> L60
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Exception -> L60
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L4f
            java.util.List r0 = r0.subList(r2, r5)     // Catch: java.lang.Exception -> L60
        L4a:
            java.lang.String r4 = r1.LJIILL(r0)     // Catch: java.lang.Exception -> L60
            return r4
        L4f:
            r0 = r4
            goto L4a
        L51:
            com.google.gson.Gson r1 = X.C08JS.LIZIZ()     // Catch: java.lang.Exception -> L60
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Exception -> L60
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = r1.LJIILL(r0)     // Catch: java.lang.Exception -> L60
            return r4
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341050DYp.LIZLLL(java.lang.String):java.lang.String");
    }

    public static String LIZIZ(Integer num, Map map) {
        String strLJIILL = null;
        try {
            Map<String, LinkedList<Map<String, Object>>> map2 = LJFF;
            if (map2.isEmpty()) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                if (num != null) {
                    if (num.intValue() < ((LinkedList) entry.getValue()).size()) {
                        linkedHashMap.put(entry.getKey(), ((LinkedList) entry.getValue()).subList(0, num.intValue()));
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (map != null) {
                if (!(!map.isEmpty())) {
                    map = null;
                }
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
            }
            strLJIILL = C08JS.LIZIZ().LJIILL(linkedHashMap);
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIILL;
        }
    }

    public static String LIZJ(Integer num, Map map) {
        boolean z;
        LinkedHashMap linkedHashMap;
        String strLJIILL = null;
        try {
            Map<String, LinkedList<Map<String, Object>>> map2 = LJFF;
            if (map2.isEmpty()) {
                return null;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                if (num != null) {
                    if (num.intValue() < ((LinkedList) entry.getValue()).size()) {
                        linkedHashMap2.put(entry.getKey(), ((LinkedList) entry.getValue()).subList(0, num.intValue()));
                    } else {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            if (!(!map.isEmpty())) {
                map = null;
            }
            if (map != null) {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (linkedHashMap2.containsKey(entry2.getKey())) {
                        Object key = entry2.getKey();
                        ArrayList arrayList = new ArrayList();
                        Collection collection = (List) linkedHashMap2.get(entry2.getKey());
                        if (collection == null) {
                            collection = C13BV.INSTANCE;
                        }
                        arrayList.addAll(collection);
                        for (Map map3 : (List) entry2.getValue()) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (-1 < size) {
                                    Map map4 = (Map) arrayList.get(size);
                                    String str = (String) ((LinkedHashMap) LIZLLL).get(entry2.getKey());
                                    if (map4.get(str) != null && Intrinsics.LJFF(map4.get(str), map3.get(str))) {
                                        linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.putAll(map4);
                                        linkedHashMap.putAll(map3);
                                        z = true;
                                        break;
                                    }
                                    size--;
                                } else {
                                    z = false;
                                    size = -1;
                                    linkedHashMap = null;
                                    break;
                                }
                            }
                            if (z && linkedHashMap != null) {
                                arrayList.set(size, linkedHashMap);
                            } else {
                                arrayList.add(map3);
                            }
                        }
                        linkedHashMap2.put(key, arrayList);
                    } else {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            strLJIILL = C08JS.LIZIZ().LJIILL(linkedHashMap2);
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIILL;
        }
    }

    public static String LJ(int i, int i2) {
        boolean z;
        LinkedList linkedList;
        Sequence c1939607ik;
        Object objLJJII;
        Object objLJJII2;
        List listSubList;
        try {
            Map<String, LinkedList<Map<String, Object>>> map = LJFF;
            Collection collection = (Collection) ((LinkedHashMap) map).get("goods_view_action");
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z || (linkedList = (LinkedList) ((LinkedHashMap) map).get("goods_view_action")) == null) {
                return "";
            }
            int size = linkedList.size();
            if (i >= size) {
                i = size;
            }
            LinkedList linkedList2 = (LinkedList) ((LinkedHashMap) map).get("goods_view_action");
            C08QU c08quLJIIIZ = null;
            if (linkedList2 != null && (listSubList = linkedList2.subList(0, i)) != null) {
                c1939607ik = new C1939607ik(listSubList);
            } else {
                c1939607ik = null;
            }
            if (C08A4.LIZ(Integer.valueOf(i2))) {
                if (c1939607ik != null) {
                    c08quLJIIIZ = C09RB.LJIIIZ(c1939607ik, new C020M(i2, 2));
                }
                c1939607ik = c08quLJIIIZ;
            }
            if (C123100dR.LIZ("pid_str")) {
                Gson gsonLIZIZ = C08JS.LIZIZ();
                if (c1939607ik == null || (objLJJII2 = C09RB.LJJII(new C08LY(c1939607ik, new AwS55S1000000_4(6)))) == null) {
                    objLJJII2 = "";
                }
                return gsonLIZIZ.LJIILL(objLJJII2);
            }
            Gson gsonLIZIZ2 = C08JS.LIZIZ();
            if (c1939607ik == null || (objLJJII = C09RB.LJJII(c1939607ik)) == null) {
                objLJJII = "";
            }
            return gsonLIZIZ2.LJIILL(objLJJII);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static Map LJFF(Map map, EcUserActMultiDataMaxLengthAB.Config config) {
        if (config == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((Iterable) entry.getValue()).iterator();
            while (it2.hasNext()) {
                Map mapLIZ = C1765430w2f.LIZ((Map) it2.next());
                if (mapLIZ != null) {
                    arrayList.add(mapLIZ);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (Intrinsics.LJFF(entry2.getKey(), "search_action")) {
                for (Map map2 : (Iterable) entry2.getValue()) {
                    Object obj = map2.get("query");
                    if (obj != null && (obj instanceof String)) {
                        int length = ((String) obj).length();
                        int i = config.searchActionQuery;
                        if (i >= 0 && i < length) {
                            map2.put("query", ((String) obj).substring(0, config.searchActionQuery));
                        }
                    }
                }
            } else if (Intrinsics.LJFF(entry2.getKey(), "live_view_action")) {
                for (Map map3 : (Iterable) entry2.getValue()) {
                    Object obj2 = map3.get("product_id_list");
                    if (obj2 != null && (obj2 instanceof List)) {
                        int size = ((List) obj2).size();
                        int i2 = config.liveProductList;
                        if (i2 >= 0 && i2 < size) {
                            map3.put("product_id_list", ((List) obj2).subList(0, config.liveProductList));
                        }
                    }
                }
            } else if (Intrinsics.LJFF(entry2.getKey(), "video_view_action")) {
                for (Map map4 : (Iterable) entry2.getValue()) {
                    Object obj3 = map4.get("product_id_list");
                    if (obj3 != null && (obj3 instanceof List)) {
                        int size2 = ((List) obj3).size();
                        int i3 = config.videoProductList;
                        if (i3 >= 0 && i3 < size2) {
                            map4.put("product_id_list", ((List) obj3).subList(0, config.videoProductList));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static void LJI(String str, String str2, Map map) {
        C290280BZi.LIZ.getClass();
        if (((Boolean) C290280BZi.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, LIZ, null, new C315200CXe(str, str2, map, null), 2);
    }

    public static void LJII(String str, String str2, Map map) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (Intrinsics.LJFF(str, "live_view_action")) {
            LIZIZ = str2;
        }
        C23250099c.LIZLLL(C817503Hh.LL, LIZ, null, new C0CRZ(str, str2, map, null), 2);
    }
}
