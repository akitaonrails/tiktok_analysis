package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0H1M, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1M {
    public static List LIZ(List list, EnumC1769850w9n enumC1769850w9n) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
                arrayList.add(str);
            }
            return arrayList;
        }
        return null;
    }
}
