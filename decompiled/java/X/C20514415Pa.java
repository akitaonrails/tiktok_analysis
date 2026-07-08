package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC1294060jmO
public final class C20514415Pa {
    public final C19Y3 LIZ;
    public final C20632315oP LIZIZ;
    public final InterfaceC1206470hV7 LIZJ;
    public AbstractC21673619ry<?> LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (!(!this.LJ)) {
            "TabLayoutMediator is already attached".toString();
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        AbstractC21673619ry<?> adapter = this.LIZIZ.getAdapter();
        this.LIZLLL = adapter;
        if (adapter == null) {
            "TabLayoutMediator attached before ViewPager2 has an adapter".toString();
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.LJ = true;
        final C19Y3 c19y3 = this.LIZ;
        this.LIZIZ.LIZIZ(new AbstractC712240Rwk(c19y3) { // from class: X.15Pb
            public final WeakReference<C19Y3> LL;
            public int LLILLL = 0;
            public int LLILLJJLI = 0;

            {
                this.LL = new WeakReference<>(c19y3);
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                this.LLILLJJLI = this.LLILLL;
                this.LLILLL = i;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                boolean z;
                C19Y3 c19y32 = this.LL.get();
                if (c19y32 != null && c19y32.getSelectedTabPosition() != i && i < c19y32.getTabCount()) {
                    int i2 = this.LLILLL;
                    if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c19y32.LJIILIIL(c19y32.LJIIIZ(i), z);
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
                    java.lang.ref.WeakReference<X.19Y3> r0 = r6.LL
                    java.lang.Object r5 = r0.get()
                    X.19Y3 r5 = (X.C19Y3) r5
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
                    r5.LJIILL(r7, r8, r1, r3)
                L1e:
                    return
                L1f:
                    r1 = 1
                    if (r4 != r2) goto L1a
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20514515Pb.onPageScrolled(int, float, int):void");
            }
        });
        final C20632315oP c20632315oP = this.LIZIZ;
        final boolean z = false;
        this.LIZ.LIZIZ(new InterfaceC20516715Px(c20632315oP, z) { // from class: X.15PZ
            public final C20632315oP LIZ;
            public final boolean LIZIZ;

            @Override // X.InterfaceC20516715Px
            public final void LIZ(C19Y5 c19y5) {
            }

            @Override // X.InterfaceC20516715Px
            public final void LIZIZ(C19Y5 c19y5) {
            }

            @Override // X.InterfaceC20516715Px
            public final void LIZJ(C19Y5 c19y5) {
                boolean z2;
                C20632315oP c20632315oP2 = this.LIZ;
                int i = c19y5.LJ;
                if (c20632315oP2.getCurrentItem() != c19y5.LJ && !this.LIZIZ) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c20632315oP2.LJ(i, z2);
            }

            {
                this.LIZ = c20632315oP;
                this.LIZIZ = z;
            }
        });
        AbstractC471570IeR abstractC471570IeR = new AbstractC471570IeR() { // from class: X.15Pc
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
                if (!Intrinsics.LJFF(obj, "TabsNotChanged")) {
                    this.LIZ.LIZIZ();
                }
            }
        };
        AbstractC21673619ry<?> abstractC21673619ry = this.LIZLLL;
        if (abstractC21673619ry != null) {
            abstractC21673619ry.registerAdapterDataObserver(abstractC471570IeR);
        }
        LIZIZ();
        this.LIZ.LJIILL(this.LIZIZ.getCurrentItem(), 0.0f, true, true);
    }

    public final void LIZIZ() {
        this.LIZ.LJIIL();
        AbstractC21673619ry<?> abstractC21673619ry = this.LIZLLL;
        if (abstractC21673619ry != null) {
            int itemCount = abstractC21673619ry.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C19Y3 c19y3 = this.LIZ;
                C19Y5 c19y5LJIIJ = c19y3.LJIIJ(c19y3.LLJJJ);
                this.LIZJ.LIZ(c19y5LJIIJ, i);
                this.LIZ.LIZJ(c19y5LJIIJ, false);
            }
            if (itemCount > 0) {
                int tabCount = this.LIZ.getTabCount() - 1;
                int currentItem = this.LIZIZ.getCurrentItem();
                if (currentItem <= tabCount) {
                    tabCount = currentItem;
                }
                if (tabCount != this.LIZ.getSelectedTabPosition()) {
                    C19Y3 c19y32 = this.LIZ;
                    c19y32.LJIILIIL(c19y32.LJIIIZ(tabCount), true);
                }
            }
        }
    }

    public C20514415Pa(C19Y3 c19y3, C20632315oP c20632315oP, boolean z, InterfaceC1206470hV7 interfaceC1206470hV7) {
        this.LIZ = c19y3;
        this.LIZIZ = c20632315oP;
        this.LIZJ = interfaceC1206470hV7;
    }
}
