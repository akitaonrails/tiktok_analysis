package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00RV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00RV {
    public static final long[] LIZ = {4294967295L, 4290772991L, 468975619};
    public static final long[] LIZIZ = {36567803, 1452244900, 469499899};
    public static final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(248));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(247));

    public static List LIZ(List list, List list2) {
        int iIntValue;
        if (list2.isEmpty()) {
            return list;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) ((Map) LIZJ.getValue()).get(it2.next());
            if (num != null && (iIntValue = num.intValue()) >= 0) {
                int i = iIntValue / 32;
                int i2 = iIntValue % 32;
                if (i < ((ArrayList) list).size()) {
                    ListProtector.set(list, i, Long.valueOf(((Number) ListProtector.get(list, i)).longValue() & ((long) (~(1 << i2)))));
                }
            } else {
                return C13BV.INSTANCE;
            }
        }
        return list;
    }

    public static long LIZIZ(int i, List list, List list2) {
        boolean z;
        Object obj;
        Object obj2;
        if (i >= 0 && i < ((ArrayList) list).size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj = ListProtector.get(list, i);
        } else {
            obj = 0L;
        }
        long jLongValue = ((Number) obj).longValue();
        if (i >= 0 && i < ((ArrayList) list2).size()) {
            obj2 = ListProtector.get(list2, i);
        } else {
            obj2 = 0L;
        }
        long jLongValue2 = ((Number) obj2).longValue();
        if (i == 2) {
            jLongValue2 &= 536870911;
        }
        return jLongValue2 & (~jLongValue);
    }
}
