package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.SwitchLiveModeChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestOpenPreviewFromAvatarEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.common.ui.histroy.MultiGuestCountDownHistoryDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.liveshow.LiveShowLeaveRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank.MultiGuestGiftContributeRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarIntroFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.more.PlaybookEditorMoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderCreationSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.trymodel.TryModeMultiGuestAnchorManageSheet;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.livesdk.billboard.broadcast.BillboardMultiDeleteConfirmSheetFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewIncentiveCampaignWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveGrowthMVPWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewNrVoiceChatGuideWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameEventPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameGpppaPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.NotionFragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.LiveGrowthMVPBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.broadcast.education.GameLiveNewBroadcastEducationBannerWidget;
import com.bytedance.android.livesdk.game.broadcast.highlight.PreviewHighLightVideoWidget;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverWidget;
import com.bytedance.android.livesdk.giftlimitnotification.LiveGiftReminderAmountKeyboardFragment;
import com.bytedance.android.livesdk.giftlimitnotification.LiveGiftReminderFragment;
import com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelAssem;
import com.bytedance.android.livesdk.grouplive.memberselection.UserSelectionAssem;
import com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget2;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameAutoCoverFAQPage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNewGameBroadcastEducationScheme;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipGpppaHelpCenterSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftGroupLiveLinksSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestRankRuleUrlSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveHostIModerateFaqLinkSetting;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.toplive.cell.HangoutSectionUserHostRoomCell;
import com.ss.android.ugc.aweme.toplive.view.TopLivePageUserHostRoomformationFragment;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import qo2.w;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: renamed from: X.01z6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC512201z6 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
            case 23:
                onClick$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onClick$24(this, view);
                break;
            case 25:
                onClick$25(this, view);
                break;
            case 26:
                onClick$26(this, view);
                break;
            case 27:
                onClick$27(this, view);
                break;
            case 28:
                onClick$28(this, view);
                break;
            case 29:
                onClick$29(this, view);
                break;
            case 30:
                onClick$30(this, view);
                break;
            case 31:
                onClick$31(this, view);
                break;
            case 32:
                onClick$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onClick$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onClick$34(this, view);
                break;
            case 35:
                onClick$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onClick$36(this, view);
                break;
            case 37:
                onClick$37(this, view);
                break;
            case 38:
                onClick$38(this, view);
                break;
            case 39:
                onClick$39(this, view);
                break;
            case 40:
                onClick$40(this, view);
                break;
            case 41:
                onClick$41(this, view);
                break;
            case 42:
                onClick$42(this, view);
                break;
            case 43:
                onClick$43(this, view);
                break;
            case 44:
                onClick$44(this, view);
                break;
            case 45:
                onClick$45(this, view);
                break;
            case 46:
                onClick$46(this, view);
                break;
            case 47:
                onClick$47(this, view);
                break;
            case 48:
                onClick$48(this, view);
                break;
            case 49:
                onClick$49(this, view);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onClick$50(this, view);
                break;
            case 51:
                onClick$51(this, view);
                break;
            case 52:
                onClick$52(this, view);
                break;
            case 53:
                onClick$53(this, view);
                break;
            case 54:
                onClick$54(this, view);
                break;
            case 55:
                onClick$55(this, view);
                break;
            case 56:
                onClick$56(this, view);
                break;
            case 57:
                onClick$57(this, view);
                break;
            case 58:
                onClick$58(this, view);
                break;
            case 59:
                onClick$59(this, view);
                break;
        }
    }

    public ViewOnClickListenerC512201z6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        UserSelectionAssem userSelectionAssem = (UserSelectionAssem) viewOnClickListenerC512201z6.l0;
        userSelectionAssem.getClass();
        String str = GiftGroupLiveLinksSettings.getValue().faqLink;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(userSelectionAssem.getContext(), UriProtector.parse(new C495520Jby(str).LIZLLL()));
        }
    }

    public static final void onClick$1(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        Function1<? super Boolean, Unit> function1 = ((C1146260fw0) viewOnClickListenerC512201z6.l0).LL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void onClick$10(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        MultiGuestGiftContributeRankDialog multiGuestGiftContributeRankDialog = (MultiGuestGiftContributeRankDialog) viewOnClickListenerC512201z6.l0;
        C01EH c01eh = multiGuestGiftContributeRankDialog.LLILLJJLI;
        if (c01eh != null) {
            c01eh.LIZ(multiGuestGiftContributeRankDialog.LLJJIII, multiGuestGiftContributeRankDialog.LLJJIJI, multiGuestGiftContributeRankDialog.LLJJIJIIJIL, multiGuestGiftContributeRankDialog.LLJJIJIL, multiGuestGiftContributeRankDialog);
        }
    }

    public static final void onClick$11(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        MultiGuestGiftContributeRankDialog multiGuestGiftContributeRankDialog = (MultiGuestGiftContributeRankDialog) viewOnClickListenerC512201z6.l0;
        multiGuestGiftContributeRankDialog.getClass();
        String value = LiveSdkMultiGuestRankRuleUrlSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?type=popup&url=https%3A%2F%2Flf16-web.tiktokcdn.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Fmulti_guest_top_viewers_faq.html&gravity=bottom";
        }
        C930540aK4.LJIJI(multiGuestGiftContributeRankDialog.dataChannel, multiGuestGiftContributeRankDialog.getContext(), value, false, 24);
        C308301Hl.LIZ.LIZIZ(multiGuestGiftContributeRankDialog.LLJJIII, multiGuestGiftContributeRankDialog.LLJJ, "guest_window", "faq");
    }

    public static final void onClick$12(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        MultiGuestGiftContributeRankDialog multiGuestGiftContributeRankDialog = (MultiGuestGiftContributeRankDialog) viewOnClickListenerC512201z6.l0;
        multiGuestGiftContributeRankDialog.getClass();
        C1121570fIB c1121570fIB = new C1121570fIB(multiGuestGiftContributeRankDialog.LLJJIII);
        C930480aJy.LIZ.getClass();
        c1121570fIB.LJI = C930480aJy.LJJIIZI();
        c1121570fIB.LJII = C308401Hm.LIZ();
        c1121570fIB.LIZJ = "guest_ranking";
        DataChannel dataChannel = multiGuestGiftContributeRankDialog.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
        }
        ((MultiGuestGiftContributeRankDialog) viewOnClickListenerC512201z6.l0).dismiss();
        C308301Hl c308301Hl = C308301Hl.LIZ;
        MultiGuestGiftContributeRankDialog multiGuestGiftContributeRankDialog2 = (MultiGuestGiftContributeRankDialog) viewOnClickListenerC512201z6.l0;
        c308301Hl.LIZIZ(multiGuestGiftContributeRankDialog2.LLJJIII, multiGuestGiftContributeRankDialog2.LLJJ, "guest_gift_panel", "gift");
    }

    public static final void onClick$13(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        User user;
        User user2;
        C01HY c01hy = (C01HY) viewOnClickListenerC512201z6.l0;
        FanTicketRanklistResponse.ResponseData responseData = null;
        if (c01hy.LLIZ != null) {
            C01HX c01hx = c01hy.LLJ;
            if (c01hx != null) {
                user2 = c01hx.LJ;
            } else {
                user2 = null;
            }
            C1121570fIB c1121570fIB = new C1121570fIB(user2);
            c1121570fIB.LIZJ = "guest_ranking";
            C930480aJy.LIZ.getClass();
            c1121570fIB.LJI = C930480aJy.LJJIIZI();
            c1121570fIB.LJII = C308401Hm.LIZ();
            DataChannel dataChannel = ((C01HY) viewOnClickListenerC512201z6.l0).LLIZ;
            if (dataChannel != null) {
                dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
            }
            InterfaceC307401Hc interfaceC307401Hc = ((C01HY) viewOnClickListenerC512201z6.l0).LLIZLLLIL;
            if (interfaceC307401Hc != null) {
                interfaceC307401Hc.dismiss();
            }
        }
        C308301Hl c308301Hl = C308301Hl.LIZ;
        C01HX c01hx2 = ((C01HY) viewOnClickListenerC512201z6.l0).LLJ;
        if (c01hx2 != null) {
            user = c01hx2.LJ;
            responseData = c01hx2.LJFF;
        } else {
            user = null;
        }
        c308301Hl.LIZIZ(user, responseData, "guest_window", "gift");
    }

    public static final void onClick$14(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((MultiGuestAvatarIntroFragment) viewOnClickListenerC512201z6.l0).dismiss();
    }

    public static final void onClick$15(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((MultiGuestAvatarIntroFragment) viewOnClickListenerC512201z6.l0).dismiss();
        MultiGuestAvatarIntroFragment multiGuestAvatarIntroFragment = (MultiGuestAvatarIntroFragment) viewOnClickListenerC512201z6.l0;
        multiGuestAvatarIntroFragment.getClass();
        C782110Um9 c782110Um9 = new C782110Um9(multiGuestAvatarIntroFragment.getContext());
        c782110Um9.LJIIZILJ(2131852848);
        c782110Um9.LJII(2131852845);
        c782110Um9.LJIIJ(2131852830, new InterfaceC743640TFa() { // from class: X.01GP
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILIIL(2131852846, new C515201za(multiGuestAvatarIntroFragment, 4));
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static final void onClick$16(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        DataChannel dataChannel = ((MultiGuestAvatarIntroFragment) viewOnClickListenerC512201z6.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestOpenPreviewFromAvatarEvent.class, "avatar_ai_icon");
        }
        ((MultiGuestAvatarIntroFragment) viewOnClickListenerC512201z6.l0).dismiss();
    }

    public static final void onClick$17(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        String str;
        PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) viewOnClickListenerC512201z6.l0;
        playbookEditorMoreDialog.getClass();
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        String str2 = playbookEditorMoreDialog.LLLFF;
        Long lValueOf = Long.valueOf(playbookEditorMoreDialog.LLL.playbookId);
        if (Intrinsics.LJFF(playbookEditorMoreDialog.LLLFF, "create_preview")) {
            str = "create";
        } else {
            str = "edit";
        }
        C978360bZC.LJIJ(str2, "delete", lValueOf, str, playbookEditorMoreDialog.LLLIIII.invoke().booleanValue(), null, null);
        PlaybookUtilKt.LJJIIJZLJL(playbookEditorMoreDialog.LLJZIJLIL, C497740JfY.LJIJI(2131854054), C497740JfY.LJIJI(2131854053), C497740JfY.LJIJI(2131854088), new C5182020e(playbookEditorMoreDialog, 550));
        playbookEditorMoreDialog.close(1);
    }

    public static final void onClick$18(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) viewOnClickListenerC512201z6.l0;
        PlaybookUtilKt.LJJIIJZLJL(playbookEditorMoreDialog.LLJZIJLIL, "Confirm pass review", "Please be careful. After review passed, all online users will be able to use this Playbook.", C497740JfY.LJIJI(2131843826), new C5182020e(playbookEditorMoreDialog, 551));
        playbookEditorMoreDialog.close(1);
    }

    public static final void onClick$19(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) viewOnClickListenerC512201z6.l0;
        PlaybookUtilKt.LJJIIJZLJL(playbookEditorMoreDialog.LLJZIJLIL, "Confirm reject review", "After review reject, this playbook content will be unavailable.", C497740JfY.LJIJI(2131843826), new C5182020e(playbookEditorMoreDialog, 552));
        playbookEditorMoreDialog.close(1);
    }

    public static final void onClick$2(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        boolean zLJI = MethodIDManager.LJI(72110);
        Function1<? super Boolean, Unit> function1 = ((C1146260fw0) viewOnClickListenerC512201z6.l0).LL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void onClick$20(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) viewOnClickListenerC512201z6.l0;
        PlaybookUtilKt.LJJIIJZLJL(playbookEditorMoreDialog.LLJZIJLIL, "Confirm trash review", "Please be careful. After trash, this playbook content will be invisible forever.", C497740JfY.LJIJI(2131843826), new C5182020e(playbookEditorMoreDialog, 553));
        playbookEditorMoreDialog.close(1);
    }

    public static final void onClick$21(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        C972080bP4.LIZLLL("switch Stroke state", "AnchorTextHeaderCreationSheetFragment", 2);
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = ((AnchorTextHeaderCreationSheetFragment) viewOnClickListenerC512201z6.l0).LLL;
        if (anchorTextHeaderViewModel != null) {
            MutableLiveData<C01F5> mutableLiveData = anchorTextHeaderViewModel.LLJJ;
            C01F5 value = mutableLiveData.getValue();
            if (value == null) {
                value = new C01F5(null, null, 0, false, 0.0f, false, 255);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchStrokeState oldState:");
            sbLIZ.append(value.LIZLLL);
            sbLIZ.append(" newState:");
            sbLIZ.append(!value.LIZLLL);
            anchorTextHeaderViewModel.NQ2(C2188811AlT.LIZIZ(sbLIZ));
            mutableLiveData.setValue(C01F5.LIZ(value, null, null, 0, !value.LIZLLL, 0.0f, 247));
        }
    }

    public static final void onClick$22(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((BillboardMultiDeleteConfirmSheetFragment) viewOnClickListenerC512201z6.l0).close(1);
    }

    public static final void onClick$23(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((PreviewLiveGrowthMVPWidget) viewOnClickListenerC512201z6.l0).hide();
        PreviewLiveGrowthMVPWidget previewLiveGrowthMVPWidget = (PreviewLiveGrowthMVPWidget) viewOnClickListenerC512201z6.l0;
        previewLiveGrowthMVPWidget.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_growth_journey_takepage_banner_close");
        c474500IjALIZ.LJIJJLI(previewLiveGrowthMVPWidget.dataChannel);
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(previewLiveGrowthMVPWidget.LLJI, "banner_type");
        c474500IjALIZ.LJJII(previewLiveGrowthMVPWidget.LLJILJIL, "growth_instance_strategy");
        c474500IjALIZ.LJJII(previewLiveGrowthMVPWidget.LLJIJIL, "growth_stage");
        c474500IjALIZ.LJJII(previewLiveGrowthMVPWidget.LLJILJILJ, "banner_frequency_key");
        c474500IjALIZ.LIZ();
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(LiveGrowthMVPBannerChannel.class));
    }

    public static final void onClick$24(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((PreviewNrVoiceChatGuideWidget) viewOnClickListenerC512201z6.l0).getClass();
        PreviewNrVoiceChatGuideWidget.H1("click");
        DataChannel dataChannel = ((PreviewNrVoiceChatGuideWidget) viewOnClickListenerC512201z6.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(SwitchLiveModeChannel.class, LiveMode.LIVE_VOICE);
        }
    }

    public static final void onClick$25(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        GameDropsPreviewBanner gameDropsPreviewBanner = (GameDropsPreviewBanner) viewOnClickListenerC512201z6.l0;
        gameDropsPreviewBanner.getClass();
        if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0() != null) {
            C01GU.LIZLLL(gameDropsPreviewBanner.context, C2097908Jt.LIZJ(new Pair("source_page", "live_take_page")));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_drops_banner_click");
        c474500IjALIZ.LJJII(((GameDropsPreviewBanner) viewOnClickListenerC512201z6.l0).LLJILJIL, "banner_id");
        c474500IjALIZ.LIZ();
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            ((GameDropsPreviewBanner) viewOnClickListenerC512201z6.l0).L1();
        }
    }

    public static final void onClick$26(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        Long lValueOf;
        String str;
        String str2;
        Map<Long, Boolean> mapLIZIZ = InterfaceC772390URp.S.LIZIZ();
        PartnershipGameEvent partnershipGameEvent = ((GameEventPreviewBanner) viewOnClickListenerC512201z6.l0).LLJILLL;
        String str3 = null;
        if (partnershipGameEvent != null) {
            lValueOf = Long.valueOf(partnershipGameEvent.gameTagId);
        } else {
            lValueOf = null;
        }
        mapLIZIZ.put(lValueOf, Boolean.TRUE);
        ((GameEventPreviewBanner) viewOnClickListenerC512201z6.l0).P1("live_start");
        GameEventPreviewBanner gameEventPreviewBanner = (GameEventPreviewBanner) viewOnClickListenerC512201z6.l0;
        gameEventPreviewBanner.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("live_start", "page_name");
        c474500IjALIZ.LJJII(gameEventPreviewBanner.LLILZIL, "live_type");
        c474500IjALIZ.LJJII("activity_banner", "btn_name");
        PartnershipGameEvent partnershipGameEvent2 = gameEventPreviewBanner.LLJILLL;
        if (partnershipGameEvent2 == null || (str = partnershipGameEvent2.gameName) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "game_name");
        PartnershipGameEvent partnershipGameEvent3 = gameEventPreviewBanner.LLJILLL;
        if (partnershipGameEvent3 != null) {
            str2 = partnershipGameEvent3.gameIdStr;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(Long.valueOf(gameEventPreviewBanner.O1(str2)), "game_id");
        PartnershipGameEvent partnershipGameEvent4 = gameEventPreviewBanner.LLJILLL;
        if (partnershipGameEvent4 != null) {
            str3 = partnershipGameEvent4.taskIdStr;
        }
        c474500IjALIZ.LJJII(Long.valueOf(gameEventPreviewBanner.O1(str3)), "game_task_id");
        c474500IjALIZ.LIZ();
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            ((GameEventPreviewBanner) viewOnClickListenerC512201z6.l0).L1();
        }
    }

    public static final void onClick$27(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        GameEventPreviewBanner gameEventPreviewBanner = (GameEventPreviewBanner) viewOnClickListenerC512201z6.l0;
        gameEventPreviewBanner.hide();
        gameEventPreviewBanner.LLJIJIL = false;
    }

    public static final void onClick$28(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        GameGpppaPreviewBanner gameGpppaPreviewBanner = (GameGpppaPreviewBanner) viewOnClickListenerC512201z6.l0;
        gameGpppaPreviewBanner.getClass();
        String helpCenterUrl = GameLivePartnershipGpppaHelpCenterSetting.INSTANCE.getHelpCenterUrl();
        if (C1533950q1J.LJ(helpCenterUrl)) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(gameGpppaPreviewBanner.context, helpCenterUrl, null);
        }
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            ((GameGpppaPreviewBanner) viewOnClickListenerC512201z6.l0).L1();
        }
    }

    public static final void onClick$29(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((GameGpppaPreviewBanner) viewOnClickListenerC512201z6.l0).I1(true);
    }

    public static final void onClick$3(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        Boolean boolValueOf;
        Function1<? super Boolean, Unit> function1;
        CharSequence text;
        C16F5 c16f5 = ((C1146260fw0) viewOnClickListenerC512201z6.l0).LLJJJJLIIL;
        if (c16f5 != null && (text = c16f5.getText()) != null) {
            boolValueOf = Boolean.valueOf(a0.LJJJIL(text));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf) && (function1 = ((C1146260fw0) viewOnClickListenerC512201z6.l0).LL) != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void onClick$30(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        new NotionFragment().show(((BasePreviewSettingMainFragmentSheetInitializer) viewOnClickListenerC512201z6.l0).LL.getChildFragmentManager(), "");
    }

    public static final void onClick$31(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        GameLiveNewBroadcastEducationBannerWidget gameLiveNewBroadcastEducationBannerWidget = (GameLiveNewBroadcastEducationBannerWidget) viewOnClickListenerC512201z6.l0;
        gameLiveNewBroadcastEducationBannerWidget.getClass();
        String value = LiveNewGameBroadcastEducationScheme.INSTANCE.getValue();
        if (value.length() > 0) {
            C018T c018t = C018T.Banner;
            String str = gameLiveNewBroadcastEducationBannerWidget.LLILZIL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_guide_click");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(str, "live_type");
            c474500IjALIZ.LJJII(c018t.getValue(), "event_page");
            c474500IjALIZ.LIZ();
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(gameLiveNewBroadcastEducationBannerWidget.context, C0KYL.LIZ(u.LJJIFFI(value, "{ENTER_FROM}", c018t.getValue(), false)).LIZ().toString(), null);
        } else {
            C20441214yg.LJ("GameLiveNewBroadcastEducationBannerWidget", "openH5EducationSchemeUrl. ");
        }
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            ((GameLiveNewBroadcastEducationBannerWidget) viewOnClickListenerC512201z6.l0).L1();
        }
    }

    public static final void onClick$32(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((PreviewHighLightVideoWidget) viewOnClickListenerC512201z6.l0).I1(true);
    }

    public static final void onClick$33(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        String strValueOf;
        String str;
        String str2 = ((PreviewHighLightVideoWidget) viewOnClickListenerC512201z6.l0).LLILZIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_highlight_guide_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "live_type");
        c474500IjALIZ.LIZ();
        GameLiveFragment gameLiveFragment = ((PreviewHighLightVideoWidget) viewOnClickListenerC512201z6.l0).LLJILJIL;
        if (gameLiveFragment == null || (strValueOf = gameLiveFragment.fragmentIdStr) == null) {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        GameLiveFragment gameLiveFragment2 = ((PreviewHighLightVideoWidget) viewOnClickListenerC512201z6.l0).LLJILJIL;
        if (gameLiveFragment2 != null) {
            str = gameLiveFragment2.downloadUrl;
        } else {
            str = null;
        }
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).Ut(((PreviewHighLightVideoWidget) viewOnClickListenerC512201z6.l0).context, str, "live_takepage_highlight_guide", ".mp4", strValueOf, 0, "", "", "", "", CardStruct.IStatusCode.DEFAULT, String.valueOf(UserService.getInstance().user().getCurrentUserId()), "", "", null, "", "", C2097608Jq.LJ(), null);
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            ((PreviewHighLightVideoWidget) viewOnClickListenerC512201z6.l0).L1();
        }
    }

    public static final void onClick$34(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        int iIntValue;
        int i;
        String str;
        if (!((LiveGiftReminderAmountKeyboardFragment) viewOnClickListenerC512201z6.l0).isAdded() || ((LiveGiftReminderAmountKeyboardFragment) viewOnClickListenerC512201z6.l0).getHost() == null) {
            return;
        }
        String strVR = LiveGiftReminderAmountKeyboardFragment.VR(String.valueOf(C2204961BRm.LLLFZ(((LiveGiftReminderAmountKeyboardFragment) viewOnClickListenerC512201z6.l0).RR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7CPIYfMl2jAEDSGlvzdH7nD8kcpaY7U4Kg+6h+byNkt0EzEvzgv7JhJ+5nnJ3GglkqE7Et3tX4qATxAj", null))));
        LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment = (LiveGiftReminderAmountKeyboardFragment) viewOnClickListenerC512201z6.l0;
        if (new Regex("[0-9]+").matches(strVR) && strVR.length() > 0 && strVR.length() <= 9) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(strVR);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            C250000xu c250000xu = C250000xu.LIZ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            c250000xu.getClass();
            if (iIntValue == C250000xu.LIZIZ()) {
                i = 1;
            } else {
                i = 0;
            }
            if (C250000xu.LJIJI > C250000xu.LJIJJ) {
                str = "highest";
            } else {
                str = "suggest";
            }
            C250000xu.LJFF(1, numValueOf, i, str, false, liveGiftReminderAmountKeyboardFragment);
        }
    }

    public static final void onClick$35(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        C21411718qp c21411718qp = (C21411718qp) view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check==>");
        sbLIZ.append(c21411718qp.isChecked());
        C20441214yg.LIZIZ("LiveGiftReminderFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (c21411718qp.isChecked()) {
            c21411718qp.setChecked(false);
            C250000xu.LIZ.getClass();
            C250000xu.LJJIJIIJIL = "open";
            ((LiveGiftReminderFragment) viewOnClickListenerC512201z6.l0).NR();
            return;
        }
        c21411718qp.setChecked(true);
        C250000xu c250000xu = C250000xu.LIZ;
        InterfaceC250300xx interfaceC250300xx = new InterfaceC250300xx() { // from class: X.00y1
            @Override // X.InterfaceC250300xx
            public final void onSuccess() {
            }

            @Override // X.InterfaceC250300xx
            public final void onFailure() {
                C250000xu.LIZ.getClass();
                C766270U4b.LJIIJJI(C250000xu.LJJIFFI);
            }
        };
        c250000xu.getClass();
        C250000xu.LJFF(0, null, -1, "-1", true, interfaceC250300xx);
    }

    public static final void onClick$36(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        LiveMode liveMode;
        DataChannel dataChannel = ((PreviewHashtagWidget2) viewOnClickListenerC512201z6.l0).dataChannel;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_click");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII("topic", "component_name");
        c474500IjALIZ.LJJII(C236000ve.LIZ(liveMode), "live_type");
        c474500IjALIZ.LIZ();
        ((PreviewHashtagWidget2) viewOnClickListenerC512201z6.l0).H1(null);
    }

    public static final void onClick$37(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        Long lValueOf;
        Room room;
        User owner;
        Room room2;
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = ((ModeratorHostIModeratorListFragment) viewOnClickListenerC512201z6.l0).getContext();
        if (context == null) {
            return;
        }
        ModeratorHostIModeratorListFragment moderatorHostIModeratorListFragment = (ModeratorHostIModeratorListFragment) viewOnClickListenerC512201z6.l0;
        String value = LiveHostIModerateFaqLinkSetting.INSTANCE.getValue();
        moderatorHostIModeratorListFragment.getClass();
        Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
        DataChannel dataChannelLJ = C475510Ikn.LJ(moderatorHostIModeratorListFragment);
        Long lValueOf2 = null;
        if (dataChannelLJ != null && (room2 = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("room_id", String.valueOf(lValueOf));
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(moderatorHostIModeratorListFragment);
        if (dataChannelLJ2 != null && (room = (Room) dataChannelLJ2.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("anchor_id", String.valueOf(lValueOf2));
        w.LIZ.getClass();
        iActionHandlerService.handle(context, builderAppendQueryParameter2.appendQueryParameter("enter_from_merge", w.LJIIIZ()).appendQueryParameter("enter_method", w.LJIIL()).toString());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_host_moderate_faq_click");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ((ModeratorHostIModeratorListFragment) viewOnClickListenerC512201z6.l0));
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$38(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        C01K8 c01k8 = ((CountDownForAllV2ScoreDialog) viewOnClickListenerC512201z6.l0).LLL;
        if (c01k8 != null) {
            c01k8.LIZLLL();
        }
    }

    public static final void onClick$39(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((C01HJ) viewOnClickListenerC512201z6.l0).LLJJIJI.LJII();
        C306901Gx.LJIIJ(((C01HJ) viewOnClickListenerC512201z6.l0).LLJLLIL);
        C01HJ c01hj = (C01HJ) viewOnClickListenerC512201z6.l0;
        c01hj.dismiss();
        C785410UrT.LIZ(c01hj);
    }

    public static final void onClick$4(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((MultiGuestCountDownHistoryDialog) viewOnClickListenerC512201z6.l0).dismiss();
    }

    public static final void onClick$40(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((C01HJ) viewOnClickListenerC512201z6.l0).LLJJIJI.LIZIZ();
        C01HJ c01hj = (C01HJ) viewOnClickListenerC512201z6.l0;
        c01hj.dismiss();
        C785410UrT.LIZ(c01hj);
    }

    public static final void onClick$41(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        long jLongValue;
        boolean zBooleanValue;
        String str;
        ((C01HJ) viewOnClickListenerC512201z6.l0).LLJJIJI.LIZJ();
        Long l = ((C01HJ) viewOnClickListenerC512201z6.l0).LLJJJ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 300;
        }
        Boolean bool = ((C01HJ) viewOnClickListenerC512201z6.l0).LLJJJIL;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Map mapLIZIZ = C306901Gx.LIZIZ();
        mapLIZIZ.put("show_duration_per_guest", String.valueOf(jLongValue));
        if (zBooleanValue) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZIZ.put("is_guest_mic_open", str);
        C306901Gx.LJIL("livesdk_anchor_multiguest_liveshow_end_click", mapLIZIZ);
    }

    public static final void onClick$42(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        Function1<Context, Unit> function1 = ((C186800ni) viewOnClickListenerC512201z6.l0).LL;
        if (function1 != null) {
            function1.invoke(view.getContext());
        }
    }

    public static final void onClick$43(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        Function1<Context, Unit> function1 = ((C186900nj) viewOnClickListenerC512201z6.l0).LL;
        if (function1 != null) {
            function1.invoke(view.getContext());
        }
    }

    public static final void onClick$44(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        long j;
        boolean z;
        CountdownConfig countdownConfigLJLIIIL = ((DialogC20518615Qq) viewOnClickListenerC512201z6.l0).LJLIIIL();
        DialogC20518615Qq dialogC20518615Qq = (DialogC20518615Qq) viewOnClickListenerC512201z6.l0;
        String str = dialogC20518615Qq.LLJILLL;
        String str2 = dialogC20518615Qq.LLJILJILJ;
        long j2 = countdownConfigLJLIIIL.duration;
        long j3 = 1;
        if (dialogC20518615Qq.LLL == 0) {
            j = 1;
        } else {
            j = 0;
        }
        if (!countdownConfigLJLIIIL.autoExpand) {
            j3 = 0;
        }
        long j4 = countdownConfigLJLIIIL.targetScore;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("link_id", str);
        map.put("guest_id", str2);
        map.put("duration", String.valueOf(j2));
        map.put("is_customed_dur", String.valueOf(j));
        map.put("is_expand_guest", String.valueOf(j3));
        map.put("countdown_target", String.valueOf(j4));
        C0KX4.LIZ("livesdk_anchor_guest_countdown_setting_click", map, null, true);
        ((DialogC20518615Qq) viewOnClickListenerC512201z6.l0).LLLIIIIL = EnumC421801kW.BOTTOM_BUTTON;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C01ZD.LIZ(7) && C930540aK4.LIZJ()) {
            C916770Zxr c916770Zxr = C916770Zxr.LIZ;
            Context context = ((DialogC20518615Qq) viewOnClickListenerC512201z6.l0).getContext();
            boolean z2 = countdownConfigLJLIIIL.autoExpand;
            C020Y c020y = new C020Y((DialogC20518615Qq) viewOnClickListenerC512201z6.l0, countdownConfigLJLIIIL, 33);
            c916770Zxr.getClass();
            C916770Zxr.LIZ(context, "count_down_single", c020y, z2);
            return;
        }
        DialogC20518615Qq dialogC20518615Qq2 = (DialogC20518615Qq) viewOnClickListenerC512201z6.l0;
        InterfaceC422501kd interfaceC422501kd = dialogC20518615Qq2.LLJILJIL;
        if (dialogC20518615Qq2.LLL == 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC422501kd.LIZ(countdownConfigLJLIIIL, z);
    }

    public static final void onClick$45(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        C320501Md.LIZJ("click", "cancel");
        DialogC423101kj dialogC423101kj = (DialogC423101kj) viewOnClickListenerC512201z6.l0;
        dialogC423101kj.LLJJ = EnumC421901kX.CANCEL_BUTTON;
        dialogC423101kj.dismiss();
        C785410UrT.LIZ(dialogC423101kj);
    }

    public static final void onClick$46(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        C320501Md.LIZJ("click", "confirm");
        DialogC423101kj dialogC423101kj = (DialogC423101kj) viewOnClickListenerC512201z6.l0;
        dialogC423101kj.LLJJ = EnumC421901kX.CONFIRM_BUTTON;
        dialogC423101kj.LLJI.LIZ();
    }

    public static final void onClick$47(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        DialogC430701lx dialogC430701lx = (DialogC430701lx) viewOnClickListenerC512201z6.l0;
        dialogC430701lx.LLJILJIL.LJFF(dialogC430701lx.LJLIIIL());
        DialogC430701lx dialogC430701lx2 = (DialogC430701lx) viewOnClickListenerC512201z6.l0;
        dialogC430701lx2.LLLFF = "bottom_button";
        dialogC430701lx2.dismiss();
        C785410UrT.LIZ(dialogC430701lx2);
    }

    public static final void onClick$48(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((DialogC430701lx) viewOnClickListenerC512201z6.l0).LLJILJIL.LIZIZ();
        DialogC430701lx dialogC430701lx = (DialogC430701lx) viewOnClickListenerC512201z6.l0;
        dialogC430701lx.dismiss();
        C785410UrT.LIZ(dialogC430701lx);
    }

    public static final void onClick$49(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((DialogC430701lx) viewOnClickListenerC512201z6.l0).LLJILJIL.LIZIZ();
        DialogC430701lx dialogC430701lx = (DialogC430701lx) viewOnClickListenerC512201z6.l0;
        dialogC430701lx.dismiss();
        C785410UrT.LIZ(dialogC430701lx);
    }

    public static final void onClick$5(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((MultiGuestCountDownHistoryDialog) viewOnClickListenerC512201z6.l0).MR();
    }

    public static final void onClick$50(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        FragmentManager fragmentManager;
        String string;
        DialogC430701lx dialogC430701lx = (DialogC430701lx) viewOnClickListenerC512201z6.l0;
        DataChannel dataChannel = dialogC430701lx.LLJILLL;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            ShowConfig showConfig = dialogC430701lx.LLJILJILJ;
            if (showConfig != null) {
                string = Long.valueOf(showConfig.transitionDurationOfConfig).toString();
            } else {
                string = null;
            }
            Map mapLIZ = C306901Gx.LIZ();
            mapLIZ.put("is_liveshow_ongoing", C306901Gx.LJFF());
            if (string == null) {
                string = "";
            }
            mapLIZ.put("intervals_before", string);
            C306901Gx.LJIL("livesdk_mg_anchor_liveshow_setting_intervals_show", mapLIZ);
            TuxSheet tuxSheet = dialogC430701lx.LLL;
            if (tuxSheet != null) {
                tuxSheet.dismissAllowingStateLoss();
            }
            C1579100rC8 c1579100rC8 = new C1579100rC8();
            c1579100rC8.LJI = C497740JfY.LJIJI(2131843344);
            c1579100rC8.LIZJ(6);
            long j = 0;
            c1579100rC8.LIZLLL(0L, 650000L);
            ShowConfig showConfig2 = dialogC430701lx.LLJILJILJ;
            if (showConfig2 != null) {
                j = showConfig2.transitionDurationOfConfig;
            }
            c1579100rC8.LIZIZ(j * 1000);
            c1579100rC8.LJII = C497740JfY.LJIJI(2131843343);
            c1579100rC8.LJFF = 2;
            c1579100rC8.LJ = new C5183020f(dialogC430701lx, 194);
            TuxSheet tuxSheet2 = c1579100rC8.LIZ().LIZ;
            dialogC430701lx.LLL = tuxSheet2;
            if (tuxSheet2 != null) {
                tuxSheet2.show(fragmentManager, "LiveShowTransmissionDurationSheet");
            }
        }
        Map mapLIZ2 = C306901Gx.LIZ();
        mapLIZ2.put("is_liveshow_ongoing", C306901Gx.LJFF());
        C306901Gx.LJIL("livesdk_mg_anchor_liveshow_setting_intervals_click", mapLIZ2);
    }

    public static final void onClick$51(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        int iLJJI;
        Boolean bool;
        C495520Jby c495520Jby = new C495520Jby(LiveGameAutoCoverFAQPage.INSTANCE.getValue());
        c495520Jby.LIZJ("lang", C19263510Xx.LIZIZ());
        DataChannel dataChannel = ((GameAutoCoverWidget) viewOnClickListenerC512201z6.l0).dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null && !bool.booleanValue()) {
            iLJJI = (int) C497740JfY.LJJI(C465640INu.LIZIZ(((GameAutoCoverWidget) viewOnClickListenerC512201z6.l0).context));
        } else {
            iLJJI = 398;
        }
        int iLJJI2 = (int) C497740JfY.LJJI(C465640INu.LIZIZ(((GameAutoCoverWidget) viewOnClickListenerC512201z6.l0).context));
        C760370TsB c760370TsBLIZJ = C0KYL.LIZJ(c495520Jby.LIZLLL());
        c760370TsBLIZJ.LJIJJLI("right");
        EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
        c760370TsBLIZJ.LJJ(iLJJI2, enumC760350Ts9);
        c760370TsBLIZJ.LJIIIZ(iLJJI, enumC760350Ts9);
        c760370TsBLIZJ.LJIJI(8, enumC760350Ts9);
        c760370TsBLIZJ.LJIIIIZZ("bottom");
        c760370TsBLIZJ.LJIILIIL("end");
        String string = c760370TsBLIZJ.LIZ().toString();
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(((GameAutoCoverWidget) viewOnClickListenerC512201z6.l0).context, string, null);
        }
    }

    public static final void onClick$52(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        C250000xu.LIZ.getClass();
        boolean zLJ = C250000xu.LJ();
        String str = C250000xu.LJJIJIIJI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_limit_gear_setting_click");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJ ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(str, "first_panel_from");
        c474500IjALIZ.LJJII("basic", "reminder_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        C250000xu.LJJIJIIJIL = "set_limit";
        ((LiveGiftReminderFragment) viewOnClickListenerC512201z6.l0).NR();
    }

    public static final void onClick$53(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        String str;
        if (TextUtils.isEmpty(((LiveGiftReminderFragment) viewOnClickListenerC512201z6.l0).LLJJ)) {
            return;
        }
        Uri.Builder builderBuildUpon = C500260Jjc.LJJL(UriProtector.parse(((LiveGiftReminderFragment) viewOnClickListenerC512201z6.l0).LLJJ), "height", String.valueOf(((LiveGiftReminderFragment) viewOnClickListenerC512201z6.l0).LLJILLL)).buildUpon();
        C250000xu.LIZ.getClass();
        if (C250000xu.LJJII) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        Uri uriBuild = builderBuildUpon.appendQueryParameter("is_custom_style", str).build();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url===>");
        sbLIZ.append(uriBuild);
        C20441214yg.LIZIZ("LiveGiftReminderFragment", C2188811AlT.LIZIZ(sbLIZ));
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((LiveGiftReminderFragment) viewOnClickListenerC512201z6.l0).getContext(), uriBuild);
    }

    public static final void onClick$54(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((LiveGiftReminderAmountKeyboardFragment) viewOnClickListenerC512201z6.l0).RR().setText("");
    }

    public static final void onClick$55(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((PreviewIncentiveCampaignWidget) viewOnClickListenerC512201z6.l0).hide();
    }

    public static final void onClick$56(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        FragmentManager fragmentManager;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dataChannel=");
        sbLIZ.append(((C307701Hf) viewOnClickListenerC512201z6.l0).LIZIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(((C307701Hf) viewOnClickListenerC512201z6.l0).LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("RankCountDownViewBinder", strLIZIZ);
        long j = ((C307701Hf) viewOnClickListenerC512201z6.l0).LIZJ;
        MultiGuestCountDownHistoryDialog multiGuestCountDownHistoryDialog = new MultiGuestCountDownHistoryDialog();
        multiGuestCountDownHistoryDialog.LLILZ = Long.valueOf(j);
        DataChannel dataChannel = ((C307701Hf) viewOnClickListenerC512201z6.l0).LIZIZ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            multiGuestCountDownHistoryDialog.show(fragmentManager, ((C307701Hf) viewOnClickListenerC512201z6.l0).getClass().getName());
        }
    }

    public static final void onClick$57(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Context context = ((HangoutSectionUserHostRoomCell) viewOnClickListenerC512201z6.l0).itemView.getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            SheetOptions sheetOptions = new SheetOptions();
            sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
            sheetOptions.dimBehindType = 1;
            C19322110iZ.LIZLLL(supportFragmentManager, TopLivePageUserHostRoomformationFragment.class, "toplive_user_host_room_info", sheetOptions, null);
        }
    }

    public static final void onClick$58(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        FragmentManager fragmentManager;
        TryModeMultiGuestAnchorManageSheet tryModeMultiGuestAnchorManageSheet = (TryModeMultiGuestAnchorManageSheet) viewOnClickListenerC512201z6.l0;
        tryModeMultiGuestAnchorManageSheet.getClass();
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        DataChannel dataChannelLJ = C475510Ikn.LJ(tryModeMultiGuestAnchorManageSheet);
        if (dataChannelLJ != null && (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null) {
            ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).HG1(currentUserId, userLJIJJLI).NR(fragmentManager);
        }
    }

    public static final void onClick$59(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        int i;
        Object c098200Yq;
        long jLJJLIIIJ;
        GroupLiveRankingPanelAssem groupLiveRankingPanelAssem = (GroupLiveRankingPanelAssem) viewOnClickListenerC512201z6.l0;
        groupLiveRankingPanelAssem.getClass();
        AbstractC2863018z abstractC2863018z = groupLiveRankingPanelAssem.Go().getState().LL;
        if (abstractC2863018z instanceof C2862018y) {
            i = ((C2862018y) abstractC2863018z).LJFF;
        } else {
            i = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("group_live_ranking_widget_click");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "online_group_member_cnt");
        c474500IjALIZ.LIZ();
        String str = GiftGroupLiveLinksSettings.getValue().rankingLink;
        if (C500260Jjc.LJJIIZ(str)) {
            C495520Jby c495520Jby = new C495520Jby(str);
            try {
                DataChannel dataChannel = groupLiveRankingPanelAssem.Go().vQ2().LL;
                if (dataChannel != null) {
                    jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
                } else {
                    jLJJLIIIJ = 0;
                }
                c098200Yq = Long.valueOf(jLJJLIIIJ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = 0L;
            }
            c495520Jby.LIZIZ(((Number) c098200Yq).longValue(), "room_id");
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(groupLiveRankingPanelAssem.getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
        }
    }

    public static final void onClick$6(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        C930540aK4.LJJIZ((LiveShowLeaveRankDialog) viewOnClickListenerC512201z6.l0);
    }

    public static final void onClick$7(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((LiveShowLeaveRankDialog) viewOnClickListenerC512201z6.l0).MR();
    }

    public static final void onClick$8(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        Context context = ((LiveShowLeaveRankDialog) viewOnClickListenerC512201z6.l0).getContext();
        if (context != null) {
            DialogC951720asE dialogC951720asE = new DialogC951720asE(context, new InterfaceC951750asH() { // from class: X.01H2
                @Override // X.InterfaceC951750asH
                public final void LIZIZ() {
                }
            });
            dialogC951720asE.show();
            C785410UrT.LIZIZ(dialogC951720asE);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC951720asE);
            C816490W1f.LIZ(dialogC951720asE);
            C306901Gx.LJIIJ("liveshow_end_ranking");
        }
    }

    public static final void onClick$9(ViewOnClickListenerC512201z6 viewOnClickListenerC512201z6, View view) {
        ((MultiGuestGiftContributeRankDialog) viewOnClickListenerC512201z6.l0).dismiss();
    }
}
