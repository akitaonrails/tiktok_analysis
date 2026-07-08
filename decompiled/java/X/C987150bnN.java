package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.GuestFeedbackSubmitResponse;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEnigmaMainSchemaSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0bnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987150bnN implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
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
        }
    }

    public C987150bnN(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C987150bnN c987150bnN, C262100zr c262100zr) {
        long jLJJL;
        int i;
        EnigmaBattleSetting enigmaBattleSettingLJJIIJZLJL;
        C495520Jby c495520Jby = new C495520Jby(LiveMatchEnigmaMainSchemaSetting.INSTANCE.getValue());
        c495520Jby.LIZJ("enter_from", "match_short_tap");
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJL = interfaceC973730bRjYf2.LJJL();
        } else {
            jLJJL = 0;
        }
        c495520Jby.LIZIZ(jLJJL, "channel_id");
        c495520Jby.LIZIZ(C915980Zwa.LIZLLL().getBattleId(), "pk_id");
        c495520Jby.LIZJ("sub_match_type", C915980Zwa.LJFF().my());
        User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
        if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
            i = 1;
        } else {
            i = 0;
        }
        c495520Jby.LIZ(i, "is_enigma");
        c495520Jby.LIZIZ(C915980Zwa.LJFF().Nt0(), "enigma_count");
        c495520Jby.LIZIZ(C915980Zwa.LJFF().y90(), "enigma_total_points");
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null && (enigmaBattleSettingLJJIIJZLJL = interfaceC973730bRjYf22.LJJIIJZLJL()) != null && (!enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealCountdownSec.isEmpty())) {
            c495520Jby.LIZJ("enigma_score_reveal_countdown_sec", C13LP.LJJLIIIJ(enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealCountdownSec, ",", null, null, 0, null, null, 62));
            c495520Jby.LIZIZ(enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealDurationSec, "enigma_score_reveal_duration_sec");
        }
        String strLIZLLL = c495520Jby.LIZLLL();
        strLIZLLL.toString();
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((MatchItemAssem) c987150bnN.l0).getContext(), strLIZLLL);
    }

    public static final void mh2$1(C987150bnN c987150bnN, C262100zr c262100zr) throws JSONException {
        C20441214yg.LIZIZ("BannerHelper", "receive multi_guest_banner_ready js event");
        C945350ahx c945350ahx = (C945350ahx) c987150bnN.l0;
        c945350ahx.LIZIZ = true;
        c945350ahx.LIZJ = true;
        if (c945350ahx.LIZLLL) {
            c945350ahx.LIZLLL = false;
            c945350ahx.LIZJ(c945350ahx.LJFF, c945350ahx.LJ, c945350ahx.LJI, c945350ahx.LJII, c945350ahx.LJIIIIZZ);
        }
    }

    public static final void mh2$2(C987150bnN c987150bnN, C262100zr c262100zr) {
        long jLJJL;
        int i;
        EnigmaBattleSetting enigmaBattleSettingLJJIIJZLJL;
        ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
        C495520Jby c495520Jby = new C495520Jby(LiveMatchEnigmaMainSchemaSetting.INSTANCE.getValue());
        c495520Jby.LIZJ("enter_from", "gift_panel_banner");
        InterfaceC973730bRj interfaceC973730bRjYf2 = iLiveMatchService.yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJL = interfaceC973730bRjYf2.LJJL();
        } else {
            jLJJL = 0;
        }
        c495520Jby.LIZIZ(jLJJL, "channel_id");
        c495520Jby.LIZIZ(C1140740fn6.LIZIZ().getBattleId(), "pk_id");
        c495520Jby.LIZJ("sub_match_type", iLiveMatchService.my());
        User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
        if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
            i = 1;
        } else {
            i = 0;
        }
        c495520Jby.LIZ(i, "is_enigma");
        c495520Jby.LIZIZ(iLiveMatchService.Nt0(), "enigma_count");
        c495520Jby.LIZIZ(iLiveMatchService.y90(), "enigma_total_points");
        InterfaceC973730bRj interfaceC973730bRjYf22 = iLiveMatchService.yf2(false);
        if (interfaceC973730bRjYf22 != null && (enigmaBattleSettingLJJIIJZLJL = interfaceC973730bRjYf22.LJJIIJZLJL()) != null && (!enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealCountdownSec.isEmpty())) {
            c495520Jby.LIZJ("enigma_score_reveal_countdown_sec", C13LP.LJJLIIIJ(enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealCountdownSec, ",", null, null, 0, null, null, 62));
            c495520Jby.LIZIZ(enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealDurationSec, "enigma_score_reveal_duration_sec");
        }
        String strLIZLLL = c495520Jby.LIZLLL();
        strLIZLLL.toString();
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) c987150bnN.l0, strLIZLLL);
    }

    public static final void mh2$3(C987150bnN c987150bnN, C262100zr c262100zr) {
        long jLJJL;
        int i;
        EnigmaBattleSetting enigmaBattleSettingLJJIIJZLJL;
        ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
        C495520Jby c495520Jby = new C495520Jby(LiveMatchEnigmaMainSchemaSetting.INSTANCE.getValue());
        c495520Jby.LIZJ("enter_from", "gift_panel_banner");
        InterfaceC973730bRj interfaceC973730bRjYf2 = iLiveMatchService.yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJL = interfaceC973730bRjYf2.LJJL();
        } else {
            jLJJL = 0;
        }
        c495520Jby.LIZIZ(jLJJL, "channel_id");
        c495520Jby.LIZIZ(C1140740fn6.LIZIZ().getBattleId(), "pk_id");
        c495520Jby.LIZJ("sub_match_type", iLiveMatchService.my());
        User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
        if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
            i = 1;
        } else {
            i = 0;
        }
        c495520Jby.LIZ(i, "is_enigma");
        c495520Jby.LIZIZ(iLiveMatchService.Nt0(), "enigma_count");
        c495520Jby.LIZIZ(iLiveMatchService.y90(), "enigma_total_points");
        InterfaceC973730bRj interfaceC973730bRjYf22 = iLiveMatchService.yf2(false);
        if (interfaceC973730bRjYf22 != null && (enigmaBattleSettingLJJIIJZLJL = interfaceC973730bRjYf22.LJJIIJZLJL()) != null && (!enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealCountdownSec.isEmpty())) {
            c495520Jby.LIZJ("enigma_score_reveal_countdown_sec", C13LP.LJJLIIIJ(enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealCountdownSec, ",", null, null, 0, null, null, 62));
            c495520Jby.LIZIZ(enigmaBattleSettingLJJIIJZLJL.enigmaScoreRevealDurationSec, "enigma_score_reveal_duration_sec");
        }
        String strLIZLLL = c495520Jby.LIZLLL();
        strLIZLLL.toString();
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) c987150bnN.l0, strLIZLLL);
    }

    public static final void mh2$4(C987150bnN c987150bnN, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Map<String, Object> mapLIZ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "Multi_guest_feedback_submit") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (mapLIZ = interfaceC1107590evd.LIZ()) != null) {
            MultiGuestFeedbackController multiGuestFeedbackController = (MultiGuestFeedbackController) c987150bnN.l0;
            multiGuestFeedbackController.getClass();
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).submitFeedback(C500260Jjc.LLD(mapLIZ)).LJIILIIL(new C0UO0()), (C11NJ) multiGuestFeedbackController.LJII.getValue(), new C09JN() { // from class: X.0Zwm
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MultiGuestFeedbackController@e53c.submitFeedback$1");
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
                    C914810Zuh c914810Zuh = MultiGuestFeedbackController.LJIIJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSuccess: ");
                    sbLIZ.append(guestFeedbackSubmitResponse);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c914810Zuh.getClass();
                    C944240agA.LIZJ("MultiGuestFeedbackController", strLIZIZ);
                    C1C7U.LIZIZ("MultiGuestFeedbackController@e53c.submitFeedback$1");
                }
            }, new C09JN() { // from class: X.0Zwl
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MultiGuestFeedbackController@e53c.submitFeedback$2");
                    C914810Zuh c914810Zuh = MultiGuestFeedbackController.LJIIJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onError: ");
                    sbLIZ.append(obj);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c914810Zuh.getClass();
                    C944240agA.LIZJ("MultiGuestFeedbackController", strLIZIZ);
                    C766270U4b.LIZLLL(2131843598);
                    C1C7U.LIZIZ("MultiGuestFeedbackController@e53c.submitFeedback$2");
                }
            }, null, null, 56);
        }
    }
}
