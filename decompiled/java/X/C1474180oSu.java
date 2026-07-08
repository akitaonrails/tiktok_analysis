package X;

import Y.ARunnableS56S0300000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0oSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474180oSu implements InvocationHandler {
    public final /* synthetic */ C1474170oSt LL;

    public C1474180oSu(C1474170oSt c1474170oSt) {
        this.LL = c1474170oSt;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!this.LL.LJ.booleanValue()) {
            C786410Ut5.LJL(this.LL.LIZJ, new ARunnableS56S0300000_23(this, method, objArr, 27));
            return null;
        }
        try {
            String name = method.getName();
            if ("positionChanged".equals(name)) {
                C1474170oSt c1474170oSt = this.LL;
                c1474170oSt.LIZJ.removeCallbacks(c1474170oSt.LJIIL);
                System.arraycopy(objArr, 0, this.LL.LIZLLL, 0, 5);
                C1474170oSt c1474170oSt2 = this.LL;
                C786410Ut5.LJL(c1474170oSt2.LIZJ, c1474170oSt2.LJIIL);
            } else if ("positionLost".equals(name)) {
                C1474170oSt c1474170oSt3 = this.LL;
                c1474170oSt3.LIZJ.removeCallbacks(c1474170oSt3.LJIIL);
                System.arraycopy(objArr, 0, this.LL.LIZLLL, 0, 1);
                C1474170oSt c1474170oSt4 = this.LL;
                C786410Ut5.LJL(c1474170oSt4.LIZJ, c1474170oSt4.LJIILIIL);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke2, e = ");
            sbLIZ.append(e);
            C20441214yg.LJ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
