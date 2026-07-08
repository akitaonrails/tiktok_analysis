package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19O9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19O9 extends C19O7 {
    public int LJI;
    public int LJII;
    public final C21530719Nx LIZIZ = new C21530719Nx(this);
    public final C19OB LIZJ = new C19OB(this);
    public C19O0 LIZLLL = null;
    public boolean LJ = false;
    public final C21531219Oc LJFF = new C21531219Oc();
    public int LJIIIIZZ = 0;
    public int LJIIIZ = 0;
    public C19OS[] LJIIJ = new C19OS[4];
    public C19OS[] LJIIJJI = new C19OS[4];
    public int LJIIL = 257;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public WeakReference<C19OG> LJIILL = null;
    public WeakReference<C19OG> LJIILLIIL = null;
    public WeakReference<C19OG> LJIIZILJ = null;
    public WeakReference<C19OG> LJIJ = null;
    public final C21530919Nz LJIJI = new C21530919Nz();

    /* JADX WARN: Removed duplicated region for block: B:316:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0730 A[LOOP:32: B:411:0x072e->B:412:0x0730, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x07f2  */
    @Override // X.C19O7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 2105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19O9.LIZLLL():void");
    }

    @Override // X.C19OA
    public final String getType() {
        return "ConstraintLayout";
    }

    @Override // X.C19O7, X.C19OA
    public final void reset() {
        this.LJFF.LJIJI();
        this.LJI = 0;
        this.LJII = 0;
        super.reset();
    }

    public final void LJFF(C21531219Oc c21531219Oc) {
        int i;
        boolean zLJIIL = LJIIL(64);
        addToSolver(c21531219Oc, zLJIIL);
        int size = this.LIZ.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C19OA c19oa = (C19OA) ListProtector.get(this.LIZ, i2);
            c19oa.setInBarrier(0, false);
            c19oa.setInBarrier(1, false);
            if (c19oa instanceof C19OH) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C19OA c19oa2 = (C19OA) ListProtector.get(this.LIZ, i3);
                if (c19oa2 instanceof C19OH) {
                    C19OH c19oh = (C19OH) c19oa2;
                    for (int i4 = 0; i4 < c19oh.LIZIZ; i4++) {
                        C19OA c19oa3 = c19oh.LIZ[i4];
                        int i5 = c19oh.LIZJ;
                        if (i5 != 0 && i5 != 1) {
                            if (i5 == 2 || i5 == 3) {
                                c19oa3.setInBarrier(1, true);
                            }
                        } else {
                            c19oa3.setInBarrier(0, true);
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C19OA c19oa4 = (C19OA) ListProtector.get(this.LIZ, i6);
            if (c19oa4.addFirst()) {
                c19oa4.addToSolver(c21531219Oc, zLJIIL);
            }
        }
        if (C21531219Oc.LJIILL) {
            HashSet<C19OA> hashSet = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                C19OA c19oa5 = (C19OA) ListProtector.get(this.LIZ, i7);
                if (!c19oa5.addFirst()) {
                    hashSet.add(c19oa5);
                }
            }
            if (getHorizontalDimensionBehaviour() == C19O3.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            addChildrenToSolverByDependency(this, c21531219Oc, hashSet, i, false);
            for (C19OA c19oa6 : hashSet) {
                C19OP.LIZ(this, c21531219Oc, c19oa6);
                c19oa6.addToSolver(c21531219Oc, zLJIIL);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C19OA c19oa7 = (C19OA) ListProtector.get(this.LIZ, i8);
                if (c19oa7 instanceof C19O9) {
                    C19O3[] c19o3Arr = c19oa7.mListDimensionBehaviors;
                    C19O3 c19o3 = c19o3Arr[0];
                    C19O3 c19o32 = c19o3Arr[1];
                    C19O3 c19o33 = C19O3.WRAP_CONTENT;
                    if (c19o3 == c19o33) {
                        c19oa7.setHorizontalDimensionBehaviour(C19O3.FIXED);
                    }
                    if (c19o32 == c19o33) {
                        c19oa7.setVerticalDimensionBehaviour(C19O3.FIXED);
                    }
                    c19oa7.addToSolver(c21531219Oc, zLJIIL);
                    if (c19o3 == c19o33) {
                        c19oa7.setHorizontalDimensionBehaviour(c19o3);
                    }
                    if (c19o32 == c19o33) {
                        c19oa7.setVerticalDimensionBehaviour(c19o32);
                    }
                } else {
                    C19OP.LIZ(this, c21531219Oc, c19oa7);
                    if (!c19oa7.addFirst()) {
                        c19oa7.addToSolver(c21531219Oc, zLJIIL);
                    }
                }
            }
        }
        if (this.LJIIIIZZ > 0) {
            C19OJ.LIZ(this, c21531219Oc, null, 0);
        }
        if (this.LJIIIZ > 0) {
            C19OJ.LIZ(this, c21531219Oc, null, 1);
        }
    }

    public final void LJI(C19OG c19og) {
        WeakReference<C19OG> weakReference = this.LJIJ;
        if (weakReference == null || weakReference.get() == null || c19og.LIZLLL() > this.LJIJ.get().LIZLLL()) {
            this.LJIJ = new WeakReference<>(c19og);
        }
    }

    public final void LJII(C19OG c19og) {
        WeakReference<C19OG> weakReference = this.LJIIZILJ;
        if (weakReference == null || weakReference.get() == null || c19og.LIZLLL() > this.LJIIZILJ.get().LIZLLL()) {
            this.LJIIZILJ = new WeakReference<>(c19og);
        }
    }

    public final void LJIIIIZZ(C19OG c19og) {
        WeakReference<C19OG> weakReference = this.LJIILL;
        if (weakReference == null || weakReference.get() == null || c19og.LIZLLL() > this.LJIILL.get().LIZLLL()) {
            this.LJIILL = new WeakReference<>(c19og);
        }
    }

    public final boolean LJIIL(int i) {
        if ((this.LJIIL & i) == i) {
            return true;
        }
        return false;
    }

    public final void LJ(C19OA c19oa, int i) {
        if (i == 0) {
            int i2 = this.LJIIIIZZ + 1;
            C19OS[] c19osArr = this.LJIIJJI;
            if (i2 >= c19osArr.length) {
                this.LJIIJJI = (C19OS[]) Arrays.copyOf(c19osArr, c19osArr.length * 2);
            }
            C19OS[] c19osArr2 = this.LJIIJJI;
            int i3 = this.LJIIIIZZ;
            c19osArr2[i3] = new C19OS(c19oa, 0, this.LJ);
            this.LJIIIIZZ = i3 + 1;
            return;
        }
        if (i != 1) {
            return;
        }
        int i4 = this.LJIIIZ + 1;
        C19OS[] c19osArr3 = this.LJIIJ;
        if (i4 >= c19osArr3.length) {
            this.LJIIJ = (C19OS[]) Arrays.copyOf(c19osArr3, c19osArr3.length * 2);
        }
        C19OS[] c19osArr4 = this.LJIIJ;
        int i5 = this.LJIIIZ;
        c19osArr4[i5] = new C19OS(c19oa, 1, this.LJ);
        this.LJIIIZ = i5 + 1;
    }

    public final boolean LJIIIZ(int i, boolean z) {
        C19O3 c19o3;
        boolean z2;
        C19O3 c19o32;
        C19O3 c19o33;
        C19OB c19ob = this.LIZJ;
        boolean z3 = true;
        boolean z4 = z & true;
        C19O3 dimensionBehaviour = c19ob.LIZ.getDimensionBehaviour(0);
        C19O3 dimensionBehaviour2 = c19ob.LIZ.getDimensionBehaviour(1);
        int x = c19ob.LIZ.getX();
        int y = c19ob.LIZ.getY();
        if (z4 && (dimensionBehaviour == (c19o33 = C19O3.WRAP_CONTENT) || dimensionBehaviour2 == c19o33)) {
            Iterator<C19OF> it2 = c19ob.LJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C19OF next = it2.next();
                if (next.LJFF == i && !next.LJIIJ()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && dimensionBehaviour == C19O3.WRAP_CONTENT) {
                    c19ob.LIZ.setHorizontalDimensionBehaviour(C19O3.FIXED);
                    C19O9 c19o9 = c19ob.LIZ;
                    c19o9.setWidth(c19ob.LIZLLL(c19o9, 0));
                    C19O9 c19o92 = c19ob.LIZ;
                    c19o92.horizontalRun.LJ.LIZLLL(c19o92.getWidth());
                }
                C19O9 c19o93 = c19ob.LIZ;
                c19o32 = c19o93.mListDimensionBehaviors[0];
                if (c19o32 != C19O3.FIXED) {
                }
                int width = c19o93.getWidth() + x;
                c19ob.LIZ.horizontalRun.LJIIIIZZ.LIZLLL(width);
                c19ob.LIZ.horizontalRun.LJ.LIZLLL(width - x);
                z2 = true;
            } else {
                if (z4 && dimensionBehaviour2 == C19O3.WRAP_CONTENT) {
                    c19ob.LIZ.setVerticalDimensionBehaviour(C19O3.FIXED);
                    C19O9 c19o94 = c19ob.LIZ;
                    c19o94.setHeight(c19ob.LIZLLL(c19o94, 1));
                    C19O9 c19o95 = c19ob.LIZ;
                    c19o95.verticalRun.LJ.LIZLLL(c19o95.getHeight());
                }
                C19O9 c19o96 = c19ob.LIZ;
                c19o3 = c19o96.mListDimensionBehaviors[1];
                if (c19o3 != C19O3.FIXED) {
                }
                int height = c19o96.getHeight() + y;
                c19ob.LIZ.verticalRun.LJIIIIZZ.LIZLLL(height);
                c19ob.LIZ.verticalRun.LJ.LIZLLL(height - y);
                z2 = true;
            }
        } else if (i == 0) {
            C19O9 c19o932 = c19ob.LIZ;
            c19o32 = c19o932.mListDimensionBehaviors[0];
            if (c19o32 != C19O3.FIXED || c19o32 == C19O3.MATCH_PARENT) {
                int width2 = c19o932.getWidth() + x;
                c19ob.LIZ.horizontalRun.LJIIIIZZ.LIZLLL(width2);
                c19ob.LIZ.horizontalRun.LJ.LIZLLL(width2 - x);
                z2 = true;
            }
            z2 = false;
        } else {
            C19O9 c19o962 = c19ob.LIZ;
            c19o3 = c19o962.mListDimensionBehaviors[1];
            if (c19o3 != C19O3.FIXED || c19o3 == C19O3.MATCH_PARENT) {
                int height2 = c19o962.getHeight() + y;
                c19ob.LIZ.verticalRun.LJIIIIZZ.LIZLLL(height2);
                c19ob.LIZ.verticalRun.LJ.LIZLLL(height2 - y);
                z2 = true;
            }
            z2 = false;
        }
        c19ob.LJI();
        for (C19OF c19of : c19ob.LJ) {
            if (c19of.LJFF == i && (c19of.LIZIZ != c19ob.LIZ || c19of.LJI)) {
                c19of.LJ();
            }
        }
        for (C19OF c19of2 : c19ob.LJ) {
            if (c19of2.LJFF == i && (z2 || c19of2.LIZIZ != c19ob.LIZ)) {
                if (!c19of2.LJII.LJIIIZ || !c19of2.LJIIIIZZ.LJIIIZ || (!(c19of2 instanceof C19OC) && !c19of2.LJ.LJIIIZ)) {
                    z3 = false;
                    break;
                }
            }
        }
        c19ob.LIZ.setHorizontalDimensionBehaviour(dimensionBehaviour);
        c19ob.LIZ.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    @Override // X.C19OA
    public final void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            ((C19OA) ListProtector.get(this.LIZ, i)).updateFromRuns(z, z2);
        }
    }

    public static void LJIIJJI(C19OA c19oa, C19O0 c19o0, C21530919Nz c21530919Nz) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (c19o0 == null) {
            return;
        }
        c21530919Nz.LIZ = c19oa.getHorizontalDimensionBehaviour();
        c21530919Nz.LIZIZ = c19oa.getVerticalDimensionBehaviour();
        c21530919Nz.LIZJ = c19oa.getWidth();
        c21530919Nz.LIZLLL = c19oa.getHeight();
        c21530919Nz.LJIIIIZZ = false;
        c21530919Nz.LJIIIZ = 0;
        C19O3 c19o3 = c21530919Nz.LIZ;
        C19O3 c19o32 = C19O3.MATCH_CONSTRAINT;
        if (c19o3 == c19o32) {
            z = true;
        } else {
            z = false;
        }
        if (c21530919Nz.LIZIZ == c19o32) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c19oa.mDimensionRatio > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && c19oa.mDimensionRatio > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z && c19oa.hasDanglingDimension(0) && c19oa.mMatchConstraintDefaultWidth == 0 && !z3) {
            c21530919Nz.LIZ = C19O3.WRAP_CONTENT;
            if (z2 && c19oa.mMatchConstraintDefaultHeight == 0) {
                c21530919Nz.LIZ = C19O3.FIXED;
            }
            z = false;
        }
        if (z2 && c19oa.hasDanglingDimension(1) && c19oa.mMatchConstraintDefaultHeight == 0 && !z4) {
            c21530919Nz.LIZIZ = C19O3.WRAP_CONTENT;
            if (z && c19oa.mMatchConstraintDefaultWidth == 0) {
                c21530919Nz.LIZIZ = C19O3.FIXED;
            }
            z2 = false;
        }
        if (c19oa.isResolvedHorizontally()) {
            c21530919Nz.LIZ = C19O3.FIXED;
            z = false;
        }
        if (c19oa.isResolvedVertically()) {
            c21530919Nz.LIZIZ = C19O3.FIXED;
            z2 = false;
        }
        if (z3) {
            if (c19oa.mResolvedMatchConstraintDefault[0] == 4) {
                c21530919Nz.LIZ = C19O3.FIXED;
            } else if (!z2) {
                C19O3 c19o33 = c21530919Nz.LIZIZ;
                C19O3 c19o34 = C19O3.FIXED;
                if (c19o33 == c19o34) {
                    i2 = c21530919Nz.LIZLLL;
                } else {
                    c21530919Nz.LIZ = C19O3.WRAP_CONTENT;
                    c19o0.LIZIZ(c19oa, c21530919Nz);
                    i2 = c21530919Nz.LJFF;
                }
                c21530919Nz.LIZ = c19o34;
                int i3 = c19oa.mDimensionRatioSide;
                if (i3 != 0 && i3 != -1) {
                    c21530919Nz.LIZJ = (int) (c19oa.mDimensionRatio / i2);
                } else {
                    c21530919Nz.LIZJ = (int) (c19oa.mDimensionRatio * i2);
                }
            }
        }
        if (z4) {
            if (c19oa.mResolvedMatchConstraintDefault[1] == 4) {
                c21530919Nz.LIZIZ = C19O3.FIXED;
            } else if (!z) {
                C19O3 c19o35 = c21530919Nz.LIZ;
                C19O3 c19o36 = C19O3.FIXED;
                if (c19o35 == c19o36) {
                    i = c21530919Nz.LIZJ;
                } else {
                    c21530919Nz.LIZIZ = C19O3.WRAP_CONTENT;
                    c19o0.LIZIZ(c19oa, c21530919Nz);
                    i = c21530919Nz.LJ;
                }
                c21530919Nz.LIZIZ = c19o36;
                int i4 = c19oa.mDimensionRatioSide;
                if (i4 != 0 && i4 != -1) {
                    c21530919Nz.LIZLLL = (int) (i * c19oa.mDimensionRatio);
                } else {
                    c21530919Nz.LIZLLL = (int) (i / c19oa.mDimensionRatio);
                }
            }
        }
        c19o0.LIZIZ(c19oa, c21530919Nz);
        c19oa.setWidth(c21530919Nz.LJ);
        c19oa.setHeight(c21530919Nz.LJFF);
        c19oa.hasBaseline = c21530919Nz.LJII;
        c19oa.setBaselineDistance(c21530919Nz.LJI);
        c21530919Nz.LJIIIZ = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(int r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19O9.LJIIJ(int, int, int, int, int, int, int):void");
    }
}
