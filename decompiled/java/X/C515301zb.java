package X;

import android.content.Context;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.live.liveinteract.gamelink.api.GameLinkApi;
import com.bytedance.android.live.liveinteract.gamelink.utils.feedback.GuestFeedbackSubmitResponse;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.guest.GuestShowdownGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.GameTagIdChangedChannel;
import com.bytedance.android.livesdk.dataChannel.GameTagIdListForceUpdate;
import com.bytedance.android.livesdk.dataChannel.LiveExtendScreenCloseEvent;
import com.bytedance.android.livesdk.impl.revenue.crm.widget.CRMGoalWidgetV2;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.creator_succ.GetInteractionHubGoalResponse;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: renamed from: X.01zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515301zb implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
            case 2:
                mh2$2(this, c262100zr);
                break;
            case 3:
                mh2$3(this, c262100zr);
                break;
            case 4:
                mh2$4(this, c262100zr);
                break;
            case 5:
                mh2$5(this, c262100zr);
                break;
            case 6:
                mh2$6(this, c262100zr);
                break;
            case 7:
                mh2$7(this, c262100zr);
                break;
            case 8:
                mh2$8(this, c262100zr);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                mh2$9(this, c262100zr);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                mh2$10(this, c262100zr);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                mh2$11(this, c262100zr);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                mh2$12(this, c262100zr);
                break;
        }
    }

    public C515301zb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C515301zb c515301zb, C262100zr c262100zr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent:");
        sbLIZ.append(c262100zr.LIZ);
        sbLIZ.append("plugGamesInVideoLive =");
        sbLIZ.append(((C01SE) c515301zb.l0).LLILZLL);
        C20441214yg.LIZIZ("GameCpVideoLive", C2188811AlT.LIZIZ(sbLIZ));
        C01SE c01se = (C01SE) c515301zb.l0;
        C015V.LIZLLL(true, c262100zr, c01se.LLILLL, c01se.LLJILJILJ);
    }

    public static final void mh2$1(C515301zb c515301zb, C262100zr c262100zr) {
        C01SI c01si = (C01SI) c515301zb.l0;
        C015V.LIZLLL(true, c262100zr, c01si.LLILLL, c01si.LLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void mh2$10(X.C515301zb r13, X.C262100zr r14) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C515301zb.mh2$10(X.01zb, X.00zr):void");
    }

    public static final void mh2$11(C515301zb c515301zb, C262100zr c262100zr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive js event = ");
        sbLIZ.append(c262100zr.LIZ);
        C20441214yg.LIZIZ("TopGuestBannerHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c262100zr.LIZ, "guest_point_ranking_banner_ready")) {
            C355501Zp c355501Zp = (C355501Zp) c515301zb.l0;
            c355501Zp.LIZIZ = true;
            if (c355501Zp.LIZJ) {
                c355501Zp.LIZJ = false;
                c355501Zp.LIZ.LIZIZ(new C5183020f(c355501Zp, 280));
            }
        }
    }

    public static final void mh2$12(C515301zb c515301zb, C262100zr c262100zr) {
        C20441214yg.LIZIZ("PlayBannerHelper", "receive multi_guest_banner_ready js event");
        C311201Io c311201Io = (C311201Io) c515301zb.l0;
        c311201Io.LIZIZ = true;
        if (c311201Io.LIZJ) {
            c311201Io.LIZJ = false;
            C311001Im c311001Im = c311201Io.LIZ;
            if (c311001Im != null) {
                c311001Im.LIZIZ(new C5183020f(c311201Io, 339));
            }
        }
    }

    public static final void mh2$2(C515301zb c515301zb, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        InterfaceC1871820yoG interfaceC1871820yoG;
        InterfaceC1103130eoR interfaceC1103130eoR;
        Context context;
        Map<String, Object> mapLIZ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "gamePartnershipFirstHideTask") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (interfaceC1871820yoG = interfaceC1107590evd.get("isFromApp")) != null && interfaceC1871820yoG.asInt() == 0 && (interfaceC1103130eoR = ((C1878440yyw) c515301zb.l0).LLILLL) != null && (context = interfaceC1103130eoR.getContext()) != null && ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0() != null) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                mapLIZ = interfaceC1107590evd2.LIZ();
            } else {
                mapLIZ = null;
            }
            C01GU.LJIIIIZZ(context, mapLIZ);
        }
    }

    public static final void mh2$3(C515301zb c515301zb, C262100zr c262100zr) {
        String string;
        String string2;
        String string3;
        String string4;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "signInPartnershipDropsEvent")) {
            InterfaceC1106030et7.w4.LIZJ(Boolean.TRUE);
            return;
        }
        if (!Intrinsics.LJFF(str, "gameAnchorJoinDrops")) {
            return;
        }
        C443301nz c443301nz = (C443301nz) c515301zb.l0;
        try {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String str2 = "";
            if (interfaceC1107590evd == null || (string = interfaceC1107590evd.getString("drops_id")) == null) {
                string = "";
            }
            C443301nz.LLJIJIL = string;
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 == null || (string2 = interfaceC1107590evd2.getString("drops_name")) == null) {
                string2 = "";
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 == null || (string3 = interfaceC1107590evd3.getString("game_id")) == null) {
                string3 = "";
            }
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null && (string4 = interfaceC1107590evd4.getString("game_name")) != null) {
                str2 = string4;
            }
            DataChannel dataChannel = c443301nz.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.SX0(C754460Tie.class, new C443401o0(C443301nz.LLJIJIL, string2, string3, str2));
            }
            InterfaceC1103130eoR interfaceC1103130eoR = c443301nz.LLILLL;
            if (interfaceC1103130eoR != null) {
                interfaceC1103130eoR.post(new RunnableC514801zW(c443301nz, 18));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void mh2$4(C515301zb c515301zb, C262100zr c262100zr) {
        C946060aj6 c946060aj6LIZIZ;
        C946050aj5 c946050aj5LIZIZ;
        C946060aj6 c946060aj6LIZIZ2;
        C946050aj5 c946050aj5LIZIZ2;
        Function0<Unit> function0;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        C946060aj6 c946060aj6LIZIZ3;
        C946050aj5 c946050aj5LIZIZ3;
        C946060aj6 c946060aj6LIZIZ4;
        C946050aj5 c946050aj5LIZIZ4;
        Function0<Unit> function02;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        String string = null;
        if (interfaceC1107590evd != null) {
            string = interfaceC1107590evd.getString("action");
        }
        ((GuestShowdownAnchorWidget) c515301zb.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent, actionName: ");
        sbLIZ.append(string);
        C20441214yg.LJIIIZ("GuestShowdownAnchorWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(string, "guest_showdown_setting_show")) {
            DataChannel dataChannel = ((GuestShowdownAnchorWidget) c515301zb.l0).dataChannel;
            if (dataChannel != null && (c946060aj6LIZIZ4 = C01Z9.LIZIZ(dataChannel)) != null && (c946050aj5LIZIZ4 = c946060aj6LIZIZ4.LIZIZ()) != null && (function02 = c946050aj5LIZIZ4.LIZ.LJ) != null) {
                function02.invoke();
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(string, "guest_showdown_setting_dismiss")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 == null || (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd2, "params")) == null) {
                return;
            }
            GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
            MultiGuestGuestShowdownConfigSetting multiGuestGuestShowdownConfigSetting = MultiGuestGuestShowdownConfigSetting.INSTANCE;
            guestShowdownConfig.duration = C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "guest_showdown_duration", (int) multiGuestGuestShowdownConfigSetting.getSettingValue().defaultDuration);
            guestShowdownConfig.loserNum = C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "guest_showdown_loser_num", multiGuestGuestShowdownConfigSetting.getSettingValue().defaultLoserNum);
            guestShowdownConfig.winnerNum = C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "guest_showdown_winner_num", multiGuestGuestShowdownConfigSetting.getSettingValue().defaultWinnerNum);
            GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) ((GuestShowdownAnchorWidget) c515301zb.l0).LLILLL;
            if (guestShowdownAnchorViewModel != null) {
                guestShowdownAnchorViewModel.KQ2(guestShowdownConfig.loserNum, guestShowdownConfig.winnerNum, guestShowdownConfig.duration);
            }
            DataChannel dataChannel2 = ((GuestShowdownAnchorWidget) c515301zb.l0).dataChannel;
            if (dataChannel2 == null || (c946060aj6LIZIZ3 = C01Z9.LIZIZ(dataChannel2)) == null || (c946050aj5LIZIZ3 = c946060aj6LIZIZ3.LIZIZ()) == null) {
                return;
            }
            c946050aj5LIZIZ3.LIZ(guestShowdownConfig);
            return;
        }
        if (Intrinsics.LJFF(string, "guest_showdown_rank_show")) {
            DataChannel dataChannel3 = ((GuestShowdownAnchorWidget) c515301zb.l0).dataChannel;
            if (dataChannel3 == null || (c946060aj6LIZIZ2 = C01Z9.LIZIZ(dataChannel3)) == null || (c946050aj5LIZIZ2 = c946060aj6LIZIZ2.LIZIZ()) == null || (function0 = c946050aj5LIZIZ2.LIZ.LJ) == null) {
                return;
            }
            function0.invoke();
            return;
        }
        if (Intrinsics.LJFF(string, "guest_showdown_rank_dismiss")) {
            DataChannel dataChannel4 = ((GuestShowdownAnchorWidget) c515301zb.l0).dataChannel;
            if (dataChannel4 == null || (c946060aj6LIZIZ = C01Z9.LIZIZ(dataChannel4)) == null || (c946050aj5LIZIZ = c946060aj6LIZIZ.LIZIZ()) == null) {
                return;
            }
            c946050aj5LIZIZ.LIZIZ(1);
            return;
        }
        ((GuestShowdownAnchorWidget) c515301zb.l0).getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onReceiveJsEvent, can't handle this actionName: ");
        sbLIZ2.append(string);
        C20441214yg.LJ("GuestShowdownAnchorWidget", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void mh2$5(C515301zb c515301zb, C262100zr c262100zr) {
        String string;
        C946060aj6 c946060aj6LIZIZ;
        C946050aj5 c946050aj5LIZIZ;
        C946060aj6 c946060aj6LIZIZ2;
        C946050aj5 c946050aj5LIZIZ2;
        Function0<Unit> function0;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            string = interfaceC1107590evd.getString("action");
        } else {
            string = null;
        }
        ((GuestShowdownGuestWidget) c515301zb.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent, actionName: ");
        sbLIZ.append(string);
        C20441214yg.LJIIIZ("GuestShowdownGuestWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(string, "guest_showdown_rank_show")) {
            DataChannel dataChannel = ((GuestShowdownGuestWidget) c515301zb.l0).dataChannel;
            if (dataChannel != null && (c946060aj6LIZIZ2 = C01Z9.LIZIZ(dataChannel)) != null && (c946050aj5LIZIZ2 = c946060aj6LIZIZ2.LIZIZ()) != null && (function0 = c946050aj5LIZIZ2.LIZ.LJ) != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(string, "guest_showdown_rank_dismiss")) {
            DataChannel dataChannel2 = ((GuestShowdownGuestWidget) c515301zb.l0).dataChannel;
            if (dataChannel2 == null || (c946060aj6LIZIZ = C01Z9.LIZIZ(dataChannel2)) == null || (c946050aj5LIZIZ = c946060aj6LIZIZ.LIZIZ()) == null) {
                return;
            }
            c946050aj5LIZIZ.LIZIZ(1);
            return;
        }
        ((GuestShowdownGuestWidget) c515301zb.l0).getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onReceiveJsEvent, can't handle this actionName: ");
        sbLIZ2.append(string);
        C20441214yg.LJ("GuestShowdownGuestWidget", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void mh2$6(C515301zb c515301zb, C262100zr c262100zr) {
        Integer num;
        Integer num2;
        Integer num3;
        C20441214yg.LIZIZ("BaseLiveShowWidget", "receive multi_guest_banner_ready js event");
        C924810aAp.LJ().LJJJ = true;
        BaseLiveShowWidget baseLiveShowWidget = (BaseLiveShowWidget) c515301zb.l0;
        baseLiveShowWidget.getClass();
        if (!C924810aAp.LJ().LJJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendBannerJsEventWhenRefreshSuccess: status: ");
            sbLIZ.append(baseLiveShowWidget.LLIZLLLIL);
            sbLIZ.append(", order: ");
            sbLIZ.append(baseLiveShowWidget.LLILZIL);
            sbLIZ.append(", name: ");
            sbLIZ.append(baseLiveShowWidget.LLILZLL);
            C20441214yg.LIZIZ("BaseLiveShowWidget", C2188811AlT.LIZIZ(sbLIZ));
            int i = baseLiveShowWidget.LLIZLLLIL;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                baseLiveShowWidget.E1(5, null, null, null, true);
                            }
                        } else {
                            baseLiveShowWidget.E1(1, baseLiveShowWidget.LLILZIL, baseLiveShowWidget.LLILZLL, baseLiveShowWidget.LLIZ, true);
                        }
                    } else if (baseLiveShowWidget.LLILZLL != null && (num3 = baseLiveShowWidget.LLILZIL) != null) {
                        num3.intValue();
                        baseLiveShowWidget.E1(3, baseLiveShowWidget.LLILZIL, baseLiveShowWidget.LLILZLL, baseLiveShowWidget.LLIZ, true);
                    }
                    BaseLiveShowWidget.G1();
                } else if (baseLiveShowWidget.LLILZLL != null && (num2 = baseLiveShowWidget.LLILZIL) != null) {
                    num2.intValue();
                    baseLiveShowWidget.E1(2, baseLiveShowWidget.LLILZIL, baseLiveShowWidget.LLILZLL, baseLiveShowWidget.LLIZ, true);
                    BaseLiveShowWidget.G1();
                }
            } else if (baseLiveShowWidget.LLILZLL != null && (num = baseLiveShowWidget.LLILZIL) != null) {
                num.intValue();
                baseLiveShowWidget.E1(1, baseLiveShowWidget.LLILZIL, baseLiveShowWidget.LLILZLL, baseLiveShowWidget.LLIZ, true);
                BaseLiveShowWidget.G1();
            }
        }
        C924810aAp.LJ().LJJJI = true;
    }

    public static final void mh2$7(C515301zb c515301zb, C262100zr c262100zr) {
        String strLJFF;
        String strLJFF2;
        Object c098200Yq;
        List<GameTag> list;
        boolean z = false;
        C015T c015t = null;
        boolValueOf = null;
        Boolean boolValueOf = null;
        if (Intrinsics.LJFF(c262100zr.LIZ, "gamePartnershipOpenLiveTopicUpdate")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "game_tag_id", "")) != null) {
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd2, "game_tag_name", "");
                } else {
                    strLJFF2 = null;
                }
                GameTag gameTag = new GameTag(null, null, null, null, 0, null, null, null, null, 511, null);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(strLJFF);
                if (lLJIILIIL == null) {
                    return;
                }
                gameTag.id = lLJIILIIL;
                try {
                    c098200Yq = URLDecoder.decode(String.valueOf(strLJFF2), "utf-8");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                gameTag.showName = (String) c098200Yq;
                C754700Tj2.LIZLLL(gameTag);
                HashtagResponse hashtagResponse = (HashtagResponse) ((PreviewPartnershipWidget) c515301zb.l0).dataChannel.gg0(HashTagResp.class);
                if (hashtagResponse != null && (list = hashtagResponse.gameTagList) != null) {
                    if (!list.isEmpty()) {
                        Iterator<GameTag> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (Intrinsics.LJFF(it2.next().id, C2095008Iq.LJIILIIL(strLJFF))) {
                                z = true;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(boolValueOf, bool)) {
                    ((PreviewPartnershipWidget) c515301zb.l0).dataChannel.zW(GameTagIdChangedChannel.class, bool);
                    return;
                } else {
                    ((PreviewPartnershipWidget) c515301zb.l0).dataChannel.SX0(C754660Tiy.class, strLJFF);
                    ((PreviewPartnershipWidget) c515301zb.l0).dataChannel.zW(GameTagIdListForceUpdate.class, bool);
                    return;
                }
            }
            return;
        }
        PreviewPartnershipWidget previewPartnershipWidget = (PreviewPartnershipWidget) c515301zb.l0;
        Context context = previewPartnershipWidget.context;
        C015T c015t2 = previewPartnershipWidget.LLJILJIL;
        if (c015t2 != null) {
            c015t = c015t2;
        }
        C015V.LIZLLL(false, c262100zr, context, c015t);
    }

    public static final void mh2$8(C515301zb c515301zb, C262100zr c262100zr) {
        Map<String, Object> mapLIZ;
        Object obj;
        String strLIZJ;
        Map<String, Object> mapLIZ2;
        Object obj2;
        String strLIZJ2;
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        Unit unit = null;
        if (iHashCode != -1994546847) {
            if (iHashCode != 370076567) {
                if (iHashCode == 650925530 && str.equals("CHOOSE_MAIN_FOCUS")) {
                    CRMGoalWidgetV2 cRMGoalWidgetV2 = (CRMGoalWidgetV2) c515301zb.l0;
                    try {
                        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                        if (interfaceC1107590evd != null && (mapLIZ2 = interfaceC1107590evd.LIZ()) != null && (obj2 = mapLIZ2.get("data")) != null && (strLIZJ2 = C1516000pYM.LIZJ(obj2)) != null) {
                            InteractionHubGoalMessage interactionHubGoalMessage = (InteractionHubGoalMessage) C19748512Ol.LIZJ.LJII(strLIZJ2, InteractionHubGoalMessage.class);
                            cRMGoalWidgetV2.y1(new C262000zq(interactionHubGoalMessage.interactionGoal, interactionHubGoalMessage.interactionTips, interactionHubGoalMessage.newGiftInfo, interactionHubGoalMessage.taskProgress, interactionHubGoalMessage.interactionGoalType));
                            unit = Unit.LIZ;
                        }
                        C189200o6.m2constructorimpl(unit);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
                return;
            }
            if (str.equals("force_close_extended_screen")) {
                ((CRMGoalWidgetV2) c515301zb.l0).dataChannel.FQ2(LiveExtendScreenCloseEvent.class);
                return;
            }
            return;
        }
        if (str.equals("creator_succ_hub_goal_update")) {
            CRMGoalWidgetV2 cRMGoalWidgetV22 = (CRMGoalWidgetV2) c515301zb.l0;
            try {
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null && (mapLIZ = interfaceC1107590evd2.LIZ()) != null && (obj = mapLIZ.get("data")) != null && (strLIZJ = C1516000pYM.LIZJ(obj)) != null) {
                    GetInteractionHubGoalResponse.Data data = (GetInteractionHubGoalResponse.Data) C19748512Ol.LIZJ.LJII(strLIZJ, GetInteractionHubGoalResponse.Data.class);
                    if (data != null) {
                        cRMGoalWidgetV22.y1(new C262000zq(data.interactionGoal, data.interactionTips, data.giftInfo, data.taskProgress, data.interactionGoalType));
                    }
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    public static final void mh2$9(C515301zb c515301zb, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Map<String, Object> mapLIZ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "Multi_guest_feedback_submit") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (mapLIZ = interfaceC1107590evd.LIZ()) != null) {
            C924560aAQ c924560aAQ = (C924560aAQ) c515301zb.l0;
            c924560aAQ.getClass();
            C480460Ism.LIZ().getClass();
            ((C11NJ) c924560aAQ.LJII.getValue()).LIZ(((GameLinkApi) C480460Ism.LIZLLL(GameLinkApi.class)).submitFeedback(C500260Jjc.LLD(mapLIZ)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Y2
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameLinkFeedbackController@bca2.submitFeedback$1");
                    GuestFeedbackSubmitResponse guestFeedbackSubmitResponse = (GuestFeedbackSubmitResponse) obj;
                    int i = guestFeedbackSubmitResponse.errorCode;
                    if (i != 0) {
                        if (i != 9) {
                            C766270U4b.LIZLLL(2131843598);
                        } else {
                            C766270U4b.LIZLLL(2131843616);
                        }
                    } else {
                        C766270U4b.LIZLLL(2131843617);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSuccess: ");
                    sbLIZ.append(guestFeedbackSubmitResponse);
                    C20441214yg.LJIIIZ("MultiGuestFeedbackController", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("GameLinkFeedbackController@bca2.submitFeedback$1");
                }
            }, new C09JN() { // from class: X.00Y1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameLinkFeedbackController@bca2.submitFeedback$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onError: ");
                    sbLIZ.append(obj);
                    C20441214yg.LJIIIZ("MultiGuestFeedbackController", C2188811AlT.LIZIZ(sbLIZ));
                    C766270U4b.LIZLLL(2131843598);
                    C1C7U.LIZIZ("GameLinkFeedbackController@bca2.submitFeedback$2");
                }
            }));
        }
    }
}
