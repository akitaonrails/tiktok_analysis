package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0kPO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318240kPO extends C1318250kPP implements InterfaceC1318410kPf {
    public final C1318310kPV LLJILJILJ;
    public final C1317550kOH LLJILLL;
    public int LLJJ;
    public int LLJJI;

    @Override // X.InterfaceC1318410kPf
    public final InterfaceC1318410kPf N() {
        ViewParent viewParentLIZ = this.LLJILJILJ.LIZ(1);
        if (viewParentLIZ instanceof InterfaceC1318410kPf) {
            return (InterfaceC1318410kPf) viewParentLIZ;
        }
        return null;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJILLL;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLJILJILJ.LIZ(0) != null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLJILJILJ.LIZLLL;
    }

    @Override // X.InterfaceC1318410kPf
    public int getBackwardNestedScrollMode() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1318410kPf
    public int getForwardNestedScrollMode() {
        return this.LLJJ;
    }

    public C1318240kPO(Context context) {
        super(context);
        this.LLJILJILJ = new C1318310kPV(this);
        this.LLJILLL = new C1317550kOH();
        this.LL.LLILZLL = this;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        boolean z;
        int forwardNestedScrollMode;
        if (this.LLILLL || i == 0) {
            return false;
        }
        int scrollOffsetHorizontally = getScrollOffsetHorizontally();
        int[] scrollRangeHorizontally = getScrollRangeHorizontally();
        if (i > 0) {
            z = true;
            forwardNestedScrollMode = getForwardNestedScrollMode();
        } else {
            z = false;
            forwardNestedScrollMode = this.LLJJI;
        }
        if (forwardNestedScrollMode == 0) {
            return true;
        }
        if (forwardNestedScrollMode != 1 && forwardNestedScrollMode != 2 && forwardNestedScrollMode != 3) {
            return super.canScrollHorizontally(i);
        }
        if (z) {
            if (scrollRangeHorizontally[1] <= scrollOffsetHorizontally + 1) {
                return false;
            }
        } else if (scrollOffsetHorizontally - 1 <= scrollRangeHorizontally[0]) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        boolean z;
        int i2;
        if (!this.LLILLL || i == 0) {
            return false;
        }
        int scrollOffsetVertically = getScrollOffsetVertically();
        int[] scrollRangeVertically = getScrollRangeVertically();
        if (i > 0) {
            z = true;
            i2 = this.LLJJ;
        } else {
            z = false;
            i2 = this.LLJJI;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return super.canScrollVertically(i);
        }
        if (z) {
            if (scrollRangeVertically[1] <= scrollOffsetVertically + 1) {
                return false;
            }
        } else if (scrollOffsetVertically - 1 <= scrollRangeVertically[0]) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C1318310kPV c1318310kPV = this.LLJILJILJ;
        if (c1318310kPV.LIZLLL) {
            C14K9.LJJIFFI(c1318310kPV.LIZJ);
        }
        c1318310kPV.LIZLLL = z;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // X.C1318250kPP, X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        C1318310kPV c1318310kPV = this.LLJILJILJ;
        ViewParent viewParentLIZ = c1318310kPV.LIZ(i);
        if (viewParentLIZ != null) {
            C1318330kPX.LJFF(i, c1318310kPV.LIZJ, viewParentLIZ);
            if (i == 0) {
                c1318310kPV.LIZ = null;
            } else {
                c1318310kPV.LIZIZ = null;
            }
        }
    }

    public final int LJIILIIL(int i, boolean z) {
        int i2;
        if (z) {
            i2 = this.LLILZIL;
        } else {
            i2 = this.LLILZ;
        }
        return (int) (((double) (i * i2)) / (((double) (i2 - i)) * 0.55d));
    }

    public final int LJIIZILJ(int i, boolean z) {
        int i2;
        if (z) {
            i2 = this.LLILZIL;
        } else {
            i2 = this.LLILZ;
        }
        double d = i2;
        return (int) ((1.0d - (1.0d / (((((double) i) * 0.55d) / d) + 1.0d))) * d);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParentLIZ;
        C1318310kPV c1318310kPV = this.LLJILJILJ;
        if (!c1318310kPV.LIZLLL || (viewParentLIZ = c1318310kPV.LIZ(0)) == null) {
            return false;
        }
        return C1318330kPX.LIZIZ(viewParentLIZ, c1318310kPV.LIZJ, f, f2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        this.LLJILLL.LIZIZ(i);
        stopNestedScroll(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045 A[SYNTHETIC] */
    @Override // X.C1318250kPP, X.InterfaceC1318320kPW, X.InterfaceC20097013kG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startNestedScroll(int r7, int r8) {
        /*
            r6 = this;
            X.0kPV r5 = r6.LLJILJILJ
            android.view.ViewParent r0 = r5.LIZ(r8)
            r4 = 1
            if (r0 != 0) goto L2f
            boolean r0 = r5.LIZLLL
            if (r0 == 0) goto L4a
            android.view.View r0 = r5.LIZJ
            android.view.ViewParent r3 = r0.getParent()
            android.view.View r2 = r5.LIZJ
        L15:
            if (r3 == 0) goto L4a
            android.view.View r1 = r5.LIZJ
            boolean r0 = r3 instanceof X.InterfaceC1318370kPb
            if (r0 == 0) goto L33
            r0 = r3
            X.0kPb r0 = (X.InterfaceC1318370kPb) r0
            boolean r0 = r0.onStartNestedScroll(r2, r1, r7, r8)
        L24:
            if (r0 == 0) goto L3e
            if (r8 != 0) goto L30
            r5.LIZ = r3
        L2a:
            android.view.View r0 = r5.LIZJ
            X.C1318330kPX.LJ(r3, r2, r0, r7, r8)
        L2f:
            return r4
        L30:
            r5.LIZIZ = r3
            goto L2a
        L33:
            if (r8 != 0) goto L3e
            boolean r0 = X.C1318340kPY.LJFF(r3, r2, r1, r7)     // Catch: java.lang.AbstractMethodError -> L3a
            goto L24
        L3a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3e:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L45
            r2 = r3
            android.view.View r2 = (android.view.View) r2
        L45:
            android.view.ViewParent r3 = r3.getParent()
            goto L15
        L4a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1318240kPO.startNestedScroll(int, int):boolean");
    }

    public final void LJIILLIIL(int i, int i2, int[] iArr) {
        if (this.LLILLL) {
            int scrollOffsetVertically = getScrollOffsetVertically() + i2;
            int[] scrollRangeVertically = getScrollRangeVertically();
            int iMin = Math.min(Math.max(scrollOffsetVertically, scrollRangeVertically[0]), scrollRangeVertically[1]);
            LJII(iMin);
            iArr[0] = 0;
            iArr[1] = scrollOffsetVertically - iMin;
            return;
        }
        int scrollOffsetHorizontally = getScrollOffsetHorizontally() + i;
        int[] scrollRangeHorizontally = getScrollRangeHorizontally();
        int iMin2 = Math.min(Math.max(scrollOffsetHorizontally, scrollRangeHorizontally[0]), scrollRangeHorizontally[1]);
        LJI(iMin2);
        iArr[0] = scrollOffsetHorizontally - iMin2;
        iArr[1] = 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParentLIZ;
        C1318310kPV c1318310kPV = this.LLJILJILJ;
        if (!c1318310kPV.LIZLLL || (viewParentLIZ = c1318310kPV.LIZ(0)) == null) {
            return false;
        }
        return C1318330kPX.LIZ(viewParentLIZ, c1318310kPV.LIZJ, f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // X.C1318250kPP
    public final int[] LJIIJ(int i, int i2, int i3, int[] iArr) {
        boolean z;
        int i4;
        int[] scrollOffset = getScrollOffset();
        int[] scrollRange = getScrollRange();
        int[] iArr2 = {0, 0};
        if (!this.LLILLL ? i > 0 : i2 > 0) {
            z = true;
            i4 = this.LLJJ;
        } else {
            z = false;
            i4 = this.LLJJI;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        int[] iArr3 = new int[2];
                        dispatchNestedPreScroll(i, i2, new int[2], iArr3, i3);
                        if (this.LLILLJJLI) {
                            LJIJ(i, i2, z, scrollOffset, scrollRange, i3);
                        } else {
                            LJIILLIIL(i, i2, iArr2);
                        }
                        LJIILJJIL(i, i2, 0, 0, null, i3);
                        if (iArr != null) {
                            iArr[0] = iArr3[0];
                            iArr[1] = iArr3[1];
                        }
                    }
                } else {
                    int[] iArr4 = new int[2];
                    int[] iArr5 = new int[2];
                    if (i3 == 2147483634 && this.LLILLJJLI) {
                        iArr4[0] = 0;
                        iArr4[1] = 0;
                        iArr5[0] = 0;
                        iArr5[0] = 0;
                    } else {
                        dispatchNestedPreScroll(i, i2, iArr4, iArr5, i3);
                    }
                    int i5 = i - iArr4[0];
                    int i6 = i2 - iArr4[1];
                    if (this.LLILLJJLI) {
                        LJIJ(i5, i6, z, scrollOffset, scrollRange, i3);
                    } else {
                        LJIILLIIL(i5, i6, iArr2);
                    }
                    int[] iArr6 = new int[2];
                    if (i3 == 2147483634 && this.LLILLJJLI) {
                        iArr6[0] = 0;
                        iArr6[0] = 0;
                    } else {
                        int i7 = iArr2[0];
                        int i8 = iArr2[1];
                        LJIILJJIL(i5 - i7, i6 - i8, i7, i8, iArr6, i3);
                    }
                    if (iArr != null) {
                        iArr[0] = iArr6[0] + iArr5[0];
                        iArr[1] = iArr6[1] + iArr5[1];
                        return iArr2;
                    }
                }
            } else if (!this.LLILLJJLI) {
                dispatchNestedPreScroll(0, 0, new int[2], null, i3);
                if (i3 == 2147483634 && !this.LLILLJJLI) {
                    iArr2[0] = i;
                    iArr2[1] = i2;
                } else {
                    LJIILLIIL(i, i2, iArr2);
                }
                int i9 = iArr2[0];
                int i10 = iArr2[1];
                LJIILJJIL(i - i9, i2 - i10, i9, i10, iArr, i3);
                return iArr2;
            }
            return iArr2;
        }
        if (this.LLILLJJLI) {
            LJIJ(i, i2, z, scrollOffset, scrollRange, i3);
            return iArr2;
        }
        LJIILLIIL(i, i2, iArr2);
        return iArr2;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            int i = (int) f;
            int i2 = (int) f2;
            if (this.LLILLL || Math.abs(i) < this.LLJILJIL.LIZIZ) {
                i = 0;
            }
            if (!this.LLILLL || Math.abs(i2) < this.LLJILJIL.LIZIZ) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                float f3 = i;
                float f4 = i2;
                if (!dispatchNestedPreFling(f3, f4)) {
                    dispatchNestedFling(f3, f4, true);
                    startNestedScroll(getNestedScrollAxis(), 1);
                    int i3 = this.LLJILJIL.LIZJ;
                    int iMax = Math.max(-i3, Math.min(i, i3));
                    int i4 = this.LLJILJIL.LIZJ;
                    int iMax2 = Math.max(-i4, Math.min(i2, i4));
                    LJIIIIZZ(3);
                    this.LL.LJ(iMax, iMax2, new InterfaceC1318490kPn() { // from class: X.0kPh
                        @Override // X.InterfaceC1318490kPn
                        public final void LIZ(boolean z2) {
                            if (z2) {
                                this.LIZ.LJIIIIZZ(0);
                            }
                        }
                    });
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.LLJILLL.LIZ(i, i2);
        if (this.LLILLL) {
            startNestedScroll(2, i2);
        } else {
            startNestedScroll(1, i2);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (this.LLILLL) {
            if ((i & 2) == 0) {
                return false;
            }
            return true;
        }
        if ((i & 1) == 0) {
            return false;
        }
        return true;
    }

    public final int[] LJIIL(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int[] iArr3 = {0, 0};
        if (this.LLILLL) {
            iArr3[1] = LJIILL(new int[]{iArr2[2], iArr2[3]}, i2, iArr[1], true, i3);
            return iArr3;
        }
        iArr3[0] = LJIILL(new int[]{iArr2[0], iArr2[1]}, i, iArr[0], false, i3);
        return iArr3;
    }

    public final int LJIILL(int[] iArr, int i, int i2, boolean z, int i3) {
        boolean z2;
        int iMax;
        int iMin;
        int i4 = iArr[1];
        if (i2 > i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i >= 0) {
                if (i3 != 0 && i3 != 2147483632) {
                    if (z) {
                        LJII(i2 + i);
                        return 0;
                    }
                    LJI(i2 + i);
                    return 0;
                }
                int iLJIIZILJ = LJIIZILJ(LJIILIIL(i2 - i4, z) + i, z);
                if (z) {
                    LJII(iArr[1] + iLJIIZILJ);
                    return 0;
                }
                LJI(iArr[1] + iLJIIZILJ);
                return 0;
            }
            if (i3 != 0 && i3 != 2147483632) {
                iMin = Math.max(i2 + i, i4);
                if (z) {
                    LJII(iMin);
                } else {
                    LJI(iMin);
                }
                iMax = iMin - i2;
            } else {
                int iLJIILIIL = LJIILIIL(i2 - i4, z);
                int i5 = -i;
                int iMax2 = Math.max(iLJIILIIL - iArr[1], i5);
                int iLJIIZILJ2 = LJIIZILJ(Math.max(iLJIILIIL + i, 0), z);
                if (z) {
                    LJII(iArr[1] + iLJIIZILJ2);
                } else {
                    LJI(iArr[1] + iLJIIZILJ2);
                }
                return -(i5 - iMax2);
            }
        } else {
            int i6 = iArr[0];
            if (i2 < i6) {
                if (i <= 0) {
                    if (i3 != 0 && i3 != 2147483632) {
                        if (z) {
                            LJII(i2 + i);
                            return 0;
                        }
                        LJI(i2 + i);
                        return 0;
                    }
                    int iLJIIZILJ3 = LJIIZILJ(LJIILIIL(i6 - i2, z) - i, z);
                    if (z) {
                        LJII(-iLJIIZILJ3);
                        return 0;
                    }
                    LJI(-iLJIIZILJ3);
                    return 0;
                }
                if (i3 != 0 && i3 != 2147483632) {
                    iMin = Math.min(i2 + i, i6);
                    if (z) {
                        LJII(iMin);
                    } else {
                        LJI(iMin);
                    }
                    iMax = iMin - i2;
                } else {
                    int iLJIILIIL2 = LJIILIIL(i6 - i2, z);
                    iMax = Math.max((-iLJIILIIL2) - iArr[0], i);
                    int iLJIIZILJ4 = LJIIZILJ(Math.max(iLJIILIIL2 - i, 0), z);
                    if (z) {
                        LJII(-iLJIIZILJ4);
                    } else {
                        LJI(-iLJIIZILJ4);
                    }
                }
            }
            return 0;
        }
        return i - iMax;
    }

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentLIZ;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        C1318310kPV c1318310kPV = this.LLJILJILJ;
        if (c1318310kPV.LIZLLL && (viewParentLIZ = c1318310kPV.LIZ(i3)) != null) {
            if (i == 0 && i2 == 0) {
                if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            } else {
                if (iArr2 != null) {
                    c1318310kPV.LIZJ.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr3 == null) {
                    if (c1318310kPV.LJ == null) {
                        c1318310kPV.LJ = new int[2];
                    }
                    iArr3 = c1318310kPV.LJ;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                C1318330kPX.LIZJ(viewParentLIZ, c1318310kPV.LIZJ, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    c1318310kPV.LIZJ.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return LJIILJJIL(i, i2, i3, i4, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        if (this.LLILLL) {
            i4 = 0;
            i5 = i2;
        } else {
            i4 = i;
            i5 = 0;
        }
        int[] iArrLJIIJ = LJIIJ(i4, i5, i3, null);
        iArr[0] = i - iArrLJIIJ[0];
        iArr[1] = i2 - iArrLJIIJ[1];
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public final boolean LJIILJJIL(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent viewParentLIZ;
        int i6;
        int i7;
        C1318310kPV c1318310kPV = this.LLJILJILJ;
        if (c1318310kPV.LIZLLL && (viewParentLIZ = c1318310kPV.LIZ(i5)) != null) {
            if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
            } else {
                if (iArr != null) {
                    c1318310kPV.LIZJ.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                View view = c1318310kPV.LIZJ;
                int[] iArr2 = C1318330kPX.LIZ;
                if (iArr2 == null) {
                    C1318330kPX.LIZ = new int[2];
                } else {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                C1318330kPX.LIZLLL(viewParentLIZ, view, i, i2, i3, i4, i5, C1318330kPX.LIZ);
                if (iArr != null) {
                    c1318310kPV.LIZJ.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final void LJIJ(int i, int i2, boolean z, int[] iArr, int[] iArr2, int i3) {
        boolean z2;
        boolean z3;
        boolean z4 = this.LLILLL;
        if (!z4 ? iArr[0] > iArr2[1] : iArr[1] > iArr2[3]) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z4 ? iArr[0] < iArr2[0] : iArr[1] < iArr2[2]) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            if (z) {
                LJIIL(i, i2, iArr, iArr2, i3);
                return;
            } else {
                int[] iArrLJIIL = LJIIL(i, i2, iArr, iArr2, i3);
                scrollBy(iArrLJIIL[0], iArrLJIIL[1]);
                return;
            }
        }
        if (z3) {
            if (!z) {
                LJIIL(i, i2, iArr, iArr2, i3);
                return;
            } else {
                int[] iArrLJIIL2 = LJIIL(i, i2, iArr, iArr2, i3);
                scrollBy(iArrLJIIL2[0], iArrLJIIL2[1]);
                return;
            }
        }
        if (i3 == 2147483634) {
            return;
        }
        scrollBy(i, i2);
        int[] scrollOffset = getScrollOffset();
        LJIIL(i - (scrollOffset[0] - iArr[0]), i2 - (scrollOffset[1] - iArr[1]), iArr, iArr2, i3);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.LLILLL) {
            i3 = 0;
        } else {
            i4 = 0;
        }
        LJIIJ(i3, i4, i5, null);
    }
}
