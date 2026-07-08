package Y;

import X.AbstractC923750a97;
import X.AbstractC928510aGn;
import X.AbstractC960710b6j;
import X.C013C;
import X.C01HM;
import X.C01N8;
import X.C0JGZ;
import X.C0PEM;
import X.C13LP;
import X.C15438062q;
import X.C19487111Lx;
import X.C1AI0;
import X.C20441214yg;
import X.C20744116Fj;
import X.C23250099c;
import X.C259800zU;
import X.C306901Gx;
import X.C465900IOu;
import X.C782110Um9;
import X.C785410UrT;
import X.C786410Ut5;
import X.C915050Zv5;
import X.C915980Zwa;
import X.C917510Zz3;
import X.C917720ZzO;
import X.C919310a1x;
import X.C919410a27;
import X.C919620a2S;
import X.C920280a3W;
import X.C921920a6A;
import X.C922430a6z;
import X.C923050a7z;
import X.C923650a8x;
import X.C924180a9o;
import X.C924650aAZ;
import X.C924660aAa;
import X.C924980aB6;
import X.C925650aCB;
import X.C927010aEN;
import X.C930480aJy;
import X.C930540aK4;
import X.C932410aN5;
import X.C932420aN6;
import X.C932910aNt;
import X.C933080aOA;
import X.C935470aS1;
import X.C937770aVj;
import X.C942580adU;
import X.C943050aeF;
import X.C943060aeG;
import X.C943120aeM;
import X.C944400agQ;
import X.C946150ajF;
import X.C946390ajd;
import X.C946850akN;
import X.C948450amx;
import X.C953230auf;
import X.C953760avW;
import X.C953770avX;
import X.C954060aw0;
import X.C955400ayA;
import X.C955800ayo;
import X.C957690b1r;
import X.C958660b3Q;
import X.C962130b91;
import X.C971040bNO;
import X.C971050bNP;
import X.C972120bP8;
import X.C972220bPI;
import X.C972230bPJ;
import X.C973690bRf;
import X.C973930bS3;
import X.C974560bT4;
import X.C987180bnQ;
import X.DialogC971210bNf;
import X.DialogC972110bP7;
import X.EnumC919100a1c;
import X.EnumC920250a3T;
import X.EnumC952890au7;
import X.EnumC971520bOA;
import X.EnumC983140bgu;
import X.InterfaceC302401Fe;
import X.InterfaceC743640TFa;
import X.InterfaceC934710aQn;
import X.InterfaceC945610aiN;
import X.InterfaceC946440aji;
import X.InterfaceC952920auA;
import X.InterfaceC954180awC;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkMicAudienceCancelEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.playing.TakeStagePlayingManageFragment;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.punish.TakeStagePunishManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.ModeratorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.MultiGuestApplySheetForGuestInvite;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.guest.AigcWallpaperInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor.AigcWallpaperAnchorEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor.AigcWallpaperAnchorResultFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AigcAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.trymodel.TryModeMultiGuestAnchorManageSheet;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS249S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import webcast.data.multi_guest_play.NoticeboardTemplate;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: loaded from: classes16.dex */
public class AcS496S0100000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
            case 7:
                LIZ$7(this, liveDialog);
                break;
            case 8:
                LIZ$8(this, liveDialog);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, liveDialog);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, liveDialog);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, liveDialog);
                break;
            case 14:
                LIZ$14(this, liveDialog);
                break;
            case 15:
                LIZ$15(this, liveDialog);
                break;
            case 16:
                LIZ$16(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, liveDialog);
                break;
            case 19:
                LIZ$19(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, liveDialog);
                break;
            case 21:
                LIZ$21(this, liveDialog);
                break;
            case 22:
                LIZ$22(this, liveDialog);
                break;
            case 23:
                LIZ$23(this, liveDialog);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, liveDialog);
                break;
            case 25:
                LIZ$25(this, liveDialog);
                break;
            case 26:
                LIZ$26(this, liveDialog);
                break;
            case 27:
                LIZ$27(this, liveDialog);
                break;
            case 28:
                LIZ$28(this, liveDialog);
                break;
            case 29:
                LIZ$29(this, liveDialog);
                break;
            case 30:
                LIZ$30(this, liveDialog);
                break;
            case 31:
                LIZ$31(this, liveDialog);
                break;
            case 32:
                LIZ$32(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, liveDialog);
                break;
            case 35:
                LIZ$35(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, liveDialog);
                break;
            case 37:
                LIZ$37(this, liveDialog);
                break;
            case 38:
                LIZ$38(this, liveDialog);
                break;
            case 39:
                LIZ$39(this, liveDialog);
                break;
            case 40:
                LIZ$40(this, liveDialog);
                break;
            case 41:
                LIZ$41(this, liveDialog);
                break;
            case 42:
                LIZ$42(this, liveDialog);
                break;
            case 43:
                LIZ$43(this, liveDialog);
                break;
            case 44:
                LIZ$44(this, liveDialog);
                break;
            case 45:
                LIZ$45(this, liveDialog);
                break;
            case 46:
                LIZ$46(this, liveDialog);
                break;
            case 47:
                LIZ$47(this, liveDialog);
                break;
            case 48:
                LIZ$48(this, liveDialog);
                break;
            case 49:
                LIZ$49(this, liveDialog);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                LIZ$50(this, liveDialog);
                break;
            case 51:
                LIZ$51(this, liveDialog);
                break;
            case 52:
                LIZ$52(this, liveDialog);
                break;
            case 53:
                LIZ$53(this, liveDialog);
                break;
            case 54:
                LIZ$54(this, liveDialog);
                break;
            case 55:
                LIZ$55(this, liveDialog);
                break;
            case 56:
                LIZ$56(this, liveDialog);
                break;
            case 57:
                LIZ$57(this, liveDialog);
                break;
            case 58:
                LIZ$58(this, liveDialog);
                break;
            case 59:
                LIZ$59(this, liveDialog);
                break;
            case 60:
                LIZ$60(this, liveDialog);
                break;
            case 61:
                LIZ$61(this, liveDialog);
                break;
            case BaseNotice.CREATOR /* 62 */:
                LIZ$62(this, liveDialog);
                break;
            case 63:
                LIZ$63(this, liveDialog);
                break;
            case 64:
                LIZ$64(this, liveDialog);
                break;
            case 65:
                LIZ$65(this, liveDialog);
                break;
            case 66:
                LIZ$66(this, liveDialog);
                break;
            case 67:
                LIZ$67(this, liveDialog);
                break;
            case 68:
                LIZ$68(this, liveDialog);
                break;
            case 69:
                LIZ$69(this, liveDialog);
                break;
            case 70:
                LIZ$70(this, liveDialog);
                break;
            case 71:
                LIZ$71(this, liveDialog);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                LIZ$72(this, liveDialog);
                break;
            case 73:
                LIZ$73(this, liveDialog);
                break;
            case 74:
                LIZ$74(this, liveDialog);
                break;
            case 75:
                LIZ$75(this, liveDialog);
                break;
            case 76:
                LIZ$76(this, liveDialog);
                break;
            case 77:
                LIZ$77(this, liveDialog);
                break;
            case 78:
                LIZ$78(this, liveDialog);
                break;
            case 79:
                LIZ$79(this, liveDialog);
                break;
            case 80:
                LIZ$80(this, liveDialog);
                break;
            case 81:
                LIZ$81(this, liveDialog);
                break;
            case 82:
                LIZ$82(this, liveDialog);
                break;
            case 83:
                LIZ$83(this, liveDialog);
                break;
            case 84:
                LIZ$84(this, liveDialog);
                break;
            case 85:
                LIZ$85(this, liveDialog);
                break;
            case 86:
                LIZ$86(this, liveDialog);
                break;
        }
    }

    public AcS496S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((C932910aNt) acS496S0100000_15.l0).getClass();
        C932910aNt.LJIIIIZZ(null);
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        WeakReference<AbstractC923750a97> weakReference;
        AbstractC923750a97 abstractC923750a97;
        MultiGuestApplySheetForGuestInvite multiGuestApplySheetForGuestInvite = (MultiGuestApplySheetForGuestInvite) acS496S0100000_15.l0;
        multiGuestApplySheetForGuestInvite.LLLI = true;
        C927010aEN c927010aEN = multiGuestApplySheetForGuestInvite.LLJLLL;
        if (c927010aEN != null && (weakReference = c927010aEN.LIZIZ) != null && (abstractC923750a97 = weakReference.get()) != null) {
            abstractC923750a97.cancel("leave_source_user_click_cancel");
        }
        ((MultiGuestApplySheetForGuestInvite) acS496S0100000_15.l0).wS("click");
        liveDialog.dismiss();
        ((MultiGuestApplySheetForGuestInvite) acS496S0100000_15.l0).close(1);
    }

    public static final void LIZ$10(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$11(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((TakeStagePunishManageFragment) acS496S0100000_15.l0).LLILZIL.invoke(EnumC983140bgu.QUIT, 0L);
        C973690bRf.LIZ.LJJIFFI(true);
        liveDialog.dismiss();
    }

    public static final void LIZ$12(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = ((AigcWallpaperGuestEditFragment) acS496S0100000_15.l0).LLJ;
        if (aigcWallpaperGuestViewModel != null) {
            aigcWallpaperGuestViewModel.LLJJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aigcWallpaperGuestViewModel), C0PEM.LIZJ, null, new C943060aeG(aigcWallpaperGuestViewModel, null), 2);
        }
        C943120aeM.LJIIJJI("guest_quit_game", "click", "proceed");
        C943120aeM.LJIIL("guest_skip");
        liveDialog.dismiss();
        C930540aK4.LJJIZ(((AigcWallpaperGuestEditFragment) acS496S0100000_15.l0).LLIZ);
    }

    public static final void LIZ$13(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C01N8.LIZ(0, "zoom", C920280a3W.LIZIZ((EnumC920250a3T) acS496S0100000_15.l0), 0L, "anchor", "double_check_dialog_cancel", "");
    }

    public static final void LIZ$14(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function0) acS496S0100000_15.l0).invoke();
    }

    public static final void LIZ$15(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$16(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function0 function0 = (Function0) acS496S0100000_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$17(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C919310a1x.LIZLLL("shared_bg", "show switch layout tips dialog, click cancel btn");
        C935470aS1.LJFF("change_to_floating", "cancel");
        Function0 function0 = (Function0) acS496S0100000_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$18(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C919310a1x.LIZLLL("shared_bg", "show switch layout tips dialog, click switch btn");
        C935470aS1.LJFF("change_to_floating", "confirm");
        liveDialog.dismiss();
        Function0 function0 = (Function0) acS496S0100000_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$19(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((MultiGuestV3GuestPresenter) acS496S0100000_15.l0).getMultiGuestDataHolder().LJIIIZ = true;
        DataChannel dataChannel = ((MultiGuestV3GuestPresenter) acS496S0100000_15.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(MultiLiveGuestMuteAudioEvent.class, new C922430a6z(true, "business_mute_ad_play"));
        }
        C924180a9o.LIZIZ("turn_on");
    }

    public static final void LIZ$2(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((TakeStagePlayingManageFragment) acS496S0100000_15.l0).LLILZ.invoke(EnumC983140bgu.SETTLE_START, 0L);
        C973930bS3.LJFF("confirm");
        new C974560bT4().LJIJJLI("final_call_click");
        liveDialog.dismiss();
    }

    public static final void LIZ$20(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        DataChannel dataChannel = ((MultiGuestV3GuestWidget) acS496S0100000_15.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GuestDisconnectByWindowEvent.class, new Pair("leave_normally", 10002));
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$21(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C924660aAa.LJIIL((Room) acS496S0100000_15.l0, "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$22(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((C933080aOA) acS496S0100000_15.l0).getClass();
        C933080aOA.LIZIZ(null);
        liveDialog.dismiss();
    }

    public static final void LIZ$23(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((MultiGuestCreateAvatarFragment) acS496S0100000_15.l0).dismiss();
    }

    public static final void LIZ$24(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment = (MultiGuestCreateAvatarFragment) acS496S0100000_15.l0;
        multiGuestCreateAvatarFragment.LLJILJILJ = 2;
        multiGuestCreateAvatarFragment.dismiss();
    }

    public static final void LIZ$25(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C943120aeM.LIZLLL("quit_wallpaper_creating", "click", "proceed");
        C943120aeM.LJ(null, "anchor_end_player");
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = ((AigcWallpaperAnchorResultFragment) acS496S0100000_15.l0).LLIZLLLIL;
        if (aigcWallpaperAnchorViewModel != null) {
            aigcWallpaperAnchorViewModel.FQ2(2);
        }
        liveDialog.dismiss();
        C930540aK4.LJJIZ(((AigcWallpaperAnchorResultFragment) acS496S0100000_15.l0).LLJ);
    }

    public static final void LIZ$26(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function0) acS496S0100000_15.l0).invoke();
    }

    public static final void LIZ$27(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C953230auf.LIZ.getClass();
        NoticeboardTemplate noticeboardTemplate = (NoticeboardTemplate) C13LP.LJJLIIIJL(C953230auf.LIZIZ);
        if (noticeboardTemplate != null) {
            final Function0 function0 = (Function0) acS496S0100000_15.l0;
            C953230auf.LIZJ(noticeboardTemplate.noticeboardTemplateId, new InterfaceC952920auA() { // from class: X.0ZzN
                @Override // X.InterfaceC952920auA
                public final void LIZJ() {
                    function0.invoke();
                }
            });
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$28(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$29(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        String str;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = ((SwitchLayoutPanelController) acS496S0100000_15.l0).LJFF();
        boolean z = true;
        if (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.layoutType == 1) {
            str = "floating";
        } else {
            str = "grid";
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF2 = ((SwitchLayoutPanelController) acS496S0100000_15.l0).LJFF();
        if (multiLiveAnchorPanelSettingsLJFF2 == null || multiLiveAnchorPanelSettingsLJFF2.fixMicNumAction != 0) {
            z = false;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ = null;
        C0JGZ.LIZIZ(str, "cancel", null, z, false);
        SwitchLayoutPanelController switchLayoutPanelController = (SwitchLayoutPanelController) acS496S0100000_15.l0;
        switchLayoutPanelController.getClass();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = ((MultiGuestDataHolder) C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER")).LIZIZ();
        if (multiLiveAnchorPanelSettingsLIZIZ != null) {
            multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsLIZIZ, 0, 0, 0, 8388607);
        }
        switchLayoutPanelController.LIZJ = multiLiveAnchorPanelSettingsLIZ;
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((TakeStagePlayingManageFragment) acS496S0100000_15.l0).LLILZ.invoke(EnumC983140bgu.SETTLE_START, 0L);
        C973930bS3.LJFF("confirm");
        new C974560bT4().LJIJJLI("final_call_click");
        liveDialog.dismiss();
    }

    public static final void LIZ$30(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show switch to grid layout dialog for shared bg, click cancel btn");
        liveDialog.dismiss();
        C935470aS1.LJFF("change_to_grid", "cancel");
        Function0 function0 = (Function0) acS496S0100000_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$31(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show switch to grid layout dialog for shared bg, click use btn");
        liveDialog.dismiss();
        C935470aS1.LJFF("change_to_grid", "confirm");
        Function0 function0 = (Function0) acS496S0100000_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$32(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((TryModeMultiGuestAnchorManageSheet) acS496S0100000_15.l0).close(1);
    }

    public static final void LIZ$33(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C01N8.LIZ(0, "zoom", C920280a3W.LIZIZ((EnumC920250a3T) acS496S0100000_15.l0), 0L, "anchor", "double_check_dialog_cancel", "");
    }

    public static final void LIZ$34(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        MultiGuestOperationCell multiGuestOperationCell = (MultiGuestOperationCell) acS496S0100000_15.l0;
        multiGuestOperationCell.getClass();
        User user = multiGuestOperationCell.LLJI;
        User user2 = null;
        if (user == null) {
            user = null;
        }
        C921920a6A.LJIIJ(user.getId(), "user_profile");
        if (multiGuestOperationCell.LL.LIZJ.LJI) {
            DataChannel dataChannel = multiGuestOperationCell.LLJJI;
            User user3 = multiGuestOperationCell.LLJI;
            if (user3 != null) {
                user2 = user3;
            }
            dataChannel.LC0(LinkInRoomAnchorKickOutGuestEvent.class, new C919620a2S(user2));
        } else {
            DataChannel dataChannel2 = multiGuestOperationCell.LLJJI;
            User user4 = multiGuestOperationCell.LLJI;
            if (user4 != null) {
                user2 = user4;
            }
            dataChannel2.LC0(MultiGuestModeratorKickOutGuestEvent.class, new C919410a27(user2, "kickout_with_profile_for_admin"));
        }
        multiGuestOperationCell.LL.LIZLLL.dismiss();
    }

    public static final void LIZ$35(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C20441214yg.LJIIIZ("CameraSettingInterceptor", "intercept, click_button=cancel");
        ((Function1) acS496S0100000_15.l0).invoke(Boolean.FALSE);
        liveDialog.dismiss();
    }

    public static final void LIZ$36(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C923050a7z.LIZLLL((Room) acS496S0100000_15.l0, "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$37(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function1) acS496S0100000_15.l0).invoke(1);
    }

    public static final void LIZ$38(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        int iIntValue;
        liveDialog.dismiss();
        Integer num = ((C946150ajF) acS496S0100000_15.l0).getBaseFragment().waitingSize;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C942580adU.LIZJ("cancel", ((C946150ajF) acS496S0100000_15.l0).getShowTimestamp(), iIntValue, ((C946150ajF) acS496S0100000_15.l0).getGoLiveType());
    }

    public static final void LIZ$39(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        Integer numValueOf;
        C465900IOu c465900IOu = (C465900IOu) acS496S0100000_15.l0;
        if (c465900IOu != null) {
            numValueOf = Integer.valueOf(c465900IOu.LIZ);
        } else {
            numValueOf = null;
        }
        C924650aAZ.LJIIJ(true, numValueOf, false);
        liveDialog.dismiss();
    }

    public static final void LIZ$4(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = ((AigcWallpaperAnchorEditFragment) acS496S0100000_15.l0).LLJ;
        if (aigcWallpaperAnchorViewModel != null) {
            aigcWallpaperAnchorViewModel.FQ2(2);
        }
        C943120aeM.LIZLLL("quit_wallpaper_creating", "click", "proceed");
        C943120aeM.LJ(null, "anchor_end_player");
        liveDialog.dismiss();
        C930540aK4.LJJIZ(((AigcWallpaperAnchorEditFragment) acS496S0100000_15.l0).LLIZ);
    }

    public static final void LIZ$40(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((MultiLiveSettingDialog) acS496S0100000_15.l0).oS(Boolean.TRUE, "by_coins");
        MultiLiveSettingDialog multiLiveSettingDialog = (MultiLiveSettingDialog) acS496S0100000_15.l0;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = multiLiveSettingDialog.LLILZ;
        if (multiLiveAnchorPanelSettings != null) {
            multiLiveAnchorPanelSettings.applierSortSetting = 1;
        }
        multiLiveSettingDialog.UR(4);
        ((MultiLiveSettingDialog) acS496S0100000_15.l0).ZR();
        liveDialog.dismiss();
    }

    public static final void LIZ$41(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
        C925650aCB.LIZIZ("click", "confirm", "settings");
    }

    public static final void LIZ$42(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
        if (interfaceC945610aiNLIZ != null) {
            interfaceC945610aiNLIZ.LJFF(null);
        }
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$43(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show switch to grid layout dialog for shared bg, click use btn");
        liveDialog.dismiss();
        C935470aS1.LJFF("change_to_grid", "confirm");
        Function0 function0 = (Function0) acS496S0100000_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$44(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$45(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        long j;
        ShowListUser showListUser;
        ShowListUser showListUser2;
        liveDialog.dismiss();
        C946390ajd c946390ajd = (C946390ajd) acS496S0100000_15.l0;
        C01HM c01hm = c946390ajd.LLILLL;
        if (c01hm != null && (showListUser2 = c01hm.LIZ) != null) {
            long j2 = showListUser2.userId;
            InterfaceC946440aji interfaceC946440aji = c946390ajd.LL;
            if (interfaceC946440aji != null) {
                interfaceC946440aji.LIZ(j2);
            }
        }
        C01HM c01hm2 = ((C946390ajd) acS496S0100000_15.l0).LLILLL;
        if (c01hm2 != null && (showListUser = c01hm2.LIZ) != null) {
            j = showListUser.userId;
        } else {
            j = 0;
        }
        Map mapLIZIZ = C306901Gx.LIZIZ();
        mapLIZIZ.put("guest_id", String.valueOf(j));
        C306901Gx.LJIL("livesdk_anchor_multiguest_liveshow_guest_finish_confirm", mapLIZIZ);
    }

    public static final void LIZ$46(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ShowListUser showListUser;
        liveDialog.dismiss();
        C946390ajd c946390ajd = (C946390ajd) acS496S0100000_15.l0;
        C01HM c01hm = c946390ajd.LLILLL;
        if (c01hm != null && (showListUser = c01hm.LIZ) != null) {
            long j = showListUser.userId;
            InterfaceC946440aji interfaceC946440aji = c946390ajd.LL;
            if (interfaceC946440aji != null) {
                interfaceC946440aji.LIZ(j);
            }
        }
        C306901Gx.LJIL("livesdk_guest_liveshow_finished_confirmed", C306901Gx.LIZLLL());
    }

    public static final void LIZ$47(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        DataChannel dataChannel = ((C937770aVj) acS496S0100000_15.l0).LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(LinkMicAudienceCancelEvent.class, Boolean.TRUE);
        }
        ((C937770aVj) acS496S0100000_15.l0).LJIILL("click");
    }

    public static final void LIZ$48(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$49(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C1AI0.LJIIIIZZ("click", (String) ((C259800zU) acS496S0100000_15.l0).element, "cancel");
        liveDialog.cancel();
    }

    public static final void LIZ$5(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$50(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        User user = ((C932410aN5) acS496S0100000_15.l0).LLJJJJ;
        User user2 = null;
        if (user == null) {
            user = null;
        }
        C921920a6A.LJIIJ(user.getId(), "gift_panel");
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User user3 = ((C932410aN5) acS496S0100000_15.l0).LLJI;
        if (user3 == null) {
            user3 = null;
        }
        c930480aJy.getClass();
        if (C930480aJy.LJIJI(user3)) {
            C932410aN5 c932410aN5 = (C932410aN5) acS496S0100000_15.l0;
            DataChannel dataChannel = c932410aN5.LLIZLLLIL;
            User user4 = c932410aN5.LLJJJJ;
            if (user4 != null) {
                user2 = user4;
            }
            dataChannel.LC0(AnchorKickOutGuestByWindowEvent.class, user2);
        } else {
            C932410aN5 c932410aN52 = (C932410aN5) acS496S0100000_15.l0;
            DataChannel dataChannel2 = c932410aN52.LLIZLLLIL;
            User user5 = c932410aN52.LLJJJJ;
            if (user5 != null) {
                user2 = user5;
            }
            dataChannel2.LC0(ModeratorKickOutGuestByWindowEvent.class, user2);
        }
        ((C932410aN5) acS496S0100000_15.l0).LLJ.run();
        liveDialog.dismiss();
    }

    public static final void LIZ$51(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$52(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        InterfaceC934710aQn.Qc.LJFF(Boolean.TRUE);
        liveDialog.dismiss();
        ((Function0) acS496S0100000_15.l0).invoke();
    }

    public static final void LIZ$53(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ArrayList arrayList;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        long id;
        liveDialog.dismiss();
        C917510Zz3.LIZIZ();
        InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            ArrayList<LinkPlayerInfo> arrayList2 = new ArrayList();
            for (Object obj : listLJJIII) {
                long id2 = ((LinkPlayerInfo) obj).mUser.getId();
                Long lLJII = C930540aK4.LJII();
                if (lLJII == null || id2 != lLJII.longValue()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (LinkPlayerInfo linkPlayerInfo : arrayList2) {
                linkPlayerInfo.LIZLLL = true;
                User user = linkPlayerInfo.mUser;
                if (user != null) {
                    id = user.getId();
                } else {
                    id = 0;
                }
                arrayList.add(Long.valueOf(id));
            }
        } else {
            arrayList = null;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLJI(new C957690b1r(10001, 0, 2), new C987180bnQ(arrayList, (C932420aN6) acS496S0100000_15.l0, 11));
        }
    }

    public static final void LIZ$54(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C921920a6A.LJIIJ(((C932420aN6) acS496S0100000_15.l0).LLILLL.getId(), ((C932420aN6) acS496S0100000_15.l0).LLILZLL);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User user = ((C932420aN6) acS496S0100000_15.l0).LLLFFI;
        c930480aJy.getClass();
        if (C930480aJy.LJIJI(user)) {
            C932420aN6 c932420aN6 = (C932420aN6) acS496S0100000_15.l0;
            DataChannel dataChannel = c932420aN6.LLILZIL;
            if (dataChannel != null) {
                dataChannel.LC0(AnchorKickOutGuestByWindowEvent.class, c932420aN6.LLILLL);
            }
        } else {
            C932420aN6 c932420aN62 = (C932420aN6) acS496S0100000_15.l0;
            DataChannel dataChannel2 = c932420aN62.LLILZIL;
            if (dataChannel2 != null) {
                dataChannel2.LC0(ModeratorKickOutGuestByWindowEvent.class, c932420aN62.LLILLL);
            }
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$55(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$56(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C972220bPI c972220bPI;
        LiveDialog liveDialog2 = ((MultiCoHostSearchFragment) acS496S0100000_15.l0).LLJIJIL;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) ((MultiCoHostSearchFragment) acS496S0100000_15.l0).LLILLL;
        if (abstractC960710b6j != null) {
            abstractC960710b6j.LJIIL();
        }
        C972230bPJ c972230bPJ = ((MultiCoHostSearchFragment) acS496S0100000_15.l0).LLJJLIIIJLLLLLLLZ;
        if (c972230bPJ != null && (c972220bPI = c972230bPJ.LIZLLL) != null) {
            c972220bPI.N5();
        }
        ((MultiCoHostSearchFragment) acS496S0100000_15.l0).oS(false);
    }

    public static final void LIZ$57(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$58(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$59(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
    }

    public static final void LIZ$6(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function0) acS496S0100000_15.l0).invoke();
    }

    public static final void LIZ$60(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
    }

    public static final void LIZ$61(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$62(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((Function0) acS496S0100000_15.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$63(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function0) acS496S0100000_15.l0).invoke();
    }

    public static final void LIZ$64(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        Integer numValueOf;
        C465900IOu c465900IOu = (C465900IOu) acS496S0100000_15.l0;
        if (c465900IOu != null) {
            numValueOf = Integer.valueOf(c465900IOu.LIZ);
        } else {
            numValueOf = null;
        }
        C924980aB6.LIZJ(true, false, numValueOf, null);
        liveDialog.dismiss();
    }

    public static final void LIZ$65(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C923650a8x c923650a8x = ((VoiceChatWatchWidget) acS496S0100000_15.l0).LLILLJJLI;
        if (c923650a8x != null) {
            c923650a8x.exitInteractInNormalWay("others", false, 10002);
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$66(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function0 function0 = (Function0) acS496S0100000_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$67(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C924980aB6.LIZIZ(false, ((C013C) acS496S0100000_15.l0).element);
        liveDialog.dismiss();
    }

    public static final void LIZ$68(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C954060aw0 c954060aw0 = (C954060aw0) acS496S0100000_15.l0;
        C19487111Lx c19487111Lx = c954060aw0.LIZ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        c954060aw0.LIZ = null;
        LiveDialog liveDialog2 = c954060aw0.LIZIZ;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
        c954060aw0.LIZIZ = null;
        C953760avW.LIZIZ.LIZ().LIZJ();
        liveDialog.dismiss();
    }

    public static final void LIZ$69(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        ((MultiLiveAsAnchorListDialogV2) acS496S0100000_15.l0).LLIILII();
        liveDialog.dismiss();
        C925650aCB.LIZIZ("click", "confirm", "connection_page");
    }

    public static final void LIZ$7(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C971050bNP c971050bNP = ((DialogC971210bNf) acS496S0100000_15.l0).LLJZ;
        C19487111Lx c19487111Lx = c971050bNP.LJIIIIZZ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        c971050bNP.LJIIIIZZ = null;
        c971050bNP.LIZ.LJLILLLLZI("", "", true);
        C786410Ut5.LIZLLL(c971050bNP.LIZ);
        liveDialog.dismiss();
    }

    public static final void LIZ$70(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C01N8.LIZ(0, "zoom", C920280a3W.LIZIZ((EnumC920250a3T) acS496S0100000_15.l0), 0L, "anchor", "double_check_dialog_cancel", "");
    }

    public static final void LIZ$71(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        Function0<Unit> function0 = ((C962130b91) acS496S0100000_15.l0).LIZIZ.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$72(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        Function0<Unit> function0 = ((C962130b91) acS496S0100000_15.l0).LIZIZ.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$73(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        Function0<Unit> function0 = ((C962130b91) acS496S0100000_15.l0).LIZIZ.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$74(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        Function0<Unit> function0 = ((C958660b3Q) acS496S0100000_15.l0).LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$75(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        Function0<Unit> function0 = ((C958660b3Q) acS496S0100000_15.l0).LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$76(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C955400ayA.LIZ.LJZI("go_back", ((C013C) acS496S0100000_15.l0).element);
        liveDialog.dismiss();
    }

    public static final void LIZ$77(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        AwS416S0200000_15 awS416S0200000_15 = ((C955800ayo) acS496S0100000_15.l0).LIZIZ.LIZLLL;
        if (awS416S0200000_15 != null) {
            awS416S0200000_15.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$78(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJLZ(((C955800ayo) acS496S0100000_15.l0).LIZIZ.LIZIZ.getLabel(), null, "popup", null, 10);
        AwS416S0200000_15 awS416S0200000_15 = ((C955800ayo) acS496S0100000_15.l0).LIZIZ.LIZJ;
        if (awS416S0200000_15 != null) {
            awS416S0200000_15.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$79(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C917720ZzO.LIZ.getClass();
        C917720ZzO.LJFF("cancel");
        Function1 function1 = (Function1) acS496S0100000_15.l0;
        if (function1 != null) {
            function1.invoke(new Throwable("cancel apply"));
        }
    }

    public static final void LIZ$8(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C972120bP8 c972120bP8 = ((DialogC972110bP7) acS496S0100000_15.l0).LLJI;
        c972120bP8.LIZLLL.LJI(c972120bP8.LIZJ.noticeboardTemplateId);
        EnumC971520bOA enumC971520bOA = EnumC971520bOA.DELETE;
        Long lValueOf = Long.valueOf(((DialogC972110bP7) acS496S0100000_15.l0).LLJI.LIZJ.noticeboardTemplateId);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = ((DialogC972110bP7) acS496S0100000_15.l0).LLJI.LJ;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
        liveDialog.dismiss();
    }

    public static final void LIZ$80(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC934710aQn.f137dc.LJFF(Boolean.FALSE);
        C917720ZzO.LIZ.getClass();
        C917720ZzO.LJFF("send");
        Function1 function1 = (Function1) acS496S0100000_15.l0;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$81(Y.AcS496S0100000_15 r13, com.bytedance.android.live.design.app.LiveDialog r14) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AcS496S0100000_15.LIZ$81(Y.AcS496S0100000_15, com.bytedance.android.live.design.app.LiveDialog):void");
    }

    public static final void LIZ$82(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        int i;
        AigcAnchorWidget aigcAnchorWidget;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel;
        int i2;
        C943120aeM.LIZLLL("anchor_end_game", "click", "proceed");
        liveDialog.dismiss();
        AigcWallpaperManageDialog aigcWallpaperManageDialog = (AigcWallpaperManageDialog) acS496S0100000_15.l0;
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = aigcWallpaperManageDialog.LLILZLL;
        if (aigcWallpaperAnchorViewModel != null) {
            C20744116Fj c20744116Fj = aigcWallpaperManageDialog.LLILZ;
            if (c20744116Fj != null && c20744116Fj.isChecked()) {
                i2 = 1;
                i = 1;
            } else {
                i2 = 2;
                i = 0;
            }
            aigcWallpaperAnchorViewModel.FQ2(i2);
        } else {
            i = 0;
        }
        C943120aeM.LJ(Integer.valueOf(i), "anchor_end");
        C20744116Fj c20744116Fj2 = ((AigcWallpaperManageDialog) acS496S0100000_15.l0).LLILZ;
        if (c20744116Fj2 != null && !c20744116Fj2.isChecked() && (aigcAnchorWidget = ((AigcWallpaperManageDialog) acS496S0100000_15.l0).LLIZ) != null && (multiGuestSharedBgAnchorViewModel = aigcAnchorWidget.LL) != null) {
            multiGuestSharedBgAnchorViewModel.setState(new AwS249S0000000_15(2));
        }
    }

    public static final void LIZ$83(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C917720ZzO.LIZ.getClass();
        C917720ZzO.LJ("cancel");
        Function1 function1 = (Function1) acS496S0100000_15.l0;
        if (function1 != null) {
            function1.invoke(new Throwable("Anchor cancel first permit"));
        }
    }

    public static final void LIZ$84(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = ((AigcWallpaperInvitedDialog) acS496S0100000_15.l0).LLILLJJLI;
        if (aigcWallpaperGuestViewModel != null) {
            aigcWallpaperGuestViewModel.LLJJIII = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aigcWallpaperGuestViewModel), C0PEM.LIZJ, null, new C943050aeF(aigcWallpaperGuestViewModel, 2, null), 2);
        }
        C943120aeM.LJIIJJI("decline_invitation", "click", "proceed");
        liveDialog.dismiss();
        ((AigcWallpaperInvitedDialog) acS496S0100000_15.l0).dismiss();
    }

    public static final void LIZ$85(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C953770avX c953770avXLIZ;
        liveDialog.dismiss();
        C915050Zv5 c915050Zv5 = C953760avW.LIZIZ;
        c915050Zv5.LIZ().LIZJ();
        ((C971040bNO) acS496S0100000_15.l0).getClass();
        C953770avX c953770avXLJIIIIZZ = c915050Zv5.LIZ().LJIIIIZZ();
        if (c953770avXLJIIIIZZ != null && (c953770avXLIZ = c953770avXLJIIIIZZ.LIZ(2)) != null) {
            c915050Zv5.LIZ().LJIIL(c953770avXLIZ);
            c915050Zv5.LIZ().LJIILJJIL();
        }
        ((C971040bNO) acS496S0100000_15.l0).LIZ.LJJIII(EnumC919100a1c.NORMAL);
    }

    public static final void LIZ$86(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C971040bNO) acS496S0100000_15.l0).LJIILIIL(null);
    }

    public static final void LIZ$9(AcS496S0100000_15 acS496S0100000_15, LiveDialog liveDialog) {
        C782110Um9 c782110Um9 = new C782110Um9(((DialogC971210bNf) acS496S0100000_15.l0).getContext());
        c782110Um9.LIZJ = "Stop template creating?";
        c782110Um9.LJIIIZ("Your operation will be clear");
        c782110Um9.LJIILJJIL("confirm", new AcS496S0100000_15((DialogC971210bNf) acS496S0100000_15.l0, 7));
        c782110Um9.LJIIJJI("cancel", new InterfaceC743640TFa() { // from class: X.0avy
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog2) {
                liveDialog2.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
