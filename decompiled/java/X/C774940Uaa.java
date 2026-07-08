package X;

import Y.AObjectS115S0000000_12;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import Y.ARunnableS91S0000000_12;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.livesdk.game.common.datachannel.GameLiveInternalRecordFallbackChannel;
import com.bytedance.android.livesdk.live.model.VolumeDetectConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableScreenCaptureInterruptCheckSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.FrameSignV3Setting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveAnchorBlackCheckConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePushSdkParamsCacheSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableSdkParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.livesetting.game.GameAudioInferLibraSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774940Uaa implements InterfaceC774920UaY, InterfaceC775290Ub9, C0UHL {
    public static final int[][] LLJJIJI = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};
    public final Context LLILLL;
    public InterfaceC769940UIe LLILZ;
    public final Room LLILZIL;
    public InterfaceC774920UaY LLILZLL;
    public C785760Us2 LLJ;
    public C776420Ucy LLJI;
    public C776430Ucz LLJIJIL;
    public final C774960Uac LLJILLL;
    public InterfaceC774990Uaf LLJJ;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public ARunnableS81S0200000_12 LLILLJJLI = null;
    public boolean LLIZ = false;
    public boolean LLIZLLLIL = false;
    public int LLJILJIL = 0;
    public int LLJILJILJ = 0;
    public boolean LLJJI = false;
    public C151O LLJJIII = null;

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void L1(int i) {
    }

    @Override // X.InterfaceC1266820j4S
    public final /* synthetic */ void LIZJ(Map map) {
    }

    @Override // X.InterfaceC1266820j4S
    public final void LIZLLL(int i, int i2, int i3) {
    }

    @Override // X.InterfaceC774920UaY
    public final void fE() {
        C775010Uah.LIZ = 1;
        C784440Upu.LIZ().LIZIZ(new C775000Uag(1));
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.fE();
        }
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void mQ() {
    }

    @Override // X.InterfaceC1266820j4S
    public final /* synthetic */ void onInfo(int i, int i2, String str) {
    }

    @Override // X.InterfaceC774920UaY
    public final void vn(double d, double d2, double d3) {
    }

    @Override // X.InterfaceC774920UaY
    public final void GR() {
        C20441214yg.LIZIZ("dual_device_vertical_layout", "stream onReconnected");
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS112S0100000_12(this, 425));
        C775010Uah.LIZ = 1;
        C784440Upu.LIZ().LIZIZ(new C775000Uag(1));
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.GR();
            C775080Uao.LIZ();
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void HQ() {
        C20441214yg.LIZIZ("dual_device_vertical_layout", "stream onReconnected");
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS91S0000000_12(2));
        C775010Uah.LIZ = 0;
        C784440Upu.LIZ().LIZIZ(new C775000Uag(0));
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.HQ();
            C775080Uao.LIZIZ();
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void Kj() {
        if (!EnableScreenCaptureInterruptCheckSetting.INSTANCE.enable()) {
            C20441214yg.LJ("GameServiceStrategy", "onScreenCaptureMaybeInterrupted EnableScreenCaptureInterruptCheckSetting not enable");
            return;
        }
        C20441214yg.LJ("GameServiceStrategy", "onScreenCaptureMaybeInterrupted");
        InterfaceC769940UIe interfaceC769940UIe = this.LLILZ;
        if (interfaceC769940UIe == null || interfaceC769940UIe.getLiveCore() == null) {
            return;
        }
        try {
            C20441214yg.LJ("GameServiceStrategy", "onScreenCaptureMaybeInterrupted pause");
            C776430Ucz c776430Ucz = this.LLJIJIL;
            if (c776430Ucz != null) {
                c776430Ucz.LIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    public final Point LIZ() {
        JSONObject jSONObject;
        if (!LiveStreamEnableSdkParamsSetting.INSTANCE.enable()) {
            return null;
        }
        if (!LivePushSdkParamsCacheSetting.INSTANCE.enable()) {
            String strLIZIZ = this.LLILZIL.getStreamUrl().LIZIZ();
            if (strLIZIZ != null && !strLIZIZ.isEmpty()) {
                try {
                    jSONObject = new JSONObject(strLIZIZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("GameServiceStrategy", e);
                }
            }
            return null;
        }
        jSONObject = this.LLILZIL.getStreamUrl() != null ? this.LLILZIL.getStreamUrl().LIZJ() : null;
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "PushBase");
            int iIntValue = ((Integer) jSONObject2.get("width")).intValue();
            int iIntValue2 = ((Integer) jSONObject2.get("height")).intValue();
            if (iIntValue > 0 && iIntValue2 > 0) {
                Point point = new Point();
                point.x = iIntValue;
                point.y = iIntValue2;
                return point;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJI("GameServiceStrategy", e2);
        }
        return null;
    }

    public final String LIZIZ() {
        Room room = this.LLILZIL;
        if (room == null || room.getStreamUrl() == null || this.LLILZIL.getStreamUrl().LIZIZ() == null) {
            return null;
        }
        return this.LLILZIL.getStreamUrl().LIZIZ();
    }

    public final void LJ() {
        AbstractC1273900jFs liveCore;
        InterfaceC769940UIe interfaceC769940UIe = this.LLILZ;
        if (interfaceC769940UIe == null) {
            return;
        }
        interfaceC769940UIe.LJIILL(CertProviderManagerKt.findCert("bpea-388", 1476788484));
        this.LLJILLL.LIZ(true);
        InterfaceC774990Uaf interfaceC774990Uaf = this.LLJJ;
        if (interfaceC774990Uaf != null) {
            interfaceC774990Uaf.LIZIZ(true, this.LLILZ.getLiveCore(), this.LLJJI);
        }
        InterfaceC769940UIe interfaceC769940UIe2 = this.LLILZ;
        if (interfaceC769940UIe2 != null && (liveCore = interfaceC769940UIe2.getLiveCore()) != null) {
            liveCore.LJJI();
        }
        LJII(false);
    }

    public final void LJFF() {
        InterfaceC769940UIe interfaceC769940UIe = this.LLILZ;
        if (interfaceC769940UIe == null) {
            return;
        }
        interfaceC769940UIe.J3(CertProviderManagerKt.findCert("bpea-367", 1476788233), false);
        Map<String, Object> map = C1338270kvh.LIZ;
        AbstractC1273900jFs liveCore = this.LLILZ.getLiveCore();
        Cert certFindCert = CertProviderManagerKt.findCert("bpea-367", 1476788233);
        if (liveCore != null) {
            liveCore.LJJLJLI(this.LLJJIII, 1, certFindCert);
        }
        this.LLJILLL.LIZ(false);
        InterfaceC774990Uaf interfaceC774990Uaf = this.LLJJ;
        if (interfaceC774990Uaf != null) {
            interfaceC774990Uaf.LIZIZ(false, this.LLILZ.getLiveCore(), this.LLJJI);
        }
        LJII(true);
    }

    public final void LJI() {
        InterfaceC769940UIe interfaceC769940UIe = this.LLILZ;
        if (interfaceC769940UIe != null) {
            interfaceC769940UIe.release(CertProviderManagerKt.findCert("bpea-488", 1476788483));
        }
        DataChannelGlobal.LLILZ.IQ2(C930890aKd.class);
        C774960Uac c774960Uac = this.LLJILLL;
        c774960Uac.getClass();
        if (!OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            C779660UiC c779660UiC = C779660UiC.LIZ;
            C779660UiC.LJII();
        }
        c774960Uac.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (Build.VERSION.SDK_INT > 28) {
            C774950Uab.LIZIZ();
            C774950Uab.LJ = null;
            C774950Uab.LIZJ = false;
        }
        C774950Uab.LJII.clear();
        C774950Uab.LJI = null;
        InterfaceC774990Uaf interfaceC774990Uaf = this.LLJJ;
        if (interfaceC774990Uaf != null) {
            interfaceC774990Uaf.LIZ(this.LLILZ.getLiveCore());
            this.LLJJ = null;
        }
        C785760Us2 c785760Us2 = this.LLJ;
        if (c785760Us2 != null) {
            try {
                C786410Ut5.LJJIFFI(this.LLILLL, c785760Us2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unregister receiver exception msg:");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("GameServiceStrategy", C2188811AlT.LIZIZ(sbLIZ));
                Throwable th = new Throwable();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("GameServiceStrategy exception:");
                sbLIZ2.append(e.getMessage());
                C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), th);
            }
            this.LLJ = null;
        }
        ARunnableS81S0200000_12 aRunnableS81S0200000_12 = this.LLILLJJLI;
        if (aRunnableS81S0200000_12 != null) {
            this.LL.removeCallbacks(aRunnableS81S0200000_12);
        }
        this.LLJIJIL = null;
        C151O c151o = this.LLJJIII;
        if (c151o != null) {
            C11JF c11jf = c151o.LJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C204525151f c204525151f = c151o.LIZJ;
            if (c204525151f != null) {
                InterfaceC785730Urz interfaceC785730Urz = c204525151f.LIZIZ;
                if (interfaceC785730Urz != null) {
                    interfaceC785730Urz.LIZIZ(c204525151f.LJIIJ, "write_buffer_none_times");
                }
                HandlerThreadC204526151g handlerThreadC204526151g = c204525151f.LJ;
                if (handlerThreadC204526151g != null) {
                    handlerThreadC204526151g.LLIZLLLIL = false;
                    handlerThreadC204526151g.interrupt();
                }
                HandlerThreadC204526151g handlerThreadC204526151g2 = c204525151f.LJ;
                if (handlerThreadC204526151g2 != null) {
                    handlerThreadC204526151g2.interrupt();
                }
            }
            C204524151e c204524151e = c151o.LJI;
            if (c204524151e != null) {
                Map<String, Object> map2 = C1338270kvh.LIZ;
                c204524151e.LIZJ = false;
                DataChannelGlobal.LLILZ.HQ2(GameLiveInternalRecordFallbackChannel.class, Boolean.FALSE);
                synchronized (c204524151e.LJIILIIL) {
                    try {
                        BPEAHandler bPEAHandler = c204524151e.LJIILL;
                        if (bPEAHandler != null) {
                            bPEAHandler.removeCallbacksAndMessages(null);
                        }
                        HandlerThread handlerThread = c204524151e.LJIILJJIL;
                        if (handlerThread != null) {
                            handlerThread.quitSafely();
                        }
                        c204524151e.LJIILL = null;
                        c204524151e.LJIILJJIL = null;
                    } finally {
                    }
                }
                synchronized (c204524151e.LJIILLIIL) {
                    try {
                        c204524151e.LJIIZILJ.clear();
                        c204524151e.LJIJ = 0;
                    } finally {
                    }
                }
            }
        }
        if (GameLiveAnchorBlackCheckConfigSetting.INSTANCE.getValue().getEnable()) {
            C19377810rY.LIZ.LJIILJJIL();
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void bz() {
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.bz();
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void cN() {
        if (this.LLIZ) {
            C775010Uah.LIZ = 2;
            C784440Upu.LIZ().LIZIZ(new C775000Uag(2));
        }
        this.LLIZ = true;
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.cN();
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void onStreamStart() {
        InterfaceC774990Uaf interfaceC774990Uaf;
        AudioDeviceModule audioDeviceModuleLJLLI;
        C20441214yg.LIZIZ("dual_device_vertical_layout", "onStreamStart: ");
        Map<String, Object> map = C1338270kvh.LIZ;
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.onStreamStart();
            this.LLJILLL.LIZ.getClass();
            if (Build.VERSION.SDK_INT > 28) {
                if (C774950Uab.LJFF == null) {
                    C774950Uab.LIZJ = true;
                    C774950Uab.LIZLLL = true;
                    C774950Uab.LIZ();
                }
                if (C774950Uab.LJI == null) {
                    C774950Uab.LJI = C775020Uai.LIZ;
                    AbstractC1273900jFs abstractC1273900jFs = C774950Uab.LIZIZ;
                    if (abstractC1273900jFs != null && (audioDeviceModuleLJLLI = abstractC1273900jFs.LJLLI()) != null) {
                        audioDeviceModuleLJLLI.registerAudioRecordingCallback(C774950Uab.LJI);
                    }
                }
            }
            C775080Uao.LIZ();
            if (!OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
                C779660UiC.LIZ.LJI();
            }
        }
        InterfaceC769940UIe interfaceC769940UIe = this.LLILZ;
        if (interfaceC769940UIe == null || (interfaceC774990Uaf = this.LLJJ) == null) {
            return;
        }
        interfaceC774990Uaf.LIZJ(interfaceC769940UIe.getLiveCore(), this.LLJJI);
    }

    @Override // X.InterfaceC774920UaY
    public final void Nt() {
        BroadcastTimeLog.LIZ("rtmp_connected", String.valueOf(System.currentTimeMillis()));
        Handler handler = BroadcastTimeLog.LIZ;
        C786410Ut5.LJLJJL(handler, Message.obtain(handler, 3));
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).startLiveManager().LJIIJ();
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AObjectS115S0000000_12 aObjectS115S0000000_12 = new AObjectS115S0000000_12(11);
        c773220UUu.getClass();
        C773220UUu.LJIIL(aObjectS115S0000000_12);
    }

    @Override // X.InterfaceC774920UaY
    public final void v5() {
        BroadcastTimeLog.LIZ("capture_first_frame", String.valueOf(System.currentTimeMillis()));
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AObjectS115S0000000_12 aObjectS115S0000000_12 = new AObjectS115S0000000_12(10);
        c773220UUu.getClass();
        C773220UUu.LJIIL(aObjectS115S0000000_12);
    }

    @Override // X.InterfaceC774920UaY
    public final void HA(long j) {
        this.LLILZLL.HA(j);
    }

    public final void LJII(boolean z) {
        Room room = this.LLILZIL;
        if (room != null && room.getId() > 0) {
            if (z) {
                C249000xk.LIZ(2, this.LLILZIL.getId());
            } else {
                C249000xk.LIZ(1, this.LLILZIL.getId());
            }
            if (GameLiveAnchorBlackCheckConfigSetting.INSTANCE.getValue().getEnable()) {
                boolean z2 = !z;
                synchronized (C19377810rY.LIZ) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    if (z2) {
                        C19377810rY.LIZIZ++;
                    }
                }
            }
        }
    }

    public final void LJIIIIZZ(float f) {
        AbstractC1273900jFs liveCore;
        InterfaceC1274500jGq interfaceC1274500jGqLJJJJJL;
        VideoMixer.VideoMixerDescription videoMixerDescriptionLIZ;
        InterfaceC769940UIe interfaceC769940UIe = this.LLILZ;
        if (interfaceC769940UIe == null || (liveCore = interfaceC769940UIe.getLiveCore()) == null || (interfaceC1274500jGqLJJJJJL = liveCore.LJJJJJL()) == null || (videoMixerDescriptionLIZ = interfaceC1274500jGqLJJJJJL.LIZ()) == null) {
            return;
        }
        videoMixerDescriptionLIZ.top = 0.0f;
        videoMixerDescriptionLIZ.left = 0.0f;
        videoMixerDescriptionLIZ.right = 1.0f;
        videoMixerDescriptionLIZ.bottom = f;
        interfaceC1274500jGqLJJJJJL.LJIILJJIL(videoMixerDescriptionLIZ);
    }

    public final void LJIIJ(Cert cert) {
        InterfaceC769940UIe interfaceC769940UIe = this.LLILZ;
        if (interfaceC769940UIe != null) {
            interfaceC769940UIe.t3(cert);
            C0UHC.LIZ("release_audio");
            this.LLILZ.p3(cert);
            C0UHC.LIZ("release_screen");
            this.LLILZ.stop();
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void LLLLIILL(int i) {
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.LLLLIILL(i);
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void Th(float f) {
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.Th(f);
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void gG(boolean z) {
        if (z) {
            this.LLJILLL.LIZ.getClass();
            Map<String, Object> map = C1338270kvh.LIZ;
            if (Build.VERSION.SDK_INT > 28 && C774950Uab.LJFF == null) {
                C774950Uab.LIZJ = true;
                C774950Uab.LIZ();
            }
        }
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.gG(z);
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void pq(int i) {
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.pq(i);
        }
    }

    public C774940Uaa(Context context, Room room) {
        new ConcurrentHashMap();
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LLILLL = context;
        this.LLILZIL = room;
        C775010Uah.LIZ = 0;
        this.LLJILLL = new C774960Uac();
    }

    @Override // X.InterfaceC774920UaY
    public final void I1(int i, int i2) {
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.I1(i, i2);
        }
    }

    public final boolean LJIIIZ(Cert cert, boolean z) {
        InterfaceC769940UIe interfaceC769940UIe;
        if (this.LLILZIL.getStreamUrl() != null && this.LLILZIL.getStreamUrl().LIZLLL() != null && (interfaceC769940UIe = this.LLILZ) != null) {
            interfaceC769940UIe.l3(cert);
            C0UHC.LIZ("capture_screen");
            this.LLILZ.D3(cert);
            C0UHC.LIZ("capture_audio");
            FrameSignV3Setting frameSignV3Setting = FrameSignV3Setting.INSTANCE;
            if (frameSignV3Setting.enable()) {
                C11JF c11jf = C774760UaI.LIZ;
                C774760UaI.LIZJ(this.LLILZ.getLiveCore());
            }
            if (this.LLILZIL.getStreamUrl().pushUrlList != null && !this.LLILZIL.getStreamUrl().pushUrlList.isEmpty()) {
                this.LLILZ.k3(this.LLILZIL.getStreamUrl().pushUrlList);
            } else {
                this.LLILZ.start(this.LLILZIL.getStreamUrl().LIZLLL());
            }
            if (frameSignV3Setting.enable()) {
                C11JF c11jf2 = C774760UaI.LIZ;
                C774760UaI.LIZLLL(this.LLILZ.getLiveCore());
            }
            this.LLJILLL.LIZIZ.getClass();
            VolumeDetectConfig volumeDetectConfig = C775080Uao.LIZIZ;
            if (volumeDetectConfig == null) {
                volumeDetectConfig = null;
            }
            C775080Uao.LJIIIIZZ = (C11JF) C11NZ.LJLJJLL(volumeDetectConfig.getFirstCountDownDurationMinutes(), TimeUnit.MINUTES).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0Uad
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VolumeDetector@4b8a.startStreamCountdown$1");
                    C775080Uao.LIZJ = true;
                    C775080Uao c775080Uao = C775080Uao.LIZ;
                    C775080Uao.LIZ();
                    C1C7U.LIZIZ("VolumeDetector@4b8a.startStreamCountdown$1");
                }
            }, new C09JN() { // from class: X.00Ma
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VolumeDetector@4b8a.startStreamCountdown$2");
                    C1C7U.LIZIZ("VolumeDetector@4b8a.startStreamCountdown$2");
                }
            });
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC774920UaY
    public final void Xz(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
        Map<String, Object> map = C1338270kvh.LIZ;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJJLJLI(this.LLJJIII, 1, cert);
        }
        InterfaceC774990Uaf interfaceC774990Uaf = this.LLJJ;
        if (interfaceC774990Uaf != null) {
            interfaceC774990Uaf.LIZJ(abstractC1273900jFs, this.LLJJI);
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void kn(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
        this.LLJILLL.LIZ.getClass();
        if (Build.VERSION.SDK_INT > 28) {
            C774950Uab.LIZIZ = abstractC1273900jFs;
            abstractC1273900jFs.LJJIJIL(6);
        }
        if (GameAudioInferLibraSetting.INSTANCE.isExperimentGroup()) {
            this.LLJJIII = new C151O(this.LLILZIL, abstractC1273900jFs);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        abstractC1273900jFs.LJJLIIIJ(this.LLJJIII);
        InterfaceC774920UaY interfaceC774920UaY = this.LLILZLL;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.kn(abstractC1273900jFs, cert);
        }
    }

    @Override // X.InterfaceC775300UbA
    public final void V3(int i, int i2, Exception exc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStream error: ");
        sbLIZ.append(i);
        sbLIZ.append(" code2: ");
        sbLIZ.append(i2);
        sbLIZ.append(" msg: ");
        sbLIZ.append(exc.toString());
        C20441214yg.LJ("dual_device_vertical_layout", C2188811AlT.LIZIZ(sbLIZ));
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).startLiveManager().LJIIL(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // X.InterfaceC774920UaY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ku(int r7, int r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C774940Uaa.ku(int, int, java.lang.String):void");
    }

    @Override // X.C0UHL
    public final void LLLZ(String str, String str2, Map<String, Object> map, C0U8C c0u8c) {
        String str3;
        InterfaceC500940Jki interfaceC500940JkiUser;
        AbstractC19484711Kz<InterfaceC2262081DgM> abstractC19484711KzLJIILLIIL;
        String string;
        Room room = this.LLILZIL;
        boolean zLJI = C0TDF.LJI();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_adaptive_result");
        c474500IjALIZ.LJJII(str, "strategy_name");
        c474500IjALIZ.LJJII(str2, "direction");
        if (zLJI) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str3, "is_dual_device");
        if (map != null) {
            for (String str4 : map.keySet()) {
                c474500IjALIZ.LJJII(map.get(str4), str4);
            }
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (abstractC19484711KzLJIILLIIL = interfaceC500940JkiUser.LJIILLIIL()) != null && (string = abstractC19484711KzLJIILLIIL.toString()) != null) {
            c474500IjALIZ.LJJII(string, "user_id");
        }
        if (room != null) {
            c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
        }
        c474500IjALIZ.LIZ();
    }
}
