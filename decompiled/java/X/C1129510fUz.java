package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0fUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129510fUz {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static boolean LIZIZ(DataChannel dataChannel) {
        List list;
        Object objGg0;
        boolean z;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Object objGg02 = null;
        if (dataChannel != null) {
            list = (List) dataChannel.gg0(BattleMvpLeftListChannel.class);
            objGg0 = dataChannel.gg0(BattleTop2CardEffectChannel.class);
            objGg02 = dataChannel.gg0(BattleTop3CardEffectChannel.class);
        } else {
            list = null;
            objGg0 = null;
        }
        if (list == null) {
            return false;
        }
        if (list.size() > 2) {
            if (currentUserId == ((BattleUserArmy) ListProtector.get(list, 2)).userId && objGg02 == EnumC919030a1V.EFFECTING) {
                z = true;
            } else {
                z = false;
            }
            if ((currentUserId != ((BattleUserArmy) ListProtector.get(list, 1)).userId || objGg0 != EnumC919030a1V.EFFECTING) && !z) {
                return false;
            }
            return true;
        }
        if (list.size() <= 1 || currentUserId != ((BattleUserArmy) ListProtector.get(list, 1)).userId || objGg0 != EnumC919030a1V.EFFECTING) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggleISbannerdisplaying ");
        sbLIZ.append(LIZ);
        sbLIZ.append(", display ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("Top2Top3Utils", C2188811AlT.LIZIZ(sbLIZ));
        LIZ = z;
    }

    public static void LIZJ(int i, Context context) {
        boolean z;
        C20441214yg.LJIIIZ("Top2Top3Utils", "Top2Top3Utils onClick");
        ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
        if (iLiveMatchService != null) {
            if (iLiveMatchService.xB0() != EnumC919170a1j.MATCH_TYPE_2V2 && iLiveMatchService.xB0() != EnumC919170a1j.MATCH_TYPE_1VN) {
                z = false;
            } else {
                z = true;
            }
            C495520Jby c495520Jby = new C495520Jby(MatchItemCardLynxUrlSetting.INSTANCE.getMatchFaq());
            w.LIZ.getClass();
            c495520Jby.LIZJ("enter_from_merge", w.LJIIIZ());
            c495520Jby.LIZJ("enter_method", w.LJIIL());
            String str = "1";
            c495520Jby.LIZJ("is_anchor_in_match_items_region", "1");
            c495520Jby.LIZJ("request_id", w.LJIJI());
            c495520Jby.LIZJ("video_id", w.LJJII());
            c495520Jby.LIZ(i, "scroll_to_index");
            if (!z) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c495520Jby.LIZJ("is_team_match", str);
            c495520Jby.LIZ(iLiveMatchService.xB0().getType(), "battle_type");
            c495520Jby.LIZJ("sub_match_type", iLiveMatchService.my());
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
        }
    }

    public static boolean LIZ(DataChannel dataChannel, AbstractC1126600fQI abstractC1126600fQI, Function1 function1) {
        boolean z;
        boolean z2 = false;
        if (!LiveMatchTop2Top3CardSettings.INSTANCE.getValue() || dataChannel == null) {
            return false;
        }
        if (abstractC1126600fQI != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            IInteractService iInteractService = C1128450fTH.LIZ;
            if (iInteractService.q9() != 0 && iInteractService.q9() != abstractC1126600fQI.LJI()) {
                C20441214yg.LJIIIZ("Top2Top3Utils", "The wrong gift for this type of match is selected.");
                return false;
            }
        }
        String str = C1130100fVw.LIZ.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift enter from, ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("Top2Top3Utils", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(str, "no2_booster_popup_click") && !Intrinsics.LJFF(str, "no3_booster_popup_click") && !Intrinsics.LJFF(str, "no2_booster_effect_notice") && !Intrinsics.LJFF(str, "no3_booster_effect_notice")) {
            return false;
        }
        if (!LIZIZ(dataChannel)) {
            C20441214yg.LJIIIZ("Top2Top3Utils", "User is not the number 2 or 3 contributor, or the top2 top3 power ups are not in effect.");
            return false;
        }
        if (function1 != null) {
            if (Intrinsics.LJFF(str, "no2_booster_popup_click") || Intrinsics.LJFF(str, "no2_booster_effect_notice")) {
                z2 = true;
            }
            function1.invoke(Boolean.valueOf(z2));
        }
        return true;
    }
}
