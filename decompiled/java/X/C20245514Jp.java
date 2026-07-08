package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: renamed from: X.14Jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20245514Jp extends C20245614Jq {
    public static boolean LJII;
    public static Method LJIIIIZZ;
    public static Class<?> LJIIIZ;
    public static Field LJIIJ;
    public static Field LJIIJJI;
    public final WindowInsets LIZJ;
    public C20244914Jj[] LIZLLL;
    public C20244914Jj LJ;
    public C20246014Ju LJFF;
    public C20244914Jj LJI;

    public static void LJJII() {
        try {
            LJIIIIZZ = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            LJIIIZ = cls;
            LJIIJ = cls.getDeclaredField("mVisibleInsets");
            LJIIJJI = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            LJIIJ.setAccessible(true);
            LJIIJJI.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJII = true;
    }

    private C20244914Jj LJJ() {
        C20246014Ju c20246014Ju = this.LJFF;
        return c20246014Ju != null ? c20246014Ju.LIZ.LJIIIZ() : C20244914Jj.LJ;
    }

    @Override // X.C20245614Jq
    public final C20244914Jj LJIIJJI() {
        if (this.LJ == null) {
            this.LJ = C20244914Jj.LIZIZ(this.LIZJ.getSystemWindowInsetLeft(), this.LIZJ.getSystemWindowInsetTop(), this.LIZJ.getSystemWindowInsetRight(), this.LIZJ.getSystemWindowInsetBottom());
        }
        return this.LJ;
    }

    @Override // X.C20245614Jq
    public boolean LJIILL() {
        return this.LIZJ.isRound();
    }

    private static C20244914Jj LJJI(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!LJII) {
                LJJII();
            }
            Method method = LJIIIIZZ;
            C20244914Jj c20244914JjLIZIZ = null;
            if (method != null && LJIIIZ != null && LJIIJ != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) LJIIJ.get(LJIIJJI.get(objInvoke));
                    if (rect == null) {
                        return null;
                    }
                    c20244914JjLIZIZ = C20244914Jj.LIZIZ(rect.left, rect.top, rect.right, rect.bottom);
                    return c20244914JjLIZIZ;
                } catch (ReflectiveOperationException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return c20244914JjLIZIZ;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // X.C20245614Jq
    public void LIZLLL(View view) {
        C20244914Jj c20244914JjLJJI = LJJI(view);
        if (c20244914JjLJJI == null) {
            c20244914JjLJJI = C20244914Jj.LJ;
        }
        LJIJ(c20244914JjLJJI);
    }

    @Override // X.C20245614Jq
    public void LJ(C20246014Ju c20246014Ju) {
        c20246014Ju.LIZ.LJIJI(this.LJFF);
        c20246014Ju.LIZ.LJIJ(this.LJI);
    }

    @Override // X.C20245614Jq
    public C20244914Jj LJI(int i) {
        return LJIJJLI(i, false);
    }

    @Override // X.C20245614Jq
    public C20244914Jj LJII(int i) {
        return LJIJJLI(i, true);
    }

    @Override // X.C20245614Jq
    public boolean LJIILLIIL(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0 && !LJJIFFI(i2)) {
                return false;
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return true;
    }

    @Override // X.C20245614Jq
    public void LJIIZILJ(C20244914Jj[] c20244914JjArr) {
        this.LIZLLL = c20244914JjArr;
    }

    @Override // X.C20245614Jq
    public void LJIJ(C20244914Jj c20244914Jj) {
        this.LJI = c20244914Jj;
    }

    @Override // X.C20245614Jq
    public void LJIJI(C20246014Ju c20246014Ju) {
        this.LJFF = c20246014Ju;
    }

    public boolean LJJIFFI(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !LJIL(i, false).equals(C20244914Jj.LJ);
    }

    @Override // X.C20245614Jq
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.LJI, ((C20245514Jp) obj).LJI);
    }

    public C20245514Jp(C20246014Ju c20246014Ju, C20245514Jp c20245514Jp) {
        this(c20246014Ju, new WindowInsets(c20245514Jp.LIZJ));
    }

    private C20244914Jj LJIJJLI(int i, boolean z) {
        C20244914Jj c20244914JjLIZ = C20244914Jj.LJ;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c20244914JjLIZ = C20244914Jj.LIZ(c20244914JjLIZ, LJIL(i2, z));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return c20244914JjLIZ;
    }

    public C20244914Jj LJIL(int i, boolean z) {
        int i2;
        C20244914Jj c20244914Jj;
        C1683900tvA c1683900tvALJFF;
        int iLIZLLL;
        int iLJFF;
        int iLJ;
        int iLIZJ = 0;
        if (i != 1) {
            C20244914Jj c20244914JjLJIIIZ = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i != 128) {
                                    return C20244914Jj.LJ;
                                }
                                C20246014Ju c20246014Ju = this.LJFF;
                                if (c20246014Ju != null) {
                                    c1683900tvALJFF = c20246014Ju.LIZ.LJFF();
                                } else {
                                    c1683900tvALJFF = LJFF();
                                }
                                if (c1683900tvALJFF != null) {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        iLIZLLL = C20245414Jo.LIZLLL(c1683900tvALJFF.LIZ);
                                        iLJFF = C20245414Jo.LJFF(c1683900tvALJFF.LIZ);
                                        iLJ = C20245414Jo.LJ(c1683900tvALJFF.LIZ);
                                        iLIZJ = C20245414Jo.LIZJ(c1683900tvALJFF.LIZ);
                                    } else {
                                        iLIZLLL = 0;
                                        iLJFF = 0;
                                        iLJ = 0;
                                    }
                                    return C20244914Jj.LIZIZ(iLIZLLL, iLJFF, iLJ, iLIZJ);
                                }
                                return C20244914Jj.LJ;
                            }
                            return LJIIL();
                        }
                        return LJIIIIZZ();
                    }
                    return LJIIJ();
                }
                C20244914Jj[] c20244914JjArr = this.LIZLLL;
                if (c20244914JjArr != null && (c20244914Jj = c20244914JjArr[C1776990wLJ.LIZ(8)]) != null) {
                    return c20244914Jj;
                }
                C20244914Jj c20244914JjLJIIJJI = LJIIJJI();
                C20244914Jj c20244914JjLJJ = LJJ();
                int i3 = c20244914JjLJIIJJI.LIZLLL;
                if (i3 > c20244914JjLJJ.LIZLLL) {
                    return C20244914Jj.LIZIZ(0, 0, 0, i3);
                }
                C20244914Jj c20244914Jj2 = this.LJI;
                if (c20244914Jj2 != null && !c20244914Jj2.equals(C20244914Jj.LJ) && (i2 = this.LJI.LIZLLL) > c20244914JjLJJ.LIZLLL) {
                    return C20244914Jj.LIZIZ(0, 0, 0, i2);
                }
                return C20244914Jj.LJ;
            }
            if (z) {
                C20244914Jj c20244914JjLJJ2 = LJJ();
                C20244914Jj c20244914JjLJIIIZ2 = LJIIIZ();
                return C20244914Jj.LIZIZ(Math.max(c20244914JjLJJ2.LIZ, c20244914JjLJIIIZ2.LIZ), 0, Math.max(c20244914JjLJJ2.LIZJ, c20244914JjLJIIIZ2.LIZJ), Math.max(c20244914JjLJJ2.LIZLLL, c20244914JjLJIIIZ2.LIZLLL));
            }
            C20244914Jj c20244914JjLJIIJJI2 = LJIIJJI();
            C20246014Ju c20246014Ju2 = this.LJFF;
            if (c20246014Ju2 != null) {
                c20244914JjLJIIIZ = c20246014Ju2.LIZ.LJIIIZ();
            }
            int iMin = c20244914JjLJIIJJI2.LIZLLL;
            if (c20244914JjLJIIIZ != null) {
                iMin = Math.min(iMin, c20244914JjLJIIIZ.LIZLLL);
            }
            return C20244914Jj.LIZIZ(c20244914JjLJIIJJI2.LIZ, 0, c20244914JjLJIIJJI2.LIZJ, iMin);
        }
        if (z) {
            return C20244914Jj.LIZIZ(0, Math.max(LJJ().LIZIZ, LJIIJJI().LIZIZ), 0, 0);
        }
        return C20244914Jj.LIZIZ(0, LJIIJJI().LIZIZ, 0, 0);
    }

    public C20245514Jp(C20246014Ju c20246014Ju, WindowInsets windowInsets) {
        super(c20246014Ju);
        this.LIZJ = windowInsets;
    }

    @Override // X.C20245614Jq
    public C20246014Ju LJIILIIL(int i, int i2, int i3, int i4) {
        C20246414Jy c20246414Jy = new C20246414Jy(C20246014Ju.LJIIJJI(null, this.LIZJ));
        c20246414Jy.LIZ.LJI(C20246014Ju.LJI(LJIIJJI(), i, i2, i3, i4));
        c20246414Jy.LIZ.LJ(C20246014Ju.LJI(LJIIIZ(), i, i2, i3, i4));
        return c20246414Jy.LIZ();
    }
}
