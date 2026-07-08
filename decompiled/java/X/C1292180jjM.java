package X;

import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1292180jjM implements InterfaceC2247461Cxs {
    public final /* synthetic */ C1292170jjL LIZ;

    @Override // X.InterfaceC2247461Cxs
    public final int LIZ() {
        return this.LIZ.LLILZLL.getCurFrame();
    }

    public C1292180jjM(C1292170jjL c1292170jjL) {
        this.LIZ = c1292170jjL;
    }

    @Override // X.InterfaceC2247461Cxs
    public final void LIZIZ(Surface surface) {
        if (surface.isValid()) {
            Surface surface2 = this.LIZ.LLIZ;
            if (surface2 != null) {
                surface2.release();
            }
            C1292170jjL c1292170jjL = this.LIZ;
            c1292170jjL.LLIZ = surface;
            c1292170jjL.LL = true;
            try {
                C1292170jjL c1292170jjL2 = this.LIZ;
                c1292170jjL2.LLILZLL.setSurface(c1292170jjL2.LLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZ.LLILZLL.resume();
        }
    }
}
