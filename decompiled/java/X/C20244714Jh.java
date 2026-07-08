package X;

import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: renamed from: X.14Jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20244714Jh extends C20244514Jf {
    public static boolean LJIIIIZZ;
    public static Method LJIIIZ;
    public static Class<?> LJIIJ;
    public static Class<?> LJIIJJI;
    public static Field LJIIL;
    public static Field LJIILIIL;
    public final WindowInsets LIZLLL;
    public C20244814Ji[] LJ;
    public C20244814Ji LJFF;
    public C20244614Jg LJI;
    public C20244814Ji LJII;

    @Override // X.C20244514Jf
    public boolean LJIILIIL() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((i & 8) != 0) {
                if (i != 1 && i != 2) {
                    if (i == 4) {
                        return false;
                    }
                    if (i == 8 || i == 128) {
                    }
                }
                if (!(!LJIIZILJ(i).equals(C20244814Ji.LJ))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.C20244514Jf
    public final C20244814Ji LJIIIZ() {
        if (this.LJFF == null) {
            this.LJFF = C20244814Ji.LIZIZ(this.LIZLLL.getSystemWindowInsetLeft(), this.LIZLLL.getSystemWindowInsetTop(), this.LIZLLL.getSystemWindowInsetRight(), this.LIZLLL.getSystemWindowInsetBottom());
        }
        return this.LJFF;
    }

    @Override // X.C20244514Jf
    public final boolean LJIIL() {
        return this.LIZLLL.isRound();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    @Override // X.C20244514Jf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZLLL(android.view.View r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 >= r0) goto L87
            boolean r0 = X.C20244714Jh.LJIIIIZZ
            r2 = 0
            if (r0 != 0) goto L4b
            r3 = 1
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.String r1 = "getViewRootImpl"
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r1, r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            X.C20244714Jh.LJIIIZ = r0     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r0 = "android.view.ViewRootImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            X.C20244714Jh.LJIIJ = r0     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r0 = "android.view.View$AttachInfo"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            X.C20244714Jh.LJIIJJI = r1     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r0 = "mVisibleInsets"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            X.C20244714Jh.LJIIL = r0     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.Class<?> r1 = X.C20244714Jh.LJIIJ     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r0 = "mAttachInfo"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            X.C20244714Jh.LJIILIIL = r0     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Field r0 = X.C20244714Jh.LJIIL     // Catch: java.lang.ReflectiveOperationException -> L45
            r0.setAccessible(r3)     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Field r0 = X.C20244714Jh.LJIILIIL     // Catch: java.lang.ReflectiveOperationException -> L45
            r0.setAccessible(r3)     // Catch: java.lang.ReflectiveOperationException -> L45
            goto L49
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L49:
            X.C20244714Jh.LJIIIIZZ = r3
        L4b:
            java.lang.reflect.Method r4 = X.C20244714Jh.LJIIIZ
            r3 = 0
            if (r4 == 0) goto L82
            java.lang.Class<?> r0 = X.C20244714Jh.LJIIJJI
            if (r0 == 0) goto L82
            java.lang.reflect.Field r0 = X.C20244714Jh.LJIIL
            if (r0 == 0) goto L82
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ReflectiveOperationException -> L7e
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGJ544i2jfZXpDAmNTtws4iuUzY5iYPj1KDUCXmzVzFAVslZqEIk="
            r1.<init>(r0, r3)     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.Object r1 = X.C2204961BRm.a0(r4, r6, r2, r1)     // Catch: java.lang.ReflectiveOperationException -> L7e
            if (r1 == 0) goto L82
            java.lang.reflect.Field r0 = X.C20244714Jh.LJIILIIL     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.reflect.Field r0 = X.C20244714Jh.LJIIL     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.ReflectiveOperationException -> L7e
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.ReflectiveOperationException -> L7e
            if (r0 == 0) goto L82
            X.14Ji r0 = X.C20244814Ji.LIZJ(r0)     // Catch: java.lang.ReflectiveOperationException -> L7e
            if (r0 != 0) goto L84
            goto L82
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L82:
            X.14Ji r0 = X.C20244814Ji.LJ
        L84:
            r5.LJII = r0
            return
        L87:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20244714Jh.LIZLLL(android.view.View):void");
    }

    @Override // X.C20244514Jf
    public C20244814Ji LJFF(int i) {
        C20244814Ji c20244814JiLIZ = C20244814Ji.LJ;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c20244814JiLIZ = C20244814Ji.LIZ(c20244814JiLIZ, LJIIZILJ(i2));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return c20244814JiLIZ;
    }

    @Override // X.C20244514Jf
    public final void LJIILJJIL(C20244814Ji[] c20244814JiArr) {
        this.LJ = c20244814JiArr;
    }

    @Override // X.C20244514Jf
    public final void LJIILL(C20244614Jg c20244614Jg) {
        this.LJI = c20244614Jg;
    }

    public final C20244814Ji LJIIZILJ(int i) {
        C20244814Ji c20244814JiLJII;
        int i2;
        C20244814Ji c20244814Ji;
        C1155260gAW c1155260gAWLJ;
        int safeInsetLeft;
        int safeInsetTop;
        int safeInsetRight;
        int safeInsetBottom = 0;
        if (i != 1) {
            C20244814Ji c20244814JiLJII2 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i != 128) {
                                    return C20244814Ji.LJ;
                                }
                                C20244614Jg c20244614Jg = this.LJI;
                                if (c20244614Jg != null) {
                                    c1155260gAWLJ = c20244614Jg.LIZ.LJ();
                                } else {
                                    c1155260gAWLJ = LJ();
                                }
                                if (c1155260gAWLJ != null) {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        safeInsetLeft = ((DisplayCutout) c1155260gAWLJ.LIZ).getSafeInsetLeft();
                                        safeInsetTop = ((DisplayCutout) c1155260gAWLJ.LIZ).getSafeInsetTop();
                                        safeInsetRight = ((DisplayCutout) c1155260gAWLJ.LIZ).getSafeInsetRight();
                                        safeInsetBottom = ((DisplayCutout) c1155260gAWLJ.LIZ).getSafeInsetBottom();
                                    } else {
                                        safeInsetLeft = 0;
                                        safeInsetTop = 0;
                                        safeInsetRight = 0;
                                    }
                                    return C20244814Ji.LIZIZ(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom);
                                }
                                return C20244814Ji.LJ;
                            }
                            return LJIIJ();
                        }
                        return LJI();
                    }
                    return LJIIIIZZ();
                }
                C20244814Ji[] c20244814JiArr = this.LJ;
                if (c20244814JiArr != null && (c20244814Ji = c20244814JiArr[C1777000wLK.LIZ(8)]) != null) {
                    return c20244814Ji;
                }
                C20244814Ji c20244814JiLJIIIZ = LJIIIZ();
                C20244614Jg c20244614Jg2 = this.LJI;
                if (c20244614Jg2 != null) {
                    c20244814JiLJII = c20244614Jg2.LIZ.LJII();
                } else {
                    c20244814JiLJII = C20244814Ji.LJ;
                }
                int i3 = c20244814JiLJIIIZ.LIZLLL;
                if (i3 > c20244814JiLJII.LIZLLL) {
                    return C20244814Ji.LIZIZ(0, 0, 0, i3);
                }
                C20244814Ji c20244814Ji2 = this.LJII;
                if (c20244814Ji2 != null && !c20244814Ji2.equals(C20244814Ji.LJ) && (i2 = this.LJII.LIZLLL) > c20244814JiLJII.LIZLLL) {
                    return C20244814Ji.LIZIZ(0, 0, 0, i2);
                }
                return C20244814Ji.LJ;
            }
            C20244814Ji c20244814JiLJIIIZ2 = LJIIIZ();
            C20244614Jg c20244614Jg3 = this.LJI;
            if (c20244614Jg3 != null) {
                c20244814JiLJII2 = c20244614Jg3.LIZ.LJII();
            }
            int iMin = c20244814JiLJIIIZ2.LIZLLL;
            if (c20244814JiLJII2 != null) {
                iMin = Math.min(iMin, c20244814JiLJII2.LIZLLL);
            }
            return C20244814Ji.LIZIZ(c20244814JiLJIIIZ2.LIZ, 0, c20244814JiLJIIIZ2.LIZJ, iMin);
        }
        return C20244814Ji.LIZIZ(0, LJIIIZ().LIZIZ, 0, 0);
    }

    @Override // X.C20244514Jf
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.LJII, ((C20244714Jh) obj).LJII);
    }

    public C20244714Jh(C20244614Jg c20244614Jg, WindowInsets windowInsets) {
        super(c20244614Jg);
        this.LIZLLL = windowInsets;
    }
}
