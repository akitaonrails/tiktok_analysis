package X;

import Y.ARunnableS0S1102100_20;
import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.engine.AdaptiveController;
import com.ss.pusher.core.engine.VsyncModule;
import com.ss.pusher.core.params.BwEstBaseBWConfig;
import com.ss.pusher.core.params.BwEstCfg;
import com.ss.pusher.core.params.LWReconnectCfg;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.RtmpCacheConfig;
import com.ss.pusher.core.transport.LibRTMPTransport;
import com.ss.pusher.core.utils.AVLog;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278940jO0 implements InterfaceC1279270jOX {
    public static final String LJIIZILJ = C1278940jO0.class.getSimpleName();
    public final C1277590jLp LIZ;
    public final PushBase LIZIZ;
    public final C1278910jNx LIZJ;
    public final C1283040jUc LIZLLL;
    public final C1278820jNo LJ;
    public final C1278930jNz LJFF;
    public int LJI;
    public int LJIIIZ;
    public LibRTMPTransport LJIIL;
    public TEBundle LJIILIIL;
    public final boolean LJIILL;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public boolean LJIIJ = true;
    public final Object LJIIJJI = new Object();
    public boolean LJIILJJIL = false;
    public final ARunnableS120S0100000_20 LJIILLIIL = new ARunnableS120S0100000_20(this, 476);

    public final void LIZ() {
        TEBundle tEBundle = this.LJIILIIL;
        if (tEBundle != null) {
            tEBundle.release();
            this.LJIILIIL = null;
        }
        synchronized (this.LJIIJJI) {
            try {
                LibRTMPTransport libRTMPTransport = this.LJIIL;
                if (libRTMPTransport != null) {
                    libRTMPTransport.release();
                    this.LJIIL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C1278920jNy LIZJ() {
        C1278760jNi c1278760jNiLIZIZ = this.LIZJ.LIZIZ();
        return c1278760jNiLIZIZ != null ? c1278760jNiLIZIZ.LLJ : C1278920jNy.LIZJ;
    }

    public final void LJI() {
        LibRTMPTransport libRTMPTransport = this.LJIIL;
        if (libRTMPTransport != null) {
            libRTMPTransport.setEventObserver(this);
            String strLIZ = this.LJ.LIZ();
            String str = LJIIZILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Rtmp(");
            sbLIZ.append(this.LJIIL);
            sbLIZ.append(") setUrl: ");
            sbLIZ.append(strLIZ);
            AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
            this.LJIIL.setupUrl(strLIZ);
        }
    }

    public final long LIZIZ(int i) {
        if (i != 1 && i != 10 && i != 1001 && i != 3003 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 2999 && i != 3000) {
            switch (i) {
                case 2000:
                case 2001:
                case 2002:
                    break;
                default:
                    return 0L;
            }
        }
        synchronized (this.LJIIJJI) {
            try {
                LibRTMPTransport libRTMPTransport = this.LJIIL;
                if (libRTMPTransport == null) {
                    return 0L;
                }
                return libRTMPTransport.getInt64Value(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJII(TEBundle tEBundle) {
        LiveSdkSetting liveSdkSetting = this.LIZ.LJI;
        PushBase pushBase = liveSdkSetting.mPushBase;
        BwEstBaseBWConfig bwEstBaseBWConfig = liveSdkSetting.bwEstBaseBWConfig;
        if (bwEstBaseBWConfig == null) {
            return;
        }
        TEBundle tEBundle2 = new TEBundle();
        tEBundle2.setInt("codetable_set_fps", pushBase.fps);
        if (C173600la.LIZ(Integer.valueOf(bwEstBaseBWConfig.transportBwEst1))) {
            tEBundle2.setInt("transport_bw_est_1s", bwEstBaseBWConfig.transportBwEst1);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstBaseBWConfig.transportBwEst2))) {
            tEBundle2.setInt("transport_bw_est_2s", bwEstBaseBWConfig.transportBwEst2);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstBaseBWConfig.minFrameRate))) {
            tEBundle2.setInt("min_frame_rate", bwEstBaseBWConfig.minFrameRate);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstBaseBWConfig.bweSampleDurLength))) {
            tEBundle2.setInt("bwe_sample_dur_length", bwEstBaseBWConfig.bweSampleDurLength);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstBaseBWConfig.useEwmaBandwidthEstimate))) {
            tEBundle2.setInt("use_ewma_bandwidth_estimate", bwEstBaseBWConfig.useEwmaBandwidthEstimate);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstBaseBWConfig.useAdaptiveFps))) {
            tEBundle2.setInt("use_adaptive_fps", bwEstBaseBWConfig.useAdaptiveFps);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstBaseBWConfig.transportBwest1sFactor))) {
            tEBundle2.setDouble("transport_bw_est_1s_factor", bwEstBaseBWConfig.transportBwest1sFactor);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstBaseBWConfig.transportBwest3sFactor))) {
            tEBundle2.setDouble("transport_bw_est_3s_factor", bwEstBaseBWConfig.transportBwest3sFactor);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstBaseBWConfig.durlistRate1sFactor))) {
            tEBundle2.setDouble("durlist_rate_1s_factor", bwEstBaseBWConfig.durlistRate1sFactor);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstBaseBWConfig.durlistRate2sFactor))) {
            tEBundle2.setDouble("durlist_rate_2s_factor", bwEstBaseBWConfig.durlistRate2sFactor);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstBaseBWConfig.bweFactor))) {
            tEBundle2.setDouble("bwe_factor", bwEstBaseBWConfig.bweFactor);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstBaseBWConfig.minAdjustStep))) {
            tEBundle2.setInt("min_adjust_step", bwEstBaseBWConfig.minAdjustStep);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstBaseBWConfig.bitraAdjustInterval))) {
            tEBundle2.setInt("bitrate_adjust_interval", bwEstBaseBWConfig.bitraAdjustInterval);
        }
        tEBundle.setBundle("bwestBaseBwStrategy_params", tEBundle2);
        tEBundle2.release();
    }

    public final void LJIIIIZZ(TEBundle tEBundle) {
        LiveSdkSetting liveSdkSetting = this.LIZ.LJI;
        PushBase pushBase = liveSdkSetting.mPushBase;
        RtmpCacheConfig rtmpCacheConfig = liveSdkSetting.LIZJ;
        BwEstCfg bwEstCfg = rtmpCacheConfig.rtmpBwEstCfg;
        LWReconnectCfg lWReconnectCfg = rtmpCacheConfig.rtmpReconnectCfg;
        TEBundle tEBundle2 = new TEBundle();
        TEBundle tEBundle3 = new TEBundle();
        TEBundle tEBundle4 = new TEBundle();
        tEBundle2.setInt("real_video_fps", pushBase.fps);
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.minVideoFps))) {
            tEBundle2.setInt("min_video_fps", rtmpCacheConfig.minVideoFps);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.maxVideoFps))) {
            tEBundle2.setInt("max_video_fps", rtmpCacheConfig.maxVideoFps);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.minVideoFps)) || C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.maxVideoFps))) {
            tEBundle2.setInt("init_video_fps", pushBase.fps);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.maxInterLeaveDelta))) {
            tEBundle2.setInt("max_interleave_delta", rtmpCacheConfig.maxInterLeaveDelta);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.dropVideoFrameThresholdI))) {
            tEBundle2.setInt("drop_video_frame_threshold_I", rtmpCacheConfig.dropVideoFrameThresholdI);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.dropVideoFrameThresholdP))) {
            tEBundle2.setInt("drop_video_frame_threshold_P", rtmpCacheConfig.dropVideoFrameThresholdP);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.dropVideoFrameThresholdB))) {
            tEBundle2.setInt("drop_video_frame_threshold_B", rtmpCacheConfig.dropVideoFrameThresholdB);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.audioSendStallThreshold))) {
            tEBundle2.setInt("audio_send_stall_threshold", rtmpCacheConfig.audioSendStallThreshold);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.videoSendStallThreshold))) {
            tEBundle2.setInt("video_send_stall_threshold", rtmpCacheConfig.videoSendStallThreshold);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.logIntervalMS))) {
            tEBundle2.setInt("log_interval_ms", rtmpCacheConfig.logIntervalMS);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.androidNetInfoOpt))) {
            tEBundle2.setInt("android_net_info_opt", rtmpCacheConfig.androidNetInfoOpt);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.enableReportStallLog))) {
            tEBundle2.setInt("enable_report_stall_log", rtmpCacheConfig.enableReportStallLog);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.usePktInTime))) {
            tEBundle2.setInt("use_pkt_inTime", rtmpCacheConfig.usePktInTime);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.enablereportNetInfo))) {
            tEBundle2.setInt("enable_report_net_info", rtmpCacheConfig.enablereportNetInfo);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.enableRefactorReportNetInfo))) {
            tEBundle2.setInt("enable_refactor_report_net_info", rtmpCacheConfig.enableRefactorReportNetInfo);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.enableFpsAdjust))) {
            tEBundle2.setInt("enable_fps_adjust", rtmpCacheConfig.enableFpsAdjust);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.openTimeOut))) {
            tEBundle2.setInt("open_timeout", rtmpCacheConfig.openTimeOut);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.rwTimeOut))) {
            tEBundle2.setInt("read_write_timeout", rtmpCacheConfig.rwTimeOut);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.rtmpTimeRotation))) {
            tEBundle2.setInt("rtmp_time_rotation", rtmpCacheConfig.rtmpTimeRotation);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.enableRtmpStopPoll))) {
            tEBundle2.setInt("enable_rtmp_stopPoll", rtmpCacheConfig.enableRtmpStopPoll);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.enableReportBwTime))) {
            tEBundle2.setInt("enable_report_bw_time", rtmpCacheConfig.enableReportBwTime);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.bwTimeReportThreshold))) {
            tEBundle2.setInt("bw_time_report_threshold", rtmpCacheConfig.bwTimeReportThreshold);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.bwTimeReportKeepWin))) {
            tEBundle2.setInt("bw_time_report_keep_win", rtmpCacheConfig.bwTimeReportKeepWin);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.disableDnsParseWithIp))) {
            tEBundle2.setInt("disable_dns_parse_with_ip", rtmpCacheConfig.disableDnsParseWithIp);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.chunkSendOpt))) {
            tEBundle2.setInt("chunk_send_opt", rtmpCacheConfig.chunkSendOpt);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.rtmpsNoblockIo))) {
            tEBundle2.setInt("rtmps_noblock_io", rtmpCacheConfig.rtmpsNoblockIo);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.disableDropFrame))) {
            tEBundle2.setInt("disable_drop_frame", rtmpCacheConfig.disableDropFrame);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.changeDropFrameOrder))) {
            tEBundle2.setInt("change_drop_frame_order", rtmpCacheConfig.changeDropFrameOrder);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.bwKeepWinForFps))) {
            tEBundle2.setInt("bw_keep_win_for_fps", rtmpCacheConfig.bwKeepWinForFps);
        }
        if (C173600la.LIZ(Integer.valueOf(rtmpCacheConfig.setFpsOpt))) {
            tEBundle2.setInt("set_fps_opt", rtmpCacheConfig.setFpsOpt);
        }
        if (C173600la.LIZ(Double.valueOf(rtmpCacheConfig.maxFpsFactor))) {
            tEBundle2.setDouble("max_fps_factor", rtmpCacheConfig.maxFpsFactor);
        }
        if (C173600la.LIZ(Double.valueOf(rtmpCacheConfig.minFpsFactor))) {
            tEBundle2.setDouble("min_fps_factor", rtmpCacheConfig.minFpsFactor);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwGoDownWindowSize))) {
            tEBundle3.setInt("bw_go_down_window_size", bwEstCfg.bwGoDownWindowSize);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwGoUpWindownSize))) {
            tEBundle3.setInt("bw_go_up_window_size", bwEstCfg.bwGoUpWindownSize);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwGoUpPacketThresh))) {
            tEBundle3.setInt("bw_go_up_packet_thresh", bwEstCfg.bwGoUpPacketThresh);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwGoDownScore))) {
            tEBundle3.setInt("bw_go_down_score", bwEstCfg.bwGoDownScore);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bitrateAdjustInterval))) {
            tEBundle3.setInt("bitrate_adjust_interval", bwEstCfg.bitrateAdjustInterval);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstCfg.bwGoDownRatio))) {
            tEBundle3.setDouble("bw_go_down_ratio", bwEstCfg.bwGoDownRatio);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwLongPeriodOpt))) {
            tEBundle3.setInt("bw_long_period_opt", bwEstCfg.bwLongPeriodOpt);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwLongPeriodQueueSize))) {
            tEBundle3.setInt("bw_long_period_queue_size", bwEstCfg.bwLongPeriodQueueSize);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstCfg.bwLongPeriodScore))) {
            tEBundle3.setDouble("bw_long_period_score", bwEstCfg.bwLongPeriodScore);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstCfg.bwLongPeriodAlpha))) {
            tEBundle3.setDouble("bw_long_period_alpha", bwEstCfg.bwLongPeriodAlpha);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstCfg.bwGoUpRatio))) {
            tEBundle3.setDouble("bw_go_up_ratio", bwEstCfg.bwGoUpRatio);
        }
        if (C173600la.LIZ(Double.valueOf(bwEstCfg.bwDropFrameRatio))) {
            tEBundle3.setDouble("bw_drop_frame_ratio", bwEstCfg.bwDropFrameRatio);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwGoUpBwThresh))) {
            tEBundle3.setInt("bw_go_up_bw_thresh", bwEstCfg.bwGoUpBwThresh);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwGoDownBwThresh))) {
            tEBundle3.setInt("bw_go_down_bw_thresh", bwEstCfg.bwGoDownBwThresh);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwStartUpOpt))) {
            tEBundle3.setInt("bw_start_up_opt", bwEstCfg.bwStartUpOpt);
        }
        if (C173600la.LIZ(Integer.valueOf(bwEstCfg.bwAdjustStepOpt))) {
            tEBundle3.setInt("bw_adjust_step_opt", bwEstCfg.bwAdjustStepOpt);
        }
        if (C173600la.LIZ(Integer.valueOf(lWReconnectCfg.lwReconnectDropFrameThresh))) {
            tEBundle4.setInt("lw_reconnect_drop_frame_thresh", lWReconnectCfg.lwReconnectDropFrameThresh);
        }
        if (C173600la.LIZ(Integer.valueOf(lWReconnectCfg.lwReconnectEnableDropFrame))) {
            tEBundle4.setInt("lw_reconnect_enable_drop_frame", lWReconnectCfg.lwReconnectEnableDropFrame);
        }
        if (C173600la.LIZ(Integer.valueOf(lWReconnectCfg.lwReconnectOpenTimeout))) {
            tEBundle4.setInt("lw_reconnect_open_timeout", lWReconnectCfg.lwReconnectOpenTimeout);
        }
        if (C173600la.LIZ(Integer.valueOf(lWReconnectCfg.lwReconnectEnableRequestIFrame))) {
            tEBundle4.setInt("lw_reconnect_enable_request_Iframe", lWReconnectCfg.lwReconnectEnableRequestIFrame);
        }
        if (C173600la.LIZ(Integer.valueOf(lWReconnectCfg.lwReconnectRequestIFrameThresh))) {
            tEBundle4.setInt("lw_reconnect_request_Iframe_thresh", lWReconnectCfg.lwReconnectRequestIFrameThresh);
        }
        if (C173600la.LIZ(Integer.valueOf(lWReconnectCfg.lwReconnectCloseAbrDropFrame))) {
            tEBundle4.setInt("lw_reconnect_close_abr_drop_frame", lWReconnectCfg.lwReconnectCloseAbrDropFrame);
        }
        tEBundle4.setInt("enable_lw_reconnect", lWReconnectCfg.enableLWReconnect ? 1 : 0);
        tEBundle2.setBundle("lw_reconnect_cfg", tEBundle4);
        tEBundle2.setBundle("bw_est_cfg", tEBundle3);
        tEBundle.setBundle("rtmp_cache_cfg", tEBundle2);
    }

    public C1278940jO0(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LIZ = c1277590jLp;
        this.LIZIZ = c1277590jLp.LJI.mPushBase;
        this.LIZJ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJIIIZ = new WeakReference<>(this);
        this.LIZLLL = new C1283040jUc(this.LIZ, c1278910jNx);
        this.LJ = new C1278820jNo(c1277590jLp.LJI, c1278910jNx);
        this.LJFF = new C1278930jNz(c1277590jLp, c1278910jNx);
        this.LJIILL = c1277590jLp.LJI.switchParams.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r26, int r27, long r28, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1278940jO0.LIZLLL(int, int, long, java.lang.String):void");
    }

    public final void LJ(int i, int i2, long j, String str) {
        long j2;
        int i3;
        int i4;
        long int64Value;
        AdaptiveController adaptiveControllerLIZ;
        long int64Value2;
        if (LIZJ() != C1278920jNy.LJIIIIZZ && !LIZJ().LIZIZ()) {
            if (this.LIZJ.LIZ.getLooper().getThread() != C786410Ut5.u3()) {
                C786410Ut5.LJJZZIII(this.LIZJ.LIZ, new ARunnableS0S1102100_20(this, i, i2, j, str, 6));
                return;
            }
            C1278950jO1 c1278950jO1LJ = this.LIZJ.LJ();
            switch (i) {
                case 0:
                    AVLog.ioi(LJIIZILJ, "Rtmp start connecting");
                    this.LIZJ.LIZJ().LIZJ(501);
                    this.LIZJ.LJ().LJIIL();
                    return;
                case 1:
                    int i5 = (int) j;
                    this.LIZJ.LIZJ().LIZJ(502);
                    if (this.LJIILL) {
                        synchronized (this.LIZJ) {
                            try {
                                adaptiveControllerLIZ = this.LIZJ.LIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                            break;
                        }
                    } else {
                        adaptiveControllerLIZ = this.LIZJ.LIZ();
                    }
                    if (adaptiveControllerLIZ != null) {
                        adaptiveControllerLIZ.LJFF();
                    }
                    String string = "";
                    LibRTMPTransport libRTMPTransport = this.LJIIL;
                    if (libRTMPTransport != null) {
                        string = libRTMPTransport.getString(21);
                        int64Value2 = this.LJIIL.getInt64Value(2);
                    } else {
                        int64Value2 = -1;
                    }
                    String str2 = LJIIZILJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Rtmp connected: reconnect counts ");
                    sbLIZ.append(this.LJI);
                    sbLIZ.append(", first connect ");
                    sbLIZ.append(this.LJII);
                    sbLIZ.append(", remote ip ");
                    sbLIZ.append(string);
                    sbLIZ.append(", dns time ");
                    sbLIZ.append(int64Value2);
                    AVLog.ioi(str2, C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZJ.LJ().LJIIJJI(int64Value2, string, 200, this.LJI, i5, this.LJII);
                    C1278950jO1 c1278950jO1LJ2 = this.LIZJ.LJ();
                    if (this.LJIIIIZZ) {
                        this.LJIIIIZZ = false;
                        c1278950jO1LJ2.LJJII(1, 0, 0, null, 0L);
                    }
                    if (this.LJIIIZ == 0) {
                        this.LJIIIZ = 1;
                        int i6 = this.LJI;
                        c1278950jO1LJ2.LJJIFFI(1, i6, i6);
                        c1278950jO1LJ2.LJIIJ(0);
                    } else {
                        int i7 = this.LJI;
                        c1278950jO1LJ2.LJJIFFI(1, i7, i7);
                        c1278950jO1LJ2.LJIIJ(this.LJIIIZ);
                    }
                    C1283040jUc c1283040jUc = this.LIZLLL;
                    c1283040jUc.LJIIL = false;
                    c1283040jUc.LJIIIZ = 0;
                    C1278760jNi c1278760jNiLIZIZ = this.LIZJ.LIZIZ();
                    c1278760jNiLIZIZ.getClass();
                    c1278760jNiLIZIZ.LJI(C1278920jNy.LJFF);
                    this.LJI = 0;
                    if (this.LIZIZ.LIZLLL) {
                        C1278820jNo c1278820jNo = this.LJ;
                        C1278800jNm c1278800jNm = c1278820jNo.LIZJ;
                        String strLIZIZ = c1278820jNo.LIZIZ();
                        if ("INVALID_OPT_URL".equals(c1278800jNm.LJFF.get(strLIZIZ))) {
                            c1278800jNm.LJFF.remove(strLIZIZ);
                        }
                    }
                    this.LJII = false;
                    long j3 = ((long) this.LIZIZ.LJJJJLI) * 1000;
                    Handler handler = this.LIZJ.LIZ;
                    if (handler != null) {
                        C786410Ut5.LJLIIL(j3, handler, new ARunnableS120S0100000_20(this, 467));
                        return;
                    }
                    return;
                case 2:
                    String str3 = LJIIZILJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Rtmp send too slow: send delay ");
                    sbLIZ2.append(i2);
                    AVLog.ioi(str3, C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZJ.LIZJ().LIZJ(508);
                    this.LIZJ.LJ().LJIIZILJ(i2);
                    return;
                case 3:
                    C1283040jUc c1283040jUc2 = this.LIZLLL;
                    c1283040jUc2.LJIIL = true;
                    c1283040jUc2.LJIIIZ = 1;
                    this.LIZJ.LIZJ().LIZJ(505);
                    C1278950jO1 c1278950jO1LJ3 = this.LIZJ.LJ();
                    if (this.LJIIIIZZ) {
                        this.LJIIIIZZ = false;
                        i3 = 2;
                        i4 = 0;
                        c1278950jO1LJ3.LJJII(1, 3, i2, str, j);
                    } else {
                        i3 = 2;
                        i4 = 0;
                    }
                    int i8 = this.LJI;
                    c1278950jO1LJ3.LJJIFFI(i4, i8, i8);
                    c1278950jO1LJ3.LJIIJ(this.LJIIIZ);
                    String string2 = "";
                    if (this.LJI >= this.LIZIZ.LIZIZ) {
                        this.LIZJ.LIZJ().LIZLLL(EnumC1278980jO4.Bad);
                        LibRTMPTransport libRTMPTransport2 = this.LJIIL;
                        if (libRTMPTransport2 != null) {
                            string2 = libRTMPTransport2.getString(21);
                            int64Value = this.LJIIL.getInt64Value(i3);
                        } else {
                            int64Value = -1;
                        }
                        this.LIZJ.LJ().LJIIJJI(int64Value, string2, i2, this.LJI, (int) j, this.LJII);
                    } else {
                        int64Value = -1;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Rtmp connecting failed: code2 ");
                    sbLIZ3.append(i2);
                    sbLIZ3.append(", code3 ");
                    sbLIZ3.append(j);
                    sbLIZ3.append(", reconnect counts ");
                    sbLIZ3.append(this.LJI);
                    sbLIZ3.append(", first connect ");
                    sbLIZ3.append(this.LJII);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    AVLog.ioe(LJIIZILJ, strLIZIZ2);
                    LIZLLL(i, i2, j, str);
                    LJFF(i2, string2, strLIZIZ2, this.LJI, int64Value, this.LJII);
                    return;
                case 4:
                    if (this.LIZJ.LIZIZ() != null) {
                        String strLIZIZ3 = "avSync error: ";
                        try {
                            j2 = CastIntegerProtector.parseInt(str);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("avSync error: ");
                            sbLIZ4.append("realVideoPts: ");
                            sbLIZ4.append(str);
                            sbLIZ4.append(" ");
                            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                            j2 = 0;
                        }
                        long jNativeNowNanos = VsyncModule.nativeNowNanos() / 1000000;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(strLIZIZ3);
                        sbLIZ5.append("audio pts ");
                        sbLIZ5.append(j + j2);
                        sbLIZ5.append(", video pts ");
                        sbLIZ5.append(j2);
                        sbLIZ5.append(" last vpts ");
                        sbLIZ5.append(-1L);
                        sbLIZ5.append(" video maxFI ");
                        sbLIZ5.append(-1L);
                        sbLIZ5.append(" bgm ");
                        sbLIZ5.append(false);
                        sbLIZ5.append(" CurrTimeMs ");
                        sbLIZ5.append(jNativeNowNanos);
                        sbLIZ5.append(" vFirst ");
                        sbLIZ5.append(-1L);
                        sbLIZ5.append(" aFirst ");
                        sbLIZ5.append(-1L);
                        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                        AVLog.ioe("VeLiveMediaStreamWrapper", strLIZIZ4);
                        this.LIZJ.LJ().LJFF(i2, strLIZIZ4);
                        break;
                    }
                    LIZLLL(i, i2, j, str);
                    return;
                case 5:
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("interleave fail: error code ");
                    sbLIZ6.append(i2);
                    AVLog.ioe(LJIIZILJ, C2188811AlT.LIZIZ(sbLIZ6));
                    this.LIZJ.LJ().LJFF(i2, "interleave fail");
                    LIZLLL(i, i2, j, str);
                    return;
                case 6:
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("Rtmp send package failed: error code ");
                    sbLIZ7.append(i2);
                    AVLog.ioe(LJIIZILJ, C2188811AlT.LIZIZ(sbLIZ7));
                    this.LIZJ.LJ().LJFF(i2, "RtmpSendPacketFail");
                    long jLIZIZ = this.LIZJ.LJ().LIZIZ();
                    this.LIZJ.LIZJ().LIZLLL(EnumC1278980jO4.Bad);
                    C1283040jUc c1283040jUc3 = this.LIZLLL;
                    if (c1283040jUc3.LJIIJJI && jLIZIZ <= 10000) {
                        c1283040jUc3.LJIIL = true;
                        c1283040jUc3.LJIIIZ = 2;
                    }
                    LIZLLL(i, i2, j, str);
                    return;
                case 7:
                    AVLog.ioi(LJIIZILJ, "Rtmp pushing stopped");
                    this.LIZJ.LIZJ().LIZJ(506);
                    return;
                case 8:
                    c1278950jO1LJ.LIZJ(str);
                    return;
                case BdTuring.TYPE_ECAF /* 9 */:
                    c1278950jO1LJ.LJII(str);
                    return;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("Rtmp connecting failed: error code ");
                    sbLIZ8.append(i2);
                    String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ8);
                    AVLog.ioe(LJIIZILJ, strLIZIZ5);
                    C1283040jUc c1283040jUc4 = this.LIZLLL;
                    c1283040jUc4.LJIIL = true;
                    c1283040jUc4.LJIIIZ = 1;
                    LIZLLL(i, i2, j, str);
                    LJFF(i2, "", strLIZIZ5, this.LJI, -1L, this.LJII);
                    return;
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 15:
                case 22:
                case 23:
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                case 25:
                default:
                    return;
                case 14:
                    c1278950jO1LJ.LIZLLL(str);
                    return;
                case 16:
                    c1278950jO1LJ.LJJIIZ(j);
                    return;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    c1278950jO1LJ.LJI(i2, j, true);
                    return;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    c1278950jO1LJ.LJI(i2, j, false);
                    return;
                case 19:
                    c1278950jO1LJ.LJIILIIL(str);
                    return;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    c1278950jO1LJ.LJIILLIIL(i2, j);
                    return;
                case 21:
                    c1278950jO1LJ.LJIILL(i2, j);
                    return;
                case 26:
                    this.LIZJ.LIZJ().LIZIZ(new C1278510jNJ(true, EnumC1277870jMH.Send));
                    return;
                case 27:
                    this.LIZJ.LIZJ().LIZIZ(new C1278510jNJ(false, EnumC1277870jMH.Send));
                    return;
                case 28:
                    if (this.LJIILJJIL) {
                        c1278950jO1LJ.LJFF(i2, "Sandbox shutdown stream");
                        LIZLLL(i, i2, j, str);
                        return;
                    }
                    return;
                case 29:
                    c1278950jO1LJ.LJIILJJIL(str);
                    return;
            }
        }
    }

    public final void LJFF(final int i, final String str, final String str2, final int i2, final long j, final boolean z) {
        C786410Ut5.LJLIIL(((long) this.LIZIZ.LIZJ) * 1000, this.LIZJ.LIZ, new Runnable(i, i2, z, str, j, str2) { // from class: X.0jO7
            public final /* synthetic */ int LLILLJJLI;
            public final /* synthetic */ int LLILLL;
            public final /* synthetic */ boolean LLILZ;
            public final /* synthetic */ long LLILZIL;
            public final /* synthetic */ String LLILZLL;

            {
                this.LLILZIL = j;
                this.LLILZLL = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1278940jO0 c1278940jO0 = this.LL;
                int i3 = this.LLILLJJLI;
                int i4 = this.LLILLL;
                boolean z2 = this.LLILZ;
                long j2 = this.LLILZIL;
                String str3 = this.LLILZLL;
                c1278940jO0.getClass();
                C1C7U.LIZ("VeLiveTransportWrapper@6ba5.onUpLoadRtmpFailedLog$1L");
                c1278940jO0.LIZJ.LJ().LJIIIZ(i3, str3, i4, j2, z2);
                C1C7U.LIZIZ("VeLiveTransportWrapper@6ba5.onUpLoadRtmpFailedLog$1L");
            }
        });
    }
}
