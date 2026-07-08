package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0p1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1495450p1D extends AbstractC1495490p1H {
    public static final Socket LIZ(C1495440p1C c1495440p1C, C1495540p1M c1495540p1M, C1495430p1B c1495430p1B) {
        for (C1495650p1X c1495650p1X : (ArrayDeque) c1495440p1C.LIZLLL) {
            if (c1495650p1X.LJI(c1495540p1M, null) && c1495650p1X.LJII != null && c1495650p1X != c1495430p1B.LIZIZ()) {
                if (c1495430p1B.LJIILJJIL == null && ((ArrayList) c1495430p1B.LJIIIZ.LJIILIIL).size() == 1) {
                    Object obj = ListProtector.get(c1495430p1B.LJIIIZ.LJIILIIL, 0);
                    Socket socketLIZJ = c1495430p1B.LIZJ(true, false, false);
                    c1495430p1B.LJIIIZ = c1495650p1X;
                    ((ArrayList) c1495650p1X.LJIILIIL).add(obj);
                    return socketLIZJ;
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public static final C1495650p1X LIZIZ(C1495440p1C c1495440p1C, C1495540p1M c1495540p1M, C1495430p1B c1495430p1B, C1495560p1O c1495560p1O) {
        for (C1495650p1X c1495650p1X : (ArrayDeque) c1495440p1C.LIZLLL) {
            if (c1495650p1X.LJI(c1495540p1M, c1495560p1O)) {
                c1495430p1B.LIZ(c1495650p1X, true);
                return c1495650p1X;
            }
        }
        return null;
    }
}
