package X;

import Y.ARunnableS107S0100000_7;
import Y.ARunnableS13S0100100_7;
import Y.ARunnableS86S0000000_7;
import Y.AfS176S0100000_7;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceMultiGuestShareBgChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.room.SeiCacheChannel;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.slide.v1.LiveMtRoomSlideUpGuideSetting;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.AudienceResolutionDegrade;
import com.bytedance.android.livesdk.dataChannel.AudienceShowSwitchDefinitionEvent;
import com.bytedance.android.livesdk.dataChannel.BufferingEvent;
import com.bytedance.android.livesdk.dataChannel.EnterRoomWidgetLoadStatus;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.FirstFrameShowData;
import com.bytedance.android.livesdk.dataChannel.GameLiveAbrNewResolution;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.PreCreateLivePlayerEvent;
import com.bytedance.android.livesdk.dataChannel.StreamInfoEvent;
import com.bytedance.android.livesdk.dataChannel.TopTabPageShowEvent;
import com.bytedance.android.livesdk.livesetting.LiveInteractionMaskConfigSetting;
import com.bytedance.android.livesdk.livesetting.MultiGuestLayoutMonitorSwitchSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBottomBarSlideGuideDelayTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRoomPlayerSeiOptSetting;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFullLinkPerfSendExp;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.AutoReportSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomSuccessMsgOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerPrePullStreamConfigData;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerPrePullStreamSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveKeyApiOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveOptPrecreatePlayerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePullStreamInfoSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveInnerStreamUseSurfaceControlExp;
import com.bytedance.android.livesdk.livesetting.widget.LivePreloadNextRoomWidgetsSetting;
import com.bytedance.android.livesdk.workaround.LiveFixScrollBlackExp;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C464010IHn implements InterfaceC480570Isx {
    public int LIZ;
    public List<C464080IHu> LIZIZ = new ArrayList();
    public int LIZJ = -1;
    public String LIZLLL = "";
    public final /* synthetic */ LivePlayFragment LJ;

    @Override // X.InterfaceC480570Isx
    public final void LIZLLL() {
        DataChannel dataChannel = this.LJ.y;
        if (dataChannel != null) {
            dataChannel.LC0(BufferingEvent.class, Boolean.FALSE);
        }
        if (C0IRS.LIZ) {
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).Ck2();
        }
        C0IX5.LJIIIIZZ(this.LJ.fT());
    }

    @Override // X.InterfaceC480570Isx
    public final void LJI() {
        C468020IWy c468020IWy;
        C0IX6 c0ix6;
        C20441214yg.LIZIZ("LivePlayFragment", "onBufferingStart");
        if (LiveMode.isWatchGameLiveOrPCLive(this.LJ.LLJJ)) {
            LivePlayFragment livePlayFragment = this.LJ;
            if (livePlayFragment.V0 == null) {
                livePlayFragment.V0 = new C464180IIe(livePlayFragment.y);
            }
            C464180IIe c464180IIe = livePlayFragment.V0;
            LivePlayFragment livePlayFragment2 = this.LJ;
            String str = livePlayFragment2.Q0;
            LiveMode liveMode = livePlayFragment2.LLJJ;
            c464180IIe.getClass();
            try {
                if (!LiveMode.isWatchGameLiveOrPCLive(liveMode)) {
                    C20441214yg.LJ("GameLiveAudienceDefinitionHelper", "tryShowGameLiveBufferingTipsV2, not game live, return!");
                } else if (System.currentTimeMillis() - c464180IIe.LIZIZ < 1000) {
                    C20441214yg.LJ("GameLiveAudienceDefinitionHelper", "tryShowGameLiveBufferingTipsV2(). interval less than 1s, return!");
                } else {
                    c464180IIe.LIZIZ = System.currentTimeMillis();
                    if (!ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable()) {
                        C20441214yg.LJ("GameLiveAudienceDefinitionHelper", "tryShowGameLiveBufferingTipsV2, not enable show definition entry, return!");
                    } else if (c464180IIe.LIZLLL) {
                        C20441214yg.LJ("GameLiveAudienceDefinitionHelper", "tryShowGameLiveBufferingTipsV2, had show in this room, return!");
                    } else if (System.currentTimeMillis() - SwitchDefinitionTipsWidget.LLIZ < 10000) {
                        C20441214yg.LJ("GameLiveAudienceDefinitionHelper", "tryShowGameLiveBufferingTipsV2(). last tips show time less than 10s, return!");
                    } else if (C464180IIe.LIZ()) {
                        C20441214yg.LJ("GameLiveAudienceDefinitionHelper", "tryShowGameLiveBufferingTipsV2(). isBeyondTipsCountToday, return!");
                    } else if (((IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class)).NM(str)) {
                        C20441214yg.LJ("GameLiveAudienceDefinitionHelper", "tryShowGameLiveBufferingTipsV2(). current is use auto, return!");
                    } else {
                        boolean zVf1 = ((IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class)).vf1(c464180IIe.LIZ);
                        if (((IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class)).b21() || !zVf1) {
                            if (((IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class)).b21()) {
                                DataChannel dataChannel = c464180IIe.LIZ;
                                if (dataChannel != null) {
                                    dataChannel.LC0(AudienceShowSwitchDefinitionEvent.class, Boolean.TRUE);
                                }
                            } else {
                                DataChannel dataChannel2 = c464180IIe.LIZ;
                                if (dataChannel2 != null) {
                                    dataChannel2.LC0(AudienceShowSwitchDefinitionEvent.class, Boolean.FALSE);
                                }
                            }
                            c464180IIe.LIZLLL = true;
                            C20337914i1<Integer> c20337914i1 = InterfaceC772390URp.C;
                            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
                            InterfaceC772390URp.D.LJFF(Long.valueOf(System.currentTimeMillis()));
                            Map<String, Object> map = C1338270kvh.LIZ;
                        } else {
                            C20441214yg.LJ("GameLiveAudienceDefinitionHelper", "tryShowGameLiveBufferingTipsV2(). not contain auto and use lowest definition, return!");
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1CC2.LIZ("GameLiveAudienceDefinitionHelper tryShowGameLiveBufferingTipsV2 error", th);
            }
        }
        DataChannel dataChannel3 = this.LJ.y;
        if (dataChannel3 != null) {
            dataChannel3.LC0(BufferingEvent.class, Boolean.TRUE);
        }
        if (C0IRS.LIZ) {
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).OP(false);
        }
        String strFT = this.LJ.fT();
        if (strFT == null || (c468020IWy = C0IX5.LIZJ.get(strFT)) == null || (c0ix6 = c468020IWy.LIZJ) == null) {
            return;
        }
        if (c0ix6.LJIIJJI > 0) {
            c0ix6.LJIIJ += SystemClock.elapsedRealtime() - c0ix6.LJIIJJI;
            c0ix6.LJIIJJI = 0L;
        }
        c0ix6.LJIIIZ++;
        c0ix6.LJIIJJI = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIIIIZZ() {
        C0IWX c0iwx = this.LJ.X1;
        if (!c0iwx.LJFF) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pullStreamPreparedLog, ");
            sbLIZ.append(c0iwx.hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(C786410Ut5.u3().getName());
            C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ));
            c0iwx.LIZ.put("event_prepared_ts", String.valueOf(jCurrentTimeMillis));
            c0iwx.LIZ.put("duration_start_to_prepared", String.valueOf(jCurrentTimeMillis - c0iwx.LIZJ));
        }
        LivePlayFragment livePlayFragment = this.LJ;
        livePlayFragment.getClass();
        if (C781520UlC.LJFF(livePlayFragment.LLILZ)) {
            this.LJ.LJIIL();
        }
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIIJJI() {
        this.LJ.LJ();
    }

    @Override // X.InterfaceC480570Isx
    public final void LJJLIIIJ() {
        LivePlayFragment livePlayFragment = this.LJ;
        if (livePlayFragment.LLLIL || livePlayFragment.LLLLIILLL.LIZ.getVisibility() != 0) {
            return;
        }
        this.LJ.LJ();
    }

    @Override // X.InterfaceC480570Isx
    public final void LLLIL() {
        C0IEZ c0iez;
        if (this.LJ.LT()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("renderViewChanged=");
            sbLIZ.append(true);
            sbLIZ.append(", frameView = ");
            sbLIZ.append(this.LJ.LLLLLL);
            sbLIZ.append(", frameBitmap = ");
            sbLIZ.append(this.LJ.LLLLLLJ);
            C827750WdZ.LIZ("onTextureRenderDrawFrame", C2188811AlT.LIZIZ(sbLIZ));
            LivePlayFragment livePlayFragment = this.LJ;
            if (livePlayFragment.LLLLLL != null && livePlayFragment.LLLLLLJ != null) {
                livePlayFragment.TU();
            }
            LivePlayFragment livePlayFragment2 = this.LJ;
            EnterRoomConfig enterRoomConfig = livePlayFragment2.g1;
            if (enterRoomConfig != null && enterRoomConfig.mFeedCoverData.enterPreviewSmooth) {
                C1440005kM.LIZ(new C767002z6(Long.valueOf(livePlayFragment2.LLILLJJLI), true));
            }
            InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(this.LJ.Q0);
            if (interfaceC480510IsrLIZIZ != null) {
                interfaceC480510IsrLIZIZ.LJIIJJI(true);
                interfaceC480510IsrLIZIZ.I0();
            }
        }
        if (!LiveEnterRoomSuccessMsgOptExp.INSTANCE.enableFrameViewDoFrameCheck() || (c0iez = this.LJ.LLLLLLIL) == null) {
            return;
        }
        c0iez.LIZ();
        this.LJ.LLLLLLIL = null;
    }

    @Override // X.InterfaceC480570Isx
    public final void LJII() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("invite_issue_check", "LinkIn_Guest_onPlayerDetached");
        HashMap map = new HashMap();
        map.put("event_name", "liveplay_player_detached");
        C1143300frE.LJIIJJI().LIZIZ("ttlive_pullstream", map);
        this.LJ.gW();
        LivePlayFragment livePlayFragment = this.LJ;
        livePlayFragment.N0 = true;
        C0IE8 c0ie8 = livePlayFragment.G0;
        long j = livePlayFragment.LLILLJJLI;
        String str = livePlayFragment.LLLZI;
        String str2 = livePlayFragment.LLJ;
        c0ie8.getClass();
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_player_detach_when_pulling", 0.0d)) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("room_type", str, jSONObject);
            C0K04.LIZLLL(0, "error_code", jSONObject);
            C0K04.LJFF("error_msg", "player detach", jSONObject);
            C0K04.LJ("room_id", j, jSONObject);
            C0K04.LJFF("pull_url", str2, jSONObject);
            Pair pairLJIIJJI = C0IE8.LJIIJJI();
            C0K04.LJFF("enter_from_merge", (String) pairLJIIJJI.first, jSONObject);
            C0K04.LJFF("enter_method", (String) pairLJIIJJI.second, jSONObject);
            C1CC2.LJIIL(0, "ttlive_player_detach_when_pulling", jSONObject);
        }
    }

    public C464010IHn(LivePlayFragment livePlayFragment) {
        this.LJ = livePlayFragment;
    }

    @Override // X.InterfaceC480570Isx
    public final void LIZ(Exception exc) {
        C0IX5.LJIJ(2, this.LJ.fT());
        if (this.LJ.lk() && !this.LJ.LLLII && C463320IEw.LIZ()) {
            this.LJ.LLLIIII = true;
            String str = this.LJ.Q0;
            if (str == null) {
                C827750WdZ.LIZIZ("LiveRoomOptimizer", "pre-pull -> pre pull stream failed but the tag is null.");
                return;
            }
            if (C463320IEw.LIZIZ().containsKey(str)) {
                C463310IEv c463310IEv = (C463310IEv) C463320IEw.LIZIZ().get(str);
                if (c463310IEv == null) {
                    return;
                }
                if (c463310IEv.LJ == 0) {
                    c463310IEv.LJ = 2;
                    c463310IEv.LIZLLL = System.currentTimeMillis();
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pre-pull -> pre pull stream failed for ");
                sbLIZ.append(str);
                sbLIZ.append(" but the previous phase is ");
                sbLIZ.append(c463310IEv.LJ);
                sbLIZ.append('.');
                C827750WdZ.LIZIZ("LiveRoomOptimizer", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pre-pull -> pre pull stream failed for ");
            sbLIZ2.append(str);
            sbLIZ2.append(" but no record.");
            C827750WdZ.LIZ("LiveRoomOptimizer", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        String strSubstring = Log.getStackTraceString(exc).substring(0, 200);
        LivePlayFragment livePlayFragment = this.LJ;
        livePlayFragment.G0.LJIIL(105, strSubstring, livePlayFragment.LLLZI, livePlayFragment.LLILLJJLI, livePlayFragment.LLJ);
        C0IIO.LIZJ(0, this.LJ.lk(), Long.valueOf(this.LJ.LLILLJJLI), 105, strSubstring, System.currentTimeMillis());
        LivePlayFragment livePlayFragment2 = this.LJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onError, ");
        sbLIZ3.append(exc.getMessage());
        livePlayFragment2.PT(204L, -1L, C2188811AlT.LIZIZ(sbLIZ3));
        this.LJ.RT("pull_stream_error");
        Event event = new Event("live_play_enter_room_fail", 1035, C0IIR.SdkInterfaceCall);
        event.LIZIZ("player error, there is some problem while starting player.");
        C0IL2.LIZ.LIZ().LIZIZ(event);
        this.LJ.y.IQ2(C749240TaE.class, new kotlin.Pair(301, -1));
        C0IIS.LIZLLL(this.LJ.g1, C0II1.LIVE_PLAYER_ERROR, "slide_next_room", null);
        this.LJ.oS(C0II0.PLAYER_ERROR);
        EnumC486990J7x enumC486990J7x = EnumC486990J7x.StartLivePlay;
        boolean z = C486980J7w.LIZ;
        HashMap map = new HashMap();
        map.put("error", "ttplayer init failed");
        C486980J7w.LJ(enumC486990J7x, map);
        EnumC486990J7x enumC486990J7x2 = EnumC486990J7x.ScrollWatchLivePlay;
        HashMap map2 = new HashMap();
        map2.put("error", "ttplayer init failed");
        C486980J7w.LJ(enumC486990J7x2, map2);
        this.LIZ = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0357 A[Catch: all -> 0x0404, TryCatch #1 {all -> 0x0404, blocks: (B:131:0x02b5, B:134:0x02c5, B:136:0x02cb, B:140:0x02e9, B:152:0x032c, B:154:0x0332, B:155:0x0335, B:142:0x02f3, B:144:0x0304, B:145:0x0309, B:147:0x030d, B:149:0x0315, B:151:0x0321, B:156:0x033f, B:158:0x034b, B:159:0x0357, B:160:0x035b, B:162:0x0361, B:164:0x037c, B:167:0x0385, B:171:0x03a7, B:180:0x03d4, B:182:0x03da, B:183:0x03dd, B:173:0x03b1, B:175:0x03b9, B:177:0x03bf, B:179:0x03c9, B:184:0x03e6, B:186:0x03f0, B:187:0x03fc, B:188:0x0400), top: B:251:0x02b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03fc A[Catch: all -> 0x0404, TryCatch #1 {all -> 0x0404, blocks: (B:131:0x02b5, B:134:0x02c5, B:136:0x02cb, B:140:0x02e9, B:152:0x032c, B:154:0x0332, B:155:0x0335, B:142:0x02f3, B:144:0x0304, B:145:0x0309, B:147:0x030d, B:149:0x0315, B:151:0x0321, B:156:0x033f, B:158:0x034b, B:159:0x0357, B:160:0x035b, B:162:0x0361, B:164:0x037c, B:167:0x0385, B:171:0x03a7, B:180:0x03d4, B:182:0x03da, B:183:0x03dd, B:173:0x03b1, B:175:0x03b9, B:177:0x03bf, B:179:0x03c9, B:184:0x03e6, B:186:0x03f0, B:187:0x03fc, B:188:0x0400), top: B:251:0x02b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01da -> B:103:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0068 -> B:23:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x018e -> B:42:0x00c6). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC480570Isx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C945320ahu r28) {
        /*
            Method dump skipped, instruction units count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464010IHn.LIZIZ(X.0ahu):void");
    }

    @Override // X.InterfaceC480570Isx
    public final void LJ(C945320ahu c945320ahu) {
        DataChannel dataChannel;
        if (LinkMicRoomPlayerSeiOptSetting.INSTANCE.isEnable() && c945320ahu != null && (dataChannel = this.LJ.y) != null) {
            dataChannel.zW(SeiCacheChannel.class, c945320ahu);
            C467650IVn c467650IVn = this.LJ.LLLF;
            if (c467650IVn != null) {
                c467650IVn.LJJIIZ(c945320ahu);
            }
            this.LJ.KW(c945320ahu);
        }
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIIJ(String str) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAbrResolutionChanged. newResolution=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LivePlayFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveMode.isWatchGameLiveOrPCLive(this.LJ.LLJJ)) {
            LivePlayFragment livePlayFragment = this.LJ;
            if (livePlayFragment.W0 == null) {
                livePlayFragment.W0 = new C235900vd(livePlayFragment.y);
            }
            C235900vd c235900vd = livePlayFragment.W0;
            LivePlayFragment livePlayFragment2 = this.LJ;
            int i = livePlayFragment2.LLJLL;
            long j = livePlayFragment2.LLILZIL;
            c235900vd.getClass();
            try {
                DataChannel dataChannel = c235900vd.LIZ;
                if (dataChannel != null) {
                    dataChannel.zW(GameLiveAbrNewResolution.class, str);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(c235900vd.LIZIZ)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C20337914i1<Long> c20337914i1 = InterfaceC772390URp.B;
                    Long lLIZIZ = c20337914i1.LIZIZ();
                    C20337914i1<Long> c20337914i12 = InterfaceC772390URp.A;
                    Long lLIZIZ2 = c20337914i12.LIZIZ();
                    String str2 = C0IMN.LIZ;
                    String str3 = c235900vd.LIZIZ;
                    Map<String, Integer> map = C0IMN.LIZJ;
                    Integer num = (Integer) ((LinkedHashMap) map).get(str3);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer num2 = (Integer) ((LinkedHashMap) map).get(str);
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showAbrSwitchTips, mLastAbrResolution = ");
                    sbLIZ2.append(c235900vd.LIZIZ);
                    sbLIZ2.append(", lastLevel = ");
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append(", newLevel = ");
                    sbLIZ2.append(iIntValue2);
                    C20441214yg.LJIIIZ("GameLiveAudienceAbrHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    if (iIntValue > iIntValue2) {
                        if (System.currentTimeMillis() - lLIZIZ.longValue() > 86400000 && z) {
                            C766270U4b.LIZLLL(2131844646);
                            c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Map<String, Object> map2 = C1338270kvh.LIZ;
                    } else if (iIntValue < iIntValue2) {
                        if (System.currentTimeMillis() - lLIZIZ2.longValue() > 86400000 && z) {
                            C766270U4b.LIZLLL(2131844647);
                            c20337914i12.LJFF(Long.valueOf(System.currentTimeMillis()));
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Map<String, Object> map3 = C1338270kvh.LIZ;
                    } else {
                        z2 = false;
                    }
                    c235900vd.LIZ(j, i, c235900vd.LIZIZ, str, z2);
                    c235900vd.LIZIZ = str;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1CC2.LIZ("GameLiveAudienceAbrHelper showAbrSwitchTips error", th);
            }
        }
        this.LJ.getClass();
    }

    public final void LJIIL(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("anchor_link_mic_id");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("grids");
        if (jSONArrayOptJSONArray == null) {
            this.LJ.y.zW(MuteMicChannel.class, Boolean.FALSE);
        }
        int length = jSONArrayOptJSONArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
            if ((jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.optString("uid_str")) && jSONObject2.optString("uid_str").equals(strOptString)) || (!TextUtils.isEmpty(jSONObject2.optString("link_mic_id")) && jSONObject2.optString("link_mic_id").equals(strOptString))) {
                if (jSONObject2.optBoolean("mute_a", false) || jSONObject2.optInt("mute_a", 0) == 1) {
                    z = true;
                }
                this.LJ.y.zW(MuteMicChannel.class, Boolean.valueOf(z));
                return;
            }
        }
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIILJJIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResolutionDegrade. newResolution=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LivePlayFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.y.zW(AudienceResolutionDegrade.class, str);
        this.LJ.getClass();
    }

    @Override // X.InterfaceC480570Isx
    public final void LLZZLLIL(C1281010jRL c1281010jRL) {
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).bg(C0J0Q.LIVE, "live_network_state", c1281010jRL, "default", false);
    }

    @Override // X.InterfaceC480570Isx
    public final void LIZJ(final long j, final long j2) {
        InterfaceC466370IQp interfaceC466370IQpZR;
        C468020IWy c468020IWy;
        C0IX7 c0ix7;
        long jLongValue;
        C0IOL c0iol;
        DataChannel dataChannel;
        Map map;
        boolean z;
        int i;
        int newPlayTimes;
        long j3;
        RecyclableWidgetManager recyclableWidgetManager;
        C463710IGj c463710IGj;
        if (LiveInnerStreamUseSurfaceControlExp.getEnable() && (c463710IGj = this.LJ.LLLLIILLL) != null) {
            c463710IGj.LJI(0, "onPlayDisplayed with surfacecontrol");
        }
        if (C0JDZ.LIZIZ) {
            C0JDZ.LIZ.getClass();
            C0JDZ.LJ = System.currentTimeMillis() - C0JDZ.LIZLLL;
            if (C0JDZ.LJ > 0 && C0JDZ.LJFF > 0) {
                Math.max(C0JDZ.LJ, C0JDZ.LJFF);
            }
        }
        this.LJ.getClass();
        LivePlayFragment.ZT();
        C0ISA.LIZIZ = true;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        LivePlayFragment livePlayFragment = this.LJ;
        if (!livePlayFragment.b1) {
            livePlayFragment.c1 = Long.valueOf(jCurrentTimeMillis);
        }
        this.LJ.b1 = true;
        LivePlayFragment livePlayFragment2 = this.LJ;
        livePlayFragment2.getClass();
        C20441214yg.LJIIIZ("widget_loading", "notifyFirstFrameShown");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(livePlayFragment2.A0);
        sbLIZ.append("_");
        sbLIZ.append(livePlayFragment2.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Boolean bool = Boolean.TRUE;
        dataChannelGlobal.HQ2(FirstFrameShowData.class, new kotlin.Pair(strLIZIZ, bool));
        AbsAudienceInteractionFragment absAudienceInteractionFragment = livePlayFragment2.LLLLLZL;
        if (absAudienceInteractionFragment != null && (recyclableWidgetManager = absAudienceInteractionFragment.LLJJI) != null) {
            recyclableWidgetManager.notifyFirstFrameShown();
        }
        if (C463380IFc.LIZ()) {
            String str = (String) livePlayFragment2.y.gg0(AudienceMultiGuestShareBgChannel.class);
            if (str == null || TextUtils.isEmpty(str)) {
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(livePlayFragment2.LLILLJJLI);
                sbLIZ2.append("_");
                sbLIZ2.append(livePlayFragment2.LLILZIL);
                String strTr1 = iInteractService.Tr1(C2188811AlT.LIZIZ(sbLIZ2));
                if (!TextUtils.isEmpty(strTr1)) {
                    String strIj1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ij1(strTr1);
                    if (!TextUtils.isEmpty(strIj1)) {
                        str = strIj1;
                    }
                }
            }
            livePlayFragment2.OU((C0IEU) livePlayFragment2.y.gg0(AudienceVideoViewParams.class), str, true);
        }
        if (LiveKeyApiOpt.isEnableRoomEnterCpuBoost()) {
            IPerformanceService iPerformanceService = (IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class);
            if (iPerformanceService instanceof InterfaceC463490IFn) {
                ((InterfaceC463490IFn) iPerformanceService).LIZIZ();
            }
        }
        if (this.LJ.lk() && !this.LJ.LLLII && C463320IEw.LIZ()) {
            this.LJ.LLLII = true;
            this.LJ.LLLIIII = false;
            String str2 = this.LJ.Q0;
            if (str2 == null) {
                C827750WdZ.LIZIZ("LiveRoomOptimizer", "pre-pull -> pre pull stream successfully but the tag is null.");
            } else if (C463320IEw.LIZIZ().containsKey(str2)) {
                C463310IEv c463310IEv = (C463310IEv) C463320IEw.LIZIZ().get(str2);
                if (c463310IEv != null) {
                    if (c463310IEv.LJ == 0) {
                        c463310IEv.LJ = 1;
                        c463310IEv.LIZLLL = System.currentTimeMillis();
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("pre-pull -> pre pull stream successfully for ");
                        sbLIZ3.append(str2);
                        sbLIZ3.append(" but the previous phase is ");
                        sbLIZ3.append(c463310IEv.LJ);
                        sbLIZ3.append('.');
                        C827750WdZ.LIZIZ("LiveRoomOptimizer", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("pre-pull -> pre pull stream successfully for ");
                sbLIZ4.append(str2);
                sbLIZ4.append(" but no record.");
                C827750WdZ.LIZ("LiveRoomOptimizer", C2188811AlT.LIZIZ(sbLIZ4));
            }
            LiveInnerPrePullStreamSettings liveInnerPrePullStreamSettings = LiveInnerPrePullStreamSettings.INSTANCE;
            LiveInnerPrePullStreamConfigData value = liveInnerPrePullStreamSettings.getValue();
            int i2 = -1;
            if (value != null && value.aliveTimeForPrePullStream >= 0) {
                LivePlayFragment livePlayFragment3 = this.LJ;
                if (livePlayFragment3.LLLIIIIL == null) {
                    ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 65);
                    livePlayFragment3.LLLIIIIL = aRunnableS107S0100000_7;
                    Handler handler = livePlayFragment3.x0;
                    LiveInnerPrePullStreamConfigData value2 = liveInnerPrePullStreamSettings.getValue();
                    if (value2 != null) {
                        i2 = value2.aliveTimeForPrePullStream;
                    }
                    C786410Ut5.LJLIIL(i2, handler, aRunnableS107S0100000_7);
                }
            }
            C0IEB c0ieb = this.LJ.LLLFZ;
            if (c0ieb != null && c0ieb.getLogger() != null) {
                this.LJ.LLLFZ.setPullParallel(true);
            }
        } else {
            C0IEB c0ieb2 = this.LJ.LLLFZ;
            if (c0ieb2 != null && c0ieb2.getLogger() != null) {
                this.LJ.LLLFZ.setPullParallel(false);
            }
        }
        LivePlayFragment livePlayFragment4 = this.LJ;
        livePlayFragment4.l0 = false;
        C0IED c0ied = livePlayFragment4.C1;
        if (c0ied != null) {
            c0ied.LIZJ = true;
        }
        if (livePlayFragment4.f1 == 0) {
            boolean z2 = C466240IQc.LIZ;
            DataChannel dataChannel2 = livePlayFragment4.y;
            EnterRoomConfig enterRoomConfig = livePlayFragment4.g1;
            if (C466240IQc.LIZ) {
                C0IQV.LLILZIL = dataChannel2;
                C0IQV.LLILZLL = enterRoomConfig;
                if (C0IQV.LLJ && C0IQV.LLIZLLLIL == null) {
                    C0IQV c0iqv = C0IQV.LL;
                    if (C0IJ6.LIZ(enterRoomConfig, C0IQV.LLIZ)) {
                        j3 = 2;
                    } else {
                        j3 = 6;
                    }
                    C0IQV.LLIZLLLIL = (C11JF) C11NZ.LJLJJLL(j3, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0IHq
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("SlideUpGuideManagerV2@e73.startPlay$1");
                            C0IQV.LLJIJIL = true;
                            C0IQV.LL.LIZJ();
                            C1C7U.LIZIZ("SlideUpGuideManagerV2@e73.startPlay$1");
                        }
                    });
                }
            } else {
                C466230IQb c466230IQbLIZJ = C466230IQb.LIZJ();
                c466230IQbLIZJ.LLJILJILJ = dataChannel2;
                c466230IQbLIZJ.LLJILLL = enterRoomConfig;
                if (c466230IQbLIZJ.LL && c466230IQbLIZJ.LLILZ == null && !c466230IQbLIZJ.LLILZIL) {
                    if (c466230IQbLIZJ.LLJJIJI == 0) {
                        c466230IQbLIZJ.LLILZ = (C11JF) C11NZ.LJLJJLL(LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().getPlayTimes(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(c466230IQbLIZJ, 29));
                    } else {
                        if (C0IJ5.LIZ(enterRoomConfig, c466230IQbLIZJ.LLJIJIL)) {
                            newPlayTimes = GameLiveBottomBarSlideGuideDelayTimeSetting.INSTANCE.getValue();
                        } else {
                            newPlayTimes = LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().getNewPlayTimes();
                        }
                        c466230IQbLIZJ.LLILZ = (C11JF) C11NZ.LJLJJLL(newPlayTimes, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(c466230IQbLIZJ, 28));
                    }
                }
            }
        }
        C827750WdZ.LIZ("LivePlayFragment", " first frame received !!!!");
        LiveWatchPreloadSettings liveWatchPreloadSettings = LiveWatchPreloadSettings.INSTANCE;
        if (!liveWatchPreloadSettings.disableUnusedLog()) {
            LivePlayFragment livePlayFragment5 = this.LJ;
            livePlayFragment5.E0.put("time", String.valueOf(jCurrentTimeMillis - livePlayFragment5.F0));
            this.LJ.E0.put("location", " after onPlayDisplayed");
            C474500IjA c474500IjALIZJ = C0IJT.LIZJ("feed_enter_room");
            c474500IjALIZJ.LJJIIZI(this.LJ.E0);
            c474500IjALIZJ.LIZ();
        }
        if (liveWatchPreloadSettings.callAheadPrepareNextStep()) {
            this.LJ.MU();
        }
        if (this.LJ.LLLF != null) {
            C823050WQl.LIZJ().execute(new ARunnableS13S0100100_7(this, SystemClock.elapsedRealtime(), jCurrentTimeMillis, 3));
        }
        int[] iArr = new int[2];
        C0IEB c0ieb3 = this.LJ.LLLFZ;
        if (c0ieb3 != null) {
            c0ieb3.getVideoSize(iArr);
            this.LJ.LLLFZ.changeSRSupportScene(true);
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        int i3 = iArr[0];
        if (i3 != 0 && (i = iArr[1]) != 0) {
            LivePlayFragment livePlayFragment6 = this.LJ;
            livePlayFragment6.dV(i3, i, C12ES.LJIIJ(livePlayFragment6.getContext()), "playDisplay");
            LivePlayFragment livePlayFragment7 = this.LJ;
            if (livePlayFragment7.LLLLLZL != null) {
                livePlayFragment7.y.zW(VideoOrientationChangeChannel.class, new C0IMR(livePlayFragment7.LLJLILLLLZIIL, livePlayFragment7.LLJLLL));
            }
        }
        this.LJ.LJIIL();
        LivePlayFragment livePlayFragment8 = this.LJ;
        if (livePlayFragment8.LLLLIL != null) {
            HandlerHook.viewPost(livePlayFragment8.LLLLIL, new RunnableC514801zW(livePlayFragment8, 36));
        }
        LivePlayFragment livePlayFragment9 = this.LJ;
        C463710IGj c463710IGj2 = livePlayFragment9.LLLLIILLL;
        if (!livePlayFragment9.LLLILZLLLI) {
            if (livePlayFragment9.LLJJ != LiveMode.AUDIO) {
                if (LiveFixScrollBlackExp.isEnable()) {
                    LivePlayFragment livePlayFragment10 = this.LJ;
                    if (!livePlayFragment10.LLLILZJ && !livePlayFragment10.getUserVisibleHint()) {
                        C827750WdZ.LIZ("onPlayDisplayed", "do not  call hideBackground when current fragment is unselect");
                    } else {
                        this.LJ.kT("first frame when fragment is selected");
                    }
                } else {
                    this.LJ.kT("first frame");
                }
            }
            if (this.LJ.LLLF != null) {
                C823050WQl.LIZJ().execute(new ARunnableS13S0100100_7(this, SystemClock.elapsedRealtime(), 5));
            }
        } else {
            livePlayFragment9.nV("first frame but in illegal status", true);
            C0IEB c0ieb4 = this.LJ.LLLFZ;
            if (c0ieb4 != null) {
                c0ieb4.setMute(true, "first frame");
            }
        }
        if (!liveWatchPreloadSettings.callAheadPrepareNextStep()) {
            this.LJ.MU();
        }
        LivePlayFragment livePlayFragment11 = this.LJ;
        if (livePlayFragment11.LLLIZZ) {
            livePlayFragment11.LLLIZZ = false;
            C766270U4b.LJIIJJI(livePlayFragment11.getString(2131853527));
        }
        this.LIZ = 0;
        C0IEB c0ieb5 = this.LJ.LLLFZ;
        if (c0ieb5 != null && c0ieb5.getLogger() != null && TestDisablePullStreamInfoSetting.INSTANCE.getValue()) {
            LivePlayFragment livePlayFragment12 = this.LJ;
            livePlayFragment12.y.LC0(StreamInfoEvent.class, livePlayFragment12.LLLFZ.getLogger());
        }
        this.LJ.y.zW(FirstFrameChannelEvent.class, bool);
        if (this.LJ.U1 != null && LiveInteractionMaskConfigSetting.INSTANCE.enableMaskShowAfterFirstFrame() && !this.LJ.vV()) {
            LivePlayFragment livePlayFragment13 = this.LJ;
            if (!livePlayFragment13.u0) {
                livePlayFragment13.U1.LIZIZ();
            }
        }
        int i4 = C21406218pw.LIZ;
        C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "enterRoomSucceed");
        C21406218pw.LIZ = 0;
        LivePlayFragment livePlayFragment14 = this.LJ;
        if (C0IIN.LIZ(livePlayFragment14.LLILZ, livePlayFragment14.g1, livePlayFragment14.LLLZZ)) {
            this.LJ.LLLFZ.stop(false);
            LivePlayFragment livePlayFragment15 = this.LJ;
            livePlayFragment15.NW(livePlayFragment15.LLILZ, "onPlayDisplayed");
        }
        LivePlayFragment livePlayFragment16 = this.LJ;
        if (livePlayFragment16.V0 == null) {
            livePlayFragment16.V0 = new C464180IIe(livePlayFragment16.y);
        }
        C464180IIe c464180IIe = livePlayFragment16.V0;
        String str3 = this.LJ.Q0;
        c464180IIe.getClass();
        try {
            DataChannel dataChannel3 = c464180IIe.LIZ;
            if (dataChannel3 != null) {
                map = (Map) dataChannel3.gg0(AudienceLastSelectDefinitionInfo.class);
            } else {
                map = null;
            }
            String currentResolution = "";
            IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
            if (iPullStreamService != null) {
                InterfaceC480510Isr interfaceC480510IsrLIZIZ = iPullStreamService.YY().LIZIZ(str3);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("markAudienceDefinitionInfo(). tag=");
                sbLIZ5.append(str3);
                sbLIZ5.append(", livePlayController=");
                if (interfaceC480510IsrLIZIZ == null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ5.append(z);
                C20441214yg.LJIIIZ("GameLiveAudienceDefinitionHelper", C2188811AlT.LIZIZ(sbLIZ5));
                if (interfaceC480510IsrLIZIZ != null) {
                    currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("markAudienceDefinitionInfo(). tag=");
                    sbLIZ6.append(str3);
                    sbLIZ6.append(", currentSdkKey=");
                    sbLIZ6.append(currentResolution);
                    C20441214yg.LJIIIZ("GameLiveAudienceDefinitionHelper", C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
            if (map == null ? currentResolution != null : !(currentResolution == null || Intrinsics.LJFF(currentResolution, (String) map.get("sdk_key")))) {
                HashMap map3 = new HashMap();
                map3.put("sdk_key", currentResolution);
                map3.put("start_time", String.valueOf(System.currentTimeMillis()));
                DataChannel dataChannel4 = c464180IIe.LIZ;
                if (dataChannel4 != null) {
                    dataChannel4.zW(AudienceLastSelectDefinitionInfo.class, map3);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("GameLiveAudienceDefinitionHelper markAudienceDefinitionInfo error", th);
        }
        this.LJ.HS();
        this.LJ.getClass();
        C0IGS messageTimeTracker = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).getMessageTimeTracker();
        if (messageTimeTracker != null) {
            messageTimeTracker.LIZ("first_frame_show");
        }
        LivePlayFragment livePlayFragment17 = this.LJ;
        if (livePlayFragment17.H1 == 0) {
            livePlayFragment17.H1 = jCurrentTimeMillis;
        }
        if (!LivePerformanceOptSetting.enableLivePlayFragMemOpt()) {
            LivePlayFragment livePlayFragment18 = this.LJ;
            if (livePlayFragment18.J1 == null) {
                livePlayFragment18.J1 = new ViewTreeObserverOnPreDrawListenerC521780KdE(livePlayFragment18, 1);
            }
            ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE = livePlayFragment18.J1;
            if (viewTreeObserverOnPreDrawListenerC521780KdE != null) {
                try {
                    if (livePlayFragment18.getActivity() != null && livePlayFragment18.getActivity().getWindow() != null && livePlayFragment18.getActivity().getWindow().getDecorView() != null) {
                        C786410Ut5.y3(livePlayFragment18.getActivity().getWindow().getDecorView().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC521780KdE);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0IHU
            @Override // java.lang.Runnable
            public final void run() {
                boolean z3;
                EnterRoomLinkSession enterRoomLinkSessionLIZ;
                String strLIZLLL;
                EnterRoomConfig.RoomsData roomsData;
                C464010IHn c464010IHn = this.LL;
                long j4 = j;
                long j5 = j2;
                long j6 = jCurrentTimeMillis;
                c464010IHn.getClass();
                C1C7U.LIZ("LivePlayFragment@afba.<field>$1$onPlayDisplayed$3L");
                LivePlayFragment livePlayFragment19 = c464010IHn.LJ;
                if (livePlayFragment19.F1) {
                    z3 = true;
                } else {
                    C465050ILn.LJ(livePlayFragment19.LLILLJJLI, "live_room_first_screen");
                    long j7 = c464010IHn.LJ.LLILLJJLI;
                    C465050ILn.LIZ.getClass();
                    C20182413y2 c20182413y2LJIIJ = C465050ILn.LJIIJ(j7);
                    if (c20182413y2LJIIJ != null) {
                        c20182413y2LJIIJ.LIZIZ();
                    }
                    C465050ILn.LJIIIZ = null;
                    C465050ILn.LJIIJJI(j7);
                    EnterRoomLinkSession enterRoomLinkSessionLIZ2 = C0IL2.LIZ.LIZ();
                    if (enterRoomLinkSessionLIZ2 != null) {
                        Event event = new Event("first_frame", 33792, C0IIR.SdkCallback);
                        event.LIZIZ("first_frame");
                        enterRoomLinkSessionLIZ2.LIZIZ(event);
                    }
                    if (MultiGuestLayoutMonitorSwitchSetting.INSTANCE.isSwitch()) {
                        c464010IHn.LJ.bU(EnumC485960J3y.FIRST_FRAME, false);
                    }
                    LivePlayFragment livePlayFragment20 = c464010IHn.LJ;
                    if (livePlayFragment20.f303e0) {
                        livePlayFragment20.g2 = livePlayFragment20.y.gg0(SeiCacheChannel.class) == null;
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("LivePlayFragment_onPlayDisplayed isFirstDisplayBeforeSei = ");
                        sbLIZ7.append(c464010IHn.LJ.g2);
                        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ7));
                    }
                    ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).onECMixFeedLiveFirstFrameRender(c464010IHn.LJ.g1, j6);
                    z3 = true;
                    C0IIO.LIZJ(1, c464010IHn.LJ.lk(), Long.valueOf(c464010IHn.LJ.LLILLJJLI), 0, "", j6);
                }
                LivePlayFragment livePlayFragment21 = c464010IHn.LJ;
                livePlayFragment21.F1 = z3;
                if (!livePlayFragment21.l1) {
                    EnterRoomConfig enterRoomConfig2 = livePlayFragment21.g1;
                    if (enterRoomConfig2 != null && (roomsData = enterRoomConfig2.mRoomsData) != null && !C2093608Ic.LIZJ("inner_draw", roomsData.enterRoomScene)) {
                        LivePlayFragment livePlayFragment22 = c464010IHn.LJ;
                        EnterRoomConfig.TimeStamp timeStamp = livePlayFragment22.g1.mRoomsData.timeStamps;
                        if (timeStamp != null) {
                            livePlayFragment22.o = timeStamp.enterRoomStarTime;
                            livePlayFragment22.p = timeStamp.enterRoomStarTimeReal;
                        }
                    }
                    C0IWX c0iwx = c464010IHn.LJ.X1;
                    LivePlayFragment livePlayFragment23 = c464010IHn.LJ;
                    long j8 = livePlayFragment23.LLILLJJLI;
                    long j9 = livePlayFragment23.p;
                    if (j9 <= 0) {
                        j9 = livePlayFragment23.o;
                        if (j9 <= 0) {
                            j9 = j6;
                        }
                    }
                    c0iwx.LJJJI(j8, j9, false);
                }
                c464010IHn.LJ.X1.LJJIL(j4, j5, j6);
                if (AutoReportSwitcherSetting.INSTANCE.isEnable() && LiveMode.isWatchGameLiveOrPCLive(c464010IHn.LJ.LLJJ) && (enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ()) != null && (strLIZLLL = enterRoomLinkSessionLIZ.LIZLLL()) != null && strLIZLLL.length() > 0) {
                    DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                    HashMap c2091508Hh = (HashMap) dataChannelGlobal2.gg0(C1148220fzA.class);
                    if (c2091508Hh == null) {
                        c2091508Hh = new C2091508Hh(5);
                    }
                    if (!c2091508Hh.containsKey(strLIZLLL)) {
                        c2091508Hh.put(strLIZLLL, C0IHV.LIZ);
                    }
                    Map<String, Object> map4 = C1338270kvh.LIZ;
                    dataChannelGlobal2.JQ2(C1148220fzA.class, c2091508Hh);
                }
                C1C7U.LIZIZ("LivePlayFragment@afba.<field>$1$onPlayDisplayed$3L");
            }
        });
        if (LiveOptPrecreatePlayerSetting.isEnable()) {
            this.LJ.y.FQ2(PreCreateLivePlayerEvent.class);
        }
        C0ISA.LIZIZ = false;
        C018Q.LIZ = true;
        LivePlayFragment livePlayFragment19 = this.LJ;
        C0IGD c0igd = livePlayFragment19.f307n2;
        if (c0igd != null && (c0iol = ((LiveRoomFragment) c0igd).LLLLIIIILLL) != null) {
            boolean z3 = c0iol instanceof C0ISJ;
            DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
            Boolean bool2 = Boolean.TRUE;
            dataChannelGlobal2.FQ2(TopTabPageShowEvent.class, bool2);
            if (LivePreloadNextRoomWidgetsSetting.INSTANCE.triggerAfterWidgetAndStreamFinished() && (dataChannel = livePlayFragment19.y) != null && bool2.equals(dataChannel.gg0(EnterRoomWidgetLoadStatus.class))) {
                livePlayFragment19.AU().PI();
            }
        }
        if (this.LJ.AU() != null && this.LJ.AU().getCurrentFragment() == this.LJ) {
            LiveExitRoomRunnableScatter.setCurrentRoomShown(true);
        }
        String strFT = this.LJ.fT();
        if (LivePlayFullLinkPerfSendExp.INSTANCE.isEnable() && strFT != null && (c468020IWy = C0IX5.LIZJ.get(strFT)) != null && (c0ix7 = c468020IWy.LJ) != null) {
            InterfaceC2453409jQ<Long> interfaceC2453409jQ = C0IX5.LJII;
            if (interfaceC2453409jQ != null) {
                jLongValue = interfaceC2453409jQ.get().longValue();
                if (jLongValue > 0) {
                    c0ix7.LJFF.add(Long.valueOf(jLongValue));
                }
            } else {
                jLongValue = 0;
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("updateSEIDelay: seiDelay = ");
            sbLIZ7.append(jLongValue);
            C2188811AlT.LIZIZ(sbLIZ7);
        }
        C08D5.LIZIZ(this.LJ.ES(), new ARunnableS86S0000000_7(5), null, 500L);
        Fragment parentFragment = this.LJ.getParentFragment();
        if ((parentFragment instanceof LiveRoomFragment) && (interfaceC466370IQpZR = ((LiveRoomFragment) parentFragment).ZR()) != null) {
            interfaceC466370IQpZR.PH();
        }
    }

    @Override // X.InterfaceC480570Isx
    public final void LJFF(long j, long j2) {
        this.LJ.X1.LJJIL(j, j2, -1L);
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIIIZ(final int i, String str) {
        String string;
        Map map = (Map) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, str, new TypeToken<Map<String, String>>() { // from class: X.0IHt
        }.getType());
        C0IIO.LIZJ(0, this.LJ.lk(), Long.valueOf(this.LJ.LLILLJJLI), i, str, System.currentTimeMillis());
        if (map.containsKey("error_code")) {
            String str2 = (String) map.get("error_code");
            if (str2 != null) {
                C0IE8 c0ie8 = this.LJ.G0;
                int iIntValue = CastIntegerProtector.valueOf(str2).intValue();
                LivePlayFragment livePlayFragment = this.LJ;
                long j = livePlayFragment.LLILLJJLI;
                String str3 = livePlayFragment.LLLZI;
                String str4 = livePlayFragment.LLJ;
                int i2 = c0ie8.LIZLLL;
                if (i2 != 1) {
                    if (i2 == 2) {
                        c0ie8.LJIIL(iIntValue, str, str3, j, str4);
                    } else if (c0ie8.LJ == null) {
                        c0ie8.LJ = new C0IFR(iIntValue, str, str3, j, str4);
                    }
                }
                C0IXL c0ixl = (C0IXL) DataChannelGlobal.LLILZ.gg0(C1148430fzV.class);
                if (c0ixl != null) {
                    c0ixl.LJJIZ = this.LJ.g1.mLogData.fromPortalId;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayerError, ");
                sbLIZ.append(str);
                C468000IWw.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), 209L, CastIntegerProtector.valueOf(str2).intValue(), 0L, 0L, "", C0IVR.LJIIIIZZ(this.LJ.g1), this.LJ.y);
                this.LJ.y.IQ2(C749240TaE.class, new kotlin.Pair(301, CastIntegerProtector.valueOf(str2)));
                ((ArrayList) this.LJ.LLZZLLIL).add(str2);
                C0IED c0ied = this.LJ.C1;
                if (c0ied != null) {
                    c0ied.LIZLLL = true;
                }
                if (str2.equals(String.valueOf(-100019))) {
                    C0IIS.LIZLLL(this.LJ.g1, C0II1.DRM_WIDEVINE_NOT_SUPPORTED, "slide_next_room", null);
                    this.LJ.oS(C0II0.PLAYER_ERROR);
                }
            }
            ((ArrayList) this.LIZIZ).add(new Object(i) { // from class: X.0IHu
                {
                    String.valueOf(i);
                }
            });
        }
        int i3 = this.LIZ + 1;
        this.LIZ = i3;
        if (i3 > 10) {
            Event event = new Event("live_play_enter_room_fail", 33809, C0IIR.SdkInterfaceCall);
            event.LIZIZ(C2348809Ig.LJIIIIZZ(this.LIZIZ));
            this.LIZ = 0;
            this.LIZIZ = new ArrayList();
            C0IL2.LIZ.LIZ().LIZIZ(event);
        }
        C463430IFh c463430IFh = C463740IGm.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("error_play_player_error errorCode = ");
        sbLIZ2.append(i);
        c463430IFh.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Player call back error when live errorMsg = ");
        sbLIZ3.append(str);
        c463430IFh.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
        C463730IGl c463730IGl = this.LJ.H0;
        if (c463730IGl != null) {
            c463730IGl.LJIILJJIL(c463430IFh);
        }
        C0IWX c0iwx = this.LJ.X1;
        Integer numValueOf = Integer.valueOf(i);
        if (c0iwx.LIZJ > 0 && (!c0iwx.LJFF)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("pullStreamFailLog, ");
            sbLIZ4.append(c0iwx.hashCode());
            sbLIZ4.append(", ");
            sbLIZ4.append(C786410Ut5.u3().getName());
            C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ4));
            ConcurrentHashMap<String, String> concurrentHashMap = c0iwx.LIZ;
            if (numValueOf == null || (string = numValueOf.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            concurrentHashMap.put("err_code", string);
            if (str != null) {
                c0iwx.LIZ.put("err_msg", str);
            }
            c0iwx.LIZ.put("event_failure_ts", String.valueOf(jCurrentTimeMillis));
            c0iwx.LIZ.put("duration_start_to_failure", String.valueOf(jCurrentTimeMillis - c0iwx.LIZJ));
            if (c0iwx.LJ) {
                c0iwx.LJJJJJL();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01e9  */
    @Override // X.InterfaceC480570Isx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoSizeChanged(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464010IHn.onVideoSizeChanged(int, int):void");
    }
}
