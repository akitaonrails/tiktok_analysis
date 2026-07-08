package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.params.KcpParams;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.QuicParams;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0jUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283040jUc {
    public static final String LJIILIIL = C1283040jUc.class.getSimpleName();
    public final C1277590jLp LIZ;
    public final C1278910jNx LIZIZ;
    public final KcpParams LIZJ;
    public final QuicParams LIZLLL;
    public int LJ;
    public boolean LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ = 3;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public final void LIZ(TEBundle tEBundle) {
        KcpParams kcpParams = this.LIZJ;
        TEBundle tEBundle2 = new TEBundle();
        if (C173600la.LIZ(Integer.valueOf(kcpParams.wndRecv))) {
            tEBundle2.setInt("wnd_recv", kcpParams.wndRecv);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.wndSend))) {
            tEBundle2.setInt("wnd_send", kcpParams.wndSend);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.mtuSize))) {
            tEBundle2.setInt("mtu_size", kcpParams.mtuSize);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.fastAck))) {
            tEBundle2.setInt("fast_ack", kcpParams.fastAck);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.bwinit))) {
            tEBundle2.setInt("bwinit", kcpParams.bwinit);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.bwmin))) {
            tEBundle2.setInt("bwmin", kcpParams.bwmin);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.window))) {
            tEBundle2.setInt("window", kcpParams.window);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.probebw))) {
            tEBundle2.setInt("probebw", kcpParams.probebw);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.preempt))) {
            tEBundle2.setInt("preempt", kcpParams.preempt);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.jitter))) {
            tEBundle2.setInt("jitter", kcpParams.jitter);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.timeout))) {
            tEBundle2.setInt("timeout", kcpParams.timeout);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.retrans))) {
            tEBundle2.setInt("retrans", kcpParams.retrans);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.report))) {
            tEBundle2.setInt("report", kcpParams.report);
        }
        if (C173600la.LIZ(Double.valueOf(kcpParams.lost))) {
            tEBundle2.setDouble("lost", kcpParams.lost);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.fec))) {
            tEBundle2.setInt("fec", kcpParams.fec);
        }
        if (C173600la.LIZ(Integer.valueOf(kcpParams.logMask))) {
            tEBundle2.setInt("logmask", kcpParams.logMask);
        }
        tEBundle.setBundle("kcp_params", tEBundle2);
        tEBundle2.release();
    }

    public final void LIZIZ(TEBundle tEBundle) throws Throwable {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        QuicParams quicParams = this.LIZLLL;
        if (C173600la.LIZ(Integer.valueOf(quicParams.protocolDowngrade))) {
            if (quicParams.protocolDowngrade == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.LJII = z3;
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.protocolRetryTimes))) {
            this.LJIIJ = quicParams.protocolRetryTimes;
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.enableDowngradeInSend))) {
            if (quicParams.enableDowngradeInSend == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJIIJJI = z2;
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.protocolDowngrade))) {
            if (quicParams.abkeyProtocolDowngrade == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIIIZZ = z;
        }
        TEBundle tEBundle2 = new TEBundle();
        if (C173600la.LIZ(Integer.valueOf(quicParams.enableSaveScfg))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Context context = this.LIZ.LIZ;
            File file = C786450Ut9.LIZJ;
            if (file == null || !C786450Ut9.LJ) {
                try {
                    C786450Ut9.LIZJ = context.getFilesDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Context applicationContext = null;
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mInitialApplication");
                        declaredField.setAccessible(true);
                        obj = declaredField.get(objInvoke);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Error: ");
                        sbLIZ2.append(e.getMessage());
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (obj instanceof Application) {
                        applicationContext = ((Application) obj).getApplicationContext();
                        PrintStream printStream2 = System.out;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Application context obtained through ActivityThread: ");
                        sbLIZ3.append(applicationContext);
                        printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                        if (applicationContext != null) {
                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                            C08RN.LIZ(applicationContext);
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(th.getMessage());
                        sbLIZ4.append(":");
                        sbLIZ4.append(C08RN.LIZJ());
                        sbLIZ4.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                    sbLIZ42.append(th.getMessage());
                    sbLIZ42.append(":");
                    sbLIZ42.append(C08RN.LIZJ());
                    sbLIZ42.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ42));
                }
                file = C786450Ut9.LIZJ;
            }
            sbLIZ.append(file.getAbsolutePath());
            sbLIZ.append(File.separator);
            sbLIZ.append("pushstream.scfg");
            tEBundle2.setString("scfg_address", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.congestionType))) {
            tEBundle2.setInt("congestion_type", quicParams.congestionType);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.lossDetectionType))) {
            tEBundle2.setInt("loss_detection_type", quicParams.lossDetectionType);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.quicVersion))) {
            tEBundle2.setInt("quic_version", quicParams.quicVersion);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.logLevel))) {
            tEBundle2.setInt("log_level", quicParams.logLevel);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.adatEstBwToQuicBw))) {
            tEBundle2.setInt("adapt_est_bw_to_quic_bw", quicParams.adatEstBwToQuicBw);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.enableCertVerify))) {
            tEBundle2.setInt("enable_cert_verify", quicParams.enableCertVerify);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.initMtu))) {
            tEBundle2.setInt("init_mtu", quicParams.initMtu);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.enableMtuDiscovery))) {
            tEBundle2.setInt("enable_mtu_discovery", quicParams.enableMtuDiscovery);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.initCwnd))) {
            tEBundle2.setInt("init_cwnd", quicParams.initCwnd);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.defaultRetransmitTime))) {
            tEBundle2.setInt("default_retransmit_time", quicParams.defaultRetransmitTime);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.fixStreamFinAndRst))) {
            tEBundle2.setInt("fix_stream_fin_and_rst", quicParams.fixStreamFinAndRst);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.sendBufferSize))) {
            tEBundle2.setInt("send_buffer_size", quicParams.sendBufferSize);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.recvBufferSize))) {
            tEBundle2.setInt("recv_buffer_size", quicParams.recvBufferSize);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.fixPacketWriter))) {
            tEBundle2.setInt("fix_packet_writer", quicParams.fixPacketWriter);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.ignoreSocketWriterError))) {
            tEBundle2.setInt("ignore_socket_write_error", quicParams.ignoreSocketWriterError);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.bwWindowSize))) {
            tEBundle2.setInt("bw_window_size", quicParams.bwWindowSize);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.rttWindowSize))) {
            tEBundle2.setInt("rtt_window_size", quicParams.bwWindowSize);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.probeBwRandomCycleLength))) {
            tEBundle2.setInt("probe_bw_random_cycle_length", quicParams.probeBwRandomCycleLength);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.probeRttGain))) {
            tEBundle2.setInt("probe_rtt_gain", quicParams.probeRttGain);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.initQuicType))) {
            tEBundle2.setInt("init_quic_type", quicParams.initQuicType);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.enableIpSwitch))) {
            tEBundle2.setInt("enable_ip_switch_opt", quicParams.enableIpSwitch);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.disableIpv6))) {
            tEBundle2.setInt("disable_ipv6", quicParams.disableIpv6);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.retryCount))) {
            tEBundle2.setInt("retry_count", quicParams.retryCount);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.enbaleBbrInfoReport))) {
            tEBundle2.setInt("enable_bbrinfo_report", quicParams.enbaleBbrInfoReport);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.enbaleBbrOptimize))) {
            tEBundle2.setInt("enable_bbr_optimize", quicParams.enbaleBbrOptimize);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.openTimeOut))) {
            tEBundle2.setInt("open_timeout", quicParams.openTimeOut);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.rwTimeOut))) {
            tEBundle2.setInt("read_write_timeout", quicParams.rwTimeOut);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.enableOptimizeMemoryCopy))) {
            tEBundle2.setInt("enable_optimize_memory_copy", quicParams.enableOptimizeMemoryCopy);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.useQuicTimeV2))) {
            tEBundle2.setInt("use_quic_time_v2", quicParams.useQuicTimeV2);
        }
        if (C173600la.LIZ(Integer.valueOf(quicParams.lsquicOpenBlock))) {
            tEBundle2.setInt("lsquic_open_block", quicParams.lsquicOpenBlock);
        }
        n nVar = quicParams.quicEngineParam;
        if (nVar != null) {
            tEBundle2.setString("quic_engine_param", nVar.toString());
        }
        n nVar2 = quicParams.quicConfigJson;
        if (nVar2 != null) {
            tEBundle2.setString("quic_config_json", nVar2.toString());
        }
        n nVar3 = quicParams.quicCcOptJson;
        if (nVar3 != null) {
            tEBundle2.setString("quic_cc_opt_json", nVar3.toString());
        }
        tEBundle.setBundle("quic_params", tEBundle2);
        tEBundle2.release();
    }

    public C1283040jUc(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LIZ = c1277590jLp;
        LiveSdkSetting liveSdkSetting = c1277590jLp.LJI;
        this.LIZJ = liveSdkSetting.LIZ;
        this.LIZLLL = liveSdkSetting.LIZIZ;
        this.LIZIZ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJIILLIIL = new WeakReference<>(this);
    }
}
