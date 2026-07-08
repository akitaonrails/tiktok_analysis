package X;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0kPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318260kPQ {
    public ViewParent LIZ;
    public ViewParent LIZIZ;
    public final View LIZJ;
    public boolean LIZLLL;
    public int[] LJ;

    public C1318260kPQ(View view) {
        this.LIZJ = view;
    }

    public final ViewParent LJII(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    public final boolean LJIIIIZZ(int i) {
        if (LJII(i) != null) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ(boolean z) {
        if (this.LIZLLL) {
            C14K9.LJJIFFI(this.LIZJ);
        }
        this.LIZLLL = z;
    }

    public final void LJIIJJI(int i) {
        ViewParent viewParentLJII = LJII(i);
        if (viewParentLJII != null) {
            C1318330kPX.LJFF(i, this.LIZJ, viewParentLJII);
            if (i != 0) {
                if (i == 1) {
                    this.LIZIZ = null;
                    return;
                }
                return;
            }
            this.LIZ = null;
        }
    }

    public final boolean LIZIZ(float f, float f2) {
        ViewParent viewParentLJII;
        if (!this.LIZLLL || (viewParentLJII = LJII(0)) == null) {
            return false;
        }
        return C1318330kPX.LIZIZ(viewParentLJII, this.LIZJ, f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ(int r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.LJIIIIZZ(r8)
            r5 = 1
            if (r0 == 0) goto L8
            return r5
        L8:
            boolean r0 = r6.LIZLLL
            r4 = 0
            if (r0 == 0) goto L4c
            android.view.View r0 = r6.LIZJ
            android.view.ViewParent r3 = r0.getParent()
            android.view.View r2 = r6.LIZJ
        L15:
            if (r3 == 0) goto L4c
            android.view.View r1 = r6.LIZJ
            boolean r0 = r3 instanceof X.InterfaceC1318370kPb
            if (r0 == 0) goto L35
            r0 = r3
            X.0kPb r0 = (X.InterfaceC1318370kPb) r0
            boolean r0 = r0.onStartNestedScroll(r2, r1, r7, r8)
        L24:
            if (r0 == 0) goto L40
            if (r8 == 0) goto L32
            if (r8 != r5) goto L2c
            r6.LIZIZ = r3
        L2c:
            android.view.View r0 = r6.LIZJ
            X.C1318330kPX.LJ(r3, r2, r0, r7, r8)
            return r5
        L32:
            r6.LIZ = r3
            goto L2c
        L35:
            if (r8 != 0) goto L40
            boolean r0 = X.C1318340kPY.LJFF(r3, r2, r1, r7)     // Catch: java.lang.AbstractMethodError -> L3c
            goto L24
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L40:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L47
            r2 = r3
            android.view.View r2 = (android.view.View) r2
        L47:
            android.view.ViewParent r3 = r3.getParent()
            goto L15
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1318260kPQ.LJIIJ(int, int):boolean");
    }

    public final boolean LIZ(float f, float f2, boolean z) {
        ViewParent viewParentLJII;
        if (!this.LIZLLL || (viewParentLJII = LJII(0)) == null) {
            return false;
        }
        return C1318330kPX.LIZ(viewParentLJII, this.LIZJ, f, f2, z);
    }

    public final boolean LIZJ(int i, int i2, int[] iArr, int[] iArr2) {
        return LIZLLL(i, i2, iArr, iArr2, 0);
    }

    public final boolean LIZLLL(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentLJII;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (!this.LIZLLL || (viewParentLJII = LJII(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        } else {
            if (iArr2 != null) {
                this.LIZJ.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr3 == null) {
                if (this.LJ == null) {
                    this.LJ = new int[2];
                }
                iArr3 = this.LJ;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            C1318330kPX.LIZJ(viewParentLJII, this.LIZJ, i, i2, iArr3, i3);
            if (iArr2 != null) {
                this.LIZJ.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJ(int i, int i2, int i3, int i4, int[] iArr) {
        return LJI(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean LJFF(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return LJI(i, i2, i3, i4, iArr, i5, null);
    }

    public final boolean LJI(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentLJII;
        int i6;
        int i7;
        int[] iArr3 = iArr2;
        if (!this.LIZLLL || (viewParentLJII = LJII(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.LIZJ.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr3 == null) {
            if (this.LJ == null) {
                this.LJ = new int[2];
            }
            iArr3 = this.LJ;
            iArr3[0] = 0;
            iArr3[1] = 0;
        }
        C1318330kPX.LIZLLL(viewParentLJII, this.LIZJ, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.LIZJ.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }
}
