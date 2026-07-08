package X;

import Y.ARunnableS123S0100000_23;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0piN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522210piN<T> implements InterfaceC1522180piK<T> {
    public final InterfaceC1522240piQ<T> LIZ;
    public final int LIZIZ;
    public final InterfaceC1522250piR<T> LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(true);
    public final ConcurrentLinkedQueue<T> LJ = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<T> LJFF = new ConcurrentLinkedQueue<>();
    public final AtomicInteger LJI = new AtomicInteger(0);
    public final AtomicBoolean LJII = new AtomicBoolean(false);

    @Override // X.InterfaceC1522180piK
    public final void LIZIZ() {
        this.LIZLLL.set(false);
        LIZJ();
    }

    public final void LIZJ() {
        if (this.LJII.compareAndSet(false, true)) {
            C1522170piJ.LIZJ.getValue().execute(new C0W89(new ARunnableS123S0100000_23(this, 84)));
        }
    }

    @Override // X.InterfaceC1522180piK
    public final void LIZ(T t) {
        if (t == null) {
            return;
        }
        InterfaceC1522250piR<T> interfaceC1522250piR = this.LIZJ;
        if (interfaceC1522250piR != null) {
            interfaceC1522250piR.LIZ(t);
        }
        this.LJ.add(t);
        LIZJ();
    }

    public C1522210piN(InterfaceC1522240piQ<T> interfaceC1522240piQ, int i, InterfaceC1522250piR<T> interfaceC1522250piR) {
        this.LIZ = interfaceC1522240piQ;
        this.LIZIZ = i;
        this.LIZJ = interfaceC1522250piR;
    }
}
