package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorReporterSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixPlaybookDataChannelNullSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3DirectJoinOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0aC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925600aC6 {
    public static String LIZ = null;
    public static String LIZIZ = "in_liveroom";
    public static final Map<Long, Map<String, Object>> LIZJ = new HashMap();

    public static String LJI(int i) {
        return i == 0 ? "multi_live_apply" : "multi_live_accept";
    }

    public static long LIZJ(DataChannel dataChannel) {
        IInteractService iInteractService;
        C0UTJ c0utjPl1;
        ActivePlaybook activePlaybookLIZIZ;
        Playbook playbook;
        if ((LinkCoreModelKt.currentUserIsAnchor() || C500260Jjc.LJJIL()) && (iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class)) != null) {
            if (BugFixPlaybookDataChannelNullSetting.INSTANCE.enable()) {
                c0utjPl1 = iInteractService.Pl1(dataChannel);
            } else {
                c0utjPl1 = iInteractService.Pl1(null);
            }
            if (c0utjPl1 != null && (activePlaybookLIZIZ = c0utjPl1.LIZIZ()) != null && (playbook = activePlaybookLIZIZ.playbook) != null) {
                return playbook.playbookId;
            }
            return 0L;
        }
        return 0L;
    }

    public static int LIZLLL(long j) {
        int size;
        List<LinkUser> listLIZLLL;
        List<LinkUser> listLIZLLL2;
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2LJIIIIZZ = C915980Zwa.LJIIIIZZ();
        if (!C917810ZzX.LJIILIIL()) {
            return 0;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2LJIIIIZZ.LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL2 = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            ArrayList arrayList = new ArrayList();
            for (LinkUser linkUser : listLIZLLL2) {
                LinkUser linkUser2 = linkUser;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("optBothLinkedGuestCount: user id: ");
                sbLIZ.append(linkUser2.userId);
                sbLIZ.append(", user Type: ");
                sbLIZ.append(linkUser2.linkUserType);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (linkUser2.linkUserType == 1) {
                    arrayList.add(linkUser);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null && (listLIZLLL = interfaceC954180awCLLJLL2.LIZLLL()) != null) {
            Iterator<LinkUser> it2 = listLIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LinkUser next = it2.next();
                Long l = next.userId;
                if (l != null && l.longValue() == j) {
                    if (next != null) {
                        return size;
                    }
                }
            }
        }
        return size + 1;
    }

    public static int LJ(long j) {
        return C921180a4y.LJIILIIL(C915980Zwa.LJIIIIZZ(), j);
    }

    public static String LJFF(Long l) {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        String str = C978360bZC.LJI.get(l);
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void LJIIIIZZ(String str) {
        HashMap map = new HashMap();
        map.put("enter_from", str);
        if (!str.equals("connecton_icon") && !str.equals("random_match_countdown")) {
            map.put("notice_type", "normal_notice");
        }
        map.put("connection_type", "anchor");
        map.put("to_anchor_id", Long.toString(C915980Zwa.LJI().LIZ().LJJLIIIIJ()));
        C917520Zz4.LIZ(map);
        C927870aFl.LIZ(C915980Zwa.LJI().LIZ().LLILLL(), map);
        LJJIJL("guest_connection_anchor", "show", map);
    }

    public static void LJIIZILJ(DataChannel dataChannel) {
        HashMap map = new HashMap();
        map.put("connection_type", "anchor");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("connection_click");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LJIJI(EnumC918970a1P enumC918970a1P) {
        String str;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            enumC918970a1P = C927600aFK.LJII();
        }
        boolean zBooleanValue = InterfaceC1104970erP.I2.LIZIZ().booleanValue();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_status");
        if (zBooleanValue) {
            str = "open";
        } else {
            str = "close";
        }
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(C917520Zz4.LJIIL(), "live_type");
        if (C917520Zz4.LJIIJ() == LiveMode.LIVE_VOICE) {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        } else {
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
        }
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
    }

    public static void LJIJJLI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logInvitationType type:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LinkInRoomLogHelper", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = str;
    }

    public static <K, V> JSONObject LJJIIJ(Map<K, V> map) {
        if (map != null && !map.isEmpty()) {
            HashMap map2 = null;
            for (Map.Entry<K, V> entry : map.entrySet()) {
                K key = entry.getKey();
                V value = entry.getValue();
                if (key instanceof String) {
                    break;
                }
                if (map2 == null) {
                    map2 = new HashMap();
                }
                map2.put(key.toString(), value);
            }
            if (map2 != null) {
                map = map2;
            }
            return new JSONObject(map);
        }
        return new JSONObject();
    }

    public static void LJJIIZ(int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_appeal_popup_window_show");
        c474500IjALIZ.LJJII(LJI(i), "request_page");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIIJI(int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_birth_popup_window_click");
        c474500IjALIZ.LJJII(LJI(i), "request_page");
        c474500IjALIZ.LJJII("cancel", "click_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIL(int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_birth_popup_window_show");
        c474500IjALIZ.LJJII(LJI(i), "request_page");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJJIL(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_name", "ttlive_multilive_multi_live_start");
            jSONObject.put("way", str);
            C20441214yg.LJIIIZ("MultiLiveStart", C786410Ut5.J3(jSONObject));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendMultiLiveStartALog failed:");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("sendMultiLiveStartALog", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZ(C955540ayO c955540ayO, Map<String, String> map) {
        boolean z;
        String rankName;
        C955540ayO c955540ayO2;
        C955540ayO c955540ayO3 = C955540ayO.LJIILL;
        int i = 0;
        if (c955540ayO != c955540ayO3 && c955540ayO != C955540ayO.LJIILLIIL && c955540ayO != C955540ayO.LJIIZILJ && c955540ayO != C955540ayO.LJIJ && c955540ayO != C955540ayO.LJIJI && c955540ayO != (c955540ayO2 = C955540ayO.LJIJJ) && c955540ayO != C955540ayO.LJJ && c955540ayO != C955540ayO.LJJI && c955540ayO != C955540ayO.LJJIFFI && c955540ayO != c955540ayO2 && c955540ayO != C955540ayO.LJJII && c955540ayO != C955540ayO.LJJIIJZLJL && c955540ayO != C955540ayO.LJJIJIIJI) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            HashMap map2 = (HashMap) map;
            map2.put("is_ranking_opposite_anchor", "1");
            if (Intrinsics.LJFF(c955540ayO, c955540ayO3)) {
                rankName = EnumC955630ayX.WEEKLY_RANK.getRankName();
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJI)) {
                rankName = EnumC955630ayX.DAILY_RANK.getRankName();
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJJ)) {
                rankName = EnumC955630ayX.DAILY_RANK_HALL_OF_FAME.getRankName();
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIILLIIL)) {
                rankName = EnumC955630ayX.HOURLY_RANK.getRankName();
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJ)) {
                rankName = EnumC955630ayX.WEEKLY_ROOKIE_RANK.getRankName();
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJ)) {
                rankName = RankTypeV2.LJIIZILJ.rankName;
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJI)) {
                rankName = RankTypeV2.LJIJ.rankName;
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIFFI)) {
                rankName = RankTypeV2.LJIJI.rankName;
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJII)) {
                rankName = RankTypeV2.LJIJJ.rankName;
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIIJZLJL)) {
                rankName = RankTypeV2.LJIJJLI.rankName;
            } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJIIJI)) {
                rankName = RankTypeV2.LJIL.rankName;
            } else {
                rankName = "";
            }
            map2.put("rank_type", rankName);
            return;
        }
        if (!TextUtils.isEmpty(C915980Zwa.LJI().LIZ().LLL().rankType)) {
            ((HashMap) map).put("rank_type", C915980Zwa.LJI().LIZ().LLL().rankType);
        } else {
            ((HashMap) map).put("rank_type", "not_in_rank");
        }
        if (C915980Zwa.LJI().LIZ().LLL().topIndex > 0) {
            i = 1;
        }
        ((HashMap) map).put("is_ranking_opposite_anchor", String.valueOf(i));
    }

    public static List<LinkUser> LIZIZ(List<Long> list, List<LinkUser> list2) {
        ArrayList arrayList = new ArrayList();
        for (LinkUser linkUser : list2) {
            if (!list.contains(linkUser.userId)) {
                arrayList.add(linkUser);
            }
        }
        return arrayList;
    }

    public static void LJII(String str, PunishEventInfo punishEventInfo) {
        HashMap map = new HashMap();
        if (punishEventInfo != null) {
            map.put("record_id", punishEventInfo.punishId);
            map.put("violation_anchor_id", String.valueOf(punishEventInfo.violationUid));
            map.put("violation_type", punishEventInfo.punishType);
            map.put("violation_reason", punishEventInfo.punishReason);
            map.put("action_type", str);
            map.put("show_reason", punishEventInfo.showReason);
        }
        LJJIJLIJ("livesdk_accept_connect_notice", map);
    }

    public static void LJIIIZ(EnumC918970a1P enumC918970a1P, long j) {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            enumC918970a1P = C927600aFK.LJII();
        }
        String strLJI = C921640a5i.LJI(0L);
        if (strLJI.isEmpty()) {
            strLJI = "";
        }
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = (IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_invite_guest_connection");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("default", "guest_id");
        c474500IjALIZ.LJJII("room", "share_platform");
        c474500IjALIZ.LJJII(strLJI, "enter_from");
        c474500IjALIZ.LJJII(C917520Zz4.LJIIL(), "live_type");
        c474500IjALIZ.LJJII("chat_live", "trigger");
        c474500IjALIZ.LJJII(String.valueOf(C924810aAp.LJ().LJJII), "guest_cnt");
        c474500IjALIZ.LJJII("", "tag_list");
        c474500IjALIZ.LJJII("", "show_tag_list");
        c474500IjALIZ.LJJII(String.valueOf(0), "tag_show_cnt");
        c474500IjALIZ.LJJII(C920500a3s.LIZ(0L), "multi_request_id");
        c474500IjALIZ.LJJII(0, "anchor_relationship");
        c474500IjALIZ.LJJII(0, "is_inroom_guest");
        c474500IjALIZ.LJJII(Integer.valueOf(C921640a5i.LJ(0L)), "online_status");
        c474500IjALIZ.LJJII(-1, "rank");
        C923330a8R c923330a8R = C923330a8R.LIZ;
        c474500IjALIZ.LJJII(C923330a8R.LIZLLL(), "is_multi_guest_moderator");
        c474500IjALIZ.LJJII(0, "online_friend_trigger");
        c474500IjALIZ.LJJII(C921640a5i.LJFF(0L, true), "online_friend_trigger_from");
        c474500IjALIZ.LJJII(0, "is_invited");
        c474500IjALIZ.LJJII(Long.valueOf(j), "group_id");
        c474500IjALIZ.LJJII(1, "is_group_invite");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJ(iMultiGuestV3InternalServiceV2)), "empty_mic_count");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJI(iMultiGuestV3InternalServiceV2)), "show_empty_mic_count");
        C917810ZzX.LIZ(c474500IjALIZ);
        C917650ZzH.LIZJ(c474500IjALIZ);
        if (C917520Zz4.LJIIJ() == LiveMode.LIVE_VOICE) {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        } else {
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
        }
        C474170Iid.LIZIZ(c474500IjALIZ);
        C944240agA.LIZIZ(c474500IjALIZ, "anchorMgrV", "inviteGroupBtn").LIZIZ();
    }

    public static void LJIJ(int i, String str) {
        String str2;
        boolean z;
        HashMap map = new HashMap();
        if (C915980Zwa.LJI().LIZ().LJIILLIIL() == C955540ayO.LIZJ) {
            str2 = "mutual_follow";
        } else {
            str2 = "recommend";
        }
        map.put("invitee_list", str2);
        if (C973890bRz.LIZ.LJLIL() != EnumC964170bCJ.NONE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            map.put("connection_type", "anchor");
        } else {
            map.put("connection_type", "manual_pk");
        }
        map.put("selection", str);
        map.put("is_dont_suggest", String.valueOf(i));
        LJJIJLIJ("cancel_connection_select", map);
    }

    public static void LJJIII(Room room, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_toast");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII("live", "scene_type");
        c474500IjALIZ.LJJII("multiguest_ban", "violation_type");
        if (room != null) {
            c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "violation_anchor_id");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIJZLJL(int i, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_appeal_popup_window_click");
        c474500IjALIZ.LJJII(LJI(i), "request_page");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIIJIL(C925630aC9 c925630aC9, MultiGuestDataHolder multiGuestDataHolder) {
        int i;
        EnumC918970a1P enumC918970a1PLJII;
        EnumC918970a1P enumC918970a1PLJII2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_user_profile");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(c925630aC9.LIZ), "user_id");
        if (multiGuestDataHolder.LJJIFFI == 0) {
            i = 0;
        } else {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_guest_connection");
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            enumC918970a1PLJII = C927600aFK.LJII();
        } else {
            enumC918970a1PLJII = multiGuestDataHolder.LJJJJI;
        }
        c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1PLJII).getFirst(), "layout_setting");
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            enumC918970a1PLJII2 = C927600aFK.LJII();
        } else {
            enumC918970a1PLJII2 = multiGuestDataHolder.LJJJJI;
        }
        c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1PLJII2).getSecond(), "window_setting");
        c474500IjALIZ.LJJII(Integer.valueOf(multiGuestDataHolder.LJJIFFI), "guest_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(c925630aC9.LIZIZ ? 1 : 0), "link_limit");
        c474500IjALIZ.LJJII(Integer.valueOf(c925630aC9.LIZJ ? 1 : 0), "guest_follow_anchor");
        c474500IjALIZ.LJJII(Integer.valueOf(c925630aC9.LIZLLL ? 1 : 0), "anchor_follow_guest");
        c474500IjALIZ.LJJII(c925630aC9.LJ, "action_type");
        c474500IjALIZ.LJJII(c925630aC9.LJFF, "icon_status");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJLIJ(String str, Map<String, String> map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJ(int i, String str, String str2) {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            C927600aFK.LJII();
        }
        HashMap map = new HashMap();
        C917520Zz4.LIZ(map);
        C924640aAY.LIZ(map);
        C917750ZzR.LIZ(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_receive_anchor_apply");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("anchor_invite_guest", "guest_connection_type");
        c474500IjALIZ.LJJII(str2, "live_type");
        c474500IjALIZ.LJJII("room", "receive_invitation_platform");
        c474500IjALIZ.LJJII("others", "anchor_invite_position");
        c474500IjALIZ.LJJII("anchor_invite_guest", "guest_invite_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "connected_guest_cnt");
        c474500IjALIZ.LJJII(str, "invitation_type");
        c474500IjALIZ.LJJII(C917520Zz4.LJIIIIZZ(false, null), "guest_permission");
        C923330a8R c923330a8R = C923330a8R.LIZ;
        c474500IjALIZ.LJJII(C923330a8R.LIZLLL(), "is_multi_guest_moderator");
        c474500IjALIZ.LJJIIZI(map);
        if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
            c474500IjALIZ.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIL(C955540ayO c955540ayO, String str, boolean z) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty("private")) {
            map.put("show_type", "private");
        }
        if (c955540ayO != null) {
            map.put("invitee_list", C955410ayB.LIZJ(c955540ayO));
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("invitee_id", str);
        }
        if (z) {
            map.put("selection", "continue");
        } else {
            map.put("selection", "cancel");
        }
        map.put("is_change_pairing", CardStruct.IStatusCode.DEFAULT);
        map.put("is_system_rematching", CardStruct.IStatusCode.DEFAULT);
        map.put("connection_type", "anchor");
        map.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        map.put("inviter_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        LIZ(c955540ayO, map);
        LJJIJLIJ("livesdk_connection_live_watched_popup_click", map);
    }

    public static void LJJIJL(String str, String str2, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJ(str2);
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(Room room, long j, String str, boolean z) {
        InterfaceC302401Fe interfaceC302401Fe;
        LinkPlayerInfo linkPlayerInfoLJIIIZ;
        User user;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_refused_connection_show");
        c474500IjALIZ.LJIL();
        if (room != null) {
            c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
            if (room.getOwner() != null) {
                c474500IjALIZ.LJJII(Long.valueOf(room.getOwner().getId()), "anchor_id");
            }
        }
        C948450amx c948450amx = C948450amx.LIZIZ;
        if (c948450amx.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER") != null && (interfaceC302401Fe = (InterfaceC302401Fe) c948450amx.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER")) != null && (linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(interfaceC302401Fe.LIZ(), j)) != null && (user = linkPlayerInfoLJIIIZ.mUser) != null && user.getFollowInfo() != null) {
            c474500IjALIZ.LJJII(Long.valueOf(linkPlayerInfoLJIIIZ.mUser.getFollowInfo().getFollowStatus()), "anchor_relationship");
        }
        c474500IjALIZ.LJJII(str, "refused_way");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())), "connected_guest_cnt");
        c474500IjALIZ.LJJII(Long.valueOf(j), "guest_id");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_toast_show");
        C944240agA.LIZIZ(c474500IjALIZ, "receiveIM", "rejectInvite").LIZIZ();
    }

    public static void LJIILLIIL(String str, String str2, String str3, List<String> list) {
        String string;
        HashMap map = new HashMap();
        map.put("linkmic_id", str2);
        map.put("channel_id", str);
        map.put("live_type", str3);
        map.put("client_time", String.valueOf(System.currentTimeMillis()));
        map.put("server_time", String.valueOf(C158B.LIZ()));
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append(ListProtector.get(list, i).toString());
                if (i != arrayList.size() - 1) {
                    sb.append(',');
                }
            }
            string = sb.toString();
        }
        map.put("guest_uids", string);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_channel_over");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJJII(int i, String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_inner_push_disappear");
        c474500IjALIZ.LJJII(str, "anchor_id");
        c474500IjALIZ.LJJII(str2, "room_id");
        c474500IjALIZ.LJJII("inner_push", "enter_from_merge");
        c474500IjALIZ.LJJII("inner_push", "enter_method");
        c474500IjALIZ.LJJII("mg_invite_friend_link", "gd_label");
        c474500IjALIZ.LJJII(str3, "type");
        if (MultiGuestV3DirectJoinOptSetting.INSTANCE.getValue() != 1) {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_vibrate");
        c474500IjALIZ.LIZ();
    }

    public static void LJJ(String str, String str2, String str3, String str4, String str5) {
        LJJI(str, str2, str3, str4, str5, "", "", "", "", "");
    }

    public static void LJIIJJI(long j, long j2, long j3, boolean z, boolean z2, EnumC918970a1P enumC918970a1P) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_invite_guest_cancel_toast");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(String.valueOf(j), "anchor_id");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_multi_guest_moderator");
        c474500IjALIZ.LJJII(String.valueOf(j2), "guest_id");
        c474500IjALIZ.LJJII(String.valueOf(j3), "room_id");
        if (z2) {
            str = "click";
        } else {
            str = "show";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
        c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
        C474170Iid.LIZIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static boolean LJJIIZI(String str, String str2, int i, String str3, long j, EnumC918970a1P enumC918970a1P, Map<Long, Long> map) {
        String str4;
        String strLIZIZ;
        String strLJIIZILJ;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        HashMap map2 = (HashMap) LIZJ;
        Map map3 = (Map) map2.get(Long.valueOf(currentUserId));
        if (map3 != null) {
            map2.remove(Long.valueOf(currentUserId));
            map3.put("linkmic_id", str2);
            map3.put("channel_id", str);
            Object obj = map3.get("elapsed_time");
            if (obj != null) {
                map3.put("elapsed_time", Long.valueOf(System.currentTimeMillis() - ((Long) obj).longValue()));
            }
            HashMap map4 = new HashMap();
            for (Map.Entry entry : map3.entrySet()) {
                map4.put(entry.getKey(), entry.getValue().toString());
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_apply_result");
            c474500IjALIZ.LJJIIZI(map4);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 6) {
                                str4 = "leave_api";
                            } else {
                                str4 = "connection_fail";
                            }
                        } else {
                            str4 = "cancel";
                        }
                    } else {
                        str4 = "reject";
                    }
                } else {
                    str4 = "leave";
                }
            } else {
                str4 = "success";
            }
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())), "connected_guest_cnt");
            c474500IjALIZ.LJJII(String.valueOf(System.currentTimeMillis()), "client_time");
            c474500IjALIZ.LJJII(String.valueOf(C158B.LIZ()), "server_time");
            c474500IjALIZ.LJJII(str4, "result_desc");
            c474500IjALIZ.LJJII(String.valueOf(j), "anchor_relationship");
            if ("connection_fail".equals(str4) || "leave_api".equals(str4)) {
                c474500IjALIZ.LJJII(str3, "fail_reason");
            }
            DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ();
            InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
            if (interfaceC925800aCQLIZIZ != null) {
                interfaceC925800aCQLIZIZ.LIZIZ();
                strLIZIZ = interfaceC925800aCQLIZIZ.LIZIZ();
            } else {
                strLIZIZ = "";
            }
            if (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ != null && !deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZIZ().isEmpty()) {
                c474500IjALIZ.LJJII(deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZIZ(), "request_page");
            } else if (interfaceC925800aCQLIZIZ != null && !TextUtils.isEmpty(strLIZIZ)) {
                c474500IjALIZ.LJJII(strLIZIZ, "request_page");
            } else if (!TextUtils.isEmpty(LIZ)) {
                c474500IjALIZ.LJJII(LIZ, "request_page");
            }
            c474500IjALIZ.LJJII(C786410Ut5.J3(LJJIIJ(map)), "guest_relationship");
            IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = (IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
            c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJ(iMultiGuestV3InternalServiceV2)), "empty_mic_count");
            c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJI(iMultiGuestV3InternalServiceV2)), "show_empty_mic_count");
            String str5 = LiveMode.LIVE_VOICE.logStreamingType;
            InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
            if (interfaceC474510IjB != null) {
                strLJIIZILJ = interfaceC474510IjB.LJIIZILJ("live_type");
            } else {
                strLJIIZILJ = null;
            }
            if (!str5.equals(strLJIIZILJ)) {
                c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
                c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
            }
            C944240agA.LIZ(c474500IjALIZ).LIZIZ();
            return true;
        }
        return false;
    }

    public static void LJJIFFI(long j, EnumC918970a1P enumC918970a1P, String str, String str2, int i, String str3, int i2, Map map, DataChannel dataChannel) {
        long j2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        Object obj;
        String str4 = str3;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            enumC918970a1P = C927600aFK.LJII();
        }
        ListByTypeResponse.ReservedUser reservedUserLIZ = C921330a5D.LIZ(j);
        if (reservedUserLIZ != null) {
            j2 = reservedUserLIZ.reserveId;
            str4 = "guest_apply_anchor";
        } else {
            j2 = 0;
        }
        String strLJFF = C917520Zz4.LJFF(Long.valueOf(j2), (String) C917700ZzM.LIZ().get(Long.valueOf(j)));
        Object obj2 = ((LinkedHashMap) C921640a5i.LLILLJJLI).get(Long.valueOf(j));
        if (obj2 == null) {
            obj2 = "room";
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null) {
            multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ();
        } else {
            multiLiveAnchorPanelSettingsLIZIZ = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_connection_success_onstage");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(strLJFF, "enter_from");
        c474500IjALIZ.LJJII(C921330a5D.LIZIZ, "click_time");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "reservation_id");
        String str5 = CardStruct.IStatusCode.DEFAULT;
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_reservation_sender");
        c474500IjALIZ.LJJII(obj2, "share_platform");
        c474500IjALIZ.LJJII(C917520Zz4.LJIIL(), "live_type");
        c474500IjALIZ.LJJII(str4, "guest_invite_type");
        c474500IjALIZ.LJJII(C925150aBN.LJ(), "permission_type");
        c474500IjALIZ.LJJII(str, "link_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "guest_id");
        c474500IjALIZ.LJJII(str2, "channel_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "anchor_relationship");
        c474500IjALIZ.LJJII(Integer.valueOf(C921330a5D.LIZJ), "current_accept_appointment_cnts");
        c474500IjALIZ.LJJII(String.valueOf(LJ(j)), "guest_cnt");
        c474500IjALIZ.LJJII(C921220a52.LIZ(i2), "request_display_setting");
        if (C921640a5i.LIZJ(j, false)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "online_friend_trigger");
        c474500IjALIZ.LJJII(C921640a5i.LJFF(j, false), "online_friend_trigger_from");
        if (multiLiveAnchorPanelSettingsLIZIZ != null && multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout == 3) {
            str5 = "1";
        }
        c474500IjALIZ.LJJII(str5, "is_always_show_layout");
        c474500IjALIZ.LJJIIZI(map);
        C917810ZzX.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(String.valueOf(LJ(j)), "guest_cnt");
        C474170Iid.LIZIZ(c474500IjALIZ);
        C924620aAW.LIZ(c474500IjALIZ, Long.valueOf(j));
        C917650ZzH.LIZJ(c474500IjALIZ);
        long jLIZJ = LIZJ(dataChannel);
        if (jLIZJ != 0) {
            c474500IjALIZ.LJJII(Long.valueOf(jLIZJ), "playbook_id");
            c474500IjALIZ.LJJII(LJFF(Long.valueOf(jLIZJ)), "playbook_from");
        }
        if (C925640aCA.LJI().get(Long.valueOf(j)) != null) {
            c474500IjALIZ.LJJII(C925640aCA.LJI().get(Long.valueOf(j)), "gift_num");
        }
        if (C925640aCA.LJII().get(Long.valueOf(j)) != null) {
            c474500IjALIZ.LJJII(C925640aCA.LJII().get(Long.valueOf(j)), "gift_rank");
        }
        if (C917520Zz4.LJIIJ() == LiveMode.LIVE_VOICE) {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        } else {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
        }
        ((Map) C920500a3s.LIZJ.getValue()).remove(Long.valueOf(j));
        if (C922770a7X.LIZ()) {
            Integer num = C923130a87.LIZ.get(Long.valueOf(j));
            if (num != null) {
                c474500IjALIZ.LJJII(num, "is_prioritized_request");
            } else {
                c474500IjALIZ.LJJII(0, "is_prioritized_request");
            }
        }
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = (IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJ(iMultiGuestV3InternalServiceV2)), "empty_mic_count");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJI(iMultiGuestV3InternalServiceV2)), "show_empty_mic_count");
        c474500IjALIZ.LJJII(str, "remote_link_id");
        InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIJ();
        }
        C944240agA.LIZIZ(c474500IjALIZ, "rtcCallback", "firstFrame").LIZIZ();
    }

    public static void LJJIJ(long j, EnumC918970a1P enumC918970a1P, boolean z, int i, Boolean bool, String str, String str2, String str3, Boolean bool2) {
        int i2;
        String str4;
        Object obj;
        Object obj2;
        String str5;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_connection_mutual_notice");
        c474500IjALIZ.LJIL();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            c474500IjALIZ.LJJII(String.valueOf(room.getId()), "room_id");
            c474500IjALIZ.LJJII(String.valueOf(room.getOwnerUserId()), "anchor_id");
        }
        if (C917520Zz4.LJIIJ() == LiveMode.LIVE_VOICE) {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        } else {
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
        }
        C917650ZzH.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LJJII(String.valueOf(j), "guest_id");
        if (C924810aAp.LJ().LJJII != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_guest_connection");
        c474500IjALIZ.LJJII(String.valueOf(C924810aAp.LJ().LJJII), "guest_cnt");
        if (z) {
            str4 = "click";
        } else {
            str4 = "show";
        }
        c474500IjALIZ.LJJII(str4, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "anchor_relationship");
        String str6 = "1";
        if (bool.booleanValue()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "online_friend_trigger");
        String str7 = "outroom_friend";
        if (bool.booleanValue()) {
            obj2 = "outroom_friend";
        } else {
            obj2 = "room_viewer";
        }
        c474500IjALIZ.LJJII(obj2, "link_reason");
        String str8 = "";
        if (str == null) {
            str5 = "";
        } else {
            str5 = str;
        }
        c474500IjALIZ.LJJII(str5, "link_sub_reason");
        c474500IjALIZ.LJJII(str2, "guest_invite_type");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "remote_link_id");
        }
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str6, "is_click_valid");
        }
        if (z) {
            C927240aEk c927240aEk = new C927240aEk("anchorLiveHome", "capsuleBtnInRoom");
            c927240aEk.LJ = String.valueOf(j);
            Map<String, String> map = c927240aEk.LIZJ;
            if (!bool.booleanValue()) {
                str7 = "room_viewer";
            }
            map.put("link_reason", str7);
            Map<String, String> map2 = c927240aEk.LIZJ;
            if (str != null) {
                str8 = str;
            }
            map2.put("link_sub_reason", str8);
            c927240aEk.LIZ();
        }
        HashMap map3 = new HashMap();
        C924620aAW.LJIIJJI(map3);
        c474500IjALIZ.LJJIIZI(map3);
        C944240agA.LIZ(c474500IjALIZ).LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(int r6, java.lang.String r7, long r8, java.lang.String r10, long r11, int r13, java.lang.String r14, java.lang.String r15, java.util.Map r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925600aC6.LJIILJJIL(int, java.lang.String, long, java.lang.String, long, int, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }

    public static void LJJI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11;
        IMultiHostService iMultiHostServiceLJII;
        HashMap map = new HashMap();
        String strLLJJIII = C915980Zwa.LJI().LIZ().LLJJIII();
        if (str3.equals("anchor_icon")) {
            map.put("show_anchor_type", strLLJJIII);
        }
        if (C915980Zwa.LJI().LIZ().LJIIIZ()) {
            map.put("is_sound_effect", "1");
        } else {
            map.put("is_sound_effect", CardStruct.IStatusCode.DEFAULT);
        }
        if (C915980Zwa.LJI().LJIIJ().LIZ()) {
            str11 = "during_connection";
        } else {
            str11 = "single_live";
        }
        map.put("live_icon_show_time", str11);
        if (C915980Zwa.LJI().LJIIJ().LIZ() && (iMultiHostServiceLJII = C915980Zwa.LJII()) != null) {
            int size = iMultiHostServiceLJII.LLILZLL(true).size();
            int size2 = iMultiHostServiceLJII.LJIJJ().size();
            map.put("current_connection_cnts", String.valueOf(size));
            map.put("current_position_left", String.valueOf(4 - size2));
        }
        map.put("anchor_id", str);
        map.put("room_id", str2);
        map.put("show_type", str3);
        map.put("current_live_mutual_friends_cnts", str4);
        if (!str5.isEmpty()) {
            map.put("to_anchor_id", str5);
        }
        String logId = C915980Zwa.LJI().LIZ().getLogId();
        if (logId == null) {
            logId = "";
        }
        map.put("log_id", logId);
        if (str6 == null) {
            str6 = "";
        }
        map.put("guide_type", str6);
        map.put("request_id", str9);
        if (!str7.isEmpty()) {
            map.put("suggested_anchor_id", str7);
        }
        if (!str8.isEmpty()) {
            map.put("suggest_creator_type", str8);
        }
        if (str10 != null && !str10.isEmpty()) {
            map.put("recommend_reason", str10);
        }
        LJJIJL("livesdk_anchor_live_notification_popup_show", "show", map);
    }

    public static void LJIILL(long j, EnumC918970a1P enumC918970a1P, long j2, String str, String str2, String str3, String str4, int i, int i2, int i3, Map<String, String> map, boolean z, boolean z2, boolean z3, Map<String, String> map2, DataChannel dataChannel) {
        String str5;
        long j3;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        Object obj;
        Object obj2;
        Object obj3;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            enumC918970a1P = C927600aFK.LJII();
        }
        ListByTypeResponse.ReservedUser reservedUserLIZ = C921330a5D.LIZ(j);
        if (reservedUserLIZ != null) {
            j3 = reservedUserLIZ.reserveId;
            str5 = "guest_apply_anchor";
        } else {
            str5 = "anchor_invite_guest";
            j3 = 0;
        }
        String strLJFF = C917520Zz4.LJFF(Long.valueOf(j3), C921640a5i.LJI(j));
        Object obj4 = ((LinkedHashMap) C921640a5i.LLILLJJLI).get(Long.valueOf(j));
        if (obj4 == null) {
            obj4 = "room";
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null) {
            multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ();
        } else {
            multiLiveAnchorPanelSettingsLIZIZ = null;
        }
        C917700ZzM.LIZ().put(Long.valueOf(j), strLJFF);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_connection_success");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(strLJFF, "enter_from");
        c474500IjALIZ.LJJII(C921330a5D.LIZIZ, "click_time");
        String str6 = CardStruct.IStatusCode.DEFAULT;
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_reservation_sender");
        c474500IjALIZ.LJJII(Long.valueOf(j3), "reservation_id");
        c474500IjALIZ.LJJII(Integer.valueOf(C921330a5D.LIZJ), "current_accept_appointment_cnts");
        c474500IjALIZ.LJJII(obj4, "share_platform");
        c474500IjALIZ.LJJII(C917520Zz4.LJIIL(), "live_type");
        c474500IjALIZ.LJJII(String.valueOf(j2), "reply_id");
        c474500IjALIZ.LJJII(str5, "guest_invite_type");
        c474500IjALIZ.LJJII(C925150aBN.LJ(), "permission_type");
        c474500IjALIZ.LJJII(str, "link_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "guest_id");
        c474500IjALIZ.LJJII(C920500a3s.LIZ(j), "multi_request_id");
        c474500IjALIZ.LJJII(str2, "channel_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "anchor_relationship");
        c474500IjALIZ.LJJII(String.valueOf(LJ(j)), "guest_cnt");
        c474500IjALIZ.LJJII(str3, "tag_list");
        c474500IjALIZ.LJJII(str4, "show_tag_list");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "tag_show_cnt");
        c474500IjALIZ.LJJII(C921220a52.LIZ(i3), "request_display_setting");
        c474500IjALIZ.LJJII(Integer.valueOf(C921640a5i.LJ(j)), "online_status");
        if (C921640a5i.LIZJ(j, false)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "online_friend_trigger");
        c474500IjALIZ.LJJII(C921640a5i.LJFF(j, false), "online_friend_trigger_from");
        if (multiLiveAnchorPanelSettingsLIZIZ != null && multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout == 3) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "is_always_show_layout");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_multi_guest_moderator");
        c474500IjALIZ.LJJIIZI(map);
        C917810ZzX.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(String.valueOf(LJ(j)), "guest_cnt");
        c474500IjALIZ.LJJII(String.valueOf(LIZLLL(j)), "both_guest_cnt");
        if (z3) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj3, "is_pre_accept");
        if (multiGuestDataHolderLIZJ != null) {
            multiGuestDataHolderLIZJ.LIZIZ.put(Long.valueOf(j), Boolean.valueOf(z3));
        }
        if (map2 != null && !map2.isEmpty()) {
            c474500IjALIZ.LJJIIZI(map2);
        }
        C474170Iid.LIZIZ(c474500IjALIZ);
        C924620aAW.LIZ(c474500IjALIZ, Long.valueOf(j));
        C917650ZzH.LIZJ(c474500IjALIZ);
        if (C917520Zz4.LJIIJ() == LiveMode.LIVE_VOICE) {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        } else {
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
        }
        ((Map) C920500a3s.LIZJ.getValue()).remove(Long.valueOf(j));
        if (C922770a7X.LIZ()) {
            c474500IjALIZ.LJJII(0, "is_prioritized_request");
        }
        if (z) {
            str6 = "1";
        }
        c474500IjALIZ.LJJII(str6, "is_karaoke_request");
        long jLIZJ = LIZJ(dataChannel);
        if (jLIZJ != 0) {
            c474500IjALIZ.LJJII(Long.valueOf(jLIZJ), "playbook_id");
            c474500IjALIZ.LJJII(LJFF(Long.valueOf(jLIZJ)), "playbook_from");
        }
        c474500IjALIZ.LJJII(C917660ZzI.LIZ(), "is_show_avaliable_spot");
        InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIJ();
        }
        C944240agA.LIZIZ(c474500IjALIZ, "receiveIM", "reply").LIZIZ();
        if (C916490ZxP.LIZJ() != null && !C916490ZxP.LIZJ().LJIILJJIL) {
            LJJIL("Anchor invite guest");
            C916490ZxP.LIZJ().LJIILJJIL = true;
        }
        ((Map) C932140aMe.LIZIZ.getValue()).remove(Long.valueOf(j));
    }

    public static void LJIIJ(long j, EnumC918970a1P enumC918970a1P, String str, String str2, String str3, int i, int i2, boolean z, int i3, String str4, boolean z2, boolean z3, String str5, boolean z4, Map<String, String> map, Map<String, String> map2, boolean z5) {
        String strValueOf;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        LinkUser linkUserLLD;
        LiveEventInfo liveEventInfo;
        Long l;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            enumC918970a1P = C927600aFK.LJII();
        }
        String strLJI = C921640a5i.LJI(j);
        if (strLJI.isEmpty()) {
            strLJI = str4;
        }
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = (IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_invite_guest_connection");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(String.valueOf(j), "guest_id");
        c474500IjALIZ.LJJII(C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)), "link_id");
        c474500IjALIZ.LJJII("room", "share_platform");
        c474500IjALIZ.LJJII(strLJI, "enter_from");
        c474500IjALIZ.LJJII(C917520Zz4.LJIIL(), "live_type");
        c474500IjALIZ.LJJII(str, "trigger");
        c474500IjALIZ.LJJII(String.valueOf(C924810aAp.LJ().LJJII), "guest_cnt");
        c474500IjALIZ.LJJII(str2, "tag_list");
        c474500IjALIZ.LJJII(str3, "show_tag_list");
        c474500IjALIZ.LJJII(String.valueOf(i), "tag_show_cnt");
        c474500IjALIZ.LJJII(C920500a3s.LIZ(j), "multi_request_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "anchor_relationship");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_inroom_guest");
        c474500IjALIZ.LJJII(Integer.valueOf(C921640a5i.LJ(j)), "online_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "rank");
        C923330a8R c923330a8R = C923330a8R.LIZ;
        c474500IjALIZ.LJJII(C923330a8R.LIZLLL(), "is_multi_guest_moderator");
        c474500IjALIZ.LJJII(Integer.valueOf(z3 ? 1 : 0), "online_friend_trigger");
        c474500IjALIZ.LJJII(C921640a5i.LJFF(j, true), "online_friend_trigger_from");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_invited");
        c474500IjALIZ.LJJII(str5, "is_suggested_invite");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJ(iMultiGuestV3InternalServiceV2)), "empty_mic_count");
        c474500IjALIZ.LJJII(Integer.valueOf(z5 ? 1 : 0), "is_by_invite_all");
        c474500IjALIZ.LJJII(C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)), "link_id");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJI(iMultiGuestV3InternalServiceV2)), "show_empty_mic_count");
        C917810ZzX.LIZ(c474500IjALIZ);
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ != null && (liveEventInfo = roomLJIIIZ.liveEventInfo) != null && (l = liveEventInfo.eventId) != null) {
            strValueOf = String.valueOf(l);
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(strValueOf, "live_event_id");
        c474500IjALIZ.LJJII(Integer.valueOf(z4 ? 1 : 0), "is_live_event_invite");
        if (map != null && !map.isEmpty()) {
            c474500IjALIZ.LJJIIZI(map);
        }
        if (C917520Zz4.LJIIJ() == LiveMode.LIVE_VOICE) {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        } else {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
        }
        if (z && (interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL()) != null && (linkUserLLD = interfaceC954180awCLLJLL.LLD(j)) != null) {
            c474500IjALIZ.LJJII(linkUserLLD.linkMicId, "remote_link_id");
        }
        if (map2 != null) {
            c474500IjALIZ.LJJIIZI(map2);
        }
        C474170Iid.LIZIZ(c474500IjALIZ);
        C917650ZzH.LIZJ(c474500IjALIZ);
        if (z2) {
            C944240agA.LIZIZ(c474500IjALIZ, "apiResponse", "cancelInvite").LIZIZ();
        } else {
            C944240agA.LIZ(c474500IjALIZ).LIZIZ();
        }
    }

    public static void LJIIL(long j, EnumC918970a1P enumC918970a1P, boolean z, String str, String str2, String str3, String str4, int i, int i2, long j2, int i3, int i4, String str5, Map<String, String> map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Map<String, String> map2, DataChannel dataChannel) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        Object obj;
        Object obj2;
        String str6;
        String str7 = str5;
        if (str7 == null) {
            if (!z) {
                str7 = "guest_apply_anchor";
            } else {
                str7 = "animation_guest_apply_anchor";
            }
        }
        C917700ZzM.LIZ().put(Long.valueOf(j), str7);
        if (!LinkCoreModelKt.currentUserIsAnchor() && !LinkMicModeratorReporterSetting.enable()) {
            C927240aEk c927240aEk = new C927240aEk("apiResponse", "permit");
            c927240aEk.LJ = String.valueOf(j);
            c927240aEk.LIZ();
            if (C916490ZxP.LIZJ() != null && !C916490ZxP.LIZJ().LJIILJJIL) {
                LJJIL("Guest reply anchor");
                C916490ZxP.LIZJ().LJIILJJIL = true;
            }
            ((Map) C932140aMe.LIZIZ.getValue()).remove(Long.valueOf(j));
            return;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            enumC918970a1P = C927600aFK.LJII();
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null) {
            multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ();
        } else {
            multiLiveAnchorPanelSettingsLIZIZ = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_connection_success");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(C917520Zz4.LJIIL(), "live_type");
        c474500IjALIZ.LJJII(str2, "channel_id");
        c474500IjALIZ.LJJII("guest_apply_anchor", "guest_invite_type");
        c474500IjALIZ.LJJII(str7, "enter_from");
        c474500IjALIZ.LJJII(C925150aBN.LJ(), "permission_type");
        c474500IjALIZ.LJJII(str, "link_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "guest_id");
        c474500IjALIZ.LJJII(C920500a3s.LIZ(j), "multi_request_id");
        c474500IjALIZ.LJJII(str2, "channel_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "anchor_relationship");
        c474500IjALIZ.LJJII(String.valueOf(LJ(j)), "guest_cnt");
        c474500IjALIZ.LJJII(str3, "tag_list");
        c474500IjALIZ.LJJII(str4, "show_tag_list");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "tag_show_cnt");
        c474500IjALIZ.LJJII(1, "online_status");
        c474500IjALIZ.LJJII(0, "online_friend_trigger");
        String str8 = "1";
        if (multiLiveAnchorPanelSettingsLIZIZ != null && multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout == 3) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_always_show_layout");
        c474500IjALIZ.LJJII(Integer.valueOf(z3 ? 1 : 0), "is_multi_guest_moderator");
        c474500IjALIZ.LJJIIZI(map);
        C917810ZzX.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(String.valueOf(LJ(j)), "guest_cnt");
        c474500IjALIZ.LJJII(String.valueOf(LIZLLL(j)), "both_guest_cnt");
        C474170Iid.LIZIZ(c474500IjALIZ);
        C924620aAW.LIZ(c474500IjALIZ, Long.valueOf(j));
        C917650ZzH.LIZJ(c474500IjALIZ);
        if (map2 != null && !map2.isEmpty()) {
            c474500IjALIZ.LJJIIZI(map2);
        }
        if (j2 != -1) {
            c474500IjALIZ.LJJII(Long.valueOf(j2), "gift_num");
        }
        if (i3 != -1) {
            c474500IjALIZ.LJJII(Integer.valueOf(i3), "gift_rank");
        }
        if (i4 != -1) {
            c474500IjALIZ.LJJII(C921220a52.LIZ(i4), "request_display_setting");
        } else {
            c474500IjALIZ.LJJII("by_default", "request_display_setting");
        }
        if (C917520Zz4.LJIIJ() == LiveMode.LIVE_VOICE) {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        } else {
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getFirst(), "layout_setting");
            c474500IjALIZ.LJJII(C917520Zz4.LJII(enumC918970a1P).getSecond(), "window_setting");
        }
        if (C922770a7X.LIZ()) {
            ConcurrentHashMap<Long, Integer> concurrentHashMap = C923130a87.LIZ;
            if (concurrentHashMap.get(Long.valueOf(j)) != null) {
                c474500IjALIZ.LJJII(concurrentHashMap.get(Long.valueOf(j)), "is_prioritized_request");
            }
        }
        if (z5) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "is_pre_accept");
        if (multiGuestDataHolderLIZJ != null) {
            multiGuestDataHolderLIZJ.LIZIZ.put(Long.valueOf(j), Boolean.valueOf(z5));
        }
        if (!z2) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str8, "is_karaoke_request");
        c474500IjALIZ.LJJII(C917660ZzI.LIZ(), "is_show_avaliable_spot");
        long jLIZJ = LIZJ(dataChannel);
        if (jLIZJ != 0) {
            c474500IjALIZ.LJJII(Long.valueOf(jLIZJ), "playbook_id");
            c474500IjALIZ.LJJII(LJFF(Long.valueOf(jLIZJ)), "playbook_from");
        }
        InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIJ();
        }
        if (z6) {
            C927240aEk c927240aEk2 = new C927240aEk("receiveIM", "quickConnect");
            c927240aEk2.LJ = String.valueOf(j);
            c927240aEk2.LIZ();
            C944240agA.LIZ(c474500IjALIZ).LIZIZ();
        } else if (z4) {
            C927240aEk c927240aEk3 = new C927240aEk("receiveIM", "autoApproval");
            c927240aEk3.LJ = String.valueOf(j);
            Map<String, String> map3 = c927240aEk3.LIZJ;
            int iLIZ = C925650aCB.LIZ();
            if (iLIZ != 1) {
                if (iLIZ != 2) {
                    if (iLIZ != 3) {
                        if (iLIZ != 4) {
                            str6 = "";
                        } else {
                            str6 = "gifters";
                        }
                    } else {
                        str6 = "friends";
                    }
                } else {
                    str6 = "followers";
                }
            } else {
                str6 = "everyone";
            }
            map3.put("link_sub_reason", str6);
            c927240aEk3.LIZ();
            C944240agA.LIZ(c474500IjALIZ).LIZIZ();
        } else {
            C944240agA.LIZIZ(c474500IjALIZ, "apiResponse", "permit").LIZIZ();
        }
        if (C916490ZxP.LIZJ() != null && !C916490ZxP.LIZJ().LJIILJJIL) {
            LJJIL("Guest reply anchor");
            C916490ZxP.LIZJ().LJIILJJIL = true;
        }
        ((Map) C932140aMe.LIZIZ.getValue()).remove(Long.valueOf(j));
    }
}
