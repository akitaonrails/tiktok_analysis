package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AwS683S0100000_34;

/* JADX INFO: renamed from: X.1DEV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEV extends C1DEU implements InterfaceC383701eN {
    public static final AtomicReferenceFieldUpdater LJII = AtomicReferenceFieldUpdater.newUpdater(C1DEV.class, Object.class, "owner");
    public volatile Object owner;

    @Override // X.InterfaceC383701eN
    public final boolean LIZJ() {
        return Math.max(C1DEU.LJI.get(this), 0) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Mutex@");
        sbLIZ.append(C2239208py.LIZ(this));
        sbLIZ.append("[isLocked=");
        sbLIZ.append(LIZJ());
        sbLIZ.append(",owner=");
        sbLIZ.append(LJII.get(this));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1DEV(boolean z) {
        C09AU c09au;
        super(1, z ? 1 : 0);
        if (z) {
            c09au = null;
        } else {
            c09au = C2191201ApK.LIZ;
        }
        this.owner = c09au;
        new AwS683S0100000_34(this, 2);
    }

    @Override // X.InterfaceC383701eN
    public final void LIZIZ(Object obj) {
        while (LIZJ()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJII;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C09AU c09au = C2191201ApK.LIZ;
            if (obj2 != c09au) {
                if (obj2 != obj && obj != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("This mutex is locked by ");
                    sbLIZ.append(obj2);
                    sbLIZ.append(", but ");
                    sbLIZ.append(obj);
                    sbLIZ.append(" is expected");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c09au)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                release();
                return;
            }
        }
        "This mutex is not locked".toString();
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean LJFF(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = C1DEU.LJI;
            int i3 = atomicIntegerFieldUpdater2.get(this);
            if (i3 <= this.LIZ) {
                if (i3 <= 0) {
                    if (0 != 0) {
                        break;
                    }
                    if (obj == null) {
                        return false;
                    }
                    while (LIZJ()) {
                        Object obj2 = LJII.get(this);
                        if (obj2 != C2191201ApK.LIZ) {
                            if (obj2 != obj) {
                                return false;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("This mutex is already locked by the specified owner: ");
                            sbLIZ.append(obj);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalStateException(strLIZIZ);
                        }
                    }
                } else if (atomicIntegerFieldUpdater2.compareAndSet(this, i3, i3 - 1)) {
                    break;
                }
            } else {
                do {
                    atomicIntegerFieldUpdater = C1DEU.LJI;
                    i = atomicIntegerFieldUpdater.get(this);
                    i2 = this.LIZ;
                    if (i > i2) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
            }
        }
        LJII.set(this, obj);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r2.LJJIFFI(r4.LIZIZ, kotlin.Unit.LIZ);
     */
    @Override // X.InterfaceC383701eN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.Object r5, X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r4.LJFF(r5)
            if (r0 == 0) goto L9
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L8:
            return r1
        L9:
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            X.1DEt r3 = X.C2252661DEy.LIZ(r0)
            X.1DEW r2 = new X.1DEW     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r4, r3, r5)     // Catch: java.lang.Throwable -> L4f
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C1DEU.LJI     // Catch: java.lang.Throwable -> L4f
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L4f
            int r0 = r4.LIZ     // Catch: java.lang.Throwable -> L4f
            if (r1 > r0) goto L16
            if (r1 <= 0) goto L23
            goto L2a
        L23:
            boolean r0 = r4.LJ(r2)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L16
            goto L31
        L2a:
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L4f
            X.0k9m r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L4f
            r2.LJJIFFI(r0, r1)     // Catch: java.lang.Throwable -> L4f
        L31:
            java.lang.Object r1 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L3e
            X.C099Q.LIZJ(r6)
        L3e:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L46
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L46:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L8
            kotlin.Unit r1 = kotlin.Unit.LIZ
            return r1
        L4f:
            r0 = move-exception
            r3.LJJIIZI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEV.LIZLLL(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
