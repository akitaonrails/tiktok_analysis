package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0ySY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858360ySY {
    public static C1861610yXn LIZ = new C1861610yXn(1L, 1, false, null, null, null, null);
    public static C1777730wMV LIZIZ = new C1777730wMV(0);

    public static void LIZ(List list) {
        long j;
        if (list.isEmpty()) {
            return;
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            long j2 = ((Message) it2.next()).LIZLLL;
            loop0: while (true) {
                j = j2;
                while (it2.hasNext()) {
                    j2 = ((Message) it2.next()).LIZLLL;
                    if (j < j2) {
                        break;
                    }
                }
            }
            Iterator it3 = list.iterator();
            if (it3.hasNext()) {
                long j3 = ((Message) it3.next()).serverSeq;
                while (true) {
                    long j4 = j3;
                    while (it3.hasNext()) {
                        j3 = ((Message) it3.next()).serverSeq;
                        if (j4 < j3) {
                            break;
                        }
                    }
                    LIZIZ = new C1777730wMV(LIZIZ.LIZ, j, j4);
                    return;
                }
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }
}
