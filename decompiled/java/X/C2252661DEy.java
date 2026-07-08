package X;

/* JADX INFO: renamed from: X.1DEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252661DEy {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return new X.C2252611DEt<>(2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> X.C2252611DEt<T> LIZ(X.InterfaceC1364105Vn<? super T> r5) {
        /*
            boolean r0 = r5 instanceof X.C2252621DEu
            r1 = 1
            if (r0 != 0) goto Lb
            X.1DEt r0 = new X.1DEt
            r0.<init>(r1, r5)
            return r0
        Lb:
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = X.C2252621DEu.LLIZLLLIL
        L10:
            java.lang.Object r3 = r4.get(r5)
            if (r3 != 0) goto L24
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C2252621DEu.LLIZLLLIL
            X.09AU r0 = X.C2252641DEw.LIZIZ
            r1.set(r5, r0)
        L1d:
            X.1DEt r1 = new X.1DEt
            r0 = 2
            r1.<init>(r0, r5)
            return r1
        L24:
            boolean r0 = r3 instanceof X.C2252611DEt
            if (r0 == 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C2252621DEu.LLIZLLLIL
            X.09AU r1 = X.C2252641DEw.LIZIZ
        L2c:
            boolean r0 = r2.compareAndSet(r5, r3, r1)
            if (r0 == 0) goto L4a
            X.1DEt r3 = (X.C2252611DEt) r3
            if (r3 == 0) goto L1d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C2252611DEt.LLIZ
            java.lang.Object r1 = r2.get(r3)
            boolean r0 = r1 instanceof X.C19370310qL
            if (r0 == 0) goto L72
            X.10qL r1 = (X.C19370310qL) r1
            java.lang.Object r0 = r1.LIZLLL
            if (r0 == 0) goto L72
            r3.LJIILIIL()
            goto L1d
        L4a:
            java.lang.Object r0 = r2.get(r5)
            if (r0 == r3) goto L2c
            goto L10
        L51:
            X.09AU r0 = X.C2252641DEw.LIZIZ
            if (r3 == r0) goto L10
            boolean r0 = r3 instanceof java.lang.Throwable
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Inconsistent state "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r0.toString()
            r2.<init>(r0)
            throw r2
        L72:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = X.C2252611DEt.LLILZLL
            r0 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.set(r3, r0)
            X.1DFj r0 = X.C2252771DFj.LL
            r2.set(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2252661DEy.LIZ(X.05Vn):X.1DEt");
    }
}
