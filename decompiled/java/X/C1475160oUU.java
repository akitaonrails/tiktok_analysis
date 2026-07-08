package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0oUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475160oUU implements InterfaceC1475620oVE {
    public C1477230oXp LIZ;
    public final /* synthetic */ SimVideoUrlModel LIZIZ;
    public final /* synthetic */ PreloadSessionManager.PreloadSession LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ C1475410oUt LJI;
    public final /* synthetic */ C0NKD LJII;
    public final /* synthetic */ C1475340oUm LJIIIIZZ;

    public final String LIZ() {
        if (this.LIZ == null) {
            LIZJ();
        }
        this.LJIIIIZZ.LIZ.LJIILLIIL(this.LIZIZ, this.LJ, this.LIZ.LIZJ);
        C1477230oXp c1477230oXp = this.LIZ;
        String str = c1477230oXp != null ? c1477230oXp.LIZJ : null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.LJFF)) {
            this.LJIIIIZZ.LIZ.LJLJJL(str, this.LJFF);
        }
        return str;
    }

    public final long LIZIZ() {
        if (this.LIZ == null) {
            LIZJ();
        }
        int size = this.LJ;
        if (this.LIZ != null) {
            int iPlayerAbPreloadSizeOffsetThresholdExp = this.LJIIIIZZ.LIZIZ.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
            InterfaceC1477220oXo interfaceC1477220oXo = this.LIZ.LIZLLL;
            if (interfaceC1477220oXo != null) {
                if (interfaceC1477220oXo.getSize() > this.LJ && this.LIZ.LIZLLL.getSize() - this.LJ <= iPlayerAbPreloadSizeOffsetThresholdExp) {
                    size = this.LIZ.LIZLLL.getSize();
                }
            } else if (this.LIZIZ.getSize() > this.LJ && this.LIZIZ.getSize() - ((long) this.LJ) <= iPlayerAbPreloadSizeOffsetThresholdExp) {
                size = (int) this.LIZIZ.getSize();
            }
        }
        return size;
    }

    public final String[] LIZJ() {
        String[] strArr;
        int i;
        if (this.LIZ == null) {
            int averageSpeedInKBps = this.LJIIIIZZ.LIZ.LJJIII.getSpeedManager().getAverageSpeedInKBps();
            if (averageSpeedInKBps <= 0.0d && (i = EnginePreloader.LJJIL) > 0) {
                averageSpeedInKBps = i;
            }
            EnginePreloader.LJJIL = averageSpeedInKBps;
            this.LIZ = this.LJIIIIZZ.LIZIZ.createVideoUrlProcessor().LJ(this.LIZIZ, C1480850odf.LIZJ.getPlayerType());
            if (this.LIZJ != null && (this.LJIIIIZZ.LIZ.LJJJJL(this.LIZIZ) <= 0 || this.LIZLLL)) {
                this.LIZJ.speed = averageSpeedInKBps;
            }
        }
        C1477230oXp c1477230oXp = this.LIZ;
        if (c1477230oXp != null && (strArr = c1477230oXp.LIZ) != null && strArr.length > 0 && !TextUtils.isEmpty(this.LIZIZ.getSourceId())) {
            C1477400oY6.LJJJJI.LJJIJIIJIL(this.LIZIZ.getSourceId(), this.LIZ.LIZLLL);
        }
        C1477230oXp c1477230oXp2 = this.LIZ;
        if (c1477230oXp2 != null) {
            return c1477230oXp2.LIZ;
        }
        return null;
    }

    public C1475160oUU(C1475340oUm c1475340oUm, SimVideoUrlModel simVideoUrlModel, PreloadSessionManager.PreloadSession preloadSession, boolean z, int i, String str, C1475410oUt c1475410oUt, C0NKD c0nkd) {
        this.LJIIIIZZ = c1475340oUm;
        this.LIZIZ = simVideoUrlModel;
        this.LIZJ = preloadSession;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = str;
        this.LJI = c1475410oUt;
        this.LJII = c0nkd;
    }
}
