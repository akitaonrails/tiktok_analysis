package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0V6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V6Z<T> {
    public final int LIZ;
    public final ConcurrentLinkedQueue<T> LIZIZ = new ConcurrentLinkedQueue<>();
    public C792290V6d LIZJ;

    public final boolean LIZ() {
        return this.LIZIZ.isEmpty();
    }

    public final T LIZIZ() {
        return this.LIZIZ.poll();
    }

    public C0V6Z(int i) {
        this.LIZ = i;
    }

    public final void LIZJ(T t) {
        this.LIZIZ.add(t);
        if (this.LIZIZ.size() > this.LIZ) {
            T tPoll = this.LIZIZ.poll();
            if (this.LIZJ != null && C0V6Y.LJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("evicted Monitorable ");
                sbLIZ.append(tPoll);
                C792910V8n.LIZIZ("APM-CommonEvent", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
