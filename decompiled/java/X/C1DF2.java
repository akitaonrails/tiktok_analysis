package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: X.1DF2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DF2 {
    public static final AtomicReferenceFieldUpdater LL = AtomicReferenceFieldUpdater.newUpdater(C1DF2.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater LLILLJJLI = AtomicReferenceFieldUpdater.newUpdater(C1DF2.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater LLILLL = AtomicReferenceFieldUpdater.newUpdater(C1DF2.class, Object.class, "_removedRef");
    public volatile Object _next = this;
    public volatile Object _prev = this;
    public volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        r2 = ((X.C1776460wKS) r2).LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r3.compareAndSet(r4, r0, r2) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r3.get(r4) == r0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1DF2 LIZ() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C1DF2.LLILLJJLI
            java.lang.Object r5 = r0.get(r7)
            X.1DF2 r5 = (X.C1DF2) r5
            r0 = r5
        L9:
            r6 = 0
            r4 = r6
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.C1DF2.LL
            java.lang.Object r2 = r3.get(r0)
            if (r2 != r7) goto L26
            if (r5 != r0) goto L16
            return r0
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C1DF2.LLILLJJLI
        L18:
            boolean r1 = r2.compareAndSet(r7, r5, r0)
            if (r1 == 0) goto L1f
            return r0
        L1f:
            java.lang.Object r1 = r2.get(r7)
            if (r1 == r5) goto L18
            goto L0
        L26:
            boolean r1 = r7.LJI()
            if (r1 == 0) goto L2d
            return r6
        L2d:
            if (r2 != 0) goto L30
            return r0
        L30:
            boolean r1 = r2 instanceof X.AbstractC2249551D2z
            if (r1 == 0) goto L3a
            X.1D2z r2 = (X.AbstractC2249551D2z) r2
            r2.LIZ(r0)
            goto L0
        L3a:
            boolean r1 = r2 instanceof X.C1776460wKS
            if (r1 == 0) goto L5c
            if (r4 == 0) goto L53
            X.0wKS r2 = (X.C1776460wKS) r2
            X.1DF2 r2 = r2.LIZ
        L44:
            boolean r1 = r3.compareAndSet(r4, r0, r2)
            if (r1 == 0) goto L4c
            r0 = r4
            goto L9
        L4c:
            java.lang.Object r1 = r3.get(r4)
            if (r1 == r0) goto L44
            goto L0
        L53:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C1DF2.LLILLJJLI
            java.lang.Object r0 = r1.get(r0)
            X.1DF2 r0 = (X.C1DF2) r0
            goto Lb
        L5c:
            X.1DF2 r2 = (X.C1DF2) r2
            r4 = r0
            r0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DF2.LIZ():X.1DF2");
    }

    public final Object LIZLLL() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LL;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2249551D2z)) {
                return obj;
            }
            ((AbstractC2249551D2z) obj).LIZ(this);
        }
    }

    public final C1DF2 LJ() {
        C1776460wKS c1776460wKS;
        C1DF2 c1df2;
        Object objLIZLLL = LIZLLL();
        return (!(objLIZLLL instanceof C1776460wKS) || (c1776460wKS = (C1776460wKS) objLIZLLL) == null || (c1df2 = c1776460wKS.LIZ) == null) ? (C1DF2) objLIZLLL : c1df2;
    }

    public final C1DF2 LJFF() {
        C1DF2 c1df2LIZ = LIZ();
        if (c1df2LIZ == null) {
            Object obj = LLILLJJLI.get(this);
            while (true) {
                c1df2LIZ = (C1DF2) obj;
                if (!c1df2LIZ.LJI()) {
                    break;
                }
                obj = LLILLJJLI.get(c1df2LIZ);
            }
        }
        return c1df2LIZ;
    }

    public boolean LJI() {
        return LIZLLL() instanceof C1776460wKS;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(new C2217401BqU(this) { // from class: X.1DFX
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        });
        sbLIZ.append('@');
        sbLIZ.append(C2239208py.LIZ(this));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(C1DF2 c1df2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLILLJJLI;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c1df2);
            if (LIZLLL() != c1df2) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLILLJJLI;
            while (!atomicReferenceFieldUpdater2.compareAndSet(c1df2, obj, this)) {
                if (atomicReferenceFieldUpdater2.get(c1df2) != obj) {
                    break;
                }
            }
            if (LJI()) {
                c1df2.LIZ();
                return;
            }
            return;
        }
    }
}
