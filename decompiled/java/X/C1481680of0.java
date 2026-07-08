package X;

import Y.ARunnableS123S0100000_23;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0of0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481680of0 implements IPlayerEventReporter {
    public UpdateCallback LIZ;

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void init() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void release() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LIZIZ(UpdateCallback updateCallback) {
        this.LIZ = updateCallback;
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIJJI(C1481580oeq c1481580oeq) {
        C1482030ofZ c1482030ofZ = new C1482030ofZ(0);
        UpdateCallback updateCallback = this.LIZ;
        C1481570oep c1481570oep = c1482030ofZ.LIZ;
        c1481570oep.LIZ = updateCallback;
        c1481570oep.LIZIZ = c1481580oeq;
        if (C625790Ogb.LIZ() && C1475000oUE.LJI() == null) {
            throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
        }
        if (C1474810oTv.LJJJJZ()) {
            c1481570oep.LIZ();
            return;
        }
        ExecutorService executorServiceLJI = C1475000oUE.LJI();
        if (executorServiceLJI == null) {
            return;
        }
        executorServiceLJI.execute(new ARunnableS123S0100000_23(c1481570oep, 186));
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJII(C1481720of4 c1481720of4, VideoInfo videoInfo) {
        C1481710of3 c1481710of3 = new C1482000ofW(0).LIZ;
        c1481710of3.LIZ = videoInfo;
        c1481710of3.LIZIZ = c1481720of4;
        if (C625790Ogb.LIZ() && C1475000oUE.LJI() == null) {
            throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
        }
        if (C1474810oTv.LJJJJZ()) {
            c1481710of3.LIZ();
            return;
        }
        ExecutorService executorServiceLJI = C1475000oUE.LJI();
        if (executorServiceLJI == null) {
            return;
        }
        executorServiceLJI.execute(new ARunnableS123S0100000_23(c1481710of3, 183));
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIL(C1481840ofG c1481840ofG, VideoInfo videoInfo) {
        C1481750of7 c1481750of7 = new C1482010ofX(0).LIZ;
        c1481750of7.getClass();
        c1481750of7.LIZ = c1481840ofG;
        if (C625790Ogb.LIZ() && C1475000oUE.LJI() == null) {
            throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
        }
        if (C1474810oTv.LJJJJZ()) {
            c1481750of7.LIZ();
            return;
        }
        ExecutorService executorServiceLJI = C1475000oUE.LJI();
        if (executorServiceLJI == null) {
            return;
        }
        executorServiceLJI.execute(new ARunnableS123S0100000_23(c1481750of7, 184));
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIILJJIL(C1481560oeo c1481560oeo, VideoInfo videoInfo) {
        C1481510oej c1481510oej = new C1482020ofY(0).LIZ;
        c1481510oej.LIZ = videoInfo;
        c1481510oej.LIZIZ = this.LIZ;
        c1481510oej.LIZJ = c1481560oeo;
        if (C625790Ogb.LIZ() && C1475000oUE.LJI() == null) {
            throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
        }
        if (C1474810oTv.LJJJJZ()) {
            c1481510oej.LIZ();
            return;
        }
        ExecutorService executorServiceLJI = C1475000oUE.LJI();
        if (executorServiceLJI == null) {
            return;
        }
        executorServiceLJI.execute(new ARunnableS123S0100000_23(c1481510oej, 185));
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIILL(C1481850ofH c1481850ofH, VideoInfo videoInfo) {
        C1481760of8 c1481760of8 = new C1482040ofa(0).LIZ;
        c1481760of8.getClass();
        c1481760of8.LIZ = c1481850ofH;
        if (C625790Ogb.LIZ() && C1475000oUE.LJI() == null) {
            throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
        }
        if (C1474810oTv.LJJJJZ()) {
            c1481760of8.LIZ();
            return;
        }
        ExecutorService executorServiceLJI = C1475000oUE.LJI();
        if (executorServiceLJI == null) {
            return;
        }
        executorServiceLJI.execute(new ARunnableS123S0100000_23(c1481760of8, 188));
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LIZJ(int i, VideoInfo videoInfo, C1482260ofw c1482260ofw) {
        C1482050ofb c1482050ofb = new C1482050ofb(0);
        UpdateCallback updateCallback = this.LIZ;
        C1481660oey c1481660oey = c1482050ofb.LIZ;
        c1481660oey.LIZIZ = updateCallback;
        c1481660oey.LIZ = i;
        c1481660oey.LIZJ = videoInfo;
        c1481660oey.LIZLLL = c1482260ofw;
        if (C625790Ogb.LIZ() && C1475000oUE.LJI() == null) {
            throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
        }
        if (C1474810oTv.LJJJJZ()) {
            c1481660oey.LIZ();
            return;
        }
        ExecutorService executorServiceLJI = C1475000oUE.LJI();
        if (executorServiceLJI == null) {
            return;
        }
        executorServiceLJI.execute(new ARunnableS123S0100000_23(c1481660oey, 189));
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIIIZZ(String str, VideoInfo videoInfo, C1481340oeS c1481340oeS) {
        int i;
        String str2;
        if (c1481340oeS.LIZ == 0) {
            SimRadar.analyzer().getClass();
            C1472910oQr.LIZIZ("SF-Unsorted");
            if (str == null) {
                str2 = "id-null";
            } else {
                str2 = str;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(':');
            sbLIZ.append(c1481340oeS);
            SimRadar.errorScan("BytedancePlayerReportImpl", "reportVideoStop", new C1473290oRT(C2188811AlT.LIZIZ(sbLIZ)), new Object[0]);
        }
        SimRadar.analyzer().getClass();
        C1473150oRF c1473150oRFLIZ = C1472910oQr.LIZ(str);
        if (c1473150oRFLIZ != null) {
            c1473150oRFLIZ.LJ();
        }
        SimRadar.analyzer().getClass();
        C1473150oRF c1473150oRFLIZ2 = C1472910oQr.LIZ(str);
        if (c1473150oRFLIZ2 != null) {
            i = c1473150oRFLIZ2.LIZJ;
        } else {
            i = -1;
        }
        c1481340oeS.LIZ(Integer.valueOf(i), "sim_error_type");
        C1481350oeT c1481350oeT = new C1481420oea(0).LIZ;
        c1481350oeT.LIZ = videoInfo;
        c1481350oeT.LIZIZ = c1481340oeS;
        if (C625790Ogb.LIZ() && C1475000oUE.LJI() == null) {
            throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
        }
        if (C1474810oTv.LJJJJZ()) {
            c1481350oeT.LIZIZ();
            return;
        }
        ExecutorService executorServiceLJI = C1475000oUE.LJI();
        if (executorServiceLJI == null) {
            return;
        }
        executorServiceLJI.execute(new ARunnableS123S0100000_23(c1481350oeT, 187));
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIILIIL(VideoInfo videoInfo, C1481690of1 c1481690of1, long j, String str, boolean z) {
        String str2;
        if (z) {
            str2 = "B-Net";
        } else {
            str2 = "B-Normal";
        }
        C1472910oQr c1472910oQrAnalyzer = SimRadar.analyzer();
        videoInfo.getAid();
        c1472910oQrAnalyzer.getClass();
        C1472910oQr.LIZIZ(str2);
        SimRadar.keyScan("BytedancePlayerReportImpl", "reportBlock", c1481690of1.toString());
        C1481670oez c1481670oez = new C1481990ofV(0).LIZ;
        c1481670oez.LIZIZ = str;
        c1481670oez.LIZ = j;
        c1481670oez.LIZJ = z;
        c1481670oez.LJ = videoInfo;
        c1481670oez.LIZLLL = this.LIZ;
        c1481670oez.LJFF = c1481690of1;
        if (C625790Ogb.LIZ() && C1475000oUE.LJI() == null) {
            throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
        }
        if (C1474810oTv.LJJJJZ()) {
            c1481670oez.LIZ();
            return;
        }
        ExecutorService executorServiceLJI = C1475000oUE.LJI();
        if (executorServiceLJI == null) {
            return;
        }
        executorServiceLJI.execute(new ARunnableS123S0100000_23(c1481670oez, 182));
    }
}
