package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19Ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21557419Ye {
    public final C19YY LIZ;
    public final C20632315oP LIZIZ;
    public final InterfaceC21558519Yp LIZJ;
    public AbstractC21673619ry<?> LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (this.LJ) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        AbstractC21673619ry<?> adapter = this.LIZIZ.getAdapter();
        this.LIZLLL = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        final boolean z = true;
        this.LJ = true;
        final C19YY c19yy = this.LIZ;
        this.LIZIZ.LIZIZ(new AbstractC712240Rwk(c19yy) { // from class: X.19Yd
            public final WeakReference<C19YY> LL;
            public int LLILLL = 0;
            public int LLILLJJLI = 0;

            {
                this.LL = new WeakReference<>(c19yy);
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                this.LLILLJJLI = this.LLILLL;
                this.LLILLL = i;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                boolean z2;
                C19YY c19yy2 = this.LL.get();
                if (c19yy2 != null && c19yy2.getSelectedTabPosition() != i && i < c19yy2.getTabCount()) {
                    int i2 = this.LLILLL;
                    if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c19yy2.LJIILJJIL(c19yy2.LJIIIZ(i), z2, true);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r1
              0x001a: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:15:0x0020, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC712240Rwk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onPageScrolled(int r7, float r8, int r9) {
                /*
                    r6 = this;
                    java.lang.ref.WeakReference<X.19YY> r0 = r6.LL
                    java.lang.Object r5 = r0.get()
                    X.19YY r5 = (X.C19YY) r5
                    if (r5 == 0) goto L1e
                    int r4 = r6.LLILLL
                    r3 = 0
                    r2 = 2
                    r1 = 1
                    if (r4 != r2) goto L1f
                    int r0 = r6.LLILLJJLI
                    if (r0 == r1) goto L1f
                    r1 = 0
                L16:
                    int r0 = r6.LLILLJJLI
                    if (r0 == 0) goto L1b
                L1a:
                    r3 = 1
                L1b:
                    r5.LJIILLIIL(r7, r8, r1, r3)
                L1e:
                    return
                L1f:
                    r1 = 1
                    if (r4 != r2) goto L1a
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21557319Yd.onPageScrolled(int, float, int):void");
            }
        });
        final C20632315oP c20632315oP = this.LIZIZ;
        this.LIZ.LIZIZ(new InterfaceC21558219Ym(c20632315oP, z) { // from class: X.19Yj
            public final C20632315oP LIZ;
            public final boolean LIZIZ;

            @Override // X.InterfaceC21558219Ym
            public final void LIZIZ(C21557119Yb c21557119Yb) {
            }

            @Override // X.InterfaceC21558219Ym
            public final void LIZJ(C21557119Yb c21557119Yb) {
            }

            {
                this.LIZ = c20632315oP;
                this.LIZIZ = z;
            }

            @Override // X.InterfaceC21558219Ym
            public final void LIZ(C21557119Yb c21557119Yb, boolean z2) {
                this.LIZ.LJ(c21557119Yb.LIZJ, this.LIZIZ);
            }
        });
        this.LIZLLL.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.19Yo
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ.LIZIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                this.LIZ.LIZIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                this.LIZ.LIZIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                this.LIZ.LIZIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                this.LIZ.LIZIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i, int i2, Object obj) {
                this.LIZ.LIZIZ();
            }
        });
        LIZIZ();
        this.LIZ.LJIILLIIL(this.LIZIZ.getCurrentItem(), 0.0f, true, true);
    }

    public final void LIZIZ() {
        this.LIZ.LJIILIIL();
        AbstractC21673619ry<?> abstractC21673619ry = this.LIZLLL;
        if (abstractC21673619ry != null) {
            int itemCount = abstractC21673619ry.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C21557119Yb c21557119YbLJIIJJI = this.LIZ.LJIIJJI();
                this.LIZJ.LIZ(c21557119YbLJIIJJI, i);
                this.LIZ.LIZLLL(c21557119YbLJIIJJI, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.LIZIZ.getCurrentItem(), this.LIZ.getTabCount() - 1);
                if (iMin != this.LIZ.getSelectedTabPosition()) {
                    C19YY c19yy = this.LIZ;
                    c19yy.LJIILJJIL(c19yy.LJIIIZ(iMin), true, false);
                }
            }
        }
    }

    public C21557419Ye(C19YY c19yy, C20632315oP c20632315oP, InterfaceC21558519Yp interfaceC21558519Yp) {
        this.LIZ = c19yy;
        this.LIZIZ = c20632315oP;
        this.LIZJ = interfaceC21558519Yp;
    }
}
