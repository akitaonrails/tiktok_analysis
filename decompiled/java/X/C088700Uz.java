package X;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.00Uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C088700Uz {
    public static final Set<Integer> LIZ = new LinkedHashSet();
    public static WindowManager LIZIZ;

    public static boolean LIZ(Set set, int i, Pair pair) {
        Integer num = (Integer) pair.getFirst();
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = (Integer) pair.getSecond();
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (!set.contains(Integer.valueOf(i))) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf((((Number) it2.next()).intValue() - iIntValue2) - iIntValue));
                    }
                    if (!arrayList.contains(Integer.valueOf(i))) {
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(set, 10));
                        Iterator it3 = set.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Integer.valueOf(((Number) it3.next()).intValue() - iIntValue2));
                        }
                        if (!arrayList2.contains(Integer.valueOf(i))) {
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(set, 10));
                            Iterator it4 = set.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(Integer.valueOf(((Number) it4.next()).intValue() - iIntValue));
                            }
                            if (arrayList3.contains(Integer.valueOf(i))) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
