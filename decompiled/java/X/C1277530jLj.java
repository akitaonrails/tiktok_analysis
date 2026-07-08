package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS4S1101000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomConfig;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.type.ChannelProfile;
import com.ss.bytertc.engine.utils.AppMonitor;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxVideo;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.engine.LyraxAndroidOption;
import com.ss.lyrax.engine.LyraxBusinessOption;
import com.ss.lyrax.engine.LyraxEglEnvironment;
import com.ss.lyrax.engine.LyraxEngineOption;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.engine.LyraxNetworkOption;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.net.LyraxNetworkQuality;
import com.ss.lyrax.publisher.LyraxPublisherState;
import com.ss.lyrax.pushersession.ILyraxPusherSessionListener;
import com.ss.lyrax.pushersession.LyraxLiveStreamResult;
import com.ss.lyrax.pushersession.LyraxPusherSEIParam;
import com.ss.lyrax.pushersession.LyraxPusherSessionImpl;
import com.ss.lyrax.pushersession.LyraxPusherSessionOption;
import com.ss.lyrax.pushersession.LyraxPusherState;
import com.ss.lyrax.pushersession.LyraxPusherStatistics;
import com.ss.lyrax.pushersession.LyraxStreamOption;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderFeaturesConfig;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.ILyraxVideoRenderer;
import com.ss.lyrax.video.ILyraxVideoRendererFactory;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoCPUBufferFrameBuilder;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoFrameType;
import com.ss.lyrax.video.LyraxVideoGLTextureFrameBuilder;
import com.ss.lyrax.video.LyraxVideoImpl;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoPooledFrame;
import com.ss.lyrax.video.LyraxVideoRendererManager;
import com.ss.lyrax.video.LyraxVideoRendererType;
import com.ss.lyrax.video.LyraxVideoRotation;
import com.ss.pusher.core.opengl.GLThreadManager;
import com.ss.pusher.core.params.ASRWordMuting;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.PushStreamData;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277530jLj implements InterfaceC1266360j3i {
    public static final C1277520jLi LJJJJ = new ILyraxVideoRendererFactory() { // from class: X.0jLi
        @Override // com.ss.lyrax.video.ILyraxVideoRendererFactory
        public final ILyraxVideoRenderer createVideoRenderer(String str) {
            return null;
        }
    };
    public LyraxPusherSessionImpl LIZ;
    public ILyraxEngine LIZIZ;
    public boolean LIZJ;
    public View LIZLLL;
    public View LJ;
    public final C1269160j8E LJI;
    public ILyraxVideoPlatformWrapper LJII;
    public InterfaceC1274510jGr LJIIIIZZ;
    public LyraxVideoRendererWrapper LJIIJ;
    public boolean LJIIJJI;
    public InterfaceC1277660jLw LJIILIIL;
    public InterfaceC1278600jNS LJIILJJIL;
    public C1277690jLz LJIILLIIL;
    public IVideoStrategyRunner LJJII;
    public C1278640jNW LJJIII;
    public C1277590jLp LJJIZ;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final Object LJIIIZ = new Object();
    public LyraxVideoRendererType LJIIL = LyraxVideoRendererType.NORMAL_RENDER;
    public int LJIILL = LyraxNetworkQuality.UNKNOWN.value();
    public EnumC1276080jJO LJIIZILJ = EnumC1276080jJO.None;
    public final List<InterfaceC1277930jMN> LJIJ = new ArrayList();
    public List<LyraxTranscoderFeature> LJIJI = null;
    public boolean LJIJJ = false;
    public C1278250jMt LJIJJLI = null;
    public C1278420jNA LJIL = null;
    public final C1277600jLq LJJ = new ILyraxPusherSessionListener() { // from class: X.0jLq
        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final /* synthetic */ void onAudioProfanityDetectedCallback(String str) {
            C1278110jMf.LIZ(this, str);
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final /* synthetic */ void onEncodeBitrateChanged(int i) {
            C1278110jMf.LIZIZ(this, i);
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
            InterfaceC1277660jLw interfaceC1277660jLw = this.LIZ.LJIILIIL;
            if (interfaceC1277660jLw != null) {
                interfaceC1277660jLw.onFeatureEvent(lyraxTranscoderFeatureEvent);
            }
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onLogMonitor(String str) {
            if (this.LIZ.LJIILJJIL != null) {
                try {
                    this.LIZ.LJIILJJIL.LIZIZ(new JSONObject(str));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats) {
            EnumC1278980jO4 enumC1278980jO4;
            LyraxNetworkQuality lyraxNetworkQuality;
            int iValue;
            LyraxNetworkQuality lyraxNetworkQuality2;
            C1277530jLj c1277530jLj = this.LIZ;
            if (c1277530jLj.LJIILIIL == null) {
                return;
            }
            if (c1277530jLj.LJJIZ.LJI.mPushBase.enableLyraxNetworkQualityOptV3) {
                if (lyraxNetworkQualityStats != null && (lyraxNetworkQuality2 = lyraxNetworkQualityStats.txQuality) != null) {
                    iValue = lyraxNetworkQuality2.value();
                } else {
                    iValue = LyraxNetworkQuality.UNKNOWN.value();
                }
                C1277530jLj c1277530jLj2 = this.LIZ;
                if (iValue != c1277530jLj2.LJIILL) {
                    c1277530jLj2.LJIILL = iValue;
                    c1277530jLj2.LJIILIIL.LIZ(iValue);
                    return;
                }
                return;
            }
            c1277530jLj.getClass();
            if (lyraxNetworkQualityStats != null && (lyraxNetworkQuality = lyraxNetworkQualityStats.txQuality) != null) {
                switch (C1277990jMT.LIZIZ[lyraxNetworkQuality.ordinal()]) {
                    case 1:
                    case 2:
                        enumC1278980jO4 = EnumC1278980jO4.Good;
                        break;
                    case 3:
                        enumC1278980jO4 = EnumC1278980jO4.Poor;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        enumC1278980jO4 = EnumC1278980jO4.Bad;
                        break;
                    default:
                        enumC1278980jO4 = EnumC1278980jO4.Unknown;
                        break;
                }
            } else {
                enumC1278980jO4 = EnumC1278980jO4.Unknown;
            }
            this.LIZ.LJIILIIL.LIZLLL(enumC1278980jO4);
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onStatistics(LyraxPusherStatistics lyraxPusherStatistics) {
            InterfaceC1278600jNS interfaceC1278600jNS = this.LIZ.LJIILJJIL;
            if (interfaceC1278600jNS != null) {
                C1279020jO8 c1279020jO8 = new C1279020jO8();
                c1279020jO8.LIZ = lyraxPusherStatistics.videoEncodeFps;
                c1279020jO8.LIZJ = lyraxPusherStatistics.videoSendFps;
                c1279020jO8.LJI = lyraxPusherStatistics.videoSendBitrate;
                interfaceC1278600jNS.LIZJ(c1279020jO8);
            }
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onStreamProtocolChanged(LyraxStreamProtocol lyraxStreamProtocol) {
            EnumC1276060jJM enumC1276060jJM;
            C1277530jLj c1277530jLj = this.LIZ;
            if (c1277530jLj.LJIILIIL != null) {
                c1277530jLj.getClass();
                if (lyraxStreamProtocol == null) {
                    enumC1276060jJM = EnumC1276060jJM.Unknown;
                } else {
                    int i = C1277990jMT.LIZJ[lyraxStreamProtocol.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            enumC1276060jJM = EnumC1276060jJM.Unknown;
                        } else {
                            enumC1276060jJM = EnumC1276060jJM.RTMP;
                        }
                    } else {
                        enumC1276060jJM = EnumC1276060jJM.RTP;
                    }
                }
                this.LIZ.LJIILIIL.LJ(enumC1276060jJM);
            }
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onFirstFrame(boolean z, boolean z2) {
            EnumC1277870jMH enumC1277870jMH;
            if (this.LIZ.LJIILIIL != null) {
                if (z2) {
                    enumC1277870jMH = EnumC1277870jMH.Encoded;
                } else {
                    enumC1277870jMH = EnumC1277870jMH.Send;
                }
                System.currentTimeMillis();
                this.LIZ.LJIILIIL.LIZIZ(new C1278510jNJ(z, enumC1277870jMH));
            }
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onError(int i, int i2, String str) {
            if (this.LIZ.LJIILIIL != null) {
                if (i == LyraxErrorCode.LIVE_STREAM_FALLBACK.value()) {
                    i = -100;
                }
                this.LIZ.LJIILIIL.onError(i, i2, str);
                this.LIZ.LJIILIIL.LIZLLL(EnumC1278980jO4.Offline);
            }
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onLiveStreamChange(int i, int i2, LyraxLiveStreamResult lyraxLiveStreamResult) {
            EnumC1270230j9x enumC1270230j9x;
            if (this.LIZ.LJIILIIL != null) {
                EnumC1270070j9h enumC1270070j9hFromCode = EnumC1270070j9h.fromCode(i);
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            enumC1270230j9x = EnumC1270230j9x.Keep;
                        } else {
                            enumC1270230j9x = EnumC1270230j9x.Down;
                        }
                    } else {
                        enumC1270230j9x = EnumC1270230j9x.Up;
                    }
                } else {
                    enumC1270230j9x = EnumC1270230j9x.Keep;
                }
                this.LIZ.LJIILIIL.LJFF(enumC1270070j9hFromCode, enumC1270230j9x, new C1268030j6P(lyraxLiveStreamResult.targetFps, lyraxLiveStreamResult.targetWidth, lyraxLiveStreamResult.targetHeight));
            }
        }

        @Override // com.ss.lyrax.pushersession.ILyraxPusherSessionListener
        public final void onPublisherStateChanged(LyraxPublisherState lyraxPublisherState, LyraxErrorCode lyraxErrorCode, int i) {
            EnumC1270040j9e enumC1270040j9e;
            C1277530jLj c1277530jLj = this.LIZ;
            if (c1277530jLj.LJIILIIL != null) {
                if (lyraxPublisherState == LyraxPublisherState.CONNECTING || lyraxPublisherState == LyraxPublisherState.SUCCESS) {
                    c1277530jLj.getClass();
                    if (lyraxPublisherState == null) {
                        enumC1270040j9e = EnumC1270040j9e.None;
                    } else {
                        int i2 = C1277990jMT.LIZ[lyraxPublisherState.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            enumC1270040j9e = EnumC1270040j9e.None;
                                        } else {
                                            enumC1270040j9e = EnumC1270040j9e.ConnectStop;
                                        }
                                    } else {
                                        enumC1270040j9e = EnumC1270040j9e.ConnectError;
                                    }
                                } else {
                                    enumC1270040j9e = EnumC1270040j9e.Reconnecting;
                                }
                            } else {
                                enumC1270040j9e = EnumC1270040j9e.ConnectSuccess;
                            }
                        } else {
                            enumC1270040j9e = EnumC1270040j9e.Connecting;
                        }
                    }
                    this.LIZ.LJIILIIL.LIZJ(enumC1270040j9e);
                }
            }
        }
    };
    public RTCVideo LJJI = null;
    public RTCRoom LJJIFFI = null;
    public String LJJIIJ = "";
    public String LJJIIJZLJL = "";
    public String LJJIIZ = "";
    public String LJJIIZI = "";
    public String LJJIJ = null;
    public boolean LJJIJIIJI = true;
    public boolean LJJIJIIJIL = false;
    public boolean LJJIJIL = false;
    public boolean LJJIJL = false;
    public int LJJIJLIJ = 2;
    public int LJJIL = 0;
    public boolean LJJJ = false;
    public final AppMonitor.Callback LJJJI = new AppMonitor.Callback() { // from class: X.0jMl
        @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
        public final void callback(int i) {
            String str;
            LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ.LIZ;
            if (lyraxPusherSessionImpl != null) {
                if (i == 1) {
                    str = "active";
                } else {
                    str = "background";
                }
                lyraxPusherSessionImpl.setAppState(str);
            }
        }
    };
    public C1277750jM5 LJJJIL = new C1277750jM5();

    @Override // X.InterfaceC1266360j3i
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIL(C1267500j5Y c1267500j5Y) {
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIILL(boolean z) {
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIZILJ(C1278180jMm c1278180jMm) {
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIFFI(TEBundle tEBundle) {
    }

    public final void LIZLLL() {
        if (this.LJJIJIIJIL) {
            RTCRoom rTCRoom = this.LJJIFFI;
            if (rTCRoom != null) {
                rTCRoom.leaveRoom();
                this.LJJIFFI.destroy();
            }
            if (this.LJJI != null) {
                RTCVideo.destroyRTCVideoV2();
            }
            this.LJJIFFI = null;
            this.LJJI = null;
        }
    }

    public final void LJ() {
        ILyraxVideo videoModule;
        if (this.LJIIJJI || LJFF() < 2) {
            return;
        }
        ILyraxEngine iLyraxEngine = this.LIZIZ;
        LyraxVideoRendererManager videoRendererManager = null;
        if (iLyraxEngine != null && (videoModule = iLyraxEngine.getVideoModule()) != null) {
            videoRendererManager = videoModule.getVideoRendererManager();
        }
        InterfaceC1274510jGr interfaceC1274510jGr = this.LJIIIIZZ;
        if (videoRendererManager == null || interfaceC1274510jGr == null) {
            return;
        }
        videoRendererManager.setVideoRendererFactory(new ILyraxVideoRendererFactory() { // from class: X.0jHm
            @Override // com.ss.lyrax.video.ILyraxVideoRendererFactory
            public final ILyraxVideoRenderer createVideoRenderer(String str) {
                LyraxVideoRendererWrapper lyraxVideoRendererWrapper;
                C1274570jGx c1274570jGx;
                boolean z;
                C1277530jLj c1277530jLj = this.LIZ;
                LyraxVideoRendererWrapper lyraxVideoRendererWrapper2 = new LyraxVideoRendererWrapper(new C1275200jHy(c1277530jLj.LJI.LJLJI.LJIIZILJ, c1277530jLj.LJJIJIL));
                LyraxVideoRenderConfig lyraxVideoRenderConfig = new LyraxVideoRenderConfig(str);
                C1277530jLj c1277530jLj2 = this.LIZ;
                c1277530jLj2.getClass();
                if ("capture_preview".equals(lyraxVideoRenderConfig.renderId)) {
                    final InterfaceC1274510jGr interfaceC1274510jGr2 = c1277530jLj2.LJIIIIZZ;
                    if (interfaceC1274510jGr2 == null) {
                        c1274570jGx = null;
                    } else {
                        InterfaceC1274510jGr interfaceC1274510jGr3 = new InterfaceC1274510jGr() { // from class: X.0jIh
                            @Override // X.InterfaceC1274510jGr
                            public final InterfaceC1274490jGp LJI(View view, Handler handler, boolean z2) {
                                return interfaceC1274510jGr2.LJIIJ(view, handler, z2);
                            }

                            @Override // X.InterfaceC1274510jGr
                            public final InterfaceC1274490jGp LJIIJ(View view, Handler handler, boolean z2) {
                                return LJI(view, handler, z2);
                            }
                        };
                        Handler handler = GLThreadManager.LJ().LIZ;
                        Handler handler2 = GLThreadManager.LJ().LIZ;
                        if (c1277530jLj2.LJJIJIL && GlUtil.isGLES3Support()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1274570jGx = new C1274570jGx(interfaceC1274510jGr3, handler, handler2, false, false, 0, 0, z);
                        c1274570jGx.LJIIL();
                    }
                    lyraxVideoRendererWrapper2.LJIIIZ(c1274570jGx, null);
                }
                synchronized (this.LIZ.LJIIIZ) {
                    try {
                        C1277530jLj c1277530jLj3 = this.LIZ;
                        lyraxVideoRendererWrapper = c1277530jLj3.LJIIJ;
                        c1277530jLj3.LJIIJ = lyraxVideoRendererWrapper2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (lyraxVideoRendererWrapper != null && lyraxVideoRendererWrapper != lyraxVideoRendererWrapper2) {
                    lyraxVideoRendererWrapper.release();
                }
                return lyraxVideoRendererWrapper2;
            }
        });
        this.LJIIJJI = true;
    }

    public final int LJFF() {
        LiveSdkSetting liveSdkSetting;
        C1269160j8E c1269160j8E = this.LJI;
        if (c1269160j8E == null || (liveSdkSetting = c1269160j8E.LIZ) == null) {
            return -1;
        }
        return liveSdkSetting.LJIJJ();
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIILJJIL() {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            this.LJIIZILJ = EnumC1276080jJO.Live;
            lyraxPusherSessionImpl.switchScene(LyraxScene.LIVE);
            ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper = this.LJII;
            if (iLyraxVideoPlatformWrapper != null) {
                this.LIZ.setVideoSource(iLyraxVideoPlatformWrapper);
            }
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final ASRWordMuting LJIJI() {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        C1269160j8E c1269160j8E = this.LJI;
        if (c1269160j8E == null) {
            return null;
        }
        try {
            JSONObject jSONObjectLJJ = c1269160j8E.LJJ();
            if (jSONObjectLJJ == null || (jSONObjectOptJSONObject = jSONObjectLJJ.optJSONObject("PushBase")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("asr_words_muting")) == null || !jSONObjectOptJSONObject2.optBoolean("enable", false)) {
                return null;
            }
            return (ASRWordMuting) new Gson().LJII(C786410Ut5.J3(jSONObjectOptJSONObject2), ASRWordMuting.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final String LJIJJ() {
        LyraxPusherState pusherState;
        String str;
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        return (lyraxPusherSessionImpl == null || (pusherState = lyraxPusherSessionImpl.getPusherState()) == null || (str = pusherState.rtcTaskId) == null) ? "" : str;
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJJ() {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        return (lyraxPusherSessionImpl == null || lyraxPusherSessionImpl.resetVideoPerformanceConfig(null) != LyraxErrorCode.SUCCESS) ? -1 : 0;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJI() {
        String str;
        if (this.LIZ == null || (str = this.LJJIJ) == null) {
            return;
        }
        LJIJ(str, true);
    }

    @Override // X.InterfaceC1266360j3i
    public final Object LJJIIJ() {
        if (!this.LJJIJIIJIL) {
            return null;
        }
        RTCVideo rTCVideo = this.LJJI;
        if (rTCVideo != null) {
            return rTCVideo;
        }
        int i = GLThreadManager.LJI()[0];
        C1269160j8E c1269160j8E = this.LJI;
        RTCVideo rTCVideoCreateRTCVideoV2 = RTCVideo.createRTCVideoV2(c1269160j8E.LJLJI.LJIIZILJ, c1269160j8E.LJI(), null, GLThreadManager.LJFF(), GLESVersion.fromId(i), LJJIIZI());
        this.LJJI = rTCVideoCreateRTCVideoV2;
        if (this.LJJIFFI == null) {
            RTCRoom rTCRoomCreateRTCRoom = rTCVideoCreateRTCVideoV2.createRTCRoom(this.LJJIIJ);
            this.LJJIFFI = rTCRoomCreateRTCRoom;
            if (rTCRoomCreateRTCRoom != null) {
                RTCRoomConfig rTCRoomConfig = new RTCRoomConfig(ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING, false, true, true);
                this.LJJIFFI.joinRoom(this.LJJIIZ, new UserInfo(this.LJJIIJZLJL, ""), rTCRoomConfig);
            }
        }
        return this.LJJI;
    }

    @Override // X.InterfaceC1266360j3i
    public final JSONObject LJJIIZI() {
        JSONObject jSONObject = new JSONObject();
        try {
            InterfaceC1278630jNV interfaceC1278630jNV = this.LJJIII.LIZ;
            String strLIZIZ = interfaceC1278630jNV.LIZIZ("https://rtc-sg.tiktokv.com/");
            String str = TextUtils.isEmpty(strLIZIZ) ? "https://rtc-sg.tiktokv.com/" : strLIZIZ;
            String strLIZIZ2 = interfaceC1278630jNV.LIZIZ("https://rtcpc-access-sg.tiktokv.com/");
            String str2 = TextUtils.isEmpty(strLIZIZ2) ? "https://rtcpc-access-sg.tiktokv.com/" : strLIZIZ2;
            String strLIZIZ3 = interfaceC1278630jNV.LIZIZ("https://rtc-access-sg.tiktokv.com/");
            String str3 = TextUtils.isEmpty(strLIZIZ3) ? "https://rtc-access-sg.tiktokv.com/" : strLIZIZ3;
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("config_hosts", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            if (this.LJI.LIZ.LJIIL()) {
                String strLIZIZ4 = this.LJI.LIZ.LIZIZ();
                if (!TextUtils.isEmpty(strLIZIZ4)) {
                    jSONArray2 = new JSONArray();
                    jSONArray2.put(strLIZIZ4);
                }
            }
            jSONObject.put("access_hosts", jSONArray2);
            String strLIZIZ5 = interfaceC1278630jNV.LIZIZ("https://rtc-logger-va.tiktokv.com/report");
            String strReplace = TextUtils.isEmpty(strLIZIZ5) ? "https://rtc-logger-va.tiktokv.com/report" : strLIZIZ5;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (!TextUtils.isEmpty(strReplace)) {
                if (strReplace.contains("http://")) {
                    strReplace = strReplace.replace("http", "wss");
                } else if (strReplace.contains("https://")) {
                    strReplace = strReplace.replace("https", "wss");
                }
            }
            sbLIZ.append(strReplace);
            sbLIZ.append("report");
            String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ);
            if (this.LJI.LIZ.LJIIL()) {
                String strLIZJ = this.LJI.LIZ.LIZJ();
                if (!TextUtils.isEmpty(strLIZJ)) {
                    strLIZIZ6 = strLIZJ;
                }
            }
            jSONObject.put("rtc.log_sdk_websocket_url", strLIZIZ6);
            jSONObject.put("rtc.enable_remove_scene_none", this.LJI.LIZ.ttlhABSettingsConfigs.LJIIIIZZ());
            jSONObject.put("rtc.video_strategy_active_scene", this.LJI.LIZ.ttlhABSettingsConfigs.LJIJI());
            if (C1276090jJP.LIZJ) {
                jSONObject.put("rtc.enable_pre_get_config", true);
            }
            jSONObject.put("rtc.user_region", interfaceC1278630jNV.LIZ());
            jSONObject.put("rtc.access_group_id", this.LJI.LJJJJZ);
            jSONObject.put("rtc.live_role", this.LJI.LJLJI.LJJIII ? "host" : "guest");
            jSONObject.put("rtc.env", 0);
            if (!TextUtils.isEmpty(this.LJI.LJII())) {
                C190800oM.LIZIZ(jSONObject, new JSONObject(this.LJI.LJII()));
            }
            jSONObject.put("rtc.live_type", this.LJI.LJJII() == 3 || this.LJI.LJJIIZI ? 1 : 0);
            jSONObject.put("rtc.enable_down_native_render", this.LJI.LIZ.ttlhABSettingsConfigs.LJ());
            jSONObject.put("rtc.capture_pipeline_stage", this.LJI.LIZ.LJIJJ());
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final EnumC1277890jMJ LJJIJIIJIL() {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl == null) {
            return EnumC1277890jMJ.LiveStreamSession_V3;
        }
        int sessionVersion = lyraxPusherSessionImpl.getSessionVersion();
        return sessionVersion != 1 ? sessionVersion != 2 ? sessionVersion != 3 ? sessionVersion != 4 ? EnumC1277890jMJ.LiveStreamSession_V3 : EnumC1277890jMJ.LiveStreamSession_V4 : EnumC1277890jMJ.LiveStreamSession_V3 : EnumC1277890jMJ.LiveStreamSession_V2 : EnumC1277890jMJ.LiveStreamSession_V1;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIJLIJ() {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.stopNormalLiving();
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void cacheJoinRoomState() {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.cacheJoinRoomState();
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final LyraxVideoEncoderProfile.VideoDegradeLevels getDegradeLevels() {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            return lyraxPusherSessionImpl.getDegradeLevels();
        }
        return null;
    }

    @Override // X.InterfaceC1266360j3i
    public final C1277690jLz getPusherState() {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl == null) {
            return this.LJIILLIIL;
        }
        LyraxPusherState pusherState = lyraxPusherSessionImpl.getPusherState();
        if (pusherState == null) {
            return this.LJIILLIIL;
        }
        String str = pusherState.pushSessionId;
        if (str == null) {
            str = "";
        }
        String str2 = pusherState.rtcRoomId;
        if (str2 == null) {
            str2 = "";
        }
        return new C1277690jLz(str, str2, 0L, 0L, 0L, 0, true, 0L, -1, false, false, false, false, false, false);
    }

    @Override // X.InterfaceC1266360j3i
    public final List<LyraxVideoBitrateGearTableItem> getVideoBitrateGearTable() {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            return lyraxPusherSessionImpl.getVideoBitrateGearTable();
        }
        return null;
    }

    @Override // X.InterfaceC1266360j3i
    public final EnumC1276080jJO LJJIJ() {
        return this.LJIIZILJ;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0jLq] */
    public C1277530jLj(C1269160j8E c1269160j8E) {
        this.LJI = c1269160j8E;
    }

    public final void LIZ(boolean z) {
        ILyraxVideo videoModule;
        View view;
        ILyraxEngine iLyraxEngine = this.LIZIZ;
        if (iLyraxEngine != null && (videoModule = iLyraxEngine.getVideoModule()) != null) {
            LJ();
            LyraxErrorCode capturePreviewRenderType = videoModule.setCapturePreviewRenderType(this.LJIIL);
            if (capturePreviewRenderType == null) {
                capturePreviewRenderType = LyraxErrorCode.FAILURE;
            }
            int iValue = capturePreviewRenderType.value();
            LyraxErrorCode lyraxErrorCode = LyraxErrorCode.SUCCESS;
            lyraxErrorCode.value();
            if (iValue == lyraxErrorCode.value() && z && (view = this.LIZLLL) != null) {
                LyraxErrorCode lyraxErrorCodeResetPreviewView = videoModule.resetPreviewView(view);
                if (lyraxErrorCodeResetPreviewView == null) {
                    lyraxErrorCodeResetPreviewView = LyraxErrorCode.FAILURE;
                }
                lyraxErrorCodeResetPreviewView.value();
            }
            lyraxErrorCode.value();
            return;
        }
        LyraxErrorCode.INVALID_STATE.value();
    }

    public final int LIZIZ(InterfaceC1277930jMN interfaceC1277930jMN) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl == null) {
            return -1;
        }
        if (interfaceC1277930jMN instanceof C1278210jMp) {
            C1278210jMp c1278210jMp = (C1278210jMp) interfaceC1277930jMN;
            lyraxPusherSessionImpl.addUserMetadata(c1278210jMp.LIZ, c1278210jMp.LIZIZ);
            return 0;
        }
        if (interfaceC1277930jMN instanceof C1268990j7x) {
            AVLog.w("VeLivePusherNative", "SeiCurrentShiftMs not yet supported in Lyrax backend");
            this.LIZ.setSeiCurrentShiftDiffTime(((C1268990j7x) interfaceC1277930jMN).LIZ);
            return 0;
        }
        if (interfaceC1277930jMN instanceof C1278540jNM) {
            if (lyraxPusherSessionImpl.isRunning()) {
                AVLog.w("VeLivePusherNative", "Cannot set output image size when pushing");
                return -1;
            }
            C1278540jNM c1278540jNM = (C1278540jNM) interfaceC1277930jMN;
            this.LIZ.setEncodeOutputSize(c1278540jNM.LIZ, c1278540jNM.LIZIZ);
            return 0;
        }
        if (interfaceC1277930jMN instanceof C1279350jOf) {
            return 0;
        }
        if (interfaceC1277930jMN instanceof C1270090j9j) {
            if (lyraxPusherSessionImpl.isRunning()) {
                AVLog.w("VeLivePusherNative", "Cannot set video bitrate when pushing");
                return -1;
            }
            C1270090j9j c1270090j9j = (C1270090j9j) interfaceC1277930jMN;
            this.LIZ.setVideoBitrate(c1270090j9j.LIZ / LSPassThroughRecordSizeConfig.DEFAULT, c1270090j9j.LIZJ / LSPassThroughRecordSizeConfig.DEFAULT);
            return 0;
        }
        if (!(interfaceC1277930jMN instanceof C1269290j8R)) {
            return 0;
        }
        if (lyraxPusherSessionImpl.isRunning()) {
            AVLog.w("VeLivePusherNative", "Cannot set video frame rate when pushing");
            return -1;
        }
        this.LIZ.setVideoFrameRate(((C1269290j8R) interfaceC1277930jMN).LIZ);
        return 0;
    }

    public final void LIZJ(String str) {
        GLESVersion gLESVersionFromId;
        TTLHABSettingsConfigs tTLHABSettingsConfigs;
        if (this.LIZIZ != null || LJFF() < 2 || GLThreadManager.LJFF() == null) {
            return;
        }
        LyraxEngineOption lyraxEngineOption = new LyraxEngineOption();
        lyraxEngineOption.scene = LyraxScene.LIVE;
        lyraxEngineOption.inAnchorNet = true;
        lyraxEngineOption.forceInitEnv = false;
        LyraxAndroidOption lyraxAndroidOption = lyraxEngineOption.androidOption;
        lyraxAndroidOption.context = this.LJI.LJLJI.LJIIZILJ;
        if (this.LJJIJIL) {
            gLESVersionFromId = GLESVersion.fromId(GLThreadManager.LJI()[0]);
        } else {
            gLESVersionFromId = GLESVersion.GLES_VERSION_2;
        }
        lyraxAndroidOption.glesVersion = gLESVersionFromId;
        lyraxEngineOption.androidOption.eglContext = GLThreadManager.LJFF();
        lyraxEngineOption.videoOption.capturePipelineStage = LJFF();
        lyraxEngineOption.businessOption.appId = this.LJI.LJI();
        lyraxEngineOption.networkOption.liveRole = "host";
        LiveSdkSetting liveSdkSetting = this.LJI.LIZ;
        if (liveSdkSetting != null && (tTLHABSettingsConfigs = liveSdkSetting.ttlhABSettingsConfigs) != null) {
            lyraxEngineOption.enableRemoveSceneNone = tTLHABSettingsConfigs.LJIIIIZZ();
            lyraxEngineOption.videoOption.enableDownNativeRender = this.LJI.LIZ.ttlhABSettingsConfigs.LJ();
        }
        ILyraxEngine iLyraxEngineCreate = ILyraxEngine.create(lyraxEngineOption);
        this.LIZIZ = iLyraxEngineCreate;
        if (iLyraxEngineCreate != null) {
            this.LIZJ = true;
            ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper = this.LJII;
            if (iLyraxVideoPlatformWrapper != null) {
                iLyraxEngineCreate.bindVideoPlatformWrapper(iLyraxVideoPlatformWrapper);
            }
            LJII(0, str);
        }
    }

    public final void LJI(LyraxVideoFrame lyraxVideoFrame) {
        if (lyraxVideoFrame == null) {
            return;
        }
        if (lyraxVideoFrame instanceof LyraxVideoPooledFrame) {
            LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
            if (lyraxPusherSessionImpl != null) {
                lyraxPusherSessionImpl.pushVideoFrame(lyraxVideoFrame);
                return;
            }
            return;
        }
        if (lyraxVideoFrame.getFrameType() != LyraxVideoFrameType.RAW_MEMORY && !lyraxVideoFrame.hasReleaseCallback()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            lyraxVideoFrame.retain();
            LyraxVideoGLTextureFrameBuilder lyraxVideoGLTextureFrameBuilder = new LyraxVideoGLTextureFrameBuilder(lyraxVideoFrame.getPixelFormat());
            lyraxVideoGLTextureFrameBuilder.setTextureID(lyraxVideoFrame.getTextureID());
            lyraxVideoGLTextureFrameBuilder.setTextureMatrix(lyraxVideoFrame.getTextureMatrix());
            lyraxVideoGLTextureFrameBuilder.setEGLContext(lyraxVideoFrame.getEGLContext());
            lyraxVideoGLTextureFrameBuilder.setColorSpace(lyraxVideoFrame.getColorSpace());
            lyraxVideoGLTextureFrameBuilder.setWidth(lyraxVideoFrame.getWidth());
            lyraxVideoGLTextureFrameBuilder.setHeight(lyraxVideoFrame.getHeight());
            lyraxVideoGLTextureFrameBuilder.setRotation(lyraxVideoFrame.getRotation());
            lyraxVideoGLTextureFrameBuilder.setExtraDataInfo(lyraxVideoFrame.getExtraDataInfo());
            lyraxVideoGLTextureFrameBuilder.setExtraDataArray(lyraxVideoFrame.getExtraDataArray());
            lyraxVideoGLTextureFrameBuilder.setSupplementaryInfo(lyraxVideoFrame.getSupplementaryInfo());
            lyraxVideoGLTextureFrameBuilder.setTimeStampUs(lyraxVideoFrame.getTimeStampUs());
            lyraxVideoGLTextureFrameBuilder.setReleaseCallback(new ARunnableS89S0200000_20(countDownLatch, lyraxVideoFrame, 10));
            LyraxVideoFrame lyraxVideoFrameBuild = lyraxVideoGLTextureFrameBuilder.build();
            LyraxPusherSessionImpl lyraxPusherSessionImpl2 = this.LIZ;
            if (lyraxPusherSessionImpl2 != null) {
                lyraxPusherSessionImpl2.pushVideoFrame(lyraxVideoFrameBuild);
            }
            lyraxVideoFrameBuild.release();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            long jElapsedRealtime2 = 1000;
            while (true) {
                try {
                    countDownLatch.await(jElapsedRealtime2, TimeUnit.MILLISECONDS);
                    if (!z) {
                        return;
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    jElapsedRealtime2 = 1000 - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                    if (jElapsedRealtime2 <= 0) {
                        break;
                    } else {
                        z = true;
                    }
                }
            }
            C786410Ut5.u3().interrupt();
            return;
        }
        LyraxPusherSessionImpl lyraxPusherSessionImpl3 = this.LIZ;
        if (lyraxPusherSessionImpl3 != null) {
            lyraxPusherSessionImpl3.pushVideoFrame(lyraxVideoFrame);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIIZ(boolean z) {
        ILyraxVideo videoModule;
        LyraxVideoRendererWrapper lyraxVideoRendererWrapper;
        ILyraxEngine iLyraxEngine;
        LiveSdkSetting liveSdkSetting;
        ILyraxVideo videoModule2;
        LyraxVideoRendererManager videoRendererManager;
        this.LJFF.removeCallbacksAndMessages(null);
        this.LIZLLL = null;
        this.LJ = null;
        this.LJIJI = null;
        this.LJIJJ = false;
        ILyraxEngine iLyraxEngine2 = this.LIZIZ;
        if (iLyraxEngine2 == null) {
            videoModule = null;
        } else {
            videoModule = iLyraxEngine2.getVideoModule();
        }
        if (videoModule instanceof LyraxVideoImpl) {
            LyraxErrorCode lyraxErrorCodeDebugClearCaptureVideoFrameSinks = ((LyraxVideoImpl) videoModule).debugClearCaptureVideoFrameSinks();
            if (lyraxErrorCodeDebugClearCaptureVideoFrameSinks == null) {
                lyraxErrorCodeDebugClearCaptureVideoFrameSinks = LyraxErrorCode.FAILURE;
            }
            lyraxErrorCodeDebugClearCaptureVideoFrameSinks.value();
        }
        synchronized (this.LJIIIZ) {
            try {
                lyraxVideoRendererWrapper = this.LJIIJ;
                this.LJIIJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJIIJJI = false;
        this.LJIIL = LyraxVideoRendererType.NORMAL_RENDER;
        ILyraxEngine iLyraxEngine3 = this.LIZIZ;
        if (iLyraxEngine3 != null && (videoModule2 = iLyraxEngine3.getVideoModule()) != null && (videoRendererManager = videoModule2.getVideoRendererManager()) != null) {
            videoRendererManager.setVideoRendererFactory(LJJJJ);
            videoRendererManager.setGlobalSingleViewMode(false);
            videoRendererManager.removeVideoRenderer("capture_preview");
        }
        if (lyraxVideoRendererWrapper != null) {
            lyraxVideoRendererWrapper.release();
        }
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            this.LIZ = null;
            C1269160j8E c1269160j8E = this.LJI;
            if (c1269160j8E != null && (liveSdkSetting = c1269160j8E.LIZ) != null && liveSdkSetting.mPushBase != null && lyraxPusherSessionImpl.isRunning()) {
                lyraxPusherSessionImpl.stopPush(z);
            }
            AppMonitor.get(this.LJI.LJLJI.LJIIZILJ).unRegister(this.LJJJI);
            lyraxPusherSessionImpl.dispose();
        }
        if (this.LIZJ && (iLyraxEngine = this.LIZIZ) != null) {
            iLyraxEngine.dispose();
            this.LIZIZ = null;
            this.LIZJ = false;
        }
        LIZLLL();
        GLThreadManager.LIZJ();
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIILIIL(InterfaceC1277660jLw interfaceC1277660jLw) {
        this.LJIILIIL = interfaceC1277660jLw;
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJIJJLI(InterfaceC1277930jMN interfaceC1277930jMN) {
        if (!interfaceC1277930jMN.isValid()) {
            return -100;
        }
        if (!(interfaceC1277930jMN instanceof C1278210jMp) && !(interfaceC1277930jMN instanceof C1268990j7x) && !(interfaceC1277930jMN instanceof C1278540jNM) && !(interfaceC1277930jMN instanceof C1279350jOf) && !(interfaceC1277930jMN instanceof C1270090j9j) && !(interfaceC1277930jMN instanceof C1269290j8R)) {
            return -99;
        }
        if (this.LIZ != null) {
            return LIZIZ(interfaceC1277930jMN);
        }
        ((ArrayList) this.LJIJ).add(interfaceC1277930jMN);
        return 0;
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJIL(View view) {
        if (LJFF() >= 2) {
            LIZJ("setCapturePreviewDisplay");
            ILyraxEngine iLyraxEngine = this.LIZIZ;
            if (iLyraxEngine != null && iLyraxEngine.getVideoModule() != null) {
                this.LIZLLL = view;
                LJ();
                LIZ(false);
                LyraxErrorCode lyraxErrorCodeResetPreviewView = this.LIZIZ.getVideoModule().resetPreviewView(view);
                if (lyraxErrorCodeResetPreviewView == null) {
                    lyraxErrorCodeResetPreviewView = LyraxErrorCode.FAILURE;
                }
                int iValue = lyraxErrorCodeResetPreviewView.value();
                if (iValue == LyraxErrorCode.SUCCESS.value()) {
                    if (view == this.LJ) {
                        this.LJ = null;
                    }
                } else if (view != null) {
                    this.LJ = view;
                    LJII(0, "setCapturePreviewDisplay");
                    return iValue;
                }
                return iValue;
            }
            this.LIZLLL = view;
            this.LJ = view;
            return LyraxErrorCode.INVALID_STATE.value();
        }
        return LyraxErrorCode.NOT_SUPPORT.value();
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJII(InterfaceC1274510jGr interfaceC1274510jGr) {
        this.LJIIIIZZ = interfaceC1274510jGr;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIIJZLJL(InterfaceC1278600jNS interfaceC1278600jNS) {
        this.LJIILJJIL = interfaceC1278600jNS;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIIZ(String str) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            this.LJIIZILJ = EnumC1276080jJO.LinkMic;
            lyraxPusherSessionImpl.switchScene(LyraxScene.LINKMIC);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIJL(List<LyraxTranscoderFeature> list) {
        if (this.LIZ != null) {
            this.LIZ.setFeaturesConfig(new LyraxTranscoderFeaturesConfig(new ArrayList(list)));
        } else {
            this.LJIJI = new ArrayList(list);
            this.LJIJJ = true;
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIL(C1277560jLm c1277560jLm) {
        float f;
        if (this.LIZ != null) {
            EnumC1277900jMK enumC1277900jMK = c1277560jLm.LIZ;
            EnumC1277900jMK enumC1277900jMK2 = EnumC1277900jMK.Texture;
            if (enumC1277900jMK == enumC1277900jMK2 && GLThreadManager.LJFF() == null) {
                return;
            }
            EnumC1277900jMK enumC1277900jMK3 = c1277560jLm.LIZ;
            if (enumC1277900jMK3 == enumC1277900jMK2) {
                LyraxVideoPixelFormat lyraxVideoPixelFormat = LyraxVideoPixelFormat.TEXTURE_2D;
                if (c1277560jLm.LIZIZ == EnumC1277710jM1.TextureOes) {
                    lyraxVideoPixelFormat = LyraxVideoPixelFormat.TEXTURE_OES;
                }
                LyraxVideoGLTextureFrameBuilder lyraxVideoGLTextureFrameBuilder = new LyraxVideoGLTextureFrameBuilder(lyraxVideoPixelFormat);
                lyraxVideoGLTextureFrameBuilder.setRotation(LyraxVideoRotation.VIDEO_ROTATION_0);
                C1277750jM5 c1277750jM5 = this.LJJJIL;
                if (!c1277750jM5.LIZ || c1277750jM5.LIZIZ != c1277560jLm.LIZ || c1277750jM5.LIZJ != c1277560jLm.LIZJ || !c1277750jM5.LIZLLL.equals(c1277560jLm.LJIIJ)) {
                    c1277750jM5.LIZIZ = c1277560jLm.LIZ;
                    c1277750jM5.LIZJ = c1277560jLm.LIZJ;
                    c1277750jM5.LIZLLL = new Matrix();
                    if (c1277750jM5.LIZIZ == enumC1277900jMK2) {
                        c1277750jM5.LIZLLL = c1277560jLm.LJIIJ;
                    }
                    Matrix matrix = new Matrix(c1277750jM5.LIZLLL);
                    if (c1277750jM5.LIZJ != EnumC1277730jM3.Rotation0) {
                        matrix.preTranslate(0.5f, 0.5f);
                        int i = C1277740jM4.LIZ[c1277750jM5.LIZJ.ordinal()];
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    f = 0.0f;
                                } else {
                                    f = 270.0f;
                                }
                            } else {
                                f = 180.0f;
                            }
                        } else {
                            f = 90.0f;
                        }
                        matrix.preRotate(f);
                        matrix.preScale(1.0f, 1.0f);
                        matrix.preTranslate(-0.5f, -0.5f);
                    }
                    matrix.getValues(c1277750jM5.LJ);
                    float[] fArr = c1277750jM5.LJFF;
                    float[] fArr2 = c1277750jM5.LJ;
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[3];
                    fArr[3] = fArr2[6];
                    fArr[4] = fArr2[1];
                    fArr[5] = fArr2[4];
                    fArr[7] = fArr2[7];
                    fArr[12] = fArr2[2];
                    fArr[13] = fArr2[5];
                    fArr[15] = fArr2[8];
                }
                lyraxVideoGLTextureFrameBuilder.setTextureMatrix(c1277750jM5.LJFF);
                lyraxVideoGLTextureFrameBuilder.setTextureID(c1277560jLm.LJIIIIZZ);
                lyraxVideoGLTextureFrameBuilder.setEGLContext(GLThreadManager.LJFF());
                lyraxVideoGLTextureFrameBuilder.setWidth(c1277560jLm.LIZLLL);
                lyraxVideoGLTextureFrameBuilder.setHeight(c1277560jLm.LJ);
                lyraxVideoGLTextureFrameBuilder.setTimeStampUs(c1277560jLm.LJFF);
                lyraxVideoGLTextureFrameBuilder.setGLSync(c1277560jLm.LJIIIZ);
                lyraxVideoGLTextureFrameBuilder.setOriginalCaptureTimestampMs(c1277560jLm.LJI);
                lyraxVideoGLTextureFrameBuilder.setOriginalEffectTimestampMs(c1277560jLm.LJII);
                if (this.LJJIJIIJI) {
                    c1277560jLm.LIZLLL();
                    lyraxVideoGLTextureFrameBuilder.setReleaseCallback(new ARunnableS120S0100000_20(c1277560jLm, 16));
                } else {
                    lyraxVideoGLTextureFrameBuilder.setReleaseCallback(c1277560jLm.LJIILIIL);
                }
                LyraxVideoFrame lyraxVideoFrameBuild = lyraxVideoGLTextureFrameBuilder.build();
                LJI(lyraxVideoFrameBuild);
                lyraxVideoFrameBuild.release();
                return;
            }
            if (enumC1277900jMK3 != EnumC1277900jMK.ByteBuffer && enumC1277900jMK3 != EnumC1277900jMK.ByteArray) {
                return;
            }
            LyraxVideoCPUBufferFrameBuilder lyraxVideoCPUBufferFrameBuilder = new LyraxVideoCPUBufferFrameBuilder(LyraxVideoPixelFormat.I420);
            AbstractC1278120jMg abstractC1278120jMg = (AbstractC1278120jMg) c1277560jLm;
            lyraxVideoCPUBufferFrameBuilder.setRotation(LyraxVideoRotation.fromId(abstractC1278120jMg.LIZJ.getDegree()));
            lyraxVideoCPUBufferFrameBuilder.setPlaneData(0, abstractC1278120jMg.LJI());
            lyraxVideoCPUBufferFrameBuilder.setPlaneStride(0, abstractC1278120jMg.LIZLLL);
            lyraxVideoCPUBufferFrameBuilder.setPlaneData(1, abstractC1278120jMg.LJ());
            lyraxVideoCPUBufferFrameBuilder.setPlaneStride(1, abstractC1278120jMg.LIZLLL / 2);
            lyraxVideoCPUBufferFrameBuilder.setPlaneData(2, abstractC1278120jMg.LJFF());
            lyraxVideoCPUBufferFrameBuilder.setPlaneStride(2, abstractC1278120jMg.LIZLLL / 2);
            lyraxVideoCPUBufferFrameBuilder.setWidth(c1277560jLm.LIZLLL);
            lyraxVideoCPUBufferFrameBuilder.setHeight(c1277560jLm.LJ);
            lyraxVideoCPUBufferFrameBuilder.setTimeStampUs(c1277560jLm.LJFF);
            lyraxVideoCPUBufferFrameBuilder.setOriginalCaptureTimestampMs(c1277560jLm.LJI);
            lyraxVideoCPUBufferFrameBuilder.setOriginalEffectTimestampMs(c1277560jLm.LJII);
            if (this.LJJIJIIJI) {
                c1277560jLm.LIZLLL();
                lyraxVideoCPUBufferFrameBuilder.setReleaseCallback(new ARunnableS120S0100000_20(c1277560jLm, 17));
            } else {
                lyraxVideoCPUBufferFrameBuilder.setReleaseCallback(c1277560jLm.LJIILIIL);
            }
            LyraxVideoFrame lyraxVideoFrameBuild2 = lyraxVideoCPUBufferFrameBuilder.build();
            LJI(lyraxVideoFrameBuild2);
            lyraxVideoFrameBuild2.release();
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void bindToRoom(String str) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.bindToRoom(str);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final int enableCalculateAudioLoudness(boolean z) {
        this.LJJJ = z;
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl == null || lyraxPusherSessionImpl.enableCalculateAudioLoudness(z) != LyraxErrorCode.SUCCESS) {
            return -1;
        }
        return 0;
    }

    @Override // X.InterfaceC1266360j3i
    public final void reportFinalLog(String str) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.reportFinalLog(str);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        if (this.LJII == iLyraxVideoPlatformWrapper) {
            return;
        }
        this.LJII = iLyraxVideoPlatformWrapper;
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.setVideoSource(iLyraxVideoPlatformWrapper);
            LJII(0, "setVideoSource");
        } else {
            if (this.LIZIZ == null || iLyraxVideoPlatformWrapper == null || LJFF() < 2) {
                return;
            }
            this.LIZIZ.bindVideoPlatformWrapper(iLyraxVideoPlatformWrapper);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner) {
        this.LJJII = iVideoStrategyRunner;
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.setVideoStrategyRunner(iVideoStrategyRunner);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void stopPush(boolean z) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.stopPush(z);
        }
        LIZLLL();
    }

    @Override // X.InterfaceC1266360j3i
    public final void unbindFromRoom(String str) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.unbindFromRoom(str);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.updateExternalStats(lyraxPreProcessVideoNodeStats);
        }
    }

    public final void LJII(int i, String str) {
        int iValue;
        if (this.LJ == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", retry=");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        View view = this.LJ;
        if (view == null) {
            iValue = LyraxErrorCode.SUCCESS.value();
        } else {
            ILyraxEngine iLyraxEngine = this.LIZIZ;
            if (iLyraxEngine != null && iLyraxEngine.getVideoModule() != null) {
                this.LIZLLL = view;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("replayPendingCapturePreviewDisplay:");
                sbLIZ2.append(strLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                LJ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("replayPendingCapturePreviewDisplay:");
                sbLIZ3.append(strLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
                LIZ(false);
                LyraxErrorCode lyraxErrorCodeResetPreviewView = this.LIZIZ.getVideoModule().resetPreviewView(view);
                if (lyraxErrorCodeResetPreviewView == null) {
                    lyraxErrorCodeResetPreviewView = LyraxErrorCode.FAILURE;
                }
                iValue = lyraxErrorCodeResetPreviewView.value();
                if (iValue == LyraxErrorCode.SUCCESS.value()) {
                    this.LJ = null;
                }
            } else {
                iValue = LyraxErrorCode.INVALID_STATE.value();
            }
        }
        if (iValue == LyraxErrorCode.SUCCESS.value() || this.LJ == null || i >= 8) {
            return;
        }
        C786410Ut5.LJLIIL(500L, this.LJFF, new ARunnableS4S1101000_20(i, str, this, 0));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIJ(C1277690jLz c1277690jLz, boolean z) {
        this.LJIILLIIL = c1277690jLz;
        Context contextN3 = C786410Ut5.N3(this.LJI.LJLJI.LJIIZILJ);
        C1269160j8E c1269160j8E = this.LJI;
        C1277590jLp c1277590jLp = new C1277590jLp(contextN3, new C1278530jNL(c1269160j8E.LIZJ, C1274040jG6.LIZ), c1269160j8E.LJIJI, c1269160j8E.LJIJJ);
        this.LJJIZ = c1277590jLp;
        this.LJJIJIIJI = c1277590jLp.LJI.switchParams.LIZIZ;
        this.LJJJIL = new C1277750jM5();
        com.ss.pusher.core.params.LiveSdkSetting liveSdkSetting = this.LJJIZ.LJI;
        PushBase pushBase = liveSdkSetting.mPushBase;
        this.LJJIJIIJIL = pushBase.isNoRoomJoinRoomOnce;
        this.LJJIJIL = pushBase.LJJJJJ;
        this.LJJIJL = liveSdkSetting.switchParams.LIZJ;
        this.LJJIJLIJ = pushBase.liveGlVersion;
        this.LJJIL = pushBase.LJJJJ;
        GLThreadManager.LIZLLL(false);
        if (!this.LJJIJL) {
            GLThreadManager.LJFF = this.LJJIJLIJ;
        }
        C1279370jOh.LIZ = this.LJJIL;
        GLThreadManager.LIZ();
        int iLJJIL = this.LJI.LJJIL(2);
        int iLJJIJIIJIL = this.LJI.LJJIJIIJIL(2);
        LJIJJLI(new C1278540jNM(iLJJIL, iLJJIJIIJIL));
        C1269160j8E c1269160j8E2 = this.LJI;
        c1269160j8E2.getClass();
        if (iLJJIL > 0 && iLJJIJIIJIL > 0) {
            C1269140j8C c1269140j8C = c1269160j8E2.LJLJI;
            c1269140j8C.LJIILL = iLJJIL;
            c1269140j8C.LJIILLIIL = iLJJIJIIJIL;
        }
        C1278640jNW c1278640jNW = new C1278640jNW();
        this.LJJIII = c1278640jNW;
        c1278640jNW.LIZ = new InterfaceC1278630jNV() { // from class: X.0jJT
            @Override // X.InterfaceC1278630jNV
            public final String LIZ() {
                return C0X2A.LIZJ;
            }

            @Override // X.InterfaceC1278630jNV
            public final String LIZIZ(String str) {
                try {
                    C1276320jJm c1276320jJmTtUrlDispatch = TTNetInit.ttUrlDispatch(str);
                    LIZJ(c1276320jJmTtUrlDispatch, str);
                    if (TextUtils.isEmpty(c1276320jJmTtUrlDispatch.LIZIZ)) {
                        return null;
                    }
                    return c1276320jJmTtUrlDispatch.LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            public final void LIZJ(C1276320jJm c1276320jJm, String str) {
                if (c1276320jJm == null) {
                    return;
                }
                try {
                    JSONObject jSONObjectPut = new JSONObject().put("event_key", "rtc_url_dispatcher_V2").put("api", "ttUrlDispatchWithUrl").put("value", "live").put("dispatchState", c1276320jJm.LJ.ordinal()).put("live_sdk_version", "7.22.0.93900").put("qId", this.LIZ.LJI.LJLJI.LIZ()).put("message", new JSONObject().put("finalUrl", c1276320jJm.LIZIZ).put("originUrl", str).put("userRegion", C0X2A.LIZJ).put("ePoc", c1276320jJm.LIZJ).put("eTag", c1276320jJm.LIZLLL).put("dispatchState", c1276320jJm.LJ.ordinal()));
                    InterfaceC1266880j4Y interfaceC1266880j4Y = this.LIZ.LJI.LJLJI.LJJIIJ;
                    if (interfaceC1266880j4Y != null) {
                        interfaceC1266880j4Y.LIZ(jSONObjectPut);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C1274040jG6.LIZ()) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        if (LJFF() >= 2) {
            C786410Ut5.LJJZZIII(this.LJFF, new ARunnableS120S0100000_20(this, 14));
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIILLIIL(String[] strArr, boolean z) {
        int length;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
        String strLJIIJ;
        ILyraxEngine iLyraxEngineCreate;
        ArrayList arrayList;
        ILyraxEngine iLyraxEngine;
        PushStreamData pushStreamData;
        Context contextN3;
        TelephonyManager telephonyManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPush: urls=");
        if (strArr != null) {
            length = strArr.length;
        } else {
            length = 0;
        }
        sbLIZ.append(length);
        sbLIZ.append(", immediate=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (strArr != null && strArr.length != 0) {
            LyraxEglEnvironment.init(GLThreadManager.LJFF(), GLESVersion.fromId(GLThreadManager.LJI()[0]), new LyraxEglEnvironment.EglInitEventListener() { // from class: X.0jLf
                @Override // com.ss.lyrax.engine.LyraxEglEnvironment.EglInitEventListener
                public final void onInitializedEngineEGL(GLESVersion gLESVersion) {
                }
            });
            Uri uri = UriProtector.parse(strArr[0]);
            if (!TextUtils.isEmpty(strArr[0])) {
                this.LJJIJ = strArr[0];
            }
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcRoomId") == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcRoomId");
            }
            this.LJJIIJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcUserId") == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcUserId");
            }
            this.LJJIIJZLJL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcToken") == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcToken");
            }
            this.LJJIIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcStreamId") == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcStreamId");
            }
            this.LJJIIZI = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
            LyraxStreamOption lyraxStreamOption = new LyraxStreamOption();
            C1269160j8E c1269160j8E = this.LJI;
            lyraxStreamOption.liveAuthString = c1269160j8E.LJIIZILJ;
            lyraxStreamOption.streamOrientation = c1269160j8E.LJLJJI.getValue();
            lyraxStreamOption.urls = new ArrayList();
            for (String str : strArr) {
                lyraxStreamOption.urls.add(str);
            }
            String str2 = this.LJI.LJIJJLI.LJ;
            if (str2 == null) {
                str2 = "";
            }
            lyraxStreamOption.userId = str2;
            lyraxStreamOption.streamId = this.LJJIIZI;
            lyraxStreamOption.userRegion = C0X2A.LIZJ;
            C1269160j8E c1269160j8E2 = this.LJI;
            String str3 = c1269160j8E2.LJIJJLI.LJFF;
            if (str3 == null) {
                str3 = "";
            }
            lyraxStreamOption.carrierRegion = str3;
            if (!TextUtils.isEmpty(c1269160j8E2.LIZ.mPushBase.LJJIII())) {
                lyraxStreamOption.idcName = this.LJI.LIZ.mPushBase.LJJIII();
            }
            try {
                contextN3 = C786410Ut5.N3(this.LJI.LJLJI.LJIIZILJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (contextN3 == null || (telephonyManager = (TelephonyManager) C786410Ut5.H2(contextN3, "phone")) == null) {
                strLJIIJ = "";
            } else {
                try {
                    AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                    strLJIIJ = C1300840jxK.LJIIJ(telephonyManager);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    strLJIIJ = "";
                }
            }
            lyraxStreamOption.mccMnc = strLJIIJ;
            lyraxStreamOption.listener = this.LJJ;
            String str4 = strArr[0];
            if (str4 != null && !str4.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("host", C1278890jNv.LIZIZ(str4));
                    jSONObject.put("stream_session_vv_id", str4);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C1277590jLp c1277590jLp = this.LJJIZ;
                if (c1277590jLp != null && (pushStreamData = c1277590jLp.LJII) != null) {
                    Iterator<Map.Entry<String, List<PushStreamData.NodeInfo>>> it2 = pushStreamData.nodeInfoMap.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<PushStreamData.NodeInfo>> next = it2.next();
                        String key = next.getKey();
                        List<PushStreamData.NodeInfo> value = next.getValue();
                        if (str4.contains(key) && value != null && !value.isEmpty()) {
                            String strLIZJ = ((PushStreamData.NodeInfo) ListProtector.get(value, 0)).ip;
                            if (strLIZJ != null && ((strLIZJ.isEmpty() || !C1278890jNv.LIZLLL(strLIZJ) || (strLIZJ = C1278890jNv.LIZJ(strLIZJ)) != null) && !strLIZJ.isEmpty())) {
                                lyraxStreamOption.ip = strLIZJ;
                            }
                        }
                    }
                }
            }
            LyraxPusherSessionOption lyraxPusherSessionOption = new LyraxPusherSessionOption();
            C1269160j8E c1269160j8E3 = this.LJI;
            if (c1269160j8E3 != null) {
                lyraxPusherSessionOption.streamOption = lyraxStreamOption;
                LyraxEngineOption lyraxEngineOption = lyraxPusherSessionOption.engineOption;
                lyraxEngineOption.scene = LyraxScene.LIVE;
                lyraxEngineOption.inAnchorNet = true;
                if (c1269160j8E3.LJJJJI) {
                    lyraxEngineOption.enableLocalLogCallback = true;
                }
                String strLJI = c1269160j8E3.LJI();
                LyraxBusinessOption lyraxBusinessOption = lyraxPusherSessionOption.engineOption.businessOption;
                if (TextUtils.isEmpty(strLJI)) {
                    strLJI = "5dad71914d894800389238d8";
                }
                lyraxBusinessOption.appId = strLJI;
                lyraxPusherSessionOption.engineOption.businessOption.liveRoomId = this.LJJIIJ;
                if (this.LJI.LJJII() != 3 && !this.LJI.LJJIIZI) {
                    lyraxPusherSessionOption.engineOption.businessOption.liveType = LyraxLiveType.VIDEO;
                } else {
                    lyraxPusherSessionOption.engineOption.businessOption.liveType = LyraxLiveType.GAME;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(this.LJI.LJII())) {
                        jSONObject2 = new JSONObject(this.LJI.LJII());
                    }
                    lyraxPusherSessionOption.engineOption.networkOption.accessHosts.clear();
                    lyraxPusherSessionOption.engineOption.networkOption.accessHosts.add("https://rtcpc-access-sg.tiktokv.com/");
                    lyraxPusherSessionOption.engineOption.networkOption.accessHosts.add("https://rtc-access-sg.tiktokv.com/");
                    if (this.LJI.LIZ.LJIIL()) {
                        String strLIZIZ = this.LJI.LIZ.LIZIZ();
                        if (!TextUtils.isEmpty(strLIZIZ)) {
                            lyraxPusherSessionOption.engineOption.networkOption.accessHosts.clear();
                            lyraxPusherSessionOption.engineOption.networkOption.accessHosts.add(strLIZIZ);
                        }
                    }
                    LyraxEngineOption lyraxEngineOption2 = lyraxPusherSessionOption.engineOption;
                    LyraxNetworkOption lyraxNetworkOption = lyraxEngineOption2.networkOption;
                    lyraxNetworkOption.accessGroupId = this.LJJIIJ;
                    lyraxNetworkOption.liveRole = "host";
                    lyraxEngineOption2.logSdkWebsocketUrl = "https://rtc-logger-va.tiktokv.com/report";
                    if (this.LJI.LIZ.LJIIL()) {
                        String strLIZJ2 = this.LJI.LIZ.LIZJ();
                        if (!TextUtils.isEmpty(strLIZJ2)) {
                            lyraxPusherSessionOption.engineOption.logSdkWebsocketUrl = strLIZJ2;
                        }
                    }
                    if (jSONObject2.has("rtc.ab_label")) {
                        lyraxPusherSessionOption.engineOption.businessOption.abLabel = JSONObjectProtectorUtils.getString(jSONObject2, "rtc.ab_label");
                    } else {
                        lyraxPusherSessionOption.engineOption.businessOption.abLabel = "";
                    }
                    if (jSONObject2.has("rtc.common_extra_info")) {
                        JSONObject jSONObject3 = new JSONObject(JSONObjectProtectorUtils.getString(jSONObject2, "rtc.common_extra_info"));
                        if (jSONObject3.has("app_channel")) {
                            lyraxPusherSessionOption.engineOption.appOption.appChannel = JSONObjectProtectorUtils.getString(jSONObject3, "app_channel");
                        } else {
                            lyraxPusherSessionOption.engineOption.appOption.appChannel = "";
                        }
                        if (jSONObject3.has("app_version")) {
                            lyraxPusherSessionOption.engineOption.appOption.appVersion = JSONObjectProtectorUtils.getString(jSONObject3, "app_version");
                        } else {
                            lyraxPusherSessionOption.engineOption.appOption.appVersion = "";
                        }
                    }
                    String string = this.LJI.LJLJI.LJIIZILJ.getPackageManager().getApplicationLabel(this.LJI.LJLJI.LJIIZILJ.getApplicationInfo()).toString();
                    LyraxEngineOption lyraxEngineOption3 = lyraxPusherSessionOption.engineOption;
                    lyraxEngineOption3.appOption.appName = string;
                    LyraxBusinessOption lyraxBusinessOption2 = lyraxEngineOption3.businessOption;
                    C1274010jG3 c1274010jG3 = this.LJI.LJIJJLI;
                    lyraxBusinessOption2.aid = c1274010jG3.LIZ;
                    lyraxBusinessOption2.deviceId = c1274010jG3.LIZJ;
                    lyraxBusinessOption2.userRegion = this.LJJIII.LIZ.LIZ();
                    LiveSdkSetting liveSdkSetting = this.LJI.LIZ;
                    if (liveSdkSetting != null && liveSdkSetting.ttlhABSettingsConfigs != null) {
                        if (C1276090jJP.LIZJ) {
                            lyraxPusherSessionOption.engineOption.enablePreGetConfig = true;
                        }
                        lyraxPusherSessionOption.engineOption.enableRemoveSceneNone = this.LJI.LIZ.ttlhABSettingsConfigs.LJIIIIZZ();
                        lyraxPusherSessionOption.engineOption.videoStrategyActiveScene = this.LJI.LIZ.ttlhABSettingsConfigs.LJIJI();
                        lyraxPusherSessionOption.engineOption.videoOption.enableDownNativeRender = this.LJI.LIZ.ttlhABSettingsConfigs.LJ();
                        lyraxPusherSessionOption.engineOption.videoOption.capturePipelineStage = this.LJI.LIZ.LJIJJ();
                    }
                } catch (JSONException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                lyraxPusherSessionOption.engineOption.androidOption.context = this.LJI.LJLJI.LJIIZILJ;
                GLESVersion gLESVersionFromId = GLESVersion.GLES_VERSION_2;
                if (this.LJJIJIL) {
                    gLESVersionFromId = GLESVersion.fromId(GLThreadManager.LJI()[0]);
                }
                LyraxAndroidOption lyraxAndroidOption = lyraxPusherSessionOption.engineOption.androidOption;
                lyraxAndroidOption.glesVersion = gLESVersionFromId;
                lyraxAndroidOption.eglContext = GLThreadManager.LJFF();
                lyraxPusherSessionOption.engineOption.liveSettings = this.LJI.LJIJI;
            }
            if (this.LIZIZ == null) {
                this.LIZIZ = ILyraxEngine.create(lyraxPusherSessionOption.engineOption);
                this.LIZJ = true;
            } else if (this.LIZJ && (iLyraxEngineCreate = ILyraxEngine.create(lyraxPusherSessionOption.engineOption)) != null) {
                this.LIZIZ = iLyraxEngineCreate;
            }
            LyraxPusherSessionImpl lyraxPusherSessionImplCreate = LyraxPusherSessionImpl.create(lyraxPusherSessionOption, this.LIZIZ);
            this.LIZ = lyraxPusherSessionImplCreate;
            if (lyraxPusherSessionImplCreate == null) {
                if (this.LIZJ && (iLyraxEngine = this.LIZIZ) != null) {
                    iLyraxEngine.dispose();
                    this.LIZIZ = null;
                    this.LIZJ = false;
                }
            } else {
                lyraxPusherSessionImplCreate.setListener(this.LJJ);
                ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper = this.LJII;
                if (iLyraxVideoPlatformWrapper != null) {
                    this.LIZ.setVideoSource(iLyraxVideoPlatformWrapper);
                }
                LJII(0, "createLivePusher");
                AppMonitor.get(this.LJI.LJLJI.LJIIZILJ).register(this.LJI.LJLJI.LJIIZILJ, this.LJJJI);
                Iterator it3 = ((ArrayList) this.LJIJ).iterator();
                while (it3.hasNext()) {
                    LIZIZ((InterfaceC1277930jMN) it3.next());
                }
                ((ArrayList) this.LJIJ).clear();
                if (this.LJIJJ) {
                    if (this.LJIJI != null) {
                        arrayList = new ArrayList(this.LJIJI);
                    } else {
                        arrayList = null;
                    }
                    this.LIZ.setFeaturesConfig(new LyraxTranscoderFeaturesConfig(arrayList));
                    this.LJIJI = null;
                    this.LJIJJ = false;
                }
                C1278250jMt c1278250jMt = this.LJIJJLI;
                if (c1278250jMt != null) {
                    this.LIZ.insertStandardLevel(c1278250jMt.LIZ, c1278250jMt.LIZIZ, c1278250jMt.LIZJ, c1278250jMt.LIZLLL);
                    this.LJIJJLI = null;
                }
                C1278420jNA c1278420jNA = this.LJIL;
                if (c1278420jNA != null) {
                    this.LIZ.setVideoPerformanceConfig(c1278420jNA.LIZ, c1278420jNA.LIZIZ, c1278420jNA.LIZJ, null);
                    this.LJIL = null;
                }
                IVideoStrategyRunner iVideoStrategyRunner = this.LJJII;
                if (iVideoStrategyRunner != null) {
                    setVideoStrategyRunner(iVideoStrategyRunner);
                }
            }
            if (this.LIZ == null) {
                return;
            }
            enableCalculateAudioLoudness(this.LJJJ);
            this.LIZ.startPush(z);
            LJII(0, "startPush");
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIJ(String str, boolean z) {
        LJIILLIIL(new String[]{str}, z);
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIII(boolean z, EnumC1269700j96 enumC1269700j96) {
        LyraxVideoRendererType lyraxVideoRendererType;
        if (z && enumC1269700j96 == EnumC1269700j96.CameraView_And_SingleViewRender) {
            lyraxVideoRendererType = LyraxVideoRendererType.STREAM_MIXER;
        } else {
            lyraxVideoRendererType = LyraxVideoRendererType.NORMAL_RENDER;
        }
        this.LJIIL = lyraxVideoRendererType;
        LIZ(true);
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIIIZZ(String str, String str2, int i) {
        if (this.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addUserMetaData: key=");
            sbLIZ.append(str);
            sbLIZ.append(", value=");
            sbLIZ.append(str2);
            AVLog.i("VeLivePusherNative", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.addUserMetadata(str, str2);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJJIJIL(int i, int i2, int i3) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            if (lyraxPusherSessionImpl.setVideoPerformanceConfig(i, i2, i3, null) == LyraxErrorCode.SUCCESS) {
                return 0;
            }
            return -1;
        }
        this.LJIL = new C1278420jNA(i, i2, i3);
        return 0;
    }

    @Override // X.InterfaceC1266360j3i
    public final void insertStandardLevel(int i, int i2, int i3, int i4) {
        LyraxPusherSessionImpl lyraxPusherSessionImpl = this.LIZ;
        if (lyraxPusherSessionImpl != null) {
            lyraxPusherSessionImpl.insertStandardLevel(i, i2, i3, i4);
        } else {
            this.LJIJJLI = new C1278250jMt(i, i2, i3, i4);
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJJIJIIJI(String str, Object obj, int i, boolean z, boolean z2, int i2) {
        if (this.LIZ == null) {
            return -1;
        }
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (!byteBuffer.isDirect() || byteBuffer.remaining() != byteBuffer.capacity()) {
                AVLog.ioe("VeLivePusherNative", "A DirectByteBuffer is needed and its remaining size should equals to its capacity.");
                return -1;
            }
        } else {
            if (TextUtils.isEmpty(str)) {
                AVLog.logToIODeviceCheckRedundancy(6, "VeLivePusherNative", "When value is not a ByteBuffer, a valid key should be specified.", null, "LibRTMPTransport.java::addSeiField", 10000);
                return -2;
            }
            if (obj != null) {
                if (!(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unsupported value type: ");
                    sbLIZ.append(obj.getClass().getName());
                    AVLog.ioe("VeLivePusherNative", C2188811AlT.LIZIZ(sbLIZ));
                    return -3;
                }
            } else {
                AVLog.ioe("VeLivePusherNative", "value is null");
            }
        }
        LyraxPusherSEIParam lyraxPusherSEIParam = new LyraxPusherSEIParam(str, String.valueOf(obj));
        lyraxPusherSEIParam.setRepeatTimes(i);
        lyraxPusherSEIParam.setKeyFrameOnly(z);
        lyraxPusherSEIParam.setAllowsCovered(z2);
        lyraxPusherSEIParam.setSeiFlag(i2);
        if (this.LIZ.sendSEI(lyraxPusherSEIParam) != LyraxErrorCode.SUCCESS) {
            return -1;
        }
        return 0;
    }
}
