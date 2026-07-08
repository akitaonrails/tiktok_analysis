package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0ZvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915200ZvK {
    public static C955540ayO LIZ(Integer num) {
        C955540ayO next;
        if (num == null) {
            return C955540ayO.LIZIZ;
        }
        Iterator<C955540ayO> it2 = C955540ayO.LJJL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == num.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C955540ayO c955540ayO = next;
        if (c955540ayO != null) {
            return c955540ayO;
        }
        return new C955540ayO(num.intValue());
    }
}
