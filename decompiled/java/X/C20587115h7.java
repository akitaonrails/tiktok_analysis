package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.15h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20587115h7 {
    public final C19U1 LIZ;
    public final C20632315oP LIZIZ;
    public final InterfaceC1173910geb LIZJ;
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
        final C19U1 c19u1 = this.LIZ;
        this.LIZIZ.LIZIZ(new AbstractC712240Rwk(c19u1) { // from class: X.15h8
            public final WeakReference<C19U1> LL;
            public int LLILLL = 0;
            public int LLILLJJLI = 0;

            {
                this.LL = new WeakReference<>(c19u1);
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                this.LLILLJJLI = this.LLILLL;
                this.LLILLL = i;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                boolean z2;
                C19U1 c19u12 = this.LL.get();
                if (c19u12 != null && c19u12.getSelectedTabPosition() != i && i < c19u12.getTabCount()) {
                    int i2 = this.LLILLL;
                    if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c19u12.selectTab(c19u12.getTabAt(i), z2);
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
                    java.lang.ref.WeakReference<X.19U1> r0 = r6.LL
                    java.lang.Object r5 = r0.get()
                    X.19U1 r5 = (X.C19U1) r5
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
                    r5.setScrollPosition(r7, r8, r1, r3)
                L1e:
                    return
                L1f:
                    r1 = 1
                    if (r4 != r2) goto L1a
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20587215h8.onPageScrolled(int, float, int):void");
            }
        });
        final C20632315oP c20632315oP = this.LIZIZ;
        this.LIZ.addOnTabSelectedListener(new InterfaceC1584740rLE(c20632315oP, z) { // from class: X.0gee
            public final C20632315oP LL;
            public final boolean LLILLJJLI;

            @Override // X.InterfaceC1586460rO0
            public final void Yn(C19U0 c19u0) {
            }

            @Override // X.InterfaceC1586460rO0
            public final void ih(C19U0 c19u0) {
            }

            @Override // X.InterfaceC1586460rO0
            public final void Oq(C19U0 c19u0) {
                this.LL.LJ(c19u0.LJ, this.LLILLJJLI);
            }

            {
                this.LL = c20632315oP;
                this.LLILLJJLI = z;
            }
        });
        this.LIZLLL.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.15hA
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
        this.LIZ.setScrollPosition(this.LIZIZ.getCurrentItem(), 0.0f, true);
    }

    public final void LIZIZ() {
        this.LIZ.removeAllTabs();
        AbstractC21673619ry<?> abstractC21673619ry = this.LIZLLL;
        if (abstractC21673619ry != null) {
            int itemCount = abstractC21673619ry.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C19U0 c19u0NewTab = this.LIZ.newTab();
                this.LIZJ.LIZ(c19u0NewTab, i);
                this.LIZ.addTab(c19u0NewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.LIZIZ.getCurrentItem(), this.LIZ.getTabCount() - 1);
                if (iMin != this.LIZ.getSelectedTabPosition()) {
                    C19U1 c19u1 = this.LIZ;
                    c19u1.selectTab(c19u1.getTabAt(iMin));
                }
            }
        }
    }

    public C20587115h7(C19U1 c19u1, C20632315oP c20632315oP, InterfaceC1173910geb interfaceC1173910geb, int i) {
        this.LIZ = c19u1;
        this.LIZIZ = c20632315oP;
        this.LIZJ = interfaceC1173910geb;
    }
}
