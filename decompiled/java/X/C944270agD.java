package X;

import Y.AfS137S0000000_15;
import Y.AfS151S0200000_15;
import Y.AfS184S0100000_15;
import Y.AfS5S0100100_15;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestIsLinkedAsAudienceForMicRoomChannelChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestIsLinkedAsGuestForMicRoomChangeChannel;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multiguestv3.RtcSeiReceivedChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2Channel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest.PlaybookGuestServiceChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostAudienceAreaExpandChannel;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostOnboardPermitChannel;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.setting.LiveToolbarLoadOptimizeSetting;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.RestartLiveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookAutoRunTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostPermissionPeriodSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostPermissionRetryTimesSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLayoutTypeDestroyChannelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIdentifyUnloadWidgetMockSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveLinkControlPresenterOOMSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostExpandLayoutIdsSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0agD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944270agD extends AbstractC945390ai1<InterfaceC944250agB> implements InterfaceC944530agd, InterfaceC1141530foN {
    public static final Long LLJL = -1L;
    public static boolean LLJLIL;
    public final String LL;
    public InterfaceC420801kM LLILLJJLI;
    public C915690Zw7 LLILLL;
    public C974310bSf LLILZ;
    public C949640aos LLILZIL;
    public C944410agR LLILZLL;
    public final C944460agW LLIZ;
    public final C11NJ LLIZLLLIL;
    public final Room LLJ;
    public final boolean LLJI;
    public final LiveMode LLJIJIL;
    public final C934350aQD LLJILJIL;
    public boolean LLJILJILJ;
    public final C927760aFa LLJILLL;
    public final C927680aFS LLJJ;
    public final C927700aFU LLJJI;
    public final C916820Zxw LLJJIII;
    public final C916810Zxv LLJJIJI;
    public InterfaceC963690bBX LLJJIJIIJIL;
    public C944380agO LLJJIJIL;
    public C944590agj LLJJJ;
    public C915310ZvV LLJJJIL;
    public C955550ayP LLJJJJ;
    public C963630bBR LLJJJJJIL;
    public final C944260agC LLJJJJLIIL;
    public final C944310agH LLJJL;
    public final C917020ZyG LLJJLIIIJLLLLLLLZ;

    @InterfaceC948490an1(name = "LINK_MESSAGE_CENTER")
    public LinkMessageCenter linkMessageCenter;

    public static InterfaceC954910axN LJJJJLI() {
        InterfaceC954910axN.LIZ.getClass();
        return C958790b3d.LIZ("LinkControlPresenter", new String[0]);
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        C944380agO c944380agO;
        LifecycleOwner lifecycleOwner;
        LLJLIL = false;
        MultiGuestAnchorPanelTypeSetting.INSTANCE.setMicRoom(null);
        ConcurrentHashMap<Long, Set<String>> concurrentHashMap = C01Z2.LIZ;
        C01Z2.LIZIZ(this.LLJ.getOwnerUserId());
        C915980Zwa.LJI().LIZIZ("LinkControlPresenter_OnDestroy");
        C915980Zwa.LJI().LJII();
        LinkMessageCenter linkMessageCenter = this.linkMessageCenter;
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(this.LLJJJJLIIL);
        }
        InterfaceC420801kM interfaceC420801kM = this.LLILLJJLI;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
            this.LLILLJJLI = null;
        }
        C970290bMB c970290bMB = C970290bMB.LIZ;
        C970290bMB.LJJIII();
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        if (objLJIIIZ instanceof MultiGuestDataHolder) {
            C925600aC6.LJIJI(((MultiGuestDataHolder) objLJIIIZ).LJJJJI);
        } else {
            C925600aC6.LJIJI(null);
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLJJ);
        C915980Zwa.LJIIIIZZ().a9(this.LLJJI);
        C915980Zwa.LJIIIIZZ().vq0(this.LLJJIII);
        C940770aaZ.LIZ().LJJ(this.LLJJIJI);
        C915980Zwa.LJIIIIZZ().Bm2(this.LLJILLL);
        boolean zHq0 = ((IGameLinkMicService) C1161920gLG.LIZJ(IGameLinkMicService.class)).Hq0(this.LLJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isDetachLinkMicService, mIsAnchor=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(",isAudienceLeaveRoom=");
        sbLIZ.append(zHq0);
        C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJI || zHq0) {
            C915980Zwa.LJIIIIZZ().LJI();
            C915980Zwa.LJII().LJI();
        } else {
            InterfaceC925030aBB interfaceC925030aBBAg = C915980Zwa.LJIIIIZZ().ag();
            if (interfaceC925030aBBAg != null) {
                interfaceC925030aBBAg.LIZIZ();
            }
        }
        MultiCohostAreaExpandSetting.INSTANCE.setLastCohostLayoutId("");
        if (this.LLJI && LiveLinkControlPresenterOOMSetting.INSTANCE.isEnabled()) {
            C1548820qPI.LJIIIIZZ("LiveCohostSettingUpdatedEvent", this);
        }
        try {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("clear, inviterDisposableMap size = ");
                ConcurrentHashMap<Long, InterfaceC420801kM> concurrentHashMap2 = C916430ZxJ.LIZJ;
                sbLIZ2.append(concurrentHashMap2.size());
                sbLIZ2.append(",inviteeDisposableMap size= ");
                ConcurrentHashMap<Long, InterfaceC420801kM> concurrentHashMap3 = C916430ZxJ.LIZ;
                sbLIZ2.append(concurrentHashMap3.size());
                C20441214yg.LJIIIZ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ2));
                Iterator<Map.Entry<Long, InterfaceC420801kM>> it2 = concurrentHashMap2.entrySet().iterator();
                Iterator<Map.Entry<Long, InterfaceC420801kM>> it3 = concurrentHashMap3.entrySet().iterator();
                while (it2.hasNext()) {
                    C916430ZxJ.LJFF(it2.next().getKey().longValue());
                }
                while (it3.hasNext()) {
                    C916430ZxJ.LJI(it3.next().getKey().longValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("clear, e = ");
                sbLIZ3.append(e);
                C20441214yg.LJ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ3));
            }
            C916430ZxJ.LIZJ.clear();
            C916430ZxJ.LIZLLL.clear();
            C916430ZxJ.LIZ.clear();
            C916430ZxJ.LIZIZ.clear();
            C916430ZxJ.LJ = null;
            C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, C916430ZxJ.LJFF);
            C944220ag8.LIZ = 0;
            C944220ag8.LIZIZ = false;
            C944220ag8.LIZJ = false;
            C944220ag8.LJ = 0L;
            C944220ag8.LIZLLL = 0L;
            C949990apR.LIZ.clear();
            C744830TJp c744830TJp = C949990apR.LIZIZ;
            c744830TJp.LIZIZ();
            c744830TJp.LIZLLL = null;
            C915980Zwa.LJII().LJJLIIIJL(C954640aww.class, C949990apR.LIZJ);
            C925610aC7.LIZJ.LJ();
            C923450a8d.LIZJ(this.dataChannel);
            C01ZY.LIZ = "";
            C01ZY.LIZIZ = C386801es.DEFAULT;
            C20441214yg.LIZIZ("NoticeboardService", "NoticeboardService release");
            InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
            if (interfaceC945610aiNLIZ != null) {
                interfaceC945610aiNLIZ.LJI();
            }
            C948450amx.LIZIZ.LJI("NOTICE_BOARD_SERVICE");
            C01EU.LIZ = false;
            IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
            if (iActionHandlerService != null) {
                iActionHandlerService.setIsAnchor(false);
                if (LinkMicPlaybookAutoRunTechSwitchSetting.INSTANCE.isEnable()) {
                    iActionHandlerService.setAnchorChannel(null);
                }
            }
            C915690Zw7 c915690Zw7 = this.LLILLL;
            if (c915690Zw7 != null) {
                c915690Zw7.LIZIZ.zQ2(c915690Zw7);
                DataChannelGlobal.LLILZ.zQ2(c915690Zw7);
                if (LiveLinkControlPresenterOOMSetting.INSTANCE.isEnabled()) {
                    C924810aAp.LJ().LJI.remove(c915690Zw7.LJIIJ);
                }
                ((LinkedHashMap) c915690Zw7.LIZLLL).clear();
                ((LinkedHashMap) c915690Zw7.LJ).clear();
                if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isDetailOOMFixV2Enable()) {
                    this.LLILLL = null;
                }
            }
            C974310bSf c974310bSf = this.LLILZ;
            if (c974310bSf != null) {
                c974310bSf.LIZIZ.zQ2(c974310bSf);
                this.LLILZ = null;
            }
            C949640aos c949640aos = this.LLILZIL;
            if (c949640aos != null) {
                WeakReference<LifecycleOwner> weakReference = c949640aos.LIZIZ;
                if ((weakReference != null && (lifecycleOwner = weakReference.get()) != null) || (lifecycleOwner = c949640aos.LIZJ) != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("detach, lifecycleOwner = ");
                    sbLIZ4.append(lifecycleOwner);
                    C20441214yg.LIZIZ("MatchPlaybookEventHelper", C2188811AlT.LIZIZ(sbLIZ4));
                    DataChannel dataChannel = c949640aos.LIZ;
                    if (dataChannel != null) {
                        dataChannel.zQ2(c949640aos);
                    }
                    DataChannel dataChannel2 = c949640aos.LIZ;
                    if (dataChannel2 != null) {
                        dataChannel2.GQ2(lifecycleOwner, PlaybookGuestServiceChannel.class, c949640aos.LJ);
                    }
                    DataChannel dataChannel3 = c949640aos.LIZ;
                    if (dataChannel3 != null) {
                        dataChannel3.GQ2(lifecycleOwner, PlaybookAnchorServiceV2Channel.class, c949640aos.LJFF);
                    }
                }
                this.LLILZIL = null;
            }
            C944410agR c944410agR = this.LLILZLL;
            if (c944410agR != null) {
                IMessageManager iMessageManager = c944410agR.LIZ;
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener((OnIMMessageListener) c944410agR.LIZIZ);
                }
                C915980Zwa.LJI().LIZJ().LLJL().clear();
                c944410agR.LIZ = null;
                this.LLILZLL = null;
            }
            C944330agJ c944330agJ = C944330agJ.LIZ;
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).l70(C944330agJ.LIZLLL);
            DataChannel dataChannel4 = C944330agJ.LIZJ;
            if (dataChannel4 != null) {
                dataChannel4.zQ2(c944330agJ);
            }
            C944330agJ.LIZJ = null;
            C944330agJ.LIZIZ = null;
            DataChannel dataChannel5 = this.dataChannel;
            if (dataChannel5 != null) {
                dataChannel5.zQ2(this);
            }
            C963630bBR c963630bBR = this.LLJJJJJIL;
            if (c963630bBR != null) {
                c963630bBR.stop();
                this.LLJJJJJIL = null;
            }
            ((Map) C943610af9.LIZ.getValue()).clear();
            if (this.LLJI && (c944380agO = this.LLJJIJIL) != null) {
                c944380agO.LIZ();
            }
            if (!this.LLIZLLLIL.LLILLJJLI) {
                this.LLIZLLLIL.dispose();
            }
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                C915980Zwa.LJIIIIZZ().R5();
                C915980Zwa.LJII().R5();
            }
            super.detachView();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C916430ZxJ.LIZJ.clear();
            C916430ZxJ.LIZLLL.clear();
            C916430ZxJ.LIZ.clear();
            C916430ZxJ.LIZIZ.clear();
            C916430ZxJ.LJ = null;
            C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, C916430ZxJ.LJFF);
            throw th;
        }
    }

    public final void LJJJLZIJ() {
        Room room = this.LLJ;
        boolean z = room != null && room.hasMultiLivePermissionAnchorSide();
        C917520Zz4.LIZIZ(new RunnableC514801zW(this.LLJ, 126));
        if (z) {
            ((InterfaceC944250agB) this.mView).NL2(true);
            C20441214yg.LJIIIZ("multi_init", "linkMic has already grant permission");
        } else {
            C20441214yg.LJIIIZ("multi_init", "has no permission from room, fallback to check host permission from server immediately");
            long jLIZIZ = C963140bAe.LIZIZ();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            C480460Ism.LIZ().getClass();
            ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).checkAnchorSelfPermission(this.LLJ.getId(), iHostAppContext.appId(), iHostAppContext.liveId()).LIZLLL(autoDisposeWithTransformer())).LIZ(new AfS5S0100100_15(jLIZIZ, this, 17), new AfS5S0100100_15(jLIZIZ, this, 18));
        }
        LJJJJZI(true);
    }

    public final boolean LJJJZ() {
        return LLJLIL || this.mView == 0 || !this.LLJI || !InterfaceC934710aQn.ab.LIZIZ().booleanValue() || C915980Zwa.LJIIIZ().Jf() || ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).co0() || C915980Zwa.LIZLLL().o1() || Boolean.FALSE.equals(this.dataChannel.gg0(CoHostOnboardPermitChannel.class));
    }

    public final void LJJL() {
        String string;
        MultiLiveUserSettings multiLiveUserSettings;
        List<Long> list;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        Integer num;
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Io0(this.LLJ)) {
            C917520Zz4.LIZIZ(new RunnableC168600km(0, this.LLJ));
            return;
        }
        long j = this.LLJ.getLinkMicInfo() != null ? this.LLJ.getLinkMicInfo().MultiLiveType : 0L;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncRoomStats layoutType= ");
        sbLIZ.append(j);
        sbLIZ.append("; multi_init isMultiGuestEntryEnable true");
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        MultiLiveUserSettings multiLiveUserSettings2 = this.LLJ.multiLiveUserSettings;
        if (multiLiveUserSettings2 == null || (multiLiveUserApplySettings = multiLiveUserSettings2.multiLiveUserApplySettings) == null || (num = multiLiveUserApplySettings.linkMicServiceVersion) == null || num.intValue() != 1) {
            this.LLJILJILJ = j == 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mIsGuestUseNewLayout else branch: ");
            sbLIZ2.append(this.LLJILJILJ);
            C20441214yg.LJIIIZ("multi_init", C2188811AlT.LIZIZ(sbLIZ2));
            HashMap map = new HashMap();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
            sbLIZ3.append(j);
            map.put("layoutType", C2188811AlT.LIZIZ(sbLIZ3));
            map.put("mRoom is null", this.LLJ == null ? "true" : "false");
            Room room = this.LLJ;
            if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null) {
                map.put("mRoom.multiLiveUserSettings", multiLiveUserSettings.toString());
                MultiLiveUserApplySettings multiLiveUserApplySettings2 = this.LLJ.multiLiveUserSettings.multiLiveUserApplySettings;
                if (multiLiveUserApplySettings2 != null) {
                    map.put("mRoom.multiLiveUserSettings.multiLiveUserApplySettings", multiLiveUserApplySettings2.toString());
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("");
                    sbLIZ4.append(this.LLJ.multiLiveUserSettings.multiLiveUserApplySettings.linkMicServiceVersion);
                    map.put("linkMicServiceVersion", C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
            C1304660k3U.LIZ.LIZ(70001, "version before 27.7 will case data holder empty", map);
            MultiGuestSlardarMonitorOptSetting multiGuestSlardarMonitorOptSetting = MultiGuestSlardarMonitorOptSetting.INSTANCE;
            if (multiGuestSlardarMonitorOptSetting.isEnable()) {
                C924630aAX c924630aAX = C924630aAX.LIZ;
                MultiLiveUserSettings multiLiveUserSettings3 = this.LLJ.multiLiveUserSettings;
                if (multiGuestSlardarMonitorOptSetting.isEnable()) {
                    JSONObject jSONObject = new JSONObject();
                    c924630aAX.LJIIJJI(jSONObject, false);
                    if (multiLiveUserSettings3 == null || (string = multiLiveUserSettings3.toString()) == null) {
                        string = "null";
                    }
                    C0K04.LJFF("multiLiveUserSettings", string, jSONObject);
                    C0K04.LJFF("failed_reason", "setting_invalid", jSONObject);
                    c924630aAX.LJJJLIIL(0, "audience_init_multi_guest_failed", jSONObject, false);
                }
            }
        } else {
            this.LLJILJILJ = true;
            C20441214yg.LJIIIZ("multi_init", "mIsGuestUseNewLayout true");
        }
        if (this.LLJILJILJ) {
            C20441214yg.LJIIIZ("multi_init", "mIsGuestUseNewLayout --> true");
            C924660aAa.LIZJ = "live_play";
            ((InterfaceC944250agB) this.mView).pF(EnumC925190aBR.AUDIENCE_OPEN);
            if (this.LLJ.getLinkMicInfo() == null || (list = this.LLJ.getLinkMicInfo().audienceIdList) == null || list.size() <= 0) {
                C924810aAp.LJ().LJIIIZ(false);
            } else {
                C924810aAp.LJ().LJIIIZ(true);
            }
            if (this.LLJILJILJ && !LiveToolbarLoadOptimizeSetting.INSTANCE.enableMultiGuestIconOptimize(this.dataChannel)) {
                int iLJIIIIZZ = C925150aBN.LJIIIIZZ((InterfaceC925160aBO) this.mView, this.LLJ, this.LLJILJILJ);
                C917520Zz4.LIZIZ(new RunnableC168600km(iLJIIIIZZ, this.LLJ));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("handlerVisibleResult -->");
                sbLIZ5.append(iLJIIIIZZ);
                C20441214yg.LJIIIZ("multi_init", C2188811AlT.LIZIZ(sbLIZ5));
            }
        } else {
            C20441214yg.LJIIIZ("multi_init", "mIsGuestUseNewLayout --> false");
            Throwable th = new Throwable();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("not new multiguestV3+multilive, just skip not return..");
            sbLIZ6.append(j);
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ6), th);
        }
        C925080aBG.LJFF(this.LLJ, (InterfaceC944250agB) this.mView);
    }

    public final void LJJLI() {
        long jLJIIL;
        RoomLinkInfo linkMicInfo;
        RoomLinkInfo linkMicInfo2 = this.LLJ.getLinkMicInfo();
        if (linkMicInfo2 == null) {
            C955400ayA.LJJJJ();
            C0IR2.LIZJ(C00VQ.LIZ(this.LLJ));
            return;
        }
        if (C950220apo.LJIIL(this.LLJ) > 0) {
            jLJIIL = C950220apo.LJIIL(this.LLJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("identifyLinkModeWithRoom, cross_arc channelId = ");
            sbLIZ.append(jLJIIL);
            C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
            EnumC467700IVs.CROSS_ROOM_ARCH.getType();
        } else {
            Room room = this.LLJ;
            jLJIIL = (room == null || (linkMicInfo = room.getLinkMicInfo()) == null) ? 0L : linkMicInfo.channelId;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("identifyLinkModeWithRoom, multi_arc channelId = ");
            sbLIZ2.append(jLJIIL);
            C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
            EnumC467700IVs.MULTI_ARCH.getType();
        }
        C915980Zwa.LJI().LJIIJ().LJJJJZ(linkMicInfo2.rivalAnchorId);
        C915980Zwa.LJI().LIZJ().LJII(jLJIIL);
        if (C915980Zwa.LJI().LJIIJ().getChannelId() <= 0) {
            C955400ayA.LJJJJ();
            return;
        }
        new C955610ayV().LJIJJLI("room_enter_identify");
        C20441214yg.LJIIIZ("LinkControlPresenter", "identifyLinkModeWithRoom, CoHost On");
        C915980Zwa.LJI().LIZJ().LJLLLL(jLJIIL, EnumC470470Icf.ROOM_ENTER);
        ((InterfaceC944250agB) this.mView).Qz2(true, new C952540atY(EnumC944090afv.AUDIENCE_ROOM_ENTER, 1));
        C0IR2.LIZJ(C00VQ.LIZ(this.LLJ));
        BattleInfoResponse battleInfoResponse = linkMicInfo2.battleInfo;
        if (battleInfoResponse == null || battleInfoResponse.battleId.longValue() == 0) {
            C955430ayD.LJIIIIZZ("room_enter_cohost");
        } else {
            C955430ayD.LJIIIIZZ("room_enter_match");
        }
    }

    public final void LJJLIIIJJIZ() {
        InterfaceC420801kM interfaceC420801kM = this.LLILLJJLI;
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            this.LLILLJJLI.dispose();
        }
        LiveCohostPermissionPeriodSetting liveCohostPermissionPeriodSetting = LiveCohostPermissionPeriodSetting.INSTANCE;
        this.LLILLJJLI = ((C0J1N) C19490011Na.LIZ(liveCohostPermissionPeriodSetting.getValue(), liveCohostPermissionPeriodSetting.getValue(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(autoDispose())).LIZ(new AfS184S0100000_15(this, 210), new AfS184S0100000_15(this, 211));
    }

    public final void LJJLIIIJL() {
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).triggerReserveNotice(this.LLJ.getId(), true).LIZJ(autoDisposeWithTransformer())).LIZ(new AfS137S0000000_15(5), new AfS184S0100000_15(this, 211));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x041c  */
    /* JADX WARN: Type inference failed for: r0v74, types: [X.0agL] */
    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachView(X.InterfaceC944250agB r29) {
        /*
            Method dump skipped, instruction units count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C944270agD.attachView(X.0agB):void");
    }

    public final void LJJJJZI(boolean z) {
        long value;
        HashMap map = new HashMap();
        map.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        C955440ayE c955440ayE = new C955440ayE();
        C480460Ism.LIZ().getClass();
        C11NZ<C470590Icr<CheckPermissionResponse>> c11nzCheckPermissionV3 = ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).checkPermissionV3(this.LLJ.getId(), true, map);
        if (z) {
            value = LiveCohostPermissionRetryTimesSetting.INSTANCE.getValue();
        } else {
            value = 0;
        }
        ((C0J1N) c11nzCheckPermissionV3.LJJLIIIJL(value, new InterfaceC19483011Ki() { // from class: X.0ZyJ
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                C915980Zwa.LJI().LIZ().LJIIIIZZ(C915980Zwa.LJI().LIZ().LJJJJJL() + 1);
                return true;
            }
        }).LIZJ(autoDisposeWithTransformer())).LIZ(new AfS151S0200000_15(this, c955440ayE, 67), new AfS151S0200000_15(this, c955440ayE, 68));
    }

    public final void LJJJLIIL(C945320ahu c945320ahu) {
        boolean z;
        if (!this.LLJI && this.LLJJL != null && c945320ahu != null && !TextUtils.isEmpty(c945320ahu.LIZIZ)) {
            if (C915980Zwa.LJI().LJIIJ().LIZ()) {
                Map<String, Boolean> map = C958110b2X.LIZ;
                C958110b2X.LJIIJJI(C915980Zwa.LJI().LJIIJ().getChannelId());
                if (TextUtils.isEmpty(MultiCohostAreaExpandSetting.INSTANCE.getLastCohostLayoutId())) {
                    this.LLJJL.LIZ(c945320ahu);
                    return;
                }
                return;
            }
            this.LLJJL.LIZ(c945320ahu);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mSeihelper ");
        if (this.LLJJL == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("Identify", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIIJ(final X.EnumC925190aBR r15) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C944270agD.LJJLIIIIJ(X.0aBR):void");
    }

    public final boolean LJJLIIIJ(String str) {
        T t = this.mView;
        if (t == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getViewInterface() return null, ");
            sbLIZ.append(str);
            sbLIZ.append(" failed");
            C1AZW.LJIILJJIL("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
            C924630aAX c924630aAX = C924630aAX.LIZ;
            if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                JSONObject jSONObject = new JSONObject();
                c924630aAX.LJIIJJI(jSONObject, false);
                C0K04.LJFF("failed_reason", "linkWidgetNull", jSONObject);
                c924630aAX.LJJJLIIL(0, "audience_init_multi_guest_failed", jSONObject, false);
            }
            return false;
        }
        if (((InterfaceC919320a1y) t).getContext() == null) {
            C924630aAX c924630aAX2 = C924630aAX.LIZ;
            if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                JSONObject jSONObject2 = new JSONObject();
                c924630aAX2.LJIIJJI(jSONObject2, false);
                C0K04.LJFF("failed_reason", "linkWidgetCtxNull", jSONObject2);
                c924630aAX2.LJJJLIIL(0, "audience_init_multi_guest_failed", jSONObject2, false);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getViewInterface().getContext() return null, ");
            sbLIZ2.append(str);
            sbLIZ2.append(" failed");
            C1AZW.LJIILJJIL("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if (this.LLJ == null) {
            C924630aAX c924630aAX3 = C924630aAX.LIZ;
            if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                JSONObject jSONObject3 = new JSONObject();
                c924630aAX3.LJIIJJI(jSONObject3, false);
                C0K04.LJFF("failed_reason", "roomNull", jSONObject3);
                c924630aAX3.LJJJLIIL(0, "audience_init_multi_guest_failed", jSONObject3, false);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mRoom is null,");
            sbLIZ3.append(str);
            sbLIZ3.append("  initOneVnForGuestForBase failed");
            C1AZW.LJIILJJIL("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        return true;
    }

    public final void LJJLIIIJILLIZJL(SeiAppData seiAppData) {
        RtcUserInfo rtcUserInfoG0;
        MultiLiveUserSettings multiLiveUserSettings;
        ArrayMap<Integer, Long> arrayMap;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seiAppData version ");
        sbLIZ.append(seiAppData.version);
        sbLIZ.append(", onSeiUpdated");
        C20441214yg.LIZIZ("Identify", C2188811AlT.LIZIZ(sbLIZ));
        if (seiAppData.version != 2 || TextUtils.isEmpty(seiAppData.channelId)) {
            return;
        }
        C917020ZyG c917020ZyG = this.LLJJLIIIJLLLLLLLZ;
        Object objValueOf = null;
        if (!seiAppData.LJIILL()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkWidgetStatus");
            sbLIZ2.append(", return by case 1, scene not match, scene=");
            SeiDsl seiDsl = seiAppData.dsl;
            if (seiDsl != null) {
                objValueOf = Integer.valueOf(seiDsl.scene);
            }
            sbLIZ2.append(objValueOf);
            sbLIZ2.append(' ');
            C20441214yg.LJIIIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ2));
        } else if (!C915980Zwa.LJII().LIZLLL()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("checkWidgetStatus");
            sbLIZ3.append(", return by case 2, isAttached = false");
            C20441214yg.LJIIIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            if (LiveCoHostIdentifyUnloadWidgetMockSetting.INSTANCE.isEnable()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("checkWidgetStatus");
                sbLIZ4.append(", try unload by case 1, -----mock-----");
                C20441214yg.LJIIIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ4));
                c917020ZyG.LIZ("unload_sei_mock");
            }
            List<SeiRegion> list = seiAppData.grids;
            if (list != null && list.size() > 1) {
                if (seiAppData.linkerArchType == EnumC467700IVs.CROSS_ROOM_ARCH.getType()) {
                    String str2 = seiAppData.groupChannelId;
                    InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ != null && (rtcUserInfoG0 = interfaceC954180awCLJIIIZ.G0()) != null) {
                        objValueOf = Long.valueOf(rtcUserInfoG0.groupChannelId);
                    }
                    long channelId = C915980Zwa.LJII().getChannelId();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("checkCrossArch");
                    sbLIZ5.append(", seiGroupChannelId=");
                    sbLIZ5.append(str2);
                    sbLIZ5.append(", sessionGroupChannelId=");
                    sbLIZ5.append(objValueOf);
                    sbLIZ5.append(", cacheGroupChannelId=");
                    sbLIZ5.append(channelId);
                    C20441214yg.LIZIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ5));
                    C931800aM6.LIZ.getClass();
                    if (!C931800aM6.LIZIZ() ? !(!C500260Jjc.LJJIIZ(str2) || Intrinsics.LJFF(str2, String.valueOf(channelId))) : !(!C500260Jjc.LJJIIZ(str2) || Intrinsics.LJFF(str2, String.valueOf(objValueOf)))) {
                        new C955610ayV().LJJIFFI(seiAppData.linkerArchType, "widget_unload_sei_channel_id_mismatch");
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("checkCrossArch");
                        sbLIZ6.append(", try unload by case 2, unload cross_arch, seiAppData.channelId=");
                        sbLIZ6.append(seiAppData.channelId);
                        sbLIZ6.append(", seiAppData.groupChannelId=");
                        sbLIZ6.append(seiAppData.groupChannelId);
                        sbLIZ6.append(", sessionChannelId=");
                        sbLIZ6.append(C915980Zwa.LJII().getChannelId());
                        C20441214yg.LJIIIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ6));
                        C950220apo.LJJ(seiAppData.groupChannelId);
                        c917020ZyG.LIZ("widget_unload_sei_channel_id_mismatch");
                    } else {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("checkCrossArch");
                        sbLIZ7.append(", return by case 2_1 , cross_arch match");
                        C20441214yg.LJIIIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ7));
                    }
                } else if (seiAppData.linkerArchType != EnumC467700IVs.MULTI_ARCH.getType() && seiAppData.linkerArchType != EnumC467700IVs.OLD_ARCH.getType()) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("checkWidgetStatus");
                    sbLIZ8.append(", linkerArchType=");
                    sbLIZ8.append(seiAppData.linkerArchType);
                    sbLIZ8.append(", skip widget recharge");
                    C20441214yg.LJIIIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ8));
                } else {
                    C915980Zwa.LJII().LLFII();
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("checkMultiArch");
                    sbLIZ9.append(", return by case 3_2 , multiCoHostService.hasMultiSession == false");
                    C20441214yg.LJIIIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ9));
                }
            } else {
                new C955610ayV().LJJIFFI(seiAppData.linkerArchType, "widget_unload_sei_count_less");
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("checkWidgetStatus");
                sbLIZ10.append(", try unload by case 1, size = ");
                List<SeiRegion> list2 = seiAppData.grids;
                if (list2 != null) {
                    objValueOf = Integer.valueOf(list2.size());
                }
                sbLIZ10.append(objValueOf);
                C20441214yg.LJIIIZ("MultiHostWidgetRechargeHelper", C2188811AlT.LIZIZ(sbLIZ10));
                c917020ZyG.LIZ("widget_unload_sei_count_less");
            }
        }
        Room room = this.LLJ;
        if (room != null && room.getId() != 0 && this.LLJ.getOwner() != null) {
            long j = CastLongProtector.parseLong(seiAppData.channelId);
            this.LLJ.getId();
            if (j == 0) {
                return;
            }
            SeiDsl seiDsl2 = seiAppData.dsl;
            if (seiDsl2 != null && !TextUtils.isEmpty(seiDsl2.layoutId)) {
                String str3 = seiAppData.dsl.layoutId;
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("Sei layoutId = ");
                sbLIZ11.append(str3);
                C20441214yg.LIZIZ("AreaExpand", C2188811AlT.LIZIZ(sbLIZ11));
                MultiCohostAreaExpandSetting multiCohostAreaExpandSetting = MultiCohostAreaExpandSetting.INSTANCE;
                if (!str3.equals(multiCohostAreaExpandSetting.getLastCohostLayoutId())) {
                    multiCohostAreaExpandSetting.setLastCohostLayoutId(str3);
                    DataChannel dataChannel = this.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.zW(CoHostAudienceAreaExpandChannel.class, Boolean.valueOf(MultiCohostExpandLayoutIdsSetting.INSTANCE.isLayoutIdExpanded(str3)));
                    }
                }
            }
            C970290bMB c970290bMB = C970290bMB.LIZ;
            if (C970290bMB.LJIL && C970290bMB.LJIJJLI >= 0 && C970290bMB.LJJ != 0 && (str = seiAppData.channelId) != null && str.length() != 0 && Long.valueOf(seiAppData.battleId) != null) {
                long j2 = seiAppData.battleId;
                if (j2 != 0) {
                    long j3 = C970290bMB.LJIJJ;
                    if (j3 != 0 && j2 == j3) {
                        C970290bMB.LJIL = false;
                        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                        long channelId2 = C915980Zwa.LJI().LJIIJ().getChannelId();
                        if (room2 != null && Long.valueOf(room2.getId()) != null) {
                            C480460Ism.LIZ().getClass();
                            ((LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class)).getInfo(room2.getId(), channelId2, 0L, room2.getOwnerUserId(), EnumC970440bMQ.BATTLE_INFO_SCENE_COMPONENT_DISAPPEAR.getType()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0aig
                                /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
                                @Override // X.C09JN
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void accept(java.lang.Object r10) {
                                    /*
                                        r9 = this;
                                        java.lang.String r8 = "MatchComponentMonitor@38af.monitorSeiDataCheckDisappear$apiDisposable$1"
                                        X.C1C7U.LIZ(r8)
                                        com.bytedance.android.live.network.response.BaseResponse r10 = (com.bytedance.android.live.network.response.BaseResponse) r10
                                        T r6 = r10.data
                                        com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r6 = (com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse) r6
                                        java.lang.Long r1 = r6.battleId
                                        r5 = 1
                                        if (r1 == 0) goto L8a
                                        r0 = 1
                                    L11:
                                        java.lang.String r7 = "disappear"
                                        if (r0 == 0) goto L2a
                                        long r3 = X.C970290bMB.LJIJJ
                                        if (r1 == 0) goto L21
                                        long r1 = r1.longValue()
                                        int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                                        if (r0 == 0) goto L2a
                                    L21:
                                        java.lang.String r0 = "battle id not lasted , normal"
                                        X.C20441214yg.LIZIZ(r7, r0)
                                    L26:
                                        X.C1C7U.LIZIZ(r8)
                                        return
                                    L2a:
                                        com.bytedance.android.livesdk.model.message.battle.BattleSetting r1 = r6.setting
                                        if (r1 == 0) goto L84
                                        int r0 = r1.status
                                        if (r0 == r5) goto L37
                                        int r1 = r1.status
                                        r0 = 3
                                        if (r1 != r0) goto L84
                                    L37:
                                        X.0bMB r0 = X.C970290bMB.LIZ
                                        org.json.JSONObject r4 = new org.json.JSONObject
                                        r4.<init>()
                                        X.0bMC[] r6 = X.EnumC970300bMC.values()
                                        int r5 = r6.length
                                        r3 = 0
                                    L44:
                                        if (r3 >= r5) goto L73
                                        r2 = r6[r3]
                                        java.util.Map<java.lang.String, java.lang.String> r1 = X.C970290bMB.LIZJ
                                        java.lang.String r0 = r2.getScene()
                                        java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
                                        java.lang.Object r0 = r1.get(r0)
                                        java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                                        if (r0 == 0) goto L71
                                        int r0 = r0.length()
                                        if (r0 == 0) goto L71
                                        r0 = 0
                                    L5f:
                                        r0 = r0 ^ 1
                                        java.lang.String r1 = r2.getScene()
                                        if (r0 == 0) goto L6e
                                        r0 = r7
                                    L68:
                                        X.C0K04.LJFF(r1, r0, r4)
                                        int r3 = r3 + 1
                                        goto L44
                                    L6e:
                                        java.lang.String r0 = ""
                                        goto L68
                                    L71:
                                        r0 = 1
                                        goto L5f
                                    L73:
                                        java.lang.String r1 = "disappear_reason"
                                        int r0 = X.C970290bMB.LJIJJLI
                                        X.C0K04.LIZLLL(r0, r1, r4)
                                        boolean r2 = X.C970290bMB.LJIIIIZZ
                                        boolean r1 = X.C970290bMB.LJIIIZ
                                        java.lang.String r0 = "component_abnormal_disappear"
                                        X.C970290bMB.LJJIIZ(r0, r4, r2, r1)
                                        goto L26
                                    L84:
                                        X.0bMB r0 = X.C970290bMB.LIZ
                                        X.C970290bMB.LJJIII()
                                        goto L26
                                    L8a:
                                        r0 = 0
                                        goto L11
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C945800aig.accept(java.lang.Object):void");
                                }
                            }, new C09JN() { // from class: X.00op
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("MatchComponentMonitor@38af.monitorSeiDataCheckDisappear$apiDisposable$2");
                                    C20441214yg.LJII((Throwable) obj);
                                    C1C7U.LIZIZ("MatchComponentMonitor@38af.monitorSeiDataCheckDisappear$apiDisposable$2");
                                }
                            });
                        }
                    } else {
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append("disappear battleId = ");
                        sbLIZ12.append(C970290bMB.LJIJJ);
                        sbLIZ12.append(" and seiBattleId = ");
                        sbLIZ12.append(seiAppData.battleId);
                        C20441214yg.LIZIZ("disappear", C2188811AlT.LIZIZ(sbLIZ12));
                    }
                }
            }
            EnumC467700IVs.MULTI_ARCH.getType();
            C958110b2X.LJIIJJI(j);
            Integer numValueOf = Integer.valueOf(seiAppData.linkerArchType);
            EnumC467700IVs enumC467700IVs = EnumC467700IVs.CROSS_ROOM_ARCH;
            if (numValueOf.intValue() != enumC467700IVs.getType()) {
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append("checkSessionForCrossArch");
                sbLIZ13.append(", return by case 1, archType = ");
                sbLIZ13.append(numValueOf);
                C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ13));
                return;
            }
            String str4 = seiAppData.channelId;
            if (str4 != null && str4.length() != 0 && !Intrinsics.LJFF(str4, CardStruct.IStatusCode.DEFAULT)) {
                if (!C915980Zwa.LJII().LIZLLL()) {
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("checkSessionForCrossArch");
                    sbLIZ14.append(", return by case 3, isAttached = false");
                    C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ14));
                    return;
                }
                if (MultiHostCrossAdapterImpl.LLLIIIL) {
                    long jLJJ = C950220apo.LJJ(str4);
                    if (C915980Zwa.LJII().QP(jLJJ)) {
                        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                        sbLIZ15.append("checkSessionForCrossArch");
                        sbLIZ15.append(", return by case 5, isCrossSessionValid = true");
                        C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ15));
                        return;
                    }
                    new C955610ayV().LJJIFFI(enumC467700IVs.getType(), "session_create");
                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                    sbLIZ16.append("checkSessionForCrossArch");
                    sbLIZ16.append(", opt_enable = true, ensureGroupSession, innerChannelId=");
                    sbLIZ16.append(str4);
                    C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ16));
                    Room roomLIZJ = C950220apo.LIZJ();
                    if (roomLIZJ != null && (multiLiveUserSettings = roomLIZJ.multiLiveUserSettings) != null && (arrayMap = multiLiveUserSettings.channelMap) != null) {
                        arrayMap.put(2, Long.valueOf(jLJJ));
                    }
                    C915980Zwa.LJII().zc2();
                    C915980Zwa.LJII().RA1("checkSessionForCrossArch");
                    return;
                }
                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                sbLIZ17.append("checkSessionForCrossArch");
                sbLIZ17.append(", return by case 4, shouldCrossArchBuilded = false");
                C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ17));
                return;
            }
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append("checkSessionForCrossArch");
            sbLIZ18.append(", return by case 2, innerChannelId = ");
            sbLIZ18.append(str4);
            C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ18));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJJI(int i) {
        if (this.LLJI) {
            return;
        }
        C20441214yg.LIZIZ("multi_init", "audience side enableMultiGuest by CHxMG");
        this.LLJILJILJ = true;
        C924660aAa.LIZJ = "others";
        InterfaceC944250agB interfaceC944250agB = (InterfaceC944250agB) this.mView;
        if (interfaceC944250agB != null && this.LLJ != null) {
            if (C930540aK4.LJJIII() && C915980Zwa.LJIIIIZZ().LLJLL() != null) {
                C915980Zwa.LJIIIIZZ().LLJLL().LLFFF(C963530bBH.LIZLLL);
            }
            int iIntValue = ((Integer) C924790aAn.LIZLLL().LIZIZ).intValue();
            interfaceC944250agB.az0();
            interfaceC944250agB.pF(EnumC925190aBR.AUDIENCE_OPEN);
            C925080aBG.LJFF(this.LLJ, interfaceC944250agB);
            C925150aBN.LJII(this.dataChannel);
            if (1 == i) {
                C924790aAn.LIZLLL().LJII(Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (c262100zr.LIZ.equals("LiveCohostSettingUpdatedEvent")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null) {
                C20441214yg.LIZIZ("LinkControlPresenter", "onCohostSettingUpdated params is null");
                return;
            }
            try {
                if (interfaceC1107590evd.hasKey(String.valueOf(17))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onCohostSettingUpdated AllowCoHostSuggestionsFromAudience=");
                    sbLIZ.append(interfaceC1107590evd.getBoolean(String.valueOf(17)));
                    C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC934710aQn.ob.LJFF(Boolean.valueOf(interfaceC1107590evd.getBoolean(String.valueOf(17))));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onCohostSettingUpdated error");
                sbLIZ2.append(e);
                C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public void onEvent(C914740Zua c914740Zua) {
        if (this.mView == 0) {
            return;
        }
        C915980Zwa.LJI().LJIIJ().LJ(EnumC973640bRa.LIVE_FEST_PAGE.getValue());
        C961300b7g c961300b7g = C961300b7g.LIZ;
        DataChannel dataChannel = this.dataChannel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.mView;
        c961300b7g.getClass();
        C961300b7g.LJIIJ(c961300b7g, dataChannel, lifecycleOwner, null, c914740Zua, false, null, 48);
    }

    public void onEvent(C944550agf c944550agf) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        int i = c944550agf.LIZ;
        if (i != 1) {
            if (i == 2) {
                ((InterfaceC944250agB) t).YJ(3L);
                return;
            }
            return;
        }
        ((InterfaceC944250agB) t).AC(LLJL.longValue());
    }

    public void onEvent(C926240aD8 c926240aD8) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((InterfaceC944250agB) t).Gq1();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[PHI: r6
      0x00bc: PHI (r6v11 java.lang.String) = (r6v1 java.lang.String), (r6v13 java.lang.String) binds: [B:28:0x00ba, B:26:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6 A[PHI: r6
      0x00c6: PHI (r6v10 java.lang.String) = (r6v1 java.lang.String), (r6v11 java.lang.String) binds: [B:28:0x00ba, B:30:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9 A[PHI: r6 r7
      0x00c9: PHI (r6v2 java.lang.String) = (r6v10 java.lang.String), (r6v11 java.lang.String) binds: [B:32:0x00c7, B:30:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r7v0 java.lang.String) = (r7v8 java.lang.String), (r7v10 java.lang.String) binds: [B:32:0x00c7, B:30:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[PHI: r6 r7
      0x00d3: PHI (r6v9 java.lang.String) = (r6v2 java.lang.String), (r6v10 java.lang.String) binds: [B:34:0x00d1, B:32:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r7v7 java.lang.String) = (r7v0 java.lang.String), (r7v8 java.lang.String) binds: [B:34:0x00d1, B:32:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[PHI: r2 r6 r7
      0x00d6: PHI (r2v50 java.lang.String) = (r2v6 java.lang.String), (r2v51 java.lang.String) binds: [B:34:0x00d1, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r6v8 java.lang.String) = (r6v2 java.lang.String), (r6v9 java.lang.String) binds: [B:34:0x00d1, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r7v6 java.lang.String) = (r7v0 java.lang.String), (r7v7 java.lang.String) binds: [B:34:0x00d1, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb A[PHI: r2 r6 r7 r8
      0x00eb: PHI (r2v7 java.lang.String) = (r2v50 java.lang.String), (r2v51 java.lang.String) binds: [B:41:0x00e9, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r6v3 java.lang.String) = (r6v8 java.lang.String), (r6v9 java.lang.String) binds: [B:41:0x00e9, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r7v1 java.lang.String) = (r7v6 java.lang.String), (r7v7 java.lang.String) binds: [B:41:0x00e9, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r8v1 java.lang.String) = (r8v5 java.lang.String), (r8v0 java.lang.String) binds: [B:41:0x00e9, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJLJLI(X.EnumC919210a1n r13, java.lang.Boolean r14) {
        /*
            Method dump skipped, instruction units count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C944270agD.LJJLIIIJLJLI(X.0a1n, java.lang.Boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Zxv] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0agW] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0aFa] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0aFS] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0aFU] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Zxw] */
    public C944270agD(Room room, boolean z, LiveMode liveMode, C934350aQD c934350aQD) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("oneVn_");
        sbLIZ.append(C944270agD.class.getSimpleName());
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZ = new Object() { // from class: X.0agW
            public static final /* synthetic */ int LIZ = 0;
        };
        this.LLIZLLLIL = new C11NJ();
        this.LLJILLL = new InterfaceC968210bIp() { // from class: X.0aFa
            @Override // X.InterfaceC968210bIp
            public final void LLLLIIL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC968210bIp
            public final void LLLLLLLZIL(InterfaceC954180awC interfaceC954180awC) {
                boolean z2;
                DataChannel dataChannel;
                MultiGuestDataHolder multiGuestDataHolderLIZJ;
                if (interfaceC954180awC != null && interfaceC954180awC.LJLIIIL()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C944270agD c944270agD = this.LL;
                if (!c944270agD.LLJI) {
                    if (z2 && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null) {
                        multiGuestDataHolderLIZJ.LJIIZILJ(true);
                        return;
                    }
                    return;
                }
                if (!z2 || (dataChannel = c944270agD.dataChannel) == null) {
                    return;
                }
                C917140ZyS.LJIIJ(dataChannel);
            }
        };
        this.LLJJ = new C921870a65() { // from class: X.0aFS
            @Override // X.C921870a65, X.InterfaceC964770bDH
            public final void LJJIIZI(String str, String str2) {
                DataChannel dataChannel;
                Map<String, Object> map = C1338270kvh.LIZ;
                if (!TextUtils.isEmpty(str2) && (dataChannel = this.LL.dataChannel) != null) {
                    dataChannel.zW(RtcSeiReceivedChannel.class, str2);
                }
            }

            @Override // X.C921870a65, X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
                if (this.LL.LLJI) {
                    return;
                }
                LinkUser linkUser = kickOutMessage.owner;
                if (linkUser != null && linkUser.userId.longValue() != C930540aK4.LJIIL()) {
                    return;
                }
                LinkMessage linkMessage = new LinkMessage();
                linkMessage.scene = 4;
                this.LL.LLJJJJLIIL.LLJJLIIIJLLLLLLLZ(linkMessage);
                C919310a1x.LIZ("LinkControlPresenter", "guest kickOuted by host");
            }

            @Override // X.C921870a65, X.InterfaceC964770bDH
            public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
                C944270agD c944270agD = this.LL;
                if (c944270agD.LLJI) {
                    return;
                }
                if (C943590af7.LIZLLL(c944270agD.dataChannel, 1, "onCreateChannelMessageReceived")) {
                    C20441214yg.LIZIZ("LinkControlPresenter", "onCreateChannelMessageReceived return, notify mg");
                    return;
                }
                C919310a1x.LIZ("LinkControlPresenter", "host opened linkmic by createChannel");
                this.LL.LLJILJILJ = true;
                C924810aAp.LJ().LJIILJJIL = createChannelMessage.owner.linkMicId;
                C924660aAa.LIZJ = "others";
                C944270agD c944270agD2 = this.LL;
                InterfaceC944250agB interfaceC944250agB = (InterfaceC944250agB) c944270agD2.mView;
                if (interfaceC944250agB != null && c944270agD2.LLJ != null) {
                    interfaceC944250agB.pF(EnumC925190aBR.AUDIENCE_OPEN);
                    if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Io0(this.LL.LLJ)) {
                        C925080aBG.LJFF(this.LL.LLJ, interfaceC944250agB);
                    }
                }
            }

            @Override // X.C921870a65, X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
                Map<Long, Long> map;
                LinkUser linkUser;
                if (this.LL.LLJ != null && C916490ZxP.LIZJ() != null && (map = C916490ZxP.LIZJ().LJJIIZ) != null && (linkUser = leaveMessage.leftUser) != null) {
                    if (((ArrayMap) map).containsValue(linkUser.userId)) {
                        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                        long id = this.LL.LLJ.getId();
                        long jLongValue = leaveMessage.leftUser.userId.longValue();
                        Long l = (Long) ((ArrayMap) multiGuestDataHolderLIZJ.LJJIIZ).get(Long.valueOf(id));
                        if (l != null && l.longValue() == jLongValue) {
                            ((ArrayMap) multiGuestDataHolderLIZJ.LJJIIZ).remove(Long.valueOf(id));
                        }
                    }
                }
            }

            @Override // X.C921870a65, X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
                InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
                DataChannel dataChannel;
                DataChannel dataChannel2;
                LinkMessage linkMessage = new LinkMessage();
                linkMessage.scene = 4;
                ExtraDataWrapper extraDataWrapper = destroyChannelMessage.customMessage.extra;
                if (extraDataWrapper != null && (extraDataWrapper.getContent() instanceof Long)) {
                    linkMessage.extraStr = extraDataWrapper.getContent().toString();
                }
                try {
                    if (CastLongProtector.parseLong(linkMessage.extraStr) == 10002) {
                        if (num != null && num.intValue() >= 2 && (dataChannel2 = this.LL.dataChannel) != null) {
                            dataChannel2.zW(MultiGuestIsLinkedAsGuestForMicRoomChangeChannel.class, Boolean.TRUE);
                        }
                        if (num2 != null && num2.intValue() >= 2 && (dataChannel = this.LL.dataChannel) != null) {
                            dataChannel.zW(MultiGuestIsLinkedAsAudienceForMicRoomChannelChannel.class, Boolean.TRUE);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                this.LL.LLJJJJLIIL.S0(linkMessage);
                C919310a1x.LIZ("LinkControlPresenter", "host close linkmic by destroyChannel");
                T t = this.LL.mView;
                if (t != 0 && (interfaceC665370Q7zLIZIZ = C926770aDz.LIZIZ(t)) != null) {
                    C926770aDz.LIZ(interfaceC665370Q7zLIZIZ, false);
                }
                C917720ZzO c917720ZzO = C917720ZzO.LIZ;
                DataChannel dataChannel3 = this.LL.dataChannel;
                c917720ZzO.getClass();
                C917720ZzO.LJIIIZ(dataChannel3, 2);
                Room room2 = this.LL.LLJ;
                if (room2 != null) {
                    room2.setWithLinkMic(false);
                }
                if (RestartLiveSetting.INSTANCE.getConfig().getEnable() && !this.LL.LLJI && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).g92()) {
                    C930480aJy.LJJIJIIJI(2131855729, "ttlive_restartLive_hostScreen_restartGuestToast", "");
                }
            }
        };
        this.LLJJI = new C921870a65() { // from class: X.0aFU
        };
        this.LLJJIII = new C915630Zw1() { // from class: X.0Zxw
            @Override // X.C915630Zw1, X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
                try {
                    if (LiveSdkMultiGuestLayoutTypeDestroyChannelSetting.INSTANCE.isEnable() && i == 2) {
                        return;
                    }
                    MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    multiGuestDataHolderLIZJ.LJJIFFI(C927600aFK.LJIIIZ());
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLayoutSwitch, new layoutBusinessType = ");
                    sbLIZ2.append(interfaceC937820aVo.getLayoutBusinessType());
                    C919310a1x.LIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LL.logThrowable(th);
                }
            }
        };
        this.LLJJIJI = new C916920Zy6() { // from class: X.0Zxv
            public static EnumC918970a1P LIZIZ(Integer num) {
                int panelLayoutType = C940770aaZ.LIZ().getDataSource().getPanelLayoutType();
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                if (C01ZD.LIZ(7) && panelLayoutType == 1) {
                    return EnumC918970a1P.NORMAL;
                }
                if (num.intValue() == 4) {
                    return EnumC918970a1P.GRID_FIX;
                }
                if (num.intValue() == 3) {
                    return EnumC918970a1P.GRID;
                }
                if (num.intValue() == 2) {
                    return EnumC918970a1P.FLOATING_FIX;
                }
                if (num.intValue() == 1) {
                    return EnumC918970a1P.FLOATING;
                }
                return EnumC918970a1P.NORMAL;
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                try {
                    Integer numValueOf = Integer.valueOf(C940770aaZ.LIZ().getDataSource().LJII());
                    if (C916490ZxP.LIZJ() != null) {
                        C916490ZxP.LIZJ().LJJIFFI(LIZIZ(numValueOf));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLayoutRenderSuccessEnd, layoutStyle = ");
                    sbLIZ2.append(numValueOf);
                    C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.logThrowable(th);
                }
            }
        };
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = new C944260agC(this);
        this.LLJJL = new C944310agH(this);
        this.LLJJLIIIJLLLLLLLZ = new C917020ZyG(this);
        this.LLJ = room;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("roomId = ");
        sbLIZ2.append(room.getId());
        sbLIZ2.append("   OwnerUserId = ");
        sbLIZ2.append(room.getOwnerUserId());
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLJI = z;
        this.LLJIJIL = liveMode;
        this.LLJILJIL = c934350aQD;
        C948450amx.LIZIZ.LIZJ(this);
    }
}
