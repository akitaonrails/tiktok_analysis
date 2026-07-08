package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PIR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PIR {
    public static boolean LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(605));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(604));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(603));

    public static Map LIZJ() {
        return (Map) LIZLLL.getValue();
    }

    public static void LIZ(Integer num) {
        if (num != null) {
            num.intValue();
            LIZJ().put(num, null);
            ((ConcurrentHashMap) LIZIZ.getValue()).remove(num);
        }
    }

    public static final boolean LIZLLL(SearchMixFeed searchMixFeed) {
        SingleLive singleLive;
        Aweme aweme;
        if (searchMixFeed.getFeedType() == 120 || searchMixFeed.getFeedType() == 106) {
            return true;
        }
        if (C0PIT.LIZ < 0) {
            C0PIT.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_ad_min_gap_fix_opt", true);
        }
        if (C0PIT.LIZ == 0 && searchMixFeed.getFeedType() == 62 && (singleLive = searchMixFeed.singleLive) != null && (aweme = singleLive.aweme) != null && aweme.isAd()) {
            return true;
        }
        return C1010120cOQ.LJIJI(searchMixFeed.getAweme());
    }

    public static final boolean LJ(SearchMixFeed searchMixFeed) {
        Integer numValueOf;
        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
        if (!(!C0PLR.LIZIZ.contains(Integer.valueOf(searchMixFeed.getFeedType()))) || C0PH8.LJ(searchMixFeed, C0NMY.GENERAL_SEARCH)) {
            return true;
        }
        List listLIZ = C0C1W.LIZ();
        String str = null;
        if (dynamicPatch != null) {
            numValueOf = Integer.valueOf(dynamicPatch.getOriginType());
        } else {
            numValueOf = null;
        }
        if (listLIZ.contains(String.valueOf(numValueOf))) {
            return true;
        }
        List<String> list = C651840PhW.LIZ;
        if (dynamicPatch != null) {
            str = dynamicPatch.schema;
        }
        if (C651840PhW.LIZ(str)) {
            return true;
        }
        return false;
    }

    public static void LJI(int i) {
        ((ConcurrentHashMap) LIZJ.getValue()).remove(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LinkedList<SearchMixFeed> LIZIZ(LinkedList<SearchMixFeed> linkedList, int i, boolean z) {
        SearchMixFeedBase searchMixFeedBase;
        Integer numValueOf;
        String str;
        DynamicPatch dynamicPatch;
        DynamicPatch dynamicPatch2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fullFillSingleCard: ");
        sbLIZ.append(Integer.valueOf(linkedList.size()));
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ = false;
        if (linkedList.size() == 0) {
            Object obj = LIZJ().get(Integer.valueOf(i));
            if (obj != null) {
                linkedList.add(0, obj);
            }
            LIZJ().put(Integer.valueOf(i), null);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < linkedList.size()) {
            if (LIZJ().containsKey(Integer.valueOf(i)) && LIZJ().get(Integer.valueOf(i)) != null) {
                linkedList.add(i2, LIZJ().get(Integer.valueOf(i)));
                LIZJ().put(Integer.valueOf(i), null);
                i2++;
                i3 = 1;
            } else {
                if ((!C0PLR.LIZIZ.contains(Integer.valueOf(((C0PLT) linkedList.get(i2)).getFeedType()))) && ((searchMixFeedBase = (SearchMixFeedBase) C13LP.LJJJLZIJ(i2, linkedList)) == null || !C0PH8.LJ(searchMixFeedBase, C0NMY.GENERAL_SEARCH))) {
                    List listLIZ = C0C1W.LIZ();
                    SearchMixFeed searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(i2, linkedList);
                    if (searchMixFeed != null && (dynamicPatch2 = searchMixFeed.getDynamicPatch()) != null) {
                        numValueOf = Integer.valueOf(dynamicPatch2.getOriginType());
                    } else {
                        numValueOf = null;
                    }
                    if (!listLIZ.contains(String.valueOf(numValueOf))) {
                        List<String> list = C651840PhW.LIZ;
                        SearchMixFeed searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(i2, linkedList);
                        if (searchMixFeed2 != null && (dynamicPatch = searchMixFeed2.getDynamicPatch()) != null) {
                            str = dynamicPatch.schema;
                        } else {
                            str = null;
                        }
                        if (!C651840PhW.LIZ(str)) {
                            if (i3 % 2 == 0) {
                                i2++;
                            } else {
                                LIZJ().put(Integer.valueOf(i), linkedList.remove(i2 - 1));
                                LIZ = true;
                            }
                            i3 = 0;
                        }
                    }
                }
                i3++;
                i2++;
            }
        }
        if (i3 % 2 != 0 && z && linkedList.size() > 1) {
            LIZJ().put(Integer.valueOf(i), linkedList.remove(i2 - 1));
        }
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<SearchMixFeed> LJII(List<? extends SearchMixFeed> list, List<? extends SearchMixFeed> list2, int i, boolean z) {
        int size;
        int iNextIndex;
        int size2;
        int size3;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (list2 != null && !list2.isEmpty()) {
            List<SearchMixFeed> list3 = (List) ((ConcurrentHashMap) LIZIZ.getValue()).remove(Integer.valueOf(i));
            if (list3 != null) {
                size = list3.size();
            } else {
                size = 0;
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque(list2.size() + size);
            if (list3 != null) {
                for (SearchMixFeed searchMixFeed : list3) {
                    if (LIZLLL(searchMixFeed)) {
                        arrayDeque.addLast(new Pair(searchMixFeed, 0));
                    } else {
                        arrayDeque2.addLast(searchMixFeed);
                    }
                }
            }
            int i2 = 0;
            for (SearchMixFeed searchMixFeed2 : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    SearchMixFeed searchMixFeed3 = searchMixFeed2;
                    if (LIZLLL(searchMixFeed3)) {
                        arrayDeque.addLast(new Pair(searchMixFeed3, Integer.valueOf(i2 + size)));
                    } else {
                        arrayDeque2.addLast(searchMixFeed3);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (C0PIS.LIZ < 0) {
                C0PIS.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 4, "search_ad_gap_outflow_min_gap", true);
            }
            int i4 = C0PIS.LIZ;
            ListIterator<? extends SearchMixFeed> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (LIZLLL(listIterator.previous())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            C118300cf c118300cf = new C118300cf();
            if (iNextIndex >= 0) {
                size2 = iNextIndex - list.size();
            } else {
                size2 = -i4;
            }
            c118300cf.element = size2;
            C259800zU c259800zU = new C259800zU();
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                if (!(!arrayDeque2.isEmpty()) && !(!arrayDeque.isEmpty())) {
                    break;
                }
                Pair pair = (Pair) arrayDeque.peekFirst();
                if (c259800zU.element != 0 && pair != null && LJ((SearchMixFeed) pair.getFirst())) {
                    size3 = arrayList.size() + 1;
                } else {
                    size3 = arrayList.size();
                }
                if (size3 - c118300cf.element >= i4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (pair != null && size3 >= ((Number) pair.getSecond()).intValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 && z3 && (!arrayDeque.isEmpty())) {
                    LJIIIIZZ(arrayList, c259800zU, c118300cf, (SearchMixFeed) ((Pair) arrayDeque.removeFirst()).getFirst(), true);
                } else if (!arrayDeque2.isEmpty()) {
                    LJIIIIZZ(arrayList, c259800zU, c118300cf, (SearchMixFeed) arrayDeque2.removeFirst(), false);
                } else {
                    while (!arrayDeque.isEmpty()) {
                        arrayList2.add(((Pair) arrayDeque.removeFirst()).getFirst());
                    }
                }
            }
            if (z) {
                ArrayList arrayList3 = new ArrayList();
                Pair pair2 = (Pair) c259800zU.element;
                if (pair2 != null) {
                    arrayList3.add(pair2.getFirst());
                }
                arrayList3.addAll(arrayList2);
                if (true ^ arrayList3.isEmpty()) {
                    ((ConcurrentHashMap) LIZIZ.getValue()).put(Integer.valueOf(i), arrayList3);
                }
            } else {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    LJIIIIZZ(arrayList, c259800zU, c118300cf, (SearchMixFeed) it2.next(), true);
                }
                Pair pair3 = (Pair) c259800zU.element;
                if (pair3 != null) {
                    arrayList.add(pair3.getFirst());
                }
            }
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                LJFF(z, iNextIndex, list, list3, "outflow");
            }
            return arrayList;
        }
        Collection collection = (Collection) ((ConcurrentHashMap) LIZIZ.getValue()).remove(Integer.valueOf(i));
        if (collection != null) {
            arrayList.addAll(collection);
        }
        return arrayList;
    }

    public static void LJFF(boolean z, int i, List list, List list2, String str) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reorderCard source:");
        sbLIZ.append(str);
        sbLIZ.append(", current size:");
        sbLIZ.append(list.size());
        sbLIZ.append(", hasMore:");
        sbLIZ.append(z);
        sbLIZ.append(", last ad index:");
        sbLIZ.append(i);
        sbLIZ.append(", cache size:");
        String strLJJLIIIJ = null;
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", detail:");
        if (list2 != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list2, null, null, null, 0, null, AFwS240S0000000_9.get$arr$(950), 31);
        }
        sbLIZ.append(strLJJLIIIJ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, kotlin.Pair] */
    public static final void LJIIIIZZ(ArrayList<SearchMixFeed> arrayList, C259800zU<Pair<SearchMixFeed, Boolean>> c259800zU, C118300cf c118300cf, SearchMixFeed searchMixFeed, boolean z) {
        int size = arrayList.size();
        if (LJ(searchMixFeed)) {
            Pair<SearchMixFeed, Boolean> pair = c259800zU.element;
            if (pair == null) {
                c259800zU.element = new Pair(searchMixFeed, Boolean.valueOf(z));
                if (z) {
                    c118300cf.element = size;
                    return;
                }
                return;
            }
            arrayList.add(pair.getFirst());
            arrayList.add(searchMixFeed);
            if (pair.getSecond().booleanValue()) {
                c118300cf.element = size;
            } else if (z) {
                c118300cf.element = size + 1;
            }
            c259800zU.element = null;
            return;
        }
        arrayList.add(searchMixFeed);
        if (z) {
            c118300cf.element = size;
            return;
        }
        Pair<SearchMixFeed, Boolean> pair2 = c259800zU.element;
        if (pair2 == null || !pair2.getSecond().booleanValue()) {
            return;
        }
        c118300cf.element = size + 1;
    }
}
