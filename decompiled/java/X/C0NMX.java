package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NMX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMX {
    public final ConcurrentHashMap<Integer, SearchMixFeed> LIZ = new ConcurrentHashMap<>();

    public final List<SearchMixFeed> LIZ(List<? extends SearchMixFeed> list, Function2<? super Integer, ? super SearchMixFeed, Boolean> function2) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(arrayList, i);
            if (function2.invoke(Integer.valueOf(i), searchMixFeed).booleanValue()) {
                arrayList2.add(Integer.valueOf(i));
            } else if (Intrinsics.LJFF(C0PH8.LIZLLL(searchMixFeed, null, 3), Boolean.TRUE) || searchMixFeed.isAweme()) {
                arrayList2.add(Integer.valueOf(i));
                linkedList.add(searchMixFeed);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Object objPoll = linkedList.poll();
            if (objPoll == null) {
                int size2 = arrayList3.size();
                for (int i2 = iIntValue + 1; i2 < size2; i2++) {
                    if (!arrayList2.contains(Integer.valueOf(i2))) {
                        this.LIZ.put(Integer.valueOf(i2), (SearchMixFeed) ListProtector.get(arrayList3, i2));
                    }
                }
                return arrayList3.subList(0, iIntValue);
            }
            ListProtector.set(arrayList3, iIntValue, objPoll);
        }
        return arrayList3;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Pair<List<SearchMixFeed>, SearchMixFeed> LIZIZ(List<? extends SearchMixFeed> list, Function2<? super Integer, ? super SearchMixFeed, Boolean> function2) {
        Object next;
        Iterator it2 = C13LP.LLIIL(list).iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (c717610SCx.hasNext()) {
                next = c717610SCx.next();
                IndexedValue indexedValue = (IndexedValue) next;
                if (function2.invoke(Integer.valueOf(indexedValue.LIZ), indexedValue.LIZIZ).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IndexedValue indexedValue2 = (IndexedValue) next;
        if (indexedValue2 == null) {
            return new Pair<>(new ArrayList(list), null);
        }
        int i = indexedValue2.LIZ;
        T t = indexedValue2.LIZIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(list, i2);
            if (Intrinsics.LJFF(C0PH8.LIZLLL(searchMixFeed, null, 3), Boolean.TRUE) || searchMixFeed.isAweme()) {
                arrayList.add(Integer.valueOf(i2));
                linkedList.add(searchMixFeed);
            }
        }
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Number) it3.next()).intValue();
            Object objPoll = linkedList.poll();
            if (objPoll == null) {
                int size2 = arrayList2.size();
                for (int i3 = iIntValue + 1; i3 < size2; i3++) {
                    if (!arrayList.contains(Integer.valueOf(i3))) {
                        this.LIZ.put(Integer.valueOf(i3), (SearchMixFeed) ListProtector.get(arrayList2, i3));
                    }
                }
                return new Pair<>(arrayList2.subList(0, iIntValue), t);
            }
            ListProtector.set(arrayList2, iIntValue, objPoll);
        }
        return new Pair<>(arrayList2, t);
    }
}
