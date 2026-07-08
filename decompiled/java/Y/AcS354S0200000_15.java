package Y;

import X.AbstractC921450a5P;
import X.AbstractC928510aGn;
import X.AnonymousClass0207;
import X.C013C;
import X.C01OF;
import X.C0IF2;
import X.C0IJT;
import X.C0JGZ;
import X.C1161920gLG;
import X.C16FS;
import X.C20744116Fj;
import X.C2188811AlT;
import X.C354001Za;
import X.C465900IOu;
import X.C474500IjA;
import X.C500260Jjc;
import X.C782110Um9;
import X.C784440Upu;
import X.C786410Ut5;
import X.C914400Zu2;
import X.C915150ZvF;
import X.C917290Zyh;
import X.C917520Zz4;
import X.C917650ZzH;
import X.C917750ZzR;
import X.C919410a27;
import X.C921920a6A;
import X.C923050a7z;
import X.C924250a9v;
import X.C924630aAX;
import X.C924810aAp;
import X.C924980aB6;
import X.C925770aCN;
import X.C927240aEk;
import X.C928540aGq;
import X.C929190aHt;
import X.C930390aJp;
import X.C934340aQC;
import X.C936170aT9;
import X.C937380aV6;
import X.C942580adU;
import X.C946150ajF;
import X.C946850akN;
import X.C952250at5;
import X.C952290at9;
import X.C953770avX;
import X.C954060aw0;
import X.C971810bOd;
import X.C982910bgX;
import X.DialogC971200bNe;
import X.EnumC920250a3T;
import X.EnumC926600aDi;
import X.EnumC930180aJU;
import X.EnumC946860akO;
import X.EnumC971520bOA;
import X.EnumC983140bgu;
import X.InterfaceC1106030et7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import X.InterfaceC302401Fe;
import X.InterfaceC500940Jki;
import X.InterfaceC743640TFa;
import X.InterfaceC921430a5N;
import X.InterfaceC927510aFB;
import X.InterfaceC934710aQn;
import X.InterfaceC971790bOb;
import X.ViewOnClickListenerC934990aRF;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.playing.TakeStagePlayingManageFragment;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.MultiGuestGiftSwitchTargetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.guest.MultiGuestV3GuestReservationWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.model.InviteChatGroupHelper;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatGuestUserInfoDialog;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AcS354S0200000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void LIZ$0(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        ((TakeStagePlayingManageFragment) acS354S0200000_15.l0).LLILZ.invoke(EnumC983140bgu.SWITCH_TURN, Long.valueOf(((C982910bgX) acS354S0200000_15.l1).LIZ));
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        ((TakeStagePlayingManageFragment) acS354S0200000_15.l0).LLILZ.invoke(EnumC983140bgu.SWITCH_TURN, Long.valueOf(((C982910bgX) acS354S0200000_15.l1).LIZ));
        liveDialog.dismiss();
    }

    public static final void LIZ$10(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        ((SwitchLayoutPanelController) acS354S0200000_15.l0).LJIIJ(new AwS559S0100000_15((Function0) acS354S0200000_15.l1, (Function0<Unit>) 368));
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = ((SwitchLayoutPanelController) acS354S0200000_15.l0).LJFF();
        boolean z = true;
        if (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.layoutType == 1) {
            str = "floating";
        } else {
            str = "grid";
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF2 = ((SwitchLayoutPanelController) acS354S0200000_15.l0).LJFF();
        if (multiLiveAnchorPanelSettingsLJFF2 == null || multiLiveAnchorPanelSettingsLJFF2.fixMicNumAction != 0) {
            z = false;
        }
        C0JGZ.LIZIZ(str, "switch", null, z, false);
    }

    public static final void LIZ$11(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        C924630aAX.LJJ(1);
        liveDialog.dismiss();
        C921920a6A.LJIIJ(((LinkPlayerInfo) acS354S0200000_15.l0).mUser.getId(), "go_live_panel");
        AbstractC921450a5P abstractC921450a5P = ((MultiLiveAsAnchorListDialogV2) acS354S0200000_15.l1).LLJIJIL;
        if (abstractC921450a5P != null) {
            long id = ((LinkPlayerInfo) acS354S0200000_15.l0).mUser.getId();
            String secUid = ((LinkPlayerInfo) acS354S0200000_15.l0).mUser.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            abstractC921450a5P.LJIIIZ(id, secUid, "kickout_with_popup_confirm", (LinkPlayerInfo) acS354S0200000_15.l0);
        }
        ((MultiLiveAsAnchorListDialogV2) acS354S0200000_15.l1).r = true;
    }

    public static final void LIZ$12(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((MultiLiveAsAnchorListDialogV2) acS354S0200000_15.l0).LLILIL((LinkPlayerInfo) acS354S0200000_15.l1);
    }

    public static final void LIZ$13(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        DataChannel dataChannel = ((C934340aQC) acS354S0200000_15.l0).LLIZLLLIL;
        if (dataChannel != null) {
            C923050a7z.LIZLLL((Room) acS354S0200000_15.l1, "switch");
            C924250a9v.LIZ().LJJLIIIJLLLLLLLZ = 2;
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                C0IF2 c0if2 = new C0IF2(1);
                c0if2.LIZLLL = true;
                c784440UpuLIZ.LIZIZ(c0if2);
            } else {
                dataChannel.FQ2(OrientationChangeEvent.class);
            }
            dataChannel.FQ2(ResetSilentTimerEvent.class);
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$14(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        String str;
        int iIntValue;
        liveDialog.dismiss();
        if (((C946150ajF) acS354S0200000_15.l0).LLILLL) {
            str = "guest_waiting_individual";
        } else {
            str = "guest_waiting_in_request";
        }
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        Context context = ((C16FS) acS354S0200000_15.l1).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={\"request_from\":\"");
        sbLIZ.append(str);
        sbLIZ.append("\", \"room_create_source\":3}");
        iHostAction.handleSchema(context, C2188811AlT.LIZIZ(sbLIZ), new Bundle());
        ((C946150ajF) acS354S0200000_15.l0).LLILLJJLI.invoke(Boolean.TRUE);
        Integer num = ((C946150ajF) acS354S0200000_15.l0).getBaseFragment().waitingSize;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C942580adU.LIZJ("go_live", ((C946150ajF) acS354S0200000_15.l0).getShowTimestamp(), iIntValue, ((C946150ajF) acS354S0200000_15.l0).getGoLiveType());
    }

    public static final void LIZ$15(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C971810bOd c971810bOd = (C971810bOd) acS354S0200000_15.l0;
        EnumC971520bOA enumC971520bOA = EnumC971520bOA.DELETE;
        C354001Za c354001Za = (C354001Za) acS354S0200000_15.l1;
        c971810bOd.getClass();
        C971810bOd.LIZJ(enumC971520bOA, c354001Za);
        C971810bOd c971810bOd2 = (C971810bOd) acS354S0200000_15.l0;
        C354001Za c354001Za2 = (C354001Za) acS354S0200000_15.l1;
        c971810bOd2.getClass();
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ != null) {
            interfaceC971790bObLIZIZ.LJFF(c354001Za2);
        }
    }

    public static final void LIZ$16(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        MultiGuestUserInfoFragment multiGuestUserInfoFragment;
        InterfaceC1106030et7.M5.LJFF(Boolean.valueOf(((C013C) acS354S0200000_15.l0).element));
        MultiGuestV3GuestReservationWidget multiGuestV3GuestReservationWidget = (MultiGuestV3GuestReservationWidget) acS354S0200000_15.l1;
        if (multiGuestV3GuestReservationWidget.LLILLL == null) {
            multiGuestV3GuestReservationWidget.x1();
        }
        MultiGuestV3GuestReservationWidget multiGuestV3GuestReservationWidget2 = (MultiGuestV3GuestReservationWidget) acS354S0200000_15.l1;
        if (multiGuestV3GuestReservationWidget2.LLILLL != null && multiGuestV3GuestReservationWidget2.getContext() != null) {
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = ((MultiGuestV3GuestReservationWidget) acS354S0200000_15.l1).LLILLL;
            Fragment fragmentNR = null;
            if (multiLiveGuestUserInfoDialog != null) {
                fragmentNR = multiLiveGuestUserInfoDialog.NR();
            }
            if ((fragmentNR instanceof MultiGuestUserInfoFragment) && (multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) fragmentNR) != null) {
                multiGuestUserInfoFragment.gS(((MultiGuestV3GuestReservationWidget) acS354S0200000_15.l1).getContext());
            }
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$17(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) acS354S0200000_15.l0;
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) acS354S0200000_15.l1;
        guestMediaManageFragment.getClass();
        if (interfaceC927510aFB.LJIJJLI() == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
            guestMediaManageFragment.cS(liveDialog);
            return;
        }
        liveDialog.dismiss();
        C16FS c16fs = guestMediaManageFragment.LLJJIJIIJIL;
        if (c16fs == null) {
            return;
        }
        c16fs.performClick();
    }

    public static final void LIZ$18(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((GameLinkV2Widget) acS354S0200000_15.l0).x1((Runnable) acS354S0200000_15.l1, false);
    }

    public static final void LIZ$19(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        int i;
        List listLJJIII;
        long id;
        InterfaceC2262081DgM currentUser;
        String strLIZIZ;
        AbstractC928510aGn abstractC928510aGnLIZ;
        liveDialog.dismiss();
        ViewOnClickListenerC934990aRF viewOnClickListenerC934990aRF = (ViewOnClickListenerC934990aRF) acS354S0200000_15.l0;
        MultiGuestDataHolder multiGuestDataHolder = viewOnClickListenerC934990aRF.LLJJIJI;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJJIFFI;
        } else {
            i = 0;
        }
        InterfaceC302401Fe interfaceC302401Fe = viewOnClickListenerC934990aRF.LLJJIJIIJIL;
        String idStr = null;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
            listLJJIII = abstractC928510aGnLIZ.LJJIII();
        } else {
            listLJJIII = null;
        }
        Pair pairLJII = C917520Zz4.LJII(C917290Zyh.LJIIIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i > 0 && (strLIZIZ = C917290Zyh.LIZIZ(listLJJIII)) != null) {
            linkedHashMap.put("link_id_list", strLIZIZ);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_bonus_confirm");
        c474500IjALIZ.LJIL();
        Room roomLIZ = C917290Zyh.LIZ();
        if (roomLIZ != null) {
            idStr = roomLIZ.getIdStr();
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            id = currentUser.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        c474500IjALIZ.LJJII(pairLJII.getFirst(), "layout_setting");
        c474500IjALIZ.LJJII(pairLJII.getSecond(), "window_setting");
        c474500IjALIZ.LJJII(String.valueOf(i), "guest_cnt");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        C917650ZzH.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
        C917750ZzR.LJII("click confirm");
        ((Function0) acS354S0200000_15.l1).invoke();
    }

    public static final void LIZ$2(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC921430a5N interfaceC921430a5N = ((C928540aGq) acS354S0200000_15.l0).LL;
        if (interfaceC921430a5N != null) {
            interfaceC921430a5N.LIZJ((ListByTypeResponse.ReservedUser) acS354S0200000_15.l1);
        }
    }

    public static final void LIZ$20(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        String str;
        C20744116Fj c20744116Fj = ((MultiGuestGiftSwitchTargetDialog) acS354S0200000_15.l0).LLJ;
        if (c20744116Fj != null) {
            c20744116Fj.setChecked(true);
        }
        if (((MultiGuestGiftSwitchTargetDialog) acS354S0200000_15.l0).LLJILJIL) {
            InterfaceC934710aQn.Eb.LJFF(Boolean.TRUE);
            str = "open";
        } else {
            str = "close";
        }
        liveDialog.dismiss();
        C937380aV6 c937380aV6 = ((MultiGuestGiftSwitchTargetDialog) acS354S0200000_15.l0).LLILZ;
        if (c937380aV6 != null) {
            c937380aV6.LLLIILIL((List) acS354S0200000_15.l1, true, true);
        }
        C915150ZvF.LIZ("continue", str);
    }

    public static final void LIZ$21(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        C946850akN.LJIIJJI(EnumC946860akO.APPLY);
        liveDialog.dismiss();
        ((C952250at5) acS354S0200000_15.l0).LL.invoke((C953770avX) acS354S0200000_15.l1);
    }

    public static final void LIZ$22(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        VoiceChatWatchWidget voiceChatWatchWidget = (VoiceChatWatchWidget) acS354S0200000_15.l0;
        Runnable runnable = (Runnable) acS354S0200000_15.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VoiceChatWatchWidget.LLJJJJJIL;
        voiceChatWatchWidget.C1(runnable, false, "live_end", true);
    }

    public static final void LIZ$23(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        C924980aB6.LIZIZ(true, ((C013C) acS354S0200000_15.l0).element);
        InterfaceC1106030et7.M5.LJFF(Boolean.valueOf(((C013C) acS354S0200000_15.l0).element));
        VoiceChatWatchWidget voiceChatWatchWidget = (VoiceChatWatchWidget) acS354S0200000_15.l1;
        if (voiceChatWatchWidget.LLJILJILJ == null) {
            voiceChatWatchWidget.B1();
        }
        VoiceChatWatchWidget voiceChatWatchWidget2 = (VoiceChatWatchWidget) acS354S0200000_15.l1;
        if (voiceChatWatchWidget2.LLJILJILJ != null && voiceChatWatchWidget2.getContext() != null) {
            VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog = ((VoiceChatWatchWidget) acS354S0200000_15.l1).LLJILJILJ;
            VoiceChatUserInfoFragment voiceChatUserInfoFragmentMR = null;
            if (voiceChatGuestUserInfoDialog != null) {
                voiceChatUserInfoFragmentMR = voiceChatGuestUserInfoDialog.MR();
            }
            if ((voiceChatUserInfoFragmentMR instanceof VoiceChatUserInfoFragment) && voiceChatUserInfoFragmentMR != null) {
                VoiceChatWatchWidget voiceChatWatchWidget3 = (VoiceChatWatchWidget) acS354S0200000_15.l1;
                EnumC926600aDi enumC926600aDi = voiceChatWatchWidget3.LLJJ;
                C925770aCN c925770aCN = voiceChatWatchWidget3.LLJILLL;
                voiceChatUserInfoFragmentMR.LLJILLL = enumC926600aDi;
                voiceChatUserInfoFragmentMR.LLJJIII = c925770aCN;
                Context context = voiceChatUserInfoFragmentMR.getContext();
                if (context != null) {
                    voiceChatUserInfoFragmentMR.RR(context);
                }
            }
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$24(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        C782110Um9 c782110Um9 = new C782110Um9((Context) acS354S0200000_15.l0);
        c782110Um9.LIZJ = "Stop template creating?";
        c782110Um9.LJIIIZ("Your operation will be clear");
        c782110Um9.LJIILJJIL("confirm", new AcS496S0100000_15((C954060aw0) acS354S0200000_15.l1, 68));
        c782110Um9.LJIIJJI("cancel", new InterfaceC743640TFa() { // from class: X.0aw1
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog2) {
                liveDialog2.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static final void LIZ$25(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        C946850akN.LJIIJJI(EnumC946860akO.APPLY);
        liveDialog.dismiss();
        C952290at9 c952290at9 = ((DialogC971200bNe) acS354S0200000_15.l0).LLJJJJLIIL;
        if (c952290at9 != null) {
            C500260Jjc.LJIILIIL(c952290at9);
        }
        ((DialogC971200bNe) acS354S0200000_15.l0).LLLF.LJIILIIL((C953770avX) acS354S0200000_15.l1);
    }

    public static final void LIZ$26(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        C930390aJp c930390aJp = (C930390aJp) acS354S0200000_15.l0;
        InviteChatGroupHelper inviteChatGroupHelper = c930390aJp.LLILLJJLI;
        Object obj = acS354S0200000_15.l1;
        inviteChatGroupHelper.LIZ(((C929190aHt) obj).LIZ.id, new AwS381S0200000_15(c930390aJp, obj, 194), true);
        liveDialog.dismiss();
    }

    public static final void LIZ$27(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        C930390aJp c930390aJp = (C930390aJp) acS354S0200000_15.l0;
        InviteChatGroupHelper inviteChatGroupHelper = c930390aJp.LLILLJJLI;
        Object obj = acS354S0200000_15.l1;
        inviteChatGroupHelper.LIZ(((C929190aHt) obj).LIZ.id, new AwS381S0200000_15(c930390aJp, obj, 196), false);
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        Long lValueOf;
        Long lValueOf2;
        C20744116Fj c20744116Fj = ((MultiGuestGiftSwitchTargetDialog) acS354S0200000_15.l0).LLJ;
        if (c20744116Fj != null) {
            c20744116Fj.setChecked(false);
        }
        liveDialog.dismiss();
        C915150ZvF.LIZ("cancel", null);
        for (Object obj : (List) acS354S0200000_15.l1) {
            User user = ((LinkListUser) obj).user;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            User user2 = MultiGuestGiftSwitchTargetDialog.LLJJ;
            if (user2 != null) {
                lValueOf2 = Long.valueOf(user2.getId());
            } else {
                lValueOf2 = null;
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                if (obj != null) {
                    MultiGuestGiftSwitchTargetDialog.LLJJI = Collections.singletonList(obj);
                    return;
                }
                return;
            }
        }
    }

    public static final void LIZ$4(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        Integer numValueOf;
        C465900IOu c465900IOu = (C465900IOu) acS354S0200000_15.l0;
        if (c465900IOu != null) {
            numValueOf = Integer.valueOf(c465900IOu.LIZ);
        } else {
            numValueOf = null;
        }
        C924980aB6.LIZJ(true, false, numValueOf, ((MultiGuestV3GuestWidget) acS354S0200000_15.l1).dataChannel);
        liveDialog.dismiss();
    }

    public static final void LIZ$5(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        new C927240aEk("linkedLeaveAlert", "confirmBtn").LIZ();
        ((MultiGuestV3GuestWidget) acS354S0200000_15.l0).A1((Runnable) acS354S0200000_15.l1, false);
    }

    public static final void LIZ$6(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        RandomMatchGuestViewModel randomMatchGuestViewModel;
        RandomMatchGuestWidget randomMatchGuestWidgetLIZ = C914400Zu2.LIZ();
        if (randomMatchGuestWidgetLIZ != null && (randomMatchGuestViewModel = randomMatchGuestWidgetLIZ.LL) != null) {
            randomMatchGuestViewModel.vQ2(2);
        }
        liveDialog.dismiss();
        new C927240aEk("leavePopupV", "quitBtn").LIZ();
        ((MultiGuestV3GuestWidget) acS354S0200000_15.l0).A1((Runnable) acS354S0200000_15.l1, false);
        C924810aAp.LJ().LJJJJLL = false;
    }

    public static final void LIZ$7(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C936170aT9 c936170aT9 = (C936170aT9) acS354S0200000_15.l0;
        MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment = (MultiGuestCreateAvatarFragment) acS354S0200000_15.l1;
        c936170aT9.LIZIZ(multiGuestCreateAvatarFragment.LLJILLL, new AwS559S0100000_15(multiGuestCreateAvatarFragment, 299));
    }

    public static final void LIZ$8(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        C924630aAX.LJJ(1);
        liveDialog.dismiss();
        DataChannel dataChannel = ((MultiGuestAsGuestModeratorManageDialog) acS354S0200000_15.l0).LLJI;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestModeratorKickOutGuestEvent.class, new C919410a27((User) acS354S0200000_15.l1, "kickout_with_popup_confirm_for_admin"));
        }
    }

    public static final void LIZ$9(AcS354S0200000_15 acS354S0200000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        TextHeaderListFragment textHeaderListFragment = (TextHeaderListFragment) acS354S0200000_15.l0;
        C354001Za c354001Za = (C354001Za) acS354S0200000_15.l1;
        textHeaderListFragment.getClass();
        TextHeaderListFragment.OR(textHeaderListFragment, EnumC971520bOA.DELETE, c354001Za.LIZIZ);
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = textHeaderListFragment.LL;
        if (anchorTextHeaderViewModel != null) {
            anchorTextHeaderViewModel.JQ2(c354001Za.LIZIZ.LIZLLL, AFwS203S0000000_15.get$arr$(318), AnonymousClass0207.get$arr$(101));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AcS354S0200000_15(com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2 r2, com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 11 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AcS354S0200000_15.<init>(com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2, com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, int):void");
    }

    public AcS354S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcS354S0200000_15(SwitchLayoutPanelController switchLayoutPanelController, SwitchLayoutPanelController switchLayoutPanelController2, EnumC930180aJU enumC930180aJU, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = switchLayoutPanelController;
        this.l1 = enumC930180aJU;
    }
}
