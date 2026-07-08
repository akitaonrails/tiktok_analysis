package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252341DDs extends AbstractC2252411DDz<C2252321DDq<?>> {
    public static final AtomicReferenceFieldUpdater LIZ = AtomicReferenceFieldUpdater.newUpdater(C2252341DDs.class, Object.class, "_state");
    public volatile Object _state;

    @Override // X.AbstractC2252411DDz
    public final boolean LIZ(AbstractC2252361DDu abstractC2252361DDu) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, C1BNE.LIZ);
        return true;
    }

    @Override // X.AbstractC2252411DDz
    public final InterfaceC1364105Vn[] LIZIZ(AbstractC2252361DDu abstractC2252361DDu) {
        LIZ.set(this, null);
        return C1DE0.LIZ;
    }

    public final Object LIZJ(C2250751D7p c2250751D7p) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c2250751D7p));
        c2252611DEt.LJIJJ();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
        C09AU c09au = C1BNE.LIZ;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, c09au, c2252611DEt)) {
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c09au) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                c2252611DEt.resumeWith(unit);
                break;
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c2250751D7p);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }
}
