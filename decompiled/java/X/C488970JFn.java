package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestTrackingSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.MemberInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0JFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488970JFn {
    public final C488980JFo LIZ;
    public final Map<String, String> LIZIZ = new LinkedHashMap();
    public final Map<String, String> LIZJ = new LinkedHashMap();

    public C488970JFn(C488980JFo c488980JFo) {
        this.LIZ = c488980JFo;
    }

    public final Map<String, Object> LIZ(boolean z) {
        return C2097608Jq.LJIIIIZZ(new Pair("wanna_follow", Boolean.valueOf(z)), new Pair("user_id", Long.valueOf(this.LIZ.LJ)), new Pair("anchor_id", Long.valueOf(this.LIZ.LIZLLL.getOwner().getId())), new Pair("room_id", Long.valueOf(this.LIZ.LIZLLL.getId())), new Pair("need_to_post_event_to_host", Boolean.valueOf(Intrinsics.LJFF(this.LIZ.LJFF.clickModule, "live_reflow_system_prompt"))));
    }

    public final C474130IiZ LIZIZ(User user) {
        OfficialChannelInfo officialChannelInfo;
        long id;
        User user2;
        C488980JFo c488980JFo = this.LIZ;
        Room room = c488980JFo.LIZLLL;
        C474130IiZ c474130IiZ = new C474130IiZ("", c488980JFo.LJ);
        String str = c488980JFo.LJFF.interactLogLabel;
        if (str != null && (!TextUtils.isEmpty(str))) {
            c474130IiZ.LIZ = str;
        }
        c474130IiZ.LIZ = LIZLLL(user);
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService != null && iMicRoomService.n42(room) && (officialChannelInfo = room.officialChannelInfo) != null) {
            User user3 = officialChannelInfo.channelUser;
            if (user3 != null && user3.getId() == user.getId()) {
                if (iMicRoomService.tp1()) {
                    c474130IiZ.LIZ = "carousel_audience_c_official_id";
                } else {
                    c474130IiZ.LIZ = "loyal_audience_c_official_id";
                }
            } else if (user.getId() == room.getOwnerUserId()) {
                if (iMicRoomService.tp1()) {
                    c474130IiZ.LIZ = "carousel_audience_c_anchor";
                } else {
                    c474130IiZ.LIZ = "loyal_audience_c_anchor";
                }
            }
            OfficialChannelInfo officialChannelInfo2 = room.officialChannelInfo;
            if (officialChannelInfo2 != null && (user2 = officialChannelInfo2.channelUser) != null) {
                id = user2.getId();
            } else {
                id = 0;
            }
            c474130IiZ.LIZIZ = id;
        }
        return c474130IiZ;
    }

    public final String LIZLLL(User user) {
        char c;
        String strLIZIZ;
        List<MemberInfo> list;
        String strLIZIZ2;
        C488980JFo c488980JFo = this.LIZ;
        C495950Jcf c495950Jcf = c488980JFo.LIZIZ;
        boolean z = c495950Jcf.LJI;
        boolean z2 = false;
        if (c495950Jcf.LJII) {
            c = 0;
        } else if (c495950Jcf.LJIIIIZZ) {
            c = 2;
        } else {
            c = 1;
        }
        boolean z3 = c495950Jcf.LJIIIIZZ;
        if (z) {
            if (z3) {
                strLIZIZ2 = "live_anchor_c_anchor";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("live_anchor_c_");
                sbLIZ.append(LJ(user));
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (TextUtils.isEmpty(strLIZIZ2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("live_anchor_c_");
                sbLIZ2.append(LJ(user));
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            return strLIZIZ2;
        }
        UserProfileEvent userProfileEvent = c488980JFo.LJFF;
        if (!userProfileEvent.isFromProgrammedLiveMenu && !userProfileEvent.isFromProgrammedLiveFollowCard) {
            if (((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1()) {
                if (c == 0) {
                    return "program_live_audience_c_official_id";
                }
                return "program_live_audience_c_audience";
            }
            if (c != 1) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("live_");
                sbLIZ3.append(LJ(UserService.getInstance().user().LJIJJLI()));
                sbLIZ3.append("_c_");
                sbLIZ3.append(LJ(user));
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
            if (z3) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("live_");
                sbLIZ4.append(LJ(UserService.getInstance().user().LJIJJLI()));
                sbLIZ4.append("_c_anchor");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("live_");
                sbLIZ5.append(LJ(UserService.getInstance().user().LJIJJLI()));
                sbLIZ5.append("_c_");
                sbLIZ5.append(LJ(user));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            }
            C00JH c00jh = (C00JH) this.LIZ.LIZ.gg0(GroupLiveMemberList.class);
            if (c00jh != null && (list = c00jh.LIZ) != null && (!list.isEmpty())) {
                Iterator<MemberInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (this.LIZ.LJ == it2.next().userId) {
                        z2 = true;
                    }
                }
                if (z2) {
                    strLIZIZ = "live_audience_c_group_live_member";
                }
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                return strLIZIZ;
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("live_");
            sbLIZ6.append(LJ(UserService.getInstance().user().LJIJJLI()));
            sbLIZ6.append("_c_");
            sbLIZ6.append(LJ(user));
            return C2188811AlT.LIZIZ(sbLIZ6);
        }
        if (c == 0) {
            return "program_live_audience_c_official_id";
        }
        return "program_live_audience_c_anchor";
    }

    public final String LJ(User user) {
        IGameLinkMicService iGameLinkMicService;
        C0JG7 c0jg7Yq;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null) {
            if (CohostWithGuestTrackingSetting.INSTANCE.getValue().isFollowUserRoleEnabled && (c0jg7Yq = iInteractService.yq(user)) != null) {
                int i = C0JG6.LIZ[c0jg7Yq.ordinal()];
                if (i == 1 || i == 2) {
                    return "anchor";
                }
                if (i != 3) {
                    return "audience";
                }
                return "guest";
            }
            int i2 = C0JG6.LIZ[iInteractService.ND(user).ordinal()];
            if (i2 == 1) {
                return "anchor";
            }
            if (i2 != 3) {
                Room room = this.LIZ.LIZLLL;
                if (room.getStreamType() == LiveMode.LIVE_STUDIO && (iGameLinkMicService = (IGameLinkMicService) C1161920gLG.LIZJ(IGameLinkMicService.class)) != null) {
                    Integer numValueOf = Integer.valueOf(iGameLinkMicService.Lo0(user, room.getIdStr()));
                    if (numValueOf.intValue() == 2) {
                        numValueOf.intValue();
                    }
                }
            }
            return "guest";
        }
        return "audience";
    }

    public final Map LIZJ(long j, User user) {
        char c;
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        Object obj4;
        String str2;
        Object obj5;
        Long l;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        C488980JFo c488980JFo = this.LIZ;
        Room room = c488980JFo.LIZLLL;
        C495950Jcf c495950Jcf = c488980JFo.LIZIZ;
        boolean z = c495950Jcf.LJI;
        if (c495950Jcf.LJII) {
            c = 0;
        } else if (c495950Jcf.LJIIIIZZ) {
            c = 2;
        } else {
            c = 1;
        }
        boolean z2 = c495950Jcf.LJIIIIZZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z2) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).k30(linkedHashMap);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal.gg0(C930760aKQ.class);
        Boolean bool = Boolean.TRUE;
        String str3 = "1";
        if (Intrinsics.LJFF(objGg0, bool)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_group_live", obj);
        if (Intrinsics.LJFF(dataChannelGlobal.gg0(C1148140fz2.class), bool)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_group_live_icy", obj2);
        linkedHashMap.put("growth_deepevent", "1");
        long ownerUserId = room.getOwnerUserId();
        long jLLJJJIL = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().LLJJJIL();
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
            if (user.getId() == room.getOwnerUserId()) {
                linkedHashMap.put("anchor_type", "current");
            }
            if (z2) {
                linkedHashMap.put("anchor_type", "opposite");
            }
            linkedHashMap.put("channel_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().getChannelId()));
            List<Long> listB70 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70();
            if (listB70.size() > 2) {
                obj9 = "1";
            } else {
                obj9 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_multi", obj9);
            if (listB70.size() <= 2) {
                ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).k30(linkedHashMap);
            }
            linkedHashMap.put("connection_inviter_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJLLLLLL()));
            linkedHashMap.put("connection_invitee_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJJI()));
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
                linkedHashMap.put("pk_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()));
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).n12()) {
                    linkedHashMap.put("pk_inviter_id", String.valueOf(ownerUserId));
                    linkedHashMap.put("pk_invitee_id", String.valueOf(jLLJJJIL));
                } else {
                    linkedHashMap.put("pk_invitee_id", String.valueOf(ownerUserId));
                    linkedHashMap.put("pk_inviter_id", String.valueOf(jLLJJJIL));
                }
            }
        }
        ILiveCompetitionExternalService iLiveCompetitionExternalService = (ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
        if (iLiveCompetitionExternalService.Al1()) {
            iLiveCompetitionExternalService.dH(linkedHashMap);
        }
        if (!z) {
            linkedHashMap.put("sub_match_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ti2());
            if (((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).v91()) {
                obj6 = "1";
            } else {
                obj6 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_show_time", obj6);
            boolean zL6 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).L6();
            long jFf = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ff();
            if (zL6) {
                obj7 = "1";
            } else {
                obj7 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enlarge_mode", obj7);
            if (user.getId() == jFf) {
                obj8 = "1";
            } else {
                obj8 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_to_enlarge_user", obj8);
        }
        String strLIZLLL = C466640IRq.LIZJ().LIZLLL();
        if (!TextUtils.isEmpty(strLIZLLL)) {
            linkedHashMap.put("enter_live_method", strLIZLLL);
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.LIZJ).entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue());
        }
        w.LIZ.getClass();
        String strLJIILJJIL = w.LJIILJJIL();
        if (!TextUtils.isEmpty(strLJIILJJIL) && Intrinsics.LJFF("click_push_live_cd_user", strLJIILJJIL)) {
            linkedHashMap.put("is_subscribe", "1");
        } else {
            linkedHashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (this.LIZ.LIZJ) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        linkedHashMap.put("room_orientation", str);
        linkedHashMap.put("connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType());
        if (Intrinsics.LJFF(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "manual_pk")) {
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
                linkedHashMap.put("match_status", "pk_phase");
            } else {
                linkedHashMap.put("match_status", LiveCenterMockToolSwitch.PUNISH);
            }
        }
        linkedHashMap.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        boolean zLJFF = Intrinsics.LJFF(w.LJIIL(), "portal");
        if (zLJFF) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_portal_user", obj3);
        if (zLJFF) {
            linkedHashMap.put("portal_id", String.valueOf(w.LJIJ()));
        }
        if (C924810aAp.LJ().LJJII > 0) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_guest_connection", obj4);
        String str4 = this.LIZ.LJFF.mEventPage;
        if (TextUtils.isEmpty(str4)) {
            if (!z) {
                str4 = "live_detail";
            } else {
                str4 = "live_take_detail";
            }
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().LIZ()) {
            if (!z) {
                if (c == 1) {
                    l = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().LLJJL().get(Long.valueOf(room.getOwnerUserId()));
                } else {
                    l = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().LLJJL().get(Long.valueOf(user.getId()));
                }
                if (l != null) {
                    linkedHashMap.put("initial_follow_status", l.toString());
                }
            } else {
                linkedHashMap.put("initial_follow_status", String.valueOf(j));
            }
        }
        if (Intrinsics.LJFF(this.LIZ.LJFF.clickModule, "live_reflow_system_prompt")) {
            linkedHashMap.put("follow_page_source", "live_profile_card");
        }
        linkedHashMap.put("is_topic_connection", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("topic_id", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("click_user_position", "profile_card");
        if (j != 3) {
            str2 = "follow";
        } else {
            str2 = "follow_back";
        }
        linkedHashMap.put("follow_icon_type", str2);
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        if (iLiveHostCrossRoomEventHelper != null) {
            linkedHashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
            linkedHashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        }
        linkedHashMap.putAll(C467820IWe.LIZIZ());
        if (Intrinsics.LJFF(this.LIZ.LJFF.mSource, "star_comment")) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_from_star_comment", obj5);
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Yz("follow", linkedHashMap);
        linkedHashMap.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(Long.valueOf(user.getId())));
        linkedHashMap.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
        linkedHashMap.putAll(room.getMultiStreamLogParams());
        linkedHashMap.putAll(C475750IlB.LIZ());
        linkedHashMap.put("guest_cnt", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount()));
        if (iLiveCompetitionExternalService.Al1()) {
            iLiveCompetitionExternalService.dH(linkedHashMap);
        }
        if (Intrinsics.LJFF("guessing_rank", this.LIZ.LJFF.clickModule)) {
            linkedHashMap.put("enter_method", "guessing_rank");
            linkedHashMap.put("enter_from_merge", "live_detail");
        }
        if (z) {
            if (!user.isAnchorMarked) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("click_is_marked_user", str3);
        }
        linkedHashMap.put("event_belong", "live_interact");
        linkedHashMap.put("event_page", str4);
        linkedHashMap.put("guest_request_id", room.getGuestRequestId());
        linkedHashMap.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).sR(Long.valueOf(user.getId()), false));
        return linkedHashMap;
    }

    public final void LJI(User user, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_unblock_popup_click");
        c474500IjALIZ.LJIJJLI(this.LIZ.LIZ);
        c474500IjALIZ.LJJII(Long.valueOf(user.getId()), "to_user_id");
        c474500IjALIZ.LJJII(LJ(UserService.getInstance().user().LJIJJLI()), "user_type");
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LJJII("user_profile", "enter_from");
        c474500IjALIZ.LJJII(C0KYR.LIZJ(this.LIZ.LIZ), "admin_type");
        c474500IjALIZ.LIZ();
    }

    public final void LJFF(User user, boolean z, long j, long j2) {
        String str;
        String str2 = "follow";
        if (z) {
            str = "follow";
        } else {
            str = "unfollow";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIL((ShareFromInfo) this.LIZ.LIZ.gg0(C752130Tet.class));
        c474500IjALIZ.LJIILLIIL(LIZIZ(user));
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        c474500IjALIZ.LJJIIZI(LIZJ(j, user));
        c474500IjALIZ.LJJII(Long.valueOf(j2), "follow_status");
        c474500IjALIZ.LIZ();
        if (Intrinsics.LJFF(this.LIZ.LJFF.clickModule, "live_reflow_system_prompt")) {
            IHostShare iHostShare = (IHostShare) C1161920gLG.LIZJ(IHostShare.class);
            if (iHostShare.isSharer(this.LIZ.LJFF.userId).booleanValue()) {
                if (!z) {
                    str2 = "follow_cancel";
                }
                iHostShare.postFollowRecommendEvent("share_link", "live_profile_card_sharer", str2);
            } else {
                if (!z) {
                    str2 = "follow_cancel";
                }
                iHostShare.postFollowRecommendEvent("share_link", "live_profile_card_receiver", str2);
            }
        }
    }
}
