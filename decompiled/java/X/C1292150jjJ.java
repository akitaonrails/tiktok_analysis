package X;

import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1292150jjJ implements InterfaceC2247461Cxs {
    public final /* synthetic */ C1292130jjH LIZ;

    @Override // X.InterfaceC2247461Cxs
    public final int LIZ() {
        return this.LIZ.LLJJIJI.getCurFrame();
    }

    public C1292150jjJ(C1292130jjH c1292130jjH) {
        this.LIZ = c1292130jjH;
    }

    @Override // X.InterfaceC2247461Cxs
    public final void LIZIZ(Surface surface) {
        if (surface.isValid()) {
            Surface surface2 = this.LIZ.LLJJIJIIJIL;
            if (surface2 != null) {
                surface2.release();
            }
            C1292130jjH c1292130jjH = this.LIZ;
            c1292130jjH.LLJJIJIIJIL = surface;
            c1292130jjH.LLJILJILJ = true;
            try {
                C1292130jjH c1292130jjH2 = this.LIZ;
                c1292130jjH2.LLJJIJI.setSurface(c1292130jjH2.LLJJIJIIJIL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZ.LLJJIJI.resume();
        }
    }
}
