package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.1DEM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEM<E> extends C1DET<C1DEM<E>> {
    public final C1DEK<E> LLILZIL;
    public final AtomicReferenceArray LLILZLL;

    @Override // X.C1DET
    public final int LJFF() {
        return C1DEN.LIZIZ;
    }

    public final Object LJIIJ(int i) {
        return this.LLILZLL.get((i * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        LJIIL(r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r4 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        r0 = r5.LLILZIL.LLILLJJLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        X.C2250671D7h.LIZ(r0, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    @Override // X.C1DET
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r6, kotlin.coroutines.CoroutineContext r7) {
        /*
            r5 = this;
            int r0 = X.C1DEN.LIZIZ
            if (r6 < r0) goto L59
            r4 = 1
            int r6 = r6 - r0
        L6:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r5.LLILZLL
            int r0 = r6 * 2
            java.lang.Object r1 = r1.get(r0)
        Le:
            java.lang.Object r3 = r5.LJIIJ(r6)
            boolean r0 = r3 instanceof X.C1DEG
            r2 = 0
            if (r0 != 0) goto L38
            boolean r0 = r3 instanceof X.C1776450wKR
            if (r0 != 0) goto L38
            X.09AU r0 = X.C1DEN.LJIIIZ
            if (r3 == r0) goto L76
            X.09AU r0 = X.C1DEN.LJIIJ
            if (r3 == r0) goto L76
            X.09AU r0 = X.C1DEN.LJI
            if (r3 == r0) goto Le
            X.09AU r0 = X.C1DEN.LJFF
            if (r3 == r0) goto Le
            X.09AU r0 = X.C1DEN.LJIIIIZZ
            if (r3 == r0) goto L75
            X.09AU r0 = X.C1DEN.LIZLLL
            if (r3 == r0) goto L75
            X.09AU r0 = X.C1DEN.LJIIJJI
            if (r3 != r0) goto L5b
            return
        L38:
            if (r4 == 0) goto L56
            X.09AU r0 = X.C1DEN.LJIIIZ
        L3c:
            boolean r0 = r5.LJIIIZ(r6, r3, r0)
            if (r0 == 0) goto Le
            r5.LJIIL(r6, r2)
            r0 = r4 ^ 1
            r5.LJIIJJI(r6, r0)
            if (r4 == 0) goto L55
            X.1DEK<E> r0 = r5.LLILZIL
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.LLILLJJLI
            if (r0 == 0) goto L55
            X.C2250671D7h.LIZ(r0, r1, r7)
        L55:
            return
        L56:
            X.09AU r0 = X.C1DEN.LJIIJ
            goto L3c
        L59:
            r4 = 0
            goto L6
        L5b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "unexpected state: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r0.toString()
            r2.<init>(r0)
            throw r2
        L75:
            return
        L76:
            r5.LJIIL(r6, r2)
            if (r4 == 0) goto L84
            X.1DEK<E> r0 = r5.LLILZIL
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.LLILLJJLI
            if (r0 == 0) goto L84
            X.C2250671D7h.LIZ(r0, r1, r7)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEM.LJI(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final void LJIIJJI(int i, boolean z) {
        if (z) {
            this.LLILZIL.LJJJI((this.LLILLL * ((long) C1DEN.LIZIZ)) + ((long) i));
        }
        LJII();
    }

    public final void LJIIL(int i, Object obj) {
        this.LLILZLL.lazySet(i * 2, obj);
    }

    public final void LJIILIIL(int i, C09AU c09au) {
        this.LLILZLL.set((i * 2) + 1, c09au);
    }

    public final boolean LJIIIZ(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.LLILZLL;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public C1DEM(long j, C1DEM<E> c1dem, C1DEK<E> c1dek, int i) {
        super(j, c1dem, i);
        this.LLILZIL = c1dek;
        this.LLILZLL = new AtomicReferenceArray(C1DEN.LIZIZ * 2);
    }
}
