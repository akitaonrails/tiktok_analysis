package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0V0W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0W {
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0mAB] */
    public static C1385690mAB LIZ(Map map) throws C0V0S, C0V0T, C0V0V {
        String str;
        final String str2;
        final String str3;
        final Map mapLJ;
        Object obj = map.get("type");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            if (Intrinsics.LJFF(str, "psp")) {
                Object obj2 = map.get("scene_key");
                if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
                    Object obj3 = map.get("strategy_key");
                    if ((obj3 instanceof String) && (str3 = (String) obj3) != null) {
                        Object obj4 = map.get("extra_params");
                        if (!(obj4 instanceof Map) || (mapLJ = (Map) obj4) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        return new InterfaceC499001wy(str2, str3, mapLJ) { // from class: X.0mAB
                            public final String LIZ;
                            public final String LIZIZ;
                            public final Map<String, Object> LIZJ;

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.InterfaceC499001wy
                            public final List<InterfaceC1381610m3b> LIZ(List<? extends InterfaceC1381610m3b> list) {
                                List list2;
                                int i = 2;
                                Pair[] pairArr = new Pair[2];
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                Iterator it2 = list.iterator();
                                int i2 = 0;
                                while (true) {
                                    Object objLIZJ = null;
                                    if (it2.hasNext()) {
                                        Object next = it2.next();
                                        int i3 = i2 + 1;
                                        if (i2 >= 0) {
                                            InterfaceC1381610m3b interfaceC1381610m3b = (InterfaceC1381610m3b) next;
                                            C23094093c.LIZ.getClass();
                                            Pair[] pairArr2 = new Pair[i];
                                            String itemId = interfaceC1381610m3b.getItemId();
                                            if (itemId == null) {
                                                itemId = "";
                                            }
                                            pairArr2[0] = new Pair("unique_id", itemId);
                                            pairArr2[1] = new Pair("relationship", Integer.valueOf(interfaceC1381610m3b.getRelationship().getValue()));
                                            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr2);
                                            C1368220li0 primaryMatchMeta = interfaceC1381610m3b.getPrimaryMatchMeta();
                                            if (primaryMatchMeta != null) {
                                                Pair[] pairArr3 = new Pair[4];
                                                pairArr3[0] = new Pair("matcher", primaryMatchMeta.LIZ.LIZIZ());
                                                pairArr3[1] = new Pair("dimension", Integer.valueOf(primaryMatchMeta.LIZIZ));
                                                pairArr3[i] = new Pair("original_source_text", primaryMatchMeta.LIZJ);
                                                pairArr3[3] = new Pair("score", Double.valueOf(primaryMatchMeta.LIZLLL.LIZ));
                                                Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr3);
                                                List<IntRange> list3 = primaryMatchMeta.LIZLLL.LIZIZ;
                                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                                for (IntRange intRange : list3) {
                                                    Integer[] numArr = new Integer[i];
                                                    numArr[0] = Integer.valueOf(intRange.LL);
                                                    numArr[1] = Integer.valueOf(intRange.LLILLJJLI);
                                                    arrayList2.add(C1697810uHb.LJIIJJI(numArr));
                                                    i = 2;
                                                }
                                                mapLJIIJ2.put("matched_ranges", arrayList2);
                                                mapLJIIJ.put("primary_match_meta", mapLJIIJ2);
                                            }
                                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJIIJ);
                                            linkedHashMap.put("ranking_after_matching", Integer.valueOf(i2));
                                            arrayList.add(linkedHashMap);
                                            i2 = i3;
                                            i = 2;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    } else {
                                        pairArr[0] = new Pair("searchables", arrayList);
                                        pairArr[1] = new Pair("extra_params", this.LIZJ);
                                        Map mapLJIIJ3 = C2097608Jq.LJIIJ(pairArr);
                                        C23094093c.LIZ.getClass();
                                        mapLJIIJ3.putAll(C23094093c.LIZIZ);
                                        InterfaceC830890Wid interfaceC830890WidLIZ = C1386050mAl.LIZJ.LIZ().LIZ(this.LIZ);
                                        if (interfaceC830890WidLIZ == null) {
                                            return list;
                                        }
                                        InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890WidLIZ, this.LIZIZ, new TTMParamData((Map<String, Object>) mapLJIIJ3));
                                        if (interfaceC805220ViKRunScene != null) {
                                            objLIZJ = interfaceC805220ViKRunScene.LIZJ();
                                        }
                                        if (!(objLIZJ instanceof List) || (list2 = (List) objLIZJ) == null) {
                                            return list;
                                        }
                                        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                                        if (iLIZIZ < 16) {
                                            iLIZIZ = 16;
                                        }
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
                                        for (Object obj5 : list) {
                                            linkedHashMap2.put(((InterfaceC1381610m3b) obj5).getItemId(), obj5);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            Object obj6 = linkedHashMap2.get(it3.next());
                                            if (obj6 != null) {
                                                arrayList3.add(obj6);
                                            }
                                        }
                                        return arrayList3;
                                    }
                                }
                            }

                            {
                                this.LIZ = str2;
                                this.LIZIZ = str3;
                                this.LIZJ = mapLJ;
                            }
                        };
                    }
                    throw new C0V0T("strategy_key");
                }
                throw new C0V0T("scene_key");
            }
            throw new C0V0S(str);
        }
        throw C0V0V.INSTANCE;
    }
}
