package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: X.1DEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252471DEf<E> {
    public static final AtomicReferenceFieldUpdater LJ = AtomicReferenceFieldUpdater.newUpdater(C2252471DEf.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater LJFF = AtomicLongFieldUpdater.newUpdater(C2252471DEf.class, "_state");
    public static final C09AU LJI = new C09AU("REMOVE_FROZEN");
    public final int LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final AtomicReferenceArray LIZLLL;
    public volatile Object _next;
    public volatile long _state;

    public final boolean LIZIZ() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = LJFF;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C2252471DEf<E> LIZJ() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = LJFF;
        while (true) {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJ;
        while (true) {
            C2252471DEf<E> c2252471DEf = (C2252471DEf) atomicReferenceFieldUpdater.get(this);
            if (c2252471DEf != null) {
                return c2252471DEf;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJ;
            C2252471DEf c2252471DEf2 = new C2252471DEf(this.LIZ * 2, this.LIZIZ);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.LIZJ;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c2252491DEh = this.LIZLLL.get(i4);
                if (c2252491DEh == null) {
                    c2252491DEh = new C2252491DEh(i);
                }
                c2252471DEf2.LIZLLL.set(c2252471DEf2.LIZJ & i, c2252491DEh);
                i++;
            }
            LJFF.set(c2252471DEf2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, c2252471DEf2) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
        }
    }

    public final Object LIZLLL() {
        long j;
        int i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = LJFF;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return LJI;
            }
            int i2 = (int) ((j2 & 1073741823) >> 0);
            int i3 = this.LIZJ;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.LIZLLL.get(i5);
            if (obj == null) {
                if (this.LIZIZ) {
                    return null;
                }
            } else {
                if (obj instanceof C2252491DEh) {
                    return null;
                }
                long j3 = ((long) ((i2 + 1) & 1073741823)) << 0;
                if (LJFF.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    this.LIZLLL.set(this.LIZJ & i2, null);
                    return obj;
                }
                if (this.LIZIZ) {
                    C2252471DEf<E> c2252471DEfLIZJ = this;
                    do {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = LJFF;
                        do {
                            j = atomicLongFieldUpdater2.get(c2252471DEfLIZJ);
                            i = (int) ((j & 1073741823) >> 0);
                            if ((j & 1152921504606846976L) != 0) {
                                c2252471DEfLIZJ = c2252471DEfLIZJ.LIZJ();
                            }
                        } while (!LJFF.compareAndSet(c2252471DEfLIZJ, j, (j & (-1073741824)) | j3));
                        c2252471DEfLIZJ.LIZLLL.set(c2252471DEfLIZJ.LIZJ & i, null);
                        return obj;
                    } while (c2252471DEfLIZJ != null);
                    return obj;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(E r17) {
        /*
            r16 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = X.C2252471DEf.LJFF
        L2:
            r11 = r16
            long r12 = r3.get(r11)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r12
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r8 = 1
            if (r0 == 0) goto L1b
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r12 = r12 & r0
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            r8 = 2
        L1a:
            return r8
        L1b:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r12
            r9 = 0
            long r0 = r0 >> r9
            int r6 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r12
            r7 = 30
            long r0 = r0 >> r7
            int r2 = (int) r0
            int r4 = r11.LIZJ
            int r1 = r2 + 2
            r1 = r1 & r4
            r0 = r6 & r4
            if (r1 != r0) goto L36
            return r8
        L36:
            boolean r0 = r11.LIZIZ
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L54
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r11.LIZLLL
            r0 = r2 & r4
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L54
            int r1 = r11.LIZ
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 < r0) goto L53
            int r2 = r2 - r6
            r2 = r2 & r5
            int r0 = r1 >> 1
            if (r2 <= r0) goto L2
        L53:
            return r8
        L54:
            int r0 = r2 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = X.C2252471DEf.LJFF
            r14 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r14 = r14 & r12
            long r0 = (long) r0
            long r0 = r0 << r7
            long r14 = r14 | r0
            boolean r0 = r10.compareAndSet(r11, r12, r14)
            if (r0 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r11.LIZLLL
            r0 = r2 & r4
            r6 = r17
            r1.set(r0, r6)
            r5 = r11
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C2252471DEf.LJFF
            long r7 = r0.get(r5)
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r7 = r7 & r0
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto La1
            X.1DEf r5 = r5.LIZJ()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r5.LIZLLL
            int r0 = r5.LIZJ
            r0 = r0 & r2
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.C2252491DEh
            if (r0 == 0) goto La1
            X.1DEh r1 = (X.C2252491DEh) r1
            int r0 = r1.LIZ
            if (r0 != r2) goto La1
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r5.LIZLLL
            int r0 = r5.LIZJ
            r0 = r0 & r2
            r1.set(r0, r6)
            goto L72
        La1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2252471DEf.LIZ(java.lang.Object):int");
    }

    public C2252471DEf(int i, boolean z) {
        boolean z2;
        this.LIZ = i;
        this.LIZIZ = z;
        int i2 = i - 1;
        this.LIZJ = i2;
        this.LIZLLL = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((i & i2) == 0) {
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
