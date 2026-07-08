package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0Jjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500300Jjg {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1() ? "audience" : ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0() ? "manual_pk" : ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9() ? "anchor" : "normal";
    }

    public static void LIZIZ(long j, DataChannel dataChannel, String str) {
        String str2;
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_followed_notification_show");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "to_user_type");
        boolean zJ12 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (zJ12) {
            List<Long> listB70 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70();
            if (listB70.size() > 2) {
                str3 = "1";
            }
            c474500IjALIZ.LJJII(str3, "is_multi");
            c474500IjALIZ.LJJII(Integer.valueOf(listB70.size()), "current_connection_cnts");
            c474500IjALIZ.LJJII(listB70.toString(), "uid_list");
        } else {
            String[] strArr = {str, String.valueOf(UserService.getInstance().user().getCurrentUserId())};
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_multi");
            c474500IjALIZ.LJJII("2", "current_connection_cnts");
            c474500IjALIZ.LJJII(strArr.toString(), "uid_list");
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        Long lValueOf2 = null;
        if (roomLJJLIIIIJ != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)), "room_id");
        c474500IjALIZ.LJJII(C500260Jjc.LJJJJJL(dataChannel), "live_type");
        Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ2 != null) {
            lValueOf2 = Long.valueOf(roomLJJLIIIIJ2.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf2), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()), "channel_id");
        c474500IjALIZ.LJJII(String.valueOf(C915980Zwa.LJI().LJIIJ().getBattleId()), "pk_id");
        c474500IjALIZ.LJJII(LIZ(), "connection_type");
        c474500IjALIZ.LJJII(C915980Zwa.LIZLLL().oE2(), "core_connection_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "follow_status");
        c474500IjALIZ.LJJII(str, "from_user_id");
        c474500IjALIZ.LJJII(LIZ(), "from_user_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(DataChannel dataChannel, String str, boolean z) {
        String str2;
        Long lValueOf;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow_guide_show");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12()) {
            List<Long> listB70 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70();
            if (listB70.size() > 2) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str3, "is_multi");
            c474500IjALIZ.LJJII(Integer.valueOf(listB70.size()), "current_connection_cnts");
            c474500IjALIZ.LJJII(listB70.toString(), "uid_list");
        }
        c474500IjALIZ.LJJII(str, "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)), "room_id");
        c474500IjALIZ.LJJII(C500260Jjc.LJJJJJL(dataChannel), "live_type");
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()), "channel_id");
        c474500IjALIZ.LJJII(String.valueOf(C915980Zwa.LJI().LJIIJ().getBattleId()), "pk_id");
        c474500IjALIZ.LJJII(LIZ(), "connection_type");
        c474500IjALIZ.LJJII(C915980Zwa.LIZLLL().oE2(), "core_connection_type");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "follow_status");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZLLL(C955540ayO c955540ayO, long j, boolean z, long j2, Room room, DataChannel dataChannel, String str, Long l, String str2) {
        String str3;
        Object obj;
        String str4;
        Object obj2;
        String str5;
        String str6;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow");
        c474500IjALIZ.LJJII(Long.valueOf(j), "channel_id");
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
            c474500IjALIZ.LJJII(Long.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()), "pk_id");
            if (z) {
                if (C973890bRz.LIZ.LJI) {
                    c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "pk_inviter_id");
                    c474500IjALIZ.LJJII(Long.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()), "pk_invitee_id");
                } else {
                    c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "pk_invitee_id");
                    c474500IjALIZ.LJJII(Long.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()), "pk_inviter_id");
                }
            }
        }
        boolean zV91 = ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).v91();
        if (zV91) {
            c474500IjALIZ.LJJII(Long.valueOf(((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).lr()), "pk_id");
        }
        if (((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Al1()) {
            ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Wz0(c474500IjALIZ);
        }
        String str7 = "1";
        if (!z) {
            c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ti2(), "sub_match_type");
            if (zV91) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj4, "is_show_time");
            if (C915980Zwa.LJII().L6()) {
                obj5 = "1";
            } else {
                obj5 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj5, "is_enlarge_mode");
            if (C915980Zwa.LJII().ff() == j2) {
                obj6 = "1";
            } else {
                obj6 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj6, "is_to_enlarge_user");
        } else {
            c474500IjALIZ.LJJII(Long.valueOf(C915980Zwa.LJI().LIZ().LJLLLLLL()), "connection_inviter_id");
            c474500IjALIZ.LJJII(Long.valueOf(C915980Zwa.LJI().LIZ().LJJI()), "connection_invitee_id");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ip(room.getId())), "server_heat_level");
        c474500IjALIZ.LJJII(Long.valueOf(room.liveSubOnly), "is_sub_only_live");
        if (room.getOwner() != null && room.getOwner().isAnchorHasSubQualification()) {
            if (room.getOwner().isSubscribed()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str3 = "-1";
        }
        c474500IjALIZ.LJJII(str3, "is_subscription");
        c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).v5(room.getId())), "client_heat_level");
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12()) {
            List<Long> listB70 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70();
            if (listB70.size() > 2) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj3, "is_multi");
            c474500IjALIZ.LJJII(String.valueOf(listB70.size()), "current_connection_cnts");
            c474500IjALIZ.LJJII(listB70.toString(), "uid_list");
        } else {
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_multi");
            Object[] objArr = {String.valueOf(UserService.getInstance().user().getCurrentUserId()), Long.valueOf(j2)};
            c474500IjALIZ.LJJII("2", "current_connection_cnts");
            c474500IjALIZ.LJJII(objArr.toString(), "uid_list");
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if (listLLILZLL.size() > 2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_multi");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_topic_connection");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "topic_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Yz("follow", linkedHashMap);
        if (listLLILZLL.size() <= 2) {
            C955410ayB.LIZLLL(linkedHashMap, c955540ayO, true);
            c474500IjALIZ.LJJIIZI(linkedHashMap);
        }
        c474500IjALIZ.LJJII(C915980Zwa.LIZLLL().oE2(), "core_connection_type");
        String connectionType = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType();
        if (Intrinsics.LJFF(connectionType, "manual_pk")) {
            if (C973890bRz.LIZ.LJLIL() == EnumC964170bCJ.PUNISH_START) {
                str6 = LiveCenterMockToolSwitch.PUNISH;
            } else {
                str6 = "pk_phase";
            }
            c474500IjALIZ.LJJII(str6, "match_status");
            c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        }
        c474500IjALIZ.LJJII("opposite", "anchor_type");
        if (C497740JfY.LJIL()) {
            str4 = "portrait";
        } else {
            str4 = "landscape";
        }
        c474500IjALIZ.LJJII(str4, "room_orientation");
        w.LIZ.getClass();
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "is_portal_user");
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            c474500IjALIZ.LJJII(Long.valueOf(w.LJIJ()), "portal_id");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIZ(dataChannel);
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_follow"));
        if (C123100dR.LIZ(str2)) {
            c474500IjALIZ.LJJII(str2, "request_page");
        } else {
            if (z) {
                str5 = "live_anchor_c_anchor";
            } else {
                str5 = "live_audience_c_anchor";
            }
            c474500IjALIZ.LJJII(str5, "request_page");
        }
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
        c474500IjALIZ.LJJII(room.getRequestId(), "request_id");
        c474500IjALIZ.LJJII(room.getLog_pb(), "log_pb");
        c474500IjALIZ.LJJII(str, "click_user_position");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "to_user_id");
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(connectionType, "connection_type");
        c474500IjALIZ.LJJII(String.valueOf(l), "initial_follow_status");
        if (!C917810ZzX.LJIILIIL() || C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()) <= 0) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str7, "is_guest_connection");
        c474500IjALIZ.LJJIIZI(C915980Zwa.LIZLLL().sR(Long.valueOf(j2), false));
        c474500IjALIZ.LIZ();
    }
}
