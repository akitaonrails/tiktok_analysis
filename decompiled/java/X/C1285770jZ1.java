package X;

import com.lynx.animax.service.IAnimaXMonitorService;
import com.lynx.animax.util.AnimaXMetricsCallback;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285770jZ1 extends C1288120jco {
    public final C1285750jYz LIZ;
    public WeakReference<InterfaceC1288650jdf> LIZIZ;
    public boolean LIZJ;
    public final Map<String, Object> LIZLLL = new ConcurrentHashMap();
    public long LJ;
    public int LJFF;
    public int LJI;
    public final long LJII;

    public C1285770jZ1(C1285750jYz c1285750jYz) {
        this.LIZ = c1285750jYz;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJII = jCurrentTimeMillis;
        this.LJ = jCurrentTimeMillis;
    }

    @Override // X.C1288120jco, X.InterfaceC1288110jcn
    public final void LIZJ(C1288070jcj c1288070jcj) {
        LJIIL(false);
    }

    @Override // X.C1288120jco, X.InterfaceC1288110jcn
    public final void LJIIIIZZ(C1288060jci c1288060jci) {
        IAnimaXMonitorService iAnimaXMonitorService = (IAnimaXMonitorService) this.LIZ.LIZ(IAnimaXMonitorService.class);
        if (iAnimaXMonitorService != null) {
            iAnimaXMonitorService.reportError(c1288060jci);
        }
    }

    public final void LJIIL(boolean z) {
        this.LJFF++;
        if (z) {
            this.LJI++;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.LIZJ || this.LJI >= 5 || jCurrentTimeMillis - this.LJ >= 300000) {
            LJIILIIL("onPlay");
            this.LIZJ = true;
            this.LJ = jCurrentTimeMillis;
        }
    }

    public final void LJIILIIL(String str) {
        InterfaceC1288650jdf interfaceC1288650jdf;
        IAnimaXMonitorService iAnimaXMonitorService = (IAnimaXMonitorService) this.LIZ.LIZ(IAnimaXMonitorService.class);
        WeakReference<InterfaceC1288650jdf> weakReference = this.LIZIZ;
        if (weakReference != null && (interfaceC1288650jdf = weakReference.get()) != null && iAnimaXMonitorService != null) {
            HashMap map = new HashMap(this.LIZLLL);
            int i = this.LJFF;
            if (i > 0) {
                map.put("play_count", Integer.valueOf(i));
                this.LJFF = 0;
                this.LJI = 0;
            }
            interfaceC1288650jdf.LJFF(new AnimaXMetricsCallback(iAnimaXMonitorService, str, map));
        }
    }
}
