package X;

import Y.ARunnableS0S0200200_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS3S0400100_20;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.lyrax.video.RenderReportSetting;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273620jFQ {
    public final RenderReportSetting LIZ;
    public final C1266350j3h LIZIZ;
    public int LIZJ;
    public JSONArray LIZLLL;
    public JSONArray LJ;
    public JSONArray LJFF;
    public JSONArray LJI;
    public final SafeHandlerThread LJII;
    public final LruCache<Long, Long> LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public int LJIILJJIL;
    public final CopyOnWriteArrayList<InterfaceC1273640jFS> LJIILL;
    public final C1276180jJY LJIILLIIL;
    public final ARunnableS120S0100000_20 LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public final C1273630jFR LJIJJ;
    public final C1273630jFR LJIJJLI;
    public final C1273630jFR LJIL;
    public final C1273630jFR LJJ;
    public final ArrayList<C1273630jFR> LJJI;
    public long LJJIFFI;
    public int LJJII;
    public int LJJIII;

    public final long LIZ() {
        C1273630jFR c1273630jFR = this.LJIJJLI;
        long j = c1273630jFR.LIZLLL;
        int i = c1273630jFR.LJIIIIZZ;
        if (i > 0) {
            return j / ((long) i);
        }
        return 0L;
    }

    public final void LIZJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LJIJI;
        if (j != -1) {
            this.LJIIJJI += jCurrentTimeMillis - j;
            this.LJIIL++;
        }
        this.LJIJI = jCurrentTimeMillis;
    }

    public final void LIZIZ(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LJIIIZ == -1) {
            this.LJIIIZ = jCurrentTimeMillis;
            return;
        }
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = jCurrentTimeMillis - this.LJIIIZ;
        this.LJIIIZ = jCurrentTimeMillis;
        this.LJII.post(new ARunnableS0S0200200_20(this, j, c238400w2, jCurrentTimeMillis, 0));
    }

    public C1273620jFQ(RenderReportSetting renderReportSetting, C1266350j3h c1266350j3h) {
        this.LIZ = renderReportSetting;
        this.LIZIZ = c1266350j3h;
        this.LIZJ = renderReportSetting.sampleCount;
        new JSONObject();
        this.LIZLLL = new JSONArray();
        this.LJ = new JSONArray();
        this.LJFF = new JSONArray();
        this.LJI = new JSONArray();
        SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(19, "LiveCoreLogUploadThread");
        this.LJII = safeHandlerThreadLIZIZ;
        this.LJIIIIZZ = new LruCache<>(20);
        this.LJIIIZ = -1L;
        this.LJIILL = new CopyOnWriteArrayList<>();
        this.LJIILLIIL = new C1276180jJY();
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 349);
        this.LJIIZILJ = aRunnableS120S0100000_20;
        try {
            safeHandlerThreadLIZIZ.start();
            if (renderReportSetting.enable2sJankCallback) {
                safeHandlerThreadLIZIZ.postDelayed(aRunnableS120S0100000_20, 2000L);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LJIJ = -1L;
        this.LJIJI = -1L;
        C1273630jFR c1273630jFR = new C1273630jFR("preprocessing_process_time");
        this.LJIJJ = c1273630jFR;
        C1273630jFR c1273630jFR2 = new C1273630jFR("preEffect");
        C1273630jFR c1273630jFR3 = new C1273630jFR("effect_process_time");
        this.LJIJJLI = c1273630jFR3;
        C1273630jFR c1273630jFR4 = new C1273630jFR("bmf_process_time");
        this.LJIL = c1273630jFR4;
        C1273630jFR c1273630jFR5 = new C1273630jFR("bmf_process_time");
        this.LJJ = c1273630jFR5;
        C1273630jFR c1273630jFR6 = new C1273630jFR("postEffect");
        ArrayList<C1273630jFR> arrayList = new ArrayList<>();
        this.LJJI = arrayList;
        this.LJJIFFI = -1L;
        arrayList.add(c1273630jFR);
        arrayList.add(c1273630jFR2);
        arrayList.add(c1273630jFR3);
        arrayList.add(c1273630jFR4);
        arrayList.add(c1273630jFR5);
        arrayList.add(c1273630jFR6);
    }

    public final void LIZLLL(C1273630jFR c1273630jFR, C1272590jDl c1272590jDl) {
        if (!this.LIZ.enableNodeCostCalculate) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C238400w2 c238400w2 = new C238400w2();
        long j = this.LJIJ;
        if (j > 0) {
            c238400w2.element = jCurrentTimeMillis - j;
        }
        this.LJII.post(new ARunnableS3S0400100_20(c1272590jDl, jCurrentTimeMillis, c1273630jFR, c238400w2, this, 2));
        this.LJIJ = jCurrentTimeMillis;
        RenderReportSetting renderReportSetting = this.LIZ;
        if (renderReportSetting.enableFrameJankReport) {
            long j2 = this.LJJIFFI;
            if (j2 == -1) {
                this.LJJIFFI = jCurrentTimeMillis;
                return;
            }
            boolean z = renderReportSetting.debug;
            if (jCurrentTimeMillis - j2 <= renderReportSetting.timerInterval * LSPassThroughRecordSizeConfig.DEFAULT) {
                return;
            }
            int i = this.LJJIII;
            if (i > renderReportSetting.maxTimeInTimerInterval) {
                this.LIZJ += 10;
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reportSampleCount += 10, reportSampleCount = ");
                    sbLIZ.append(this.LIZJ);
                    AVLog.d("RenderCostManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (i < renderReportSetting.lowerGradeTimeInTimerInterval) {
                int i2 = this.LIZJ - 10;
                if (i2 > 0) {
                    this.LIZJ = i2;
                }
                if (z) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("reportSampleCount -= 10, reportSampleCount = ");
                    sbLIZ2.append(this.LIZJ);
                    AVLog.d("RenderCostManager", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            this.LJJIFFI = jCurrentTimeMillis;
            this.LJJIII = 0;
        }
    }
}
