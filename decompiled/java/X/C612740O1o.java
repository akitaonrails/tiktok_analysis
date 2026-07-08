package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0O1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612740O1o {
    public final int LIZ;
    public final CopyOnWriteArraySet<String> LIZIZ;
    public final ConcurrentLinkedQueue<String> LIZJ;

    public C612740O1o(Set set, int i) {
        Object c098200Yq;
        this.LIZ = i;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.LIZIZ = copyOnWriteArraySet;
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.LIZJ = concurrentLinkedQueue;
        Iterable iterableLL = set.size() > i ? C13LP.LL(set, i) : set;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C13LP.LJJJJLL(iterableLL, linkedHashSet);
        if (!linkedHashSet.isEmpty()) {
            try {
                copyOnWriteArraySet.addAll(linkedHashSet);
                c098200Yq = Boolean.valueOf(concurrentLinkedQueue.addAll(linkedHashSet));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                this.LIZIZ.clear();
                this.LIZJ.clear();
            }
        }
    }
}
