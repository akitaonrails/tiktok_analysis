package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0U3L, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U3L {
    public final C21546719Ub LIZ;
    public final C20632315oP LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC764260TyS LJ;
    public AbstractC21673619ry<?> LJFF;
    public boolean LJI;
    public C480250IsR LJII;
    public C764270TyT LJIIIIZZ;
    public C0U3M LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0IsR, X.0Rwk] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0IeR, X.0U3M] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0TyT, X.15Du] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ() {
        if (this.LJI) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        AbstractC21673619ry<?> adapter = this.LIZIZ.getAdapter();
        this.LJFF = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.LJI = true;
        final C21546719Ub c21546719Ub = this.LIZ;
        ?? r1 = new AbstractC712240Rwk(c21546719Ub) { // from class: X.0IsR
            public final WeakReference<C21546719Ub> LL;
            public int LLILLL = 0;
            public int LLILLJJLI = 0;

            {
                this.LL = new WeakReference<>(c21546719Ub);
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                this.LLILLJJLI = this.LLILLL;
                this.LLILLL = i;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                boolean z;
                C21546719Ub c21546719Ub2 = this.LL.get();
                if (c21546719Ub2 != null && c21546719Ub2.getSelectedTabPosition() != i && i < c21546719Ub2.getTabCount()) {
                    int i2 = this.LLILLL;
                    if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c21546719Ub2.LJIILJJIL(c21546719Ub2.LJIIJ(i), z);
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
                    java.lang.ref.WeakReference<X.19Ub> r0 = r6.LL
                    java.lang.Object r5 = r0.get()
                    X.19Ub r5 = (X.C21546719Ub) r5
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
                throw new UnsupportedOperationException("Method not decompiled: X.C480250IsR.onPageScrolled(int, float, int):void");
            }
        };
        this.LJII = r1;
        this.LIZIZ.LIZIZ(r1);
        final C20632315oP c20632315oP = this.LIZIZ;
        final boolean z = this.LIZLLL;
        ?? r2 = new InterfaceC20485215Du(c20632315oP, z) { // from class: X.0TyT
            public final C20632315oP LIZ;
            public final boolean LIZIZ;

            @Override // X.InterfaceC20485215Du
            public final void LIZ() {
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZLLL(C763970Txz c763970Txz) {
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZIZ(C763970Txz c763970Txz) {
                this.LIZ.LJ(c763970Txz.LJFF, this.LIZIZ);
            }

            {
                this.LIZ = c20632315oP;
                this.LIZIZ = z;
            }
        };
        this.LJIIIIZZ = r2;
        this.LIZ.LIZ(r2);
        if (this.LIZJ) {
            ?? r12 = new AbstractC471570IeR() { // from class: X.0U3M
                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                    this.LIZ.LIZJ();
                }

                @Override // X.AbstractC471570IeR
                public final void LIZIZ(int i, int i2) {
                    this.LIZ.LIZJ();
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    this.LIZ.LIZJ();
                }

                @Override // X.AbstractC471570IeR
                public final void LJ(int i, int i2) {
                    this.LIZ.LIZJ();
                }

                @Override // X.AbstractC471570IeR
                public final void LJFF(int i, int i2) {
                    this.LIZ.LIZJ();
                }

                @Override // X.AbstractC471570IeR
                public final void LIZJ(int i, int i2, Object obj) {
                    this.LIZ.LIZJ();
                }
            };
            this.LJIIIZ = r12;
            this.LJFF.registerAdapterDataObserver(r12);
        }
        LIZJ();
        this.LIZ.LJIILLIIL(this.LIZIZ.getCurrentItem(), 0.0f, true, true);
    }

    public final void LIZIZ() {
        AbstractC21673619ry<?> abstractC21673619ry;
        if (this.LIZJ && (abstractC21673619ry = this.LJFF) != null) {
            abstractC21673619ry.unregisterAdapterDataObserver(this.LJIIIZ);
            this.LJIIIZ = null;
        }
        this.LIZ.LLLFZ.remove(this.LJIIIIZZ);
        this.LIZIZ.LJI(this.LJII);
        this.LJIIIIZZ = null;
        this.LJII = null;
        this.LJFF = null;
        this.LJI = false;
    }

    public final void LIZJ() {
        this.LIZ.LJIILIIL();
        AbstractC21673619ry<?> abstractC21673619ry = this.LJFF;
        if (abstractC21673619ry != null) {
            int itemCount = abstractC21673619ry.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C763970Txz c763970TxzLJIIJJI = this.LIZ.LJIIJJI();
                this.LJ.LIZ(c763970TxzLJIIJJI, i);
                C21546719Ub c21546719Ub = this.LIZ;
                c21546719Ub.LIZIZ(c21546719Ub.LL.size(), c763970TxzLJIIJJI, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.LIZIZ.getCurrentItem(), this.LIZ.getTabCount() - 1);
                if (iMin != this.LIZ.getSelectedTabPosition()) {
                    C21546719Ub c21546719Ub2 = this.LIZ;
                    c21546719Ub2.LJIILJJIL(c21546719Ub2.LJIIJ(iMin), true);
                }
            }
        }
    }

    public C0U3L(C21546719Ub c21546719Ub, C20632315oP c20632315oP, boolean z, InterfaceC764260TyS interfaceC764260TyS) {
        this(c21546719Ub, c20632315oP, z, true, interfaceC764260TyS);
    }

    public C0U3L(C21546719Ub c21546719Ub, C20632315oP c20632315oP, boolean z, boolean z2, InterfaceC764260TyS interfaceC764260TyS) {
        this.LIZ = c21546719Ub;
        this.LIZIZ = c20632315oP;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = interfaceC764260TyS;
    }
}
