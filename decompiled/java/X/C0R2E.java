package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol.ITakoNimbleAbility;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.InspireAdviceMoreData;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.SearchLoadMoreDataStruct;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R2E, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R2E implements C14NJ {
    @Override // X.C14NJ
    public final String getName() {
        return "takoExperienceCardShow";
    }

    public static String LIZIZ(Object obj) {
        Map map;
        List list;
        Object objLJJJLL;
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Object obj2 = map.get("sub_video_id_list");
        if (!(obj2 instanceof List) || (list = (List) obj2) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return objLJJJLL.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static Map LJFF(Object obj) {
        Map map;
        Object arrayList;
        List list;
        if ((obj instanceof Map) && (map = (Map) obj) != null) {
            Object obj2 = map.get("sub_video_id_list");
            if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(String.valueOf(it2.next()));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("text", map.get("text")), new Pair("key_moment", C20252814Mk.LIZJ(map.get("key_moment"))), new Pair("popularity", C20252814Mk.LIZJ(map.get("popularity"))), new Pair("cid", C20252814Mk.LIZJ(map.get("cid"))), new Pair("source_type", C20252814Mk.LIZJ(map.get("source_type"))), new Pair("user_name", map.get("user_name")), new Pair("sub_video_id_list", arrayList));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    public static Map LIZLLL(C14NX c14nx, boolean z) {
        List list;
        List list2;
        List list3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objLJIIZILJ = c14nx.LJIIZILJ("{data.page_detail.inspire_advice_page.items}");
        if ((objLJIIZILJ instanceof List) && (list = (List) objLJIIZILJ) != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("{data.page_detail.inspire_advice_page.items[");
                        sbLIZ.append(i);
                        sbLIZ.append("].all_reviews[0].user_content_list}");
                        Object objLJJ = c14nx.LJJ(C2188811AlT.LIZIZ(sbLIZ), C2097908Jt.LIZJ(new Pair("i", Integer.valueOf(i))));
                        if ((objLJJ instanceof List) && (list3 = (List) objLJJ) != null) {
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                Object objLJJ2 = c14nx.LJJ("{item.sub_video_list[0].aweme_id}", C2097908Jt.LIZJ(new Pair("item", it3.next())));
                                if ((objLJJ2 instanceof String) && objLJJ2 != null) {
                                    linkedHashSet.add(objLJJ2);
                                }
                            }
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("{data.page_detail.inspire_advice_page.items[");
                    sbLIZ2.append(i);
                    sbLIZ2.append("].video_list}");
                    Object objLJJ3 = c14nx.LJJ(C2188811AlT.LIZIZ(sbLIZ2), C2097908Jt.LIZJ(new Pair("i", Integer.valueOf(i))));
                    if ((objLJJ3 instanceof List) && (list2 = (List) objLJJ3) != null) {
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            Object objLJJ4 = c14nx.LJJ("{item.aweme_id}", C2097908Jt.LIZJ(new Pair("item", it4.next())));
                            if ((objLJJ4 instanceof String) && objLJJ4 != null) {
                                linkedHashSet.add(objLJJ4);
                            }
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        linkedHashMap.put(Integer.valueOf(i), C13LP.LLIIII(linkedHashSet));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map] */
    @Override // X.C14NJ
    public final void LIZ(Map<String, ? extends Object> map, C14NX c14nx, Map<String, ? extends Object> map2, C14NF c14nf) {
        Object objLJ;
        Map mapLJ;
        int i;
        ?? LJ;
        List list;
        Message messageYy1;
        Map<String, Object> map3;
        Message messageYy12;
        Map<String, Object> map4;
        List list2;
        String str;
        ITakoNimbleAbility iTakoNimbleAbility;
        TakoNimbleVM takoNimbleVMFq0;
        List list3;
        Message messageYy13;
        Map<String, Object> map5;
        Message messageYy14;
        Map<String, Object> map6;
        List list4;
        Object obj;
        String str2 = null;
        if (map != null && (obj = map.get("tag")) != null) {
            objLJ = c14nx.LJ(obj);
        } else {
            objLJ = null;
        }
        if (!(objLJ instanceof String)) {
            objLJ = null;
        }
        if (C07CS.LIZ()) {
            if (Intrinsics.LJFF(objLJ, "food")) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C14NH c14nh = C14NH.LIZ;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("data", map2));
                c14nh.getClass();
                Object objLJIILIIL = C14NH.LJIILIIL("{data.page_detail.inspire_advice_page.items}", mapLIZJ);
                if ((objLJIILIIL instanceof List) && (list3 = (List) objLJIILIIL) != null) {
                    int i2 = 0;
                    for (Object obj2 : list3) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C14NH c14nh2 = C14NH.LIZ;
                            Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("item", obj2));
                            c14nh2.getClass();
                            Object objLJIILIIL2 = C14NH.LJIILIIL("{item.video_list}", mapLIZJ2);
                            if ((objLJIILIIL2 instanceof List) && (list4 = (List) objLJIILIIL2) != null && !list4.isEmpty()) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : list4) {
                                    C14NH c14nh3 = C14NH.LIZ;
                                    Map mapLIZJ3 = C2097908Jt.LIZJ(new Pair("item", obj3));
                                    c14nh3.getClass();
                                    Object objLJIILIIL3 = C14NH.LJIILIIL("{item.aweme_id}", mapLIZJ3);
                                    if ((objLJIILIIL3 instanceof String) && objLJIILIIL3 != null) {
                                        arrayList.add(objLJIILIIL3);
                                    }
                                }
                                linkedHashMap.put(Integer.valueOf(i2), arrayList);
                                linkedHashSet.addAll(arrayList);
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, null);
                    if (takoCardAbility != null && (messageYy14 = takoCardAbility.Yy1()) != null && (map6 = messageYy14.LJIILIIL) != null) {
                        map6.put("video_id_map", linkedHashMap);
                    }
                    TakoCardAbility takoCardAbility2 = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, null);
                    if (takoCardAbility2 != null && (messageYy13 = takoCardAbility2.Yy1()) != null && (map5 = messageYy13.LJIILIIL) != null) {
                        map5.put("video_id_list", C13LP.LLIIII(linkedHashSet));
                    }
                    LJ = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        LJ.put(entry.getKey(), C13LP.LL((Iterable) entry.getValue(), 3));
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
            } else if (Intrinsics.LJFF(objLJ, "product")) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LJ = new LinkedHashMap();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                C14NH c14nh4 = C14NH.LIZ;
                Map mapLIZJ4 = C2097908Jt.LIZJ(new Pair("data", map2));
                c14nh4.getClass();
                Object objLJIILIIL4 = C14NH.LJIILIIL("{data.page_detail.inspire_advice_page.items}", mapLIZJ4);
                if ((objLJIILIIL4 instanceof List) && (list = (List) objLJIILIIL4) != null) {
                    int i4 = 0;
                    for (Object obj4 : list) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            C14NH c14nh5 = C14NH.LIZ;
                            Map mapLIZJ5 = C2097908Jt.LIZJ(new Pair("item", obj4));
                            c14nh5.getClass();
                            Object objLJIILIIL5 = C14NH.LJIILIIL("{item.all_reviews[0].user_content_list}", mapLIZJ5);
                            if ((objLJIILIIL5 instanceof List) && (list2 = (List) objLJIILIIL5) != null && !list2.isEmpty()) {
                                Object objLJIILIIL6 = C14NH.LJIILIIL("{item.all_reviews[0].unique_id}", C2097908Jt.LIZJ(new Pair("item", obj4)));
                                if ((objLJIILIIL6 instanceof String) && (str = (String) objLJIILIIL6) != null && str.length() != 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        Map mapLJFF = LJFF(it2.next());
                                        arrayList2.add(mapLJFF);
                                        String strLIZIZ = LIZIZ(mapLJFF);
                                        if (strLIZIZ != null && strLIZIZ.length() != 0) {
                                            arrayList3.add(strLIZIZ);
                                            linkedHashSet2.add(strLIZIZ);
                                        }
                                    }
                                    linkedHashMap2.put(str, GsonProtectorUtils.toJson(C597040NbK.LIZ(), arrayList2));
                                    LJ.put(Integer.valueOf(i4), C13LP.LL(arrayList3, 2));
                                }
                            }
                            LIZJ(linkedHashMap2, this, linkedHashSet2, obj4, "pros");
                            LIZJ(linkedHashMap2, this, linkedHashSet2, obj4, "cons");
                            i4 = i5;
                            str2 = null;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    TakoCardAbility takoCardAbility3 = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, str2);
                    if (takoCardAbility3 != null && (messageYy12 = takoCardAbility3.Yy1()) != null && (map4 = messageYy12.LJIILIIL) != null) {
                        map4.put("user_content_list", linkedHashMap2);
                    }
                    TakoCardAbility takoCardAbility4 = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, null);
                    if (takoCardAbility4 != null && (messageYy1 = takoCardAbility4.Yy1()) != null && (map3 = messageYy1.LJIILIIL) != null) {
                        map3.put("video_id_list", C13LP.LLIIII(linkedHashSet2));
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            C259800zU c259800zU = new C259800zU();
            ?? arrayList4 = new ArrayList();
            Iterator it3 = LJ.entrySet().iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI((Iterable) ((Map.Entry) it3.next()).getValue(), arrayList4);
            }
            c259800zU.element = arrayList4;
            if (!arrayList4.isEmpty() && (iTakoNimbleAbility = (ITakoNimbleAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITakoNimbleAbility.class, null)) != null && (takoNimbleVMFq0 = iTakoNimbleAbility.fq0()) != null) {
                C329020Cv6 c329020Cv6 = new C329020Cv6("", C2097608Jq.LJIIIIZZ(new Pair("count", String.valueOf(Math.min(20, ((List) c259800zU.element).size()))), new Pair("video_ids", C688770Qzz.LIZIZ((List) c259800zU.element)), new Pair(Scene.SCENE_SERVICE, "21")));
                TakoNimbleVM.vQ2(takoNimbleVMFq0, c329020Cv6, EnumC328990Cv3.REFRESH, 0, new C0R2H(c14nx, new ArrayList(), takoNimbleVMFq0, c329020Cv6, this, LJ));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(objLJ, "food")) {
            mapLJ = LIZLLL(c14nx, false);
        } else if (Intrinsics.LJFF(objLJ, "product")) {
            mapLJ = LIZLLL(c14nx, true);
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = mapLJ.entrySet().iterator();
        while (it4.hasNext()) {
            C19719612Di.LJJI((Iterable) ((Map.Entry) it4.next()).getValue(), arrayList5);
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 50) {
                int size = 50 / mapLJ.size();
                arrayList5 = new ArrayList();
                for (Map.Entry entry2 : mapLJ.entrySet()) {
                    List list5 = (List) entry2.getValue();
                    if (size >= 2) {
                        i = size;
                    } else {
                        i = 2;
                    }
                    C19719612Di.LJJI(list5.subList(0, Math.min(i, ((List) entry2.getValue()).size())), arrayList5);
                }
            }
            INimbleContainerAbility iNimbleContainerAbility = (INimbleContainerAbility) C1558520qew.LIZ(c14nx.LIZIZ(), INimbleContainerAbility.class, null);
            if (iNimbleContainerAbility != null) {
                iNimbleContainerAbility.Sg1(arrayList5, new AwS376S0200000_10(c14nx, (C14NX) mapLJ, (Map<Integer, ? extends List<String>>) 81));
            }
        }
    }

    public static final void LIZJ(Map<String, String> map, C0R2E c0r2e, LinkedHashSet<String> linkedHashSet, Object obj, String str) {
        List list;
        String str2;
        ArrayList arrayList;
        List list2;
        C14NH c14nh = C14NH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{item.");
        sbLIZ.append(str);
        sbLIZ.append('}');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("item", obj));
        c14nh.getClass();
        Object objLJIILIIL = C14NH.LJIILIIL(strLIZIZ, mapLIZJ);
        if ((objLJIILIIL instanceof List) && (list = (List) objLJIILIIL) != null && !list.isEmpty()) {
            for (Object obj2 : list) {
                C14NH c14nh2 = C14NH.LIZ;
                Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("item", obj2));
                c14nh2.getClass();
                Object objLJIILIIL2 = C14NH.LJIILIIL("{item.unique_id}", mapLIZJ2);
                if ((objLJIILIIL2 instanceof String) && (str2 = (String) objLJIILIIL2) != null && str2.length() != 0) {
                    Object objLJIILIIL3 = C14NH.LJIILIIL("{item.user_content_list}", C2097908Jt.LIZJ(new Pair("item", obj2)));
                    if ((objLJIILIIL3 instanceof List) && (list2 = (List) objLJIILIIL3) != null) {
                        arrayList = new ArrayList();
                        for (Object obj3 : list2) {
                            c0r2e.getClass();
                            arrayList.add(LJFF(obj3));
                        }
                    } else {
                        arrayList = null;
                    }
                    map.put(str2, GsonProtectorUtils.toJson(C597040NbK.LIZ(), arrayList));
                    c0r2e.getClass();
                    String strLIZIZ2 = LIZIZ(arrayList);
                    if (strLIZIZ2 != null && strLIZIZ2.length() != 0) {
                        linkedHashSet.add(strLIZIZ2);
                    }
                }
            }
        }
    }

    public static final void LJ(C14NX c14nx, List<List<Map<String, Object>>> list, TakoNimbleVM takoNimbleVM, C329020Cv6 c329020Cv6, C0R2E c0r2e, Map<Integer, ? extends List<String>> map, LoadMoreResponse loadMoreResponse) {
        Map<String, Object> map2;
        InspireAdviceMoreData inspireAdviceMoreData;
        List<Aweme> list2;
        Object obj;
        Message messageYy1;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, null);
        if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null) {
            map2 = messageYy1.LJIILIIL;
        } else {
            map2 = null;
        }
        SearchLoadMoreDataStruct searchLoadMoreDataStruct = loadMoreResponse.data;
        int iIntValue = 0;
        if (searchLoadMoreDataStruct != null && (inspireAdviceMoreData = searchLoadMoreDataStruct.inspireAdviceMoreData) != null && (list2 = inspireAdviceMoreData.videoList) != null) {
            for (Aweme aweme : list2) {
                for (Map.Entry<Integer, ? extends List<String>> entry : map.entrySet()) {
                    if (entry.getValue().contains(aweme.getAid())) {
                        List<Map> list3 = (List) C13LP.LJJJLZIJ(entry.getKey().intValue(), list);
                        if (list3 != null && !list3.isEmpty()) {
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                for (Map map3 : list3) {
                                    if (map3 != null) {
                                        obj = map3.get(FollowStatusChangeMethod.PARAM_UID);
                                    } else {
                                        obj = null;
                                    }
                                    if (Intrinsics.LJFF(obj, aweme.getAid())) {
                                        break;
                                    }
                                }
                            }
                            list3.add(C688770Qzz.LIZ(aweme));
                            ListProtector.set(list, entry.getKey().intValue(), list3);
                        } else {
                            List listLJIILJJIL = C1697810uHb.LJIILJJIL(C688770Qzz.LIZ(aweme));
                            while (list.size() <= entry.getKey().intValue()) {
                                list.add(null);
                            }
                            ListProtector.set(list, entry.getKey().intValue(), listLJIILJJIL);
                        }
                    }
                }
            }
        }
        if ((!list.isEmpty()) && list != null) {
            if (map2 != null) {
                map2.put("aweme_map", list);
            }
            INimbleContainerAbility iNimbleContainerAbility = (INimbleContainerAbility) C1558520qew.LIZ(c14nx.LIZIZ(), INimbleContainerAbility.class, null);
            if (iNimbleContainerAbility != null) {
                iNimbleContainerAbility.jE1(null);
            }
        }
        if (Intrinsics.LJFF(loadMoreResponse.hasMore, Boolean.TRUE)) {
            EnumC328990Cv3 enumC328990Cv3 = EnumC328990Cv3.LOAD_MORE;
            Integer num = loadMoreResponse.offset;
            if (num != null) {
                c0r2e.getClass();
                iIntValue = num.intValue();
            }
            TakoNimbleVM.vQ2(takoNimbleVM, c329020Cv6, enumC328990Cv3, iIntValue, new C0R2G(c14nx, list, takoNimbleVM, c329020Cv6, c0r2e, map));
        }
    }
}
