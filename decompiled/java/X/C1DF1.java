package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.1DF1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DF1 extends C1DFU implements InterfaceC2238208po, C13WP {
    public JobSupport LLILZ;

    @Override // X.C13WP
    public final C2252701DFc getList() {
        return null;
    }

    @Override // X.C13WP
    public final boolean isActive() {
        return true;
    }

    public final JobSupport LJIIIIZZ() {
        JobSupport jobSupport = this.LLILZ;
        if (jobSupport != null) {
            return jobSupport;
        }
        return null;
    }

    @Override // X.InterfaceC2238208po
    public final void dispose() {
        JobSupport jobSupportLJIIIIZZ = LJIIIIZZ();
        while (true) {
            Object objLJJJJZI = jobSupportLJIIIIZZ.LJJJJZI();
            if (objLJJJJZI instanceof C1DF1) {
                if (objLJJJJZI == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.LL;
                    C1DFJ c1dfj = C1DFI.LJI;
                    while (!atomicReferenceFieldUpdater.compareAndSet(jobSupportLJIIIIZZ, objLJJJJZI, c1dfj)) {
                        if (atomicReferenceFieldUpdater.get(jobSupportLJIIIIZZ) != objLJJJJZI) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(objLJJJJZI instanceof C13WP) || ((C13WP) objLJJJJZI).getList() == null) {
                return;
            }
            while (true) {
                Object objLIZLLL = LIZLLL();
                if (objLIZLLL instanceof C1776460wKS) {
                    return;
                }
                if (objLIZLLL != this) {
                    C1DF2 c1df2 = (C1DF2) objLIZLLL;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1DF2.LLILLL;
                    Object c1776460wKS = atomicReferenceFieldUpdater2.get(c1df2);
                    if (c1776460wKS == null) {
                        c1776460wKS = new C1776460wKS(c1df2);
                        atomicReferenceFieldUpdater2.lazySet(c1df2, c1776460wKS);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C1DF2.LL;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, objLIZLLL, c1776460wKS)) {
                        if (atomicReferenceFieldUpdater3.get(this) != objLIZLLL) {
                            break;
                        }
                    }
                    c1df2.LIZ();
                    return;
                }
                return;
            }
        }
    }

    @Override // X.C1DF2
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append('@');
        sbLIZ.append(C2239208py.LIZ(this));
        sbLIZ.append("[job@");
        sbLIZ.append(C2239208py.LIZ(LJIIIIZZ()));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
