package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch;

import X.AbstractC948890anf;
import X.C001A;
import X.C01GW;
import X.C01NB;
import X.C01Z4;
import X.C09JN;
import X.C0IL2;
import X.C0INV;
import X.C0KX4;
import X.C0UO0;
import X.C1161920gLG;
import X.C11NJ;
import X.C162100jj;
import X.C19487311Lz;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2276261E7s;
import X.C452501pT;
import X.C466310IQj;
import X.C473410IhP;
import X.C480460Ism;
import X.C500260Jjc;
import X.C776250Uch;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C924640aAY;
import X.C930540aK4;
import X.C945370ahz;
import X.C947520alS;
import X.C948840ana;
import X.C948850anb;
import X.C948880ane;
import X.C963140bAe;
import X.EnumC948930anj;
import X.InterfaceC466320IQk;
import X.InterfaceC954180awC;
import Y.ARunnableS115S0100000_15;
import Y.AfS184S0100000_15;
import Y.AfS67S0201000_15;
import Y.AfS82S0101000_15;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.JoinCurrentRoomByRandomMatchEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.JoinOtherRoomByRandomMatchEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.RandomMatchLinkedIMEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.service.LinkMicMatchService;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestRecommendRoomsParams;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelReq;
import com.bytedance.android.livesdk.dataChannel.RandomMatchInsertRoomEvent;
import com.bytedance.android.livesdk.dataChannel.TopLiveHangoutInteractTypeData;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveRandomSwitchButtonSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.MultiGuestRandomMatchMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.RandomMatchInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class RandomMatchGuestViewModel extends ViewModel {
    public final DataChannel LL;
    public String LLILLL;
    public int LLILZ;
    public C466310IQj LLILZLL;
    public final long LLIZLLLIL;
    public final long LLJ;
    public final ARunnableS115S0100000_15 LLJI;
    public final C948840ana LLJIJIL;
    public final MutableLiveData<C948850anb> LLILLJJLI = new MutableLiveData<>(new C948850anb(0));
    public AbstractC948890anf LLILZIL = C945370ahz.LIZIZ;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(95));

    public final void wQ2() {
        String str;
        Context context;
        User user;
        C948850anb value = this.LLILLJJLI.getValue();
        C947520alS.LIZ(C500260Jjc.LJJJI(value != null ? Boolean.valueOf(value.LJI) : null) ? "randmatch_apply" : "randmatch_invite");
        Long lLJII = C930540aK4.LJII();
        C948850anb value2 = this.LLILLJJLI.getValue();
        if (Intrinsics.LJFF(lLJII, (value2 == null || (user = value2.LJ) == null) ? null : Long.valueOf(user.getId()))) {
            DataChannel dataChannel = this.LL;
            C948850anb value3 = this.LLILLJJLI.getValue();
            dataChannel.LC0(JoinCurrentRoomByRandomMatchEvent.class, C500260Jjc.LJJJI(value3 != null ? Boolean.valueOf(value3.LJI) : null) ? "multi_guest_invite_random_match_apply" : "multi_guest_invite_random_match_invite");
            return;
        }
        C948850anb value4 = this.LLILLJJLI.getValue();
        String str2 = C500260Jjc.LJJJI(value4 != null ? Boolean.valueOf(value4.LJI) : null) ? "randmatch_apply" : "randmatch_join";
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("enter_method", str2);
        map.put("enter_from_merge", "live_detail");
        RandomMatchGuestViewModel randomMatchGuestViewModel = C947520alS.LIZ;
        if (randomMatchGuestViewModel == null || (str = randomMatchGuestViewModel.LLILLL) == null) {
            str = "";
        }
        map.put("guest_request_id", str);
        map.put("action_type", "click");
        map.put("is_multi_continuous_match", Intrinsics.LJFF(str2, "continuous_match") ? "1" : CardStruct.IStatusCode.DEFAULT);
        C0KX4.LIZ("livesdk_live_show", map, null, true);
        C948850anb value5 = this.LLILLJJLI.getValue();
        if (value5 != null) {
            long j = value5.LJFF;
            C948850anb value6 = this.LLILLJJLI.getValue();
            User user2 = value6 != null ? value6.LJ : null;
            Function0 function0 = (Function0) this.LL.gg0(C2276261E7s.class);
            boolean z = function0 != null && ((Boolean) function0.invoke()).booleanValue();
            boolean zEnable = MultiLiveRandomSwitchButtonSetting.INSTANCE.enable();
            boolean zLJFF = Intrinsics.LJFF(this.LL.gg0(TopLiveHangoutInteractTypeData.class), Boolean.TRUE);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isInFeedStream: ");
            sbLIZ.append(z);
            sbLIZ.append(", settingEnabled: ");
            sbLIZ.append(zEnable);
            sbLIZ.append(", isInHangoutInteract: ");
            sbLIZ.append(zLJFF);
            C20441214yg.LIZIZ("chenzepeng_test", C2188811AlT.LIZIZ(sbLIZ));
            String str3 = "bottom_bar_change";
            String str4 = "randmatch_click";
            if (zEnable && z) {
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.roomId = j;
                roomsData.enterMethod = str2;
                roomsData.enterFromMerge = "live_detail";
                roomsData.userId = String.valueOf(user2 != null ? Long.valueOf(user2.getId()) : null);
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                if (!Intrinsics.LJFF(this.LLILZIL, C948880ane.LIZIZ)) {
                    int i = this.LLILZ;
                    str3 = (i == 2 || i == 3) ? "randmatch_click" : "randmatch_apply_auto";
                }
                roomsData2.randomMatchLinkPageEntrance = str3;
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                roomsData3.shareSource = "deeplink_share_source";
                C948850anb value7 = this.LLILLJJLI.getValue();
                roomsData3.shareIntent = C500260Jjc.LJJJI(value7 != null ? Boolean.valueOf(value7.LJI) : null) ? "multi_guest_invite_random_match_apply" : "multi_guest_invite_random_match_invite";
                EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
                roomsData4.mgEnterType = 11;
                roomsData4.mgFromSourceUserId = user2 != null ? user2.getId() : 0L;
                enterRoomConfig.mLogData.guestRequestId = this.LLILLL;
                enterRoomConfig.mRoomsData.multiGuestMatchType = 1;
                Room room = new Room();
                room.setId(j);
                room.setOwner(user2);
                this.LL.FQ2(JoinOtherRoomByRandomMatchEvent.class);
                this.LL.LC0(RandomMatchInsertRoomEvent.class, new Pair(room, enterRoomConfig));
                return;
            }
            if (zLJFF) {
                EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig2.mRoomsData;
                roomsData5.hangoutEnterSource = "interact";
                roomsData5.roomId = j;
                roomsData5.enterMethod = str2;
                roomsData5.enterFromMerge = "live_detail";
                roomsData5.userId = String.valueOf(user2 != null ? Long.valueOf(user2.getId()) : null);
                EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig2.mRoomsData;
                if (!Intrinsics.LJFF(this.LLILZIL, C948880ane.LIZIZ)) {
                    int i2 = this.LLILZ;
                    str3 = (i2 == 2 || i2 == 3) ? "randmatch_click" : "randmatch_apply_auto";
                }
                roomsData6.randomMatchLinkPageEntrance = str3;
                EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig2.mRoomsData;
                roomsData7.shareSource = "deeplink_share_source";
                C948850anb value8 = this.LLILLJJLI.getValue();
                roomsData7.shareIntent = C500260Jjc.LJJJI(value8 != null ? Boolean.valueOf(value8.LJI) : null) ? "multi_guest_invite_random_match_apply" : "multi_guest_invite_random_match_invite";
                EnterRoomConfig.RoomsData roomsData8 = enterRoomConfig2.mRoomsData;
                roomsData8.mgEnterType = 11;
                roomsData8.mgFromSourceUserId = user2 != null ? user2.getId() : 0L;
                enterRoomConfig2.mLogData.guestRequestId = this.LLILLL;
                enterRoomConfig2.mRoomsData.multiGuestMatchType = 1;
                Room room2 = new Room();
                room2.setId(j);
                room2.setOwner(user2);
                this.LL.FQ2(JoinOtherRoomByRandomMatchEvent.class);
                this.LL.LC0(RandomMatchInsertRoomEvent.class, new Pair(room2, enterRoomConfig2));
                return;
            }
            this.LL.FQ2(JoinOtherRoomByRandomMatchEvent.class);
            if (RandomMatchContextCrashFixSetting.INSTANCE.isFix()) {
                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                if (iHostAction == null) {
                    return;
                } else {
                    context = iHostAction.getTopValidContext();
                }
            } else {
                context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
            }
            if (context != null) {
                Uri.Builder builderAuthority = new Uri.Builder().scheme("sslocal").authority("webcast_room");
                C948850anb value9 = this.LLILLJJLI.getValue();
                Uri.Builder builderAppendQueryParameter = builderAuthority.appendQueryParameter("room_id", String.valueOf(value9 != null ? Long.valueOf(value9.LJFF) : null)).appendQueryParameter("enter_method", str2).appendQueryParameter("enter_from_merge", "live_detail");
                int i3 = this.LLILZ;
                if (i3 != 2 && i3 != 3) {
                    str4 = "randmatch_apply_auto";
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("random_match_link_page_entrance", str4);
                C948850anb value10 = this.LLILLJJLI.getValue();
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("share_live_intent", C500260Jjc.LJJJI(value10 != null ? Boolean.valueOf(value10.LJI) : null) ? "multi_guest_invite_random_match_apply" : "multi_guest_invite_random_match_invite").appendQueryParameter("guest_request_id", this.LLILLL).appendQueryParameter("mg_enter_type", "11").appendQueryParameter("mg_from_source_user_id", String.valueOf(user2 != null ? user2.getId() : 0L));
                if (zEnable) {
                    builderAppendQueryParameter3.appendQueryParameter("multi_guest_match_type", "1");
                }
                Uri uriBuild = builderAppendQueryParameter3.build();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("join, URL->");
                sbLIZ2.append(uriBuild);
                C20441214yg.LIZIZ("RandomMatchGuestViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, uriBuild);
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LLIZ.getValue()).LJ();
        C466310IQj c466310IQj = this.LLILZLL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        this.LLILZLL = null;
        IMessageManager iMessageManager = (IMessageManager) this.LL.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLJIJIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0ana, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public RandomMatchGuestViewModel(DataChannel dataChannel) {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RandomMatchInfo randomMatchInfo;
        this.LL = dataChannel;
        this.LLILLL = "";
        MultiGuestSocialConfigSetting multiGuestSocialConfigSetting = MultiGuestSocialConfigSetting.INSTANCE;
        this.LLIZLLLIL = multiGuestSocialConfigSetting.getConfig().randomMatchTimeoutSecond * 1000;
        this.LLJ = multiGuestSocialConfigSetting.getConfig().randomMatchAutoPermitMills;
        this.LLJI = new ARunnableS115S0100000_15(this, 46);
        ?? r2 = new OnIMMessageListener() { // from class: X.0ana
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "randommatch-message-channel";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                if (iMessage != null && (iMessage instanceof MultiGuestRandomMatchMessage)) {
                    MultiGuestRandomMatchMessage multiGuestRandomMatchMessage = (MultiGuestRandomMatchMessage) iMessage;
                    int i = multiGuestRandomMatchMessage.matchStatus;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                C947520alS.LIZ("apply_accepted");
                                this.LL.LL.FQ2(RandomMatchLinkedIMEvent.class);
                                this.LL.zQ2("linkedIM");
                                return;
                            }
                            return;
                        }
                        C947520alS.LIZ("fail_match");
                        this.LL.yQ2("timeOutIM");
                        return;
                    }
                    this.LL.BQ2("invitedIM", multiGuestRandomMatchMessage.authorUser, multiGuestRandomMatchMessage.roomId, false);
                }
            }
        };
        this.LLJIJIL = r2;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != 0) {
            iMessageManager.addMessageListener(C001A.MULTI_GUEST_RANDOM_MATCH_MESSAGE.getIntType(), (OnIMMessageListener) r2);
        }
        Room roomLIZ = C162100jj.LIZ(dataChannel);
        if (roomLIZ != null && (multiLiveUserSettings = roomLIZ.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (randomMatchInfo = multiLiveUserApplySettings.randomMatchInfo) != null && randomMatchInfo.startTimestamp > 0) {
            this.LLILLL = randomMatchInfo.requestId;
            Integer numLJJLIIJ = C500260Jjc.LJJLIIJ(randomMatchInfo.requestSource);
            this.LLILZ = numLJJLIIJ != null ? numLJJLIIJ.intValue() : 0;
            long j = randomMatchInfo.startTimestamp;
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            AQ2(j * j2, j2 * randomMatchInfo.stopTimestamp, "enterRoom");
        }
    }

    public final void vQ2(int i) {
        if (i == 2) {
            zQ2("cancelSuccessFromLeaveLive");
            C947520alS.LIZ("leave_live");
        }
        C480460Ism.LIZ().getClass();
        IRandomMatchApi iRandomMatchApi = (IRandomMatchApi) C480460Ism.LIZLLL(IRandomMatchApi.class);
        RandomMatchGuestCancelReq randomMatchGuestCancelReq = new RandomMatchGuestCancelReq();
        randomMatchGuestCancelReq.source = i;
        C19487311Lz.LIZJ(C01NB.LIZIZ(iRandomMatchApi.cancel(randomMatchGuestCancelReq), "RandomMatchGuestViewModel", "cancel").LJFF(new C0UO0()), (C11NJ) this.LLIZ.getValue(), new AfS82S0101000_15(i, this, 1), new C09JN() { // from class: X.0amw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RandomMatchGuestViewModel@4.cancel$3");
                C20441214yg.LJ("RandomMatchGuestViewModel", "cancel failure");
                C1C7U.LIZIZ("RandomMatchGuestViewModel@4.cancel$3");
            }
        }, 24);
    }

    public final void xQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCountDownDuration, source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("RandomMatchGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        MutableLiveData<C948850anb> mutableLiveData = this.LLILLJJLI;
        C948850anb value = mutableLiveData.getValue();
        if (value != null) {
            long jLIZJ = value.LIZJ - C963140bAe.LIZJ();
            if (jLIZJ < 0) {
                jLIZJ = 0;
            }
            value.LIZLLL = jLIZJ;
        } else {
            value = null;
        }
        mutableLiveData.setValue(value);
    }

    public final void yQ2(String str) {
        EnumC948930anj enumC948930anj;
        C466310IQj c466310IQj = this.LLILZLL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        C948850anb value = this.LLILLJJLI.getValue();
        C948850anb c948850anb = null;
        if (value != null) {
            enumC948930anj = value.LIZ;
        } else {
            enumC948930anj = null;
        }
        if (enumC948930anj != EnumC948930anj.SUCCESS) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setCountDownFail, source=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("RandomMatchGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
            MutableLiveData<C948850anb> mutableLiveData = this.LLILLJJLI;
            C948850anb value2 = mutableLiveData.getValue();
            if (value2 != null) {
                value2.LIZ = EnumC948930anj.FAIL;
                c948850anb = value2;
            }
            mutableLiveData.setValue(c948850anb);
        }
    }

    public final void zQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCountDownIdle, source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("RandomMatchGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C466310IQj c466310IQj = this.LLILZLL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        MutableLiveData<C948850anb> mutableLiveData = this.LLILLJJLI;
        C948850anb value = mutableLiveData.getValue();
        if (value != null) {
            value.LIZ = EnumC948930anj.IDLE;
        } else {
            value = null;
        }
        mutableLiveData.setValue(value);
    }

    public final void CQ2(int i, AbstractC948890anf abstractC948890anf) {
        long jLongValue;
        long jLongValue2;
        String strU3;
        C0INV c0inv;
        EnterRoomLinkSession enterRoomLinkSessionLIZ;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        String str;
        GetMultiGuestRecommendRoomsParams getMultiGuestRecommendRoomsParams = new GetMultiGuestRecommendRoomsParams();
        Long lLJIIJ = C930540aK4.LJIIJ();
        long jLongValue3 = 0;
        if (lLJIIJ != null) {
            jLongValue = lLJIIJ.longValue();
        } else {
            jLongValue = 0;
        }
        getMultiGuestRecommendRoomsParams.roomId = jLongValue;
        Long lLJII = C930540aK4.LJII();
        if (lLJII != null) {
            jLongValue2 = lLJII.longValue();
        } else {
            jLongValue2 = 0;
        }
        getMultiGuestRecommendRoomsParams.anchorId = jLongValue2;
        getMultiGuestRecommendRoomsParams.liveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) {
            strU3 = CardStruct.IStatusCode.DEFAULT;
        }
        getMultiGuestRecommendRoomsParams.channelId = CastLongProtector.parseLong(strU3);
        getMultiGuestRecommendRoomsParams.appId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = C924640aAY.LIZJ;
        if (l != null) {
            jLongValue3 = l.longValue();
        }
        getMultiGuestRecommendRoomsParams.reqUserApplyWaitSeconds = (jCurrentTimeMillis - jLongValue3) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        getMultiGuestRecommendRoomsParams.liveGuideDisable = 1L;
        int i2 = 1;
        if (HangoutRoomFeedEnableSetting.INSTANCE.isEnable() && Intrinsics.LJFF(this.LL.gg0(TopLiveHangoutInteractTypeData.class), Boolean.TRUE) && (c0inv = C0IL2.LIZ) != null && (enterRoomLinkSessionLIZ = c0inv.LIZ()) != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null && (str = roomsData.enterMethod) != null) {
            if (a0.LJJIIZI(str, "random_chat", false)) {
                i2 = 2;
            } else if (a0.LJJIIZI(str, "dating", false)) {
                i2 = 3;
            }
        }
        getMultiGuestRecommendRoomsParams.version = i2;
        getMultiGuestRecommendRoomsParams.source = i;
        C786410Ut5.LJLIIL(this.LLJ, C473410IhP.LIZ(), this.LLJI);
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZIZ(((LinkMicMatchService) C480460Ism.LIZIZ(LinkMicMatchService.class)).getRecommendRooms(getMultiGuestRecommendRoomsParams), "RandomMatchGuestViewModel", "start").LJFF(new C0UO0()), (C11NJ) this.LLIZ.getValue(), new AfS67S0201000_15(i, this, abstractC948890anf, 0), new AfS184S0100000_15(this, 48), 24);
    }

    public final void AQ2(long j, long j2, String str) {
        EnumC948930anj enumC948930anj;
        EnumC948930anj enumC948930anj2;
        C948850anb value = this.LLILLJJLI.getValue();
        C948850anb c948850anb = null;
        if (value != null) {
            enumC948930anj = value.LIZ;
        } else {
            enumC948930anj = null;
        }
        if (enumC948930anj != EnumC948930anj.IDLE) {
            C948850anb value2 = this.LLILLJJLI.getValue();
            if (value2 != null) {
                enumC948930anj2 = value2.LIZ;
            } else {
                enumC948930anj2 = null;
            }
            if (enumC948930anj2 != EnumC948930anj.FAIL) {
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCountDownMatching, source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("RandomMatchGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        MutableLiveData<C948850anb> mutableLiveData = this.LLILLJJLI;
        C948850anb value3 = mutableLiveData.getValue();
        long j3 = 0;
        if (value3 != null) {
            value3.LIZ = EnumC948930anj.MATCHING;
            value3.LIZIZ = j;
            value3.LIZJ = j2;
            long jLIZJ = value3.LIZJ - C963140bAe.LIZJ();
            if (jLIZJ < 0) {
                jLIZJ = 0;
            }
            value3.LIZLLL = jLIZJ;
            c948850anb = value3;
        }
        mutableLiveData.setValue(c948850anb);
        C948850anb value4 = this.LLILLJJLI.getValue();
        if (value4 != null) {
            j3 = value4.LIZLLL;
        }
        xQ2("Countdown_Init");
        C466310IQj c466310IQj = this.LLILZLL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        C466310IQj c466310IQj2 = new C466310IQj(j3, 1000L, new InterfaceC466320IQk() { // from class: X.0anc
            @Override // X.InterfaceC466320IQk
            public final void onStart() {
            }

            @Override // X.InterfaceC466320IQk
            public final void LIZLLL() {
                C947520alS.LIZ("fail_match");
                this.LIZ.yQ2("Countdown_onFinish");
            }

            @Override // X.InterfaceC466320IQk
            public final void LJJI(long j4) {
                this.LIZ.xQ2("Countdown_onTick");
            }
        });
        this.LLILZLL = c466310IQj2;
        c466310IQj2.LJ();
    }

    public final void BQ2(String str, User user, long j, boolean z) {
        Long lValueOf;
        C466310IQj c466310IQj = this.LLILZLL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCountDownSuccess, source=");
        sbLIZ.append(str);
        sbLIZ.append(", anchorUserId=");
        C948850anb c948850anb = null;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", roomId=");
        sbLIZ.append(j);
        sbLIZ.append(", pIsAutoPermitUser=");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("RandomMatchGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        MutableLiveData<C948850anb> mutableLiveData = this.LLILLJJLI;
        C948850anb value = mutableLiveData.getValue();
        if (value != null) {
            value.LIZ = EnumC948930anj.SUCCESS;
            value.LJ = user;
            value.LJFF = j;
            value.LJI = z;
            c948850anb = value;
        }
        mutableLiveData.setValue(c948850anb);
    }
}
