package X;

import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.broadcast.api.PauseTimeLongChannel;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.api.GameDualDeviceApi;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceRtcParamsSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743070TCv implements InterfaceC754220TiG {
    public static final String LLJJL;
    public final DataChannel LL;
    public final Room LLILLJJLI;
    public final C774940Uaa LLILLL;
    public final GameBroadcastFragment LLILZ;
    public C1276370jJr LLILZIL;
    public final C0TCQ LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C743090TCx LLJ;
    public final C0TCS LLJI;
    public final C11PQ<Integer> LLJIJIL;
    public C2499609qs LLJILJIL;
    public C1276570jKB LLJILJILJ;
    public C0TCU LLJILLL;
    public final C01GW LLJJ;
    public InterfaceC420801kM LLJJI;
    public final C11NJ LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public double LLJJJIL;
    public boolean LLJJJJ;
    public C11JF LLJJJJJIL;
    public InterfaceC420801kM LLJJJJLIIL;

    public final void LIZIZ() {
        StreamUrl streamUrl;
        StreamUrl streamUrl2;
        StreamUrl streamUrl3;
        if (this.LLILZIL != null || this.LLILLL.LLILZ == null) {
            return;
        }
        LJFF(this, Intrinsics.LJFF(C0TDF.LIZLLL().LIZJ.LJLZ(), Boolean.FALSE));
        String str = LLJJL;
        C20441214yg.LJIIIZ(str, "init rtc engine");
        if (this.LLJ == null) {
            C742860TCa.LIZ(Long.valueOf(LIZ()), "rtcParams is null");
            C20441214yg.LJIIIZ(str, "rtcParams is null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initRtcEngine() rtcRoomId = ");
        C743090TCx c743090TCx = this.LLJ;
        sbLIZ.append(c743090TCx != null ? c743090TCx.LIZ : null);
        sbLIZ.append(",rtcToken = ");
        C743090TCx c743090TCx2 = this.LLJ;
        sbLIZ.append(c743090TCx2 != null ? c743090TCx2.LIZIZ : null);
        sbLIZ.append(",rtcUserId = ");
        C743090TCx c743090TCx3 = this.LLJ;
        sbLIZ.append(c743090TCx3 != null ? c743090TCx3.LIZJ : null);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C743090TCx c743090TCx4 = this.LLJ;
        if (c743090TCx4 == null) {
            C20441214yg.LJIIIZ(str, "init rtc engine failed");
            return;
        }
        String str2 = c743090TCx4.LIZ;
        String str3 = c743090TCx4.LIZJ;
        str2.getClass();
        str3.toString();
        C1276570jKB c1276570jKB = new C1276570jKB(str3);
        c1276570jKB.LLILZIL = this.LLILLL.LLJJI;
        if (LIZJ()) {
            double d = this.LLJJJIL;
            if (d > 0.0d) {
                c1276570jKB.LLILZ = d;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("it.isLandscape = ");
        sbLIZ2.append(c1276570jKB.LLILZIL);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
        this.LLJILJILJ = c1276570jKB;
        Room room = this.LLILLJJLI;
        String strLIZLLL = (room == null || (streamUrl3 = room.getStreamUrl()) == null) ? null : streamUrl3.LIZLLL();
        Room room2 = this.LLILLJJLI;
        C0TD4 c0td4 = new C0TD4(strLIZLLL, this.LLJILJILJ, (room2 == null || (streamUrl2 = room2.getStreamUrl()) == null) ? null : streamUrl2.pushUrlList);
        C776350Ucr c776350Ucr = new C776350Ucr(this);
        Room room3 = this.LLILLJJLI;
        C0TD5 c0td5 = new C0TD5(true, c0td4, this, c776350Ucr, (room3 == null || (streamUrl = room3.getStreamUrl()) == null) ? null : streamUrl.pushUrlList);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("rtcClientData = ");
        sbLIZ3.append(c0td5);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ3));
        Room room4 = this.LLILLJJLI;
        if (room4 != null) {
            C1276370jJr c1276370jJr = new C1276370jJr(room4, true, c0td5);
            int i = this.LLJJIJIL;
            if (i > 0) {
                c1276370jJr.LJIIJ = i;
            }
            C743540TEq.LJIIJ(0, Long.valueOf(LIZ()), "screen_share");
            this.LLJJJJ = true;
            InterfaceC420801kM interfaceC420801kM = this.LLJJI;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            this.LLJJI = ((C0J1N) c1276370jJr.LJIIJJI.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this.LLILZ))).LIZ(new AfS148S0200000_12(this, room4, 61), new C09JN() { // from class: X.0T6z
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("DualDeviceRtcStrategy@fa1c.initDeviceLinkSession$2$1$2");
                    String str4 = C743070TCv.LLJJL;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("error = ");
                    sbLIZ4.append(Log.getStackTraceString((Throwable) obj));
                    C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ4));
                    C1C7U.LIZIZ("DualDeviceRtcStrategy@fa1c.initDeviceLinkSession$2$1$2");
                }
            });
            this.LLILZIL = c1276370jJr;
        }
        if (LIZJ()) {
            LJIIIZ();
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("dualDeviceLinkSession = ");
        sbLIZ4.append(this.LLILZIL);
        sbLIZ4.append(" dualDeviceLinkSession->initRTC!!!");
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ4));
        C1276370jJr c1276370jJr2 = this.LLILZIL;
        if (c1276370jJr2 != null) {
            c1276370jJr2.LIZJ(c743090TCx4.LIZJ, c743090TCx4.LIZIZ, c743090TCx4.LIZ, null);
        }
    }

    public final void LIZLLL() {
        LJIIIIZZ(this, 4, null, 2);
        LJ();
        C0TCQ c0tcq = this.LLILZLL;
        if (c0tcq != null) {
            c0tcq.LJIIL = null;
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            this.LLJJIII.dispose();
            InterfaceC420801kM interfaceC420801kM = this.LLJJI;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
        }
        C0TCQ c0tcq2 = this.LLILZLL;
        if (c0tcq2 != null) {
            c0tcq2.LIZLLL();
        }
        C2499609qs c2499609qs = this.LLJILJIL;
        if (c2499609qs != null) {
            try {
                Context context = this.LLILZ.getContext();
                if (context != null) {
                    C786410Ut5.LJJIFFI(context, c2499609qs);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String str = LLJJL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unregister receiver exception msg ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
                Throwable th = new Throwable();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("GameDualDeviceStrategy exception:");
                sbLIZ2.append(e.getMessage());
                C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), th);
            }
            this.LLJILJIL = null;
        }
    }

    public final long LIZ() {
        return ((Number) this.LLIZ.getValue()).longValue();
    }

    public final boolean LIZJ() {
        if (GameDualDeviceAdaptiveSetting.INSTANCE.isExperimentGroup()) {
            return ((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue();
        }
        if (!((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue()) {
            return false;
        }
        C774940Uaa c774940Uaa = this.LLILLL;
        return c774940Uaa.LLJILJIL != c774940Uaa.LLJILJILJ;
    }

    public final void LJ() {
        InterfaceC1276380jJs interfaceC1276380jJs;
        C20441214yg.LJIIIZ(LLJJL, "release rtc engine");
        if (GameDualDeviceAdaptiveSetting.INSTANCE.isExperimentGroup()) {
            LJI(false, 1.0d);
        } else {
            LJII();
        }
        C1276370jJr c1276370jJr = this.LLILZIL;
        if (c1276370jJr != null && (interfaceC1276380jJs = c1276370jJr.LJFF) != null) {
            interfaceC1276380jJs.stop();
        }
        this.LLILZIL = null;
    }

    public final void LJII() {
        double d = this.LLJJJIL;
        if (d > 0.0d) {
            this.LLILLL.LJIIIIZZ((float) d);
            LJIIIZ();
            C11JF c11jf = this.LLJJJJJIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLJJJJJIL = (C11JF) C11NZ.LJLJJLL(300L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 267), new C09JN() { // from class: X.0T72
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("DualDeviceRtcStrategy@fa1c.setupTopPosition$2");
                    C20441214yg.LJ(C743070TCv.LLJJL, Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("DualDeviceRtcStrategy@fa1c.setupTopPosition$2");
                }
            });
            String str = LLJJL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setupTopPositiontopPosition =");
            sbLIZ.append(this.LLJJJIL);
            sbLIZ.append(" start()!!");
            C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIIIZ() {
        AbstractC1273900jFs liveCore;
        InterfaceC1274500jGq interfaceC1274500jGqLJJJJJL;
        AbstractC1273900jFs liveCore2;
        InterfaceC1274500jGq interfaceC1274500jGqLJJJJJL2;
        AbstractC1273900jFs liveCore3;
        InterfaceC1274500jGq interfaceC1274500jGqLJJJJJL3;
        Resources resources;
        Configuration configuration;
        if (GameDualDeviceAdaptiveSetting.INSTANCE.isExperimentGroup()) {
            return;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        VideoMixer.VideoMixerDescription videoMixerDescriptionLIZ = null;
        Context context = iHostAppContext != null ? iHostAppContext.context() : null;
        boolean z = (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
        C1276370jJr c1276370jJr = this.LLILZIL;
        if (c1276370jJr != null) {
            C1276570jKB c1276570jKB = this.LLJILJILJ;
            if (c1276570jKB != null) {
                if (z) {
                    c1276570jKB.LLILZLL = 1;
                } else {
                    c1276570jKB.LLILZLL = 2;
                }
            }
            InterfaceC1276380jJs interfaceC1276380jJs = c1276370jJr.LJFF;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.LIZIZ();
            }
        } else {
            InterfaceC769940UIe interfaceC769940UIe = this.LLILLL.LLILZ;
            if (interfaceC769940UIe != null && (liveCore3 = interfaceC769940UIe.getLiveCore()) != null && (interfaceC1274500jGqLJJJJJL3 = liveCore3.LJJJJJL()) != null) {
                videoMixerDescriptionLIZ = interfaceC1274500jGqLJJJJJL3.LIZ();
            }
            if (z) {
                if (videoMixerDescriptionLIZ != null) {
                    videoMixerDescriptionLIZ.setMode(2);
                }
                InterfaceC769940UIe interfaceC769940UIe2 = this.LLILLL.LLILZ;
                if (interfaceC769940UIe2 != null && (liveCore2 = interfaceC769940UIe2.getLiveCore()) != null && (interfaceC1274500jGqLJJJJJL2 = liveCore2.LJJJJJL()) != null) {
                    interfaceC1274500jGqLJJJJJL2.LJIILJJIL(videoMixerDescriptionLIZ);
                }
            } else {
                if (videoMixerDescriptionLIZ != null) {
                    videoMixerDescriptionLIZ.setMode(1);
                }
                InterfaceC769940UIe interfaceC769940UIe3 = this.LLILLL.LLILZ;
                if (interfaceC769940UIe3 != null && (liveCore = interfaceC769940UIe3.getLiveCore()) != null && (interfaceC1274500jGqLJJJJJL = liveCore.LJJJJJL()) != null) {
                    interfaceC1274500jGqLJJJJJL.LJIILJJIL(videoMixerDescriptionLIZ);
                }
            }
        }
        C20441214yg.LJIIIZ(LLJJL, "GameOrientationChangeEvent landscape = " + z);
    }

    @Override // X.InterfaceC754220TiG
    public final InterfaceC1273910jFt getLiveCore() {
        String str = LLJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLiveCore() live core = ");
        InterfaceC769940UIe interfaceC769940UIe = this.LLILLL.LLILZ;
        sbLIZ.append(interfaceC769940UIe != null ? interfaceC769940UIe.getLiveCore() : null);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC769940UIe interfaceC769940UIe2 = this.LLILLL.LLILZ;
        if (interfaceC769940UIe2 != null) {
            return interfaceC769940UIe2.getLiveCore();
        }
        return null;
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SinkStrategy]");
        sbLIZ.append("DualDeviceRtc");
        LLJJL = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(C743070TCv c743070TCv, boolean z) {
        Object objGg0;
        int i;
        DataChannel dataChannel = c743070TCv.LL;
        Object objGg02 = null;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(GameBroadcastStateChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 != C0TD3.STATE_CONNECTED) {
            DataChannel dataChannel2 = c743070TCv.LL;
            if (dataChannel2 != null) {
                objGg02 = dataChannel2.gg0(GameBroadcastStateChannel.class);
            }
            if (objGg02 != C0TD3.STATE_PAUSE) {
                return;
            }
        }
        C480460Ism.LIZ().getClass();
        GameDualDeviceApi gameDualDeviceApi = (GameDualDeviceApi) C480460Ism.LIZLLL(GameDualDeviceApi.class);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        ((C0J1N) gameDualDeviceApi.dualDeviceUpdate(i, c743070TCv.LIZ(), "").LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZLLL(c743070TCv.LLILZ))).LIZ(new C09JN() { // from class: X.0T73
            @Override // X.C09JN
            public final void accept(Object obj) {
                T t;
                C1C7U.LIZ("DualDeviceRtcStrategy@fa1c.report2Server$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (t = baseResponse.data) != null) {
                    String str = C743070TCv.LLJJL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dualDeviceUpdate response = ");
                    sbLIZ.append(t);
                    C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                }
                C1C7U.LIZIZ("DualDeviceRtcStrategy@fa1c.report2Server$1");
            }
        }, new C09JN() { // from class: X.0T70
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceRtcStrategy@fa1c.report2Server$2");
                String str = C743070TCv.LLJJL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error = ");
                sbLIZ.append(obj);
                C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("DualDeviceRtcStrategy@fa1c.report2Server$2");
            }
        });
    }

    public final void LJI(final boolean z, final double d) {
        String str = LLJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set sei top =");
        sbLIZ.append(d);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC420801kM interfaceC420801kM = this.LLJJJJLIIL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJJJJLIIL = ((C0J1N) C11NZ.LJJJJLI(GameDualDeviceRtcParamsSetting.INSTANCE.getConfig().seiTimer, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this.LLILZ))).LIZ(new C09JN() { // from class: X.0UIN
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str2;
                C1C7U.LIZ("DualDeviceRtcStrategy@fa1c.sendSei$1");
                C774940Uaa c774940Uaa = this.LL.LLILLL;
                float f = (float) (d - 0.001d);
                boolean z2 = z;
                InterfaceC769940UIe interfaceC769940UIe = c774940Uaa.LLILZ;
                if (interfaceC769940UIe != null && interfaceC769940UIe.getLiveCore() != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (z2) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    try {
                        jSONObject.put("valid", str2);
                        double d2 = 0.0f;
                        jSONObject.put("top", d2);
                        jSONObject.put("left", d2);
                        jSONObject.put("right", 1.0f);
                        jSONObject.put("bottom", f);
                        PushStreamInfo.Quality qualityLJI = C773730UWt.LJI();
                        Map<String, Object> map = C1338270kvh.LIZ;
                        if (qualityLJI != null && !TextUtils.isEmpty(C773730UWt.LJI().sdkKey)) {
                            jSONObject.put("definition", C773730UWt.LJI().sdkKey);
                        }
                        c774940Uaa.LLILZ.getLiveCore().LJJIZ("dual_device_crop_frame", false, true, "1610665998", 1, jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                }
                C1C7U.LIZIZ("DualDeviceRtcStrategy@fa1c.sendSei$1");
            }
        }, new C09JN() { // from class: X.0T71
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceRtcStrategy@fa1c.sendSei$2");
                C20441214yg.LJ(C743070TCv.LLJJL, Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("DualDeviceRtcStrategy@fa1c.sendSei$2");
            }
        });
    }

    @Override // X.InterfaceC754220TiG
    public final C1274030jG5 i3(C1275030jHh c1275030jHh, InterfaceC775310UbB interfaceC775310UbB) {
        String str = LLJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create InteractConfig liveStream = ");
        sbLIZ.append(this.LLILLL.LLILZ);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC769940UIe interfaceC769940UIe = this.LLILLL.LLILZ;
        if (interfaceC769940UIe != null) {
            return interfaceC769940UIe.i3(c1275030jHh, interfaceC775310UbB);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C743070TCv(com.bytedance.ies.sdk.datachannel.DataChannel r9, com.bytedance.android.livesdkapi.depend.model.live.Room r10, X.C774940Uaa r11, com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C743070TCv.<init>(com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.model.live.Room, X.0Uaa, com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment):void");
    }

    public static void LJIIIIZZ(C743070TCv c743070TCv, Integer num, Integer num2, int i) {
        long j;
        long j2;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        c743070TCv.getClass();
        if (num != null) {
            c743070TCv.LLJI.LIZ = num.intValue();
        }
        if (num2 != null) {
            c743070TCv.LLJI.LJFF = num2.intValue();
        }
        C0TCS c0tcs = c743070TCv.LLJI;
        if (c0tcs.LIZ == 3) {
            DataChannel dataChannel = c743070TCv.LL;
            if (dataChannel == null || (j2 = (Long) dataChannel.gg0(C0TZH.class)) == null) {
                j2 = 0L;
            }
            c0tcs.LIZLLL = j2;
        } else {
            DataChannel dataChannel2 = c743070TCv.LL;
            if (dataChannel2 == null || (j = (Long) dataChannel2.gg0(PauseTimeLongChannel.class)) == null) {
                j = 300L;
            }
            c0tcs.LJ = j;
        }
        C0TCQ c0tcq = c743070TCv.LLILZLL;
        if (c0tcq != null) {
            c0tcq.LJ(c743070TCv.LLJI);
        }
        String str = LLJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send live state = ");
        sbLIZ.append(c743070TCv.LLJI);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }
}
