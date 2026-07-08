package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarIntroFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.api.IAvatarAPI;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.IGuestShowdownApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.rank.GuestShowdownRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowOpenMicDialogShowingData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownFinishToPunishmentParams;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarReportReq;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play.TransitionInfo;

/* JADX INFO: renamed from: X.01za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515201za implements InterfaceC743640TFa {
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
        }
    }

    public C515201za(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C515201za c515201za, LiveDialog liveDialog) {
        Long lValueOf;
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel;
        long j;
        C308301Hl c308301Hl = C308301Hl.LIZ;
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        Integer numAQ2 = null;
        if (interfaceC938530aWxLIZ != null) {
            lValueOf = Long.valueOf(interfaceC938530aWxLIZ.getPlayId());
        } else {
            lValueOf = null;
        }
        C308301Hl.LIZLLL(c308301Hl, "party_ranking_page", "finish_confirm", lValueOf, null, null, null, 0L, 120);
        VM vm = ((GuestShowdownAnchorWidget) c515201za.l0).LLILLL;
        if (vm != 0) {
            numAQ2 = vm.AQ2();
        }
        if (numAQ2 != null) {
            if (numAQ2.intValue() == 1) {
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel2 = (GuestShowdownAnchorViewModel) ((GuestShowdownAnchorWidget) c515201za.l0).LLILLL;
                if (guestShowdownAnchorViewModel2 != null) {
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GuestShowdownAnchorViewModel.LLJJIJI;
                    guestShowdownAnchorViewModel2.FQ2(0);
                }
            } else if (numAQ2.intValue() == 2 && (guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) ((GuestShowdownAnchorWidget) c515201za.l0).LLILLL) != null) {
                C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestFinishToPunishment");
                GuestShowdownFinishToPunishmentParams guestShowdownFinishToPunishmentParams = new GuestShowdownFinishToPunishmentParams();
                guestShowdownFinishToPunishmentParams.roomId = C954140aw8.LIZJ();
                guestShowdownFinishToPunishmentParams.channelId = C954140aw8.LIZIZ();
                C01II c01ii = guestShowdownAnchorViewModel.LLJJIII;
                GuestShowdownContent guestShowdownContent = c01ii.LIZIZ;
                if (guestShowdownContent != null) {
                    j = guestShowdownContent.playId;
                } else {
                    j = 0;
                }
                guestShowdownFinishToPunishmentParams.playId = j;
                C480460Ism.LIZ().getClass();
                guestShowdownAnchorViewModel.wQ2().LIZ(C01NB.LIZIZ(((IGuestShowdownApi) C480460Ism.LIZLLL(IGuestShowdownApi.class)).finishToPunishment(guestShowdownFinishToPunishmentParams), "GuestShowdownAnchorModel", "finishToPunishment").LJIILL(new C516201zk(c01ii, 214)).LJFF(new C0UO0()).LJFF(new C0UO0()).LJJIIZ(new C516201zk(guestShowdownAnchorViewModel, 219), new C516201zk(guestShowdownAnchorViewModel, 220)));
            }
        }
        liveDialog.dismiss();
        GuestShowdownRankDialog guestShowdownRankDialog = ((GuestShowdownAnchorWidget) c515201za.l0).LL;
        if (guestShowdownRankDialog != null) {
            guestShowdownRankDialog.close(1);
        }
    }

    public static final void LIZ$1(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        final LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) c515201za.l0;
        MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) liveShowAnchorWidget.LLILLJJLI;
        if (midLiveShowViewModel != null) {
            midLiveShowViewModel.GQ2(new C01G3() { // from class: X.01GQ
                @Override // X.C01G3
                public final void LIZIZ() {
                }

                @Override // X.C01G3
                public final void LIZ() {
                    liveShowAnchorWidget.I1();
                }
            });
        }
    }

    public static final void LIZ$10(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c515201za.l0;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void LIZ$11(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c515201za.l0;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void LIZ$12(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function1) c515201za.l0).invoke(Boolean.FALSE);
    }

    public static final void LIZ$13(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function1) c515201za.l0).invoke(Boolean.TRUE);
    }

    public static final void LIZ$14(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        if (((InterfaceC20236714Gf) c515201za.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c515201za.l0;
            C510401yo c510401yo = C510401yo.LIZ;
            C189200o6.m2constructorimpl(c510401yo);
            interfaceC20236714Gf.resumeWith(c510401yo);
        }
    }

    public static final void LIZ$15(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        if (((InterfaceC20236714Gf) c515201za.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c515201za.l0;
            C510201ym c510201ym = C510201ym.LIZ;
            C189200o6.m2constructorimpl(c510201ym);
            interfaceC20236714Gf.resumeWith(c510201ym);
        }
    }

    public static final void LIZ$2(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        final LiveShowModeratorWidget liveShowModeratorWidget = (LiveShowModeratorWidget) c515201za.l0;
        LiveShowModeratorViewModel liveShowModeratorViewModel = liveShowModeratorWidget.LL;
        if (liveShowModeratorViewModel != null) {
            liveShowModeratorViewModel.GQ2(new C01G3() { // from class: X.01GN
                @Override // X.C01G3
                public final void LIZIZ() {
                }

                @Override // X.C01G3
                public final void LIZ() {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    C923330a8R.LJIIL(AnonymousClass0206.get$arr$(53));
                    liveShowModeratorWidget.x1();
                }
            });
        }
    }

    public static final void LIZ$3(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        String string = c515201za.l0.toString();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_toggle_popup_sec_click");
        c474500IjALIZ.LJJII("cancel", "click_type");
        c474500IjALIZ.LJJII(string, "scene_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ$4(C515201za c515201za, LiveDialog liveDialog) {
        long id;
        liveDialog.dismiss();
        MultiGuestAvatarIntroFragment multiGuestAvatarIntroFragment = (MultiGuestAvatarIntroFragment) c515201za.l0;
        Long l = multiGuestAvatarIntroFragment.LL;
        if (l != null) {
            long jLongValue = l.longValue();
            boolean z = C936250aTH.LIZIZ;
            User user = multiGuestAvatarIntroFragment.LLILLJJLI;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
            AvatarReportReq avatarReportReq = new AvatarReportReq();
            avatarReportReq.avatarOwnerId = id;
            avatarReportReq.channelId = jLJIILL;
            avatarReportReq.avatarId = jLongValue;
            avatarReportReq.applier = C936250aTH.LJ();
            avatarReportReq.common = C936250aTH.LIZLLL();
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(C01NB.LIZ(((IAvatarAPI) C480460Ism.LIZLLL(IAvatarAPI.class)).reportIllegalAvatar(avatarReportReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C953780avY.LIZIZ).LJIILL(new C09JN() { // from class: X.00SF
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AvatarDataManager@42e9.reportIllegal$1");
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
                        C20441214yg.LIZIZ("AvatarDataManager", "report illegal success");
                    }
                    C1C7U.LIZIZ("AvatarDataManager@42e9.reportIllegal$1");
                }
            })), null, new C516301zl(jLongValue, 2), new C516301zl(jLongValue, 3), 24);
        }
    }

    public static final void LIZ$5(C515201za c515201za, LiveDialog liveDialog) {
        C01K8 c01k8 = ((CountDownForAllV2ScoreDialog) c515201za.l0).LLL;
        if (c01k8 != null) {
            c01k8.LIZJ();
        }
        liveDialog.dismiss();
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog = (CountDownForAllV2ScoreDialog) c515201za.l0;
        countDownForAllV2ScoreDialog.LLLILZ = EnumC312001Iw.BOTTOM_BUTTON;
        countDownForAllV2ScoreDialog.close(1);
    }

    public static final void LIZ$6(C515201za c515201za, LiveDialog liveDialog) {
        String string;
        String string2;
        long j;
        Long lLJII;
        String string3;
        TransitionInfo transitionInfo;
        liveDialog.dismiss();
        C01HJ c01hj = (C01HJ) c515201za.l0;
        c01hj.LLJJIJI.LJI(new C5182020e(c01hj, 251));
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            ShowListUser showListUserLJIILLIIL = interfaceC302601FgLIZ.LJIILLIIL();
            String str = "";
            if (showListUserLJIILLIIL == null || (string = Long.valueOf(showListUserLJIILLIIL.userId).toString()) == null) {
                string = "";
            }
            ShowListUser showListUserLJIILL = interfaceC302601FgLIZ.LJIILL();
            if (showListUserLJIILL == null || (string2 = Long.valueOf(showListUserLJIILL.userId).toString()) == null) {
                string2 = "";
            }
            ShowContent content = interfaceC302601FgLIZ.getContent();
            if (content != null && (transitionInfo = content.transitionInfo) != null) {
                j = transitionInfo.transitionDurationOfCurrent;
            } else {
                j = 0;
            }
            Map mapLIZ = C306901Gx.LIZ();
            InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ2 != null && (lLJII = interfaceC302601FgLIZ2.LJII()) != null && (string3 = lLJII.toString()) != null) {
                str = string3;
            }
            mapLIZ.put("multiguest_liveshow_id", str);
            mapLIZ.put("next_uid", string);
            mapLIZ.put("last_uid", string2);
            mapLIZ.put("duration", String.valueOf(j));
            C306901Gx.LJIL("livesdk_multiguest_anchor_liveshow_skip_interval_popup_confirm", mapLIZ);
        }
    }

    public static final void LIZ$7(C515201za c515201za, LiveDialog liveDialog) {
        ((C01HJ) c515201za.l0).LJLIL();
        liveDialog.dismiss();
    }

    public static final void LIZ$8(C515201za c515201za, LiveDialog liveDialog) {
        MutableLiveData<C303501Fp> mutableLiveData;
        C303501Fp value;
        ShowListUser showListUser;
        T t = ((BaseLiveShowWidget) c515201za.l0).LLILLJJLI;
        if (t != 0 && (mutableLiveData = t.LLILLL) != null && (value = mutableLiveData.getValue()) != null && (showListUser = value.LIZIZ) != null && showListUser.userId == UserService.getInstance().user().getCurrentUserId()) {
            ((BaseLiveShowWidget) c515201za.l0).LLJJIII.invoke();
        } else {
            ((BaseLiveShowWidget) c515201za.l0).LLJILJIL = true;
        }
        C306901Gx.LJIIZILJ("TURN_ON", ((BaseLiveShowWidget) c515201za.l0).y1());
        liveDialog.dismiss();
        ((BaseLiveShowWidget) c515201za.l0).dataChannel.zW(LiveShowOpenMicDialogShowingData.class, Boolean.TRUE);
    }

    public static final void LIZ$9(C515201za c515201za, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C306901Gx.LJIIZILJ("CANCEL", ((BaseLiveShowWidget) c515201za.l0).y1());
        ((BaseLiveShowWidget) c515201za.l0).dataChannel.zW(LiveShowOpenMicDialogShowingData.class, Boolean.TRUE);
    }
}
