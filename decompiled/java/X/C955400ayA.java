package X;

import Y.AComparatorS34S0000000_15;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.interact.model.BattleOptPair;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostShowHistoryListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2EventTrackingOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestTrackingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveCoHostInvitationTimeLimitSettings;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS66S1000000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0ayA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955400ayA {
    public static int LIZJ;
    public static String LJ;
    public static long LJIIIZ;
    public static C955510ayL LJIILJJIL;
    public static long LJIL;
    public static long LJJ;
    public static long LJJI;
    public static long LJJIFFI;
    public static long LJJII;
    public static boolean LJJIJIL;
    public static boolean LJJIJL;
    public static boolean LJJIJLIJ;
    public static boolean LJJJI;
    public static long LJJJJI;
    public static int LJJJJIZL;
    public static long LJJJJJ;
    public static long LJJJJJL;
    public static long LJJJJL;
    public static long LJJJJLI;
    public static long LJJJJLL;
    public static long LJJJJZ;
    public static long LJJJJZI;
    public static LinkerInfo LJJJLIIL;
    public static final C955400ayA LIZ = new C955400ayA();
    public static final Map<Long, Integer> LIZIZ = new LinkedHashMap();
    public static C955540ayO LIZLLL = C955540ayO.LIZIZ;
    public static String LJFF = "";
    public static Map<String, String> LJI = C2097608Jq.LJ();
    public static final Map<Long, C960480b6M> LJII = new LinkedHashMap();
    public static final Set<Long> LJIIIIZZ = new LinkedHashSet();
    public static String LJIIJ = "";
    public static final ConcurrentHashMap<String, String> LJIIJJI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, String> LJIIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Integer> LJIILIIL = new ConcurrentHashMap<>();
    public static String LJIILL = "";
    public static String LJIILLIIL = "";
    public static String LJIIZILJ = "";
    public static String LJIJ = "";
    public static String LJIJI = "";
    public static final C915160ZvG LJIJJ = new C915160ZvG();
    public static final C01GW LJIJJLI = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(454));
    public static final ConcurrentHashMap<Long, GiftGalleryBadgeInfo> LJJIII = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, String> LJJIIJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, String> LJJIIJZLJL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, String> LJJIIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Boolean> LJJIIZI = new ConcurrentHashMap<>();
    public static String LJJIJ = "";
    public static String LJJIJIIJI = "";
    public static String LJJIJIIJIL = "";
    public static EnumC955660aya LJJIL = EnumC955660aya.IDLE;
    public static String LJJIZ = "";
    public static String LJJJ = "";
    public static String LJJJIL = "";
    public static String LJJJJ = "";

    public static String LJJLIIIJLLLLLLLZ(int i) {
        return i != 1 ? i != 2 ? "history" : "sug_by_button" : "sug_by_auto";
    }

    public static String LJJJJZI() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType();
    }

    public static EnumMap LJJLIIIJJI() {
        return (EnumMap) LJIJJLI.getValue();
    }

    public static void LJLLI() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_connection_setting_click");
        c474500IjALIZ.LJJII(room != null ? Long.valueOf(room.getOwnerUserId()) : null, "anchor_id");
        c474500IjALIZ.LJJII(room != null ? room.getIdStr() : null, "room_id");
        c474500IjALIZ.LIZ();
    }

    public final void LJZ() {
        HashMap map = new HashMap();
        LJJ(null, map);
        LJJIIZ(map);
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        LIZIZ(map);
        LJJIJIIJI(this, map);
        LJJIJL(map);
        C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), true);
        LJJIJ(map, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        LJII(map);
        LLIILII("livesdk_disconnect_connection_icon_click", map);
    }

    public static final void LJJJJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCoHostTransferInfo, lastCoHostChannelId = ");
        sbLIZ.append(LJJJJL);
        sbLIZ.append(", lastMatchBattleId = ");
        sbLIZ.append(LJJJJLL);
        sbLIZ.append(", lastCoHostAnchorId = ");
        sbLIZ.append(LJJJJLI);
        C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJJ = 0L;
        LJJJJJL = 0L;
        LJJJJL = 0L;
        LJJJJLI = 0L;
    }

    public static final void LJJJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearIsCompetitionOpponent, lastCoHostChannelId = ");
        sbLIZ.append(LJJJJL);
        sbLIZ.append(", lastCompetitionId = ");
        sbLIZ.append(LJJJJZ);
        sbLIZ.append(", lastCoHostAnchorId = ");
        sbLIZ.append(LJJJJLI);
        C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJZ = 0L;
    }

    public static final void LJJJJIZL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearMatchTransferInfo, lastCoHostChannelId = ");
        sbLIZ.append(LJJJJL);
        sbLIZ.append(", lastMatchBattleId = ");
        sbLIZ.append(LJJJJLL);
        sbLIZ.append(", lastCoHostAnchorId = ");
        sbLIZ.append(LJJJJLI);
        C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJLL = 0L;
    }

    public static int LJJJZ() {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            C954460awe c954460awe2 = c954460awe;
            EnumC950200apm enumC950200apm = c954460awe2.LJJIIZ;
            if (enumC950200apm == EnumC950200apm.INVITING || enumC950200apm == EnumC950200apm.INVITED) {
                if (c954460awe2.LJIIJJI()) {
                    arrayList.add(c954460awe);
                }
            }
        }
        return arrayList.size() + 1;
    }

    public static String LJJLIIIJ() {
        int i = C955690ayd.LIZ[C915980Zwa.LJII().LLLLJ().ordinal()];
        if (i == 1) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        if (i == 2) {
            return "1";
        }
        throw new C1954807lC();
    }

    public static boolean LJJLJ() {
        return C915980Zwa.LJI().LIZ().getAnchorType() == EnumC955660aya.INVITEE || C915980Zwa.LJI().LIZ().getAnchorType() == EnumC955660aya.HANDLER;
    }

    public static void LIZIZ(Map map) {
        String label = C915980Zwa.LJI().LIZ().getAnchorType().getLabel();
        if (!Intrinsics.LJFF("idle", label)) {
            map.put("initial_anchor_type", label);
        }
        String label2 = C915980Zwa.LJI().LIZ().LJIIZILJ().getLabel();
        if (!Intrinsics.LJFF("idle", label2)) {
            map.put("anchor_type", label2);
        }
    }

    public static void LIZLLL(Map map) {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            C954460awe c954460awe2 = c954460awe;
            if (c954460awe2.LJIIJJI() && c954460awe2.LJJIIZ == EnumC950200apm.APPLIED) {
                arrayList.add(c954460awe);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it2.next()).LJ));
        }
        ((HashMap) map).put("current_applying_cnts", String.valueOf(arrayList2.size()));
    }

    public static void LJ(Map map) {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        int i = 1;
        if (!(listLJIJJ instanceof Collection) || !listLJIJJ.isEmpty()) {
            for (C954460awe c954460awe : listLJIJJ) {
                if (c954460awe.LJIL || c954460awe.LJIJI != EnumC919210a1n.SUPPORT_MULTI) {
                    i = 0;
                    break;
                }
            }
        }
        ((HashMap) map).put("multi_authority", String.valueOf(i));
    }

    public static void LJII(Map map) {
        String str;
        if (LJJIJL) {
            map.put("invitee_list", LJJIZ);
            if (Intrinsics.LJFF(LJJIZ, "random_match")) {
                if (C915980Zwa.LJIIIZ().LJIIIIZZ()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_system_rematching", str);
            }
        }
    }

    public static void LJIILJJIL(Map map) {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            if (c954460awe.LJIIJJI()) {
                arrayList.add(c954460awe);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it2.next()).LJ));
        }
        ((HashMap) map).put("uid_list", arrayList2.toString());
    }

    public static void LJIILLIIL(Map map) {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            if (c954460awe.LJJIIZ == EnumC950200apm.INVITED) {
                arrayList.add(c954460awe);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it2.next()).LJ));
        }
        ((HashMap) map).put("current_inviting_cnts", String.valueOf(arrayList2.size() + C915980Zwa.LJIIIZ().LIZJ()));
    }

    public static void LJIIZILJ(Map map) {
        String strLLJJ = C915980Zwa.LJI().LIZ().LLJJ();
        String str = "1";
        if (strLLJJ != null && !Intrinsics.LJFF(strLLJJ, "")) {
            HashMap map2 = (HashMap) map;
            map2.put("is_anchor_icon_show", "1");
            map2.put("show_anchor_type", C915980Zwa.LJI().LIZ().LLJJIII());
        } else {
            ((HashMap) map).put("is_anchor_icon_show", CardStruct.IStatusCode.DEFAULT);
        }
        if (!C915980Zwa.LJI().LIZ().LJIIIZ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ((HashMap) map).put("is_sound_effect", str);
    }

    public static void LJIJJLI(Map map) {
        ((HashMap) map).put("is_two_apply_two", String.valueOf(C915980Zwa.LJII().T9() ? 1 : 0));
    }

    public static void LJIL(Map map) {
        ((HashMap) map).put("last_request_id", C915980Zwa.LJI().LIZ().LJZ());
    }

    public static void LJJII(Map map) {
        if (C1533950q1J.LJ(C915980Zwa.LJI().LJIIJ().LLIL())) {
            HashMap map2 = (HashMap) map;
            map2.put("match_label_value", C915980Zwa.LJI().LJIIJ().LLIL());
            map2.put("match_label", C915980Zwa.LJI().LJIIJ().LJJL());
        }
    }

    public static void LJJIII(Map map) {
        ((HashMap) map).put("old_channel_id", String.valueOf(C915980Zwa.LJII().js()));
    }

    public static void LJJIIJ(C474500IjA c474500IjA) {
        String str;
        String strValueOf;
        IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
        int iHD0 = iRankService.hD0();
        if (iHD0 != 1) {
            if (iHD0 != 2) {
                if (iHD0 != 3) {
                    str = "";
                } else {
                    str = "publicity_period";
                }
            } else {
                str = "campaign_period";
            }
        } else {
            str = "warm_up_period";
        }
        c474500IjA.LJJII(str, "activity_stage");
        long jGS1 = iRankService.GS1();
        if (1 <= jGS1 && jGS1 < 100) {
            strValueOf = String.valueOf(jGS1);
        } else {
            strValueOf = "99+";
        }
        c474500IjA.LJJII(strValueOf, "league_match_rank");
    }

    public static void LJJIIZ(Map map) {
        HashMap map2 = (HashMap) map;
        map2.put("current_connection_position_left", String.valueOf((C950220apo.LJIIJJI() - C915980Zwa.LJII().LJIJJ().size()) - C915980Zwa.LJIIIZ().LIZJ()));
    }

    public static void LJJIJIL(Map map) {
        String str;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && room.liveSubOnly == 1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ((HashMap) map).put("is_subscriber_only_live", str);
    }

    public static void LJJIJL(Map map) {
        HashMap map2 = (HashMap) map;
        map2.put("topic_hot", CardStruct.IStatusCode.DEFAULT);
        map2.put("is_topic_recommend", "-1");
        map2.put("topic_id", CardStruct.IStatusCode.DEFAULT);
    }

    public static void LJJIJLIJ(Map map) {
        for (Map.Entry<String, String> entry : C915980Zwa.LJI().LIZ().getTrackParams().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() > 0) {
                HashMap map2 = (HashMap) map;
                if (!map2.containsKey(key)) {
                    map2.put(key, value);
                }
            }
        }
    }

    public static Map LJJJ(String str) {
        String string;
        String string2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            string = Long.valueOf(room.getOwnerUserId()).toString();
        } else {
            string = null;
        }
        String str2 = "";
        if (string == null) {
            string = "";
        }
        if (room != null && (string2 = Long.valueOf(room.getId()).toString()) != null) {
            str2 = string2;
        }
        if (string.length() == 0 || str2.length() == 0) {
            return null;
        }
        return C2097608Jq.LJIIJ(new Pair("anchor_id", string), new Pair("room_id", str2), new Pair("entrance_position", str));
    }

    public static String LJJJJLI(String str) {
        boolean z;
        String str2;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (str2 = LJIIJJI.get(str)) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return str2;
    }

    public static String LJJJJLL(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
        if ((interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) || C0UIM.LJFF()) {
            return "more";
        }
        return "interact";
    }

    public static String LJJJLIIL(long j) {
        if (j == EnumC921080a4o.MATCH_CUP_LEVEL_ONE.getValue()) {
            return EnumC920530a3v.EOY_LV1.getValue();
        }
        if (j == EnumC921080a4o.MATCH_CUP_LEVEL_TWO.getValue()) {
            return EnumC920530a3v.EOY_LV2.getValue();
        }
        if (j == EnumC921080a4o.MATCH_CUP_FULL_LEVEL.getValue()) {
            return EnumC920530a3v.EOY_LV3.getValue();
        }
        return "";
    }

    public static String LJJJLZIJ(Long l) {
        if (l != null) {
            if (l.longValue() == 1) {
                return "following";
            }
            if (l.longValue() == 3) {
                return "followed";
            }
            if (l.longValue() == 2) {
                return "mutual_follow";
            }
            return "stranger";
        }
        return "stranger";
    }

    public static String LJJLIIIJL(Long l) {
        if (!CohostWithGuestTrackingSetting.INSTANCE.getValue().isFollowUserRoleEnabled || l == null) {
            return null;
        }
        String strLJJLIIJ = LJJLIIJ(C950220apo.LJFF());
        String strLJJLIIJ2 = LJJLIIJ(l.longValue());
        if (strLJJLIIJ == null || strLJJLIIJ2 == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_");
        sbLIZ.append(strLJJLIIJ);
        sbLIZ.append("_c_");
        sbLIZ.append(strLJJLIIJ2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJJLIIIJLJLI(RivalExtraInfo rivalExtraInfo) {
        if (C950220apo.LJII(false) == EnumC950230app.MULTI_GUEST) {
            if (rivalExtraInfo != null) {
                RivalExtraInfo.ReserveInfo reserveInfo = rivalExtraInfo.reserveInfo;
                if (reserveInfo != null && reserveInfo.replyStatus == 0) {
                    return "not_response";
                }
                RivalExtraInfo.ReserveInfo reserveInfo2 = rivalExtraInfo.reserveInfo;
                if (reserveInfo2 != null && reserveInfo2.replyStatus == 1) {
                    return "responsed";
                }
                return "";
            }
            return "";
        }
        if (rivalExtraInfo != null) {
            RivalExtraInfo.ReserveInfo reserveInfo3 = rivalExtraInfo.reserveInfo;
            if (reserveInfo3 != null && reserveInfo3.replyStatus == 1 && rivalExtraInfo.showPlayType == 0) {
                if (C955940az2.LIZ(rivalExtraInfo)) {
                    return "response_invite";
                }
                return "response_not_invite";
            }
            RivalExtraInfo.ReserveInfo reserveInfo4 = rivalExtraInfo.reserveInfo;
            if (reserveInfo4 != null && reserveInfo4.replyStatus == 0 && rivalExtraInfo.showPlayType == 0) {
                if (C955940az2.LIZ(rivalExtraInfo)) {
                    return "not_response_invite";
                }
                return "not_response_not_invite";
            }
            return "";
        }
        return "";
    }

    public static final String LJJLIIJ(long j) {
        IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        User user = new User();
        user.setId(j);
        C0JG7 c0jg7Yq = iMultiHostServiceLJII.yq(user);
        if (c0jg7Yq == null) {
            return null;
        }
        int i = C955690ayd.LIZLLL[c0jg7Yq.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return "audience";
            }
            return "guest";
        }
        return "anchor";
    }

    public static boolean LJJLIL(RivalExtraInfo rivalExtraInfo) {
        LinkerInfo linkerInfo;
        List<UserInfo> list;
        if (rivalExtraInfo != null && (linkerInfo = rivalExtraInfo.linkerInfo) != null && (list = linkerInfo.linkedGuestUsers) != null && (!list.isEmpty())) {
            return true;
        }
        return false;
    }

    public static void LJLI(C410901il c410901il) {
        int i;
        int i2;
        int i3;
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(C950220apo.LJFF()));
        int i4 = 0;
        if (c410901il != null) {
            int size = c410901il.size();
            int i5 = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            while (i4 < size) {
                Object obj = c410901il.get(i4);
                if (obj instanceof C955590ayT) {
                    C955590ayT c955590ayT = (C955590ayT) obj;
                    C955540ayO c955540ayO = c955590ayT.LJI;
                    Integer numValueOf = null;
                    if (Intrinsics.LJFF(c955540ayO, C955540ayO.LIZJ)) {
                        RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
                        if (rivalExtraInfo != null) {
                            numValueOf = Integer.valueOf(rivalExtraInfo.showPlayType);
                        }
                        int i6 = EnumC919160a1i.PLAYTYPE_APPLY.value;
                        if (numValueOf != null && numValueOf.intValue() == i6) {
                            if (c955590ayT.LIZIZ) {
                                i++;
                            }
                        } else if (c955590ayT.LIZIZ) {
                            i5++;
                        }
                    } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LIZLLL)) {
                        RivalExtraInfo rivalExtraInfo2 = c955590ayT.LJIIJ;
                        if (rivalExtraInfo2 != null) {
                            numValueOf = Integer.valueOf(rivalExtraInfo2.showPlayType);
                        }
                        int i7 = EnumC919160a1i.PLAYTYPE_APPLY.value;
                        if (numValueOf != null && numValueOf.intValue() == i7) {
                            if (c955590ayT.LIZIZ) {
                                i3++;
                            }
                        } else if (c955590ayT.LIZIZ) {
                            i2++;
                        }
                    }
                }
                i4++;
            }
            i4 = i5;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        map.put("status_change_anchor_cnts", String.valueOf(i4));
        map.put("anchor_cnts", String.valueOf(i4));
        map.put("recommend_could_inivte_cnts", String.valueOf(i2));
        map.put("recommend_could_apply_cnts", String.valueOf(i3));
        map.put("mutual_could_apply_cnts", String.valueOf(i));
        map.put("mutual_could_invite_cnts", String.valueOf(i4));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_anchor_status_refresh");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJLJI(String str) {
        Long lValueOf;
        HashMap map = new HashMap();
        map.put("action_type", str);
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ != null) {
            lValueOf = Long.valueOf(roomLIZJ.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        map.put("anchor_id", String.valueOf(C950220apo.LJ()));
        map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        map.put("uid_list", arrayList.toString());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_change_screen");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJLLLL(String str) {
        Long lValueOf;
        HashMap map = new HashMap();
        map.put("toast_type", str);
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ != null) {
            lValueOf = Long.valueOf(roomLIZJ.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        map.put("anchor_id", String.valueOf(C950220apo.LJ()));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_toast_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LLII(String str) {
        Long lValueOf;
        String str2;
        if (!C915980Zwa.LJII().LLI().isLinked() && Intrinsics.LJFF(str, "switch")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("action_type", "click");
        Room roomLIZJ = C950220apo.LIZJ();
        Long lValueOf2 = null;
        if (roomLIZJ != null) {
            lValueOf = Long.valueOf(roomLIZJ.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        map.put("anchor_id", String.valueOf(C950220apo.LJ()));
        map.put("action_type", str);
        map.put("is_multi_source", CardStruct.IStatusCode.DEFAULT);
        int i = C955690ayd.LIZ[C915980Zwa.LJII().LLLLJ().ordinal()];
        if (i != 1) {
            if (i == 2) {
                str2 = "shared_screen";
            } else {
                throw new C1954807lC();
            }
        } else {
            str2 = "camera_only";
        }
        map.put("cohost_layout_mode", str2);
        map.put("connection_channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        long jLL = C915980Zwa.LJI().LIZ().LL();
        map.put("connection_anchor_id", String.valueOf(jLL));
        map.put("duration", String.valueOf((SystemClock.elapsedRealtime() - C915980Zwa.LJI().LIZ().LLILLJJLI()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        C915980Zwa.LJI().LIZ().LJLL(SystemClock.elapsedRealtime());
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(jLL);
        if (c954460aweLLILL != null) {
            lValueOf2 = Long.valueOf(c954460aweLLILL.LJIJJLI);
        }
        map.put("anchor_relation", String.valueOf(lValueOf2));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_cohost_mode_change");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LLIIII(boolean z) {
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            idStr.toString();
            map.put("room_id", idStr);
        }
        map.put("is_open", String.valueOf(z ? 1 : 0));
        LLIILII("livesdk_anchor_live_notification_open", map);
    }

    public static void LLIIIILZ(boolean z) {
        String idStr;
        String strValueOf;
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(C950220apo.LJFF()));
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ == null || (idStr = roomLIZJ.getIdStr()) == null) {
            idStr = "";
        }
        map.put("room_id", idStr);
        if (C915980Zwa.LJFF().co0()) {
            map.put("connection_type", "manual_pk");
        } else {
            map.put("connection_type", "anchor");
        }
        map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            C954460awe c954460awe2 = c954460awe;
            if (!c954460awe2.LJI() && c954460awe2.LJIIJ()) {
                arrayList.add(c954460awe);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS34S0000000_15(20), arrayList);
        boolean zIsEmpty = listLJLLLL.isEmpty();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (zIsEmpty) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(C915980Zwa.LJII().LLLLIL(((C954460awe) ListProtector.get(listLJLLLL, 0)).LJ));
        }
        map.put("remaining_waiting_time", strValueOf);
        if (z) {
            str = "1";
        }
        map.put("is_collapse", str);
        LLIILII("livesdk_connection_management_collapse_button_click", map);
    }

    public final void LIZJ(Map<String, String> map) {
        String string;
        String string2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String str = "";
        if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        map.put("room_id", string);
        if (room != null && (string2 = Long.valueOf(room.getOwnerUserId()).toString()) != null) {
            str = string2;
        }
        map.put("anchor_id", str);
        if (C915980Zwa.LJI().LJIIJ().LIZ()) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        LJIIL(this, map, null, true, 10);
    }

    public final void LJLIL(String str) {
        Long lValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        HashMap map = new HashMap();
        String idStr = null;
        LJIIL(this, map, null, true, 10);
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        map.put("anchor_id", String.valueOf(lValueOf));
        if (room != null) {
            idStr = room.getIdStr();
        }
        map.put("room_id", String.valueOf(idStr));
        w.LIZ.getClass();
        map.put("request_id", w.LJIJI());
        map.put("banner_id", str);
        map.put("activity_name", "2023_eoy");
        LLIILII("livesdk_connection_banner_click", map);
    }

    public final void LJLILLLLZI(String str) {
        Long lValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        HashMap map = new HashMap();
        String idStr = null;
        LJIIL(this, map, null, true, 10);
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        map.put("anchor_id", String.valueOf(lValueOf));
        if (room != null) {
            idStr = room.getIdStr();
        }
        map.put("room_id", String.valueOf(idStr));
        w.LIZ.getClass();
        map.put("request_id", w.LJIJI());
        map.put("banner_id", str);
        map.put("activity_name", "2023_eoy");
        LLIILII("livesdk_connection_banner_show", map);
    }

    public final void LJZL(boolean z) {
        String str;
        HashMap map = new HashMap();
        LJJ(null, map);
        LJJIIZ(map);
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_dont_suggest_again_show", str);
        LIZIZ(map);
        LJJIJIIJI(this, map);
        LJJIJL(map);
        C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), true);
        LJJIJ(map, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        LJII(map);
        LLIILII("livesdk_disconnect_connection_popup_show", map);
    }

    public static void LJFF(Map map, boolean z) {
        if (C1533950q1J.LJ(C955580ayS.LJII)) {
            HashMap map2 = (HashMap) map;
            map2.put("pk_mapping_id", C955580ayS.LJII);
            map2.put("pk_mapping_type", C955580ayS.LJIIIIZZ);
            map2.put("pk_mapping_style", C955580ayS.LJIIIZ);
            map2.put("pk_mapping_from", C955580ayS.LJIIJ);
            map2.put("pk_mapping_position", C955580ayS.LJIIJJI);
            map2.put("if_scheduled_teammate", C955580ayS.LJIIL);
        }
        if (!z || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
            return;
        }
        C955580ayS.LJII = "";
        C955580ayS.LJIIIIZZ = "";
        C955580ayS.LJIIIZ = "";
        C955580ayS.LJIIJ = "";
        C955580ayS.LJIIJJI = "";
        C955580ayS.LJIIL = "";
        C955580ayS.LJIILIIL = null;
    }

    public static void LJIIIIZZ(long j, Map map) {
        Map<String, String> mapLLIIIILZ;
        EnumC955660aya anchorType = C915980Zwa.LJI().LIZ().getAnchorType();
        if ((anchorType != EnumC955660aya.INVITER && anchorType != EnumC955660aya.APPLY) || (mapLLIIIILZ = C915980Zwa.LJI().LIZ().LLIIIILZ(j)) == null) {
            return;
        }
        String str = mapLLIIIILZ.get("friends_type");
        if (str != null) {
            ((HashMap) map).put("friends_type", str);
        }
        String str2 = mapLLIIIILZ.get("history_display_time");
        if (str2 != null) {
            ((HashMap) map).put("history_display_time", str2);
        }
        String str3 = mapLLIIIILZ.get("history_channel_id");
        if (str3 != null) {
            ((HashMap) map).put("history_channel_id", str3);
        }
        String str4 = mapLLIIIILZ.get("history_pk_id");
        if (str4 != null) {
            ((HashMap) map).put("history_pk_id", str4);
        }
        String str5 = mapLLIIIILZ.get("history_sub_match_type");
        if (str5 != null) {
            ((HashMap) map).put("history_sub_match_type", str5);
        }
        String str6 = mapLLIIIILZ.get("history_record_rank");
        if (str6 != null) {
            ((HashMap) map).put("history_record_rank", str6);
        }
        String str7 = mapLLIIIILZ.get("history_record_position");
        if (str7 != null) {
            ((HashMap) map).put("history_record_position", str7);
        }
        String str8 = mapLLIIIILZ.get("history_record_result");
        if (str8 != null) {
            ((HashMap) map).put("history_record_result", str8);
        }
        String str9 = mapLLIIIILZ.get("history_match_cnt");
        if (str9 != null) {
            ((HashMap) map).put("history_match_cnt", str9);
        }
    }

    public static void LJIIIZ(C474500IjA c474500IjA, boolean z) {
        long id;
        String strLIZ;
        String str;
        LiveMode streamType;
        w.LIZ.getClass();
        c474500IjA.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjA.LJJII(w.LJIIL(), "enter_method");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        long ownerUserId = 0;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c474500IjA.LJJII(Long.valueOf(id), "room_id");
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null && (streamType = room2.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        c474500IjA.LJJII(strLIZ, "live_type");
        c474500IjA.LJJII(w.LIZLLL(), "action_type");
        Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room3 != null) {
            ownerUserId = room3.getOwnerUserId();
        }
        c474500IjA.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        c474500IjA.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (Intrinsics.LJFF(Boolean.valueOf(z), Boolean.TRUE)) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjA.LJJII(str, "user_type");
    }

    public static void LJIIJ(Map map, boolean z) {
        String strValueOf;
        IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        if (iMultiHostServiceLJII != null) {
            HashMap map2 = (HashMap) map;
            map2.put("current_connection_cnts", String.valueOf(iMultiHostServiceLJII.LLILZLL(true).size()));
            if (z) {
                if (C915980Zwa.LJII().LJIJJ().isEmpty()) {
                    strValueOf = "3";
                } else {
                    strValueOf = String.valueOf(4 - C915980Zwa.LJII().LJIJJ().size());
                }
                map2.put("current_position_left", strValueOf);
            }
        }
        if (!C915980Zwa.LJI().LJIIJ().LIZ()) {
            ((HashMap) map).put("current_connection_cnts", "1");
        }
    }

    public static void LJIILL(Map map, RivalExtraInfo rivalExtraInfo) {
        int i;
        String strValueOf;
        if (rivalExtraInfo != null) {
            i = rivalExtraInfo.detailBlockReason;
        } else {
            i = 0;
        }
        if (C915980Zwa.LJII().LJJLIIIJJI()) {
            strValueOf = "118";
        } else {
            strValueOf = String.valueOf(i);
        }
        ((HashMap) map).put("unclickable_reason", strValueOf);
    }

    public static final long LJIJ(Room room, String str) {
        long j;
        long jLJIIL;
        long j2;
        Room room2 = room;
        if (room2 == null) {
            room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        }
        if (room2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addIsCoHostTransfer, source=");
            sbLIZ.append(str);
            sbLIZ.append(", room == null, return");
            C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ));
            return 0L;
        }
        if (room2.getLinkMicInfo() == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addIsCoHostTransfer, source=");
            sbLIZ2.append(str);
            sbLIZ2.append(", linkMicInfo == null, return");
            C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ2));
            return 0L;
        }
        long j3 = LJJJJLI;
        if (j3 == C950220apo.LJIILLIIL(room2)) {
            long j4 = LJJJJJ;
            long j5 = LJJJJJL;
            long j6 = LJJJJL;
            long j7 = LJJJJLI;
            if (j4 > 0 && j4 != j6) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("isCoHostTransferFinished, source=");
                sbLIZ3.append(str);
                sbLIZ3.append(", isCoHostTransferFinished = false, case 1, tempPreviousCacheCoHostChannelId = ");
                sbLIZ3.append(j4);
                sbLIZ3.append(", tempLastCoHostChannelId = ");
                sbLIZ3.append(j6);
                C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ3));
            } else if (j5 > 0 && j5 == j7) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("isCoHostTransferFinished, source=");
                sbLIZ4.append(str);
                sbLIZ4.append(", isCoHostTransferFinished = false, case 2, tempPreviousCacheCoHostAnchorId = ");
                sbLIZ4.append(j5);
                sbLIZ4.append(", tempLastCoHostAnchorId = ");
                sbLIZ4.append(j7);
                C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ4));
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("isCoHostTransferFinished, source=");
                sbLIZ5.append(str);
                sbLIZ5.append(", isCoHostTransferFinished = true, case 3, tempPreviousCacheCoHostChannelId = ");
                sbLIZ5.append(j4);
                sbLIZ5.append(", tempLastCoHostChannelId = ");
                sbLIZ5.append(j6);
                sbLIZ5.append(", tempPreviousCacheCoHostAnchorId = ");
                sbLIZ5.append(j5);
                sbLIZ5.append(", tempLastCoHostAnchorId = ");
                sbLIZ5.append(j7);
                C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ5));
                j = 0;
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("addIsCoHostTransfer, source=");
            sbLIZ6.append(str);
            sbLIZ6.append(", tempAnchorId same, tempAnchorId=");
            sbLIZ6.append(j3);
            sbLIZ6.append(", return");
            C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ6));
            return 0L;
        }
        j = 0;
        long j8 = LJJJJL;
        if (C915980Zwa.LJII().getChannelId() != j) {
            jLJIIL = C915980Zwa.LJII().getChannelId();
        } else {
            if (C950220apo.LJIIL(room2) > j) {
                jLJIIL = C950220apo.LJIIL(room2);
            } else {
                RoomLinkInfo linkMicInfo = room2.getLinkMicInfo();
                if (linkMicInfo != null) {
                    jLJIIL = linkMicInfo.channelId;
                } else {
                    jLJIIL = 0;
                }
            }
            j = 0;
        }
        if (j8 != j && j8 == jLJIIL) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("addIsCoHostTransfer, source=");
        sbLIZ7.append(str);
        sbLIZ7.append(", isTransfer = ");
        sbLIZ7.append(j2);
        sbLIZ7.append(", lastCoHostChannelId = ");
        sbLIZ7.append(j8);
        sbLIZ7.append(", currentCoHostChannelId = ");
        sbLIZ7.append(jLJIIL);
        C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ7));
        return j2;
    }

    public static void LJIJI(String str, Map map) {
        String str2;
        String strLLJJ = C915980Zwa.LJI().LIZ().LLJJ();
        if (strLLJJ != null && Intrinsics.LJFF(strLLJJ, str)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        ((HashMap) map).put("is_icon_show_anchor", str2);
    }

    public static final long LJIJJ(Room room, String str) {
        boolean z;
        long jLongValue;
        long jLongValue2;
        Room room2 = room;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addIsMatchOpponent_");
        sbLIZ.append(str);
        long j = 0;
        if (LJIJ(room2, C2188811AlT.LIZIZ(sbLIZ)) == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addIsMatchOpponent, source=");
            sbLIZ2.append(str);
            sbLIZ2.append(", isCoHostTransfer = 0, return");
            C20441214yg.LJ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ2));
            return 0L;
        }
        if (room2 == null && (room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("addIsMatchOpponent, source=");
            sbLIZ3.append(str);
            sbLIZ3.append(", room == null, return");
            C20441214yg.LJ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ3));
            return 0L;
        }
        RoomLinkInfo linkMicInfo = room2.getLinkMicInfo();
        if (linkMicInfo == null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("addIsMatchOpponent, source=");
            sbLIZ4.append(str);
            sbLIZ4.append(", linkMicInfo == null, return");
            C20441214yg.LJ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ4));
            return 0L;
        }
        BattleInfoResponse battleInfoResponse = linkMicInfo.battleInfo;
        if (battleInfoResponse == null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("addIsMatchOpponent, source=");
            sbLIZ5.append(str);
            sbLIZ5.append(", battleInfo == null, return");
            C20441214yg.LJ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ5));
            return 0L;
        }
        long j2 = LJJJJLL;
        long j3 = LJJJJLI;
        Long l = battleInfoResponse.battleId;
        if (j2 != 0 && l != null && l.longValue() != 0 && j2 == l.longValue()) {
            long jLJIILLIIL = C950220apo.LJIILLIIL(room2);
            if (j3 == jLJIILLIIL) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("addIsMatchOpponent, source=");
                sbLIZ6.append(str);
                sbLIZ6.append(", tempAnchorId same, tempAnchorId=");
                sbLIZ6.append(j3);
                C20441214yg.LJ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ6));
                return 0L;
            }
            BattleSetting battleSetting = battleInfoResponse.setting;
            if (battleSetting != null && battleSetting.battleType == EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j = 1;
            } else {
                Map<Long, BattleTeamUserArmies> map = battleInfoResponse.teamArmies;
                if (map != null) {
                    jLongValue = 0;
                    jLongValue2 = 0;
                    for (Map.Entry<Long, BattleTeamUserArmies> entry : map.entrySet()) {
                        List<BattleTeamUser> list = entry.getValue().teamUsers;
                        if (list != null) {
                            Iterator<BattleTeamUser> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                BattleTeamUser next = it2.next();
                                Long l2 = next.userId;
                                if (l2 != null && jLJIILLIIL == l2.longValue()) {
                                    if (next != null) {
                                        jLongValue2 = entry.getKey().longValue();
                                    }
                                }
                            }
                        }
                        List<BattleTeamUser> list2 = entry.getValue().teamUsers;
                        if (list2 != null) {
                            Iterator<BattleTeamUser> it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    BattleTeamUser next2 = it3.next();
                                    Long l3 = next2.userId;
                                    if (l3 != null && j3 == l3.longValue()) {
                                        if (next2 != null) {
                                            jLongValue = entry.getKey().longValue();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (jLongValue2 != 0 && jLongValue != 0 && jLongValue2 != jLongValue) {
                        j = 1;
                    }
                } else {
                    jLongValue = 0;
                    jLongValue2 = 0;
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("addIsMatchOpponent, source=");
                sbLIZ7.append(str);
                sbLIZ7.append(", isMatchOpponent = ");
                sbLIZ7.append(j);
                sbLIZ7.append(", is1v1 = ");
                sbLIZ7.append(z);
                sbLIZ7.append(", curTeamId=");
                sbLIZ7.append(jLongValue2);
                sbLIZ7.append(", lastTeamId=");
                sbLIZ7.append(jLongValue);
                sbLIZ7.append(", currentRoomUserId()=");
                sbLIZ7.append(jLJIILLIIL);
                sbLIZ7.append(", tempAnchorI=");
                sbLIZ7.append(j3);
                C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ7));
            }
            C20441214yg.LJIIIZ("CoHostAppLog", "addIsMatchOpponent, source=" + str + ", isMatchOpponent = " + j + ", is1v1 = " + z);
            return j;
        }
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("addIsMatchOpponent, source=");
        sbLIZ8.append(str);
        sbLIZ8.append(", battleId not same, tempBattleId=");
        sbLIZ8.append(j2);
        sbLIZ8.append(", currentBattleId=");
        sbLIZ8.append(l);
        sbLIZ8.append(", return");
        C20441214yg.LJ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ8));
        return 0L;
    }

    public static void LJJ(List list, Map map) {
        if (list == null) {
            list = C915980Zwa.LJII().LLILZLL(true);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
        }
        LJJI(arrayList, map);
    }

    public static void LJJI(List list, Map map) {
        if (list.size() <= 1) {
            HashMap map2 = (HashMap) map;
            map2.put("current_connection_cnts", CardStruct.IStatusCode.DEFAULT);
            map2.put("uid_list", Collections.emptyList().toString());
        } else {
            HashMap map3 = (HashMap) map;
            map3.put("current_connection_cnts", String.valueOf(list.size()));
            map3.put("uid_list", list.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZI(X.C955540ayO r7, java.util.Map r8) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LJJIIZI(X.0ayO, java.util.Map):void");
    }

    public static void LJJIJIIJI(C955400ayA c955400ayA, Map map) {
        String str;
        C951420ark c951420arkLLFF = C915980Zwa.LJI().LIZ().LLFF();
        c955400ayA.getClass();
        if (c951420arkLLFF == null || (str = c951420arkLLFF.LIZ) == null) {
            str = "";
        }
        ((HashMap) map).put("cohost_invite_request_from", str);
    }

    public static void LJJIJIIJIL(Map map, EnumC955760ayk enumC955760ayk) {
        Object obj;
        Object obj2;
        int[] iArr = C955690ayd.LIZIZ;
        int i = iArr[enumC955760ayk.ordinal()];
        String str = CardStruct.IStatusCode.DEFAULT;
        if (i != 1) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap map2 = (HashMap) map;
        map2.put("is_shared_screen", obj);
        if (iArr[enumC955760ayk.ordinal()] == 2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_shared_screen_description", obj2);
        if (iArr[enumC955760ayk.ordinal()] == 3) {
            str = "1";
        }
        map2.put("is_shared_screen_education", str);
    }

    public static void LJJIL(C410901il c410901il, Map map) {
        long j;
        String str;
        OptPairInfo optPairInfo;
        OptPairInfo optPairInfo2;
        if (c410901il == null) {
            return;
        }
        for (Object obj : c410901il) {
            if (obj instanceof C958360b2w) {
                C958360b2w c958360b2w = (C958360b2w) obj;
                if (c958360b2w.LIZIZ) {
                    OptPairInfo optPairInfo3 = c958360b2w.LJ.optPairInfo;
                    long j2 = 0;
                    if (optPairInfo3 != null) {
                        j = optPairInfo3.mappingId;
                    } else {
                        j = 0;
                    }
                    HashMap map2 = (HashMap) map;
                    map2.put("pk_mapping_id", String.valueOf(j));
                    BattleOptPair battleOptPair = c958360b2w.LJ;
                    Long lValueOf = null;
                    if (battleOptPair != null && (optPairInfo2 = battleOptPair.optPairInfo) != null) {
                        lValueOf = Long.valueOf(optPairInfo2.optPairType);
                    }
                    map2.put("pk_mapping_type", C958270b2n.LIZ(lValueOf));
                    BattleOptPair battleOptPair2 = c958360b2w.LJ;
                    if ((battleOptPair2 != null && battleOptPair2.inviteBlockReason > 0) || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
                        str = "unclickable";
                    } else if (C958270b2n.LIZJ(c958360b2w)) {
                        str = "can_invite";
                    } else {
                        str = "can_join";
                    }
                    map2.put("pk_mapping_status", str);
                    BattleOptPair battleOptPair3 = c958360b2w.LJ;
                    if (battleOptPair3 != null && (optPairInfo = battleOptPair3.optPairInfo) != null) {
                        j2 = optPairInfo.expectedTimeSec;
                    }
                    map2.put("pk_pairing_time_left", String.valueOf(j2 - C158B.LIZJ()));
                    return;
                }
            }
        }
    }

    public static void LJJIZ(Map map, boolean z) {
        String str;
        HashMap map2 = (HashMap) map;
        if (Intrinsics.LJFF(map2.get("invitee_list"), "random_match") || Intrinsics.LJFF(map2.get("invitee_list"), "recommend")) {
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_tag", str);
        }
    }

    public static void LJJJIL(long j, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C915980Zwa.LJI().LIZ().LJJII().put(Long.valueOf(j), linkedHashMap);
        HashMap map2 = (HashMap) map;
        Object obj = map2.get("is_tag");
        if (obj != null) {
            linkedHashMap.put("is_tag", obj);
        }
        Object obj2 = map2.get("interest_tag");
        if (obj2 != null) {
            linkedHashMap.put("interest_tag", obj2);
        }
    }

    public static void LJJJJJ(C943870afZ c943870afZ, Function0 function0) {
        C943870afZ enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom();
        C915980Zwa.LJI().LIZ().LJIIJ(c943870afZ);
        function0.invoke();
        C915980Zwa.LJI().LIZ().LJIIJ(enterFrom);
    }

    public static C474500IjA LJJJJL(Room room, String str) {
        Object obj;
        Object obj2;
        long j;
        long j2;
        long j3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("anchor", "connection_type");
        c474500IjALIZ.LJJII(C915980Zwa.LIZLLL().oE2(), "core_connection_type");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        String str2 = "1";
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).n42(room)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_lineup_status");
        if (!C915980Zwa.LJI().LJIIIZ().LIZ().isEmpty()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "is_shared_screen");
        c474500IjALIZ.LJJIIZI(C915980Zwa.LIZLLL().sR(0L, false));
        long j4 = C946250ajP.LIZIZ;
        if (j4 > 0) {
            j = C946250ajP.LIZLLL + (jElapsedRealtime - j4);
        } else {
            j = C946250ajP.LIZLLL;
        }
        long j5 = LSPassThroughRecordSizeConfig.DEFAULT;
        c474500IjALIZ.LJJII(String.valueOf(j / j5), "watch_guest_connection_duration");
        long j6 = C946250ajP.LIZJ;
        if (j6 > 0) {
            j2 = C946250ajP.LJ + (jElapsedRealtime - j6);
        } else {
            j2 = C946250ajP.LJ;
        }
        c474500IjALIZ.LJJII(String.valueOf(j2 / j5), "watch_own_guest_connection_duration");
        if (!C946250ajP.LJII) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_enlarge_mode");
        long j7 = C946250ajP.LJFF;
        if (j7 > 0) {
            j3 = C946250ajP.LJI + (jElapsedRealtime - j7);
        } else {
            j3 = C946250ajP.LJI;
        }
        c474500IjALIZ.LJJII(String.valueOf(j3 / j5), "watch_enlarge_duration");
        if (room != null) {
            long ownerUserId = room.getOwnerUserId();
            if (ownerUserId != 0) {
                c474500IjALIZ.LJJII(String.valueOf(ownerUserId), "anchor_id");
            }
        }
        return c474500IjALIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJJJZ(com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo r2, X.EnumC955720ayg r3) {
        /*
            if (r2 == 0) goto L3b
            int r0 = r2.showPlayType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L3b
            int r0 = r2.intValue()
            if (r0 == 0) goto L38
            int r1 = r2.intValue()
            r0 = 3
            if (r1 == r0) goto L38
            int r1 = r2.intValue()
            r0 = 4
            if (r1 == r0) goto L38
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L2e
            java.lang.String r1 = "apply"
        L27:
            X.0ayg r0 = X.EnumC955720ayg.INVITING
            if (r3 != r0) goto L2d
            java.lang.String r1 = "withdraw"
        L2d:
            return r1
        L2e:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L3b
            java.lang.String r1 = "reserve"
            goto L27
        L38:
            java.lang.String r1 = "invite"
            goto L27
        L3b:
            java.lang.String r1 = ""
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LJJJJZ(com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo, X.0ayg):java.lang.String");
    }

    public static String LJJJLL(RivalExtraInfo rivalExtraInfo, C955540ayO c955540ayO) {
        if (!Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIIZI)) {
            if (rivalExtraInfo != null) {
                TagV2 tagV2 = rivalExtraInfo.tagV2;
                if (tagV2 != null && tagV2.tagClassification == 4) {
                    return "2023_eoy";
                }
                long j = 0;
                if (rivalExtraInfo != null && rivalExtraInfo.eoyLevel > 0) {
                    if (rivalExtraInfo != null) {
                        j = rivalExtraInfo.eoyLevel;
                    }
                    return LJJJLIIL(j);
                }
                return "";
            }
            return "";
        }
        return "2023_eoy";
    }

    public static String LJJL(Long l, String str) {
        long jLongValue;
        boolean z;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && jLongValue > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rid:");
            sbLIZ.append(str);
            sbLIZ.append("|uid:");
            sbLIZ.append(jLongValue);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("rid:");
            sbLIZ2.append(str);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (jLongValue > 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("uid:");
            sbLIZ3.append(jLongValue);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return "";
    }

    public static String LJJLI(int i, boolean z) {
        if (i != 1 && i != C955540ayO.LJJJJIZL.LIZ) {
            if (i == C955540ayO.LJII.LIZ) {
                return "official_channel_allowlist";
            }
            if (i == C955540ayO.LJIIIZ.LIZ) {
                return "reservation_card";
            }
            if (i != C955540ayO.LJIIJ.LIZ && i != C955540ayO.LJIIJJI.LIZ) {
                if (i == C955540ayO.LJJIIZI.LIZ) {
                    return "2023_eoy";
                }
                if (i == C955540ayO.LJJIJIIJIL.LIZ) {
                    return "cohost_history";
                }
                if (i == C955540ayO.LJJIJL.LIZ) {
                    if (z) {
                        return "find_kings";
                    }
                    return "recommend";
                }
                if (i == C955540ayO.LJJIJLIJ.LIZ) {
                    if (z) {
                        return "find_knights";
                    }
                    return "recommend";
                }
                if (i == C955540ayO.LJJIL.LIZ) {
                    if (z) {
                        return "kings_ranking";
                    }
                    return "recommend";
                }
                if (i == C955540ayO.LJJIZ.LIZ) {
                    if (z) {
                        return "knights_ranking";
                    }
                    return "recommend";
                }
                if (i == C955540ayO.LJJJ.LIZ) {
                    return "league_match_cohost_search";
                }
                if (i == C955540ayO.LJJJZ.LIZ) {
                    return "friends_ranking_cohost_search";
                }
                if (i == C955540ayO.LJJJI.LIZ) {
                    return "league_match_cohost_recommended";
                }
                if (i == C955540ayO.LJJJJL.LIZ) {
                    return "suggest_creator";
                }
                if (i == C955540ayO.LJJJJLI.LIZ) {
                    return C973660bRc.LJJLJ;
                }
                if (i == C955540ayO.LJJJJLL.LIZ) {
                    return C973660bRc.LJJLJLI;
                }
                if (i == C955540ayO.LJJJJZ.LIZ) {
                    return C973660bRc.LJJLL;
                }
                if (i == C955540ayO.LJJJLIIL.LIZ) {
                    return "full_screen_friends";
                }
                if (i == C955540ayO.LJJJLL.LIZ || i == C955540ayO.LJJJLZIJ.LIZ) {
                    return "full_screen_quick_invite";
                }
                return "recommend";
            }
            return "scheduled";
        }
        return "mutual_follow";
    }

    public static String LJJLIIIIJ(Long l, String str) {
        String str2;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0 && (str2 = LJIIL.get(Long.valueOf(jLongValue))) != null) {
                return str2;
            }
        }
        return LJJJJLI(str);
    }

    public static void LJJLL(String str, boolean z) {
        String str2;
        Long lValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_connection_open");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_open");
        String idStr = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        if (room != null) {
            idStr = room.getIdStr();
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        c474500IjALIZ.LJJII(str, "click_type");
        if (!LJJLJ()) {
            c474500IjALIZ.LJJII("settings", "enter_from");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJZ(String str, boolean z) {
        String str2;
        Long lValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_connection_recommend_open");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_open");
        String idStr = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        if (room != null) {
            idStr = room.getIdStr();
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        c474500IjALIZ.LJJII(str, "click_type");
        if (!LJJLJ()) {
            c474500IjALIZ.LJJII("settings", "enter_from");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJL(long j, String str) {
        Long lValueOf;
        String strOE2;
        String str2;
        HashMap map = new HashMap();
        map.put("connection_inviter_id", String.valueOf(j));
        map.put("anchor_id", String.valueOf(C950220apo.LJFF()));
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ != null) {
            lValueOf = Long.valueOf(roomLIZJ.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        map.put("connection_type", "anchor");
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService == null || (strOE2 = iInteractService.oE2()) == null) {
            strOE2 = "";
        }
        map.put("core_connection_type", strOE2);
        C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        if (LiveCoHostInvitationTimeLimitSettings.INSTANCE.timeLimited()) {
            str2 = "10min";
        } else {
            str2 = "for_this_live";
        }
        map.put("turn_off_type", str2);
        map.put("click_type", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_invitation_turn_off_pop_up_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LLIIJLIL(String str, boolean z) {
        int i;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            idStr.toString();
            map.put("room_id", idStr);
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("is_open", String.valueOf(i));
        map.put("switch_name", str);
        LLIILII("livesdk_cohost_setting_click", map);
    }

    public static final void LLIILII(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        InterfaceC954910axN.LIZ.getClass();
        C958790b3d.LIZ("CoHostAppLog", "event_tracking").LIZIZ(new AwS66S1000000_15(str, 5));
    }

    public final boolean LJLIIIL(long j, String str) {
        ArrayList arrayList;
        boolean z;
        HashMap map = new HashMap();
        map.put("connection_type", "anchor");
        map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
        map.put("turnover_type", str);
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        int i = 0;
        if (TextUtils.equals(str, "create")) {
            List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
            arrayList = new ArrayList();
            for (C954460awe c954460awe : listLJIJJ) {
                C954460awe c954460awe2 = c954460awe;
                if (c954460awe2.LJJIIZ == EnumC950200apm.LINKED && !c954460awe2.LJI()) {
                    arrayList.add(c954460awe);
                }
            }
        } else if (TextUtils.equals(str, "left") && C915980Zwa.LJI().LIZ().LJJIZ().size() > 0) {
            arrayList = new ArrayList();
            List<Object> listLJJIZ = C915980Zwa.LJI().LIZ().LJJIZ();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listLJJIZ) {
                if (!((C954460awe) obj).LJI()) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            C915980Zwa.LJI().LIZ().LJJIZ().clear();
        } else {
            List<C954460awe> listLJIJJ2 = C915980Zwa.LJII().LJIJJ();
            arrayList = new ArrayList();
            for (C954460awe c954460awe3 : listLJIJJ2) {
                C954460awe c954460awe4 = c954460awe3;
                if (c954460awe4.LJJIIZ == EnumC950200apm.LINKED && (!TextUtils.equals(str, "left") || c954460awe4.LJ != j)) {
                    arrayList.add(c954460awe3);
                }
            }
        }
        boolean zLLLFFI = C915980Zwa.LJI().LIZ().LLLFFI();
        map.put("is_shared_screen_before", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLLLFFI)) ? 1 : 0));
        map.put("is_shared_screen_after", LJJLIIIJ());
        InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
        if (CastIntegerProtector.parseInt(LJJLIIIJ()) > 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC955420ayCLIZ.LLILZLL(z);
        LJJ(arrayList, map);
        if (TextUtils.equals(str, "create")) {
            map.put("current_connection_cnts", String.valueOf(arrayList.size()));
            map.put("uid_list", String.valueOf(C950220apo.LJFF()));
        }
        LJJIJIIJI(this, map);
        LJJIJL(map);
        C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), true);
        LJJIJ(map, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        LJII(map);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((C954460awe) it2.next()).LJIJJLI != 2) {
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (((C954460awe) it3.next()).LJIJJLI == 2) {
                                i = 2;
                                break;
                            }
                        }
                    }
                }
            }
            i = 1;
        } else {
            i = 1;
        }
        map.put("follow_status", String.valueOf(i));
        map.put("turnover_anchor_id", String.valueOf(j));
        LLIILII("livesdk_connection_anchor_turnover", map);
        return zLLLFFI;
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x068b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLL(java.util.Map r28, com.bytedance.android.livesdkapi.depend.model.live.Room r29) {
        /*
            Method dump skipped, instruction units count: 1753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LJLLL(java.util.Map, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    public final void LJZI(String str, boolean z) {
        String str2;
        HashMap map = new HashMap();
        LJJ(null, map);
        LJJIIZ(map);
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_dont_suggest_again_show", str2);
        map.put("selection", str);
        map.put("anchor_id", String.valueOf(C950220apo.LJFF()));
        LIZIZ(map);
        LJJIJIIJI(this, map);
        LJJIJL(map);
        C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), true);
        LJJIJ(map, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        LJII(map);
        LLIILII("livesdk_disconnect_connection_popup_click", map);
    }

    public final void LLIIIJ(long j, long j2) {
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            idStr.toString();
            map.put("room_id", idStr);
        }
        LJIIL(this, map, null, false, 14);
        map.put("from_anchor_id", String.valueOf(j));
        map.put("is_reservation_sender", CardStruct.IStatusCode.DEFAULT);
        LJIIL(this, map, null, false, 14);
        map.put("reservation_id", String.valueOf(j2));
        LLIILII("livesdk_connection_disconnect_popup", map);
    }

    public static void LJIIJJI(String str, String str2, Map map) {
        Long lValueOf;
        HashMap map2 = (HashMap) map;
        map2.put("dismiss_reason", str2);
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map2.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        } else if (C500260Jjc.LJJIIZ(str)) {
            map2.put("channel_id", String.valueOf(str));
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        map2.put("anchor_id", String.valueOf(lValueOf));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        map2.put("room_id", String.valueOf(lValueOf2));
    }

    public static void LJIILIIL(Map map, GiftGalleryBadgeInfo giftGalleryBadgeInfo, String str) {
        String str2;
        String str3;
        GiftGalleryBadgeSection giftGalleryBadgeSection;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText;
        GiftGalleryBadgeSection giftGalleryBadgeSection2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_");
        sbLIZ.append(str);
        sbLIZ.append("_all_lit_up");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (giftGalleryBadgeInfo != null && (giftGalleryBadgeSection2 = giftGalleryBadgeInfo.galleryInfo) != null && giftGalleryBadgeSection2.shouldShow) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap map2 = (HashMap) map;
        map2.put(strLIZIZ, str2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_league_ranking");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (giftGalleryBadgeInfo == null || (giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo) == null || (linkMicGiftGalleryDisplayText = giftGalleryBadgeSection.displayText) == null || (str3 = linkMicGiftGalleryDisplayText.content) == null) {
            str3 = "";
        }
        map2.put(strLIZIZ2, str3);
    }

    public static void LJJIFFI(Map map, RivalExtraInfo rivalExtraInfo, boolean z) {
        String str;
        RivalExtraInfo.BattleInfo battleInfo;
        String str2;
        String str3 = "";
        if (rivalExtraInfo == null || (battleInfo = rivalExtraInfo.battleInfo) == null) {
            str = "";
        } else {
            if (battleInfo.infoType == 0) {
                str2 = "";
            } else {
                String strValueOf = String.valueOf(battleInfo.value);
                int i = battleInfo.infoType;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                str3 = "win_streaks";
                            }
                        } else {
                            str3 = "last_match_points";
                        }
                    } else {
                        str3 = "highest_match_points";
                    }
                } else {
                    str3 = "avg_match_points";
                }
                str2 = str3;
                str3 = strValueOf;
            }
            str = str3;
            str3 = str2;
        }
        if (C1533950q1J.LJ(str3)) {
            HashMap map2 = (HashMap) map;
            map2.put("match_label_value", str);
            map2.put("match_label", str3);
        }
        if (z) {
            String strLLIL = C915980Zwa.LJI().LJIIJ().LLIL();
            if (strLLIL == null || strLLIL.length() == 0) {
                C915980Zwa.LJI().LJIIJ().LJJIIZ(str);
                C915980Zwa.LJI().LJIIJ().LJJLL(str3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJZLJL(java.util.Map<java.lang.String, java.lang.String> r13, com.bytedance.android.livesdkapi.depend.model.live.Room r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LJJIIJZLJL(java.util.Map, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }

    public static final void LJJJI(long j, long j2, boolean z) {
        boolean z2;
        long j3 = LJJJJL;
        long j4 = LJJJJLI;
        if (j3 == j && j4 == j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2) {
                LJJJJ();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cacheIsCoHostTransfer, return, case 1, isFromLinked=");
            sbLIZ.append(z);
            sbLIZ.append(", lastCoHostChannelId = ");
            sbLIZ.append(LJJJJL);
            sbLIZ.append(", lastCoHostAnchorId = ");
            sbLIZ.append(LJJJJLI);
            sbLIZ.append(", previousCacheCoHostChannelId=");
            sbLIZ.append(LJJJJJ);
            sbLIZ.append(", previousCacheCoHostAnchorId=");
            sbLIZ.append(LJJJJJL);
            C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (z2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cacheIsCoHostTransfer, return, case 2, isFromLinked=");
            sbLIZ2.append(z);
            sbLIZ2.append(", lastCoHostChannelId = ");
            sbLIZ2.append(LJJJJL);
            sbLIZ2.append(", lastCoHostAnchorId = ");
            sbLIZ2.append(LJJJJLI);
            sbLIZ2.append(", previousCacheCoHostChannelId=");
            sbLIZ2.append(LJJJJJ);
            sbLIZ2.append(", previousCacheCoHostAnchorId=");
            sbLIZ2.append(LJJJJJL);
            C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        LJJJJJ = j3;
        LJJJJJL = j4;
        LJJJJL = j;
        LJJJJLI = j2;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("cacheIsCoHostTransfer, isFromLinked=");
        sbLIZ3.append(z);
        sbLIZ3.append(", lastCoHostChannelId = ");
        sbLIZ3.append(LJJJJL);
        sbLIZ3.append(", lastCoHostAnchorId = ");
        sbLIZ3.append(LJJJJLI);
        sbLIZ3.append(", previousCacheCoHostChannelId=");
        sbLIZ3.append(LJJJJJ);
        sbLIZ3.append(", previousCacheCoHostAnchorId=");
        sbLIZ3.append(LJJJJJL);
        C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static String LJJLIIIJILLIZJL(String str, String str2, Map map) {
        String str3;
        Object obj = ((HashMap) map).get(str);
        if ((obj instanceof String) && (str3 = (String) obj) != null && str3.length() > 0) {
            return str3;
        }
        return str2;
    }

    public static void LJJZZI(String str, String str2, boolean z) {
        int i;
        HashMap map = new HashMap();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("is_clickable", String.valueOf(i));
        if (!z) {
            map.put("unclickable_reason", str);
        }
        map.put("invitee_list", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_profile_invite_icon_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJLJJLL(int i, long j, long j2) {
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            idStr.toString();
            map.put("room_id", idStr);
        }
        map.put("sdk_version", C465680INy.LIZ());
        map.put("connection_inviter_id", String.valueOf(j));
        map.put("connection_invitee_id", String.valueOf(j2));
        map.put("reject_reason", String.valueOf(i));
        LLIILII("livesdk_connection_reject_toast_show", map);
    }

    public static void LJLJL(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("anchor_id", str);
        map.put("to_anchor_id", str2);
        map.put("room_id", str3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_reservation_click");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJLJLLL(Room room, C955590ayT c955590ayT, String str) {
        Long lValueOf;
        HashMap map = new HashMap();
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        map.put("anchor_id", String.valueOf(lValueOf));
        map.put("to_anchor_id", String.valueOf(c955590ayT.LJ.getOwnerUserId()));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        map.put("room_id", String.valueOf(lValueOf2));
        map.put("reservation_id", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_reservation_send_success");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJLLLLLL(long r12, com.bytedance.ies.sdk.datachannel.DataChannel r14, java.util.List<java.lang.Long> r15) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LJLLLLLL(long, com.bytedance.ies.sdk.datachannel.DataChannel, java.util.List):void");
    }

    public static void LLIIIZ(com.bytedance.android.livesdk.model.message.OptPairInfo optPairInfo, String str, String str2) {
        Long lValueOf;
        Long lValueOf2;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        map.put("show_type", str);
        Long lValueOf3 = null;
        if (optPairInfo != null) {
            lValueOf = Long.valueOf(optPairInfo.mappingId);
        } else {
            lValueOf = null;
        }
        map.put("pk_mapping_id", String.valueOf(lValueOf));
        if (optPairInfo != null) {
            lValueOf2 = Long.valueOf(optPairInfo.optPairType);
        } else {
            lValueOf2 = null;
        }
        map.put("pk_mapping_type", C958270b2n.LIZ(lValueOf2));
        map.put("pk_mapping_guide_type", str2);
        map.put("before_connection_status", LJJJJZI());
        if (room != null) {
            lValueOf3 = Long.valueOf(room.getOwnerUserId());
        }
        map.put("anchor_id", String.valueOf(lValueOf3));
        map.put("guide_type", "");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_live_notification_popup_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.0ayA] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.13BV] */
    public final void LJLLJ(Room room, List<LinkUser> list, boolean z) {
        long j;
        C954460awe next;
        long j2;
        long jLJJI;
        LinkUser next2;
        Long l;
        int iIntValue;
        LinkUser next3;
        Long l2;
        int i;
        Object obj;
        long j3;
        C954460awe next4;
        String str;
        GiftGalleryBadgeInfo giftGalleryBadgeInfo;
        LinkUser next5;
        long jLongValue;
        Long l3;
        ?? arrayList;
        boolean z2;
        String str2 = "";
        if (C915980Zwa.LJI().LIZ().LJLIL() && !z) {
            if (C915980Zwa.LJI().LIZ().LJLIL()) {
                List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                C915160ZvG c915160ZvG = LJIJJ;
                if (c915160ZvG.LIZ.size() <= 1) {
                    arrayList = C915160ZvG.LIZIZ;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (C954460awe c954460awe : listLLILZLL) {
                        C954460awe c954460awe2 = c954460awe;
                        if (!c915160ZvG.LIZ.contains(Long.valueOf(c954460awe2.LJ)) && (c954460awe2.LJJIIZI || c954460awe2.LJJIJIL)) {
                            arrayList2.add(c954460awe);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
                        }
                    } else {
                        arrayList = C915160ZvG.LIZIZ;
                    }
                }
                LJIJJ.LIZ(listLLILZLL);
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() == 2 && listLLILZLL.size() == 4) {
                        return;
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        long jLongValue2 = ((Number) it3.next()).longValue();
                        C955400ayA c955400ayA = LIZ;
                        HashMap map = new HashMap();
                        String str3 = LJI.get("invited_room_id");
                        if (str3 != null) {
                            map.put("invited_room_id", str3);
                        }
                        if (C500260Jjc.LJJIIZ(C915980Zwa.LJI().LIZ().LLJJJJ(jLongValue2))) {
                            map.put("request_id", C915980Zwa.LJI().LIZ().LLJJJJ(jLongValue2));
                        } else {
                            String str4 = LJI.get("request_id");
                            if (str4 != null) {
                                map.put("request_id", str4);
                            }
                        }
                        String str5 = LJI.get("is_change_pairing");
                        if (str5 != null) {
                            map.put("is_change_pairing", str5);
                        }
                        String str6 = LJI.get("is_system_rematching");
                        if (str6 != null) {
                            map.put("is_system_rematching", str6);
                        }
                        String str7 = LJI.get("random_match_waiting_time");
                        if (str7 != null) {
                            map.put("random_match_waiting_time", str7);
                        }
                        String str8 = LJI.get("invite_to_success_dur");
                        if (str8 != null) {
                            map.put("invite_to_success_dur", str8);
                        }
                        String str9 = LJI.get("live_icon_show_time");
                        if (str9 != null) {
                            map.put("live_icon_show_time", str9);
                        }
                        String str10 = LJI.get("is_multi_bubble_guide");
                        if (str10 != null) {
                            map.put("is_multi_bubble_guide", str10);
                        }
                        String str11 = LJI.get("channel_id");
                        if (str11 != null) {
                            map.put("channel_id", str11);
                        }
                        String str12 = LJI.get("old_channel_id");
                        if (str12 != null) {
                            map.put("old_channel_id", str12);
                        }
                        String str13 = LJI.get("current_connection_cnts");
                        if (str13 != null) {
                            map.put("before_connection_cnts", str13);
                        }
                        map.put("before_connection_status", "anchor");
                        map.put("time_stamp", String.valueOf(System.currentTimeMillis()));
                        map.put("overload_score", ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL());
                        String logId = C915980Zwa.LJI().LIZ().getLogId();
                        if (logId == null) {
                            logId = "";
                        }
                        map.put("log_id", logId);
                        map.put("connection_type", "anchor");
                        map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
                        EnumC955660aya enumC955660ayaLLI = C915980Zwa.LJI().LIZ().LLI();
                        EnumC955660aya enumC955660aya = EnumC955660aya.HANDLER;
                        if (enumC955660ayaLLI == enumC955660aya) {
                            map.put("anchor_type", enumC955660aya.getLabel());
                            map.put("connection_inviter_id", String.valueOf(jLongValue2));
                            map.put("connection_invitee_id", String.valueOf(C950220apo.LJ()));
                        } else {
                            map.put("anchor_type", EnumC955660aya.INVITER.getLabel());
                            map.put("connection_inviter_id", String.valueOf(C950220apo.LJ()));
                            map.put("connection_invitee_id", String.valueOf(jLongValue2));
                        }
                        map.put("right_user_id", String.valueOf(jLongValue2));
                        LJJIJIL(map);
                        EnumC955660aya anchorType = C915980Zwa.LJI().LIZ().getAnchorType();
                        C955540ayO c955540ayOLJIILLIIL = C915980Zwa.LJI().LIZ().LJIILLIIL();
                        if (anchorType != EnumC955660aya.INVITEE) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C955410ayB.LIZLLL(map, c955540ayOLJIILLIIL, z2);
                        LJIIJ(map, true);
                        LJIIZILJ(map);
                        LJIIL(c955400ayA, map, null, false, 14);
                        LJ(map);
                        if (C915980Zwa.LJI().LIZ().LJIIZILJ() != EnumC955660aya.IDLE) {
                            map.put("actual_anchor_type", C915980Zwa.LJI().LIZ().LJIIZILJ().getLabel());
                        }
                        if (!z2) {
                            map.remove("notice_type");
                        }
                        if (Intrinsics.LJFF(map.get("notice_type"), "appointment_popup")) {
                            C944220ag8.LIZIZ = true;
                        }
                        List<C954460awe> listLLILZLL2 = C915980Zwa.LJII().LLILZLL(true);
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLLILZLL2, 10));
                        Iterator<C954460awe> it4 = listLLILZLL2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(Long.valueOf(it4.next().LJ));
                        }
                        map.put("current_connection_cnts", String.valueOf(arrayList3.size()));
                        map.put("uid_list", arrayList3.toString());
                        LJJIIZI(c955540ayOLJIILLIIL, map);
                        LJJIJIIJI(c955400ayA, map);
                        LJIL(map);
                        c955400ayA.LJJIJ(map, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
                        LJFF(map, false);
                        C927870aFl.LIZ(C915980Zwa.LJI().LIZ().LLILLL(), map);
                        LLIILII("livesdk_connection_success_more", map);
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (list.size() >= 2) {
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<LinkUser> it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList4.add(it5.next().userId);
            }
            if (arrayList4.contains(Long.valueOf(C950220apo.LJFF()))) {
                LJIJJ.LIZ(C915980Zwa.LJII().LLILZLL(true));
                C957420b1Q.LIZ = SystemClock.elapsedRealtime();
                C957420b1Q.LIZIZ = false;
                C915980Zwa.LJI().LIZ().LJLL(SystemClock.elapsedRealtime());
                C915980Zwa.LJI().LIZ().LLJI(true);
                EnumC955660aya enumC955660ayaLJIIZILJ = C915980Zwa.LJI().LIZ().LJIIZILJ();
                if (enumC955660ayaLJIIZILJ == EnumC955660aya.INVITER) {
                    if (C915980Zwa.LJI().LIZ().LJLLLLLL() == 0) {
                        C915980Zwa.LJI().LIZ().LIZLLL(C950220apo.LJFF());
                    }
                    InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
                    Iterator<LinkUser> it6 = list.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            next5 = it6.next();
                            Long l4 = next5.userId;
                            long jLJFF = C950220apo.LJFF();
                            if (l4 == null || l4.longValue() != jLJFF) {
                                break;
                            }
                        } else {
                            next5 = null;
                            break;
                        }
                    }
                    LinkUser linkUser = next5;
                    if (linkUser != null && (l3 = linkUser.userId) != null) {
                        jLongValue = l3.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    interfaceC955420ayCLIZ.LLJLIL(jLongValue);
                } else if (enumC955660ayaLJIIZILJ == EnumC955660aya.INVITEE) {
                    InterfaceC955420ayC interfaceC955420ayCLIZ2 = C915980Zwa.LJI().LIZ();
                    Iterator<C954460awe> it7 = C915980Zwa.LJII().LLILZLL(true).iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            next = it7.next();
                            C954460awe c954460awe3 = next;
                            if (c954460awe3.LJ != C950220apo.LJFF() && c954460awe3.LJIIJJI()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C954460awe c954460awe4 = next;
                    if (c954460awe4 != null) {
                        j2 = c954460awe4.LJ;
                    } else {
                        j2 = 0;
                    }
                    interfaceC955420ayCLIZ2.LIZLLL(j2);
                } else if (enumC955660ayaLJIIZILJ == EnumC955660aya.APPLY) {
                    InterfaceC955420ayC interfaceC955420ayCLIZ3 = C915980Zwa.LJI().LIZ();
                    C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
                    if (c954460aweLLILL != null) {
                        j = c954460aweLLILL.LJII;
                    } else {
                        j = 0;
                    }
                    interfaceC955420ayCLIZ3.LLJLIL(j);
                }
                EnumC955660aya enumC955660aya2 = EnumC955660aya.INVITER;
                if (enumC955660ayaLJIIZILJ != enumC955660aya2 && enumC955660ayaLJIIZILJ != EnumC955660aya.APPLY) {
                    if (enumC955660ayaLJIIZILJ == EnumC955660aya.INVITEE) {
                        C915980Zwa.LJI().LIZ().LJLJJL(C915980Zwa.LJI().LIZ().LJLLLLLL());
                        C915980Zwa.LJI().LIZ().LLJJIJIIJIL(C950220apo.LJFF());
                        InterfaceC955420ayC interfaceC955420ayCLIZ4 = C915980Zwa.LJI().LIZ();
                        JoinGroupMessageExtra.RivalExtra rivalExtraLLLF = C915980Zwa.LJI().LIZ().LLLF();
                        if (rivalExtraLLLF != null) {
                            giftGalleryBadgeInfo = rivalExtraLLLF.giftGalleryBadgeInfo;
                        } else {
                            giftGalleryBadgeInfo = null;
                        }
                        interfaceC955420ayCLIZ4.LLIZ(giftGalleryBadgeInfo);
                        LJFF = "";
                        jLJJI = C915980Zwa.LJI().LIZ().LJLLLLLL();
                    } else {
                        jLJJI = 0;
                    }
                } else {
                    C915980Zwa.LJI().LIZ().LJLJJL(C950220apo.LJFF());
                    C915980Zwa.LJI().LIZ().LLJJIJIIJIL(C915980Zwa.LJI().LIZ().LJJI());
                    C915980Zwa.LJI().LIZ().LLIZ(LJJIII.get(Long.valueOf(C915980Zwa.LJI().LIZ().LJJI())));
                    String str14 = LJJIIJ.get(Long.valueOf(C915980Zwa.LJI().LIZ().LJJI()));
                    if (str14 == null) {
                        str14 = "";
                    }
                    LJFF = str14;
                    jLJJI = C915980Zwa.LJI().LIZ().LJJI();
                }
                if (C1697810uHb.LJIIJJI(enumC955660aya2, EnumC955660aya.APPLY).contains(enumC955660ayaLJIIZILJ) && (str = LJJIIJ.get(Long.valueOf(C915980Zwa.LJI().LIZ().LJJI()))) != null) {
                    str2 = str;
                }
                LJFF = str2;
                HashMap map2 = new HashMap();
                if (C915980Zwa.LJI().LJIIJ().LIZ()) {
                    map2.put("live_icon_show_time", "during_connection");
                    LJIIJ(map2, true);
                } else {
                    map2.put("live_icon_show_time", "single_live");
                }
                LJIIZILJ(map2);
                Map<Long, Integer> map3 = LIZIZ;
                Iterator<LinkUser> it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next2 = it8.next();
                        Long l5 = next2.userId;
                        if (l5 != null && l5.longValue() == jLJJI) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                LinkUser linkUser2 = next2;
                if (linkUser2 != null) {
                    l = linkUser2.roomId;
                } else {
                    l = null;
                }
                Integer num = (Integer) ((LinkedHashMap) map3).get(l);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                LIZJ = iIntValue;
                Map<Long, Integer> map4 = LIZIZ;
                Iterator<LinkUser> it9 = list.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next3 = it9.next();
                        Long l6 = next3.userId;
                        if (l6 != null && l6.longValue() == jLJJI) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                LinkUser linkUser3 = next3;
                if (linkUser3 != null) {
                    l2 = linkUser3.roomId;
                } else {
                    l2 = null;
                }
                map2.put("before_connection_cnts", String.valueOf(((LinkedHashMap) map4).get(l2)));
                map2.put("connection_inviter_id", String.valueOf(C915980Zwa.LJI().LIZ().LJLLLLLL()));
                map2.put("connection_invitee_id", String.valueOf(C915980Zwa.LJI().LIZ().LJJI()));
                if (list.size() >= 2) {
                    if (list.size() != 2) {
                        if (list.size() > 2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(Long.valueOf(LJJJJZI));
                            LinkerInfo linkerInfo = LJJJLIIL;
                            if (linkerInfo != null) {
                                List<UserInfo> list2 = linkerInfo.linkedUsers;
                                ArrayList arrayList6 = new ArrayList();
                                for (UserInfo userInfo : list2) {
                                    if (userInfo.user_id != C950220apo.LJFF()) {
                                        arrayList6.add(userInfo);
                                    }
                                }
                                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
                                Iterator it10 = arrayList6.iterator();
                                while (it10.hasNext()) {
                                    arrayList7.add(Long.valueOf(((UserInfo) it10.next()).user_id));
                                }
                                if (!arrayList7.isEmpty()) {
                                    arrayList5.addAll(arrayList7);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList();
                            for (LinkUser linkUser4 : list) {
                                Long l7 = linkUser4.userId;
                                long jLJFF2 = C950220apo.LJFF();
                                if (l7 == null || l7.longValue() != jLJFF2) {
                                    arrayList8.add(linkUser4);
                                }
                            }
                            ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList8, 10));
                            Iterator it11 = arrayList8.iterator();
                            while (it11.hasNext()) {
                                arrayList9.add(((LinkUser) it11.next()).userId);
                            }
                            if (arrayList5.size() == arrayList9.size()) {
                                int size = arrayList5.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (arrayList9.contains(ListProtector.get(arrayList5, i2))) {
                                    }
                                }
                            }
                        }
                        i = 0;
                        break;
                    }
                    i = 1;
                } else {
                    i = 0;
                    break;
                }
                map2.put("is_same_as_click", String.valueOf(i));
                map2.put("source", LJIIJ);
                map2.put("click_time", C950220apo.LJII(true).getType());
                if (enumC955660ayaLJIIZILJ == EnumC955660aya.INVITEE) {
                    map2.put("selected_to_connection_duration", String.valueOf(C814420VxA.LIZJ((System.currentTimeMillis() - LJJII) / 1000.0f)));
                }
                String str15 = "1";
                if (!Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) && !Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI)) {
                    j3 = 0;
                } else {
                    if (C955580ayS.LIZLLL) {
                        obj = "1";
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    map2.put("is_reservation_sender", obj);
                    long j4 = C955580ayS.LJ;
                    j3 = 0;
                    if (j4 != 0) {
                        map2.put("reservation_id", String.valueOf(j4));
                    }
                }
                if (C944220ag8.LJ != j3) {
                    if (!C955580ayS.LIZLLL) {
                        str15 = CardStruct.IStatusCode.DEFAULT;
                    }
                    map2.put("is_reservation_sender", str15);
                    map2.put("reservation_id", String.valueOf(C944220ag8.LJ));
                }
                LJJII(map2);
                LJFF(map2, false);
                LJIIIIZZ(C915980Zwa.LJI().LIZ().LLJLLIL(), map2);
                Map<String, String> mapLLLFZ = C915980Zwa.LJI().LIZ().LJJII().get(Long.valueOf(C915980Zwa.LJI().LIZ().LLJLLIL()));
                if (mapLLLFZ == null) {
                    mapLLLFZ = C915980Zwa.LJI().LIZ().LLLFZ();
                }
                String str16 = mapLLLFZ.get("is_tag");
                if (str16 != null) {
                    map2.put("is_tag", str16);
                }
                String str17 = mapLLLFZ.get("interest_tag");
                if (str17 != null) {
                    map2.put("interest_tag", str17);
                }
                C915980Zwa.LJI().LIZ().LJJII().clear();
                C915980Zwa.LJI().LIZ().LLLFZ().clear();
                map2.put("topic_hot", CardStruct.IStatusCode.DEFAULT);
                map2.put("is_topic_recommend", "-1");
                map2.put("topic_id", CardStruct.IStatusCode.DEFAULT);
                if (LJIJ.length() > 0) {
                    map2.put("friends_type", LJIJ);
                }
                if (enumC955660ayaLJIIZILJ == EnumC955660aya.INVITER || enumC955660ayaLJIIZILJ == EnumC955660aya.APPLY) {
                    if (LJIILL.length() > 0) {
                        map2.put("search_query_id", LJIILL);
                    }
                    if (LJIILLIIL.length() > 0) {
                        map2.put("words_type", LJIILLIIL);
                    }
                    map2.put("user_count", LJIJI);
                    if (LJIIZILJ.length() == 0) {
                        LJIIZILJ = LJIILLIIL;
                    }
                }
                map2.put("is_shared_screen", LJJLIIIJ());
                C974540bT2 c974540bT2 = C974540bT2.LIZ;
                JSONObject jSONObject = new JSONObject();
                C0K04.LJFF("role_type", "anchor", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                C0K04.LJFF("role_type", "anchor", jSONObject2);
                C974540bT2.LLII(c974540bT2, "cohost_start", jSONObject, jSONObject2, null, 24);
                if (z) {
                    C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(C930540aK4.LJIIL());
                    if (c954460aweLLILL2 != null && c954460aweLLILL2.LJII > 0) {
                        C915980Zwa.LJI().LIZ().LLLFF(EnumC955660aya.APPLY);
                    } else {
                        C915980Zwa.LJI().LIZ().LLLFF(EnumC955660aya.APPLY_2V2);
                    }
                }
                Iterator<C954460awe> it12 = C915980Zwa.LJII().LJIJJ().iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next4 = it12.next();
                        C954460awe c954460awe5 = next4;
                        if (!c954460awe5.LJI() && c954460awe5.LJIIJJI() && c954460awe5.LJJIIZ == EnumC950200apm.LINKED) {
                            break;
                        }
                    } else {
                        next4 = null;
                        break;
                    }
                }
                C954460awe c954460awe6 = next4;
                if (c954460awe6 != null && C1533950q1J.LJ(c954460awe6.LJJIJLIJ)) {
                    map2.put("suggest_creator_type", c954460awe6.LJJIJLIJ);
                }
                Map mapLJIJJLI = C915980Zwa.LJI().LIZ().LJIJJLI();
                mapLJIJJLI.clear();
                Object obj2 = map2.get("interest_tag");
                if (obj2 != null) {
                    mapLJIJJLI.put("interest_tag", obj2);
                }
                Object obj3 = map2.get("is_tag");
                if (obj3 != null) {
                    mapLJIJJLI.put("is_tag", obj3);
                }
                Object obj4 = map2.get("suggest_creator_type");
                if (obj4 != null) {
                    mapLJIJJLI.put("suggest_creator_type", obj4);
                }
                C973690bRf.LJ(map2, null, false);
                C955520ayM.LIZLLL(map2);
                InterfaceC955420ayC interfaceC955420ayCLIZ5 = C915980Zwa.LJI().LIZ();
                long jLJJIJL = interfaceC955420ayCLIZ5.LJJIJL();
                List<Long> listLJFF = C955520ayM.LJFF(C955520ayM.LJII(jLJJIJL));
                map2.put("cohost_inviter_guest_cnt", String.valueOf(((ArrayList) listLJFF).size()));
                map2.put("cohost_inviter_guest_id_list", listLJFF.toString());
                long jLLJLLIL = interfaceC955420ayCLIZ5.LLJLLIL();
                List<Long> listLJFF2 = C955520ayM.LJFF(C955520ayM.LJII(jLLJLLIL));
                map2.put("cohost_invitee_guest_cnt", String.valueOf(((ArrayList) listLJFF2).size()));
                map2.put("cohost_invitee_guest_id_list", listLJFF2.toString());
                ((ConcurrentHashMap) C955520ayM.LIZ.getValue()).clear();
                C955520ayM.LJ().clear();
                C01GW c01gw = C955520ayM.LIZJ;
                ((ConcurrentHashMap) c01gw.getValue()).clear();
                C955520ayM.LJ().put(Long.valueOf(jLJJIJL), listLJFF);
                C955520ayM.LJ().put(Long.valueOf(jLLJLLIL), listLJFF2);
                ((ConcurrentHashMap) c01gw.getValue()).put("click_time", map2.get("click_time"));
                LJLLL(map2, room);
            }
        }
    }

    public final void LLIIIL(long j, long j2, boolean z) {
        String str;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            idStr.toString();
            map.put("room_id", idStr);
        }
        LJIIL(this, map, null, false, 14);
        map.put("from_anchor_id", String.valueOf(j));
        map.put("is_reservation_sender", CardStruct.IStatusCode.DEFAULT);
        map.put("reservation_id", String.valueOf(j2));
        if (z) {
            str = "disconnect";
        } else {
            str = "cancel";
        }
        map.put("selection", str);
        LLIILII("livesdk_connection_disconnect_response", map);
    }

    public static void LJJZZIII(List list, long j, DataChannel dataChannel, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append(" markReferenceFromExternal");
            C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ));
            LJJJJIZL |= 2;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(j);
            sbLIZ2.append(" markReferenceFromComponent");
            C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ2));
            LJJJJIZL |= 1;
        }
        boolean z2 = C946250ajP.LJII;
        int size = list.size();
        if (size != 0 && C946250ajP.LJIIJ != size) {
            C946250ajP.LJIIJ = size;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C946250ajP.LIZ = jElapsedRealtime;
            C946250ajP.LIZJ(size, jElapsedRealtime);
            LJLLLLLL(j, dataChannel, list);
        }
    }

    public static final void LJLJLJ(String str, Room room, String str2, boolean z) {
        Long lValueOf;
        String str3;
        HashMap map = new HashMap();
        map.put("from_user_id", str);
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        map.put("anchor_id", String.valueOf(lValueOf));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        map.put("room_id", String.valueOf(lValueOf2));
        map.put("reservation_id", str2);
        if (!z) {
            str3 = "multi_guest";
        } else {
            str3 = "cohost";
        }
        map.put("reservation_type", str3);
        map.put("receive_time", C950220apo.LJII(false).getType());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_reservation_receive");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJI(Map map, boolean z, long j, List list, Integer num) {
        String str;
        C955540ayO c955540ayOLJIILLIIL;
        if (z) {
            str = "application";
        } else {
            str = "invitation";
        }
        HashMap map2 = (HashMap) map;
        map2.put("show_type", str);
        ArrayList arrayListLJ = C1697810uHb.LJ(Long.valueOf(j));
        arrayListLJ.addAll(list);
        map2.put("popup_uid_list", arrayListLJ.toString());
        map2.put("popup_uid_cnts", String.valueOf(arrayListLJ.size()));
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map2.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        C925640aCA.LIZLLL(map);
        map2.put("connection_type", "anchor");
        map2.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
        map2.put("before_connection_status", LJJJJZI());
        map2.put("source", LJIIJ);
        map2.put("connection_inviter_id", String.valueOf(j));
        map2.put("connection_invitee_id", String.valueOf(C950220apo.LJFF()));
        if (num != null) {
            c955540ayOLJIILLIIL = C915200ZvK.LIZ(num);
        } else {
            c955540ayOLJIILLIIL = C915980Zwa.LJI().LIZ().LJIILLIIL();
        }
        C955410ayB.LIZLLL(map, c955540ayOLJIILLIIL, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(X.C955400ayA r6, java.util.Map r7, X.C943870afZ r8, boolean r9, int r10) {
        /*
            r0 = r10 & 2
            if (r0 == 0) goto L10
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0ayC r0 = r0.LIZ()
            X.0afZ r8 = r0.getEnterFrom()
        L10:
            r0 = r10 & 4
            if (r0 == 0) goto L15
            r9 = 0
        L15:
            r0 = r10 & 8
            r3 = 1
            if (r0 == 0) goto Lba
            r5 = 1
        L1b:
            r6.getClass()
            if (r8 == 0) goto Lb7
            java.lang.String r1 = r8.LIZ
            java.lang.String r0 = "anchor_host_notice"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != r3) goto Lb7
            r0 = 1
        L2b:
            java.lang.String r2 = "appointment_popup"
            java.lang.String r1 = "notice_type"
            if (r0 == 0) goto Lb4
            boolean r0 = r8.LIZIZ
            if (r0 == 0) goto La4
            java.lang.String r0 = "random_notice"
        L37:
            r7.put(r1, r0)
        L3a:
            boolean r0 = r8.LJ
            if (r0 != r3) goto L41
            r7.put(r1, r2)
        L41:
            java.lang.String r1 = "is_multi_bubble_guide"
            java.lang.String r3 = "0"
            r7.put(r1, r3)
            java.lang.String r4 = "1"
            if (r8 == 0) goto L5a
            java.lang.Boolean r0 = r8.LIZJ
            if (r0 == 0) goto L5a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La2
            r0 = r4
        L57:
            r7.put(r1, r0)
        L5a:
            java.lang.String r2 = ""
            if (r5 == 0) goto L83
            java.lang.String r1 = "enter_from"
            if (r9 != 0) goto L68
            boolean r0 = LJJLJ()
            if (r0 != 0) goto L72
        L68:
            if (r8 == 0) goto L6e
            java.lang.String r0 = r8.LIZ
            if (r0 != 0) goto L6f
        L6e:
            r0 = r2
        L6f:
            r7.put(r1, r0)
        L72:
            X.0bSt r0 = X.C973890bRz.LIZ
            boolean r0 = r0.LJIIJ
            if (r0 == 0) goto L83
            if (r8 == 0) goto L7e
            java.lang.String r0 = r8.LIZ
            if (r0 != 0) goto L80
        L7e:
            java.lang.String r0 = "others"
        L80:
            r7.put(r1, r0)
        L83:
            if (r8 == 0) goto La0
            java.lang.String r0 = r8.LJFF
        L87:
            boolean r0 = X.C1533950q1J.LJ(r0)
            if (r0 == 0) goto L8e
            r3 = r4
        L8e:
            java.lang.String r0 = "is_guide"
            r7.put(r0, r3)
            if (r8 == 0) goto L9a
            java.lang.String r0 = r8.LJFF
            if (r0 == 0) goto L9a
            r2 = r0
        L9a:
            java.lang.String r0 = "guide_type"
            r7.put(r0, r2)
            return
        La0:
            r0 = 0
            goto L87
        La2:
            r0 = r3
            goto L57
        La4:
            boolean r0 = r8.LIZLLL
            if (r0 == 0) goto Lab
            java.lang.String r0 = "appointment_guide"
            goto L37
        Lab:
            boolean r0 = r8.LJ
            if (r0 == 0) goto Lb1
            r0 = r2
            goto L37
        Lb1:
            java.lang.String r0 = "normal_notice"
            goto L37
        Lb4:
            if (r8 == 0) goto L41
            goto L3a
        Lb7:
            r0 = 0
            goto L2b
        Lba:
            r5 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LJIIL(X.0ayA, java.util.Map, X.0afZ, boolean, int):void");
    }

    public static void LJJJJJL(Map map, List list, C410901il c410901il, Map map2, boolean z) {
        RivalExtraInfo rivalExtraInfo;
        Integer numValueOf;
        RivalExtraInfo rivalExtraInfo2;
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() && CohostWithGuestPhase2EventTrackingOpt.INSTANCE.isListShowOpt() && list != null) {
            int size = list.size();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c410901il != null) {
                for (Object obj : c410901il) {
                    if (obj instanceof C955590ayT) {
                        linkedHashMap.put(Long.valueOf(((C955590ayT) obj).LJ.getId()), obj);
                    }
                }
            }
            Iterator it2 = list.iterator();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (it2.hasNext()) {
                Room room = (Room) it2.next();
                C955590ayT c955590ayT = (C955590ayT) linkedHashMap.get(Long.valueOf(room.getId()));
                if (c955590ayT != null) {
                    if (c955590ayT.LJ.getId() == room.getId()) {
                        if (LJJLIL(c955590ayT.LJIIJ)) {
                            i++;
                        }
                        if (c955590ayT.LJIILIIL != EnumC955720ayg.UNAVAILABLE && (rivalExtraInfo = c955590ayT.LJIIJ) != null && (numValueOf = Integer.valueOf(rivalExtraInfo.showPlayType)) != null) {
                            if (numValueOf.intValue() != 1) {
                                if (numValueOf.intValue() == 0 || numValueOf.intValue() == 3) {
                                    i2++;
                                    if (LJJLIL(c955590ayT.LJIIJ)) {
                                        i4++;
                                    }
                                }
                            } else {
                                i3++;
                            }
                        }
                    }
                } else if (map2 != null && (rivalExtraInfo2 = (RivalExtraInfo) map2.get(Long.valueOf(room.getId()))) != null) {
                    if (LJJLIL(rivalExtraInfo2)) {
                        i++;
                    }
                    if (C955940az2.LIZ(rivalExtraInfo2) && !C915980Zwa.LJII().LJJLIIIJJI() && (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1() || !C915980Zwa.LJII().LLLIZZ())) {
                        int i5 = rivalExtraInfo2.showPlayType;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 3) {
                                }
                            } else {
                                i3++;
                            }
                        }
                        i2++;
                        if (LJJLIL(rivalExtraInfo2)) {
                            i4++;
                        }
                    }
                }
            }
            if (!z) {
                map.put("mutual_follow_cnts", String.valueOf(size));
                map.put("mutual_mg_cnts", String.valueOf(i));
            }
            map.put("all_mutual_could_invite_cnts", String.valueOf(i2));
            map.put("all_mutual_could_apply_cnts", String.valueOf(i3));
            map.put("all_mutual_could_invite_mg_cnts", String.valueOf(i4));
        }
    }

    public static final void LJLJJI(long j, long j2, boolean z, String str, String str2) {
        Object obj;
        long jLJJJJJL;
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(C950220apo.LJFF()));
        if (C915980Zwa.LJFF().co0()) {
            map.put("connection_type", "manual_pk");
        } else {
            map.put("connection_type", "anchor");
        }
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        if (C915980Zwa.LJFF().co0()) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
            } else {
                jLJJJJJL = 0;
            }
            map.put("pk_id", String.valueOf(jLJJJJJL));
        }
        LJIIJ(map, true);
        map.put("both_guest_cnt", String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size()));
        C955520ayM.LIZ(map);
        map.put("to_user_id", String.valueOf(j));
        map.put("to_user_type", str);
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_enlarge_mode", obj);
        if (!z || j != j2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_to_enlarged_user", str3);
        if (z && j2 > 0) {
            map.put("enlarged_user_id", String.valueOf(j2));
            if (str2 != null) {
                map.put("enlarged_user_type", str2);
            }
        }
        LLIILII("livesdk_connection_image_click", map);
    }

    public static void LJLL(long j, Integer num, String str, String str2, boolean z) {
        String string;
        String str3;
        String idStr;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String str4 = "";
        if (room == null || (string = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
            string = "";
        }
        map.put("anchor_id", string);
        if (room != null && (idStr = room.getIdStr()) != null) {
            str4 = idStr;
        }
        map.put("room_id", str4);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_success", str3);
        map.put("duration", String.valueOf(j));
        map.put("search_key_word", str2);
        map.put("search_query_id", str);
        if (num != null) {
            map.put("words_type", LJJLIIIJLLLLLLLZ(num.intValue()));
        }
        LLIILII("livesdk_connection_search", map);
    }

    public static void LJLZ(String str, String str2, String str3, C955590ayT c955590ayT, int i) {
        C955540ayO c955540ayO;
        LinkerInfo linkerInfo;
        List<UserInfo> list;
        String str4;
        RivalExtraInfo rivalExtraInfo;
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "cancel_icon";
        }
        int i2 = i & 8;
        Long lValueOf = null;
        if (i2 != 0) {
            c955590ayT = null;
        }
        if (!Intrinsics.LJFF(str, EnumC955790ayn.PAIR_INVITE.getLabel())) {
            HashMap map = new HashMap();
            map.put("withdraw_type", str);
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
            map.put("click_position", str3);
            List listLJIIJJI = C1697810uHb.LJIIJJI(C955540ayO.LIZJ, C955540ayO.LJJIIZ);
            if (c955590ayT != null) {
                c955540ayO = c955590ayT.LJI;
            } else {
                c955540ayO = null;
            }
            if (C13LP.LJJJJ(c955540ayO, listLJIIJJI)) {
                if (c955590ayT != null && (rivalExtraInfo = c955590ayT.LJIIJ) != null && C949990apR.LIZIZ(rivalExtraInfo)) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_off_live", str4);
            }
            if (TextUtils.isEmpty(str2)) {
                if (!Intrinsics.LJFF(str, EnumC955790ayn.APPLY_INVITE.getLabel()) && !Intrinsics.LJFF(str, EnumC955790ayn.APPLY_PAIR.getLabel())) {
                    LJIILJJIL(map);
                } else {
                    Room roomLJJIFFI = C915980Zwa.LJI().LIZ().LJJIFFI();
                    if (roomLJJIFFI != null) {
                        lValueOf = Long.valueOf(roomLJJIFFI.getOwnerUserId());
                    }
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(lValueOf);
                    RivalExtraInfo rivalExtraInfoLJJIII = C915980Zwa.LJI().LIZ().LJJIII();
                    if (rivalExtraInfoLJJIII != null && (linkerInfo = rivalExtraInfoLJJIII.linkerInfo) != null && (list = linkerInfo.linkedUsers) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (UserInfo userInfo : list) {
                            long j = userInfo.user_id;
                            if (lValueOf == null || j != lValueOf.longValue()) {
                                arrayList.add(userInfo);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            listLJIILJJIL.add(Long.valueOf(((UserInfo) it2.next()).user_id));
                        }
                    }
                    map.put("uid_list", listLJIILJJIL.toString());
                }
            } else {
                map.put("uid_list", Collections.singletonList(str2).toString());
            }
            C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), true);
            LLIILII("livesdk_connection_withdraw", map);
        }
    }

    public final void LIZ(boolean z, Map<String, String> map, Room room, int i, C955540ayO c955540ayO) {
        if (z && LJJIJL) {
            ((HashMap) map).put("relation_label", LJJIJIIJI);
        } else {
            ((HashMap) map).put("relation_label", LJJLIIIJJIZ(this, room, i, c955540ayO, false, true, 8));
        }
    }

    public final void LJJIJ(Map<String, String> map, Room room, RivalExtraInfo rivalExtraInfo, C955540ayO c955540ayO, EnumC955660aya enumC955660aya) {
        RivalExtraInfo.Tag tag;
        int i;
        TagV2 tagV2;
        C955540ayO c955540ayO2 = c955540ayO;
        String str = "1";
        if (LJJIJL) {
            if (LJJIL != EnumC955660aya.INVITEE) {
                map.put("relation_label", LJJIJIIJI);
                map.put("extra_relation_label", LJJIJIIJIL);
            }
            if (!LJJIJIL) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_linked_before", str);
            return;
        }
        if (enumC955660aya != EnumC955660aya.INVITEE) {
            if (rivalExtraInfo != null && (tagV2 = rivalExtraInfo.tagV2) != null) {
                i = tagV2.tagClassification;
            } else {
                i = 0;
            }
            map.put("relation_label", LJJLIIIJJIZ(this, room, i, c955540ayO2, false, false, 24));
            if (c955540ayO2 == null) {
                c955540ayO2 = C955540ayO.LIZIZ;
            }
            map.put("extra_relation_label", LJJJLL(rivalExtraInfo, c955540ayO2));
        }
        if (rivalExtraInfo == null || (tag = rivalExtraInfo.tag) == null || tag.tagType != C005C.COHOST_TYPE.value) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_linked_before", str);
    }

    public static void LJLJJL(String str, String str2, boolean z, List list, boolean z2, long j) {
        String strOE2;
        String str3;
        String str4;
        String str5;
        HashMap map = new HashMap();
        map.put("connection_type", "anchor");
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService == null || (strOE2 = iInteractService.oE2()) == null) {
            strOE2 = "";
        }
        map.put("core_connection_type", strOE2);
        map.put("popup_uid_cnts", String.valueOf(((ArrayList) list).size()));
        if (z) {
            str3 = "application";
        } else {
            str3 = "invitation";
        }
        map.put("show_type", str3);
        if (LiveCoHostInvitationTimeLimitSettings.INSTANCE.timeLimited()) {
            str4 = "10min";
        } else {
            str4 = "for_this_live";
        }
        map.put("turn_off_type", str4);
        if (z2) {
            str5 = "off";
        } else {
            str5 = "on";
        }
        map.put("turn_off_status", str5);
        map.put("connection_inviter_id", String.valueOf(j));
        C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(str, str2, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_invited_dismiss");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LLIFFJFJJ(String str, C943870afZ c943870afZ, ReserveInfo reserveInfo, Map map, String str2, int i) {
        Long lValueOf;
        boolean z;
        String string;
        Object obj;
        Object obj2;
        EnumC774050UXz enumC774050UXz;
        if ((i & 2) != 0) {
            c943870afZ = C915980Zwa.LJI().LIZ().getEnterFrom();
        }
        Long lValueOf2 = null;
        if ((i & 4) != 0) {
            reserveInfo = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        System.currentTimeMillis();
        HashMap map2 = new HashMap();
        C955400ayA c955400ayA = LIZ;
        map2.put("before_connection_status", LJJJJZI());
        map2.put("request_page", "room");
        map2.put("click_reason", str);
        EnumC955660aya anchorType = C915980Zwa.LJI().LIZ().getAnchorType();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logLinkCrossRoomClick. anchorType=");
        sbLIZ.append(anchorType);
        sbLIZ.append(", clickReason=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ));
        if (anchorType == EnumC955660aya.INVITEE && Intrinsics.LJFF(str, "during_connection")) {
            LJIIL(c955400ayA, map2, c943870afZ, true, 8);
        } else {
            LJIIL(c955400ayA, map2, c943870afZ, false, 12);
        }
        LIZIZ(map2);
        LJJIJIL(map2);
        LJIIZILJ(map2);
        if (C915980Zwa.LJI().LJIIJ().LIZ()) {
            map2.put("live_icon_show_time", "during_connection");
            LJIIJ(map2, true);
        } else {
            map2.put("live_icon_show_time", "single_live");
            LJIIJ(map2, false);
        }
        map2.put("pk_mapping_id", C955580ayS.LJFF);
        map2.put("pk_mapping_type", C955580ayS.LJI);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        map2.put("room_id", String.valueOf(lValueOf));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        }
        map2.put("anchor_id", String.valueOf(lValueOf2));
        map2.put("to_anchor_id", String.valueOf(C915980Zwa.LJI().LIZ().LJJLIIIIJ()));
        String strLLJJ = C915980Zwa.LJI().LIZ().LLJJ();
        String logId = C915980Zwa.LJI().LIZ().getLogId();
        if (strLLJJ != null && strLLJJ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            map2.put("to_anchor_id", strLLJJ);
            if (logId == null) {
                logId = "";
            }
            map2.put("log_id", logId);
        } else {
            map2.put("log_id", "");
        }
        if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
            map2.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        map2.put("click_time", C950220apo.LJII(false).getType());
        map2.put("reservation_anchor_cnts", String.valueOf(C955580ayS.LJIILLIIL));
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (reserveInfo == null || (string = Long.valueOf(reserveInfo.acceptAppointmentCnts).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("current_accept_appointment_cnts", string);
        if (C955580ayS.LJIILL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_reservation_sender", obj);
        if (C955580ayS.LJIILLIIL == 0) {
            map2.put("reservation_anchor_cnts", String.valueOf(C944220ag8.LIZLLL));
        }
        if (!C916430ZxJ.LIZLLL.isEmpty()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_reservation_sender", obj2);
        C944220ag8.LIZJ = false;
        C944220ag8.LIZLLL = 0L;
        C2176881AHm c2176881AHm = C1AI0.LIZIZ;
        if (c2176881AHm != null && (enumC774050UXz = c2176881AHm.LIZ) != null && enumC774050UXz.isViewerWishes()) {
            str3 = "1";
        }
        map2.put("is_vw", str3);
        if (map != null) {
            map2.putAll(map);
        }
        if (str2 != null) {
            map2.put("click_area", str2);
        }
        C955520ayM.LIZLLL(map2);
        C955520ayM.LIZ(map2);
        C927870aFl.LIZ(C915980Zwa.LJI().LIZ().LLILLL(), map2);
        LLIILII("livesdk_connection_icon_click", map2);
        if (room != null) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).upLoadLiveEcoEvent(room.getId(), 3);
        }
    }

    public static String LJJLIIIJJIZ(C955400ayA c955400ayA, Room room, int i, C955540ayO c955540ayO, boolean z, boolean z2, int i2) {
        String str;
        User owner;
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        c955400ayA.getClass();
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LIZJ) || (!z2 && room != null && (owner = room.getOwner()) != null && C950220apo.LJIJJ(owner))) {
            str = "mutual_follow";
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "stranger";
                } else {
                    str = "second_relation";
                }
            } else {
                str = "first_relation";
            }
        } else {
            str = "";
        }
        if (z) {
            return "stranger";
        }
        return str;
    }

    public static void LJLLILLLL(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Long lValueOf;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_connection_setting_show");
        String idStr = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        if (room != null) {
            idStr = room.getIdStr();
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        String str = "open";
        if (LiveCoHostInvitationTimeLimitSettings.INSTANCE.optionMerged()) {
            if (z5) {
                obj5 = "open";
            } else {
                obj5 = "close";
            }
            c474500IjALIZ.LJJII(obj5, "allow_invites_from_friends");
            if (z6) {
                obj6 = "open";
            } else {
                obj6 = "close";
            }
            c474500IjALIZ.LJJII(obj6, "allow_invitations_when_offlive");
            if (z7) {
                obj7 = "open";
            } else {
                obj7 = "close";
            }
            c474500IjALIZ.LJJII(obj7, "allow_invites_from_suggested");
            c474500IjALIZ.LJJII("null", "mutual_invitation_receive_status");
            c474500IjALIZ.LJJII("null", "recommend_invitation_receive_status");
            c474500IjALIZ.LJJII("null", "mutual_application_receive_status");
            c474500IjALIZ.LJJII("null", "recommend_application_receive_status");
        } else {
            c474500IjALIZ.LJJII("null", "allow_invites_from_friends");
            c474500IjALIZ.LJJII("null", "allow_invitations_when_offlive");
            c474500IjALIZ.LJJII("null", "allow_invites_from_suggested");
            if (z) {
                obj = "open";
            } else {
                obj = "close";
            }
            c474500IjALIZ.LJJII(obj, "mutual_invitation_receive_status");
            if (z2) {
                obj2 = "open";
            } else {
                obj2 = "close";
            }
            c474500IjALIZ.LJJII(obj2, "recommend_invitation_receive_status");
            if (z3) {
                obj3 = "open";
            } else {
                obj3 = "close";
            }
            c474500IjALIZ.LJJII(obj3, "mutual_application_receive_status");
            if (z4) {
                obj4 = "open";
            } else {
                obj4 = "close";
            }
            c474500IjALIZ.LJJII(obj4, "recommend_application_receive_status");
        }
        if (!z8) {
            str = "close";
        }
        c474500IjALIZ.LJJII(str, "suggestion_from_audience");
        c474500IjALIZ.LIZ();
    }

    public static void LLIIL(String str, String str2, String str3, String str4, String str5, String str6, boolean z, Boolean bool) {
        Object obj;
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(C950220apo.LJ()));
        if (C915980Zwa.LJI().LJIIJ().getChannelId() > 0) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        map.put("page_name", str);
        map.put("quit_method", str2);
        map.put("original_card_style", str3);
        map.put("original_detailed_card_tag_style", str4);
        map.put("original_tags", str5);
        map.put("final_tags", str6);
        String str7 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_change", obj);
        if (bool != null) {
            bool.booleanValue();
            if (!bool.booleanValue()) {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_tag_changeable", str7);
        }
        LJIIJ(map, false);
        LLIILII("livesdk_tag_selection_page_quit", map);
    }

    public static void LJJLJLI(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        HashMap map = new HashMap();
        map.put("record_type", str);
        if (str2 != null) {
            map.put("history_sub_match_type", str2);
        }
        if (i > 0) {
            map.put("team_member_cnts", String.valueOf(i));
        }
        if (CoHostShowHistoryListSetting.INSTANCE.isGroupA()) {
            str8 = "anchor";
        } else {
            str8 = "cohost_record";
        }
        map.put("display_type", str8);
        map.put("history_record_position", String.valueOf(i2));
        map.put("history_channel_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        map.put("history_pk_id", str4);
        map.put("history_record_result", str5);
        map.put("history_display_time", str6);
        if (str7 != null) {
            map.put("history_record_rank", str7);
        }
        LLIILII("livesdk_connection_history_record", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3 A[PHI: r10
      0x00f3: PHI (r10v4 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:18:0x0056, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLIIJI(boolean r22, long r23, long r25, java.util.List<java.lang.Long> r27, java.lang.Integer r28, long r29, com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo r31, com.bytedance.android.livesdk.chatroom.model.interact.TagV2 r32, webcast.im.JoinGroupMessageExtra r33) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LLIIJI(boolean, long, long, java.util.List, java.lang.Integer, long, com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo, com.bytedance.android.livesdk.chatroom.model.interact.TagV2, webcast.im.JoinGroupMessageExtra):void");
    }

    public static void LJLIIL(long j, boolean z, String str, String str2, EnumC950230app enumC950230app, int i, List list, boolean z2, String str3, int i2) {
        Long lValueOf;
        String str4;
        String str5 = str3;
        boolean z3 = false;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        Long lValueOf2 = null;
        if ((i2 & 64) != 0) {
            list = null;
        }
        if ((i2 & 128) != 0) {
            z2 = false;
        }
        if ((i2 & 256) != 0) {
            str5 = null;
        }
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        map.put("accept_appointment_cnts", String.valueOf(j));
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        map.put("anchor_id", String.valueOf(lValueOf));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        map.put("room_id", String.valueOf(lValueOf2));
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_reservation_sender", str4);
        if (list != null && list.size() == 1) {
            z3 = true;
        }
        if (z3) {
            map.put("reservation_id", str);
        }
        map.put("reservation_type", str2);
        map.put("show_time", enumC950230app.getType());
        if (i > 0) {
            map.put("current_accept_appointment_cnts", String.valueOf(i));
        }
        if (z2) {
            map.put("reservation_id", str);
            map.put("is_reservation_sender", CardStruct.IStatusCode.DEFAULT);
        }
        map.put("notice_type", "appoinment_popup");
        if (str5 != null) {
            map.put("position", str5);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_appointment_guide_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LLF(Room room, String str, C955540ayO c955540ayO, RivalExtraInfo rivalExtraInfo, Integer num, String str2, Map map, boolean z, String str3, int i) {
        LinkerInfo linkerInfo;
        List<UserInfo> list;
        boolean z2 = z;
        Map map2 = map;
        String str4 = str2;
        Integer num2 = num;
        RivalExtraInfo rivalExtraInfo2 = rivalExtraInfo;
        C955540ayO c955540ayOLJIILLIIL = c955540ayO;
        if ((i & 4) != 0) {
            c955540ayOLJIILLIIL = C915980Zwa.LJI().LIZ().LJIILLIIL();
        }
        String str5 = null;
        if ((i & 8) != 0) {
            rivalExtraInfo2 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str4 = "";
        }
        if ((i & 64) != 0) {
            map2 = null;
        }
        int size = 0;
        if ((i & 128) != 0) {
            z2 = false;
        }
        if ((i & 256) == 0) {
            str5 = str3;
        }
        HashMap map3 = new HashMap();
        if (map2 != null) {
            map3.putAll(map2);
        }
        map3.put("pk_mapping_id", C955580ayS.LJII);
        map3.put("pk_mapping_type", C955580ayS.LJIIIIZZ);
        map3.put("pk_mapping_style", C955580ayS.LJIIIZ);
        map3.put("if_scheduled_teammate", C955580ayS.LJIIL);
        if (str.length() > 0) {
            map3.put("actual_click_type", str);
        }
        long ownerUserId = room.getOwnerUserId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map3.get("friends_type");
        if (obj != null) {
            linkedHashMap.put("friends_type", obj);
        }
        Object obj2 = map3.get("history_display_time");
        if (obj2 != null) {
            linkedHashMap.put("history_display_time", obj2);
        }
        Object obj3 = map3.get("history_channel_id");
        if (obj3 != null) {
            linkedHashMap.put("history_channel_id", obj3);
        }
        Object obj4 = map3.get("history_pk_id");
        if (obj4 != null) {
            linkedHashMap.put("history_pk_id", obj4);
        }
        Object obj5 = map3.get("history_sub_match_type");
        if (obj5 != null) {
            linkedHashMap.put("history_sub_match_type", obj5);
        }
        Object obj6 = map3.get("history_record_rank");
        if (obj6 != null) {
            linkedHashMap.put("history_record_rank", obj6);
        }
        Object obj7 = map3.get("history_record_position");
        if (obj7 != null) {
            linkedHashMap.put("history_record_position", obj7);
        }
        Object obj8 = map3.get("history_record_result");
        if (obj8 != null) {
            linkedHashMap.put("history_record_result", obj8);
        }
        Object obj9 = map3.get("history_match_cnt");
        if (obj9 != null) {
            linkedHashMap.put("history_match_cnt", obj9);
        }
        C915980Zwa.LJI().LIZ().LJJIL(ownerUserId, linkedHashMap);
        Map<Long, Integer> map4 = LIZIZ;
        Long lValueOf = Long.valueOf(room.getId());
        if (rivalExtraInfo2 != null && (linkerInfo = rivalExtraInfo2.linkerInfo) != null && (list = linkerInfo.linkedUsers) != null) {
            size = list.size();
        }
        map4.put(lValueOf, Integer.valueOf(size + 1));
        LLD("livesdk_connection_invite_send_success", map3, room, str, c955540ayOLJIILLIIL, rivalExtraInfo2, C915980Zwa.LJI().LIZ().LLJJJJ(room.getOwnerUserId()), null, num2, str4, z2, str5, 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0135 A[PHI: r5
      0x0135: PHI (r5v10 java.lang.String) = (r5v3 java.lang.String), (r5v11 java.lang.String) binds: [B:49:0x00d0, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LL(com.bytedance.android.livesdkapi.depend.model.live.Room r21, java.lang.String r22, X.C955540ayO r23, java.lang.String r24, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo r25, com.bytedance.android.livesdk.model.message.ReserveInfo r26, com.bytedance.android.livesdk.model.message.OptPairInfo r27, java.lang.Integer r28, java.lang.String r29, java.util.Map r30, boolean r31, int r32) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LL(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, X.0ayO, java.lang.String, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo, com.bytedance.android.livesdk.model.message.ReserveInfo, com.bytedance.android.livesdk.model.message.OptPairInfo, java.lang.Integer, java.lang.String, java.util.Map, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b3  */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v157, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v166, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v167 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v77 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLD(java.lang.String r26, java.util.Map r27, com.bytedance.android.livesdkapi.depend.model.live.Room r28, java.lang.String r29, X.C955540ayO r30, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo r31, java.lang.String r32, com.bytedance.android.livesdk.model.message.ReserveInfo r33, java.lang.Integer r34, java.lang.String r35, boolean r36, java.lang.String r37, int r38) {
        /*
            Method dump skipped, instruction units count: 1474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LLD(java.lang.String, java.util.Map, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, X.0ayO, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo, java.lang.String, com.bytedance.android.livesdk.model.message.ReserveInfo, java.lang.Integer, java.lang.String, boolean, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFF(boolean r20, long r21, java.util.List<java.lang.Long> r23, int r24, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo.Tag r25, java.lang.Integer r26, X.EnumC955760ayk r27, webcast.im.JoinGroupMessageExtra r28, java.lang.String r29, boolean r30, java.lang.Long r31, long r32, java.util.Map<java.lang.String, java.lang.String> r34) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LLFF(boolean, long, java.util.List, int, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag, java.lang.Integer, X.0ayk, webcast.im.JoinGroupMessageExtra, java.lang.String, boolean, java.lang.Long, long, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x038f  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLI(java.lang.String r16, com.bytedance.android.livesdkapi.depend.model.live.Room r17, X.C955540ayO r18, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo r19, boolean r20, X.EnumC955720ayg r21, java.lang.String r22, boolean r23, boolean r24, java.lang.String r25, boolean r26, boolean r27, java.util.Map r28, int r29) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LLI(java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room, X.0ayO, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo, boolean, X.0ayg, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, java.util.Map, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022d A[PHI: r10
      0x022d: PHI (r10v4 int) = (r10v3 int), (r10v6 int) binds: [B:79:0x0229, B:45:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFII(boolean r20, boolean r21, boolean r22, long r23, java.util.List<java.lang.Long> r25, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo.Tag r26, java.lang.Integer r27, X.EnumC955760ayk r28, webcast.im.JoinGroupMessageExtra r29, boolean r30, java.lang.String r31, boolean r32, java.util.List<java.lang.Long> r33, java.lang.Long r34, java.util.Map<java.lang.String, java.lang.String> r35) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955400ayA.LLFII(boolean, boolean, boolean, long, java.util.List, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag, java.lang.Integer, X.0ayk, webcast.im.JoinGroupMessageExtra, boolean, java.lang.String, boolean, java.util.List, java.lang.Long, java.util.Map):void");
    }
}
