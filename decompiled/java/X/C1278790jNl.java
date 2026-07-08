package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.engine.SITICalculator;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.PsnrStatisics;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.RtmpCacheConfig;
import com.ss.pusher.core.params.SitiConfig;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278790jNl {
    public static final String LJI = C1278790jNl.class.getSimpleName();
    public final C1277590jLp LIZ;
    public final PushBase LIZIZ;
    public final SitiConfig LIZJ;
    public final PsnrStatisics LIZLLL;
    public final C1278910jNx LJ;
    public SITICalculator LJFF;

    public final void LIZ() {
        Object obj;
        Object obj2;
        WeakReference<Object> weakReference = this.LJ.LJIILJJIL;
        Object obj3 = null;
        if (weakReference == null || (obj = weakReference.get()) == null) {
            obj = null;
        }
        C1278780jNk c1278780jNk = (C1278780jNk) obj;
        WeakReference<Object> weakReference2 = this.LJ.LJIILL;
        if (weakReference2 != null && (obj2 = weakReference2.get()) != null) {
            obj3 = obj2;
        }
        C1278810jNn c1278810jNn = (C1278810jNn) obj3;
        if (c1278810jNn == null) {
            return;
        }
        c1278810jNn.LIZ(0, 0, 0, "siti");
        if (this.LIZJ.dropEncodeFps) {
            c1278780jNk.LIZ(0, "siti");
        } else {
            c1278810jNn.LIZIZ(0, "siti");
        }
    }

    public C1278790jNl(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        int i;
        int i2;
        this.LIZ = c1277590jLp;
        LiveSdkSetting liveSdkSetting = c1277590jLp.LJI;
        PushBase pushBase = liveSdkSetting.mPushBase;
        this.LIZIZ = pushBase;
        SitiConfig sitiConfig = pushBase.LJIILL;
        this.LIZJ = sitiConfig;
        this.LIZLLL = liveSdkSetting.psnrStatisics;
        this.LJ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJIIZILJ = new WeakReference<>(this);
        if (pushBase.LJIIJJI) {
            SITICalculator sITICalculator = new SITICalculator(c1278910jNx.LIZ);
            this.LJFF = sITICalculator;
            boolean zIsValid = sITICalculator.isValid();
            String str = LJI;
            if (zIsValid) {
                TEBundle tEBundle = new TEBundle();
                try {
                    LiveSdkSetting liveSdkSetting2 = c1277590jLp.LJI;
                    RtmpCacheConfig rtmpCacheConfig = liveSdkSetting2.LIZJ;
                    if (pushBase.LJIIJJI) {
                        int i3 = pushBase.fps;
                        if (rtmpCacheConfig != null && rtmpCacheConfig.LIZ()) {
                            i2 = (!C173600la.LIZ(Integer.valueOf(liveSdkSetting2.LIZJ.minVideoFps)) || (i2 = liveSdkSetting2.LIZJ.minVideoFps) >= i3) ? i3 : i2;
                            if (!C173600la.LIZ(Integer.valueOf(liveSdkSetting2.LIZJ.maxVideoFps)) || (i = liveSdkSetting2.LIZJ.maxVideoFps) <= i3) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                            i2 = i3;
                        }
                        TEBundle tEBundle2 = new TEBundle();
                        tEBundle2.setInt("resize_width", pushBase.width);
                        tEBundle2.setInt("resize_height", pushBase.height);
                        tEBundle2.setInt("publish_width", pushBase.width);
                        tEBundle2.setInt("publish_height", pushBase.height);
                        TEBundle tEBundle3 = new TEBundle();
                        tEBundle3.setInt("cur_cplx_category", -1);
                        tEBundle3.setInt("publish_width", pushBase.width);
                        tEBundle3.setInt("publish_height", pushBase.height);
                        tEBundle3.setInt("publish_def_bitrate", pushBase.defaultBitrate);
                        tEBundle3.setInt("publish_min_bitrate", pushBase.minBitrate);
                        tEBundle3.setInt("publish_max_bitrate", pushBase.maxBitrate);
                        tEBundle3.setInt("init_video_fps", i3);
                        tEBundle3.setInt("min_video_fps", i2);
                        tEBundle3.setInt("max_video_fps", i);
                        tEBundle3.setInt("qulity_mode", pushBase.LJIILJJIL.qualityMode);
                        tEBundle3.setInt("strategy_adjust_mode", pushBase.LJIILJJIL.strategyAdjustMode);
                        if (!pushBase.LJIILJJIL.categoryParams.isEmpty()) {
                            tEBundle3.setString("category_params", pushBase.LJIILJJIL.categoryParams);
                        }
                        if (!pushBase.LJIILJJIL.bitrateRatios.isEmpty()) {
                            tEBundle3.setString("bitrate_ratios", pushBase.LJIILJJIL.bitrateRatios);
                        }
                        if (!pushBase.LJIILJJIL.fpsRatios.isEmpty()) {
                            tEBundle3.setString("fps_ratios", pushBase.LJIILJJIL.fpsRatios);
                        }
                        tEBundle2.setBool("using_gpu", sitiConfig.usingGpu);
                        tEBundle2.setBool("using_arm", sitiConfig.usingArm);
                        tEBundle2.setInt("thread_count", sitiConfig.threadCount);
                        tEBundle2.setInt("period_ms", sitiConfig.periodMs);
                        int i4 = pushBase.fps / (sitiConfig.framesCountsCalcSiti / sitiConfig.extractDuration);
                        tEBundle2.setInt("extract_frame_gap", i4);
                        tEBundle2.setInt("frames_counts_calc_siti", sitiConfig.framesCountsCalcSiti);
                        tEBundle.setBundle("siti_config", tEBundle2);
                        tEBundle.setBundle("enc_strategy_config", tEBundle3);
                        this.LJFF.LLIZLLLIL(tEBundle);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SITIStrategy siti config extract_frame_gap:");
                        sbLIZ.append(i4);
                        AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                tEBundle.release();
                this.LJFF.getClass();
                AVLog.ioi(str, "STIICalculator Created");
                return;
            }
            AVLog.ioe(str, "STIICalculator is not valid");
        }
    }
}
