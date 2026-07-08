package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594510NTl {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(602));

    public static boolean LJII() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static int LIZJ(List list) {
        String desc;
        if (LJII()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            ArrayList arrayList2 = (ArrayList) list;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boolean.valueOf(LJI((Aweme) it2.next())));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getInflowAdGap(items), isAd: ");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getInflowAdGap(items), last aweme: ");
            Aweme aweme = (Aweme) C13LP.LJJLIIIJL(arrayList2);
            if (aweme != null) {
                desc = aweme.getDesc();
            } else {
                desc = null;
            }
            sbLIZ2.append(desc);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return LIZIZ(list, AFwS240S0000000_9.get$arr$(945));
    }

    public static int LJFF(List list) {
        if (LJII()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boolean.valueOf(((SearchMixFeedBase) it2.next()).isAdOrContainAd()));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getOutflowAdGap(items), isAd: ");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return LIZIZ(list, AFwS240S0000000_9.get$arr$(946));
    }

    public static boolean LJI(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        if ((awemeRawAdLJJIJLIJ != null && awemeRawAdLJJIJLIJ.isSoftAd) || AwemeExtKt.isPseudoAd(aweme)) {
            return false;
        }
        return aweme.isAd();
    }

    public static int LIZIZ(List list, Function1 function1) {
        if (list.isEmpty()) {
            return -1;
        }
        Iterator it2 = C13LP.LLIIL(list).iterator();
        Object obj = null;
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            Object next = c717610SCx.next();
            if (((Boolean) function1.invoke(((IndexedValue) next).LIZIZ)).booleanValue()) {
                obj = next;
            }
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        if (indexedValue == null) {
            return list.size();
        }
        return list.size() - (indexedValue.LIZ + 1);
    }

    public static int LIZ(List list, int i, Function1 function1) {
        Pair pair;
        boolean z;
        ArrayList arrayList = (ArrayList) list;
        boolean z2 = true;
        if (arrayList.size() <= 1) {
            return 0;
        }
        Pair pair2 = null;
        if (i > 0) {
            List listSubList = arrayList.subList(0, i);
            int iLIZIZ = LIZIZ(listSubList, function1);
            if (iLIZIZ < listSubList.size()) {
                z = true;
            } else {
                z = false;
            }
            pair = new Pair(Boolean.valueOf(z), Integer.valueOf(iLIZIZ));
        } else {
            pair = null;
        }
        if (i < arrayList.size() - 1) {
            List listLJLJJLL = C13LP.LJLJJLL(arrayList.subList(i + 1, arrayList.size()));
            int iLIZIZ2 = LIZIZ(listLJLJJLL, function1);
            if (iLIZIZ2 >= listLJLJJLL.size()) {
                z2 = false;
            }
            pair2 = new Pair(Boolean.valueOf(z2), Integer.valueOf(iLIZIZ2));
        }
        if (pair == null) {
            if (pair2 == null) {
                return 0;
            }
            return ((Number) pair2.getSecond()).intValue();
        }
        if (pair2 == null) {
            return ((Number) pair.getSecond()).intValue();
        }
        if (((Boolean) pair.getFirst()).booleanValue() && ((Boolean) pair2.getFirst()).booleanValue()) {
            return Math.min(((Number) pair.getSecond()).intValue(), ((Number) pair2.getSecond()).intValue());
        }
        if (!((Boolean) pair.getFirst()).booleanValue() && !((Boolean) pair2.getFirst()).booleanValue()) {
            return Math.max(((Number) pair.getSecond()).intValue(), ((Number) pair2.getSecond()).intValue());
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            return ((Number) pair.getSecond()).intValue();
        }
        if (!((Boolean) pair2.getFirst()).booleanValue()) {
            return 0;
        }
        return ((Number) pair2.getSecond()).intValue();
    }

    public static int LIZLLL(Integer num, List list, List list2, int i) {
        Aweme aweme;
        String aid;
        ArrayList arrayList = (ArrayList) list2;
        if (i < arrayList.size() || C13LP.LJJJLL(list2) == null || num == null) {
            return i;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String aid2 = ((Aweme) it2.next()).getAid();
            if (aid2 != null) {
                arrayList2.add(aid2);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = (ArrayList) list;
        for (Object obj : arrayList4) {
            SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) obj;
            if (searchMixFeedBase.retrieveIncrementalId() == num.intValue() || (aweme = searchMixFeedBase.getAweme()) == null || (aid = aweme.getAid()) == null || !setLLIIJI.contains(aid)) {
                arrayList3.add(obj);
            }
        }
        Iterator it3 = arrayList3.iterator();
        int i2 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (((SearchMixFeedBase) it3.next()).retrieveIncrementalId() == num.intValue()) {
                if (i2 >= 0) {
                    if (LJII()) {
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(Boolean.valueOf(((SearchMixFeedBase) it4.next()).isAdOrContainAd()));
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getMixInflowAdGap, isAds: ");
                        sbLIZ.append(arrayList5);
                        C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("getMixInflowAdGap, index: ");
                        sbLIZ2.append(i2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    return LIZ(arrayList3, i2, AFwS240S0000000_9.get$arr$(948)) + i;
                }
            } else {
                i2++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int LJ(List list, List list2, int i, Integer num, Aweme aweme) {
        String aid;
        String aid2;
        ArrayList arrayList = (ArrayList) list2;
        String desc = null;
        Integer numValueOf = null;
        if (!arrayList.isEmpty() && aweme != null) {
            if (num == null) {
                return i;
            }
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((SearchMixFeedBase) it2.next()).retrieveIncrementalId() == num.intValue()) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMixOutflowAdGap, lastClickIndex(outflow) is ");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (i2 < 0 || i <= list.size() - i2) {
                return i;
            }
            List listSubList = list.subList(i2, list.size());
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = listSubList.iterator();
            while (it3.hasNext()) {
                Aweme aweme2 = ((C0PLT) it3.next()).getAweme();
                if (aweme2 != null && (aid2 = aweme2.getAid()) != null) {
                    arrayList2.add(aid2);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                Aweme aweme3 = (Aweme) obj;
                if (Intrinsics.LJFF(aweme3.getAid(), aweme.getAid()) || (aid = aweme3.getAid()) == null || !setLLIIJI.contains(aid)) {
                    arrayList3.add(obj);
                }
            }
            Iterator it4 = C13LP.LLIIL(arrayList3).iterator();
            Object obj2 = null;
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it4;
                if (!c717610SCx.hasNext()) {
                    break;
                }
                Object next = c717610SCx.next();
                if (Intrinsics.LJFF(((Aweme) ((IndexedValue) next).LIZIZ).getAid(), aweme.getAid())) {
                    obj2 = next;
                }
            }
            IndexedValue indexedValue = (IndexedValue) obj2;
            if (indexedValue != null) {
                numValueOf = Integer.valueOf(indexedValue.LIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getMixOutflowAdGap, lastInFlowExposedIndex(inflow) is ");
            sbLIZ2.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (numValueOf != null && numValueOf.intValue() >= 0) {
                if (LJII()) {
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(Boolean.valueOf(LJI((Aweme) it5.next())));
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("getMixOutflowAdGap, isAd(inflow): ");
                    sbLIZ3.append(arrayList4);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
                return (LIZ(arrayList3, numValueOf.intValue(), AFwS240S0000000_9.get$arr$(947)) + list.size()) - i2;
            }
            return i;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("getMixOutflowAdGap, inflow: ");
        sbLIZ4.append(list2);
        sbLIZ4.append(", lastInFlowExposedItem: ");
        if (aweme != null) {
            desc = aweme.getDesc();
        }
        sbLIZ4.append(desc);
        C2188811AlT.LIZIZ(sbLIZ4);
        return i;
    }
}
