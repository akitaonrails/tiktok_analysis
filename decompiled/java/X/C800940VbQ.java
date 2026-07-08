package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0VbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800940VbQ {
    public final List<String> LIZ = C1697810uHb.LJIILJJIL("common");
    public final Map<String, PriorityQueue<InterfaceC1017050cZb>> LIZIZ = new LinkedHashMap();
    public final ReentrantLock LIZJ = new ReentrantLock();

    public final long LIZ() {
        this.LIZJ.lock();
        try {
            C118300cf c118300cf = new C118300cf();
            Iterator it2 = ((LinkedHashMap) this.LIZIZ).entrySet().iterator();
            while (it2.hasNext()) {
                c118300cf.element += ((PriorityQueue) ((Map.Entry) it2.next()).getValue()).size();
            }
            long j = c118300cf.element;
            this.LIZJ.unlock();
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.unlock();
            throw th;
        }
    }
}
