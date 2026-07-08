package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574470r4f {
    public static final Map<EnumC1574490r4h, Map<String, Aweme>> LIZ = new LinkedHashMap();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, Aweme>> LIZIZ = new ConcurrentHashMap<>();
    public static final Set<Pair<String, List<Long>>> LIZJ = Collections.synchronizedSet(new LinkedHashSet());

    public static void LIZJ(SkylightBlocks skylightBlocks) {
        List<SkylightBlockInfo> list;
        List<SkylightCommonItem> list2;
        String string;
        String string2;
        PaidContentInfo paidContentInfo;
        String episodeNumber;
        List<SkylightBlockInfo> list3;
        List<SkylightCommonItem> list4;
        C1574690r51.LIZ.getClass();
        if (C1574690r51.LIZ()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (skylightBlocks != null && (list3 = skylightBlocks.blocks) != null) {
                for (SkylightBlockInfo skylightBlockInfo : list3) {
                    Integer num = skylightBlockInfo.cardStyle;
                    if (num != null) {
                        if (num.intValue() == 8) {
                            List<SkylightCommonItem> list5 = skylightBlockInfo.historyList;
                            if (list5 != null) {
                                ArrayList arrayList4 = new ArrayList();
                                for (SkylightCommonItem skylightCommonItem : list5) {
                                    if (Intrinsics.LJFF(skylightCommonItem.isLimitedFree, Boolean.TRUE)) {
                                        arrayList4.add(skylightCommonItem);
                                    }
                                }
                                Iterator it2 = arrayList4.iterator();
                                while (it2.hasNext()) {
                                    Long l = ((SkylightCommonItem) it2.next()).collectionId;
                                    if (l != null) {
                                        arrayList.add(l);
                                    }
                                }
                            }
                        } else if (num.intValue() == 9 && (list4 = skylightBlockInfo.historyList) != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (SkylightCommonItem skylightCommonItem2 : list4) {
                                if (Intrinsics.LJFF(skylightCommonItem2.isLimitedFree, Boolean.TRUE)) {
                                    arrayList5.add(skylightCommonItem2);
                                }
                            }
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                Long l2 = ((SkylightCommonItem) it3.next()).collectionId;
                                if (l2 != null) {
                                    arrayList2.add(l2);
                                }
                            }
                        }
                    }
                    List<SkylightCommonItem> list6 = skylightBlockInfo.trendingList;
                    if (list6 != null) {
                        ArrayList arrayList6 = new ArrayList();
                        for (SkylightCommonItem skylightCommonItem3 : list6) {
                            if (Intrinsics.LJFF(skylightCommonItem3.isLimitedFree, Boolean.TRUE)) {
                                arrayList6.add(skylightCommonItem3);
                            }
                        }
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            Long l3 = ((SkylightCommonItem) it4.next()).collectionId;
                            if (l3 != null) {
                                arrayList3.add(l3);
                            }
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                C1574580r4q.LIZIZ.LIZLLL(C1574380r4W.LIZ, arrayList2);
            }
            List<Long> listLJJJJI = C13LP.LJJJJI(C13LP.LJLIL(arrayList2, arrayList));
            if (!listLJJJJI.isEmpty()) {
                C1574580r4q.LIZIZ.LJI(listLJJJJI, C1574380r4W.LIZ, C1574540r4m.LIZ, null);
            }
            List<Long> listLJJJJI2 = C13LP.LJJJJI(arrayList3);
            if (!listLJJJJI2.isEmpty()) {
                C1574580r4q.LIZIZ.LJI(listLJJJJI2, C1574440r4c.LIZ, C1574550r4n.LIZ, null);
                return;
            }
            return;
        }
        if (C296950BkT.LIZ() && ((Number) C296950BkT.LIZ.getValue()).intValue() != 2) {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            if (skylightBlocks != null && (list = skylightBlocks.blocks) != null) {
                for (SkylightBlockInfo skylightBlockInfo2 : list) {
                    Integer num2 = skylightBlockInfo2.cardStyle;
                    if (num2 != null && num2.intValue() == 8) {
                        Collection collection = skylightBlockInfo2.historyList;
                        if (collection == null) {
                            collection = C13BV.INSTANCE;
                        }
                        arrayList7.addAll(collection);
                    }
                    Integer num3 = skylightBlockInfo2.cardStyle;
                    if (num3 != null && num3.intValue() == 9) {
                        Collection collection2 = skylightBlockInfo2.historyList;
                        if (collection2 == null) {
                            collection2 = C13BV.INSTANCE;
                        }
                        arrayList9.addAll(collection2);
                        Map map = (Map) ((LinkedHashMap) LIZ).get(EnumC1574490r4h.THREE_COLUMN_SKYLIGHT);
                        if (map != null && !map.isEmpty() && (list2 = skylightBlockInfo2.historyList) != null) {
                            for (SkylightCommonItem skylightCommonItem4 : list2) {
                                Long l4 = skylightCommonItem4.collectionId;
                                String str = "";
                                if (l4 == null || (string = l4.toString()) == null) {
                                    string = "";
                                }
                                Integer num4 = skylightCommonItem4.watchedEpisodes;
                                if (num4 == null || (string2 = num4.toString()) == null) {
                                    string2 = "";
                                }
                                Aweme aweme = (Aweme) map.get(string);
                                if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (episodeNumber = paidContentInfo.getEpisodeNumber()) != null) {
                                    str = episodeNumber;
                                }
                                if (str.length() > 0 && !Intrinsics.LJFF(string2, str)) {
                                    map.remove(string);
                                }
                            }
                        }
                    }
                    Collection collection3 = skylightBlockInfo2.trendingList;
                    if (collection3 == null) {
                        collection3 = C13BV.INSTANCE;
                    }
                    arrayList8.addAll(collection3);
                }
            }
            ArrayList arrayList10 = new ArrayList();
            for (Object obj : arrayList8) {
                if (Intrinsics.LJFF(((SkylightCommonItem) obj).isLimitedFree, Boolean.TRUE)) {
                    arrayList10.add(obj);
                }
            }
            ArrayList arrayList11 = new ArrayList();
            Iterator it5 = arrayList10.iterator();
            while (it5.hasNext()) {
                Long l5 = ((SkylightCommonItem) it5.next()).collectionId;
                if (l5 != null) {
                    arrayList11.add(l5);
                }
            }
            LIZ(EnumC1574490r4h.HOMEPAGE_SERIES, arrayList11, Integer.valueOf(CastIntegerProtector.parseInt("2")));
            ArrayList arrayList12 = new ArrayList();
            for (Object obj2 : arrayList7) {
                if (Intrinsics.LJFF(((SkylightCommonItem) obj2).isLimitedFree, Boolean.TRUE)) {
                    arrayList12.add(obj2);
                }
            }
            ArrayList arrayList13 = new ArrayList();
            Iterator it6 = arrayList12.iterator();
            while (it6.hasNext()) {
                Long l6 = ((SkylightCommonItem) it6.next()).collectionId;
                if (l6 != null) {
                    arrayList13.add(l6);
                }
            }
            LIZ(EnumC1574490r4h.HOMEPAGE_SERIES, arrayList13, Integer.valueOf(CastIntegerProtector.parseInt("1")));
            ArrayList arrayList14 = new ArrayList();
            for (Object obj3 : arrayList9) {
                if (Intrinsics.LJFF(((SkylightCommonItem) obj3).isLimitedFree, Boolean.TRUE)) {
                    arrayList14.add(obj3);
                }
            }
            ArrayList arrayList15 = new ArrayList();
            Iterator it7 = arrayList14.iterator();
            while (it7.hasNext()) {
                Long l7 = ((SkylightCommonItem) it7.next()).collectionId;
                if (l7 != null) {
                    arrayList15.add(l7);
                }
            }
            LIZ(EnumC1574490r4h.THREE_COLUMN_SKYLIGHT, arrayList15, Integer.valueOf(CastIntegerProtector.parseInt("1")));
        }
    }

    public static void LIZLLL(EnumC1574490r4h enumC1574490r4h) {
        C1574690r51.LIZ.getClass();
        if (C1574690r51.LIZ()) {
            if (enumC1574490r4h != null) {
                switch (C1574480r4g.LIZ[enumC1574490r4h.ordinal()]) {
                    case 1:
                        C1574580r4q.LIZIZ.LJFF(C1574510r4j.LIZ);
                        break;
                    case 2:
                        C1574580r4q.LIZIZ.LJFF(C1574520r4k.LIZ);
                        break;
                    case 3:
                        C1574580r4q.LIZIZ.LJFF(C1574010r3v.LIZ);
                        break;
                    case 4:
                        C1574580r4q.LIZIZ.LJFF(C1574530r4l.LIZ);
                        break;
                    case 5:
                        C1574580r4q.LIZIZ.LJFF(C1574560r4o.LIZ);
                        break;
                    case 6:
                    case 7:
                        C1574580r4q c1574580r4q = C1574580r4q.LIZIZ;
                        c1574580r4q.LJFF(C1574540r4m.LIZ);
                        c1574580r4q.LJFF(C1574550r4n.LIZ);
                        break;
                }
            } else {
                return;
            }
        }
        if (enumC1574490r4h != null) {
            LIZ.remove(enumC1574490r4h);
        }
    }

    public static void LIZ(EnumC1574490r4h enumC1574490r4h, List list, Integer num) {
        List<Long> listLJJJJI;
        AbstractC1574450r4d abstractC1574450r4d;
        AbstractC1574500r4i abstractC1574500r4i;
        C1574690r51.LIZ.getClass();
        if (C1574690r51.LIZ()) {
            if (list == null || (listLJJJJI = C13LP.LJJJJI(list)) == null) {
                listLJJJJI = C13BV.INSTANCE;
            }
            if (!listLJJJJI.isEmpty()) {
                int i = CastIntegerProtector.parseInt("2");
                if (num != null && num.intValue() == i) {
                    abstractC1574450r4d = C1574440r4c.LIZ;
                } else {
                    abstractC1574450r4d = C1574380r4W.LIZ;
                }
                switch (C1574480r4g.LIZ[enumC1574490r4h.ordinal()]) {
                    case 1:
                        abstractC1574500r4i = C1574510r4j.LIZ;
                        break;
                    case 2:
                        abstractC1574500r4i = C1574520r4k.LIZ;
                        break;
                    case 3:
                        abstractC1574500r4i = C1574010r3v.LIZ;
                        break;
                    case 4:
                        abstractC1574500r4i = C1574530r4l.LIZ;
                        break;
                    case 5:
                        abstractC1574500r4i = C1574560r4o.LIZ;
                        break;
                    case 6:
                    case 7:
                        if (Intrinsics.LJFF(abstractC1574450r4d, C1574440r4c.LIZ)) {
                            abstractC1574500r4i = C1574550r4n.LIZ;
                        } else {
                            abstractC1574500r4i = C1574540r4m.LIZ;
                        }
                        break;
                    default:
                        return;
                }
                C1574580r4q.LIZIZ.LJI(listLJJJJI, abstractC1574450r4d, abstractC1574500r4i, null);
                return;
            }
            return;
        }
        if (enumC1574490r4h != EnumC1574490r4h.OTHERS_HOMEPAGE && !C296950BkT.LIZ()) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
        Object linkedHashMap2 = linkedHashMap.get(enumC1574490r4h);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(enumC1574490r4h, linkedHashMap2);
        }
        Map map = (Map) linkedHashMap2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!map.containsKey(String.valueOf(((Number) obj).longValue()))) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                C1617470sC1 c1617470sC1 = MiniDramaVideoApi.LIZ;
                enumC1574490r4h.name();
                AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(map, (Map<String, Aweme>) enumC1574490r4h, (EnumC1574490r4h) 143);
                c1617470sC1.getClass();
                C1617470sC1.LIZ(arrayList, num, awS603S0100000_24);
            }
        }
    }
}
