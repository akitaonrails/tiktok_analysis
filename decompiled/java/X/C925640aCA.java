package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestBubbleShowEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestPreApprovedChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStatFieldSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import qo2.w;

/* JADX INFO: renamed from: X.0aCA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925640aCA {
    public static int LIZIZ;
    public static final C925640aCA LIZ = new C925640aCA();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(490));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(491));

    public static final String LJFF(int i) {
        return i >= 1 ? "multi_guest" : "single_live";
    }

    public static HashMap LJI() {
        return (HashMap) LIZJ.getValue();
    }

    public static HashMap LJII() {
        return (HashMap) LIZLLL.getValue();
    }

    public static void LIZ(Map map) {
        Long lValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Boolean boolValueOf = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (lValueOf != null && lValueOf.longValue() == currentUserId) {
            map.put("connection_inviter_id", String.valueOf(C915980Zwa.LJI().LIZ().LJLLLLLL()));
            map.put("connection_invitee_id", String.valueOf(C915980Zwa.LJI().LIZ().LJJI()));
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI());
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                map.put("pk_inviter_id", String.valueOf(currentUserId));
                map.put("pk_invitee_id", String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
            } else {
                map.put("pk_inviter_id", String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
                map.put("pk_invitee_id", String.valueOf(currentUserId));
            }
        }
    }

    public static void LIZLLL(Map map) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
            w.LIZ.getClass();
            map.put("enter_method", w.LJIIL());
            map.put("enter_from_merge", w.LJIIIZ());
            map.put("action_type", w.LIZLLL());
            EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
            map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getFirst());
            map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getSecond());
            map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
            map.put("live_type", room.getStreamType().logStreamingType);
            String str = C955400ayA.LJJJ;
            if (!TextUtils.isEmpty(str)) {
                map.put("request_id", str);
            }
        }
        C917650ZzH.LIZIZ(map);
        C924620aAW.LJIIJJI(map);
    }

    public static EnumC973640bRa LJ(String str) {
        EnumC973640bRa enumC973640bRa = EnumC973640bRa.PK_ICON;
        if (!Intrinsics.LJFF(str, enumC973640bRa.getValue())) {
            EnumC973640bRa enumC973640bRa2 = EnumC973640bRa.PK_GUIDE;
            if (!Intrinsics.LJFF(str, enumC973640bRa2.getValue())) {
                EnumC973640bRa enumC973640bRa3 = EnumC973640bRa.PLAZA_ICON;
                if (!Intrinsics.LJFF(str, enumC973640bRa3.getValue())) {
                    enumC973640bRa3 = EnumC973640bRa.PK_REMATCH;
                    if (!Intrinsics.LJFF(str, enumC973640bRa3.getValue())) {
                        if (!Intrinsics.LJFF(str, EnumC973640bRa.MULTI_PK_GUIDE.getValue())) {
                            enumC973640bRa2 = EnumC973640bRa.TAKE_STAGE_GUIDE;
                            if (!Intrinsics.LJFF(str, enumC973640bRa2.getValue())) {
                                enumC973640bRa2 = EnumC973640bRa.TAKE_STAGE_GUIDE_V2;
                                if (!Intrinsics.LJFF(str, enumC973640bRa2.getValue())) {
                                    enumC973640bRa2 = EnumC973640bRa.INDIVIDUAL_GUIDE;
                                    if (!Intrinsics.LJFF(str, enumC973640bRa2.getValue())) {
                                        enumC973640bRa2 = EnumC973640bRa.CATCH_BEANS_GUIDE;
                                        if (!Intrinsics.LJFF(str, enumC973640bRa2.getValue())) {
                                            enumC973640bRa2 = EnumC973640bRa.CATCH_BEANS_GUIDE_CAPSULE;
                                            if (!Intrinsics.LJFF(str, enumC973640bRa2.getValue())) {
                                                if (!a0.LJJJIL(str)) {
                                                    return EnumC973640bRa.OTHER_VALUE;
                                                }
                                                return enumC973640bRa;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC973640bRa3;
            }
            return enumC973640bRa2;
        }
        return enumC973640bRa;
    }

    public static final void LJIILL(String str) {
        if (!C924790aAn.LIZLLL().LJI() && !C924790aAn.LIZLLL().LJFF()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C01Z4.LIZ(null, linkedHashMap);
            linkedHashMap.put("link_page", str);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_click_apply");
            c474500IjALIZ.LJJIIZI(linkedHashMap);
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZIZ(Map map, boolean z) {
        C974450bSt c974450bSt;
        int i;
        String strValueOf;
        String strValueOf2;
        Integer numValueOf;
        C20441214yg.LIZIZ("addLinkCommonParams", "addLinkCommonParams");
        map.put("connection_type", "manual_pk");
        map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
        if (z) {
            c974450bSt = C973890bRz.LIZIZ;
        } else {
            c974450bSt = C973890bRz.LIZ;
        }
        BattleSetting battleSetting = c974450bSt.LJ;
        if (battleSetting != null) {
            i = battleSetting.duration;
        } else {
            i = 0;
        }
        Long lValueOf = null;
        if (i > 0) {
            if (battleSetting != null) {
                numValueOf = Integer.valueOf(battleSetting.duration);
            } else {
                numValueOf = null;
            }
            strValueOf = String.valueOf(numValueOf);
        } else {
            strValueOf = String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue());
        }
        map.put("pk_time", strValueOf);
        map.put("is_oncemore", String.valueOf(c974450bSt.LJFF ? 1 : 0));
        map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null && c981480beEM91.LJIIIZ == 0) {
            strValueOf2 = String.valueOf(c974450bSt.LJLIIIL());
        } else {
            C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM912 != null) {
                lValueOf = Long.valueOf(c981480beEM912.LJIIIZ);
            }
            strValueOf2 = String.valueOf(lValueOf);
        }
        map.put("pk_id", strValueOf2);
        map.put("both_guest_cnt", String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size()));
        map.put("linker_mode", String.valueOf(C915980Zwa.LJII().Uh()));
    }

    public static final void LJIIJ(String str, EnumC918970a1P enumC918970a1P) {
        HashMap map = new HashMap();
        LIZLLL(map);
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
        map.put("end_reason", str);
        LJJI("livesdk_anchor_guest_connection_close", map, true);
    }

    public static final void LJIJ(int i, long j) {
        HashMap map = new HashMap();
        map.put("user_id", String.valueOf(j));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            w.LIZ.getClass();
            map.put("enter_from_merge", w.LJIIIZ());
            map.put("enter_method", w.LJIIL());
            map.put("action_type", w.LIZLLL());
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = "";
            }
            map.put("room_id", idStr);
            map.put("connected_guest_cnt", String.valueOf(i));
            map.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            map.put("link_id", C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)));
            LJJI("livesdk_guest_refused_connection_show", map, true);
        }
    }

    public static void LIZJ(Integer num, String str, Map map) {
        Object objLIZIZ;
        Long lValueOf;
        C20441214yg.LIZIZ("addPKTaskComParams", "addPKTaskComParams");
        if (str != null && str.length() != 0) {
            ((HashMap) map).put("pk_task_type", str);
        }
        if (num != null) {
            ((HashMap) map).put("pk_task_type_num", num.toString());
        }
        if (C915980Zwa.LJII().LLFFF()) {
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            if (listLLILZLL.size() > 2) {
                HashMap map2 = (HashMap) map;
                map2.put("is_multi", "1");
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 != null) {
                    lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJ());
                } else {
                    lValueOf = null;
                }
                map2.put("team_id", String.valueOf(lValueOf));
                if (C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_2V2) {
                    map2.put("multi_type", "team_pk");
                }
            } else {
                HashMap map3 = (HashMap) map;
                map3.put("is_multi", CardStruct.IStatusCode.DEFAULT);
                map3.put("team_id", CardStruct.IStatusCode.DEFAULT);
            }
            Object obj = "";
            if (C915980Zwa.LIZ().Al1()) {
                C962950bAL c962950bAL = EnumC962960bAM.Companion;
                EnumC962960bAM enumC962960bAMDn0 = C915980Zwa.LIZIZ().Dn0();
                c962950bAL.getClass();
                objLIZIZ = C962950bAL.LIZJ(enumC962960bAMDn0);
            } else {
                CharSequence charSequence = (CharSequence) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
                if (charSequence != null && !a0.LJJJIL(charSequence)) {
                    objLIZIZ = ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
                    if (objLIZIZ == null) {
                        objLIZIZ = "";
                    }
                } else {
                    C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                    EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                    int size = listLLILZLL.size();
                    c917350Zyn.getClass();
                    objLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
                }
            }
            HashMap map4 = (HashMap) map;
            map4.put("sub_match_type", objLIZIZ);
            map4.put("current_connection_cnts", String.valueOf(listLLILZLL.size()));
            Object obj2 = ((LinkedHashMap) C973660bRc.LJLJLLL).get(C973660bRc.LJJIII);
            if (obj2 != null) {
                obj = obj2;
            }
            map4.put("team_member_cnts", obj);
            return;
        }
        HashMap map5 = (HashMap) map;
        map5.put("is_multi", CardStruct.IStatusCode.DEFAULT);
        map5.put("current_connection_cnts", "2");
        map5.put("team_id", CardStruct.IStatusCode.DEFAULT);
    }

    public static final void LJIILIIL(int i, String str, boolean z) {
        String str2;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap();
        map.put("invitee_list", C955410ayB.LIZJ(C915980Zwa.LJI().LIZ().LJIILLIIL()));
        String strLJJIJIIJI = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
        if (strLJJIJIIJI == null) {
            strLJJIJIIJI = "";
        }
        map.put("request_from", strLJJIJIIJI);
        map.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        if (z) {
            str2 = "match_start";
        } else {
            str2 = "match_mid";
        }
        map.put("task_period_type", str2);
        LIZLLL(map);
        LIZ(map);
        LIZIZ(map, false);
        LIZJ(Integer.valueOf(i), str, map);
        LJJI("livesdk_pk_task_icon_click", map, true);
    }

    public static final void LJIILJJIL(int i, String str, boolean z) {
        String str2;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap();
        map.put("invitee_list", C955410ayB.LIZJ(C915980Zwa.LJI().LIZ().LJIILLIIL()));
        map.put("request_from", C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
        map.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        if (z) {
            str2 = "match_start";
        } else {
            str2 = "match_mid";
        }
        map.put("task_period_type", str2);
        LIZLLL(map);
        LIZ(map);
        LIZIZ(map, false);
        LIZJ(Integer.valueOf(i), str, map);
        LJJI("livesdk_pk_task_icon_show", map, true);
    }

    public static C474500IjA LJJI(String str, Map map, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        if (Intrinsics.LJFF("livesdk_connection_watch_duration", str) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(str)) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            if (z) {
                c474500IjALIZ.LJJIJL();
            }
        } else if (z) {
            c474500IjALIZ.LIZ();
            return c474500IjALIZ;
        }
        return c474500IjALIZ;
    }

    public static final void LJIIIZ(boolean z, long j, int i, EnumC918970a1P enumC918970a1P) {
        String str;
        String str2;
        LinkUser linkUserLLD;
        HashMap map = new HashMap();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        map.put("result", str);
        map.put("guest_id", String.valueOf(j));
        map.put("guest_cnt", String.valueOf(i));
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
        InterfaceC954180awC interfaceC954180awCLLJLL = ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)).LLJLL();
        if (interfaceC954180awCLLJLL == null || (linkUserLLD = interfaceC954180awCLLJLL.LLD(j)) == null || (str2 = linkUserLLD.linkMicId) == null) {
            str2 = "";
        }
        map.put("remote_link_id", str2);
        LJJI("livesdk_anchor_guest_connection_click_accept_result", map, true);
    }

    public static final void LJIL(int i, String str, String str2, boolean z) {
        Object obj;
        Object obj2;
        EnumC774050UXz enumC774050UXz;
        HashMap map = new HashMap();
        LIZLLL(map);
        map.put("action_type", str);
        map.put("invite_entrance", "golive_window");
        boolean zLJIILIIL = C494680Jac.LJIILIIL();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (zLJIILIIL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_subscriber_only_live", obj);
        map.put("request_page", str2);
        if (z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("online_friend_trigger", obj2);
        map.put("red_dot_cnt", String.valueOf(i));
        C2176881AHm c2176881AHm = C1AI0.LIZIZ;
        if (c2176881AHm != null && (enumC774050UXz = c2176881AHm.LIZ) != null && enumC774050UXz.isViewerWishes()) {
            str3 = "1";
        }
        map.put("is_vw", str3);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && room.existedTtlsGoods) {
            map.put("is_local_service_live", "1");
        }
        C917520Zz4.LIZ(map);
        map.putAll(C917810ZzX.LIZLLL());
        LJJI("livesdk_anchor_guest_connection_entrance_click", map, true);
    }

    public static final void LJIJI(int i, DataChannel dataChannel, String str, String str2, String str3) {
        Object obj;
        Object objGg0;
        EnumC774050UXz enumC774050UXz;
        HashMap map = new HashMap();
        LIZLLL(map);
        map.put("action_type", "click");
        map.put("invite_entrance", str);
        boolean zLJIILIIL = C494680Jac.LJIILIIL();
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (zLJIILIIL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_subscriber_only_live", obj);
        map.put("request_page", str3);
        map.put("red_dot_cnt", String.valueOf(i));
        map.put("click_time", str2);
        C2176881AHm c2176881AHm = C1AI0.LIZIZ;
        if (c2176881AHm != null && (enumC774050UXz = c2176881AHm.LIZ) != null && enumC774050UXz.isViewerWishes()) {
            str4 = "1";
        }
        map.put("is_vw", str4);
        C917520Zz4.LIZ(map);
        map.putAll(C917810ZzX.LIZLLL());
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null && room.existedTtlsGoods) {
            map.put("is_local_service_live", "1");
        }
        if (dataChannel != null && (objGg0 = dataChannel.gg0(MultiGuestBubbleShowEvent.class)) != null) {
            map.put("bubble_type", objGg0);
        }
        LJJI("livesdk_anchor_guest_connection_entrance_click", map, true);
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).upLoadLiveEcoEvent(room2.getId(), 2);
        }
    }

    public static final void LJIJJ(String str, long j, boolean z, String str2, DataChannel dataChannel, String str3, String str4) {
        List listLJIL;
        Object obj;
        String str5;
        Object objGg0;
        Object obj2;
        Object obj3;
        Object obj4;
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        Object objGg02 = null;
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null) {
            listLJIL = abstractC928510aGnLIZ.LJIL();
        } else {
            listLJIL = null;
        }
        HashMap map = new HashMap();
        LIZLLL(map);
        String str6 = CardStruct.IStatusCode.DEFAULT;
        map.put("is_user_apply", CardStruct.IStatusCode.DEFAULT);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (listLJIL != null) {
            Iterator it2 = listLJIL.iterator();
            while (it2.hasNext()) {
                User user = ((LinkListUser) it2.next()).user;
                if (user != null && user.getId() == currentUserId) {
                    map.put("is_user_apply", "1");
                }
            }
        }
        map.put("request_page", str);
        map.put("anchor_relationship", String.valueOf(j));
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest", obj);
        map.put("click_time", str2);
        map.put("is_effect_icon", CardStruct.IStatusCode.DEFAULT);
        C917750ZzR.LIZIZ(map);
        if (C925150aBN.LJJIII()) {
            if (C925150aBN.LIZ) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_grey", obj2);
            map.put("grey_reason", "anchor_settings");
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925150aBN.LJFF();
            if (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 3) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("anchor_request_settings_friends", obj3);
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF2 = C925150aBN.LJFF();
            if (multiLiveAnchorPanelSettingsLJFF2 != null && multiLiveAnchorPanelSettingsLJFF2.allowRequestFromFollowers == 3) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("anchor_request_settings_followers", obj4);
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF3 = C925150aBN.LJFF();
            if (multiLiveAnchorPanelSettingsLJFF3 != null && multiLiveAnchorPanelSettingsLJFF3.allowRequestFromOthers == 3) {
                str6 = "1";
            }
            map.put("anchor_request_settings_other_viewers", str6);
        }
        map.put("is_show_avaliable_spot", String.valueOf(C923210a8F.LIZ));
        if (dataChannel != null) {
            objGg02 = dataChannel.gg0(C0TZM.class);
        }
        if (Intrinsics.LJFF(objGg02, Boolean.FALSE)) {
            str5 = "landscape";
        } else {
            str5 = "portrait";
        }
        map.put("room_orientation", str5);
        map.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
        C917520Zz4.LIZ(map);
        if (dataChannel != null && (objGg0 = dataChannel.gg0(MultiGuestBubbleShowEvent.class)) != null) {
            map.put("bubble_type", objGg0);
        }
        C474500IjA c474500IjALJJI = LJJI("livesdk_guest_connection_icon_click", map, false);
        Pair[] pairArr = {new Pair(str3, str4)};
        C945340ahw c945340ahw = new C945340ahw(c474500IjALJJI);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
        c945340ahw.LIZIZ();
    }

    public static final void LJIILLIIL(String str, String str2, int i, EnumC918970a1P enumC918970a1P, boolean z, String str3, boolean z2, String str4) {
        String str5;
        String str6;
        HashMap map = new HashMap();
        map.put("toast_type", str);
        map.put("guest_invite_type", str2);
        map.put("guest_cnt", String.valueOf(i));
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
        if (z) {
            str5 = "on";
        } else {
            str5 = "off";
        }
        map.put("camera_status", str5);
        if (str3 == null) {
            str3 = "";
        }
        map.put("guest_permission", str3);
        if (z2) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_muted", str6);
        map.put("link_id", str4);
        LJJI("livesdk_guest_connection_success_toast", map, true);
    }

    public static final void LJIIJJI(String str, long j, User user, Long l, Integer num, Integer num2, String str2, Integer num3, Integer num4, boolean z) {
        String string;
        String str3;
        String idStr;
        C945340ahw c945340ahw;
        LinkUser linkUserLLD;
        String str4;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (str2 != null) {
            map.put("enter_from", str2);
        }
        if (room != null) {
            String idStr2 = room.getIdStr();
            String str5 = "";
            if (idStr2 == null) {
                idStr2 = "";
            }
            map.put("room_id", idStr2);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("action_type", str);
            map.put("anchor_relationship", String.valueOf(j));
            map.put("live_type", room.getStreamType().logStreamingType);
            if (C781520UlC.LJFF(room)) {
                map.put("layout_id", C917520Zz4.LIZJ());
            }
            if (user == null || (string = Long.valueOf(user.getId()).toString()) == null) {
                string = "";
            }
            map.put("guest_id", string);
            if (l != null) {
                l.longValue();
                map.put("gift_num", l.toString());
            }
            if (num != null) {
                num.intValue();
                map.put("gift_rank", num.toString());
            }
            if (num2 != null) {
                num2.intValue();
                map.put("request_display_setting", C921220a52.LIZ(num2.intValue()));
            }
            if (num3 != null) {
                num3.intValue();
                map.put("request_list_ucnt", num3.toString());
            }
            if (num4 != null) {
                num4.intValue();
                map.put("rank", String.valueOf(num4.intValue() - LIZIZ));
            }
            C924620aAW.LJIIJJI(map);
            if (z) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_karaoke_request", str3);
            if (user == null || (idStr = user.getIdStr()) == null) {
                idStr = "";
            }
            map.putAll(C930160aJS.LIZ(idStr));
            IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = (IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
            C474500IjA c474500IjALJJI = LJJI("livesdk_anchor_refuse_guest_connection", map, false);
            c474500IjALJJI.LJJII(Integer.valueOf(C921180a4y.LJ(iMultiGuestV3InternalServiceV2)), "empty_mic_count");
            c474500IjALJJI.LJJII(Integer.valueOf(C921180a4y.LJI(iMultiGuestV3InternalServiceV2)), "show_empty_mic_count");
            if (user != null) {
                long id = user.getId();
                InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
                if (interfaceC954180awCLLJLL != null && (linkUserLLD = interfaceC954180awCLLJLL.LLD(id)) != null && (str4 = linkUserLLD.linkMicId) != null) {
                    str5 = str4;
                }
            }
            c474500IjALJJI.LJJII(str5, "remote_link_id");
            if (Intrinsics.LJFF(str, "click")) {
                Pair[] pairArr = {new Pair("anchorMgrV", "refuseBtn")};
                c945340ahw = new C945340ahw(c474500IjALJJI);
                c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
            } else {
                c945340ahw = new C945340ahw(c474500IjALJJI);
                c945340ahw.LIZ((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            c945340ahw.LIZIZ();
        }
    }

    public static final void LJIIIIZZ(long j, int i, EnumC918970a1P enumC918970a1P, int i2, long j2, int i3, LinkPlayerInfo linkPlayerInfo, Long l, Integer num, Integer num2, String str, boolean z) {
        String str2;
        String str3;
        LinkUser linkUserLLD;
        String str4;
        LiveMode streamType;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        HashMap map = new HashMap();
        map.put("guest_id", String.valueOf(j));
        map.put("guest_cnt", String.valueOf(i));
        String str5 = "";
        if (room == null || (streamType = room.getStreamType()) == null || (str2 = streamType.logStreamingType) == null) {
            str2 = "";
        }
        map.put("live_type", str2);
        if (str != null) {
            map.put("enter_from", str);
        }
        map.put("rank", String.valueOf(i2 - LIZIZ));
        if (room != null && C781520UlC.LJFF(room)) {
            map.put("layout_id", C917520Zz4.LIZJ());
        } else {
            map.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
            map.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
            if (l != null) {
                l.longValue();
                map.put("gift_num", l.toString());
            }
            if (num != null) {
                num.intValue();
                map.put("gift_rank", num.toString());
            }
            if (num2 != null) {
                num2.intValue();
                map.put("request_display_setting", C921220a52.LIZ(num2.intValue()));
            }
        }
        map.put("anchor_relationship", String.valueOf(j2));
        C924620aAW.LJIIJJI(map);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_karaoke_request", str3);
        map.putAll(C930160aJS.LIZIZ(linkPlayerInfo));
        map.put("request_list_ucnt", String.valueOf(i3));
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = (IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
        map.put("empty_mic_count", String.valueOf(C921180a4y.LJ(iMultiGuestV3InternalServiceV2)));
        map.put("show_empty_mic_count", String.valueOf(C921180a4y.LJI(iMultiGuestV3InternalServiceV2)));
        InterfaceC954180awC interfaceC954180awCLLJLL = iMultiGuestV3InternalServiceV2.LLJLL();
        if (interfaceC954180awCLLJLL != null && (linkUserLLD = interfaceC954180awCLLJLL.LLD(j)) != null && (str4 = linkUserLLD.linkMicId) != null) {
            str5 = str4;
        }
        map.put("remote_link_id", str5);
        C917650ZzH.LIZIZ(map);
        LJJI("livesdk_anchor_guest_connection_click_accept", map, false).LIZ();
    }

    public static void LJIIZILJ(String str, long j, long j2, String str2, Integer num, Integer num2, int i, int i2, String str3, String str4, DataChannel dataChannel, int i3) {
        String string;
        boolean z;
        Object obj;
        String string2;
        C945340ahw c945340ahw;
        Pair pair;
        Pair pair2;
        String guestRequestId;
        int size;
        int iMax;
        int size2;
        String str5 = str4;
        String str6 = str3;
        if ((i3 & 4) != 0) {
            j2 = 0;
        }
        DataChannel dataChannel2 = null;
        if ((i3 & 16) != 0) {
            num = null;
        }
        if ((i3 & 32) != 0) {
            num2 = null;
        }
        if ((i3 & 64) != 0) {
            i = 0;
        }
        if ((i3 & 128) != 0) {
            i2 = 0;
        }
        if ((i3 & 256) != 0) {
            str6 = null;
        }
        if ((i3 & 512) != 0) {
            str5 = "apply_panel";
        }
        if ((i3 & 1024) == 0) {
            dataChannel2 = dataChannel;
        }
        HashMap map = new HashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            C917520Zz4.LIZ(map);
            map.put("withdraw_action_type", str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str7 = "";
            sbLIZ.append("");
            sbLIZ.append(j);
            map.put("duration", C2188811AlT.LIZIZ(sbLIZ));
            map.put("reservation_id", String.valueOf(j2));
            map.put("withdraw_type", str2);
            if (C924790aAn.LIZLLL().LJIILJJIL) {
                map.put("request_page", "panel_plus_guide");
            } else {
                String str8 = C925600aC6.LIZ;
                if (str8 != null && str8.length() != 0) {
                    String str9 = C925600aC6.LIZ;
                    if (str9 != null) {
                        str7 = str9;
                    }
                    map.put("request_page", str7);
                }
            }
            boolean zEnable = LinkMicStatFieldSetting.enable();
            String str10 = CardStruct.IStatusCode.DEFAULT;
            if (zEnable) {
                InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50LIZIZ = C921180a4y.LIZIZ();
                if (interfaceC921200a50LIZIZ != null) {
                    if (C917810ZzX.LJIILIIL()) {
                        iMax = C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ());
                    } else {
                        if (num2 != null) {
                            size = num2.intValue();
                        } else {
                            size = ((AbstractC928510aGn) interfaceC921200a50LIZIZ).LJJIII().size() - 1;
                        }
                        iMax = Math.max(0, size);
                    }
                    if (num != null) {
                        size2 = num.intValue();
                    } else {
                        size2 = ((AbstractC928510aGn) interfaceC921200a50LIZIZ).LJIL().size();
                    }
                    map.put("applying_guest_cnt", String.valueOf(size2));
                    map.put("connected_guest_cnt", String.valueOf(iMax));
                    map.put("guest_cnt", String.valueOf(iMax));
                }
                map.put("withdraw_trigger", str5);
            } else {
                if (num != null) {
                    num.intValue();
                    map.put("applying_guest_cnt", num.toString());
                }
                if (num2 != null) {
                    num2.intValue();
                    if (C917810ZzX.LJIILIIL()) {
                        string = String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()));
                    } else if (num2.intValue() == -1) {
                        string = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        string = num2.toString();
                    }
                    map.put("connected_guest_cnt", string);
                }
            }
            map.put("request_display_setting", C921220a52.LIZ(i));
            map.put("own_rank", String.valueOf(i2));
            if (C922770a7X.LIZIZ() && str6 != null) {
                map.put("filter_request_status", str6);
            }
            map.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
            C924620aAW.LJIIJJI(map);
            C917650ZzH.LIZIZ(map);
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 != null && (guestRequestId = room2.getGuestRequestId()) != null) {
                map.put("guest_request_id", guestRequestId);
            }
            if (dataChannel2 != null && (pair2 = (Pair) dataChannel2.gg0(MultiGuestPreApprovedChannel.class)) != null && ((Boolean) pair2.getFirst()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_pre_accept_apply", obj);
            if (dataChannel2 == null || (pair = (Pair) dataChannel2.gg0(MultiGuestPreApprovedChannel.class)) == null || (string2 = Integer.valueOf(((Number) pair.getSecond()).intValue()).toString()) == null) {
                string2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("pre_accept_user_num", string2);
            C917750ZzR.LIZ(map);
            IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = (IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
            C474500IjA c474500IjALJJI = LJJI("livesdk_guest_connection_apply_withdraw", map, false);
            c474500IjALJJI.LJJII(Integer.valueOf(C921180a4y.LJ(iMultiGuestV3InternalServiceV2)), "empty_mic_count");
            c474500IjALJJI.LJJII(Integer.valueOf(C921180a4y.LJI(iMultiGuestV3InternalServiceV2)), "show_empty_mic_count");
            c474500IjALJJI.LJJII(C921180a4y.LJIIJ(iMultiGuestV3InternalServiceV2), "link_id");
            if (C924810aAp.LJ().LJJJJLI) {
                str10 = "1";
            }
            c474500IjALJJI.LJJII(str10, "is_auto_accept_request_qualified");
            c474500IjALJJI.LJJII(String.valueOf(C925650aCB.LIZ()), "auto_accept_request_initiate_type");
            C917810ZzX.LIZ(c474500IjALJJI);
            if (Intrinsics.LJFF(str, "click")) {
                Pair[] pairArr = {new Pair("cancelApplyAlert", "cancelBtn")};
                c945340ahw = new C945340ahw(c474500IjALJJI);
                c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
            } else {
                c945340ahw = new C945340ahw(c474500IjALJJI);
                c945340ahw.LIZ((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            c945340ahw.LIZIZ();
        }
    }
}
