package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchPlayerPreCreateConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0Pfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650710Pfh {
    public final Map<Integer, List<C661490Px5>> LIZ = new HashMap();
    public final Queue<C0N0Y> LIZIZ = new ConcurrentLinkedQueue();

    public final C0N0Y LIZ() {
        C0N0Y c0n0y;
        C0P7J.LIZ.getClass();
        return (!((SearchPlayerPreCreateConfig) C0P7J.LIZJ.getValue()).enablePreload || (c0n0y = (C0N0Y) ((ConcurrentLinkedQueue) this.LIZIZ).poll()) == null) ? new C1483410ohn(false) : c0n0y;
    }

    public final void LIZJ() {
        Iterator it2 = ((ConcurrentLinkedQueue) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((C0N0Y) it2.next()).release();
        }
        ((ConcurrentLinkedQueue) this.LIZIZ).clear();
    }

    public final void LJ() {
        try {
            Iterator it2 = ((HashMap) this.LIZ).values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((List) it2.next()).iterator();
                while (it3.hasNext()) {
                    C0N0Y c0n0y = ((C661490Px5) it3.next()).LJIILIIL;
                    if (c0n0y != null && !c0n0y.isPlaying()) {
                        c0n0y.release();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(C0N0Y c0n0y) {
        if (c0n0y == null) {
            return;
        }
        c0n0y.LJJIIJZLJL();
        try {
            c0n0y.release();
            C650700Pfg.LIZ(c0n0y);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(Integer num) {
        List list = (List) ((HashMap) this.LIZ).remove(num);
        if (list != null) {
            list.clear();
        }
    }
}
