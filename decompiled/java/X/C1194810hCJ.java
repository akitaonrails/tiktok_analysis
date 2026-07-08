package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0hCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194810hCJ {
    public final C1846060y8i LIZ;
    public final ViewOnAttachStateChangeListenerC20631115oD LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC1194840hCM LIZLLL;
    public InterfaceC1194850hCN LJ;
    public boolean LJFF;
    public C1166320gSM LJI;
    public C1194830hCL LJII;
    public C1194820hCK LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Rwk, X.0gSM] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0hCL, X.0y8n] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0IeR, X.0hCK] */
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
        if (!(!this.LJFF)) {
            "TabLayoutMediator is already attached".toString();
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        InterfaceC1194850hCN currentOperator = this.LIZIZ.getCurrentOperator();
        this.LJ = currentOperator;
        if (currentOperator == null) {
            "TabLayoutMediator attached before PowerViewPager has an operator".toString();
            throw new IllegalStateException("TabLayoutMediator attached before PowerViewPager has an operator");
        }
        this.LJFF = true;
        final C1846060y8i c1846060y8i = this.LIZ;
        ?? r1 = new AbstractC712240Rwk(c1846060y8i) { // from class: X.0gSM
            public final WeakReference<C1846060y8i> LL;
            public int LLILLL = 0;
            public int LLILLJJLI = 0;

            {
                this.LL = new WeakReference<>(c1846060y8i);
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                this.LLILLJJLI = this.LLILLL;
                this.LLILLL = i;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                boolean z;
                C1846060y8i c1846060y8i2 = this.LL.get();
                if (c1846060y8i2 != null && c1846060y8i2.getSelectedTabPosition() != i && i < c1846060y8i2.getTabCount()) {
                    int i2 = this.LLILLL;
                    if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1846060y8i2.LJIILL(c1846060y8i2.LJII(i), z);
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
                    java.lang.ref.WeakReference<X.0y8i> r0 = r6.LL
                    java.lang.Object r5 = r0.get()
                    X.0y8i r5 = (X.C1846060y8i) r5
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
                    r5.LJIJ(r7, r8, r1, r3)
                L1e:
                    return
                L1f:
                    r1 = 1
                    if (r4 != r2) goto L1a
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1166320gSM.onPageScrolled(int, float, int):void");
            }
        };
        this.LJI = r1;
        this.LIZIZ.registerOnPageChangeCallback(r1);
        final ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LIZIZ;
        ?? r12 = new InterfaceC1846110y8n(viewOnAttachStateChangeListenerC20631115oD) { // from class: X.0hCL
            public final ViewOnAttachStateChangeListenerC20631115oD LIZ;

            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
            }

            {
                this.LIZ = viewOnAttachStateChangeListenerC20631115oD;
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                this.LIZ.setCurrentItem(c1845940y8W.LIZLLL);
            }
        };
        this.LJII = r12;
        this.LIZ.LIZ(r12);
        if (this.LIZJ) {
            ?? r13 = new AbstractC471570IeR() { // from class: X.0hCK
                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                    this.LIZ.LJ();
                }

                @Override // X.AbstractC471570IeR
                public final void LIZIZ(int i, int i2) {
                    LIZJ(i, i2, null);
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    this.LIZ.LIZLLL(i, i2);
                    this.LIZ.LIZIZ();
                }

                @Override // X.AbstractC471570IeR
                public final void LJ(int i, int i2) {
                    this.LIZ.LJFF(i, 1);
                    this.LIZ.LIZLLL(i2, 1);
                    this.LIZ.LIZIZ();
                }

                @Override // X.AbstractC471570IeR
                public final void LJFF(int i, int i2) {
                    this.LIZ.LJFF(i, i2);
                    this.LIZ.LIZIZ();
                }

                @Override // X.AbstractC471570IeR
                public final void LIZJ(int i, int i2, Object obj) {
                    this.LIZ.LJFF(i, i2);
                    this.LIZ.LIZLLL(i, i2);
                    this.LIZ.LIZIZ();
                }
            };
            this.LJIIIIZZ = r13;
            InterfaceC1194850hCN interfaceC1194850hCN = this.LJ;
            if (interfaceC1194850hCN != 0) {
                interfaceC1194850hCN.LJI(r13);
            }
        }
        LJ();
        C1846060y8i c1846060y8i2 = this.LIZ;
        int currentItem = this.LIZIZ.getCurrentItem();
        c1846060y8i2.getClass();
        try {
            c1846060y8i2.LJIJ(currentItem, 0.0f, true, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ() {
        if (this.LIZ.getTabCount() > 0) {
            int tabCount = this.LIZ.getTabCount() - 1;
            int currentItem = this.LIZIZ.getCurrentItem();
            if (currentItem <= tabCount) {
                tabCount = currentItem;
            }
            if (tabCount != this.LIZ.getSelectedTabPosition()) {
                C1846060y8i c1846060y8i = this.LIZ;
                c1846060y8i.LJIILL(c1846060y8i.LJII(tabCount), true);
            }
        }
    }

    public final void LIZJ() {
        InterfaceC1194850hCN interfaceC1194850hCN;
        if (this.LIZJ && (interfaceC1194850hCN = this.LJ) != null) {
            C1194820hCK c1194820hCK = this.LJIIIIZZ;
            if (c1194820hCK == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            interfaceC1194850hCN.LJ(c1194820hCK);
            this.LJIIIIZZ = null;
        }
        C1846060y8i c1846060y8i = this.LIZ;
        C1194830hCL c1194830hCL = this.LJII;
        if (c1194830hCL == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        c1846060y8i.LJIIL(c1194830hCL);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LIZIZ;
        C1166320gSM c1166320gSM = this.LJI;
        if (c1166320gSM == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        viewOnAttachStateChangeListenerC20631115oD.unregisterOnPageChangeCallback(c1166320gSM);
        this.LJII = null;
        this.LJI = null;
        this.LJ = null;
        this.LJFF = false;
    }

    public final void LJ() {
        this.LIZ.LJIIJJI();
        InterfaceC1194850hCN interfaceC1194850hCN = this.LJ;
        if (interfaceC1194850hCN != null) {
            int iLJIIIIZZ = interfaceC1194850hCN.getState().LJIIIIZZ();
            for (int i = 0; i < iLJIIIIZZ; i++) {
                C1845940y8W c1845940y8WLJIIIZ = this.LIZ.LJIIIZ();
                this.LIZLLL.LIZ(c1845940y8WLJIIIZ, i);
                C1846060y8i c1846060y8i = this.LIZ;
                c1846060y8i.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i.LLILZLL.size(), false);
            }
            if (iLJIIIIZZ > 0) {
                int tabCount = this.LIZ.getTabCount() - 1;
                int currentItem = this.LIZIZ.getCurrentItem();
                if (currentItem <= tabCount) {
                    tabCount = currentItem;
                }
                if (tabCount != this.LIZ.getSelectedTabPosition()) {
                    C1846060y8i c1846060y8i2 = this.LIZ;
                    c1846060y8i2.LJIILL(c1846060y8i2.LJII(tabCount), true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[LOOP:0: B:14:0x0026->B:15:0x0028, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r4, int r5) {
        /*
            r3 = this;
            if (r4 < 0) goto L3e
            X.0y8i r0 = r3.LIZ
            int r0 = r0.getTabCount()
            if (r4 > r0) goto L3e
            if (r5 <= 0) goto L3e
            X.0hCN r0 = r3.LJ
            if (r0 != 0) goto L11
            return
        L11:
            X.15jK r0 = r0.getState()
            int r1 = r0.LJIIIIZZ()
            X.0y8i r0 = r3.LIZ
            int r0 = r0.getTabCount()
            int r1 = r1 - r0
            r2 = 0
            if (r1 >= 0) goto L3b
            r1 = 0
        L24:
            r5 = r1
        L25:
            int r5 = r5 + r4
        L26:
            if (r4 >= r5) goto L3e
            X.0y8i r0 = r3.LIZ
            X.0y8W r1 = r0.LJIIIZ()
            X.0hCM r0 = r3.LIZLLL
            r0.LIZ(r1, r4)
            X.0y8i r0 = r3.LIZ
            r0.LIZIZ(r1, r4, r2)
            int r4 = r4 + 1
            goto L26
        L3b:
            if (r1 <= r5) goto L24
            goto L25
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1194810hCJ.LIZLLL(int, int):void");
    }

    public final void LJFF(int i, int i2) {
        if (i < 0) {
            return;
        }
        while (i < this.LIZ.getTabCount() && i2 > 0) {
            this.LIZ.LJIILIIL(i);
            i2--;
        }
    }

    public C1194810hCJ(C1846060y8i c1846060y8i, ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, boolean z, InterfaceC1194840hCM interfaceC1194840hCM) {
        this.LIZ = c1846060y8i;
        this.LIZIZ = viewOnAttachStateChangeListenerC20631115oD;
        this.LIZJ = z;
        this.LIZLLL = interfaceC1194840hCM;
    }
}
