package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773250wFH extends AbstractC1771860wD2 {
    public static final /* synthetic */ int LLILLL = 0;

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallInsertItem", new InterfaceC1775150wIL() { // from class: X.0wF8
            /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x021a  */
            @Override // X.InterfaceC1775150wIL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map r29, java.util.Map r30, X.C21175917tt r31) {
                /*
                    Method dump skipped, instruction units count: 779
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1773160wF8.LIZ(java.util.Map, java.util.Map, X.17tt):void");
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallRemoveItem", new InterfaceC1775150wIL() { // from class: X.0wFO
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                List list;
                Object obj = map.get("item_id_list");
                String str = null;
                if (obj instanceof List) {
                    list = (List) obj;
                } else {
                    list = null;
                }
                Object obj2 = map.get("tab_id");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
                if (list != null && !list.isEmpty()) {
                    this.LIZ.LIZIZ().LJIIIZ().Qb2(new C1773060wEy(C13LP.LLIIII(list), new C1771590wCb(str, 0, null, "fetch", "unknown", null, null, null, null, null, false, 65306)));
                    c21175917tt.LIZ(1, "success", null);
                } else {
                    c21175917tt.LIZ(0, "Invalid params: item_id_list", null);
                }
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallGetItemPosition", new InterfaceC1775150wIL() { // from class: X.0wFL
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                String str2;
                int iIntValue;
                Integer num;
                Object obj = map.get("tab_id");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = map.get("item_id");
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                } else {
                    str2 = null;
                }
                Object obj3 = map.get("get_item_data");
                if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (str2 != null && str2.length() != 0) {
                    C1773880wGI c1773880wGILIZ = C1773390wFV.LIZ(this.LIZ.LIZIZ(), str, str2);
                    if (c1773880wGILIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(" no item : ");
                        sbLIZ.append(str2);
                        c21175917tt.LIZ(0, C2188811AlT.LIZIZ(sbLIZ), null);
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("index_in_list", Integer.valueOf(c1773880wGILIZ.LIZIZ));
                    if (iIntValue == 1) {
                        List<AbstractC1773210wFD> list = c1773880wGILIZ.LIZ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<AbstractC1773210wFD> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().LJI);
                        }
                        linkedHashMap.put("item_data_list", arrayList);
                    }
                    c21175917tt.LIZ(1, "success", linkedHashMap);
                    return;
                }
                c21175917tt.LIZ(0, "Invalid params: item_id", null);
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallGetItemTraceParams", new InterfaceC1775150wIL() { // from class: X.0wIN
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                String str2;
                String str3;
                Object obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Object obj2 = map.get("tab_id");
                List list = null;
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                Object obj3 = map.get("item_id");
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                } else {
                    str2 = null;
                }
                Object obj4 = map.get("key_list");
                if (obj4 instanceof List) {
                    list = (List) obj4;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i = 0;
                if (str2 != null && str2.length() != 0 && 0 == 0) {
                    C1773880wGI c1773880wGILIZ = C1773390wFV.LIZ(this.LIZ.LIZIZ(), str, str2);
                    if (c1773880wGILIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("No item: ");
                        sbLIZ.append(str2);
                        c21175917tt.LIZ(0, C2188811AlT.LIZIZ(sbLIZ), null);
                        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
                        String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(linkedHashMap);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("No item: ");
                        sbLIZ2.append(str2);
                        C1771980wDE.LJI(strLJIIIIZZ, strLJIIIIZZ2, C2188811AlT.LIZIZ(sbLIZ2), 0, jCurrentTimeMillis, null);
                        return;
                    }
                    C1775180wIO c1775180wIO = c1773880wGILIZ.LIZJ.LJII.LIZIZ;
                    c1775180wIO.LJ();
                    Pair[] pairArr = new Pair[17];
                    pairArr[0] = new Pair("show_duration", Long.valueOf(c1775180wIO.LIZLLL));
                    pairArr[1] = new Pair("show_times", Integer.valueOf(c1775180wIO.LJ));
                    pairArr[2] = new Pair("ad_show_duration", Long.valueOf(c1775180wIO.LJII));
                    pairArr[3] = new Pair("ad_show_times", Integer.valueOf(c1775180wIO.LJIIIIZZ));
                    pairArr[4] = new Pair("index_in_list", Integer.valueOf(c1775180wIO.LJIIJJI));
                    pairArr[5] = new Pair("is_first_screen_show", Integer.valueOf(c1775180wIO.LJIILIIL));
                    pairArr[6] = new Pair("play_times", Integer.valueOf(c1775180wIO.LJIILJJIL));
                    pairArr[7] = new Pair("rd_exposure_times", Integer.valueOf(c1775180wIO.LJIILL));
                    pairArr[8] = new Pair("play_break_times", Integer.valueOf(c1775180wIO.LJIILLIIL));
                    pairArr[9] = new Pair("play_over_times", Integer.valueOf(c1775180wIO.LJIIZILJ));
                    pairArr[10] = new Pair("play_duration", Long.valueOf(c1775180wIO.LJIJ));
                    pairArr[11] = new Pair("play_percent", Integer.valueOf(c1775180wIO.LJIJI));
                    pairArr[12] = new Pair("play_status", c1775180wIO.LJIJJ);
                    C1772690wEN c1772690wEN = c1775180wIO.LIZ;
                    if (c1772690wEN == null || (str3 = c1772690wEN.LJIIJJI) == null) {
                        str3 = "";
                    }
                    pairArr[13] = new Pair("tab_name", str3);
                    C1772690wEN c1772690wEN2 = c1775180wIO.LIZ;
                    if (c1772690wEN2 != null) {
                        i = c1772690wEN2.LJIIJ;
                    }
                    pairArr[14] = new Pair("tab_index", Integer.valueOf(i));
                    pairArr[15] = new Pair("data_from_cache", c1775180wIO.LIZJ);
                    pairArr[16] = new Pair("feed_track_id", c1775180wIO.LJIIL);
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    Map<String, Object> map3 = c1773880wGILIZ.LIZJ.LJI;
                    if (list != null) {
                        for (Object obj5 : list) {
                            Object obj6 = mapLJIIIIZZ.get(obj5);
                            if (obj6 != null) {
                                linkedHashMap.put(obj5, obj6);
                            }
                            if (linkedHashMap.get(obj5) == null && (obj = ((LinkedHashMap) map3).get(obj5)) != null) {
                                linkedHashMap.put(obj5, obj);
                            }
                        }
                    }
                    c21175917tt.LIZ(1, "success", linkedHashMap);
                    C1771980wDE.LJI(C1741890vQh.LJIIIIZZ(map), C1741890vQh.LJIIIIZZ(linkedHashMap), "success", 1, jCurrentTimeMillis, c1773880wGILIZ.LIZJ);
                    return;
                }
                c21175917tt.LIZ(0, "Invalid params: item_id", null);
                C1771980wDE.LJI(C1741890vQh.LJIIIIZZ(map), C1741890vQh.LJIIIIZZ(linkedHashMap), "Invalid params: item_id", 0, jCurrentTimeMillis, null);
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallGetCurrentTabFullDisplayItem", new InterfaceC1775150wIL() { // from class: X.0wFE
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                C1773710wG1 c1773710wG1LIZIZ;
                C1772630wEH c1772630wEHC82 = this.LIZ.LIZIZ().LJIIIZ().c82();
                if (c1772630wEHC82 != null && (c1773710wG1LIZIZ = c1772630wEHC82.LIZIZ()) != null) {
                    int i = c1773710wG1LIZIZ.LJJIFFI;
                    List<? extends AbstractC1773210wFD> list = ((C1772690wEN) ListProtector.get(c1773710wG1LIZIZ.LJJIII, i)).LIZJ;
                    ArrayList<AbstractC1773210wFD> arrayList = new ArrayList();
                    for (AbstractC1773210wFD abstractC1773210wFD : list) {
                        AbstractC1773210wFD abstractC1773210wFD2 = abstractC1773210wFD;
                        if (abstractC1773210wFD2.LJIIL && !(abstractC1773210wFD2 instanceof C1772720wEQ)) {
                            arrayList.add(abstractC1773210wFD);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (AbstractC1773210wFD abstractC1773210wFD3 : arrayList) {
                        arrayList2.add(C2097608Jq.LJIIIIZZ(new Pair("item_id", abstractC1773210wFD3.LJIIIZ()), new Pair("item_type", abstractC1773210wFD3.LJIIJJI())));
                    }
                    c21175917tt.LIZ(1, "success", C2097608Jq.LJIIIIZZ(new Pair("tab_id", ((C1772690wEN) ListProtector.get(c1773710wG1LIZIZ.LJJIII, i)).LIZLLL), new Pair("item_list", arrayList2)));
                }
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallAddCoverItem", new InterfaceC1775150wIL() { // from class: X.0wFA
            /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
            @Override // X.InterfaceC1775150wIL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map r13, java.util.Map r14, X.C21175917tt r15) {
                /*
                    Method dump skipped, instruction units count: 340
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1773180wFA.LIZ(java.util.Map, java.util.Map, X.17tt):void");
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallRemoveCoverItem", new InterfaceC1775150wIL() { // from class: X.0wFC
            /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
            @Override // X.InterfaceC1775150wIL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map r8, java.util.Map r9, X.C21175917tt r10) {
                /*
                    Method dump skipped, instruction units count: 213
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1773200wFC.LIZ(java.util.Map, java.util.Map, X.17tt):void");
            }
        });
    }

    public final AbstractC1773210wFD LJIILIIL(int i, String str, Map map) {
        String strLJIIIIZZ;
        Gson gson = ECMixMallItemDTO.LIZIZ;
        if (map != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
        } else {
            strLJIIIIZZ = null;
        }
        AbstractC1773210wFD abstractC1773210wFDLIZLLL = LIZIZ().LJFF().LIZLLL((ECMixMallItemDTO) GsonProtectorUtils.fromJson(gson, strLJIIIIZZ, ECMixMallItemDTO.class));
        if (abstractC1773210wFDLIZLLL == null) {
            return null;
        }
        abstractC1773210wFDLIZLLL.LJI.put("from", str);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        abstractC1773210wFDLIZLLL.LJIIZILJ = new C1774380wH6(z);
        return abstractC1773210wFDLIZLLL;
    }
}
