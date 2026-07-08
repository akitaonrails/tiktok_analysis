package X;

import Y.ARunnableS56S0300000_23;
import android.view.SurfaceView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0oSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474120oSo implements InvocationHandler {
    public final /* synthetic */ SurfaceView LL;
    public final /* synthetic */ C1474110oSn LLILLJJLI;

    public C1474120oSo(C1474110oSn c1474110oSn, SurfaceView surfaceView) {
        this.LLILLJJLI = c1474110oSn;
        this.LL = surfaceView;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("proxyPositionChangeListener, invoke method ");
        sbLIZ.append(method.getName());
        sbLIZ.append(", surface = ");
        sbLIZ.append(this.LL.getHolder().getSurface());
        C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILLJJLI.LJ.booleanValue()) {
            C786410Ut5.LJL(this.LLILLJJLI.LIZJ, new ARunnableS56S0300000_23(this, method, objArr, 31));
            return null;
        }
        try {
            String name = method.getName();
            if ("positionChanged".equals(name)) {
                C1474110oSn c1474110oSn = this.LLILLJJLI;
                c1474110oSn.LIZJ.removeCallbacks(c1474110oSn.LJIILIIL);
                C1474110oSn c1474110oSn2 = this.LLILLJJLI;
                c1474110oSn2.LJIIIZ++;
                System.arraycopy(objArr, 0, c1474110oSn2.LIZLLL, 0, 5);
                C1474110oSn c1474110oSn3 = this.LLILLJJLI;
                C786410Ut5.LJL(c1474110oSn3.LIZJ, c1474110oSn3.LJIILIIL);
            } else if ("positionLost".equals(name)) {
                C1474110oSn c1474110oSn4 = this.LLILLJJLI;
                c1474110oSn4.LIZJ.removeCallbacks(c1474110oSn4.LJIILIIL);
                System.arraycopy(objArr, 0, this.LLILLJJLI.LIZLLL, 0, 1);
                C1474110oSn c1474110oSn5 = this.LLILLJJLI;
                C786410Ut5.LJL(c1474110oSn5.LIZJ, c1474110oSn5.LJIILJJIL);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
