package X;

import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0oSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474110oSn {
    public static Field LJIILL;
    public static Class LJIILLIIL;
    public static Field LJIIZILJ;
    public static Method LJIJ;
    public static Method LJIJI;
    public static Class LJIJJ;
    public static Method LJIJJLI;
    public static Method LJIL;
    public Object LIZ;
    public Object LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final Object[] LIZLLL = new Object[5];
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public SurfaceView LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public Object LJIIJJI;
    public Surface LJIIL;
    public final ARunnableS123S0100000_23 LJIILIIL;
    public final ARunnableS123S0100000_23 LJIILJJIL;

    public final boolean LIZ() {
        try {
            if (this.LJIIJJI == null) {
                Method declaredMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                declaredMethod.setAccessible(true);
                this.LJIIJJI = declaredMethod.invoke(this.LJIIIIZZ, new Object[0]);
            }
            if (this.LJIIL == null) {
                Field declaredField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mSurface");
                declaredField.setAccessible(true);
                this.LJIIL = (Surface) declaredField.get(this.LJIIJJI);
            }
            return this.LJIIL.isValid();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public C1474110oSn() {
        Boolean bool = Boolean.FALSE;
        this.LJ = bool;
        this.LJFF = bool;
        this.LJI = bool;
        this.LJII = bool;
        this.LJIIJ = false;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = new ARunnableS123S0100000_23(this, 223);
        this.LJIILJJIL = new ARunnableS123S0100000_23(this, 224);
    }
}
