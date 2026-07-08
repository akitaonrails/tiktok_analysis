package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.pusher.core.base.JniCommon;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.codec.DefaultAudioEncoderFactory;
import com.ss.pusher.core.codec.DefaultVideoEncoderFactory;
import com.ss.pusher.core.engine.MediaEncodeStream;
import com.ss.pusher.core.engine.MediaEngineFactory;
import com.ss.pusher.core.engine.SITICalculator;
import com.ss.pusher.core.engine.VeLiveVideoAdapter;
import com.ss.pusher.core.engine.VsyncModule;
import com.ss.pusher.core.params.PsnrStatisics;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.SandboxParams;
import com.ss.pusher.core.params.StrategyConfiguration;
import com.ss.pusher.core.transport.LibRTMPTransport;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0jNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278760jNi implements InterfaceC1279120jOI, InterfaceC1278620jNU {
    public final PushBase LL;
    public final C1278910jNx LLILLJJLI;
    public final C1278940jO0 LLILLL;
    public final C1278790jNl LLILZ;
    public final C1278840jNq LLILZIL;
    public final C1278750jNh LLILZLL;
    public final C1279110jOH LLIZ;
    public final C1278780jNk LLIZLLLIL;
    public volatile C1278920jNy LLJ = C1278920jNy.LIZJ;
    public final VeLiveVideoAdapter LLJI;
    public MediaEngineFactory LLJIJIL;
    public DefaultVideoEncoderFactory LLJILJIL;
    public DefaultAudioEncoderFactory LLJILJILJ;
    public MediaEncodeStream LLJILLL;
    public TEBundle LLJJ;

    @Override // X.InterfaceC1278620jNU
    public final int LIZ() {
        return this.LL.LJ;
    }

    @Override // X.InterfaceC1278620jNU
    public final int LIZIZ() {
        int iLIZJ = this.LLJILLL.LIZJ();
        return iLIZJ == 0 ? this.LL.LJ : iLIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136, types: [X.0jOS] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZJ() {
        TEBundle tEBundle;
        TEBundle tEBundle2;
        VsyncModule vsyncModule;
        int iRound;
        LJI(C1278920jNy.LJ);
        if (this.LLJILLL == null && this.LLJIJIL != null) {
            C1278940jO0 c1278940jO0 = this.LLILLL;
            if (c1278940jO0.LJIIL == null) {
                LibRTMPTransport libRTMPTransport = new LibRTMPTransport();
                c1278940jO0.LJIIL = libRTMPTransport;
                c1278940jO0.LJIILIIL = libRTMPTransport.getParameter();
                C1278930jNz c1278930jNz = c1278940jO0.LJFF;
                LibRTMPTransport libRTMPTransport2 = c1278940jO0.LJIIL;
                Iterator<Map.Entry<String, C1278210jMp>> it2 = c1278930jNz.LIZJ.entrySet().iterator();
                while (it2.hasNext()) {
                    C1278210jMp value = it2.next().getValue();
                    libRTMPTransport2.addUserMetaData(value.LIZ, value.LIZIZ, value.LIZJ);
                }
                c1278940jO0.LIZJ.LJ().LJIJJ();
            }
            LibRTMPTransport libRTMPTransport3 = c1278940jO0.LJIIL;
            MediaEncodeStream mediaEncodeStreamLIZIZ = this.LLJIJIL.LIZIZ(this.LLJILJIL, this.LLJILJILJ);
            this.LLJILLL = mediaEncodeStreamLIZIZ;
            mediaEncodeStreamLIZIZ.LJIIJJI(libRTMPTransport3);
            this.LLJJ = this.LLJILLL.LIZ();
            this.LLJILLL.LJIIIIZZ(this.LL.LJJII);
            this.LLJILLL.LJFF(this);
            this.LLJILLL.LJII(this.LL.LJJIZ);
            this.LLJILLL.LJIIL();
        }
        C1278750jNh c1278750jNh = this.LLILZLL;
        TEBundle tEBundle3 = this.LLJJ;
        c1278750jNh.LJFF = c1278750jNh.LIZ();
        c1278750jNh.LJI = c1278750jNh.LIZIZ.LJJIIZ.getProfile();
        if (tEBundle3 != null) {
            tEBundle3.setString("video_type", c1278750jNh.LJFF);
            tEBundle3.setBool("oes_texture_frame", false);
            tEBundle3.setBool("video_enable_accelera", c1278750jNh.LIZIZ.useHardwareEncode);
            tEBundle3.setInt("video_width", c1278750jNh.LIZIZ.width);
            tEBundle3.setInt("video_height", c1278750jNh.LIZIZ.height);
            tEBundle3.setInt("video_profileLevel", c1278750jNh.LJI);
            tEBundle3.setInt("video_fps", c1278750jNh.LIZIZ.fps);
            tEBundle3.setInt("video_gop", (int) (c1278750jNh.LIZIZ.gopSec * r0.fps));
            tEBundle3.setLong("video_bitrate", c1278750jNh.LIZIZ.defaultBitrate);
            tEBundle3.setInt("video_min_bitrate", c1278750jNh.LIZIZ.minBitrate);
            tEBundle3.setInt("video_max_bitrate", c1278750jNh.LIZIZ.maxBitrate);
            tEBundle3.setBool("enableBFrame", c1278750jNh.LIZIZ.enableBFrame);
            tEBundle3.setInt("video_enable_hard_enc_bframe", c1278750jNh.LIZIZ.enableHardEncBFrame);
            tEBundle3.setBundle("roi_settings", c1278750jNh.LIZIZ.LIZLLL());
            tEBundle3.setInt("video_hard_enc_bitrate_mode", c1278750jNh.LIZIZ.LJJIIJZLJL);
            tEBundle3.setInt("configuration_type", 1);
            c1278750jNh.LIZIZ.getClass();
            tEBundle3.setBool("video_no_drop_frame", false);
            c1278750jNh.LIZIZ.getClass();
            tEBundle3.setBool("video_fix_hardware_enc_dts", false);
            c1278750jNh.LIZIZ.getClass();
            tEBundle3.setInt("check_encode_fps_interval", 0);
            c1278750jNh.LIZIZ.getClass();
            tEBundle3.setInt("change_encode_fps_threshold", 0);
            tEBundle3.setInt("bytevc1_mosaic_issue_optimize_level", c1278750jNh.LIZIZ.LJIJJ);
            c1278750jNh.LIZIZ.getClass();
            tEBundle3.setInt("frame_rate_mode", 0);
            c1278750jNh.LIZIZ.getClass();
            tEBundle3.setInt("software_encoder_min_max_bitrate_adjust", 0);
            tEBundle3.setDouble("software_encoder_bitrate_ratio_max_to_default", c1278750jNh.LIZIZ.LJIJ);
            tEBundle3.setDouble("software_encoder_bitrate_ratio_min_to_default", c1278750jNh.LIZIZ.LJIJI);
            c1278750jNh.LIZIZ.getClass();
            tEBundle3.setInt("bytevc1_preset", 0);
            c1278750jNh.LIZIZ.getClass();
            tEBundle3.setBool("video_mark_layered_bframe", false);
            tEBundle3.setBool("video_encode_perf_prior", c1278750jNh.LIZIZ.videoEncodePerfPrior);
            tEBundle3.setDouble("vfr_supported_ratio", c1278750jNh.LIZIZ.LJIIZILJ);
            n nVarLIZIZ = c1278750jNh.LIZIZ.LIZIZ();
            if (nVarLIZIZ != null) {
                tEBundle3.setString("videoEncoderStrategy", nVarLIZIZ.toString());
            }
            c1278750jNh.LIZIZ.getClass();
            int i = c1278750jNh.LIZIZ.LJIILLIIL;
            if (i > 0.0f) {
                tEBundle3.setDouble("video_gop_sec_max", i);
            }
            c1278750jNh.LIZIZ.getClass();
            c1278750jNh.LIZIZ.getClass();
        }
        C1278840jNq c1278840jNq = this.LLILZIL;
        TEBundle tEBundle4 = this.LLJJ;
        c1278840jNq.LIZLLL = c1278840jNq.LIZ();
        c1278840jNq.LJ = c1278840jNq.LIZ.LJJIJ.getProfile();
        if (tEBundle4 != null) {
            tEBundle4.setString("audio_type", c1278840jNq.LIZLLL);
            tEBundle4.setBool("audio_enable_accelera", false);
            tEBundle4.setInt("audio_channels", c1278840jNq.LIZ.LJJIJLIJ.getChannel());
            tEBundle4.setInt("audio_sample", c1278840jNq.LIZ.LJJIJIIJI.getSampleRate());
            tEBundle4.setInt("audio_bit_width", 16);
            tEBundle4.setInt("audio_bit_rate", c1278840jNq.LIZ.audioBitrate);
            tEBundle4.setInt("audio_profileLevel", c1278840jNq.LJ);
            tEBundle4.setInt("audio_db_cal_switch", 0);
        }
        TEBundle tEBundle5 = this.LLJJ;
        if (tEBundle5 != null) {
            tEBundle5.setBool("estream_transport_delay_enable", this.LL.LJJJIL);
            C1278790jNl c1278790jNl = this.LLILZ;
            TEBundle tEBundle6 = this.LLJJ;
            PsnrStatisics psnrStatisics = c1278790jNl.LIZLLL;
            boolean z = psnrStatisics != null && psnrStatisics.enablePsnr;
            tEBundle6.setBool("estream_psnr_enable", z);
            if (z) {
                tEBundle6.setInt("psnr_statistic_frames", c1278790jNl.LIZLLL.psnrCalcFrames);
                PsnrStatisics psnrStatisics2 = c1278790jNl.LIZLLL;
                int i2 = psnrStatisics2.psnrPeriodGops;
                if (i2 > 0) {
                    iRound = Math.round(i2 * c1278790jNl.LIZIZ.gopSec);
                } else {
                    iRound = psnrStatisics2.psnrPeriodSeconds;
                    if (iRound <= 0) {
                        iRound = 30;
                    }
                }
                tEBundle6.setInt("psnr_statistic_period_seconds", iRound);
                tEBundle6.setBool("psnr_use_bytevc1_psnr", c1278790jNl.LIZLLL.psnrUseByteVC1);
                tEBundle6.setBool("psnr_use_bytevc0_psnr", c1278790jNl.LIZLLL.psnrUseByteVC0);
                tEBundle6.setDouble("psnr_lower_limit", c1278790jNl.LIZLLL.psnrLowerLimit);
                tEBundle6.setBool("psnr_report_list", c1278790jNl.LIZLLL.reportList);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Dump all encodeStream config:");
            sbLIZ.append(this.LLJJ.toString());
            AVLog.iod("VeLiveMediaStreamWrapper", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILLL.LJIIIZ(this.LLJJ);
            C1278790jNl c1278790jNl2 = this.LLILZ;
            MediaEncodeStream mediaEncodeStream = this.LLJILLL;
            SITICalculator sITICalculator = c1278790jNl2.LJFF;
            if (sITICalculator != null) {
                mediaEncodeStream.LJIIJ(sITICalculator);
            }
            C1279110jOH c1279110jOH = this.LLIZ;
            MediaEncodeStream mediaEncodeStream2 = this.LLJILLL;
            c1279110jOH.getClass();
            if (mediaEncodeStream2 != null && (vsyncModule = mediaEncodeStream2.LIZJ) != 0) {
                new WeakReference(mediaEncodeStream2);
                vsyncModule.setEnable(c1279110jOH.LIZ.LJIIJ);
                TEBundle tEBundleLLIZ = vsyncModule.LLIZ();
                tEBundleLLIZ.setInt("vsync_max_intveval_than_frame_ms", c1279110jOH.LIZ.LJIIIZ);
                tEBundleLLIZ.setInt("vsync_max_intveval_than_now_ms", c1279110jOH.LIZ.LJIIIIZZ);
                vsyncModule.LLJ(tEBundleLLIZ);
                vsyncModule.LLIZLLLIL(new InterfaceC1279300jOa() { // from class: X.0jOS
                });
            }
        }
        C1278940jO0 c1278940jO02 = this.LLILLL;
        if (c1278940jO02.LJIIL == null || c1278940jO02.LJIILIIL == null) {
            return;
        }
        String str = C1278940jO0.LJIIZILJ;
        AVLog.d(str, "Dump default rtmp config:");
        c1278940jO02.LJIILIIL.dump();
        c1278940jO02.LJIILIIL.setLong("sei_ntp_time_shift", c1278940jO02.LJFF.LIZLLL);
        c1278940jO02.LJIILIIL.setLong("rtmp_init_audio_bitrate", c1278940jO02.LIZIZ.audioBitrate);
        c1278940jO02.LJIILIIL.setLong("rtmp_init_video_bitrate", c1278940jO02.LIZIZ.defaultBitrate);
        c1278940jO02.LJIILIIL.setLong("rtmp_max_video_bitrate", c1278940jO02.LIZIZ.maxBitrate);
        c1278940jO02.LJIILIIL.setLong("rtmp_min_video_bitrate", c1278940jO02.LIZIZ.minBitrate);
        if (c1278940jO02.LIZLLL.LJFF) {
            c1278940jO02.LIZIZ.getClass();
        }
        TEBundle tEBundle7 = c1278940jO02.LJIILIIL;
        c1278940jO02.LIZIZ.getClass();
        tEBundle7.setInt("rtmp_bw_est_strategy", 0);
        c1278940jO02.LJIILIIL.setString("qos_id", c1278940jO02.LIZIZ.LJJIL.toString());
        c1278940jO02.LJIILIIL.setBool("transport_enable_new_update_send_cache_config", c1278940jO02.LIZIZ.LJJJI);
        if (!c1278940jO02.LIZ.LJIIJ.isEmpty()) {
            c1278940jO02.LJIILIIL.setString("live_auth_string", c1278940jO02.LIZ.LJIIJ);
        }
        c1278940jO02.LIZIZ.getClass();
        c1278940jO02.LJIILIIL.setBool("video_enable_ntp", false);
        WeakReference<Object> weakReference = c1278940jO02.LIZJ.LJIIJJI;
        C1278750jNh c1278750jNh2 = (C1278750jNh) (weakReference == null ? null : weakReference.get());
        if (c1278750jNh2 != null && (tEBundle2 = c1278940jO02.LJIILIIL) != null) {
            tEBundle2.setString("video_type", c1278750jNh2.LJFF);
            tEBundle2.setBool("video_enable_accelera", c1278750jNh2.LIZIZ.useHardwareEncode);
            tEBundle2.setInt("video_width", c1278750jNh2.LIZIZ.width);
            tEBundle2.setInt("video_height", c1278750jNh2.LIZIZ.height);
            tEBundle2.setInt("video_profileLevel", c1278750jNh2.LJI);
            tEBundle2.setInt("video_fps", c1278750jNh2.LIZIZ.fps);
            tEBundle2.setInt("video_gop", (int) (c1278750jNh2.LIZIZ.gopSec * r0.fps));
        }
        WeakReference<Object> weakReference2 = c1278940jO02.LIZJ.LJIIJ;
        C1278840jNq c1278840jNq2 = (C1278840jNq) (weakReference2 == null ? null : weakReference2.get());
        if (c1278840jNq2 != null && (tEBundle = c1278940jO02.LJIILIIL) != null) {
            tEBundle.setString("audio_type", c1278840jNq2.LIZLLL);
            tEBundle.setBool("audio_enable_accelera", false);
            tEBundle.setInt("audio_channels", c1278840jNq2.LIZ.LJJIJLIJ.getChannel());
            tEBundle.setInt("audio_sample", c1278840jNq2.LIZ.LJJIJIIJI.getSampleRate());
            tEBundle.setInt("audio_bit_width", 16);
            tEBundle.setInt("audio_bit_rate", c1278840jNq2.LIZ.audioBitrate);
            tEBundle.setInt("audio_profileLevel", c1278840jNq2.LJ);
        }
        c1278940jO02.LJIILIIL.setBool("hit_node_optimize", c1278940jO02.LJ.LIZJ.LJIIJJI);
        String strLIZJ = c1278940jO02.LJ.LIZJ();
        if (!TextUtils.isEmpty(strLIZJ)) {
            c1278940jO02.LJIILIIL.setString("rtmp_tc_url", strLIZJ);
        }
        c1278940jO02.LJIILIIL.setString("session_id", c1278940jO02.LJ.LIZLLL());
        c1278940jO02.LJIILIIL.setString("liveio_settings", c1278940jO02.LIZIZ.LJJJJIZL.toString());
        c1278940jO02.LJIILIIL.setBool("rtmp_guard_setup_uri", c1278940jO02.LIZIZ.LJJJJLL);
        try {
            c1278940jO02.LIZLLL.LIZ(c1278940jO02.LJIILIIL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("update kcp params failed, error: ");
            sbLIZ2.append(e);
            AVLog.ioe(str, C2188811AlT.LIZIZ(sbLIZ2));
        }
        try {
            c1278940jO02.LIZLLL.LIZIZ(c1278940jO02.LJIILIIL);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("update quic params failed, error: ");
            sbLIZ3.append(e2);
            AVLog.ioe(str, C2188811AlT.LIZIZ(sbLIZ3));
        }
        try {
            c1278940jO02.LJII(c1278940jO02.LJIILIIL);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("update bandwidth estimate config failed, error: ");
            sbLIZ4.append(e3);
            AVLog.ioe(str, C2188811AlT.LIZIZ(sbLIZ4));
        }
        try {
            c1278940jO02.LJIIIIZZ(c1278940jO02.LJIILIIL);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("update rtmp cache config failed, error: ");
            sbLIZ5.append(e4);
            AVLog.ioe(str, C2188811AlT.LIZIZ(sbLIZ5));
        }
        SandboxParams sandboxParams = c1278940jO02.LIZ.LJI.sandboxParams;
        if (sandboxParams != null) {
            if (C173600la.LIZ(Integer.valueOf(sandboxParams.enable))) {
                c1278940jO02.LJIILIIL.setInt("transport_enable_sandbox_proceed", sandboxParams.enable);
            }
            if (C173600la.LIZ(Integer.valueOf(sandboxParams.enableSandBoxIntercept))) {
                c1278940jO02.LJIILJJIL = true;
                c1278940jO02.LJIILIIL.setInt("transport_enable_sandbox_intercept", sandboxParams.enableSandBoxIntercept);
            }
            if (C173600la.LIZ(Integer.valueOf(sandboxParams.enableSandboxCheckSei))) {
                c1278940jO02.LJIILIIL.setInt("transport_enable_sandbox_check_sei", sandboxParams.enableSandboxCheckSei);
            }
        }
        c1278940jO02.LJIIL.setParameter(c1278940jO02.LJIILIIL);
        AVLog.d(str, "Dump update rtmp config:");
        c1278940jO02.LJIILIIL.dump();
    }

    public final void LIZLLL() {
        LJI(C1278920jNy.LJI);
        TEBundle tEBundle = this.LLJJ;
        if (tEBundle != null) {
            tEBundle.release();
            this.LLJJ = null;
        }
        MediaEncodeStream mediaEncodeStream = this.LLJILLL;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.LJIILIIL();
            this.LLJILLL.LJFF(null);
            this.LLJILLL.LJI();
            this.LLJILLL = null;
        }
        this.LLILLL.LIZ();
        this.LLILLJJLI.LJ().LJIIIIZZ(this.LLJ.LIZ);
        LJI(C1278920jNy.LJII);
    }

    public final void LJ() {
        if (this.LLJ.LIZIZ() || this.LLJ == C1278920jNy.LJ || this.LLJ == C1278920jNy.LJFF || this.LLJ == C1278920jNy.LJI) {
            this.LLILLJJLI.LJ().LJJI();
            C1278940jO0 c1278940jO0 = this.LLILLL;
            c1278940jO0.LJIIJ = false;
            c1278940jO0.LJ.LIZJ.LIZ();
            c1278940jO0.LIZJ.LIZ.removeCallbacks(c1278940jO0.LJIILLIIL);
            LIZLLL();
            if (this.LLJ.LIZIZ()) {
                return;
            }
            this.LLILLJJLI.LIZJ().LIZJ(504);
        }
    }

    public final void LJFF() {
        C1278920jNy c1278920jNy = this.LLJ;
        C1278920jNy c1278920jNy2 = C1278920jNy.LJIIIIZZ;
        if (c1278920jNy == c1278920jNy2) {
            return;
        }
        if (this.LLILLJJLI.LIZ.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(this.LLILLJJLI.LIZ, new ARunnableS120S0100000_20(this, 471));
            return;
        }
        if (this.LLJ == C1278920jNy.LJ || this.LLJ == C1278920jNy.LJFF) {
            this.LLILLJJLI.LJ().LJIJI();
            LJ();
        }
        LJI(c1278920jNy2);
        VeLiveVideoAdapter veLiveVideoAdapter = this.LLJI;
        if (veLiveVideoAdapter != null) {
            veLiveVideoAdapter.LIZIZ();
        }
        C1278940jO0 c1278940jO0 = this.LLILLL;
        if (c1278940jO0 != null) {
            c1278940jO0.LIZ();
        }
        C1278790jNl c1278790jNl = this.LLILZ;
        if (c1278790jNl != null) {
            C786410Ut5.LJJZZIII(c1278790jNl.LJ.LIZ, new ARunnableS120S0100000_20(c1278790jNl, 475));
        }
        DefaultVideoEncoderFactory defaultVideoEncoderFactory = this.LLJILJIL;
        if (defaultVideoEncoderFactory != null) {
            defaultVideoEncoderFactory.release();
            this.LLJILJIL = null;
        }
        DefaultAudioEncoderFactory defaultAudioEncoderFactory = this.LLJILJILJ;
        if (defaultAudioEncoderFactory != null) {
            defaultAudioEncoderFactory.release();
            this.LLJILJILJ = null;
        }
        MediaEngineFactory mediaEngineFactory = this.LLJIJIL;
        if (mediaEngineFactory != null) {
            synchronized (mediaEngineFactory) {
                long j = mediaEngineFactory.LIZ;
                if (j != 0) {
                    JniCommon.nativeReleaseRef(j);
                    mediaEngineFactory.LIZ = 0L;
                }
            }
            this.LLJIJIL = null;
        }
    }

    public final void LJII() {
        Handler handler;
        if (this.LLJ != C1278920jNy.LJIIIIZZ) {
            LJI(C1278920jNy.LJI);
            C1278940jO0 c1278940jO0 = this.LLILLL;
            if (c1278940jO0.LIZIZ.LJJJJZ && c1278940jO0.LJIIL != null && (handler = c1278940jO0.LIZJ.LIZIZ) != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1278940jO0, 468));
            }
            C786410Ut5.LJJZZIII(this.LLILLJJLI.LIZ, new ARunnableS120S0100000_20(this, 473));
        }
    }

    public final void LJI(C1278920jNy c1278920jNy) {
        if (c1278920jNy == null || this.LLJ == C1278920jNy.LJIIIIZZ) {
            return;
        }
        this.LLJ = c1278920jNy;
    }

    public C1278760jNi(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        PushBase pushBase = c1277590jLp.LJI.mPushBase;
        this.LL = pushBase;
        this.LLILLJJLI = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJFF = new WeakReference<>(this);
        MediaEngineFactory mediaEngineFactoryLIZ = MediaEngineFactory.LIZ();
        this.LLJIJIL = mediaEngineFactoryLIZ;
        mediaEngineFactoryLIZ.LIZLLL(c1277590jLp.LJI.switchParams.statisticsType);
        this.LLJILJIL = new DefaultVideoEncoderFactory(c1277590jLp);
        this.LLJILJILJ = new DefaultAudioEncoderFactory();
        this.LLILLL = new C1278940jO0(c1277590jLp, this.LLILLJJLI);
        this.LLILZ = new C1278790jNl(c1277590jLp, this.LLILLJJLI);
        this.LLILZIL = new C1278840jNq(c1277590jLp, this.LLILLJJLI);
        this.LLILZLL = new C1278750jNh(c1277590jLp, this.LLILLJJLI);
        this.LLIZLLLIL = new C1278780jNk(c1277590jLp, this.LLILLJJLI);
        this.LLIZ = new C1279110jOH(pushBase);
        StrategyConfiguration strategyConfiguration = c1277590jLp.LJI.strategyConfiguration;
        if (strategyConfiguration != null) {
            this.LLJI = new VeLiveVideoAdapter(pushBase, strategyConfiguration);
        }
        LJI(C1278920jNy.LIZLLL);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    @Override // X.InterfaceC1279120jOI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMediaEncodeStreamEvent(int r23, int r24, long r25, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1278760jNi.onMediaEncodeStreamEvent(int, int, long, java.lang.String):void");
    }
}
