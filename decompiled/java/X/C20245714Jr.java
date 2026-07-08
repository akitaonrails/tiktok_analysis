package X;

import android.graphics.Rect;
import android.view.WindowInsets;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.14Jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20245714Jr extends C20245914Jt {
    public static Field LJ;
    public static boolean LJFF;
    public static Constructor<WindowInsets> LJI;
    public static boolean LJII;
    public WindowInsets LIZJ;
    public C20244914Jj LIZLLL;

    public static WindowInsets LJIIIIZZ() {
        if (!LJFF) {
            try {
                LJ = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJFF = true;
        }
        Field field = LJ;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (!LJII) {
            try {
                LJI = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            LJII = true;
        }
        Constructor<WindowInsets> constructor = LJI;
        if (constructor != null) {
            try {
                return constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        return null;
    }

    public C20245714Jr() {
        this.LIZJ = LJIIIIZZ();
    }

    @Override // X.C20245914Jt
    public C20246014Ju LIZIZ() {
        LIZ();
        C20246014Ju c20246014JuLJIIJJI = C20246014Ju.LJIIJJI(null, this.LIZJ);
        c20246014JuLJIIJJI.LIZ.LJIIZILJ(this.LIZIZ);
        c20246014JuLJIIJJI.LIZ.LJIJJ(this.LIZLLL);
        return c20246014JuLJIIJJI;
    }

    public C20245714Jr(C20246014Ju c20246014Ju) {
        super(c20246014Ju);
        this.LIZJ = c20246014Ju.LJIIJ();
    }

    @Override // X.C20245914Jt
    public void LJ(C20244914Jj c20244914Jj) {
        this.LIZLLL = c20244914Jj;
    }

    @Override // X.C20245914Jt
    public void LJI(C20244914Jj c20244914Jj) {
        WindowInsets windowInsets = this.LIZJ;
        if (windowInsets != null) {
            this.LIZJ = windowInsets.replaceSystemWindowInsets(c20244914Jj.LIZ, c20244914Jj.LIZIZ, c20244914Jj.LIZJ, c20244914Jj.LIZLLL);
        }
    }
}
