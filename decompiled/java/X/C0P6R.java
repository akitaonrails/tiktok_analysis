package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0P6R, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P6R {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(543));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(546));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(544));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(545));

    public static void LIZIZ(int i) {
        Object obj = ((Map) LIZ.getValue()).get(Integer.valueOf(i));
        if (obj == null) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map != null) {
            map.clear();
        }
    }

    public static final void LIZ(Integer num, int i, int i2, boolean z, int i3) {
        if (num != null) {
            int iIntValue = num.intValue();
            Map map = (Map) LIZJ.getValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Object arrayList = map.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(numValueOf, arrayList);
            }
            List list = (List) arrayList;
            Map map2 = (Map) LIZIZ.getValue();
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            Object linkedHashMap = map2.get(numValueOf2);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                map2.put(numValueOf2, linkedHashMap);
            }
            Map map3 = (Map) linkedHashMap;
            if (map3.containsKey(Integer.valueOf(i))) {
                return;
            }
            int iIntValue2 = 0;
            if (i != 0) {
                Integer num2 = (Integer) ((Map) LIZLLL.getValue()).get(Integer.valueOf(iIntValue));
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                }
                if ((i3 == 2 && z) || i2 == 0) {
                    iIntValue2++;
                }
            }
            if (z) {
                list.add(Integer.valueOf(iIntValue2));
            } else if (i3 != 1) {
                return;
            }
            map3.put(Integer.valueOf(i), new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(i2)));
            ((Map) LIZLLL.getValue()).put(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
    }
}
