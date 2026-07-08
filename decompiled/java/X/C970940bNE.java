package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchIcyClashEducateUrl;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970940bNE {
    public static final C970940bNE LIZ = new C970940bNE();

    public static boolean LIZJ(Context context, AbstractC970950bNF abstractC970950bNF) {
        boolean z = false;
        try {
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(abstractC970950bNF.LJLLLLLL());
            c760370TsBLIZ.LJIJI(8, EnumC760350Ts9.DP);
            c760370TsBLIZ.LJIIIIZZ("bottom");
            int i = abstractC970950bNF.LLILZIL;
            if (i >= 0) {
                c760370TsBLIZ.LJJ(i, EnumC760350Ts9.DP);
            }
            int i2 = abstractC970950bNF.LLILZLL;
            if (i2 >= 0) {
                c760370TsBLIZ.LJIIIZ(i2, EnumC760350Ts9.DP);
            }
            c760370TsBLIZ.LJJII(abstractC970950bNF.LLILLL);
            Uri uriLIZ = c760370TsBLIZ.LIZ();
            IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
            if (iHybridContainerService != null) {
                iHybridContainerService.YC1(context, uriLIZ.toString(), new AwS594S0100000_15(abstractC970950bNF, 679));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Successfully opened Lynx page: ");
            sbLIZ.append(abstractC970950bNF.LJLLLLLL());
            C20441214yg.LIZIZ("LynxPageRouter", C2188811AlT.LIZIZ(sbLIZ));
            z = true;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to open Lynx page: ");
            sbLIZ2.append(abstractC970950bNF.LJLLLLLL());
            C20441214yg.LJFF("LynxPageRouter", C2188811AlT.LIZIZ(sbLIZ2), e);
            return z;
        }
    }

    public final void LIZLLL(Context context, EnumC970960bNG enumC970960bNG) {
        long ownerUserId;
        Object obj;
        String string;
        String str;
        String string2;
        HashMap map = new HashMap();
        IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            ownerUserId = roomLJJLI.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        C954460awe c954460aweLLILL = iMultiHostServiceLJII.LLILL(ownerUserId);
        EnumC970960bNG enumC970960bNG2 = EnumC970960bNG.AUTO_TRIGGER;
        String str2 = "1";
        if (enumC970960bNG == enumC970960bNG2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_randomly_trigger", obj);
        map.put("sub_match_type", C915980Zwa.LIZLLL().Ti2());
        if (!C915980Zwa.LIZLLL().J8()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str2);
        map.put("is_group_live", CardStruct.IStatusCode.DEFAULT);
        map.put("channel_id", String.valueOf(C915980Zwa.LIZLLL().getChannelId()));
        map.put("pk_id", String.valueOf(C915980Zwa.LIZLLL().getBattleId()));
        String str3 = "";
        if (c954460aweLLILL == null || (string = Long.valueOf(c954460aweLLILL.LJ).toString()) == null) {
            string = "";
        }
        map.put("anchor_id", string);
        if (c954460aweLLILL != null && (string2 = Long.valueOf(c954460aweLLILL.LJFF).toString()) != null) {
            str3 = string2;
        }
        map.put("room_id", str3);
        if (enumC970960bNG == enumC970960bNG2) {
            str = "room_notification";
        } else {
            str = "match_countdown";
        }
        map.put("request_from", str);
        String strLink = LiveMatchIcyClashEducateUrl.INSTANCE.link();
        int iLJIILLIIL = (int) (((double) C497740JfY.LJIILLIIL()) * 0.7d);
        int iLJJI = (int) C497740JfY.LJJI(C497740JfY.LJIIZILJ());
        getClass();
        LIZ(context, strLink, map, iLJIILLIIL, iLJJI);
    }

    public final void LJ(Context context, String str, String str2) {
        long ownerUserId;
        String string;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            ownerUserId = roomLJJLI.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("enter_from", str2).appendQueryParameter("sub_match_type", C915980Zwa.LJFF().my()).appendQueryParameter("channel_id", String.valueOf(C915980Zwa.LIZLLL().getChannelId())).appendQueryParameter("pk_id", String.valueOf(C915980Zwa.LIZLLL().getBattleId()));
        TeamUsersInfo teamUsersInfoDY0 = C915980Zwa.LIZLLL().dY0(ownerUserId);
        if (teamUsersInfoDY0 == null || (string = Long.valueOf(teamUsersInfoDY0.teamId).toString()) == null) {
            string = "";
        }
        String string2 = builderAppendQueryParameter.appendQueryParameter("team_id", string).appendQueryParameter("uid_list", C13LP.LJJLIIIJ(C915980Zwa.LJII().LJIJJ(), ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(155), 30)).build().toString();
        HashMap map = new HashMap();
        int iLJIILLIIL = (int) (((double) C497740JfY.LJIILLIIL()) * 0.7d);
        int iLJJI = (int) C497740JfY.LJJI(C497740JfY.LJIIZILJ());
        getClass();
        LIZ(context, string2, map, iLJIILLIIL, iLJJI);
    }

    public static void LIZ(Context context, String str, Map map, int i, int i2) {
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
        c760370TsBLIZ.LJIIIZ(i, enumC760350Ts9);
        c760370TsBLIZ.LJJ(i2, enumC760350Ts9);
        c760370TsBLIZ.LJIJI(8, enumC760350Ts9);
        c760370TsBLIZ.LJJII(map);
        c760370TsBLIZ.LJIIIIZZ("bottom");
        Uri uriLIZ = c760370TsBLIZ.LIZ();
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(context, uriLIZ.toString(), null);
        }
    }
}
