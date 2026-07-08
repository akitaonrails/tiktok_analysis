package X;

import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.strategy.LinkMicLayoutConfig;

/* JADX INFO: renamed from: X.0jGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274120jGE {
    public final C1274810jHL LIZ;
    public final AbstractC1273900jFs LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public String LJFF;
    public String LJI;

    public static final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumeNonSimulcastIfNeed simulcastInvokedByChannelBase:");
        sbLIZ.append(false);
        AVLog.logKibana(2, "ChannelBaseController", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeSchedulerIfNeed() called removeSchedulerWhenExit:");
        sbLIZ.append(this.LIZLLL);
        AVLog.logKibana(2, "ChannelBaseController", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.LIZLLL) {
            this.LIZIZ.LLJLLL();
            this.LIZLLL = false;
        }
    }

    public final void LIZJ(boolean z) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shutdownTTLHAdaptiveSimulcast() called with: exit = [");
        sbLIZ.append(z);
        sbLIZ.append(" simulcastFeatTTLHAdaptiveInvokedByChannelBase:");
        sbLIZ.append(this.LIZJ);
        AVLog.logKibana(2, "ChannelBaseController", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.LIZJ) {
            C1274110jGD c1274110jGD = this.LIZ.LJJZZIII;
            c1274110jGD.LJIIIZ.LLD().LJJIJ = true;
            c1274110jGD.LJIIIZ.LLD().LJJIJIL = 76800;
            if (!z && c1274110jGD.LJ != null) {
                TEBundle tEBundle = new TEBundle();
                LinkMicLayoutConfig linkMicLayoutConfig = c1274110jGD.LJ;
                int i2 = linkMicLayoutConfig.captureWidth;
                if (i2 > 0 && (i = linkMicLayoutConfig.captureHeight) > 0 && c1274110jGD.LJIIIZ != null) {
                    c1274110jGD.LIZIZ(i2, i, tEBundle);
                }
                LinkMicLayoutConfig linkMicLayoutConfig2 = c1274110jGD.LJ;
                int i3 = linkMicLayoutConfig2.resEffectWidth;
                if (i3 > 0 && linkMicLayoutConfig2.resEffectHeight > 0) {
                    tEBundle.setInt("cap_adapted_width", i3);
                    tEBundle.setInt("cap_adapted_height", c1274110jGD.LJ.resEffectHeight);
                }
                c1274110jGD.LJIIIZ.LJJLIIJ(tEBundle);
                tEBundle.release();
            }
            c1274110jGD.LIZLLL = null;
            c1274110jGD.LJ = null;
            c1274110jGD.LIZ = null;
            c1274110jGD.LJIIIIZZ = null;
            c1274110jGD.LJIILJJIL = null;
            c1274110jGD.LJIILIIL = null;
            c1274110jGD.LJIIL = null;
            C1274110jGD c1274110jGD2 = this.LIZ.LJJZZIII;
            c1274110jGD2.LJI = false;
            c1274110jGD2.LJJ();
            c1274110jGD2.LJIIIZ.LJLIL();
            this.LIZJ = false;
        }
    }

    public C1274120jGE(AbstractC1273900jFs abstractC1273900jFs, C1274810jHL c1274810jHL) {
        this.LIZ = c1274810jHL;
        this.LIZIZ = abstractC1273900jFs;
    }
}
