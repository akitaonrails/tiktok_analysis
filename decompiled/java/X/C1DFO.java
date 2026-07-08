package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: X.1DFO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DFO extends C1DE1<C1DF2> {
    public final C1DF2 LIZIZ;
    public C1DF2 LIZJ;

    public C1DFO(C1DF2 c1df2) {
        this.LIZIZ = c1df2;
    }

    @Override // X.C1DE1
    public final void LIZIZ(C1DF2 c1df2, Object obj) {
        boolean z;
        C1DF2 c1df22;
        if (obj == null) {
            z = true;
            c1df22 = this.LIZIZ;
        } else {
            z = false;
            c1df22 = this.LIZJ;
        }
        if (c1df22 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1DF2.LL;
            while (!atomicReferenceFieldUpdater.compareAndSet(c1df2, this, c1df22)) {
                if (atomicReferenceFieldUpdater.get(c1df2) != this) {
                    return;
                }
            }
            if (z) {
                this.LIZIZ.LIZIZ(this.LIZJ);
            }
        }
    }
}
