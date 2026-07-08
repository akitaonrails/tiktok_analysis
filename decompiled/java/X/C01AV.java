package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01AV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AV {
    public static final long LIZ(long j, LinkedList linkedList) {
        Integer numValueOf;
        Long lValueOf;
        Long lValueOf2;
        C1130100fVw.LIZ.getClass();
        long jLIZIZ = C1131900fYq.LIZIZ(C497740JfY.LJII(), "last_sent_music_item");
        Object obj = null;
        if (jLIZIZ != 0 && (lValueOf = Long.valueOf(jLIZIZ)) != null) {
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) next;
                if (abstractC1126600fQI != null) {
                    lValueOf2 = Long.valueOf(abstractC1126600fQI.LJFF());
                } else {
                    lValueOf2 = null;
                }
                if (Intrinsics.LJFF(lValueOf2, lValueOf)) {
                    if (next != null) {
                        return lValueOf.longValue();
                    }
                }
            }
        }
        Iterator it3 = linkedList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) next2;
            if (abstractC1126600fQI2 != null) {
                numValueOf = Integer.valueOf(abstractC1126600fQI2.LIZ);
            } else {
                numValueOf = null;
            }
            if (!C01AW.LIZIZ(numValueOf)) {
                obj = next2;
                break;
            }
        }
        AbstractC1126600fQI abstractC1126600fQI3 = (AbstractC1126600fQI) obj;
        if (abstractC1126600fQI3 == null) {
            return j;
        }
        return abstractC1126600fQI3.LJFF();
    }
}
