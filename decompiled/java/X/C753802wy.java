package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.RealtimeComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C753802wy extends C09AY implements Function1<C700640Re2, C700640Re2> {
    public C753802wy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C700640Re2 invoke(C700640Re2 c700640Re2) {
        List list;
        C700640Re2 c700640Re22 = c700640Re2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c700640Re22.LIZLLL);
        ArrayList<Pair> arrayList = new ArrayList(C2097808Js.LJIL(linkedHashMap));
        Set setKeySet = linkedHashMap.keySet();
        RealtimeComponentConfig realtimeComponentConfig = c700640Re22.LJFF.realtimeComponentConfig;
        if (realtimeComponentConfig == null || (list = realtimeComponentConfig.rerankedComponents) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            int i = 0;
            if (it2.hasNext()) {
                Object next = it2.next();
                if (setKeySet.contains(next)) {
                    Iterator it3 = setKeySet.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (i >= 0) {
                                if (Intrinsics.LJFF(next2, next)) {
                                    break;
                                }
                                i++;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    arrayList3.add(Integer.valueOf(i));
                    arrayList2.add(ListProtector.get(arrayList, i));
                }
            } else {
                ArrayList arrayList4 = new ArrayList(C13LP.LJLLJ(arrayList3));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int size = arrayList4.size();
                while (i < size) {
                    linkedHashMap2.put(ListProtector.get(arrayList4, i), ListProtector.get(arrayList2, i));
                    i++;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    Object value = entry.getValue();
                    ListProtector.remove(arrayList, iIntValue);
                    ListProtector.add(arrayList, iIntValue, value);
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ);
                for (Pair pair : arrayList) {
                    Pair pair2 = new Pair(pair.getFirst(), pair.getSecond());
                    linkedHashMap3.put(pair2.getFirst(), pair2.getSecond());
                }
                return C700640Re2.LIZ(c700640Re22, new LinkedHashMap(linkedHashMap3), null, null, null, 247);
            }
        }
    }
}
