package X;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0kPN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1318230kPN implements Runnable {
    public final C1312490kG7 LL;
    public InterfaceC1318490kPn LLILLJJLI;
    public int LLILLL = 1;
    public int LLILZ;
    public ChoreographerFrameCallbackC1318270kPR LLILZIL;
    public C1318240kPO LLILZLL;

    public final void LIZLLL() {
        int i;
        if (!this.LL.LIZIZ()) {
            LJII(true);
            return;
        }
        C1318240kPO c1318240kPO = this.LLILZLL;
        int i2 = 0;
        if (c1318240kPO.LLILLL) {
            i = 0;
            C1312480kG6 c1312480kG6 = this.LL.LIZJ;
            i2 = c1312480kG6.LIZIZ - c1312480kG6.LIZJ;
        } else {
            C1312480kG6 c1312480kG62 = this.LL.LIZIZ;
            i = c1312480kG62.LIZIZ - c1312480kG62.LIZJ;
        }
        c1318240kPO.LJIIJ(i, i2, this.LLILLL, null);
        LJFF();
    }

    public final void LJFF() {
        C1318240kPO c1318240kPO = this.LLILZLL;
        c1318240kPO.getView();
        HandlerHook.viewRemoveCallbacks(c1318240kPO, this);
        C1318240kPO c1318240kPO2 = this.LLILZLL;
        c1318240kPO2.getView();
        c1318240kPO2.postOnAnimation(this);
    }

    public final void LJIIIIZZ() {
        if (this.LLILZIL != null) {
            C786410Ut5.v2().removeFrameCallback(this.LLILZIL);
            this.LLILZIL = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LynxBaseScrollViewScroller@5037.run");
        try {
            LIZLLL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxBaseScrollViewScroller@5037.run");
    }

    public RunnableC1318230kPN(Context context) {
        this.LL = new C1312490kG7(context, new Interpolator() { // from class: X.0kPc
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        });
    }

    public final void LJII(boolean z) {
        C1318240kPO c1318240kPO = this.LLILZLL;
        c1318240kPO.getView();
        HandlerHook.viewRemoveCallbacks(c1318240kPO, this);
        this.LL.LIZ();
        InterfaceC1318490kPn interfaceC1318490kPn = this.LLILLJJLI;
        if (interfaceC1318490kPn != null) {
            this.LLILLJJLI = null;
            interfaceC1318490kPn.LIZ(z);
        }
    }

    public static int[] LIZJ(InterfaceC1318410kPf interfaceC1318410kPf, boolean z, boolean z2) {
        int scrollOffsetHorizontally;
        int backwardNestedScrollMode;
        int[] iArrLIZIZ = interfaceC1318410kPf.LIZIZ(z2);
        if (z2) {
            scrollOffsetHorizontally = interfaceC1318410kPf.getScrollOffsetVertically();
        } else {
            scrollOffsetHorizontally = interfaceC1318410kPf.getScrollOffsetHorizontally();
        }
        InterfaceC1318410kPf interfaceC1318410kPfN = interfaceC1318410kPf.N();
        if (z) {
            backwardNestedScrollMode = interfaceC1318410kPf.getForwardNestedScrollMode();
        } else {
            backwardNestedScrollMode = interfaceC1318410kPf.getBackwardNestedScrollMode();
        }
        if (backwardNestedScrollMode != 1) {
            if (backwardNestedScrollMode != 2) {
                if (backwardNestedScrollMode == 3 && interfaceC1318410kPfN != null) {
                    int[] iArrLIZJ = LIZJ(interfaceC1318410kPfN, z, z2);
                    iArrLIZIZ[0] = Math.max(iArrLIZIZ[0], iArrLIZJ[0]);
                    iArrLIZIZ[1] = Math.max(iArrLIZIZ[1], iArrLIZJ[1]);
                }
            } else if (interfaceC1318410kPfN != null) {
                int[] iArrLIZJ2 = LIZJ(interfaceC1318410kPfN, z, z2);
                iArrLIZIZ[0] = iArrLIZIZ[0] + iArrLIZJ2[0];
                iArrLIZIZ[1] = iArrLIZIZ[1] + iArrLIZJ2[1];
            }
        } else if (interfaceC1318410kPfN != null) {
            int[] iArrLIZJ3 = LIZJ(interfaceC1318410kPfN, z, z2);
            iArrLIZIZ[0] = iArrLIZIZ[0] + iArrLIZJ3[0];
            iArrLIZIZ[1] = iArrLIZIZ[1] + iArrLIZJ3[1];
        }
        return new int[]{iArrLIZIZ[0] - scrollOffsetHorizontally, iArrLIZIZ[1] - scrollOffsetHorizontally};
    }

    public final void LIZ(int i, int i2, InterfaceC1318490kPn interfaceC1318490kPn) {
        LJII(false);
        C1312490kG7 c1312490kG7 = this.LL;
        int scrollX = this.LLILZLL.getScrollX();
        int scrollY = this.LLILZLL.getScrollY();
        int scrollX2 = i - this.LLILZLL.getScrollX();
        int scrollY2 = i2 - this.LLILZLL.getScrollY();
        c1312490kG7.LIZ = 0;
        C1312480kG6 c1312480kG6 = c1312490kG7.LIZIZ;
        c1312480kG6.LJIIJJI = false;
        c1312480kG6.LIZ = scrollX;
        c1312480kG6.LIZJ = scrollX;
        c1312480kG6.LIZIZ = scrollX;
        c1312480kG6.LIZLLL = scrollX + scrollX2;
        c1312480kG6.LJII = AnimationUtils.currentAnimationTimeMillis();
        c1312480kG6.LJIIIIZZ = 250;
        c1312480kG6.LJI = 0.0f;
        c1312480kG6.LJ = 0;
        C1312480kG6 c1312480kG62 = c1312490kG7.LIZJ;
        c1312480kG62.LJIIJJI = false;
        c1312480kG62.LIZ = scrollY;
        c1312480kG62.LIZJ = scrollY;
        c1312480kG62.LIZIZ = scrollY;
        c1312480kG62.LIZLLL = scrollY + scrollY2;
        c1312480kG62.LJII = AnimationUtils.currentAnimationTimeMillis();
        c1312480kG62.LJIIIIZZ = 250;
        c1312480kG62.LJI = 0.0f;
        c1312480kG62.LJ = 0;
        this.LLILLJJLI = interfaceC1318490kPn;
        this.LLILLL = 1;
        LJFF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r19, int r20, X.InterfaceC1318490kPn r21) {
        /*
            r18 = this;
            r5 = 0
            r2 = r18
            r2.LJII(r5)
            X.0kPO r1 = r2.LLILZLL
            boolean r0 = r1.LLILLL
            r3 = 1
            if (r0 == 0) goto Lc4
            r0 = 2
        Le:
            r1.startNestedScroll(r0, r3)
            X.0kPO r0 = r2.LLILZLL
            int[] r9 = r0.getScrollOffset()
            X.0kPO r0 = r2.LLILZLL
            r0.getScrollRange()
            X.0kPO r1 = r2.LLILZLL
            boolean r4 = r1.LLILLL
            r0 = r21
            r2.LLILLJJLI = r0
            r12 = r9[r5]
            r14 = r9[r3]
            r11 = r20
            r10 = r19
            if (r4 == 0) goto Lbd
            if (r11 <= 0) goto Lc1
        L30:
            r0 = 1
        L31:
            int[] r8 = LIZJ(r1, r0, r4)
            X.0kPO r0 = r2.LLILZLL
            X.0kPV r0 = r0.LLJILJILJ
            android.view.ViewParent r0 = r0.LIZ(r3)
            if (r0 == 0) goto L7b
            X.0kPO r0 = r2.LLILZLL
            X.0kPf r6 = r0.N()
            if (r4 == 0) goto Lbb
            r7 = r11
        L48:
            if (r7 == 0) goto L7b
            boolean r0 = r6 instanceof X.InterfaceC1318410kPf
            if (r0 == 0) goto L7b
            r0 = r6
            X.0kPM r0 = (X.C1318220kPM) r0
            boolean r1 = r0.LLILLL
            if (r1 == 0) goto Lb6
            if (r11 <= 0) goto Lb9
        L57:
            r0 = 1
        L58:
            int[] r6 = LIZJ(r6, r0, r1)
            if (r7 <= 0) goto Laf
            X.0kPO r0 = r2.LLILZLL
            int r1 = r0.getForwardNestedScrollMode()
        L64:
            r0 = 3
            if (r1 != r0) goto L7b
            r1 = r8[r5]
            r0 = r6[r5]
            int r0 = java.lang.Math.min(r1, r0)
            r8[r5] = r0
            r1 = r8[r3]
            r0 = r6[r3]
            int r0 = java.lang.Math.max(r1, r0)
            r8[r3] = r0
        L7b:
            if (r4 == 0) goto La5
            r14 = r8[r5]
            r0 = r9[r3]
            int r14 = r14 + r0
            r15 = r8[r3]
            int r15 = r15 + r0
            r13 = r12
        L86:
            X.0kG7 r7 = r2.LL
            X.0kPO r0 = r2.LLILZLL
            int r8 = r0.getScrollX()
            X.0kPO r0 = r2.LLILZLL
            int r9 = r0.getScrollY()
            r16 = 2147483647(0x7fffffff, float:NaN)
            r17 = r16
            r7.LIZJ(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 2147483632(0x7ffffff0, float:NaN)
            r2.LLILLL = r0
            r2.LJFF()
            return
        La5:
            r12 = r8[r5]
            r0 = r9[r5]
            int r12 = r12 + r0
            r13 = r8[r3]
            int r13 = r13 + r0
            r15 = r14
            goto L86
        Laf:
            X.0kPO r0 = r2.LLILZLL
            int r1 = r0.getBackwardNestedScrollMode()
            goto L64
        Lb6:
            if (r10 <= 0) goto Lb9
            goto L57
        Lb9:
            r0 = 0
            goto L58
        Lbb:
            r7 = r10
            goto L48
        Lbd:
            if (r10 <= 0) goto Lc1
            goto L30
        Lc1:
            r0 = 0
            goto L31
        Lc4:
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1318230kPN.LJ(int, int, X.0kPn):void");
    }

    public final boolean LJIIIZ(InterfaceC1318410kPf interfaceC1318410kPf, boolean z, InterfaceC1318490kPn interfaceC1318490kPn) {
        int scrollOffsetHorizontally;
        int[] scrollRangeHorizontally;
        if (interfaceC1318410kPf.LIZLLL()) {
            if (z) {
                scrollOffsetHorizontally = interfaceC1318410kPf.getScrollOffsetVertically();
                scrollRangeHorizontally = interfaceC1318410kPf.getScrollRangeVertically();
            } else {
                scrollOffsetHorizontally = interfaceC1318410kPf.getScrollOffsetHorizontally();
                scrollRangeHorizontally = interfaceC1318410kPf.getScrollRangeHorizontally();
            }
            if (interfaceC1318410kPf.LIZ(scrollOffsetHorizontally, scrollRangeHorizontally)) {
                LIZIZ(interfaceC1318410kPf, -10000, z, interfaceC1318490kPn);
                return true;
            }
            if (interfaceC1318410kPf.LIZJ(scrollOffsetHorizontally, scrollRangeHorizontally)) {
                LIZIZ(interfaceC1318410kPf, 10000, z, interfaceC1318490kPn);
                return true;
            }
            return false;
        }
        InterfaceC1318410kPf interfaceC1318410kPfN = interfaceC1318410kPf.N();
        if (interfaceC1318410kPfN != null) {
            return LJIIIZ(interfaceC1318410kPfN, z, interfaceC1318490kPn);
        }
        return false;
    }

    public final void LIZIZ(InterfaceC1318320kPW interfaceC1318320kPW, int i, boolean z, InterfaceC1318490kPn interfaceC1318490kPn) {
        int i2;
        int scrollOffsetHorizontally;
        int[] scrollRangeHorizontally;
        int i3;
        int i4;
        int i5 = i;
        LJII(false);
        if (this.LLILZLL.LLILLL) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        interfaceC1318320kPW.startNestedScroll(i2, 1);
        if (z) {
            scrollOffsetHorizontally = interfaceC1318320kPW.getScrollOffsetVertically();
            scrollRangeHorizontally = interfaceC1318320kPW.getScrollRangeVertically();
        } else {
            scrollOffsetHorizontally = interfaceC1318320kPW.getScrollOffsetHorizontally();
            scrollRangeHorizontally = interfaceC1318320kPW.getScrollRangeHorizontally();
        }
        this.LLILLJJLI = interfaceC1318490kPn;
        if (i5 >= 0) {
            C1312490kG7 c1312490kG7 = this.LL;
            int scrollX = interfaceC1318320kPW.getScrollX();
            int scrollY = interfaceC1318320kPW.getScrollY();
            if (z) {
                i4 = 0;
            } else {
                i4 = i5;
                i5 = 0;
            }
            c1312490kG7.LIZJ(scrollX, scrollY, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, (-scrollOffsetHorizontally) - scrollRangeHorizontally[0], 0);
        } else {
            C1312490kG7 c1312490kG72 = this.LL;
            int scrollX2 = interfaceC1318320kPW.getScrollX();
            int scrollY2 = interfaceC1318320kPW.getScrollY();
            if (z) {
                i3 = 0;
            } else {
                i3 = i5;
                i5 = 0;
            }
            c1312490kG72.LIZJ(scrollX2, scrollY2, i3, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, scrollOffsetHorizontally - scrollRangeHorizontally[1]);
        }
        this.LLILLL = 2147483634;
        LJFF();
    }
}
