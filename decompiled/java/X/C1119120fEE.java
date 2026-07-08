package X;

import Y.AcS1S1200200_17;
import Y.AcS84S1200000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.rank.impl.setting.RankOptOutTipsDialog;
import com.bytedance.android.livesdk.dataChannel.StreamTranslationSwitchData;
import com.bytedance.android.livesdk.livesetting.rank.GiftClassRankCreatorOptOutDialogSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankingOptOutNewRuleSetting;
import com.bytedance.android.livesdk.model.UserAttrResponse;
import com.bytedance.android.livesdk.model.message.RankToastMessage;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Map;

/* JADX INFO: renamed from: X.0fEE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119120fEE implements InterfaceC465400IMw, OnMessageListener {
    public FragmentManager LL;

    public static final boolean LIZLLL() {
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C951600as2.class);
        return l != null && l.longValue() > EnumC1118970fDz.RANK_SWITCH_STATUS_HIDE.getValue();
    }

    public static final void LJII() {
        C480460Ism.LIZ().getClass();
        UserApi userApi = (UserApi) C480460Ism.LIZLLL(UserApi.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("6,12,");
        sbLIZ.append(15L);
        sbLIZ.append(',');
        sbLIZ.append(23L);
        sbLIZ.append(",17,18,31,32,33");
        userApi.getUserAttr(C2188811AlT.LIZIZ(sbLIZ)).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0fBc
            @Override // X.C09JN
            public final void accept(Object obj) {
                long value;
                long value2;
                long value3;
                long value4;
                long value5;
                long jLongValue;
                long jLongValue2;
                long value6;
                Map<Long, Long> map;
                Long l;
                Map<Long, Long> map2;
                Long l2;
                Map<Long, Long> map3;
                Long l3;
                Map<Long, Long> map4;
                Long l4;
                Map<Long, Long> map5;
                Long l5;
                Map<Long, Long> map6;
                Long l6;
                Map<Long, Long> map7;
                Long l7;
                Map<Long, Long> map8;
                Long l8;
                Map<Long, Long> map9;
                Long l9;
                C1C7U.LIZ("RankOptOutPresenter@79e.requestSwitchStatus$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse.statusCode == 0) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    UserAttrResponse userAttrResponse = (UserAttrResponse) baseResponse.data;
                    if (userAttrResponse != null && (map9 = userAttrResponse.values) != null && (l9 = map9.get(6L)) != null) {
                        value = l9.longValue();
                    } else {
                        value = EnumC1118970fDz.RANK_SWITCH_STATUS_ON.getValue();
                    }
                    dataChannelGlobal.JQ2(C951600as2.class, Long.valueOf(value));
                    UserAttrResponse userAttrResponse2 = (UserAttrResponse) baseResponse.data;
                    if (userAttrResponse2 != null && (map8 = userAttrResponse2.values) != null && (l8 = map8.get(12L)) != null) {
                        value2 = l8.longValue();
                    } else {
                        value2 = EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_ON.getValue();
                    }
                    dataChannelGlobal.JQ2(C1148070fyv.class, Long.valueOf(value2));
                    UserAttrResponse userAttrResponse3 = (UserAttrResponse) baseResponse.data;
                    if (userAttrResponse3 != null && (map7 = userAttrResponse3.values) != null && (l7 = map7.get(15L)) != null) {
                        value3 = l7.longValue();
                    } else {
                        value3 = EnumC1117590fBl.ON.getValue();
                    }
                    dataChannelGlobal.JQ2(C1148060fyu.class, Long.valueOf(value3));
                    UserAttrResponse userAttrResponse4 = (UserAttrResponse) baseResponse.data;
                    if (userAttrResponse4 != null && (map6 = userAttrResponse4.values) != null && (l6 = map6.get(23L)) != null) {
                        value4 = l6.longValue();
                    } else {
                        value4 = EnumC980460bca.OFF.getValue();
                    }
                    dataChannelGlobal.JQ2(C980550bcj.class, Long.valueOf(value4));
                    if (value4 == EnumC980460bca.ON.getValue()) {
                        ((IMatchAICommentaryService) C1161920gLG.LIZJ(IMatchAICommentaryService.class)).Gs0();
                    }
                    UserAttrResponse userAttrResponse5 = (UserAttrResponse) baseResponse.data;
                    if (userAttrResponse5 != null && (map5 = userAttrResponse5.values) != null && (l5 = map5.get(17L)) != null) {
                        value5 = l5.longValue();
                    } else {
                        value5 = EnumC1117510fBd.FANS_CLUB_CELEBRATION_SWITCH_STATUS_ON.getValue();
                    }
                    dataChannelGlobal.JQ2(C1148100fyy.class, Long.valueOf(value5));
                    UserAttrResponse userAttrResponse6 = (UserAttrResponse) baseResponse.data;
                    long jLongValue3 = 0;
                    if (userAttrResponse6 != null && (map4 = userAttrResponse6.values) != null && (l4 = map4.get(18L)) != null) {
                        jLongValue = l4.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    dataChannelGlobal.JQ2(C1148080fyw.class, Long.valueOf(jLongValue));
                    UserAttrResponse userAttrResponse7 = (UserAttrResponse) baseResponse.data;
                    if (userAttrResponse7 != null && (map3 = userAttrResponse7.values) != null && (l3 = map3.get(32L)) != null) {
                        jLongValue2 = l3.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    dataChannelGlobal.JQ2(C1148090fyx.class, Long.valueOf(jLongValue2));
                    UserAttrResponse userAttrResponse8 = (UserAttrResponse) baseResponse.data;
                    if (userAttrResponse8 != null && (map2 = userAttrResponse8.values) != null && (l2 = map2.get(31L)) != null) {
                        value6 = l2.longValue();
                    } else {
                        value6 = EnumC1117520fBe.FANS_CLUB_CRM_AI_SWITCH_STATUS_ON.getValue();
                    }
                    dataChannelGlobal.JQ2(C1148120fz0.class, Long.valueOf(value6));
                    UserAttrResponse userAttrResponse9 = (UserAttrResponse) baseResponse.data;
                    if (userAttrResponse9 != null && (map = userAttrResponse9.values) != null && (l = map.get(33L)) != null) {
                        jLongValue3 = l.longValue();
                    }
                    dataChannelGlobal.HQ2(StreamTranslationSwitchData.class, Long.valueOf(jLongValue3));
                }
                C1C7U.LIZIZ("RankOptOutPresenter@79e.requestSwitchStatus$1");
            }
        }, new C09JN() { // from class: X.0IS2
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RankOptOutPresenter@79e.requestSwitchStatus$2");
                C1C7U.LIZIZ("RankOptOutPresenter@79e.requestSwitchStatus$2");
            }
        });
    }

    @Override // X.InterfaceC465400IMw
    public final void LIZ(long j) {
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(j);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.RANK_TOAST_MESSAGE.getIntType(), this);
        }
        this.LL = null;
    }

    @Override // X.InterfaceC465400IMw
    public final void LIZIZ(FragmentManager fragmentManager) {
        this.LL = fragmentManager;
    }

    @Override // X.InterfaceC465400IMw
    public final void LIZJ(long j) {
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(j);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.RANK_TOAST_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LOCAL_LIVE_PLAY_ORIENTATION_CHANGED_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        FragmentManager fragmentManager;
        Boolean boolValueOf;
        FragmentManager fragmentManager2;
        if (iMessage instanceof RankToastMessage) {
            RankToastMessage.RankToast rankToast = ((RankToastMessage) iMessage).toast;
            if (rankToast != null) {
                boolValueOf = Boolean.valueOf(rankToast.shouldToast);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (fragmentManager2 = this.LL) != null) {
                if (C497740JfY.LJIL()) {
                    new RankOptOutTipsDialog().show(fragmentManager2, "RankOptOutTipsDialog");
                    return;
                } else {
                    InterfaceC465400IMw.LLILLIZIL.getClass();
                    C463540IFs.LIZIZ = true;
                    return;
                }
            }
            return;
        }
        if (!(iMessage instanceof C1119150fEH) || !((C1119150fEH) iMessage).LL) {
            return;
        }
        C463540IFs c463540IFs = InterfaceC465400IMw.LLILLIZIL;
        c463540IFs.getClass();
        if (!C463540IFs.LIZIZ || (fragmentManager = this.LL) == null) {
            return;
        }
        new RankOptOutTipsDialog().show(fragmentManager, "RankOptOutTipsDialog");
        c463540IFs.getClass();
        C463540IFs.LIZIZ = false;
    }

    public static C474500IjA LJ(String str, String str2) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str2, "enter_from");
        if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        c474500IjALIZ.LJJII(str3, "user_type");
        return c474500IjALIZ;
    }

    public static void LJI(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_opt_out_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "page_name");
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LJFF(long j, long j2, InterfaceC1119160fEI interfaceC1119160fEI) {
        C480460Ism.LIZ().getClass();
        ((UserApi) C480460Ism.LIZLLL(UserApi.class)).updateSwitch(j, j2).LJIILIIL(new C0UO0()).LJJLL(new AfS186S0100000_17(interfaceC1119160fEI, 13), new AfS186S0100000_17(interfaceC1119160fEI, 14));
    }

    public final void LJIIIIZZ(Context context, final long j, final long j2, boolean z, final String str, String str2, final InterfaceC1119160fEI interfaceC1119160fEI) {
        int i;
        int i2;
        if (context != null && UserService.getInstance().user().getCurrentUser().getSecret() == 1 && j2 == EnumC1118970fDz.RANK_SWITCH_STATUS_ON.getValue()) {
            C19GO c19go = new C19GO(context);
            c19go.LJI(2131842651);
            if (z) {
                i2 = 2131843898;
            } else {
                i2 = 2131832638;
            }
            c19go.LIZIZ(i2);
            c19go.LJ(2131842862, new DialogInterface.OnClickListener() { // from class: X.0fEF
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.dismiss();
                    C1119120fEE.LJFF(j, j2, interfaceC1119160fEI);
                    C1119120fEE c1119120fEE = this;
                    String str3 = str;
                    c1119120fEE.getClass();
                    C474500IjA c474500IjALJ = C1119120fEE.LJ("livesdk_turn_on_ranking_popup_click", str3);
                    c474500IjALJ.LJJII("turn_on", "button_click_type");
                    c474500IjALJ.LIZ();
                }
            }, false);
            c19go.LIZJ(2131842652, new DialogInterface.OnClickListener(this) { // from class: X.0fEG
                public final /* synthetic */ C1119120fEE LLILLJJLI;

                {
                    this.LLILLJJLI = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.dismiss();
                    interfaceC1119160fEI.onCancel();
                    C1119120fEE c1119120fEE = this.LLILLJJLI;
                    String str3 = str;
                    c1119120fEE.getClass();
                    C474500IjA c474500IjALJ = C1119120fEE.LJ("livesdk_turn_on_ranking_popup_click", str3);
                    c474500IjALJ.LJJII("cancel", "button_click_type");
                    c474500IjALJ.LIZ();
                }
            }, false);
            c19go.LJJIIJ = false;
            C786410Ut5.M4(c19go.LIZ());
            LJ("livesdk_turn_on_ranking_popup_show", str).LIZ();
            return;
        }
        if (z && context != null) {
            if (j2 == EnumC1118970fDz.RANK_SWITCH_STATUS_OFF.getValue() && j == 28) {
                C782110Um9 c782110Um9 = new C782110Um9(context);
                c782110Um9.LJIIZILJ(2131855548);
                c782110Um9.LJII(2131855556);
                c782110Um9.LJIILIIL(2131842399, new AcS1S1200200_17(j, j2, this, interfaceC1119160fEI, str2, 0));
                c782110Um9.LJIIJ(2131842400, new AcS84S1200000_17(this, interfaceC1119160fEI, str2, 0));
                c782110Um9.LJIILLIIL = false;
                C786410Ut5.E4(c782110Um9.LIZ());
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_opt_out_popup_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(str2, "page_name");
                c474500IjALIZ.LIZ();
                return;
            }
            if (j2 == EnumC1118970fDz.RANK_SWITCH_STATUS_OFF.getValue() && GiftClassRankCreatorOptOutDialogSetting.INSTANCE.getValue()) {
                C782110Um9 c782110Um92 = new C782110Um9(context);
                c782110Um92.LJIIZILJ(2131842402);
                if (RankingOptOutNewRuleSetting.INSTANCE.getValue(true)) {
                    i = 2131855484;
                } else {
                    i = 2131842401;
                }
                c782110Um92.LJII(i);
                c782110Um92.LJIILIIL(2131842399, new AcS1S1200200_17(j, j2, this, interfaceC1119160fEI, str2, 1));
                c782110Um92.LJIIJ(2131842400, new AcS84S1200000_17(this, interfaceC1119160fEI, str2, 1));
                c782110Um92.LJIILLIIL = false;
                C786410Ut5.E4(c782110Um92.LIZ());
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_opt_out_popup_show");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII(str2, "page_name");
                c474500IjALIZ2.LIZ();
                return;
            }
        }
        LJFF(j, j2, interfaceC1119160fEI);
    }
}
