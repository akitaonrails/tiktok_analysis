package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.playerkit.model.LoadControlConfig;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.ttm.player.LoadControl;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: X.0oRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473330oRX extends LoadControl {
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJJII;
    public int LJJIIJZLJL;
    public WeakReference<InterfaceC1471960oPK> LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public int LIZIZ = -1;
    public int LIZJ = 200;
    public int LIZLLL = LSPassThroughRecordSizeConfig.DEFAULT;
    public int LJ = 5000;
    public float LJFF = 9.0f;
    public int LJI = 200;
    public int LJII = 100;
    public long LJIILIIL = -1;
    public long LJIJJLI = -1;
    public long LJIL = -1;
    public double LJJ = -1.0d;
    public long LJJI = -1;
    public long LJJIFFI = -1;
    public final LoadControlConfig LJJIII = (LoadControlConfig) C1474810oTv.LJJJJLL.getValue();
    public Queue<Long> LJJIIJ = new LinkedList();

    public final void LIZIZ() {
        this.LJIIIIZZ = 0;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILIIL = -1L;
        this.LJIILLIIL = 0;
        this.LJIILL = false;
        this.LJIIIZ = 0;
        this.LJJIIJ = new LinkedList();
        this.LJIJJLI = -1L;
        this.LJIL = -1L;
        this.LJJ = -1.0d;
        this.LJJI = -1L;
        this.LJJIFFI = -1L;
        this.LJJII = 0;
        this.LJJIIZI = false;
    }

    public final double LIZ() {
        LoadControlConfig loadControlConfig = this.LJJIII;
        if (loadControlConfig == null) {
            return this.LIZLLL;
        }
        double dPow = loadControlConfig.videoDurationParamA * Math.pow(((double) this.LJJIIJZLJL) / 1000.0d, loadControlConfig.videoDurationParamB);
        LoadControlConfig loadControlConfig2 = this.LJJIII;
        return (((-1.0d) / (dPow + loadControlConfig2.videoDurationParamC)) + loadControlConfig2.videoDurationParamD) * 1000.0d;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onCodecStackSelected(int i) {
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            return this.LJIJ;
        }
        return this.LJIIZILJ;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onFilterStackSelected(int i) {
        if (i != 2) {
            return 0;
        }
        return this.LJIJI;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onTrackSelected(int i) {
        if (this.LJIILL) {
            return this.LJIILLIIL;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        if (r12 > r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        r11.LJIIL = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        if (r12 > r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        if (r11.LJIIL != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r11.LJIIL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(long r12, boolean r14) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1473330oRX.LIZJ(long, boolean):boolean");
    }

    @Override // com.ss.ttm.player.LoadControl
    public final boolean shouldStartPlayback(long j, float f, boolean z) {
        Session sessionLJIIIZ;
        int i;
        LoadControlConfig loadControlConfig;
        LoadControlConfig loadControlConfig2 = this.LJJIII;
        if (loadControlConfig2 != null && loadControlConfig2.enable) {
            if (loadControlConfig2.enableStrategyOld()) {
                if (this.LJJIIZI && (loadControlConfig = this.LJJIII) != null && loadControlConfig.enableAdjustAfterSeek) {
                    if (j >= loadControlConfig.minBufferThresholdAfterSeek) {
                        return true;
                    }
                    return false;
                }
                if (z) {
                    if (j == 0 && this.LJIL != -1) {
                        return false;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (this.LJIL == -1 && this.LJIJJLI == -1) {
                        this.LJIL = jElapsedRealtime;
                        this.LJIJJLI = j;
                    }
                    long j2 = this.LJJI;
                    if (j2 != -1) {
                        if (this.LJJIFFI != -1 && j >= j2) {
                            this.LJJ = ((j - j2) * 1.0d) / (jElapsedRealtime - r0);
                            LoadControlConfig loadControlConfig3 = this.LJJIII;
                            double d = loadControlConfig3.speedThreshold * ((double) f);
                            if (loadControlConfig3.enableStrategyOld() && this.LJJIII.enableLatestSpeedParam && this.LJJ > d) {
                                this.LJJII++;
                            }
                        }
                    }
                    LoadControlConfig loadControlConfig4 = this.LJJIII;
                    if (loadControlConfig4 != null && this.LJJII > loadControlConfig4.latestSpeedFilterCnt && (!loadControlConfig4.enableMinBufferThreshold || j >= LIZ())) {
                        this.LJIJJLI = -1L;
                        this.LJIL = -1L;
                        this.LJJ = -1.0d;
                        this.LJJI = -1L;
                        this.LJJIFFI = -1L;
                        this.LJJII = 0;
                        return true;
                    }
                    this.LJJI = j;
                    this.LJJIFFI = jElapsedRealtime;
                    return false;
                }
                LoadControlConfig loadControlConfig5 = this.LJJIII;
                if (loadControlConfig5 != null && loadControlConfig5.enableAdjustWhenNotRebuffering) {
                    if (j >= LIZ()) {
                        return true;
                    }
                    return false;
                }
                if (this.LJIIJ) {
                    i = this.LIZJ;
                } else {
                    i = this.LIZLLL;
                }
                if (j >= i) {
                    return true;
                }
                return false;
            }
            if (this.LJJIII.enableStrategySeal()) {
                if (z) {
                    this.LJJIII.getClass();
                } else {
                    InterfaceC1471960oPK interfaceC1471960oPK = this.LJJIIZ.get();
                    if (interfaceC1471960oPK != null) {
                        String sourceId = interfaceC1471960oPK.getSourceId();
                        if (!TextUtils.isEmpty(sourceId) && (sessionLJIIIZ = C1477400oY6.LJJJJI.LJIIIZ(sourceId)) != null && sessionLJIIIZ.urlModel != null && this.LJJIII.validCacheSize > 0) {
                            C607330Nrv.LIZ.LIZ().isCacheAboveOrComplete(sessionLJIIIZ.urlModel, this.LJJIII.validCacheSize);
                        }
                        this.LJJIII.getClass();
                    }
                }
                return LIZJ(j, z);
            }
            return LIZJ(j, z);
        }
        return LIZJ(j, z);
    }
}
