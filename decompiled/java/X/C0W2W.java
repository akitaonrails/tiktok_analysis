package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0W2W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W2W {
    public static final Map<String, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair("1-2", 0), new Pair("1-1", 1), new Pair("1-8", 2), new Pair("1-7", 3), new Pair("1-4", 4));

    public static List LIZ(List list) {
        String strLJJIFFI;
        int iIntValue;
        String strLJJIFFI2;
        int iIntValue2;
        String str;
        String str2;
        Map<String, Integer> map = LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str3 = ((C816670W1x) obj).LIZ;
            Object arrayList = linkedHashMap.get(str3);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str3, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            entry.getKey();
            Iterator it2 = ((List) entry.getValue()).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    C816680W1y c816680W1y = ((C816670W1x) next).LIZJ;
                    if (c816680W1y != null && (str2 = c816680W1y.LIZIZ) != null) {
                        strLJJIFFI = u.LJJIFFI(str2, "_", "-", false);
                    } else {
                        strLJJIFFI = null;
                    }
                    Integer num = map.get(strLJJIFFI);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = Integer.MAX_VALUE;
                    }
                    do {
                        Object next2 = it2.next();
                        C816680W1y c816680W1y2 = ((C816670W1x) next2).LIZJ;
                        if (c816680W1y2 != null && (str = c816680W1y2.LIZIZ) != null) {
                            strLJJIFFI2 = u.LJJIFFI(str, "_", "-", false);
                        } else {
                            strLJJIFFI2 = null;
                        }
                        Integer num2 = map.get(strLJJIFFI2);
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = Integer.MAX_VALUE;
                        }
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it2.hasNext());
                }
                linkedHashMap2.put(key, next);
            } else {
                throw new NoSuchElementException();
            }
        }
        return C13LP.LLIIII(linkedHashMap2.values());
    }
}
