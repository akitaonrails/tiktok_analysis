package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08AA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08AA {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(C08AB c08ab, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList<C443120HZe> linkedList = new LinkedList();
        ArrayList<C443120HZe<String, Long, Integer>> arrayList = c08ab.LIZJ;
        if (arrayList.isEmpty()) {
            return linkedHashMap;
        }
        Long lValueOf = null;
        Long lValueOf2 = null;
        long j = 0;
        loop0: while (true) {
            try {
                for (C443120HZe<String, Long, Integer> c443120HZe : arrayList) {
                    String first = c443120HZe.getFirst();
                    long jLongValue = c443120HZe.getSecond().longValue();
                    int iIntValue = c443120HZe.getThird().intValue();
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(jLongValue);
                    }
                    lValueOf = Long.valueOf(jLongValue);
                    Iterator itDescendingIterator = linkedList.descendingIterator();
                    while (true) {
                        Long lValueOf3 = null;
                        while (itDescendingIterator.hasNext()) {
                            C443120HZe c443120HZe2 = (C443120HZe) itDescendingIterator.next();
                            String str = (String) c443120HZe2.getFirst();
                            long jLongValue2 = ((Number) c443120HZe2.getSecond()).longValue();
                            int iIntValue2 = ((Number) c443120HZe2.getThird()).intValue();
                            long jLongValue3 = jLongValue - jLongValue2;
                            if (str == "_resume") {
                                itDescendingIterator.remove();
                                if (lValueOf3 != null) {
                                    lValueOf3 = Long.valueOf(lValueOf3.longValue() + jLongValue3);
                                } else {
                                    lValueOf3 = Long.valueOf(jLongValue3);
                                }
                            } else if (str == "_pending") {
                                itDescendingIterator.remove();
                                j += jLongValue3;
                            } else if (iIntValue2 >= iIntValue) {
                                itDescendingIterator.remove();
                                if (lValueOf3 != null) {
                                    jLongValue3 += lValueOf3.longValue();
                                }
                                linkedHashMap.put(str, Long.valueOf(jLongValue3));
                            }
                        }
                        break;
                    }
                    if (iIntValue > 0) {
                        linkedList.add(new C443120HZe(first, Long.valueOf(jLongValue), Integer.valueOf(iIntValue)));
                    }
                }
                break loop0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                linkedList.clear();
                linkedHashMap.clear();
            }
        }
        for (C443120HZe c443120HZe3 : linkedList) {
            long jLongValue4 = lValueOf.longValue() - ((Number) c443120HZe3.getSecond()).longValue();
            if (jLongValue4 != 0) {
                linkedHashMap.put(c443120HZe3.getFirst(), Long.valueOf(jLongValue4));
            }
        }
        long jLongValue5 = lValueOf.longValue() - lValueOf2.longValue();
        linkedHashMap.put("_total", Long.valueOf(jLongValue5));
        linkedHashMap.put("_real_total", Long.valueOf(jLongValue5 - j));
        if (function1 != null) {
            function1.invoke(linkedHashMap);
        }
        return linkedHashMap;
    }
}
