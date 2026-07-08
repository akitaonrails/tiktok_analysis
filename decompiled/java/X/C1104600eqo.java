package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* JADX INFO: renamed from: X.0eqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104600eqo {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        return ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1() ? "program_live" : (C1161920gLG.LIZJ(IMicRoomService.class) == null || !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1()) ? C1161920gLG.LIZJ(IInteractService.class) != null ? ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2() : "normal_video_live" : "video_anchor_order";
    }

    public static void LIZIZ(DataChannel dataChannel) {
        int i;
        int i2;
        String str;
        Room room;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Room room2;
        HashMap map = new HashMap(5);
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            i = room2.cppVersion;
        } else {
            i = 0;
        }
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
            i2 = anchorLevelPermission.treasureBox;
        } else {
            i2 = 1;
        }
        Room room3 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room3 != null) {
            String idStr = room3.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room3.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room3.getOwnerUserId()));
        }
        map.put(Scene.SCENE_SERVICE, LIZ());
        map.put("online_watch_users", String.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()));
        map.put("cpp_version", String.valueOf(i));
        map.put("enable_cpp", String.valueOf(i2));
        if (C0UIM.LIZ()) {
            InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
            if (interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) {
                str = "more_interaction";
            } else {
                str = "interaction";
            }
        } else {
            str = "more";
        }
        map.put("create_entrance", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_create_entrance_click");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(DataChannel dataChannel) {
        String str;
        HashMap map = new HashMap(5);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        map.put(Scene.SCENE_SERVICE, LIZ());
        map.put("online_watch_users", String.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()));
        if (C0UIM.LIZ()) {
            InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
            if (interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) {
                str = "more_interaction";
            } else {
                str = "interaction";
            }
        } else {
            str = "more";
        }
        map.put("create_entrance", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_create_entrance_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(int i, String str, boolean z) {
        String str2;
        String string;
        FollowInfo followInfo;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap();
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str2);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (string = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
                string = "";
            }
            map.put("follow_status", string);
        }
        map.put("goody_bag_id", str);
        map.put("open_at", String.valueOf(i));
        map.put("timestamp", String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_prepare_open");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_goody_bag_prepare_open", map);
    }

    public static void LJI(Integer num, boolean z, GetRoomGoodyBagResponse.ResponseData responseData) {
        Object obj;
        String string;
        String string2;
        FollowInfo followInfo;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap();
        if (num != null) {
            map.put("error_code", String.valueOf(num.intValue()));
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        String str = "1";
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", obj);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String str3 = "";
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (string2 = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
                string2 = "";
            }
            map.put("follow_status", string2);
        }
        if (responseData != null) {
            String str4 = responseData.goodyBagId;
            if (str4 != null) {
                str3 = str4;
            }
            map.put("goody_bag_id", str3);
            if (!responseData.joined) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("joined", str);
            GoodyBagBaseInfo goodyBagBaseInfo = responseData.baseInfo;
            if (goodyBagBaseInfo != null && (string = Integer.valueOf(goodyBagBaseInfo.biz).toString()) != null) {
                str2 = string;
            }
            map.put("goody_bag_type", str2);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_room_response");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_goody_bag_room_response", 0.1d)) {
            C1CC2.LJII(0, "ttlive_goody_bag_room_response", map);
        }
    }

    public static void LIZLLL(String str, int i, String str2, boolean z, boolean z2) {
        String str3;
        String string;
        FollowInfo followInfo;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap();
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        map.put("is_over_time", String.valueOf(z2));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str3);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (string = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
                string = "";
            }
            map.put("follow_status", string);
        }
        map.put("goody_bag_id", str);
        map.put("open_at", String.valueOf(i));
        map.put("timestamp", String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        map.put("data_from", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_open_monitor");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_goody_bag_open_monitor", map);
    }

    public static void LJII(Integer num, ArrayList arrayList, ArrayList arrayList2, String str, String str2, long j) {
        C20441214yg.LIZIZ("GoodyBagLogHelper", "start posting response revenue permission event");
        HashMap map = new HashMap(5);
        if (num != null) {
            map.put("error_code", String.valueOf(num.intValue()));
        }
        map.put("duration_from_request", String.valueOf(System.currentTimeMillis() - j));
        map.put("envelope_permission", arrayList.toString());
        map.put("goody_bag_permission", arrayList2.toString());
        map.put("uuid", str);
        if (str2 == null) {
            str2 = "";
        }
        map.put("log_id", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_revenue_interact_permission_response");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJIJL();
        }
        C1CC2.LJII(0, "ttlive_revenue_interact_permission_response", map);
        C20441214yg.LIZIZ("GoodyBagLogHelper", "end of posting response revenue permission event");
    }

    public static void LJFF(Integer num, boolean z, String str, GetGoodyBagLotteryResponse.ResponseData responseData, int i, long j, int i2, String str2, String str3) {
        Object obj;
        int i3;
        FollowInfo followInfo;
        String string;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap();
        if (num != null) {
            map.put("error_code", String.valueOf(num.intValue()));
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        map.put("log_id", str3);
        if (str2 != null) {
            map.put("error_msg", str2);
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        String str5 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", obj);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null && (string = Long.valueOf(followInfo.getFollowStatus()).toString()) != null) {
                str4 = string;
            }
            map.put("follow_status", str4);
        }
        map.put("goody_bag_id", str);
        if (responseData == null || !responseData.win) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("win", str5);
        if (responseData != null) {
            i3 = responseData.coins;
        } else {
            i3 = 0;
        }
        map.put("coins", String.valueOf(i3));
        map.put("open_at", String.valueOf(i));
        map.put("time_diff", String.valueOf(C963140bAe.LIZLLL));
        map.put("dur_from_request", String.valueOf(System.currentTimeMillis() - j));
        map.put("dur_from_open_at", String.valueOf(C963140bAe.LIZIZ() - (((long) i) * 1000)));
        map.put("retry_count", String.valueOf(i2));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_lottery_response");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_goody_bag_lottery_response", map);
    }

    public static void LJIIIIZZ(Integer num, boolean z, String str, int i, int i2, long j, int i3, String str2, String str3) {
        String str4;
        FollowInfo followInfo;
        String string;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap();
        if (num != null) {
            map.put("error_code", String.valueOf(num.intValue()));
        }
        String str5 = "";
        if (str3 == null) {
            str3 = "";
        }
        map.put("log_id", str3);
        if (str2 != null) {
            map.put("error_msg", str2);
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str4);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null && (string = Long.valueOf(followInfo.getFollowStatus()).toString()) != null) {
                str5 = string;
            }
            map.put("follow_status", str5);
        }
        map.put("goody_bag_id", str);
        map.put("request_platform", "client");
        map.put("winners_count", String.valueOf(i));
        map.put("open_at", String.valueOf(i2));
        map.put("time_diff", String.valueOf(C963140bAe.LIZLLL));
        map.put("dur_from_request", String.valueOf(System.currentTimeMillis() - j));
        map.put("dur_from_open_at", String.valueOf(C963140bAe.LIZIZ() - (((long) i2) * 1000)));
        map.put("retry_count", String.valueOf(i3));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_winner_list_response");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_goody_bag_winner_list_response", map);
    }
}
