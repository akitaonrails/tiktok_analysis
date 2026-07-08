package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0d0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033900d0m extends AbstractC1033980d0u implements InterfaceC1034190d1F {
    public final Map<C1033970d0t, RunnableC1033910d0n> LLILZ;

    public final void LJIILJJIL() {
        Iterator it2 = ((LinkedHashMap) this.LLILZ).values().iterator();
        while (it2.hasNext()) {
            ((RunnableC1033910d0n) it2.next()).LIZIZ();
        }
        ((LinkedHashMap) this.LLILZ).clear();
    }

    @Override // X.AbstractC1033980d0u
    public final void LJI() {
        super.LJI();
        LJIILJJIL();
    }

    @Override // X.AbstractC1033980d0u
    public final void LIZLLL() {
        LJIILJJIL();
    }

    public C1033900d0m(InterfaceC1034260d1M interfaceC1034260d1M) {
        super(interfaceC1034260d1M);
        this.LLILZ = new LinkedHashMap();
    }

    @Override // X.AbstractC1033980d0u
    public final void LJIIIIZZ(int i) {
        C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
        if (c1033970d0tLIZIZ == null) {
            return;
        }
        RunnableC1033910d0n runnableC1033910d0n = (RunnableC1033910d0n) ((LinkedHashMap) this.LLILZ).get(c1033970d0tLIZIZ);
        if (runnableC1033910d0n != null) {
            if (runnableC1033910d0n.LLILLJJLI == i) {
                return;
            }
            this.LLILZ.remove(c1033970d0tLIZIZ);
            runnableC1033910d0n.LIZIZ();
        }
        RunnableC1033910d0n runnableC1033910d0n2 = new RunnableC1033910d0n(c1033970d0tLIZIZ, i);
        runnableC1033910d0n2.LLILLL = this;
        this.LLILZ.put(c1033970d0tLIZIZ, runnableC1033910d0n2);
        runnableC1033910d0n2.LIZJ();
    }

    @Override // X.AbstractC1033980d0u
    public final void LJIIIZ(int i) {
        C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
        if (c1033970d0tLIZIZ == null) {
            return;
        }
        c1033970d0tLIZIZ.LIZJ.LIZJ();
        RunnableC1033910d0n runnableC1033910d0nRemove = this.LLILZ.remove(c1033970d0tLIZIZ);
        if (runnableC1033910d0nRemove != null) {
            runnableC1033910d0nRemove.LIZIZ();
        }
    }

    @Override // X.AbstractC1033980d0u
    public final void LJIIJJI(int i) {
        super.LJIIJJI(i);
        C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
        if (c1033970d0tLIZIZ == null) {
            return;
        }
        c1033970d0tLIZIZ.LIZJ.LIZ();
        RunnableC1033910d0n runnableC1033910d0nRemove = this.LLILZ.remove(c1033970d0tLIZIZ);
        if (runnableC1033910d0nRemove != null) {
            runnableC1033910d0nRemove.LIZIZ();
        }
    }

    @Override // X.InterfaceC1034190d1F
    public final void LIZ(C1033970d0t c1033970d0t, int i) {
        RunnableC1033910d0n runnableC1033910d0nRemove = this.LLILZ.remove(c1033970d0t);
        if (runnableC1033910d0nRemove == null) {
            return;
        }
        c1033970d0t.LIZJ.LIZJ();
        runnableC1033910d0nRemove.LIZIZ();
    }
}
