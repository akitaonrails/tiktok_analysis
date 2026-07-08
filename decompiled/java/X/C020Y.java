package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.api.SMBDecorationBoardsPermissionChannel;
import com.bytedance.android.live.broadcast.api.SMBGoLivePageInfo;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardEndParams;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCountDownTimerPlayModeConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.PlaybookStartAnchorEvent;
import com.bytedance.android.livesdk.model.message.BackpackMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3EntranceAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageTransitionFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS402S0200000_1;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.smb.BoardInfo;
import webcast.api.smb.SMBGoLivePageResponse;
import webcast.data.BagItem;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play.TextHeaderPlayContent;

/* JADX INFO: renamed from: X.020Y, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020Y extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020Y c020y) {
        return new C404801hm(((C404401hi) c020y.l0).LIZ, new C5183020f((C381901e5) c020y.l1, 20));
    }

    public static final Object invoke$1(C020Y c020y) {
        return new C1100710ekX(((C404401hi) c020y.l0).LIZ, new C5183020f((C381901e5) c020y.l1, 21));
    }

    public static final Object invoke$10(C020Y c020y) {
        C01H9 value;
        MutableLiveData<C01H9> mutableLiveData;
        LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) c020y.l0;
        C01HJ c01hj = liveShowAnchorWidget.LLJJJJ;
        if (c01hj != null) {
            c01hj.LLJJIJIIJIL = (List) c020y.l1;
            T t = liveShowAnchorWidget.LLILLJJLI;
            if (t != 0 && (mutableLiveData = t.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            c01hj.LJLJJLL(value);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(C020Y c020y) {
        C01HJ c01hj = ((LiveShowAnchorWidget) c020y.l0).LLJJJJ;
        if (c01hj != null) {
            c01hj.LJLJJLL((C01H9) c020y.l1);
        }
        C01HJ c01hj2 = ((LiveShowAnchorWidget) c020y.l0).LLJJJJ;
        if (c01hj2 != null) {
            c01hj2.LJLJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(C020Y c020y) {
        ((BaseLiveShowViewModel) c020y.l0).LLILLJJLI.setValue((C01H9) c020y.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$13(C020Y c020y) {
        ((BaseLiveShowViewModel) c020y.l0).LLILLL.setValue((C303501Fp) c020y.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$14(C020Y c020y) {
        List<ShowListUser> list;
        List<ShowListUser> list2;
        MutableLiveData<C01H9> mutableLiveData = ((BaseLiveShowViewModel) c020y.l0).LLILLJJLI;
        ShowContent content = ((C01FL) c020y.l1).getContent();
        ShowConfig showConfig = null;
        if (content != null) {
            list = content.showingAndReadyList;
        } else {
            list = null;
        }
        ShowContent content2 = ((C01FL) c020y.l1).getContent();
        if (content2 != null) {
            list2 = content2.finishedList;
        } else {
            list2 = null;
        }
        mutableLiveData.setValue(C01HA.LIZ(list, list2, false));
        ((BaseLiveShowViewModel) c020y.l0).LL.setValue(1);
        BaseLiveShowViewModel baseLiveShowViewModel = (BaseLiveShowViewModel) c020y.l0;
        ShowContent content3 = ((C01FL) c020y.l1).getContent();
        if (content3 != null) {
            showConfig = content3.showConfig;
        }
        baseLiveShowViewModel.BQ2(showConfig);
        ((BaseLiveShowViewModel) c020y.l0).DQ2();
        return Unit.LIZ;
    }

    public static final Object invoke$15(C020Y c020y) {
        C01HJ c01hj = ((LiveShowModeratorWidget) c020y.l0).LLILZ;
        if (c01hj != null) {
            c01hj.LJLJJL((List) c020y.l1, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(C020Y c020y) {
        C01H9 value;
        MutableLiveData<C01H9> mutableLiveData;
        LiveShowModeratorWidget liveShowModeratorWidget = (LiveShowModeratorWidget) c020y.l0;
        C01HJ c01hj = liveShowModeratorWidget.LLILZ;
        if (c01hj != null) {
            c01hj.LLJJIJIIJIL = (List) c020y.l1;
            LiveShowModeratorViewModel liveShowModeratorViewModel = liveShowModeratorWidget.LL;
            if (liveShowModeratorViewModel != null && (mutableLiveData = liveShowModeratorViewModel.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            c01hj.LJLJJLL(value);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(C020Y c020y) {
        C01HJ c01hj = ((LiveShowModeratorWidget) c020y.l0).LLILZ;
        if (c01hj != null) {
            c01hj.LJLJJLL((C01H9) c020y.l1);
        }
        C01HJ c01hj2 = ((LiveShowModeratorWidget) c020y.l0).LLILZ;
        if (c01hj2 != null) {
            c01hj2.LJLJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(X.C020Y r4) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020Y.invoke$18(X.020Y):java.lang.Object");
    }

    public static final Object invoke$19(C020Y c020y) {
        ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).rN2(((C2757014x) c020y.l0).LIZ.boardId, C011V.BROADCAST, 0L);
        ((Function0) c020y.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020Y c020y) {
        C1AZW.LJIIJ(12, ((BaseCountdownViewModel) c020y.l0).getTag(), "stay x second, timeout remove mask ui", null, null);
        BaseCountdownViewModel baseCountdownViewModel = (BaseCountdownViewModel) c020y.l0;
        String str = ((C299601Ec) c020y.l1).LIZJ;
        baseCountdownViewModel.getClass();
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJIILJJIL(str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(C020Y c020y) {
        C758430Tp3.LIZ((SMBGoLivePageResponse.Data) ((C470590Icr) c020y.l0).data);
        ((PreviewServicePlusWidget) c020y.l1).dataChannel.zW(SMBDecorationBoardsPermissionChannel.class, (C470590Icr) c020y.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(X.C020Y r9) {
        /*
            boolean r0 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.AbsTaskDetailPanel.LLJLLL
            if (r0 != 0) goto L4d
            java.lang.Object r1 = r9.l0
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r9 = r9.l1
            com.bytedance.android.livesdk.model.message.BackpackMessage r9 = (com.bytedance.android.livesdk.model.message.BackpackMessage) r9
            if (r1 == 0) goto L50
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L50
            r0 = 0
            r8 = 0
            if (r0 != 0) goto L50
            java.util.Iterator r7 = r1.iterator()
        L1c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r6 = r7.next()
            r5 = r6
            webcast.data.BagItem r5 = (webcast.data.BagItem) r5
            long r3 = r5.itemId
            long r1 = r9.itemId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            int r1 = r5.itemType
            int r0 = r9.itemType
            if (r1 != r0) goto L1c
            boolean r0 = r5.available
            if (r0 == 0) goto L1c
            r8 = r6
        L3c:
            webcast.data.BagItem r8 = (webcast.data.BagItem) r8
            if (r8 == 0) goto L50
            long r4 = r8.itemId
        L42:
            com.bytedance.android.live.gift.GiftService r0 = com.bytedance.android.live.gift.GiftService.LLILLJJLI
            java.lang.String r1 = "match"
            r2 = -1
            java.lang.String r6 = "recharge_campaign"
            r0.openGiftDialog(r1, r2, r4, r6)
        L4d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L50:
            r4 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020Y.invoke$21(X.020Y):java.lang.Object");
    }

    public static final Object invoke$22(C020Y c020y) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01K2(null, (Function0) c020y.l0, (Function1) c020y.l1), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$23(C020Y c020y) {
        return C13LP.LJLIL((List) c020y.l1, (Collection) ((Function0) c020y.l0).invoke());
    }

    public static final Object invoke$24(C020Y c020y) {
        Bitmap bitmap = ((TakoImageTransitionFragment) c020y.l0).LLJJI;
        if (bitmap != null && !bitmap.isRecycled()) {
            View view = (View) c020y.l1;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((TakoImageTransitionFragment) c020y.l0).getViewLifecycleOwner()), C0PEM.LIZJ, null, new C464001rK(view.getContext(), bitmap, (TakoImageTransitionFragment) c020y.l0, view, null), 2);
        }
        ((TakoImageTransitionFragment) c020y.l0).nG("save");
        return Unit.LIZ;
    }

    public static final Object invoke$25(C020Y c020y) {
        List listLJJLL;
        View view = (View) c020y.l0;
        String[] strArr = ((TakoImageTransitionFragment) c020y.l1).LLJIJIL;
        String str = null;
        if (strArr != null) {
            listLJJLL = C13LQ.LJJLL(strArr);
        } else {
            listLJJLL = null;
        }
        HashMap<String, String> map = ((TakoImageTransitionFragment) c020y.l1).LLJILJIL;
        if (map != null) {
            str = map.get("message_id");
        }
        TakoImageTransitionFragment takoImageTransitionFragment = (TakoImageTransitionFragment) c020y.l1;
        C12FK.LIZ(view, listLJJLL, str, takoImageTransitionFragment.LLJILJIL, takoImageTransitionFragment.LLJILJILJ, takoImageTransitionFragment.LLJILLL);
        ((TakoImageTransitionFragment) c020y.l1).nG("post");
        return Unit.LIZ;
    }

    public static final Object invoke$26(C020Y c020y) {
        File[] fileArrListFiles = ((File) c020y.l0).listFiles();
        if (fileArrListFiles != null) {
            Set set = (Set) c020y.l1;
            for (File file : fileArrListFiles) {
                if (file.isFile() && !set.contains(file.getAbsolutePath())) {
                    file.delete();
                }
            }
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$27(C020Y c020y) throws JSONException {
        Integer numValueOf;
        JSONObject jSONObject = new JSONObject();
        IMessage iMessage = (IMessage) c020y.l0;
        C118300cf c118300cf = (C118300cf) c020y.l1;
        GiftMessage giftMessage = (GiftMessage) iMessage;
        jSONObject.put("gift_id", giftMessage.giftId);
        Gift gift = giftMessage.mGift;
        String string = null;
        if (gift != null) {
            numValueOf = Integer.valueOf(gift.diamondCount);
        } else {
            numValueOf = null;
        }
        jSONObject.put("gift_price", numValueOf);
        jSONObject.put("total_count", c118300cf.element);
        JSONObject jSONObject2 = new JSONObject();
        User user = giftMessage.fromUser;
        if (user != null) {
            string = Long.valueOf(user.getId()).toString();
        }
        jSONObject2.put("uid", string);
        jSONObject.put("sender", jSONObject2);
        return jSONObject;
    }

    public static final Object invoke$28(C020Y c020y) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartType: found startType in new data: secondSectionIndex=");
        sbLIZ.append(((C118300cf) c020y.l0).element);
        sbLIZ.append(", secondTypeIndex=");
        sbLIZ.append(((C118300cf) c020y.l1).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$29(C020Y c020y) {
        Effect effect = (Effect) c020y.l0;
        if (effect == null) {
            ((C1624340sN6) c020y.l1).LJFF.setValue(C460501ql.LIZ);
            ((C1624340sN6) c020y.l1).LJI.setValue(null);
        } else {
            ((C1624340sN6) c020y.l1).LJFF.setValue(new C460701qn(effect));
            String parentId = ((Effect) c020y.l0).getParentId();
            if (!TextUtils.isEmpty(parentId)) {
                if (parentId != null) {
                    ((C1624340sN6) c020y.l1).getClass();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                ((C1624340sN6) c020y.l1).LJI.setValue((Effect) c020y.l0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020Y c020y) {
        BaseCountdownViewModel baseCountdownViewModel = (BaseCountdownViewModel) c020y.l0;
        C299601Ec c299601Ec = (C299601Ec) c020y.l1;
        C1AZW.LJIIJ(12, baseCountdownViewModel.getTag(), "onComplete", null, null);
        baseCountdownViewModel.LLILLJJLI.LIZIZ(c299601Ec.LIZJ);
        long jEndCountdownReqBackupDelayTime = LinkmicCountDownTimerPlayModeConfig.INSTANCE.endCountdownReqBackupDelayTime();
        if (jEndCountdownReqBackupDelayTime > 0) {
            C500260Jjc.LJJLIIIJJI(((long) LSPassThroughRecordSizeConfig.DEFAULT) * jEndCountdownReqBackupDelayTime, new C5179020b(baseCountdownViewModel, c299601Ec, jEndCountdownReqBackupDelayTime, 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$30(C020Y c020y) {
        BoardInfo boardInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queryGoLive boardInfo=");
        SMBGoLivePageResponse.Data data = (SMBGoLivePageResponse.Data) ((C470590Icr) c020y.l0).data;
        DataChannel dataChannel = null;
        if (data != null) {
            boardInfo = data.boardInfo;
        } else {
            boardInfo = null;
        }
        sbLIZ.append(boardInfo);
        C20441214yg.LIZIZ("GoLivePageApi", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel2 = ((LiveBroadcastPreviewFragment) c020y.l1).LLILZLL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        dataChannel2.zW(SMBDecorationBoardsPermissionChannel.class, (C470590Icr) c020y.l0);
        DataChannel dataChannel3 = ((LiveBroadcastPreviewFragment) c020y.l1).LLILZLL;
        if (dataChannel3 != null) {
            dataChannel = dataChannel3;
        }
        dataChannel.zW(SMBGoLivePageInfo.class, ((C470590Icr) c020y.l0).data);
        C20441214yg.LIZIZ("GoLivePageApi", "queryGoLive postValue SMBGoLiveVerificationInfo");
        return Unit.LIZ;
    }

    public static final Object invoke$31(C020Y c020y) {
        C23250099c.LIZLLL((InterfaceC497601wk) c020y.l0, null, null, new C346101Vz((StoryHighlightsCreationVM) c020y.l1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$32(C020Y c020y) {
        ((MidLiveShowViewModel) c020y.l0).LLJILJIL.setValue((List) c020y.l1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$33(C020Y c020y) {
        boolean z;
        DialogC20518615Qq dialogC20518615Qq = (DialogC20518615Qq) c020y.l0;
        InterfaceC422501kd interfaceC422501kd = dialogC20518615Qq.LLJILJIL;
        CountdownConfig countdownConfig = (CountdownConfig) c020y.l1;
        if (dialogC20518615Qq.LLL == 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC422501kd.LIZ(countdownConfig, z);
        DialogC20518615Qq dialogC20518615Qq2 = (DialogC20518615Qq) c020y.l0;
        dialogC20518615Qq2.dismiss();
        C785410UrT.LIZ(dialogC20518615Qq2);
        return Unit.LIZ;
    }

    public static final Object invoke$34(C020Y c020y) {
        ((AbstractC20384214pU) c020y.l0).LIZ.FQ2(PlaybookStartAnchorEvent.class);
        ActivePlaybook activePlaybook = (ActivePlaybook) c020y.l1;
        if (activePlaybook != null) {
            ((AbstractC20384214pU) c020y.l0).LJJIII(activePlaybook, "IM", false, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(C020Y c020y) {
        long id;
        int i;
        User owner;
        ((C1124290fMZ) c020y.l0).getClass();
        try {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null && (owner = room.getOwner()) != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
            if (c1094360eaIHP != null) {
                i = c1094360eaIHP.LIZ;
            } else {
                i = 0;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_privilege_center_im_guide_show");
            c474500IjALIZ.LJJII(1, "is_live_room");
            c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "user_level");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Function0 function0 = (Function0) c020y.l1;
        if (function0 != null) {
            function0.invoke();
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$36(C020Y c020y) {
        SearchKeyframeOptDir3PanelAssem searchKeyframeOptDir3PanelAssem = (SearchKeyframeOptDir3PanelAssem) c020y.l0;
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJ(searchKeyframeOptDir3PanelAssem, C2107308Nj.LIZ, new C506201y8((View) c020y.l1, searchKeyframeOptDir3PanelAssem, null));
        return Unit.LIZ;
    }

    public static final Object invoke$37(C020Y c020y) {
        SearchKeyframeOptDir3EntranceAssem searchKeyframeOptDir3EntranceAssem = (SearchKeyframeOptDir3EntranceAssem) c020y.l0;
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJ(searchKeyframeOptDir3EntranceAssem, C2107308Nj.LIZ, new C506401yA(searchKeyframeOptDir3EntranceAssem, (View) c020y.l1, null));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$38(C020Y c020y) {
        ((LiveBoardsWidget) c020y.l0).dataChannel.zW(SMBDecorationBoardsPermissionChannel.class, (C470590Icr) c020y.l1);
        C758430Tp3.LIZ((SMBGoLivePageResponse.Data) ((C470590Icr) c020y.l1).data);
        ((LiveBoardsWidget) c020y.l0).X1((C470590Icr) c020y.l1);
        ((LiveBoardsWidget) c020y.l0).dataChannel.zW(SMBGoLivePageInfo.class, ((C470590Icr) c020y.l1).data);
        return Unit.LIZ;
    }

    public static final Object invoke$39(C020Y c020y) {
        C11NJ c11nj = ((C953610avH) c020y.l0).LIZLLL;
        C485901ur c485901ur = new C485901ur((C953610avH) c020y.l0);
        C020W c020w = new C020W((C953610avH) c020y.l0, (C953610avH) c020y.l1, (Function1<? super Boolean, Unit>) 83);
        Long l = (Long) c485901ur.invoke();
        if (l != null) {
            long jLongValue = l.longValue();
            C20441214yg.LJIIIZ("NoticeboardController", "endNoticeboard");
            C480460Ism.LIZ().getClass();
            INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
            NoticeboardEndParams noticeboardEndParams = new NoticeboardEndParams();
            noticeboardEndParams.roomId = C954140aw8.LIZJ();
            noticeboardEndParams.channelId = C954140aw8.LIZIZ();
            noticeboardEndParams.noticeboardId = jLongValue;
            c11nj.LIZ(new C11QI(iNoticeboardApi.endNoticeboard(noticeboardEndParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516201zk(c020w, 305)).LJIIL(new C516201zk(c020w, 306))).LJIILL().LJIIZILJ());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(C020Y c020y) {
        long jLongValue;
        int iLongValue;
        int iLongValue2;
        MutableLiveData<GuestShowdownConfig> mutableLiveData = ((GuestShowdownAnchorViewModel) c020y.l0).LLJIJIL;
        GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
        C470590Icr c470590Icr = (C470590Icr) c020y.l1;
        Long l = ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data).settingsMap.get("guest_showdown_duration");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultDuration;
        }
        guestShowdownConfig.duration = jLongValue;
        Long l2 = ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data).settingsMap.get("guest_showdown_loser_num");
        if (l2 != null) {
            iLongValue = (int) l2.longValue();
        } else {
            iLongValue = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultLoserNum;
        }
        guestShowdownConfig.loserNum = iLongValue;
        if (C01ZC.LIZIZ()) {
            Long l3 = ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data).settingsMap.get("guest_showdown_winner_num");
            if (l3 != null) {
                iLongValue2 = (int) l3.longValue();
            } else {
                iLongValue2 = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultWinnerNum;
            }
            guestShowdownConfig.winnerNum = iLongValue2;
        }
        mutableLiveData.setValue(guestShowdownConfig);
        return Unit.LIZ;
    }

    public static final Object invoke$40(C020Y c020y) {
        C953600avG c953600avG = (C953600avG) c020y.l0;
        C953620avI.LJIIJJI(c953600avG, new C020W(c953600avG, (C953610avH) c020y.l1, 82));
        return Unit.LIZ;
    }

    public static final Object invoke$41(C020Y c020y) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isBottombarEnterLiveQuickly  enablePage ");
        sbLIZ.append((Boolean) c020y.l0);
        sbLIZ.append(" , enableHero ");
        sbLIZ.append((Boolean) c020y.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$42(C020Y c020y) {
        long jCurrentTimeMillis;
        Long l = (Long) ((C259800zU) c020y.l0).element;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        ((C238400w2) c020y.l1).element += System.currentTimeMillis() - jCurrentTimeMillis;
        return Unit.LIZ;
    }

    public static final Object invoke$43(C020Y c020y) {
        ((C094D) c020y.l0).LJIIIIZZ((LiveEffect) c020y.l1);
        ((C094D) c020y.l0).LJIIJJI(null);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, org.json.JSONObject] */
    public static final Object invoke$44(C020Y c020y) {
        String string;
        try {
            k kVarLJJIIZ = ((n) c020y.l0).LJJIIZ("data");
            if (kVarLJJIIZ != null && (string = kVarLJJIIZ.toString()) != null) {
                ((C259800zU) c020y.l1).element = new JSONObject(string);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, org.json.JSONObject] */
    public static final Object invoke$45(C020Y c020y) {
        try {
            k kVarLJJIIZ = ((n) c020y.l0).LJJIIZ("data");
            if (kVarLJJIIZ != null) {
                ((C259800zU) c020y.l1).element = new JSONObject(C08JS.LIZJ(667340, kVarLJJIIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(C020Y c020y) {
        boolean z;
        if (C781520UlC.LJIIJJI((LiveMode) c020y.l0) && C500260Jjc.LJJJIL((DataChannel) c020y.l1)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(C020Y c020y) {
        Integer numValueOf;
        MutableLiveData<Integer> mutableLiveData = ((BaseGuestShowdownViewModel) c020y.l0).LLILLJJLI;
        GuestShowdownContent guestShowdownContent = (GuestShowdownContent) c020y.l1;
        if (guestShowdownContent != null) {
            numValueOf = Integer.valueOf(guestShowdownContent.playStatus);
        } else {
            numValueOf = null;
        }
        mutableLiveData.setValue(numValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$6(C020Y c020y) {
        List<GuestShowdownUser> list;
        MutableLiveData<List<GuestShowdownUser>> mutableLiveData = ((BaseGuestShowdownViewModel) c020y.l0).LLILLL;
        GuestShowdownContent guestShowdownContent = (GuestShowdownContent) c020y.l1;
        if (guestShowdownContent != null) {
            list = guestShowdownContent.runningPlayUsers;
        } else {
            list = null;
        }
        mutableLiveData.setValue(list);
        return Unit.LIZ;
    }

    public static final Object invoke$7(C020Y c020y) {
        List<GuestShowdownUser> list;
        MutableLiveData<List<GuestShowdownUser>> mutableLiveData = ((BaseGuestShowdownViewModel) c020y.l0).LLILZ;
        GuestShowdownContent guestShowdownContent = (GuestShowdownContent) c020y.l1;
        if (guestShowdownContent != null) {
            list = guestShowdownContent.leavePlayUsers;
        } else {
            list = null;
        }
        mutableLiveData.setValue(list);
        return Unit.LIZ;
    }

    public static final Object invoke$8(C020Y c020y) {
        ((BaseGuestShowdownViewModel) c020y.l0).LLILZIL.setValue(((GuestShowdownContent) c020y.l1).playConfig);
        return Unit.LIZ;
    }

    public static final Object invoke$9(C020Y c020y) {
        C01HJ c01hj = ((LiveShowAnchorWidget) c020y.l0).LLJJJJ;
        if (c01hj != null) {
            c01hj.LJLJJL((List) c020y.l1, false);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C020Y(android.view.View r3, com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageTransitionFragment r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 24 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020Y.<init>(android.view.View, com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageTransitionFragment, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(C118300cf c118300cf, C118300cf c118300cf2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(C259800zU c259800zU, C259800zU<Long> c259800zU2, C238400w2 c238400w2) {
        super(0);
        this.$t = c238400w2;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(C2757014x c2757014x, C2757014x c2757014x2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c2757014x;
        this.l1 = c2757014x2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(C404401hi c404401hi, C381901e5 c381901e5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c404401hi;
        this.l1 = c381901e5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(InterfaceC497601wk interfaceC497601wk, StoryHighlightsCreationVM storyHighlightsCreationVM, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = storyHighlightsCreationVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(C094D c094d, C094D<? super LiveEffect> c094d2, LiveEffect liveEffect) {
        super(0);
        this.$t = liveEffect;
        this.l0 = c094d;
        this.l1 = c094d2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(C470590Icr c470590Icr, C470590Icr<SMBGoLivePageResponse.Data> c470590Icr2, LiveBroadcastPreviewFragment liveBroadcastPreviewFragment) {
        super(0);
        this.$t = liveBroadcastPreviewFragment;
        this.l0 = c470590Icr;
        this.l1 = c470590Icr2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(C470590Icr c470590Icr, C470590Icr<SMBGoLivePageResponse.Data> c470590Icr2, PreviewServicePlusWidget previewServicePlusWidget) {
        super(0);
        this.$t = previewServicePlusWidget;
        this.l0 = c470590Icr;
        this.l1 = c470590Icr2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(C0VSJ c0vsj, Set set, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0vsj;
        this.l1 = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(C953600avG c953600avG, C953610avH c953610avH, int i) {
        super(0);
        this.$t = i;
        this.l0 = c953600avG;
        this.l1 = c953610avH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(C953610avH c953610avH, C953610avH c953610avH2, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = c953610avH;
        this.l1 = c953610avH2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(C1124290fMZ c1124290fMZ, AnonymousClass0206 anonymousClass0206, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1124290fMZ;
        this.l1 = anonymousClass0206;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(C1624340sN6 c1624340sN6, Effect effect, int i) {
        super(0);
        this.$t = i;
        this.l0 = effect;
        this.l1 = c1624340sN6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(AbstractC20384214pU abstractC20384214pU, ActivePlaybook activePlaybook, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC20384214pU;
        this.l1 = activePlaybook;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(DialogC20518615Qq dialogC20518615Qq, CountdownConfig countdownConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = dialogC20518615Qq;
        this.l1 = countdownConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(View view, SearchKeyframeOptDir3PanelAssem searchKeyframeOptDir3PanelAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchKeyframeOptDir3PanelAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(BaseCountdownViewModel baseCountdownViewModel, C299601Ec c299601Ec, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseCountdownViewModel;
        this.l1 = c299601Ec;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(GuestShowdownAnchorViewModel guestShowdownAnchorViewModel, GuestShowdownAnchorViewModel guestShowdownAnchorViewModel2, C470590Icr<GetUserPlaySettingsResponse.ResponseData> c470590Icr) {
        super(0);
        this.$t = c470590Icr;
        this.l0 = guestShowdownAnchorViewModel;
        this.l1 = guestShowdownAnchorViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(BaseGuestShowdownViewModel baseGuestShowdownViewModel, GuestShowdownContent guestShowdownContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseGuestShowdownViewModel;
        this.l1 = guestShowdownContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(LiveShowAnchorWidget liveShowAnchorWidget, C01H9 c01h9, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveShowAnchorWidget;
        this.l1 = c01h9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(LiveShowAnchorWidget liveShowAnchorWidget, LiveShowAnchorWidget liveShowAnchorWidget2, List<? extends LinkPlayerInfo> list) {
        super(0);
        this.$t = list;
        this.l0 = liveShowAnchorWidget;
        this.l1 = liveShowAnchorWidget2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(BaseLiveShowViewModel baseLiveShowViewModel, C01FL c01fl, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseLiveShowViewModel;
        this.l1 = c01fl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(BaseLiveShowViewModel baseLiveShowViewModel, C303501Fp c303501Fp, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseLiveShowViewModel;
        this.l1 = c303501Fp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(BaseLiveShowViewModel baseLiveShowViewModel, C01H9 c01h9, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseLiveShowViewModel;
        this.l1 = c01h9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(MidLiveShowViewModel midLiveShowViewModel, MidLiveShowViewModel midLiveShowViewModel2, List<? extends LinkPlayerInfo> list) {
        super(0);
        this.$t = list;
        this.l0 = midLiveShowViewModel;
        this.l1 = midLiveShowViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(LiveShowModeratorWidget liveShowModeratorWidget, C01H9 c01h9, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveShowModeratorWidget;
        this.l1 = c01h9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(LiveShowModeratorWidget liveShowModeratorWidget, LiveShowModeratorWidget liveShowModeratorWidget2, List<? extends LinkPlayerInfo> list) {
        super(0);
        this.$t = list;
        this.l0 = liveShowModeratorWidget;
        this.l1 = liveShowModeratorWidget2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(BaseTextHeaderViewModel baseTextHeaderViewModel, TextHeaderPlayContent textHeaderPlayContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseTextHeaderViewModel;
        this.l1 = textHeaderPlayContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(LiveBoardsWidget liveBoardsWidget, LiveBoardsWidget liveBoardsWidget2, C470590Icr<SMBGoLivePageResponse.Data> c470590Icr) {
        super(0);
        this.$t = c470590Icr;
        this.l0 = liveBoardsWidget;
        this.l1 = liveBoardsWidget2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(LiveMode liveMode, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveMode;
        this.l1 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(n nVar, n nVar2, C259800zU<JSONObject> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = nVar;
        this.l1 = nVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(SearchKeyframeOptDir3EntranceAssem searchKeyframeOptDir3EntranceAssem, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchKeyframeOptDir3EntranceAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(IMessage iMessage, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMessage;
        this.l1 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(Boolean bool, Boolean bool2, int i) {
        super(0);
        this.$t = i;
        this.l0 = bool;
        this.l1 = bool2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Y(List list, List<BagItem> list2, BackpackMessage backpackMessage) {
        super(0);
        this.$t = backpackMessage;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(List list, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = function0;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Y(AwS402S0200000_1 awS402S0200000_1, C1717030umb c1717030umb, int i) {
        super(0);
        this.$t = i;
        this.l0 = awS402S0200000_1;
        this.l1 = c1717030umb;
    }
}
