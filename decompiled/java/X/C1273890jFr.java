package X;

import Y.ARunnableS0S1102000_12;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS23S0101000_12;
import Y.ARunnableS2S0202000_12;
import Y.ARunnableS7S0102000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.RestartLiveChannel;
import com.bytedance.android.livesdk.broadcast.harmodel.LiveReportTnsApi;
import com.bytedance.android.livesdk.broadcast.setting.RemoteVideoFrozenSetting;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameLiveAdaptiveSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAdmNsTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectSDKConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableEffectConfigLogSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableEffectLogSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LyraxMediaPlayerSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnableInitTimeCostOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnablePreGetConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LGameEnableAugurConfigCenter;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LPreGetConfigUseCache;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LiveEnableAudioMixerSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.MixStreamDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHEnableLyraxAudioMixer;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHFixStreamLogLostSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHSplitModuleRtcAppID;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSMainVideoMixerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCohostResumeClientFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicDynamicLayoutMediaSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGLThreadCreateFailedOptimize;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCameraCaptureSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePushStreamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableStreamPreviewSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostStarshipStrategyService;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.bytertc.engine.loader.LyraxSoLoadState;
import com.ss.lyrax.augur.AugurAdaptiveWrapper;
import com.ss.lyrax.augur.AugurConfigRequester;
import com.ss.lyrax.augur.AugurOption;
import com.ss.lyrax.engine.LyraxAppLogHandler;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273890jFr implements InterfaceC769940UIe, InterfaceC768780UDs, InterfaceC775610Ubf, InterfaceC1274090jGB {
    public final C776310Ucn LIZ;
    public InterfaceC775290Ub9 LIZJ;
    public C0UHL LIZLLL;
    public InterfaceC775310UbB LJ;
    public InterfaceC774930UaZ LJFF;
    public AbstractC1273900jFs LJI;
    public volatile C1274850jHP LJII;
    public volatile boolean LJIIIIZZ;
    public InterfaceC1276380jJs LJIIIZ;
    public InterfaceC774920UaY LJIIJ;
    public Function0<Unit> LJIIL;
    public Function1<? super Boolean, Unit> LJIILIIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public long LJIIZILJ;
    public boolean LJJ;
    public InterfaceC1274020jG4 LJJIFFI;
    public final boolean LJJIII;
    public final boolean LJJIIJZLJL;
    public final C769950UIf LIZIZ = new Object() { // from class: X.0UIf
    };
    public final C1273930jFv LJIIJJI = new InterfaceC1268920j7q() { // from class: X.0jFv
        @Override // X.InterfaceC1268920j7q
        public final void LIZ(EnumC1274000jG2 enumC1274000jG2, int i) {
            int i2;
            int i3;
            boolean z;
            boolean z2;
            if (enumC1274000jG2 != null) {
                int i4 = C1273990jG1.LIZ[enumC1274000jG2.ordinal()];
                boolean z3 = true;
                if (i4 != 1) {
                    i2 = 2;
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    i2 = 0;
                }
                if (i == 0) {
                    i3 = 0;
                } else if ((i & 2) != 0) {
                    i3 = 3;
                } else if ((i & 4) != 0) {
                    i3 = 4;
                } else {
                    i3 = 5;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAudioDeviceCaptureStateChanged reason:");
                sbLIZ.append(i);
                sbLIZ.append(", and 1=");
                int i5 = i & 2;
                sbLIZ.append(i5);
                sbLIZ.append(" ~ ");
                if (i5 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(", and2=");
                int i6 = 4 & i;
                if (i6 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sbLIZ.append(z2);
                sbLIZ.append(" ~ ");
                if (i6 == 0) {
                    z3 = false;
                }
                sbLIZ.append(z3);
                sbLIZ.append(" ret: ");
                sbLIZ.append(i3);
                sbLIZ.append(",  ");
                sbLIZ.append(this.LIZ.LJI);
                C20441214yg.LIZIZ("LiveCenterEntranceWidget", C2188811AlT.LIZIZ(sbLIZ));
                C1273890jFr c1273890jFr = this.LIZ;
                C786410Ut5.LJJZZIII(c1273890jFr.LJIJ, new ARunnableS7S0102000_20(i2, c1273890jFr, i3, 0));
            }
        }
    };
    public int LJIILJJIL = -1;
    public final BPEAHandler LJIJ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS112S0100000_12 LJIJI = new ARunnableS112S0100000_12(this, 14);
    public final ARunnableS120S0100000_20 LJIJJ = new ARunnableS120S0100000_20(this, 12);
    public final C01GW LJIJJLI = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(5));
    public final C775280Ub8 LJIL = new InterfaceC775290Ub9() { // from class: X.0Ub8
        @Override // X.InterfaceC775300UbA
        public final void V3(int i, int i2, Exception exc) {
            String simpleName;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTLS onError ->");
            sbLIZ.append(i);
            sbLIZ.append(';');
            sbLIZ.append(i2);
            C20441214yg.LJ("LiveStreamTag", C2188811AlT.LIZIZ(sbLIZ));
            if (i == 300) {
                C1273890jFr c1273890jFr = this.LL;
                C786410Ut5.LJJZZIII(c1273890jFr.LJIJ, new ARunnableS23S0101000_12(i2, c1273890jFr, 0));
                return;
            }
            C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
            if (c0utq != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i);
                sbLIZ2.append(';');
                sbLIZ2.append(i2);
                sbLIZ2.append(';');
                String message = null;
                if (exc != null) {
                    simpleName = exc.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                sbLIZ2.append(simpleName);
                sbLIZ2.append('(');
                if (exc != null) {
                    message = exc.getMessage();
                }
                sbLIZ2.append(message);
                sbLIZ2.append(')');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                if (c0utq.LJJIJIL.length() != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(c0utq.LJJIJIL);
                    sbLIZ3.append(" | ");
                    sbLIZ3.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                c0utq.LJJIJIL = strLIZIZ;
            }
            if (LinkMicGLThreadCreateFailedOptimize.INSTANCE.enable() && i == 9) {
                this.LL.LJIIIIZZ = true;
                InterfaceC775310UbB interfaceC775310UbB = this.LL.LJ;
                if (interfaceC775310UbB != null) {
                    interfaceC775310UbB.LIZ();
                }
            }
            C1273890jFr c1273890jFr2 = this.LL;
            C786410Ut5.LJJZZIII(c1273890jFr2.LJIJ, new ARunnableS2S0202000_12(c1273890jFr2, i, exc, i2, 0));
            InterfaceC775270Ub7 interfaceC775270Ub7 = this.LL.LIZ.LJIJJ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("code1:");
            sbLIZ4.append(i);
            sbLIZ4.append(",code2:");
            sbLIZ4.append(i2);
            interfaceC775270Ub7.e(C2188811AlT.LIZIZ(sbLIZ4), exc);
            InterfaceC775290Ub9 interfaceC775290Ub9 = this.LL.LIZJ;
            if (interfaceC775290Ub9 != null) {
                interfaceC775290Ub9.V3(i, i2, exc);
            }
        }
    };
    public final C775260Ub6 LJJI = new C0UHL() { // from class: X.0Ub6
        @Override // X.InterfaceC1266820j4S
        public final void LIZJ(Map map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1273890jFr c1273890jFr = this.LL;
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && value != null) {
                    linkedHashMap.put(key, value);
                }
            }
            linkedHashMap.put("data_type", 1);
            linkedHashMap.put("room_id", c1273890jFr.LIZ.LJJJJZ);
            C480460Ism.LIZ().getClass();
            AbstractC19484711Kz<C470590Icr<Object>> abstractC19484711KzUploadSexualSignal = ((LiveReportTnsApi) C480460Ism.LIZLLL(LiveReportTnsApi.class)).uploadSexualSignal(linkedHashMap, new MultipartTypedOutput());
            if (abstractC19484711KzUploadSexualSignal != null) {
                abstractC19484711KzUploadSexualSignal.LJJIIJ();
            }
        }

        @Override // X.InterfaceC1266820j4S
        public final void LIZLLL(final int i, final int i2, final int i3) {
            String strLIZIZ;
            Long lValueOf;
            final C1273890jFr c1273890jFr = this.LL;
            C786410Ut5.LJL(c1273890jFr.LJIJ, new Runnable() { // from class: X.0UaX
                /* JADX WARN: Removed duplicated region for block: B:83:0x0118  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 1068
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC774910UaX.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveStream@b84d.infoListener$1$onInfo$runnable$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveStream@b84d.infoListener$1$onInfo$runnable$1");
                }
            });
            InterfaceC775270Ub7 interfaceC775270Ub7 = this.LL.LIZ.LJIJJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("INFO (");
            sbLIZ.append(i);
            sbLIZ.append(',');
            sbLIZ.append(i2);
            sbLIZ.append(',');
            sbLIZ.append(i3);
            sbLIZ.append(") ");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            switch (i) {
                case 1:
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ2);
                    sbLIZ2.append("starting_publish");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    break;
                case 2:
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ2);
                    sbLIZ3.append("started_publish");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    break;
                case 3:
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ2);
                    sbLIZ4.append("stoped_publish");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    break;
                case 4:
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ2);
                    sbLIZ5.append("video_starting_capture");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    break;
                case 5:
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(strLIZIZ2);
                    sbLIZ6.append("video_started_capture");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                    break;
                case 6:
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(strLIZIZ2);
                    sbLIZ7.append("video_stoped_capture");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                    break;
                case 7:
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(strLIZIZ2);
                    sbLIZ8.append("audio_starting_capture");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
                    break;
                case 8:
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(strLIZIZ2);
                    sbLIZ9.append("audio_started_capture");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append(strLIZIZ2);
                    sbLIZ10.append("audio_stoped_capture");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ10);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(strLIZIZ2);
                    sbLIZ11.append("rtmp_connecting");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ11);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append(strLIZIZ2);
                    sbLIZ12.append("rtmp_connected");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ12);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append(strLIZIZ2);
                    sbLIZ13.append("rtmp_connect_fail");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ13);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append(strLIZIZ2);
                    sbLIZ14.append("network too weak");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ14);
                    break;
                case 14:
                    StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                    sbLIZ15.append(strLIZIZ2);
                    sbLIZ15.append("rtmp_disconnected");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ15);
                    break;
                case 15:
                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                    sbLIZ16.append(strLIZIZ2);
                    sbLIZ16.append("rtmp_reconnecting");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ16);
                    break;
                case 16:
                    StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                    sbLIZ17.append(strLIZIZ2);
                    sbLIZ17.append("video_encoder_format_changed");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ17);
                    break;
                default:
                    StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                    sbLIZ18.append(strLIZIZ2);
                    sbLIZ18.append("UNKONW???");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ18);
                    break;
            }
            interfaceC775270Ub7.i(strLIZIZ);
            C0UHL c0uhl = this.LL.LIZLLL;
            if (c0uhl != null) {
                c0uhl.LIZLLL(i, i2, i3);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_push_stream_info");
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            Long lValueOf2 = null;
            if (room != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "anchor_id");
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getId());
            }
            c474500IjALIZ.LJJII(lValueOf2, "room_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "code1");
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "code2");
            c474500IjALIZ.LJJII(Integer.valueOf(i3), "code3");
            c474500IjALIZ.LIZ();
        }

        @Override // X.InterfaceC1266820j4S
        public final void onInfo(int i, int i2, String str) {
            C1273890jFr c1273890jFr = this.LL;
            C786410Ut5.LJJZZIII(c1273890jFr.LJIJ, new ARunnableS0S1102000_12(i, i2, str, c1273890jFr, 0));
        }

        @Override // X.C0UHL
        public final void LLLZ(String str, String str2, Map<String, Object> map, C0U8C c0u8c) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAdaptiveResult: ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            sbLIZ.append(", ");
            sbLIZ.append(map);
            C20441214yg.LIZIZ("LiveStreamTag", C2188811AlT.LIZIZ(sbLIZ));
            C0UHL c0uhl = this.LL.LIZLLL;
            if (c0uhl != null) {
                c0uhl.LLLZ(str, str2, map, c0u8c);
            }
        }
    };
    public final C1273980jG0 LJJII = new InterfaceC1300400jwc() { // from class: X.0jG0
        @Override // X.InterfaceC1300400jwc
        public final int LIZ() {
            InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
            AbstractC1273900jFs abstractC1273900jFs = this.LIZ.LJI;
            if (abstractC1273900jFs == null || (interfaceC1268640j7OLJIIL = abstractC1273900jFs.LJIIL()) == null) {
                return 0;
            }
            return interfaceC1268640j7OLJIIL.LJLI();
        }

        @Override // X.InterfaceC1300400jwc
        public final int LIZJ() {
            InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
            AbstractC1273900jFs abstractC1273900jFs = this.LIZ.LJI;
            if (abstractC1273900jFs == null || (interfaceC1268640j7OLJIIL = abstractC1273900jFs.LJIIL()) == null) {
                return 0;
            }
            return interfaceC1268640j7OLJIIL.LJJJJIZL();
        }

        @Override // X.InterfaceC1300400jwc
        public final Map<String, String> LIZIZ(long j) {
            AbstractC1273900jFs abstractC1273900jFs = this.LIZ.LJI;
            if (abstractC1273900jFs != null) {
                return abstractC1273900jFs.LJLLL(j);
            }
            return null;
        }
    };
    public final boolean LJJIIJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();

    @Override // X.InterfaceC769940UIe
    public final void q3() {
        this.LJJIFFI = null;
    }

    static {
        if (TTLHFixStreamLogLostSettings.INSTANCE.enabled()) {
            C0UQX.LJII();
        }
    }

    public static String LJIIZILJ() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String value = LiveAudioAbParamsSetting.INSTANCE.getValue();
            Map mapLJ = C2097608Jq.LJ();
            if (C1533950q1J.LJ(value)) {
                try {
                    mapLJ = C2348509Id.LIZIZ(new JSONObject(value));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            linkedHashMap.putAll(mapLJ);
            return C786410Ut5.J3(new JSONObject(linkedHashMap));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return "";
        }
    }

    @Override // X.InterfaceC769940UIe
    public final AudioDeviceModule E3() {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            return abstractC1273900jFs.LJLLI();
        }
        return null;
    }

    @Override // X.InterfaceC769940UIe
    public final int K3() {
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs == null || (interfaceC1268690j7TLJIJJLI = abstractC1273900jFs.LJIJJLI()) == null) {
            return -1;
        }
        return interfaceC1268690j7TLJIJJLI.LJJIJIIJIL();
    }

    @Override // X.InterfaceC769940UIe, X.InterfaceC1274090jGB
    public final long LIZIZ() {
        AudioDeviceModule audioDeviceModuleLJLLI;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        Double dValueOf = (abstractC1273900jFs == null || (audioDeviceModuleLJLLI = abstractC1273900jFs.LJLLI()) == null) ? null : Double.valueOf(audioDeviceModuleLJLLI.getOption(2));
        if (dValueOf == null) {
            C20441214yg.LJ("LiveStreamTag", "getCurrentMicrophoneDB() return null");
            return 0L;
        }
        long jDoubleValue = (long) dValueOf.doubleValue();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = jDoubleValue / j;
        if (j2 < 0) {
            return jDoubleValue;
        }
        Long.signum(j2);
        return Math.max(j2, jDoubleValue - (j * j2));
    }

    @Override // X.InterfaceC768780UDs
    public final int LIZJ() {
        C1269340j8W c1269340j8WLLD;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs == null || (c1269340j8WLLD = abstractC1273900jFs.LLD()) == null) {
            return 0;
        }
        return c1269340j8WLLD.LJIILIIL(0);
    }

    @Override // X.InterfaceC768780UDs
    public final int LJ() {
        C1269340j8W c1269340j8WLLD;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs == null || (c1269340j8WLLD = abstractC1273900jFs.LLD()) == null) {
            return 0;
        }
        return c1269340j8WLLD.LJIILJJIL(0);
    }

    @Override // X.InterfaceC769940UIe
    public final AbstractC765580U1k LJII() {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            return abstractC1273900jFs.LJII();
        }
        return null;
    }

    @Override // X.InterfaceC769940UIe
    public final int LJIIJJI() {
        int i;
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        C1270830jAv c1270830jAvLJIIJJI = (abstractC1273900jFs == null || (interfaceC1268690j7TLJIJJLI = abstractC1273900jFs.LJIJJLI()) == null) ? null : interfaceC1268690j7TLJIJJLI.LJIIJJI();
        int i2 = 0;
        if (c1270830jAvLJIIJJI != null) {
            i = (int) c1270830jAvLJIIJJI.LIZIZ;
            i2 = (int) c1270830jAvLJIIJJI.LIZ;
        } else {
            i = 0;
        }
        return Math.abs(i) + Math.abs(i2);
    }

    @Override // X.InterfaceC769940UIe
    public final InterfaceC1268640j7O LJIIL() {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            return abstractC1273900jFs.LJIIL();
        }
        return null;
    }

    public final void LJJII() {
        String str;
        String strLJII;
        boolean zEnabled = M2LEnablePreGetConfig.INSTANCE.enabled();
        if (zEnabled) {
            String serverDeviceId = C781270Ukn.LJIIJJI().getServerDeviceId();
            String rtcAppID = TTLHSplitModuleRtcAppID.INSTANCE.getRtcAppID();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            Context context = iHostAppContext != null ? iHostAppContext.context() : null;
            C776310Ucn c776310Ucn = this.LIZ;
            if (c776310Ucn.LIZJ == 2) {
                C776270Ucj.LIZ.getClass();
                strLJII = C776270Ucj.LJIIIIZZ();
                str = "game";
            } else {
                str = c776310Ucn.LJJJJ ? "video" : "";
                C776270Ucj.LIZ.getClass();
                strLJII = C776270Ucj.LJII();
            }
            C1276090jJP.LJ(zEnabled, new C1276150jJV(context, rtcAppID, serverDeviceId, strLJII, M2LPreGetConfigUseCache.INSTANCE.getValue(), str));
        }
    }

    public final void LJJIII() {
        if (TtliveGameEnableCategoryGearsSetting.INSTANCE.isEnable()) {
            try {
                C1273920jFu c1273920jFu = new C1273920jFu();
                if (C500260Jjc.LJJIIZ(this.LIZ.LJJIJIIJI)) {
                    JSONObject jSONObject = new JSONObject(this.LIZ.LJJIJIIJI);
                    C1D47 c1d47 = this.LIZ.LJJLI;
                    if (c1d47 == null) {
                        c1d47 = new C1D47(EnumC2178851APb.LEVEL_GAME_DEFAULT.level(), EnumC1283150jUn.GAME);
                    }
                    if (!this.LIZ.LJJLIIIJILLIZJL) {
                        c1d47.LJJII = C19370910qR.LIZ().getValue();
                    }
                    c1273920jFu.LIZ = jSONObject;
                    c1273920jFu.LIZIZ = c1d47;
                    this.LIZ.LJJIJIIJI = C786410Ut5.J3(c1273920jFu.LIZ());
                    Map<String, Object> map = C1338270kvh.LIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update sdkParams error! exception=");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("LiveStreamTag", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        boolean zDU = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).dU();
        if (GameDualDeviceAdaptiveSetting.INSTANCE.isExperimentGroup() && zDU) {
            try {
                C1273920jFu c1273920jFu2 = new C1273920jFu();
                if (!C500260Jjc.LJJIIZ(this.LIZ.LJJIJIIJI)) {
                    C20441214yg.LJIIIZ("LiveStreamTag", "update sdkParams is empty()");
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(this.LIZ.LJJIJIIJI);
                C1D47 c1d472 = new C1D47(EnumC2178851APb.LEVEL_GAME_DEFAULT.level(), EnumC1283150jUn.GAME);
                c1d472.LJJII = EnumC1284950jXh.TYPE_DEFAULT.getValue();
                c1273920jFu2.LIZ = jSONObject2;
                c1273920jFu2.LIZIZ = c1d472;
                this.LIZ.LJJIJIIJI = C786410Ut5.J3(c1273920jFu2.LIZ());
                Map<String, Object> map2 = C1338270kvh.LIZ;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update sdkParams error! exception=");
                sbLIZ2.append(e2.getMessage());
                C20441214yg.LJ("LiveStreamTag", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void stop() {
        if (this.LJIILJJIL != 10008) {
            this.LJIILJJIL = 0;
        }
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.stop();
        }
        C0UYQ.LIZ.stop();
        InterfaceC1274020jG4 interfaceC1274020jG4 = this.LJJIFFI;
        if (interfaceC1274020jG4 != null) {
            interfaceC1274020jG4.onStop();
        }
        this.LJIJ.removeCallbacks(this.LJIJJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x08fe A[PHI: r2
      0x08fe: PHI (r2v13 X.1D47) = (r2v12 X.1D47), (r2v15 X.1D47) binds: [B:211:0x08e8, B:217:0x08fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0a4e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1269340j8W LJIILLIIL() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1273890jFr.LJIILLIIL():X.0j8W");
    }

    @Override // X.InterfaceC769940UIe
    public final AbstractC1273900jFs getLiveCore() {
        return this.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0UIf] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0jFv] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Ub6] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0jG0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Ub8] */
    /* JADX WARN: Type inference failed for: r1v24, types: [X.0j5g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C1273890jFr(C776310Ucn c776310Ucn) throws JSONException {
        boolean z;
        AbstractC1273900jFs c1268630j7N;
        String str;
        JSONObject jSONObject;
        AudioDeviceModule audioDeviceModuleLJLLI;
        C09GA c09gaLIZIZ;
        Object obj;
        Object obj2;
        boolean z2;
        LiveMode streamType;
        this.LIZ = c776310Ucn;
        if (M2LEnableInitTimeCostOpt.INSTANCE.enabled() && c776310Ucn.LIZJ == 0 && !Intrinsics.LJFF("screen_dual_device_old", c776310Ucn.LJJ) && !Intrinsics.LJFF("screen_dual_device", c776310Ucn.LJJ)) {
            z = true;
        } else {
            z = false;
        }
        this.LJJIII = z;
        this.LJJIIJZLJL = M2LGameEnableAugurConfigCenter.INSTANCE.enabled();
        C1273970jFz.LIZ();
        C1269340j8W c1269340j8WLJIILLIIL = LJIILLIIL();
        if (!LyraxSoLoadState.isLyraxNativeReady()) {
            c1268630j7N = new C1268650j7P();
        } else {
            c1268630j7N = new C1268630j7N(c1269340j8WLJIILLIIL);
            C1271010jBD c1271010jBD = c1269340j8WLJIILLIIL.LJLJI.LJJIIJZLJL;
            if (c1271010jBD instanceof C1271010jBD) {
                c1271010jBD.LIZIZ = c1268630j7N.hashCode();
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("params", c1269340j8WLJIILLIIL.LJIJI);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            AVLog.logApiCall("setupSdkParams", jSONObject2);
            if (!c1269340j8WLJIILLIIL.LJLJI.LJJJLIIL) {
                AVLog.iow("SDK_PARAMS", "sdkParams Params:" + c1269340j8WLJIILLIIL.LJIJI);
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ttlh_livecore_create");
        c474500IjALIZ.LJIL();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str = streamType.logStreamingType;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "live_type");
        c474500IjALIZ.LJJII("createLiveStream", "report_from");
        c474500IjALIZ.LIZ();
        c1268630j7N.LJIILJJIL(this.LJIL);
        c1268630j7N.LJFF(this.LJJI);
        if (this.LIZ.LIZJ == 2) {
            if (!this.LJJIII && !TTLHEnableLyraxAudioMixer.INSTANCE.enabled()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1268630j7N.LJJIIZ(true, z2);
            c1268630j7N.LJJIIZ(false, GameDualDeviceSetting.INSTANCE.isExperimentGroup());
        } else if (this.LJJIII) {
            c1268630j7N.LJJIIZ(true, false);
            c1268630j7N.LJJIIZ(false, false);
        } else {
            c1268630j7N.LJJIIZ(true, M2LiveEnableAudioMixerSettings.INSTANCE.enabled());
            c1268630j7N.LJJIIZ(false, TTLSMainVideoMixerSwitchSetting.INSTANCE.enableMainVideoMixerSwitch());
        }
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = c1268630j7N.LJIIL();
        try {
            jSONObject = new JSONObject(LiveEffectSDKConfigSetting.INSTANCE.getValue());
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            jSONObject = new JSONObject();
        }
        jSONObject.put("effect_config_live_enable_console_logging", LiveEnableEffectConfigLogSetting.INSTANCE.enable());
        jSONObject.put("enable_console_logging", LiveEnableEffectLogSetting.INSTANCE.enable());
        interfaceC1268640j7OLJIIL.LJJLIIIJLJLI(jSONObject);
        c1268630j7N.LJIIL().LJIJI();
        this.LJI = c1268630j7N;
        if (this.LJIIJ != null) {
            c1268630j7N.LLJJL(this.LJIIJJI);
        } else {
            c1268630j7N.LLJJL(null);
        }
        if (this.LJI != null) {
            if (MixStreamDowngradeSetting.INSTANCE.getValue()) {
                ((IHostStarshipStrategyService) C1161920gLG.LIZJ(IHostStarshipStrategyService.class)).HI1(new AwS599S0100000_20(this, 13));
            }
            if (LinkMicDynamicLayoutMediaSetting.INSTANCE.enable() && (c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId())) != null) {
                C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
                C1300610jwx c1300610jwx2 = C1300610jwx.LJIIJ;
                C1300610jwx[] c1300610jwxArr = {c1300610jwx, C1300610jwx.LIZLLL, C1300610jwx.LJ, C1300610jwx.LJI, c1300610jwx2};
                Bundle bundle = new Bundle();
                c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
                C923980a9U c923980a9U = new C923980a9U();
                try {
                    obj = bundle.get(c1300610jwx.LIZ);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    obj = null;
                } catch (OutOfMemoryError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    obj = null;
                }
                if (obj instanceof Float) {
                    c923980a9U.LIZ = (Float) obj;
                }
                try {
                    obj2 = bundle.get(c1300610jwx2.LIZ);
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    obj2 = null;
                } catch (OutOfMemoryError e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    obj2 = null;
                }
                if (obj2 instanceof Float) {
                    c923980a9U.LIZIZ = (Float) obj2;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getAndUpdateDeviceScore overallScore=");
                sbLIZ.append(c923980a9U.LIZ);
                sbLIZ.append(", recordScore=");
                sbLIZ.append(c923980a9U.LIZIZ);
                C20441214yg.LJIIIZ("LiveStreamTag", C2188811AlT.LIZIZ(sbLIZ));
                AbstractC1273900jFs abstractC1273900jFs = this.LJI;
                if (abstractC1273900jFs != null) {
                    abstractC1273900jFs.LLLIIIIL(c923980a9U);
                }
            }
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        LiveAdmNsTypeSetting liveAdmNsTypeSetting = LiveAdmNsTypeSetting.INSTANCE;
        int admNsType = liveAdmNsTypeSetting.getAdmNsType();
        if (admNsType != 3) {
            if (admNsType == 4) {
                TEBundle tEBundle = new TEBundle();
                C1274200jGM.LIZJ = 4;
                if (new C0VSJ(C771370UNr.LIZLLL(C1274200jGM.LIZ(""))).exists()) {
                    C0UNC.LIZ();
                    C0UND.LIZ("#NsModelDownloaded", "livecore load");
                    C1274200jGM.LIZIZ(tEBundle);
                    AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
                    if (abstractC1273900jFs2 != null) {
                        abstractC1273900jFs2.LJJLIIJ(tEBundle);
                    }
                } else {
                    C1274200jGM.LIZIZ = this.LJI;
                    C207232167i.LIZIZ(C1274200jGM.LIZ(liveAdmNsTypeSetting.getAdmNsUrl()), new AwS599S0100000_20(tEBundle, 12));
                }
            }
        } else {
            TEBundle tEBundle2 = new TEBundle();
            if (new C0VSJ(C771370UNr.LIZLLL(C1274200jGM.LIZ(""))).exists()) {
                C0UNC.LIZ();
                C0UND.LIZ("#NsModelDownloaded", "livecore load");
                C1274200jGM.LIZIZ(tEBundle2);
                AbstractC1273900jFs abstractC1273900jFs3 = this.LJI;
                if (abstractC1273900jFs3 != null) {
                    abstractC1273900jFs3.LJJLIIJ(tEBundle2);
                }
            } else {
                C1274200jGM.LIZIZ = this.LJI;
                C207232167i.LIZIZ(C1274200jGM.LIZ(liveAdmNsTypeSetting.getAdmNsUrl()), new AwS599S0100000_20(tEBundle2, 12));
            }
        }
        if (new C0VSJ(C771370UNr.LIZLLL(C1274210jGN.LIZ())).exists()) {
            C0UNC.LIZ();
            C0UND.LIZ("#AudioMetricModelDownloaded", "livecore load");
            AbstractC1273900jFs abstractC1273900jFs4 = this.LJI;
            if (abstractC1273900jFs4 != null && (audioDeviceModuleLJLLI = abstractC1273900jFs4.LJLLI()) != null) {
                audioDeviceModuleLJLLI.setDiagnosisModelPath(C771370UNr.LIZLLL(C1274210jGN.LIZ()));
            }
        } else {
            C1274210jGN.LIZ = this.LJI;
            C207209166l c207209166lLIZ = C1274210jGN.LIZ();
            C207232167i.LIZIZ(c207209166lLIZ, new AwS599S0100000_20(c207209166lLIZ, 10));
        }
        if (LyraxMediaPlayerSettings.INSTANCE.enabled()) {
            ?? r1 = new InterfaceC1266890j4Z() { // from class: X.0j5g
                @Override // X.InterfaceC1266890j4Z
                public final C1484780ok0 LIZ() {
                    return new C1484780ok0();
                }
            };
            AbstractC1273900jFs abstractC1273900jFs5 = this.LJI;
            if (abstractC1273900jFs5 != 0) {
                abstractC1273900jFs5.LLLJ(r1);
            }
        }
        if (!this.LIZ.LJJJJI) {
            C465520INi.LIZ.MG(this.LJJII);
        }
        if (this.LJJIII) {
            if (this.LIZ.LIZJ == 2 && BroadcastGameLiveAdaptiveSwitcherSetting.INSTANCE.enable()) {
                C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 23);
                c1276840jKc.getClass();
                C1276840jKc.LJJJLIIL = awS556S0100000_12;
            }
        } else if (BroadcastGameLiveAdaptiveSwitcherSetting.INSTANCE.enable() && this.LIZ.LIZJ == 2) {
            C1276840jKc c1276840jKc2 = C1276840jKc.LIZ;
            AwS556S0100000_12 awS556S0100000_122 = new AwS556S0100000_12(this, 24);
            c1276840jKc2.getClass();
            C1276840jKc.LJJJLIIL = awS556S0100000_122;
        }
        AVLog.w("LiveStream", "[ZGX]getting effect manager");
        EffectManager effectManagerLLJILJILJ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[ZGX]got effect manager:");
        sbLIZ2.append(effectManagerLLJILJILJ);
        AVLog.w("LiveStream", C2188811AlT.LIZIZ(sbLIZ2));
        AlgorithmModelResourceFinder.Companion.getClass();
        String strLIZ = C20007013Pw.LIZ(null, "matting/tt_matting");
        String path = UriProtector.parse(strLIZ).getPath();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[ZGX]got model uri:");
        sbLIZ3.append(strLIZ);
        sbLIZ3.append(", path:");
        sbLIZ3.append(path);
        AVLog.w("LiveStream", C2188811AlT.LIZIZ(sbLIZ3));
        effectManagerLLJILJILJ.fetchEffectList("ttlh_algo_resources", true, new IFetchEffectChannelListener() { // from class: X.0jFy
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[ZGX]fetchEffectList fail, error:");
                sbLIZ4.append(exceptionResult);
                AVLog.e("LiveStream", C2188811AlT.LIZIZ(sbLIZ4));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                Integer numValueOf;
                List<Effect> all_category_effects;
                List<Effect> all_category_effects2;
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[ZGX]fetchEffectList success, size: ");
                if (effectChannelResponse2 != null && (all_category_effects2 = effectChannelResponse2.getAll_category_effects()) != null) {
                    numValueOf = Integer.valueOf(all_category_effects2.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ4.append(numValueOf);
                AVLog.w("LiveStream", C2188811AlT.LIZIZ(sbLIZ4));
                if (effectChannelResponse2 != null && (all_category_effects = effectChannelResponse2.getAll_category_effects()) != null) {
                    for (Effect effect : all_category_effects) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("[ZGX]fetchEffectList success, effect_id: ");
                        sbLIZ5.append(effect.getEffect_id());
                        sbLIZ5.append("unzip_path: ");
                        sbLIZ5.append(effect.getUnzipPath());
                        AVLog.w("LiveStream", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
            }
        });
    }

    public static void LJJ(C1269340j8W c1269340j8W) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ab_label", LJIIZILJ());
            jSONObject.put("app_version", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getVersionName()));
            jSONObject.put("app_channel", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel()));
            c1269340j8W.LJJLIIIJL = C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void A3(C1333220knY c1333220knY) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJJJJZ(c1333220knY);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void C3(SurfaceView surfaceView) {
        AbstractC1273900jFs abstractC1273900jFs;
        if (!TestDisableStreamPreviewSetting.INSTANCE.getValue() && (abstractC1273900jFs = this.LJI) != null) {
            abstractC1273900jFs.LLLIIIL(surfaceView);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void D3(Cert cert) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            InterfaceC774920UaY interfaceC774920UaY = this.LJIIJ;
            if (interfaceC774920UaY != null) {
                interfaceC774920UaY.kn(abstractC1273900jFs, cert);
            }
            abstractC1273900jFs.LLLLJ(cert);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void F3(Boolean bool) {
        C1267500j5Y c1267500j5YLJJIIJZLJL;
        LiveSdkSetting liveSdkSetting;
        TTLHABSettingsConfigs tTLHABSettingsConfigs;
        boolean zBooleanValue = bool.booleanValue();
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (c1267500j5YLJJIIJZLJL = abstractC1273900jFs.LJJIIJZLJL()) != null && (liveSdkSetting = c1267500j5YLJJIIJZLJL.LIZ) != null && (tTLHABSettingsConfigs = liveSdkSetting.ttlhABSettingsConfigs) != null) {
            tTLHABSettingsConfigs.LIZ = zBooleanValue;
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void G3(InterfaceC774920UaY interfaceC774920UaY) {
        C1271010jBD c1271010jBD;
        InterfaceC1266960j4g interfaceC1266960j4g;
        C1269340j8W c1269340j8WLLD;
        C1269340j8W c1269340j8WLLD2;
        this.LJIIJ = interfaceC774920UaY;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (c1269340j8WLLD2 = abstractC1273900jFs.LLD()) != null) {
            c1271010jBD = c1269340j8WLLD2.LJLJI.LJJIIJZLJL;
        } else {
            c1271010jBD = null;
        }
        if (c1271010jBD instanceof C780270UjB) {
            AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
            if (abstractC1273900jFs2 != null && (c1269340j8WLLD = abstractC1273900jFs2.LLD()) != null) {
                interfaceC1266960j4g = c1269340j8WLLD.LJLJI.LJJIIJZLJL;
            } else {
                interfaceC1266960j4g = null;
            }
            ((C780270UjB) interfaceC1266960j4g).LIZLLL = interfaceC774920UaY;
        }
        if (this.LJIIJ != null) {
            AbstractC1273900jFs abstractC1273900jFs3 = this.LJI;
            if (abstractC1273900jFs3 != null) {
                abstractC1273900jFs3.LLJJL(this.LJIIJJI);
                return;
            }
            return;
        }
        AbstractC1273900jFs abstractC1273900jFs4 = this.LJI;
        if (abstractC1273900jFs4 == null) {
            return;
        }
        abstractC1273900jFs4.LLJJL(null);
    }

    @Override // X.InterfaceC769940UIe
    public final void H3(float f) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLLIIL(f);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void I3(List<String> list) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.stop();
        }
        if (((ArrayList) list).size() <= 0) {
            LJJI(this.LIZ.LIZIZ, true);
            return;
        }
        AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
        if (abstractC1273900jFs2 != null) {
            abstractC1273900jFs2.k3(list);
        }
    }

    @Override // X.InterfaceC775610Ubf
    public final void LIZLLL(boolean z) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJLJJLL(z);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void LJFF(C0UHL c0uhl) {
        this.LIZLLL = c0uhl;
    }

    @Override // X.InterfaceC769940UIe
    public final void LJIIIZ(float f) {
        Integer numValueOf;
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (interfaceC1268690j7TLJIJJLI = abstractC1273900jFs.LJIJJLI()) != null) {
            numValueOf = Integer.valueOf(interfaceC1268690j7TLJIJJLI.LJIIIZ(f));
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExposureCompensation result: ");
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("Exposure", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC775610Ubf
    public final void LJIIJ(C774520UZu c774520UZu) {
        this.LJFF = c774520UZu;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.C1269340j8W r8) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1273890jFr.LJIILIIL(X.0j8W):void");
    }

    @Override // X.InterfaceC769940UIe
    public final void LJIILJJIL(InterfaceC775290Ub9 interfaceC775290Ub9) {
        this.LIZJ = interfaceC775290Ub9;
    }

    @Override // X.InterfaceC769940UIe
    public final void LJIILL(Cert cert) {
        C20441214yg.LIZIZ("LiveStream", "pause");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LJIIIZ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.pause();
        }
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLFFI(cert, true);
        }
        AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
        if (abstractC1273900jFs2 != null) {
            abstractC1273900jFs2.LLJJJIL(cert);
        }
        InterfaceC1274020jG4 interfaceC1274020jG4 = this.LJJIFFI;
        if (interfaceC1274020jG4 != null) {
            interfaceC1274020jG4.onPause();
        }
        C0UYQ.LIZ.stop();
    }

    @Override // X.InterfaceC769940UIe
    public final void LJIJI(C0UHD c0uhd) {
        AbstractC1273900jFs abstractC1273900jFs;
        if (c0uhd != null && (abstractC1273900jFs = this.LJI) != null) {
            abstractC1273900jFs.LJJLJ(c0uhd);
        }
    }

    public final void LJIJJLI(List<? extends LyraxTranscoderFeature> list) {
        Integer numValueOf;
        AbstractC1273900jFs abstractC1273900jFs;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFeatures size=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("LiveStreamTag", C2188811AlT.LIZIZ(sbLIZ));
        if (list != null && !list.isEmpty() && (abstractC1273900jFs = this.LJI) != null) {
            abstractC1273900jFs.LLLIL(list);
        }
    }

    public final void LJIL(long j) {
        InterfaceC1276380jJs interfaceC1276380jJs = this.LJIIIZ;
        if (interfaceC1276380jJs == null) {
            TimeUtils.setLocalTimeGapWithServer((int) j);
        } else {
            interfaceC1276380jJs.LJJIZ((int) j);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void M3(InterfaceC1274020jG4 interfaceC1274020jG4) {
        this.LJJIFFI = interfaceC1274020jG4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0jBX] */
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
    @Override // X.InterfaceC769940UIe
    public final int N3(float f) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != 0) {
            return abstractC1273900jFs.LLLLLZIL(f, new InterfaceC2254701DMu() { // from class: X.0jBX
                @Override // X.InterfaceC2254701DMu
                public final void LIZJ(int i, boolean z, boolean z2, float f2, List<Integer> list) {
                }

                @Override // X.InterfaceC2254701DMu
                public final void LIZLLL(float f2, int i, boolean z) {
                }

                @Override // X.InterfaceC2254701DMu
                public final boolean LJII() {
                    return false;
                }
            });
        }
        return -1;
    }

    @Override // X.InterfaceC769940UIe
    public final void O3(Boolean bool) {
        if (this.LJI != null) {
            Intrinsics.LJFF(bool, Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void Q3(Cert cert) {
        C20441214yg.LIZIZ("LiveStream", "stopVideoCapture");
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLLLILLIL(cert);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void k3(List<String> list) {
        LJJIFFI(list, true);
    }

    @Override // X.InterfaceC769940UIe
    public final void l3(Cert cert) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLLJI(cert);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void o3(AwS591S0100000_12 awS591S0100000_12) {
        this.LJIILIIL = awS591S0100000_12;
    }

    @Override // X.InterfaceC769940UIe
    public final void p3(Cert cert) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLLLILLIL(cert);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void r3(Cert cert) {
        C1269340j8W c1269340j8WLLD;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        int i = 1;
        if (abstractC1273900jFs != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null && c1269340j8WLLD.LJJII() == 1) {
            i = 2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchVideoCapture: videoCapture: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
        if (abstractC1273900jFs2 != null) {
            abstractC1273900jFs2.LLLLLJIL(i, cert);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void release(Cert cert) {
        C1271010jBD c1271010jBD;
        AbstractC1273900jFs abstractC1273900jFs;
        InterfaceC1266960j4g interfaceC1266960j4g;
        C1269340j8W c1269340j8WLLD;
        C1269340j8W c1269340j8WLLD2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveStream.release  ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LJ("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(RestartLiveChannel.class), Boolean.TRUE)) {
            return;
        }
        C1274850jHP c1274850jHP = this.LJII;
        if (c1274850jHP != null) {
            synchronized (c1274850jHP) {
                if (!c1274850jHP.LJFF) {
                    c1274850jHP.LJFF = true;
                    c1274850jHP.LJIL();
                    C1271090jBL c1271090jBL = c1274850jHP.LJII;
                    if (c1271090jBL != null) {
                        c1271090jBL.LJ();
                    }
                    C1274690jH9.LJFF(new ARunnableS120S0100000_20(c1274850jHP, 289));
                    C1274690jH9.LIZ();
                }
            }
        }
        AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
        if (abstractC1273900jFs2 != null && (c1269340j8WLLD2 = abstractC1273900jFs2.LLD()) != null) {
            c1271010jBD = c1269340j8WLLD2.LJLJI.LJJIIJZLJL;
        } else {
            c1271010jBD = null;
        }
        if (c1271010jBD instanceof C780270UjB) {
            AbstractC1273900jFs abstractC1273900jFs3 = this.LJI;
            if (abstractC1273900jFs3 != null && (c1269340j8WLLD = abstractC1273900jFs3.LLD()) != null) {
                interfaceC1266960j4g = c1269340j8WLLD.LJLJI.LJJIIJZLJL;
            } else {
                interfaceC1266960j4g = null;
            }
            ((C780270UjB) interfaceC1266960j4g).LIZLLL = null;
        }
        AbstractC1273900jFs abstractC1273900jFs4 = this.LJI;
        if (abstractC1273900jFs4 != null) {
            abstractC1273900jFs4.LJJIIZ(true, false);
        }
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
            if (this.LIZ.LIZJ != 2 && (abstractC1273900jFs = this.LJI) != null) {
                abstractC1273900jFs.LJJIIZ(false, false);
            }
        } else {
            AbstractC1273900jFs abstractC1273900jFs5 = this.LJI;
            if (abstractC1273900jFs5 != null) {
                abstractC1273900jFs5.LJJIIZ(false, false);
            }
        }
        C1274210jGN.LIZ = null;
        C0UYQ.LIZ.stop();
        InterfaceC1274020jG4 interfaceC1274020jG4 = this.LJJIFFI;
        if (interfaceC1274020jG4 != null) {
            interfaceC1274020jG4.onRelease();
        }
        AbstractC1273900jFs abstractC1273900jFs6 = this.LJI;
        if (abstractC1273900jFs6 != null) {
            abstractC1273900jFs6.LLJJL(null);
        }
        AbstractC1273900jFs abstractC1273900jFs7 = this.LJI;
        if (abstractC1273900jFs7 != null) {
            abstractC1273900jFs7.stop();
        }
        AbstractC1273900jFs abstractC1273900jFs8 = this.LJI;
        if (abstractC1273900jFs8 != null) {
            abstractC1273900jFs8.LLJLILLLLZIIL(cert);
        }
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        AbstractC1273900jFs abstractC1273900jFs9 = this.LJI;
        if (abstractC1273900jFs9 != null) {
            abstractC1273900jFs9.LJIILJJIL(null);
        }
        AbstractC1273900jFs abstractC1273900jFs10 = this.LJI;
        if (abstractC1273900jFs10 != null) {
            abstractC1273900jFs10.LJFF(null);
        }
        this.LJI = null;
        this.LJIJ.removeCallbacksAndMessages(null);
        this.LJIIJ = null;
        this.LJFF = null;
        ((C11NJ) this.LJIJJLI.getValue()).LJ();
        this.LIZ.LIZ = null;
    }

    @Override // X.InterfaceC769940UIe
    public final void s3(boolean z) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJJIIJ(!z, true);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void setDisplayView(View view) {
        View viewLJZL;
        AbstractC1273900jFs abstractC1273900jFs;
        if (TestDisableStreamPreviewSetting.INSTANCE.getValue()) {
            return;
        }
        AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
        if (abstractC1273900jFs2 != null) {
            viewLJZL = abstractC1273900jFs2.LJZL();
        } else {
            viewLJZL = null;
        }
        if (!Intrinsics.LJFF(viewLJZL, view) && (abstractC1273900jFs = this.LJI) != null) {
            abstractC1273900jFs.LLLIIIL(view);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void setEnableFixedSize(boolean z) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLIILIL(z);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void start(String str) {
        LJJI(str, true);
    }

    @Override // X.InterfaceC769940UIe
    public final void t3(Cert cert) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLLLIL(cert);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void u3(float f) {
        AudioDeviceModule audioDeviceModuleLJLLI;
        AudioDeviceModule audioDeviceModuleLJLLI2;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (f == 0.0f) {
            AbstractC1273900jFs abstractC1273900jFs = this.LJI;
            if (abstractC1273900jFs != null && (audioDeviceModuleLJLLI2 = abstractC1273900jFs.LJLLI()) != null) {
                audioDeviceModuleLJLLI2.setAudioCaptureMute(true);
                return;
            }
            return;
        }
        AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
        if (abstractC1273900jFs2 != null && (audioDeviceModuleLJLLI = abstractC1273900jFs2.LJLLI()) != null) {
            audioDeviceModuleLJLLI.setAudioCaptureMute(false);
        }
        AbstractC1273900jFs abstractC1273900jFs3 = this.LJI;
        if (abstractC1273900jFs3 == null) {
            return;
        }
        abstractC1273900jFs3.LLLLIILL(f);
    }

    @Override // X.InterfaceC769940UIe
    public final void v3(AwS556S0100000_12 awS556S0100000_12) {
        this.LJIIL = awS556S0100000_12;
    }

    @Override // X.InterfaceC769940UIe
    public final void w3(C1333220knY c1333220knY) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLJLL(c1333220knY);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void y3(C0UHD c0uhd) {
        AbstractC1273900jFs abstractC1273900jFs;
        if (c0uhd != null && (abstractC1273900jFs = this.LJI) != null) {
            abstractC1273900jFs.LLJZ(c0uhd);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void z3(Cert cert) {
        AbstractC1273900jFs abstractC1273900jFs;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startVideoCapture ");
        TestDisableCameraCaptureSetting testDisableCameraCaptureSetting = TestDisableCameraCaptureSetting.INSTANCE;
        sbLIZ.append(testDisableCameraCaptureSetting.getValue());
        sbLIZ.append(",  ");
        sbLIZ.append(this.LJI);
        C20441214yg.LIZIZ("LiveStream.kt", C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LIZIZ("LiveStream", "startVideoCapture");
        if (!testDisableCameraCaptureSetting.getValue() && (abstractC1273900jFs = this.LJI) != null) {
            abstractC1273900jFs.LLLLJI(cert);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void B3(Bundle bundle, InterfaceC1272960jEM interfaceC1272960jEM) {
        InterfaceC1272980jEO interfaceC1272980jEOLLFF;
        int[] iArr;
        float f;
        float f2;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (interfaceC1272980jEOLLFF = abstractC1273900jFs.LLFF()) != null) {
            float f3 = bundle.getFloat("x", 0.0f);
            float f4 = bundle.getFloat("y", 0.0f);
            float f5 = bundle.getFloat("w", 0.0f);
            float f6 = bundle.getFloat("h", 0.0f);
            C1272880jEE c1272880jEE = ((ViewOnTouchListenerC1268840j7i) interfaceC1272980jEOLLFF).LLILLJJLI;
            if (c1272880jEE != null) {
                c1272880jEE.LLLLLJIL = interfaceC1272960jEM;
                if (f3 >= 0.0f && f4 >= 0.0f && f6 >= 0.0f && f5 >= 0.0f) {
                    if (f3 + f5 <= 1.0d && f4 + f6 <= 1.0d) {
                        f2 = f6;
                        f = f5;
                    } else {
                        f = 1.0f - f3;
                        f2 = 1.0f - f4;
                    }
                    float f7 = c1272880jEE.LLLJ;
                    int i = c1272880jEE.LLLJIL;
                    iArr = new int[]{(int) (f3 * f7), (int) (((1.0d - ((double) f4)) - ((double) f2)) * ((double) i)), (int) (f * f7), (int) (f2 * i)};
                } else {
                    iArr = null;
                }
                c1272880jEE.LLLLLILLIL = iArr;
                if (iArr == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("data is invalid x:");
                    sbLIZ.append(f3);
                    sbLIZ.append(" y:");
                    sbLIZ.append(f4);
                    sbLIZ.append(" w:");
                    sbLIZ.append(f5);
                    sbLIZ.append(" h:");
                    sbLIZ.append(f6);
                    new Exception(C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC1272960jEM.LIZJ();
                }
            }
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void J3(Cert cert, boolean z) {
        C20441214yg.LIZIZ("LiveStream", "resume");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LJIIIZ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.resume();
        }
        if (!z) {
            AbstractC1273900jFs abstractC1273900jFs = this.LJI;
            if (abstractC1273900jFs != null) {
                abstractC1273900jFs.LLLFF(cert);
            }
            AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
            if (abstractC1273900jFs2 != null) {
                abstractC1273900jFs2.LLLFFI(cert, this.LJIILL);
            }
        }
        InterfaceC1274020jG4 interfaceC1274020jG4 = this.LJJIFFI;
        if (interfaceC1274020jG4 != null) {
            interfaceC1274020jG4.onResume();
        }
        this.LJIJ.removeCallbacks(this.LJIJI);
    }

    @Override // X.InterfaceC769940UIe
    public final void L3(int i, Cert cert) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchVideoCapture: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLLLJIL(i, cert);
        }
    }

    @Override // X.InterfaceC775610Ubf
    public final void LJI(int i, int i2) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJLJJL(i, i2);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void LJIIIIZZ(Cert cert, boolean z) {
        this.LJIILL = z;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLFFI(cert, z);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void LJIJ(Bundle bundle, C0UH1 c0uh1) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJIJ(bundle, c0uh1);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0jBH] */
    public final void LJIJJ(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        final C780270UjB c780270UjB = new C780270UjB(this.LIZ);
        final ?? r5 = new C1268490j79() { // from class: X.0jBH
            @Override // X.C1268490j79
            public final void LIZ(String str3, JSONObject jSONObject) {
                try {
                    c780270UjB.LIZ(str3, jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // X.C1268490j79
            public final void LIZIZ(String str3, String str4) {
                C20441214yg.LJIIIZ(str3, str4);
            }
        };
        if (C1276090jJP.LIZ()) {
            AugurOption augurOption = new AugurOption();
            augurOption.appId = str;
            augurOption.configJson = str2;
            String str3 = C1276090jJP.LJFF.LJ;
            if (TextUtils.equals(str3, "video")) {
                augurOption.liveType = LyraxLiveType.VIDEO;
                augurOption.scene = LyraxScene.LIVE;
            } else if (TextUtils.equals(str3, "game")) {
                augurOption.liveType = LyraxLiveType.GAME;
                augurOption.scene = LyraxScene.LIVE;
            } else {
                augurOption.liveType = LyraxLiveType.VIDEO;
                augurOption.scene = LyraxScene.LINKMIC;
            }
            try {
                JSONObject jSONObjectOptJSONObject2 = new JSONObject(str2).optJSONObject("ttlh_adaptive_config");
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("config_migration_option")) != null) {
                    C1276090jJP.LJ = jSONObjectOptJSONObject.optBoolean("enable_solution_migration", false);
                    if (C1276090jJP.LJ) {
                        augurOption.configMigrationConfig.enableSolutionMigration = C1276090jJP.LJ;
                        augurOption.configMigrationConfig.enableSolutionDIDMigration = jSONObjectOptJSONObject.optBoolean("enable_solution_did_config_migration", false);
                        augurOption.configMigrationConfig.enableSolutionVVConfigMigration = jSONObjectOptJSONObject.optBoolean("enable_solution_vv_config_migration", false);
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.logKibana(5, "LyraxContextWrapper", "json parse error", null);
            }
            augurOption.appLogHandler = new LyraxAppLogHandler() { // from class: X.0j78
                @Override // com.ss.lyrax.engine.LyraxAppLogHandler
                public final void onEvent(String str4, String str5) {
                    try {
                        JSONObject jSONObject = new JSONObject(str5);
                        C1269160j8E c1269160j8E = C1276090jJP.LJIIIIZZ;
                        if (c1269160j8E != null && !TextUtils.isEmpty(c1269160j8E.LJJJJZ)) {
                            jSONObject.put("room_id", C1276090jJP.LJIIIIZZ.LJJJJZ);
                        }
                        C1269160j8E c1269160j8E2 = C1276090jJP.LJIIIIZZ;
                        if (c1269160j8E2 != null && c1269160j8E2.LJJII() == 3) {
                            jSONObject.put(Scene.SCENE_SERVICE, EnumC1268000j6M.GAME_LIVE.getName());
                        }
                        jSONObject.put("tag", "augur_app_log");
                        C1268490j79 c1268490j79 = r5;
                        if (c1268490j79 != null) {
                            c1268490j79.LIZ(str4, jSONObject);
                        }
                        AVLog.logKibana(5, "augur_event", C786410Ut5.J3(jSONObject), null);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }

                @Override // com.ss.lyrax.engine.LyraxAppLogHandler
                public final void onLog(String str4, String str5) {
                    C1268490j79 c1268490j79 = r5;
                    if (c1268490j79 != null) {
                        c1268490j79.LIZIZ(str4, str5);
                    }
                }
            };
            AugurConfigRequester augurConfigRequester = C1276090jJP.LIZ.get();
            if (augurConfigRequester != null) {
                augurOption.configRequesterHandle = augurConfigRequester.getNativePtr();
            }
            AugurAdaptiveWrapper.init(augurOption);
        }
    }

    public final void LJJI(String str, boolean z) {
        if (TestDisablePushStreamSetting.INSTANCE.getValue()) {
            return;
        }
        if (str == null || str.length() == 0) {
            str = this.LIZ.LIZIZ;
        }
        InterfaceC774920UaY interfaceC774920UaY = this.LJIIJ;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.bz();
        }
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLLILI(str, z);
        }
        InterfaceC1274020jG4 interfaceC1274020jG4 = this.LJJIFFI;
        if (interfaceC1274020jG4 != null) {
            interfaceC1274020jG4.onStart();
        }
        C786410Ut5.LJLIIL(3000L, this.LJIJ, this.LJIJJ);
    }

    public final void LJJIFFI(List<String> list, boolean z) {
        if (TestDisablePushStreamSetting.INSTANCE.getValue()) {
            return;
        }
        if (list != null && list.size() > 0) {
            InterfaceC774920UaY interfaceC774920UaY = this.LJIIJ;
            if (interfaceC774920UaY != null) {
                interfaceC774920UaY.bz();
            }
            AbstractC1273900jFs abstractC1273900jFs = this.LJI;
            if (abstractC1273900jFs != null) {
                abstractC1273900jFs.LLLLIL(list, z, false);
            }
            InterfaceC1274020jG4 interfaceC1274020jG4 = this.LJJIFFI;
            if (interfaceC1274020jG4 != null) {
                interfaceC1274020jG4.onStart();
            }
            C786410Ut5.LJLIIL(3000L, this.LJIJ, this.LJIJJ);
            return;
        }
        LJJI(this.LIZ.LIZIZ, true);
    }

    @Override // X.InterfaceC769940UIe
    public final void P3(Cert cert, boolean z) {
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        InterfaceC1276380jJs interfaceC1276380jJs;
        if (LinkMicCohostResumeClientFix.INSTANCE.enable() && (interfaceC1276380jJs = this.LJIIIZ) != null) {
            interfaceC1276380jJs.resume();
        }
        AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
        if (abstractC1273900jFs2 != null && (c1269340j8WLLD = abstractC1273900jFs2.LLD()) != null) {
            c1269340j8WLLD.LIZ.mPushBase.LJIIJ = 2;
        }
        if (!z && (abstractC1273900jFs = this.LJI) != null) {
            abstractC1273900jFs.LLLFF(cert);
        }
        AbstractC1273900jFs abstractC1273900jFs3 = this.LJI;
        if (abstractC1273900jFs3 != null) {
            abstractC1273900jFs3.LLLFFI(cert, this.LJIILL);
        }
        this.LJIJ.removeCallbacks(this.LJIJI);
        InterfaceC1274020jG4 interfaceC1274020jG4 = this.LJJIFFI;
        if (interfaceC1274020jG4 != null) {
            interfaceC1274020jG4.onResume();
        }
        getClass();
        InterfaceC774920UaY interfaceC774920UaY = this.LJIIJ;
        if (interfaceC774920UaY != null) {
            interfaceC774920UaY.Xz(this.LJI, cert);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final C1274030jG5 i3(C1275030jHh c1275030jHh, InterfaceC775310UbB interfaceC775310UbB) {
        C1274030jG5 c1274030jG5LJI;
        InterfaceC1276380jJs interfaceC1276380jJs;
        Integer numValueOf;
        InterfaceC1276380jJs interfaceC1276380jJs2;
        c1275030jHh.LJII = C781270Ukn.LJIIJJI().getChannel();
        c1275030jHh.LJI = C781270Ukn.LJIIJJI().getServerDeviceId();
        c1275030jHh.LJIIIIZZ = String.valueOf(C781270Ukn.LJIIJJI().appId());
        if (C504670Jqj.LIZIZ(c1275030jHh.LJIIIZ)) {
            c1275030jHh.LJIIIZ = C781270Ukn.LJIIJJI().getVersionCode();
        }
        if (this.LJII == null) {
            synchronized (C1273890jFr.class) {
                try {
                    if (this.LJII == null) {
                        this.LJII = new C1274850jHP(this.LJI);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c1275030jHh.LJJJJ = RemoteVideoFrozenSetting.INSTANCE.getValue();
        C1274850jHP c1274850jHP = this.LJII;
        Integer numValueOf2 = null;
        if (c1274850jHP != null) {
            c1274030jG5LJI = c1274850jHP.LJI(c1275030jHh);
        } else {
            c1274030jG5LJI = null;
        }
        if (C1267520j5a.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create client ");
            sbLIZ.append(c1275030jHh.LIZLLL);
            sbLIZ.append(" result is ");
            if (c1274030jG5LJI != null) {
                numValueOf = Integer.valueOf(c1274030jG5LJI.LIZIZ);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(" client is ");
            if (c1274030jG5LJI != null) {
                interfaceC1276380jJs2 = c1274030jG5LJI.LIZ;
            } else {
                interfaceC1276380jJs2 = null;
            }
            sbLIZ.append(interfaceC1276380jJs2);
            sbLIZ.append(' ');
            AVLog.logKibana(4, "LiveStreamTag", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        if (c1274030jG5LJI != null) {
            interfaceC1276380jJs = c1274030jG5LJI.LIZ;
        } else {
            interfaceC1276380jJs = null;
        }
        this.LJIIIZ = interfaceC1276380jJs;
        if (interfaceC1276380jJs == null) {
            Throwable th2 = new Throwable();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("create interact client failed for ");
            if (c1274030jG5LJI != null) {
                numValueOf2 = Integer.valueOf(c1274030jG5LJI.LIZIZ);
            }
            sbLIZ2.append(numValueOf2);
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), th2);
        }
        this.LJ = interfaceC775310UbB;
        if (LinkMicGLThreadCreateFailedOptimize.INSTANCE.enable() && this.LJIIIIZZ && c1274030jG5LJI != null) {
            c1274030jG5LJI.LIZIZ = 9;
        }
        return c1274030jG5LJI;
    }

    @Override // X.InterfaceC769940UIe
    public final void m3(Bundle bundle, C1152850g6d c1152850g6d) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJJLIIIJJIZ(bundle, c1152850g6d);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final void n3(Bitmap bitmap, Cert cert) {
        C1269340j8W c1269340j8WLLD;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLLFFI(cert, true);
        }
        AbstractC1273900jFs abstractC1273900jFs2 = this.LJI;
        if (abstractC1273900jFs2 != null) {
            abstractC1273900jFs2.LJJIJLIJ(bitmap);
        }
        AbstractC1273900jFs abstractC1273900jFs3 = this.LJI;
        if (abstractC1273900jFs3 != null && (c1269340j8WLLD = abstractC1273900jFs3.LLD()) != null) {
            c1269340j8WLLD.LIZ.mPushBase.LJIIJ = 3;
        }
        InterfaceC1274020jG4 interfaceC1274020jG4 = this.LJJIFFI;
        if (interfaceC1274020jG4 != null) {
            interfaceC1274020jG4.onPause();
        }
        C0UYQ.LIZ.stop();
        AbstractC1273900jFs abstractC1273900jFs4 = this.LJI;
        if (abstractC1273900jFs4 != null) {
            abstractC1273900jFs4.LLJJJIL(cert);
        }
        getClass();
    }

    @Override // X.InterfaceC769940UIe, X.InterfaceC768780UDs
    public final boolean LIZ(String str, String str2, JSONObject jSONObject, boolean z) {
        C0UUZ.LIZ(jSONObject);
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && abstractC1273900jFs.LJJIZ(str, false, z, str2, 1, jSONObject) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC769940UIe
    public final void j3(int i, int i2, int i3, int i4) {
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (interfaceC1268690j7TLJIJJLI = abstractC1273900jFs.LJIJJLI()) != null) {
            interfaceC1268690j7TLJIJJLI.j3(i, i2, i3, i4);
        }
    }

    @Override // X.InterfaceC769940UIe
    public final boolean x3(String str, JSONObject jSONObject, int i, boolean z, String str2) {
        C0UUZ.LIZ(jSONObject);
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && abstractC1273900jFs.LJJJJZI(str, false, z, str2, i, jSONObject) == 0) {
            return true;
        }
        return false;
    }
}
