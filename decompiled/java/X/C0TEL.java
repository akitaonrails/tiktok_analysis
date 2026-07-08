package X;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.api.inner.ConnectCode;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualLiveStateMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraConnectMsg;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraMirrorInfoMsg;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TEL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TEL {
    public static 1JLc LIZ;
    public static PhoneAsCameraMirrorInfoMsg LIZIZ;
    public static ServiceInfo LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static String LJFF;
    public static final BPEAHandler LJI;
    public static C11PQ<AbstractC743230TDl> LJII;
    public static C11PQ<EnumC743340TDw> LJIIIIZZ;
    public static final C0TEI LJIIIZ;
    public static C1273340jEy LJIIJ;
    public static C0TEP LJIIJJI;

    static {
        Map<String, Object> map = C1338270kvh.LIZ;
        System.currentTimeMillis();
        LJFF = CardStruct.IStatusCode.DEFAULT;
        LJI = new BPEAHandler(Looper.getMainLooper());
        LJII = C11PQ.LJLLLLLL(C743260TDo.LIZ);
        LJIIIIZZ = C11PQ.LJLLLLLL(EnumC743340TDw.CAST_STATE_IDLE);
        LJIIIZ = C0TEI.LL;
    }

    public static final void LIZIZ() {
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        if (context == null) {
            return;
        }
        LJFF(context);
    }

    public static void LIZJ() {
        C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "releaseAll");
        LIZLLL();
        C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "releaseInternal");
        LJIIJ = null;
        LJIIJJI = null;
        LJ = false;
        LJI.removeCallbacks(LJIIIZ);
        LJ();
    }

    public static void LIZLLL() {
        1JLP r1;
        1JLP r0;
        C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "resetByteCast");
        1JLc r02 = LIZ;
        if (r02 != null && (r0 = r02.LIZLLL()) != null) {
            r0.LJIIJJI();
        }
        1JLc r03 = LIZ;
        if (r03 != null && (r1 = r03.LIZLLL()) != null) {
            r1.LJIIJ("UsbSource");
        }
        LIZLLL = false;
        LIZJ = null;
        1JLc r04 = LIZ;
        if (r04 != null) {
            r04.LIZIZ();
        }
        LIZ = null;
        LJI.removeCallbacks(LJIIIZ);
    }

    public static void LJ() {
        LJII = C11PQ.LJLLLLLL(C743260TDo.LIZ);
        LJIIIIZZ = C11PQ.LJLLLLLL(EnumC743340TDw.CAST_STATE_IDLE);
    }

    public static void LJI() {
        1JLP r0;
        PhoneAsCameraMirrorInfoMsg phoneAsCameraMirrorInfoMsg = LIZIZ;
        if (phoneAsCameraMirrorInfoMsg != null) {
            MirrorInfo mirrorInfo = new MirrorInfo();
            mirrorInfo.enableEncodeSizeToScreen(true);
            mirrorInfo.setFps(phoneAsCameraMirrorInfoMsg.fps);
            if (Build.VERSION.SDK_INT >= 29) {
                mirrorInfo.setAudioEnable(true);
                mirrorInfo.setAudioSource(phoneAsCameraMirrorInfoMsg.audioSource);
            } else {
                mirrorInfo.setAudioEnable(false);
                1JLc r2 = LIZ;
                if (r2 != null) {
                    r2.LJIIIZ(10017, new Object[]{Boolean.FALSE});
                }
            }
            int i = (int) ((((phoneAsCameraMirrorInfoMsg.videoWidth * phoneAsCameraMirrorInfoMsg.videoHeight) * phoneAsCameraMirrorInfoMsg.fps) * phoneAsCameraMirrorInfoMsg.bitRateScale) / LSPassThroughRecordSizeConfig.DEFAULT);
            if (20000 >= i) {
                i = 20000;
            }
            mirrorInfo.setBitrate(i);
            mirrorInfo.setAutoBitrate(false);
            mirrorInfo.setBitRateLevel(4);
            mirrorInfo.setVideoSrc(2);
            mirrorInfo.setCameraId(1);
            mirrorInfo.setServerMode(phoneAsCameraMirrorInfoMsg.serverMode);
            mirrorInfo.setResolutionLevel(3);
            mirrorInfo.setEncodeWidth(phoneAsCameraMirrorInfoMsg.videoWidth);
            mirrorInfo.setEncodeHeight(phoneAsCameraMirrorInfoMsg.videoHeight);
            mirrorInfo.setServiceInfo(LIZJ);
            1JLc r02 = LIZ;
            if (r02 == null || (r0 = r02.LIZLLL()) == null) {
                return;
            }
            r0.LJI(mirrorInfo);
        }
    }

    public static final void LIZ(C1273340jEy c1273340jEy) {
        1JLc r0;
        1JLP r1;
        1JLP r02;
        if (!LIZLLL) {
            C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "startMirror, not init --wiredManager");
            return;
        }
        LJIIJ = c1273340jEy;
        1JLc r03 = LIZ;
        if (r03 != null && (r02 = r03.LIZLLL()) != null) {
            r02.LJ(c1273340jEy);
        }
        if (LIZIZ != null && (r0 = LIZ) != null && (r1 = r0.LIZLLL()) != null) {
            r1.LJIIIIZZ("UsbSource");
        }
    }

    public static void LJFF(Context context) {
        if (LIZ != null) {
            return;
        }
        C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "setByteCastSource");
        1JLc r2 = new 1JLc();
        C0TFE.LIZ.getClass();
        C0TFE.LJIIIIZZ(r2);
        C0TFE.LJIIIZ(r2);
        r2.LJFF(context, C0TFE.LJ("ByteCast", false), new IInitListener() { // from class: X.0TEJ
            public final /* synthetic */ void onError(int i, String str) {
                1JMs.LIZ(this, i, str);
            }

            public final void onSuccess() {
                C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "onSuccess, init --wiredManager");
                C0TEL.LIZLLL = true;
                C786410Ut5.LJLIIL(20000L, C0TEL.LJI, C0TEL.LJIIIZ);
                C0TEL.LJII.onNext(C743250TDn.LIZ);
            }

            public final void onFail(int i, String str, Exception exc) {
                C0TEL.LIZLLL = false;
                C0TEL.LJII.onNext(new C743160TDe(i, str));
                C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "onFail, init --wiredManager");
            }
        });
        1JLP r1 = r2.LIZLLL();
        if (r1 != null) {
            r1.LJII(new IMirrorListener() { // from class: X.0TEH
                public final /* synthetic */ void onConnectFailed(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LIZIZ(this, serviceInfo, i, str);
                }

                public final /* synthetic */ void onConnected(ServiceInfo serviceInfo) {
                    1JMD.LIZJ(this, serviceInfo);
                }

                public final /* synthetic */ void onConnecting(ServiceInfo serviceInfo) {
                    1JMD.LIZLLL(this, serviceInfo);
                }

                public final /* synthetic */ void onDisconnected(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LJFF(this, serviceInfo, i, str);
                }

                public final /* synthetic */ void onDisconnecting(ServiceInfo serviceInfo) {
                    1JMD.LJI(this, serviceInfo);
                }

                public final /* synthetic */ void onError(int i, int i2, int i3, String str) {
                    1JFt.LIZ(this, i, i2, i3, str);
                }

                public final /* synthetic */ void onInfo(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LJIIIIZZ(this, serviceInfo, i, str);
                }

                public final /* synthetic */ boolean onInvite(String str, int i) {
                    return 1JFt.LIZLLL(this, str, i);
                }

                public final void onMirrorModeChange(int i) {
                }

                public final boolean onStartMirrorAuthorization() {
                    return true;
                }

                public final void onStatistics(Statistics statistics) {
                }

                public final void onStart(int i) {
                    if (i != 10) {
                        return;
                    }
                    C0TEL.LJII.onNext(new C743180TDg(i));
                    C0TEL.LJIIIIZZ.onNext(EnumC743340TDw.CAST_STATE_MIRRORING);
                    C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "onStart,  --wiredManager");
                }

                public final void onStop(int i) {
                    if (i != 10) {
                        return;
                    }
                    C0TEL.LJII.onNext(new C743240TDm(i));
                    C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "onStop,  --wiredManager");
                }

                public final void onConnect(ServiceInfo serviceInfo, int i) {
                    String str;
                    if (serviceInfo != null) {
                        str = serviceInfo.protocols;
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.LJFF(str, "UsbSource")) {
                        return;
                    }
                    C0TEL.LIZJ = serviceInfo;
                    C0TEL.LJI.removeCallbacks(C0TEL.LJIIIZ);
                    C0TEL.LJII.onNext(new C743310TDt(serviceInfo, 0));
                }

                public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) {
                    String str;
                    if (serviceInfo != null) {
                        str = serviceInfo.protocols;
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.LJFF(str, "UsbSource")) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onDisconnect, what: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", extra: ");
                    sbLIZ.append(i2);
                    C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (C0TEL.LJII(i, i2)) {
                        C0TEL.LJII.onNext(new C743320TDu(i, i2));
                        return;
                    }
                    C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "onlyResetByteCast");
                    C0TEL.LIZLLL();
                    C0TEL.LIZIZ();
                    C0TEL.LJIIIIZZ.onNext(EnumC743340TDw.CAST_STATE_RECONNECTING);
                    C0TEL.LJII.onNext(new C743290TDr(i, i2, ""));
                    C786410Ut5.LJJZZIII(C0TEL.LJI, C0TEL.LJIIIZ);
                }

                public final void onError(ServiceInfo serviceInfo, int i, String str) {
                    Boolean boolValueOf;
                    String str2;
                    if (serviceInfo != null && (str2 = serviceInfo.protocols) != null) {
                        boolValueOf = Boolean.valueOf(a0.LJJIIZI(str2, "UsbSource", false));
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onError,  errorCode: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", msg: ");
                    sbLIZ.append(str);
                    C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", C2188811AlT.LIZIZ(sbLIZ));
                    C0TEL.LJII.onNext(new C743290TDr(0, i, str));
                }

                public final boolean onInvite(String str, int i, String str2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onInvite, ip: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", port: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ,msg: ");
                    sbLIZ.append(str2);
                    C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", C2188811AlT.LIZIZ(sbLIZ));
                    1JLc r0 = C0TEL.LIZ;
                    C0TEL.LIZJ = new ServiceInfo("", str, i, i, "usb", "UsbSource");
                    C0TEL.LJI.removeCallbacks(C0TEL.LJIIIZ);
                    return true;
                }

                public final void onInfo(int i, int i2, int i3, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onInfo, what ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", errorCode: ");
                    sbLIZ.append(i3);
                    C20441214yg.LJ("GamePhoneAsCameraWiredManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
        r2.LJIIIIZZ(new IMessageListener() { // from class: X.0TEK
            public final String onMessageSync(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("test onMessageSync from source:");
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final void onMessage(ServiceInfo serviceInfo, String str) {
                1JLP r12;
                1JLP r13;
                C0TFE.LIZ.getClass();
                C0TER c0terLJII = C0TFE.LJII(str);
                if (c0terLJII instanceof PhoneAsCameraConnectMsg) {
                    PhoneAsCameraConnectMsg phoneAsCameraConnectMsg = (PhoneAsCameraConnectMsg) c0terLJII;
                    n nVar = phoneAsCameraConnectMsg.extra;
                    1JLc r0 = C0TEL.LIZ;
                    try {
                        C0TEL.LIZIZ = (PhoneAsCameraMirrorInfoMsg) C19748512Ol.LIZIZ.LJII(String.valueOf(nVar), PhoneAsCameraMirrorInfoMsg.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("GamePhoneAsCameraWiredManager", e);
                    }
                    C0TEL.LJI();
                    if (C0TEL.LJ && phoneAsCameraConnectMsg.startMirror == 1) {
                        1JLc r02 = C0TEL.LIZ;
                        if (r02 != null && (r13 = r02.LIZLLL()) != null) {
                            r13.LJ(C0TEL.LJIIJ);
                        }
                        1JLc r03 = C0TEL.LIZ;
                        if (r03 != null && (r12 = r03.LIZLLL()) != null) {
                            r12.LJIIIIZZ("UsbSource");
                        }
                    }
                    if (phoneAsCameraConnectMsg.startMirror == 1) {
                        C0TEL.LJII.onNext(new C743310TDt(serviceInfo, 0));
                    }
                } else if (c0terLJII instanceof DualLiveStateMessage) {
                    1JLc r04 = C0TEL.LIZ;
                    C0TEL.LJFF = ((DualLiveStateMessage) c0terLJII).roomId;
                }
                C0TEP c0tep = C0TEL.LJIIJJI;
                if (c0tep != null) {
                    c0tep.LIZ(c0terLJII);
                }
            }
        });
        LIZ = r2;
    }

    public static boolean LJII(int i, int i2) {
        if (i == ConnectCode.CONNECT_INFO_DISCONNECT && i2 == ConnectCode.CONNECT_ERROR_KICK_OUT) {
            return true;
        }
        return false;
    }
}
