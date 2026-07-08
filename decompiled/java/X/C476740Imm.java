package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0Imm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476740Imm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Context context) {
        if (!UserService.getInstance().user().isLogin()) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "live_detail", bundle);
            C786410Ut5.LJJJI("action_type", "follow", bundle);
            C786410Ut5.LJJJI("source", "live", bundle);
            C786410Ut5.LJJJI("v1_source", "follow", bundle);
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C476760Imo c476760Imo = new C476760Imo();
            c476760Imo.LIZ = C1099410eiR.LIZIZ();
            c476760Imo.LIZIZ = C1099410eiR.LIZ();
            c476760Imo.LJ = "live_detail";
            c476760Imo.LJFF = "follow";
            c476760Imo.LIZLLL = "live";
            c476760Imo.LIZJ = -1;
            interfaceC500940JkiUser.LJIILL(context, new C501600Jlm(c476760Imo)).LIZIZ(new C476750Imn());
            return false;
        }
        return true;
    }

    public static void LIZ(User user, DataChannel dataChannel, boolean z) {
        boolean z2;
        Object obj;
        String str;
        int followStatus;
        String str2;
        String str3;
        String str4;
        HashMap map = new HashMap();
        String strLIZLLL = C466640IRq.LIZJ().LIZLLL();
        if (strLIZLLL.length() > 0) {
            map.put("enter_live_method", strLIZLLL);
        }
        w.LIZ.getClass();
        String strLJIILJJIL = w.LJIILJJIL();
        if (strLJIILJJIL.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str5 = "1";
        if (z2 && Intrinsics.LJFF(strLJIILJJIL, "click_push_live_cd_user")) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_subscribe", obj);
        map.put("request_page", "program_live_audience_c_anchor");
        C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS551S0100000_7(map, (HashMap<String, String>) 801));
        map.put("connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType());
        map.put("to_user_id", String.valueOf(user.getId()));
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        map.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        map.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        map.put("click_user_position", "program_live_multi_following_card");
        if (Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        map.put("room_orientation", str);
        FollowInfo followInfo = user.getFollowInfo();
        if (followInfo != null) {
            followStatus = (int) followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        map.put("follow_status", String.valueOf(followStatus));
        if (followStatus != 1 && followStatus != 3) {
            str2 = "single";
        } else {
            str2 = "mutual";
        }
        map.put("follow_type", str2);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        C500260Jjc.LJLLJ(Boolean.valueOf(iInteractService.Nt()), new AwS408S0200000_7(map, (HashMap<String, String>) iInteractService, (IInteractService) 73));
        String strXw0 = iInteractService.xw0();
        if (strXw0.length() > 0 && Intrinsics.LJFF(strXw0, "in_pk")) {
            str3 = "pk_phase";
        } else {
            str3 = LiveCenterMockToolSwitch.PUNISH;
        }
        map.put("match_status", str3);
        map.putAll(C467820IWe.LIZIZ());
        map.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(Long.valueOf(user.getId())));
        if (C924810aAp.LJ().LJJII <= 0) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest_connection", str5);
        map.put("guest_cnt", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount()));
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            map.put("server_heat_level", String.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ip(room.getId())));
            map.put("client_heat_level", String.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).v5(room.getId())));
        }
        C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS551S0100000_7(map, (Map<String, String>) 802));
        if (((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Al1()) {
            ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).dH(map);
        }
        if (z) {
            str4 = "livesdk_follow";
        } else {
            str4 = "livesdk_unfollow";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str4);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILLIIL(new C474130IiZ("live", user.getId()));
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIZ(dataChannel);
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_follow"));
        c474500IjALIZ.LJIIJJI("live_interact");
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LIZ();
    }

    public static C11NZ LIZJ(User user, DataChannel dataChannel, boolean z) {
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room == null) {
            return C11IR.LL;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (z) {
            C1099420eiS c1099420eiS = new C1099420eiS();
            c1099420eiS.LIZIZ(user.getId());
            c1099420eiS.LJ(room.getId());
            c1099420eiS.getClass();
            return interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS));
        }
        C485350J1p c485350J1p = new C485350J1p();
        c485350J1p.LIZIZ(user.getId());
        c485350J1p.LJ(room.getId());
        c485350J1p.getClass();
        return interfaceC500940JkiUser.LJI(new C1812120xFy(c485350J1p));
    }
}
