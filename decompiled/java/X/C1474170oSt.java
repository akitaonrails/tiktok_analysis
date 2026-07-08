package X;

import Y.ARunnableS123S0100000_23;
import android.os.Build;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.0oSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474170oSt {
    public static Field LJIILJJIL;
    public static Class LJIILL;
    public static Field LJIILLIIL;
    public static Method LJIIZILJ;
    public static Method LJIJ;
    public static Class LJIJI;
    public static Method LJIJJ;
    public static Method LJIJJLI;
    public Object LIZ;
    public Object LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final Object[] LIZLLL = new Object[5];
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public SurfaceView LJIIIIZZ;
    public boolean LJIIIZ;
    public Object LJIIJ;
    public Surface LJIIJJI;
    public final ARunnableS123S0100000_23 LJIIL;
    public final ARunnableS123S0100000_23 LJIILIIL;

    public final boolean LIZ() {
        boolean zIsValid;
        try {
            if (this.LJIIJ == null) {
                Method declaredMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                declaredMethod.setAccessible(true);
                this.LJIIJ = declaredMethod.invoke(this.LJIIIIZZ, new Object[0]);
            }
            if (this.LJIIJJI == null) {
                Field declaredField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mSurface");
                declaredField.setAccessible(true);
                this.LJIIJJI = (Surface) declaredField.get(this.LJIIJ);
            }
            zIsValid = this.LJIIJJI.isValid();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isMainSurfaceValid, e = ");
            sbLIZ.append(e);
            C20441214yg.LJ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
            zIsValid = false;
        }
        SurfaceView surfaceView = this.LJIIIIZZ;
        return (surfaceView == null || surfaceView.getHolder() == null || this.LJIIIIZZ.getHolder().getSurface() == null || !this.LJIIIIZZ.getHolder().getSurface().isValid() || !zIsValid) ? false : true;
    }

    public C1474170oSt() {
        Boolean bool = Boolean.FALSE;
        this.LJ = bool;
        this.LJFF = bool;
        this.LJI = bool;
        this.LJII = Boolean.TRUE;
        this.LJIIIZ = false;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = new ARunnableS123S0100000_23(this, 209);
        this.LJIILIIL = new ARunnableS123S0100000_23(this, 210);
    }

    public final void LIZIZ(SurfaceView surfaceView) {
        if (Build.VERSION.SDK_INT != 29) {
            return;
        }
        this.LJIIIIZZ = surfaceView;
        this.LJ = Boolean.valueOf(SurfaceViewAndroid10Workaround.isOptimizePositionChangeProxy());
        this.LJFF = Boolean.valueOf(SurfaceViewAndroid10Workaround.isFurtherOptimizePositionChangeProxy());
        this.LJI = Boolean.valueOf(SurfaceViewAndroid10Workaround.isProxyPositionChangeListenerOfSurfaceViewOtherPlan());
        this.LJII = Boolean.valueOf(SurfaceViewAndroid10Workaround.isProxyPositionChangeListenerEnableMainSurfaceValidation());
        try {
            if (LJIILJJIL == null) {
                Field declaredField = SurfaceView.class.getDeclaredField("mPositionListener");
                LJIILJJIL = declaredField;
                declaredField.setAccessible(true);
            }
            if (this.LIZ == null) {
                this.LIZ = LJIILJJIL.get(surfaceView);
            }
            if (LJIILLIIL == null) {
                Field declaredField2 = View.class.getDeclaredField("mRenderNode");
                LJIILLIIL = declaredField2;
                declaredField2.setAccessible(true);
            }
            if (LJIILL == null) {
                LJIILL = Class.forName("android.graphics.RenderNode");
            }
            if (LJIJI == null) {
                LJIJI = Class.forName("android.graphics.RenderNode$PositionUpdateListener");
            }
            if (LJIJ == null) {
                Method declaredMethod = LJIILL.getDeclaredMethod("addPositionUpdateListener", LJIJI);
                LJIJ = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (LJIIZILJ == null) {
                Method declaredMethod2 = LJIILL.getDeclaredMethod("removePositionUpdateListener", LJIJI);
                LJIIZILJ = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            if (LJIJJ == null) {
                Class cls = LJIJI;
                Class<?> cls2 = Integer.TYPE;
                Method declaredMethod3 = cls.getDeclaredMethod("positionChanged", Long.TYPE, cls2, cls2, cls2, cls2);
                LJIJJ = declaredMethod3;
                declaredMethod3.setAccessible(true);
            }
            if (LJIJJLI == null) {
                Method declaredMethod4 = LJIJI.getDeclaredMethod("positionLost", Long.TYPE);
                LJIJJLI = declaredMethod4;
                declaredMethod4.setAccessible(true);
            }
            if (this.LIZIZ == null) {
                this.LIZIZ = Proxy.newProxyInstance(LJIJI.getClassLoader(), new Class[]{LJIJI}, new C1474180oSu(this));
            }
            LJIIZILJ.invoke(LJIILLIIL.get(surfaceView), this.LIZ);
            if (this.LJI.booleanValue()) {
                C20441214yg.LJ("SurfaceView", "sAddPositionListenerMethod null");
            } else {
                C20441214yg.LJ("SurfaceView", "sAddPositionListenerMethod mPositionListenerProxy");
                LJIJ.invoke(LJIILLIIL.get(surfaceView), this.LIZIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("proxyPositionChangeListener, e = ");
            sbLIZ.append(e);
            C20441214yg.LJ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
