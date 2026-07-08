package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.03CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CQ {
    public static C03CT LIZ(Integer num) {
        C03CT next;
        Iterator<C03CT> it2 = C03CT.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                int value = next.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C03CT c03ct = next;
        if (c03ct == null) {
            return C03CT.UNKNOWN;
        }
        return c03ct;
    }
}
