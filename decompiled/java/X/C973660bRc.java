package X;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2EventTrackingOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCohostContentGuideEnabledSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelLynxConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveMusicSpotlightSetting;
import com.bytedance.android.livesdk.model.message.AudioMeta;
import com.bytedance.android.livesdk.model.message.BattleAICommentaryMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: renamed from: X.0bRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973660bRc {
    public static String LJJZ;
    public static long LJJZZI;
    public static long LJJZZIII;
    public static Integer LJL;
    public static long LJLI;
    public static long LJLILLLLZI;
    public static long LJLJI;
    public static long LJLJJI;
    public static C969470bKr LJLJJLL;
    public static boolean LJLJL;
    public static String LJLJLJ;
    public static Map<String, String> LJLL;
    public static String LJLLI;
    public static long LJLLILLLL;
    public static List<Long> LJLLL;
    public static List<Long> LJLLLL;
    public static final C973660bRc LIZ = new C973660bRc();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"livesdk_group_pk_teammate_selection_click", "livesdk_pk_option_selection_page_show", "livesdk_pk_option_selection_click", "livesdk_pk_invite_popup_show", "livesdk_pk_mode_selected", "livesdk_connection_invite", "livesdk_connection_invite_send_success", "livesdk_connection_invited_received", "livesdk_connected_popup_show", "livesdk_connection_invited", "livesdk_connection_success", "livesdk_pk_disconnect_show", "livesdk_pk_disconnect_click", "livesdk_pk_disconnect_received", "livesdk_pk_disconnect_received_click", "livesdk_pk_end", "livesdk_punish_end"});
    public static final String LIZJ = "anchor_id";
    public static final String LIZLLL = "user_id";
    public static final String LJ = "channel_id";
    public static final String LJFF = "room_id";
    public static final String LJI = "current_connection_cnts";
    public static final String LJII = "uid_list";
    public static final String LJIIIIZZ = "request_from";
    public static final String LJIIIZ = "red_team_uid_list";
    public static final String LJIIJ = "blue_team_uid_list";
    public static final String LJIIJJI = "connection_type";
    public static final String LJIIL = "core_connection_type";
    public static final String LJIILIIL = "is_multi";
    public static final String LJIILJJIL = "pk_id";
    public static final String LJIILL = "anchor_type";
    public static final String LJIILLIIL = "selection";
    public static final String LJIIZILJ = "enter_method";
    public static final String LJIJ = "enter_from_merge";
    public static final String LJIJI = "action_type";
    public static final String LJIJJ = "request_id";
    public static final String LJIJJLI = "pk_time";
    public static final String LJIL = "is_oncemore";
    public static final String LJJ = "pk_inviter_id";
    public static final String LJJI = "pk_invitee_id";
    public static final String LJJIFFI = "pk_invitee_list";
    public static final String LJJII = "user_type";
    public static final String LJJIII = "team_member_cnts";
    public static final String LJJIIJ = "oncemore_type";
    public static final String LJJIIJZLJL = "relation_type";
    public static final String LJJIIZ = "is_quick_recommend";
    public static final String LJJIIZI = "invitee_list";
    public static final String LJJIJ = "is_best_teammate_occur";
    public static final String LJJIJIIJI = "is_best_teammate";
    public static final String LJJIJIIJIL = "enter_from";
    public static final String LJJIJIL = "reservation_id";
    public static final String LJJIJL = "old_channel_id";
    public static final String LJJIJLIJ = "is_two_apply_two";
    public static final String LJJIL = "invite_reason";
    public static final String LJJIZ = "battle_scene";
    public static final String LJJJ = "is_opponent_user";
    public static final String LJJJI = "oncemore_from";
    public static final String LJJJIL = "is_oncemore_change_type";
    public static final String LJJJJ = "oncemore_old_match_type";
    public static final String LJJJJI = "new_match_type";
    public static final String LJJJJIZL = "is_oncemore_guide_playbook";
    public static final String LJJJJJ = "guide_playbook_id";
    public static final String LJJJJJL = "rematch_button";
    public static final String LJJJJL = "rematch_popup";
    public static final String LJJJJLI = "inviter_guest_cnt";
    public static final String LJJJJLL = "invitee_guest_cnt";
    public static final String LJJJJZ = "inviter_guest_id_list";
    public static final String LJJJJZI = "invitee_guest_id_list";
    public static final String LJJJLIIL = "manual_pk";
    public static final String LJJJLL = "invite_mode";
    public static final String LJJJLZIJ = "invited_mode";
    public static final String LJJJZ = "waiting_time";
    public static final String LJJL = "selection";
    public static final String LJJLI = "start_solo_match";
    public static final String LJJLIIIIJ = "withdraw_pairing";
    public static final String LJJLIIIJ = "cancel";
    public static final String LJJLIIIJILLIZJL = "timeout_disappear";
    public static final String LJJLIIIJJI = "1v1_old";
    public static final String LJJLIIIJJIZ = "1v1";
    public static final String LJJLIIIJL = "2v2_pairing";
    public static final String LJJLIIIJLJLI = "2v2_pairing";
    public static final String LJJLIIIJLLLLLLLZ = "cohosting";
    public static final String LJJLIIJ = "solo";
    public static final String LJJLIL = "manual_invite";
    public static final String LJJLJ = "2v2_pairing_quick_pair";
    public static final String LJJLJLI = "2v2_pairing_quick_rec_cohost";
    public static final String LJJLL = "2v2_pairing_quick_rec_solo";
    public static UUID LJLIIIL = C1145010ftz.LIZ();
    public static UUID LJLIIL = C1145010ftz.LIZ();
    public static UUID LJLIL = C1145010ftz.LIZ();
    public static final Set<String> LJLJJL = C13LQ.LJLIIL(new String[]{"livesdk_match_item_guide_show", "livesdk_match_item_guide_click", "livesdk_match_item_effect_show", "livesdk_match_item_effect_click", "livesdk_match_item_occur", "livesdk_mvp_get_match_item_show"});
    public static Map<String, String> LJLJLLL = new LinkedHashMap();
    public static String LJLLJ = "";

    public static String LJJIZ(long j, long j2) {
        return (j <= 0 || j2 < j) ? "formal_pk" : "victory_lap";
    }

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LJLLL = c13bv;
        LJLLLL = c13bv;
    }

    public static long LJJIJLIJ() {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (owner = room.getOwner()) == null) {
            return 0L;
        }
        return owner.getId();
    }

    public static long LJLLILLLL() {
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (c1095140ebYUw0 != null) {
            return c1095140ebYUw0.LIZ;
        }
        return 0L;
    }

    public static int LJLLJ() {
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        String str = c1095140ebYUw0 != null && c1095140ebYUw0.LJ == 2 ? "sleeping" : (c1095140ebYUw0 == null || c1095140ebYUw0.LIZ <= 0) ? "before" : "after";
        int iHashCode = str.hashCode();
        if (iHashCode != -1392885889) {
            if (iHashCode != -1385863765) {
                if (iHashCode == 92734940 && str.equals("after")) {
                    return 1;
                }
            } else if (str.equals("sleeping")) {
                return 3;
            }
        } else if (str.equals("before")) {
            return 0;
        }
        return -1;
    }

    public static boolean LJLLLL() {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room == null || (owner = room.getOwner()) == null || UserService.getInstance().user().getCurrentUserId() != owner.getId()) ? false : true;
    }

    public final void LJJLIIIJJIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(LJIIJJI, LJJJLIIL);
        linkedHashMap.put(LJ, String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(linkedHashMap);
        String label = C915980Zwa.LJI().LIZ().getAnchorType().getLabel();
        if (C915980Zwa.LJII().LLFFF()) {
            EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
            if (!Intrinsics.LJFF(label, enumC955660aya.getLabel())) {
                linkedHashMap.put(LJIILL, label);
            } else if (C915980Zwa.LJI().LIZ().LJJJIL() != enumC955660aya) {
                linkedHashMap.put(LJIILL, C915980Zwa.LJI().LIZ().LJJJIL().getLabel());
            }
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJII(linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_group_pk_teammate_leave_popup");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public final void LJLJJI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJJIIJZLJL(linkedHashMap);
        linkedHashMap.put("bubble_type", "community_gift");
        if (!LJJJJ()) {
            LJZI(this, "livesdk_pk_option_bubble_show", linkedHashMap, "1v1");
            return;
        }
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        c917350Zyn.getClass();
        LJZ(this, "livesdk_pk_option_bubble_show", linkedHashMap, C917350Zyn.LIZIZ(enumC919170a1jXB0, size));
    }

    public static boolean LJJJI() {
        return C915980Zwa.LIZIZ().Dn0().isCatchBean() && C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult();
    }

    public static boolean LJJJIL() {
        return C915980Zwa.LIZIZ().Dn0().isTakeTheStage() && C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult();
    }

    public static boolean LJJJJ() {
        return C915980Zwa.LJII().LLILZLL(true).size() > 2 || C970370bMJ.LJII();
    }

    public final void LJLIL() {
        C915980Zwa.LJFF().RY(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(LJIIIIZZ, "pk_icon");
        linkedHashMap.put("click_area", "exit");
        if (Intrinsics.LJFF("pk_icon", "pk_icon") || Intrinsics.LJFF("pk_icon", "plaza_icon")) {
            linkedHashMap.put("icon_style", LJJIL("pk_icon"));
        }
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LIZJ(linkedHashMap, false);
        LJFF(linkedHashMap);
        LJI(linkedHashMap);
        LIZ(linkedHashMap);
        LJIILL(linkedHashMap);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        if (C955580ayS.LJ != 0 && (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) || Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI))) {
            linkedHashMap.put(LJJIJIL, String.valueOf(C955580ayS.LJ));
        }
        String strLIZIZ = (String) ((LinkedHashMap) LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        LJLLLLLL("livesdk_pk_management_panel_click", "1", EnumC944810ah5.MANUAL_PK.getType(), strLIZIZ, linkedHashMap);
    }

    public static void LIZ(Map map) {
        map.put(LJJIJL, String.valueOf(C915980Zwa.LJII().js()));
        map.put(LJJIJLIJ, String.valueOf(C915980Zwa.LJII().T9() ? 1 : 0));
    }

    public static void LIZIZ(Map map) {
        Object obj;
        if (!C163000js.LIZ()) {
            return;
        }
        String str = "1";
        if (C915980Zwa.LJ().jG()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_ai_comment_on", obj);
        if (!C915980Zwa.LJ().IP1()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_share_perf_on", str);
    }

    public static void LJFF(Map map) {
        map.put("connection_inviter_id", String.valueOf(C915980Zwa.LJI().LIZ().LJJIJL()));
        map.put("connection_invitee_id", String.valueOf(C915980Zwa.LJI().LIZ().LLJLLIL()));
    }

    public static void LJI(Map map) {
        String str;
        String str2;
        C951420ark c951420arkLLFF = C915980Zwa.LJI().LIZ().LLFF();
        if (c951420arkLLFF != null && (str = c951420arkLLFF.LIZ) != null && !a0.LJJJIL(str)) {
            C951420ark c951420arkLLFF2 = C915980Zwa.LJI().LIZ().LLFF();
            if (c951420arkLLFF2 == null || (str2 = c951420arkLLFF2.LIZ) == null) {
                str2 = "";
            }
            map.put("cohost_invite_request_from", str2);
        }
    }

    public static void LJIIIIZZ(Map map) {
        String str;
        MatchSettingsInfo matchSettingsInfoLJJ;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null && (matchSettingsInfoLJJ = interfaceC975810bV5LIZLLL.LJJ()) != null && matchSettingsInfoLJJ.enableAutoIceShowdown) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_iceshowdown_auto_set", str);
    }

    public static void LJIIIZ(Map map) {
        String str;
        if (C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_2V2 && (!a0.LJJJIL(LJLLJ))) {
            map.put(LJJIL, LJLLJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addInviteReason: ");
        C943870afZ enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom();
        if (enterFrom != null) {
            str = enterFrom.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" , inviteReason = ");
        sbLIZ.append(LJLLJ);
        sbLIZ.append(" ，currentType = ");
        sbLIZ.append(C915980Zwa.LJFF().xB0());
        C20441214yg.LJ("InviteReason", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIJJI(Map map) {
        CharSequence charSequence = (CharSequence) map.get(LJJIIZI);
        if (charSequence == null || charSequence.length() == 0) {
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LJII(map);
        }
    }

    public static void LJIILL(Map map) {
        map.put("last_request_id", C915980Zwa.LJI().LIZ().LJZ());
    }

    public static void LJIJI(Map map) {
        String str;
        int i = C973610bRX.LIZJ[C915980Zwa.LJFF().RY(false).ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = LiveCenterMockToolSwitch.PUNISH;
            }
        } else {
            str = "pk_phase";
        }
        ((HashMap) map).put("match_status", str);
    }

    public static void LJJIFFI(Map map) {
        String str;
        if (C955400ayA.LJJIJLIJ) {
            if (C955400ayA.LJJIJIL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_linked_before", str);
            if (C955400ayA.LJJIL != EnumC955660aya.INVITEE) {
                map.put("relation_label", C955400ayA.LJJIJIIJI);
                return;
            }
            return;
        }
        C955400ayA.LIZ.LJJIJ(map, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
    }

    public static void LJJIII(Map map) {
        if (!LiveMatchCohostContentGuideEnabledSetting.INSTANCE.getValue()) {
            return;
        }
        map.put(LJJJJI, C973690bRf.LJIILL(false));
        map.put(LJJJIL, CardStruct.IStatusCode.DEFAULT);
    }

    public static void LJJIIJ(Map map) {
        String strLJJIJIIJI = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
        EnumC973640bRa enumC973640bRaLJ = C925640aCA.LJ(strLJJIJIIJI);
        if (Intrinsics.LJFF(strLJJIJIIJI, "playbook_match")) {
            strLJJIJIIJI = "match_playbook";
        }
        String str = LJIIIIZZ;
        if (enumC973640bRaLJ != EnumC973640bRa.OTHER_VALUE) {
            strLJJIJIIJI = enumC973640bRaLJ.getValue();
        }
        map.put(str, strLJJIJIIJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIJZLJL(java.util.Map r5) {
        /*
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r2 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            if (r2 == 0) goto Lac
            java.lang.String r3 = X.C973660bRc.LIZJ
            long r0 = r2.getOwnerUserId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.put(r3, r0)
            java.lang.String r1 = X.C973660bRc.LJFF
            java.lang.String r0 = r2.getIdStr()
            r5.put(r1, r0)
            java.lang.String r1 = X.C973660bRc.LJIIZILJ
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r0 = qo2.w.LJIIL()
            r5.put(r1, r0)
            java.lang.String r1 = X.C973660bRc.LJIJ
            java.lang.String r0 = qo2.w.LJIIIZ()
            r5.put(r1, r0)
            java.lang.String r1 = X.C973660bRc.LJIJI
            java.lang.String r0 = qo2.w.LIZLLL()
            r5.put(r1, r0)
            java.lang.String r1 = X.C955400ayA.LJJJ
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L53
            java.lang.String r0 = X.C973660bRc.LJIJJ
            if (r1 != 0) goto L50
            java.lang.String r1 = ""
        L50:
            r5.put(r0, r1)
        L53:
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0ayC r0 = r0.LIZ()
            java.lang.String r0 = r0.LLJJJJLIIL()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "last_request_id"
            if (r0 != 0) goto L8a
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0ayC r0 = r0.LIZ()
            java.lang.String r0 = r0.LLJJJJLIIL()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.put(r1, r0)
        L7a:
            long r3 = r2.liveSubOnly
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lac
            java.lang.String r1 = "1"
        L84:
            java.lang.String r0 = "is_subscriber_only_live"
            r5.put(r0, r1)
            return
        L8a:
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0ayC r0 = r0.LIZ()
            java.lang.String r0 = r0.LJZ()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7a
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0ayC r0 = r0.LIZ()
            java.lang.String r0 = r0.LJZ()
            r5.put(r1, r0)
            goto L7a
        Lac:
            java.lang.String r1 = "0"
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJJIIJZLJL(java.util.Map):void");
    }

    public static void LJJIJIL(Map map) {
        String str = LJIIIIZZ;
        Object obj = ((LinkedHashMap) map).get(str);
        if (Intrinsics.LJFF(obj, EnumC973640bRa.TAKE_STAGE_GUIDE.getValue()) || Intrinsics.LJFF(obj, EnumC973640bRa.TAKE_STAGE_GUIDE_V2.getValue()) || Intrinsics.LJFF(obj, EnumC973640bRa.CATCH_BEANS_GUIDE.getValue())) {
            map.put(str, "popup_guide");
        }
    }

    public static String LJJIL(String str) {
        if (Intrinsics.LJFF(str, "plaza_icon")) {
            if (LJJJIL()) {
                return EnumC973650bRb.STAGE.getIconStyle();
            }
            if (LJJJI()) {
                return EnumC973650bRb.BEANS.getIconStyle();
            }
            return EnumC973650bRb.NORMAL.getIconStyle();
        }
        if (!Intrinsics.LJFF(str, "league_rank_quick_match") && !Intrinsics.LJFF(str, "rank_quick_match")) {
            if (!Intrinsics.LJFF(str, EnumC973640bRa.PK_GUIDE.getValue()) && !Intrinsics.LJFF(str, EnumC973640bRa.INDIVIDUAL_GUIDE.getValue()) && !Intrinsics.LJFF(str, EnumC973640bRa.MULTI_PK_GUIDE.getValue())) {
                if (Intrinsics.LJFF(str, "pk_icon") && C915980Zwa.LIZLLL().Nt()) {
                    if (!C918210a0B.LIZLLL) {
                        return EnumC973650bRb.DURING_PK_NORMAL.getIconStyle();
                    }
                    return EnumC973650bRb.PLAY_BOOK_GUIDE_ICON.getIconStyle();
                }
                return EnumC973650bRb.NORMAL.getIconStyle();
            }
            return EnumC973650bRb.NORMAL.getIconStyle();
        }
        return EnumC973650bRb.QUICK_MATCH.getIconStyle();
    }

    public static void LJLLI(boolean z) {
        long jLJIIL = C930540aK4.LJIIL();
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        C925640aCA.LJ(C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJ != jLJIIL) {
                LIZ.LJLJLLL(0L, listLLILZLL, null, true, z, "2v2", LJJLIIIJL, C915980Zwa.LJI().LIZ().LJIILLIIL());
            }
        }
    }

    public final void LJJL(String str) {
        HashMap map = new HashMap();
        boolean zLJJJJ = LJJJJ();
        map.put(LJJII, "anchor");
        map.put(LJ, String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        String str2 = LJIILJJIL;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        map.put(str2, CardStruct.IStatusCode.DEFAULT);
        map.put(LJIIIIZZ, "pk_icon");
        map.put("click_area", str);
        LJJIIJZLJL(map);
        if (zLJJJJ) {
            str3 = "1";
        }
        LJLLLLLL("livesdk_pk_ice_showdown_guide_popup_click", str3, EnumC944810ah5.MANUAL_PK.getType(), "", map);
    }

    public final void LJJLIIIJJI(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(LJIIJJI, LJJJLIIL);
        linkedHashMap.put(LJ, String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        linkedHashMap.put(LJJL, str);
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(linkedHashMap);
        String label = C915980Zwa.LJI().LIZ().getAnchorType().getLabel();
        if (C915980Zwa.LJII().LLFFF()) {
            EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
            if (!Intrinsics.LJFF(label, enumC955660aya.getLabel())) {
                linkedHashMap.put(LJIILL, label);
            } else if (C915980Zwa.LJI().LIZ().LJJJIL() != enumC955660aya) {
                linkedHashMap.put(LJIILL, C915980Zwa.LJI().LIZ().LJJJIL().getLabel());
            }
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJII(linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_group_pk_teammate_leave_selected");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public final void LJJZ(boolean z) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJJIIJZLJL(linkedHashMap);
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        LJIJ(this, linkedHashMap, false, false, false, 12);
        if (LJJJJ()) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            LJZ(this, "livesdk_pk_only_gift_gift_click", linkedHashMap, C917350Zyn.LIZIZ(enumC919170a1jXB0, size));
            return;
        }
        LJZI(this, "livesdk_pk_only_gift_gift_click", linkedHashMap, "1v1");
    }

    public static void LIZJ(Map map, boolean z) {
        Boolean boolValueOf;
        String str;
        String str2 = LJIILL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(z);
        if (interfaceC973730bRjYf2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        map.put(str2, str);
    }

    public static void LJII(Map map, boolean z) {
        String str;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(z);
        if (interfaceC973730bRjYf2 != null && interfaceC973730bRjYf2.LJIILLIIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_auto_iceshowdown", str);
    }

    public static void LJIIL(Map map, EnumC919170a1j enumC919170a1j) {
        String str;
        if (!LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled()) {
            return;
        }
        if (C973970bS7.LIZJ().LIZ == enumC919170a1j) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_default_match_type", str);
    }

    public static void LJIILIIL(String str, Map map) {
        String strLIZIZ;
        String str2;
        if (!LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled()) {
            return;
        }
        C973960bS6 c973960bS6LIZ = C973970bS7.LIZ();
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        EnumC919170a1j enumC919170a1j = c973960bS6LIZ.LIZ;
        if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_2V2) {
            int size = listLLILZLL.size();
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        strLIZIZ = "";
                    } else {
                        strLIZIZ = "1v3";
                    }
                } else {
                    strLIZIZ = "1v2";
                }
            } else {
                strLIZIZ = "2v2_pairing";
            }
        } else {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            int size2 = listLLILZLL.size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1j, size2);
        }
        if (Intrinsics.LJFF(str, strLIZIZ)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        ((HashMap) map).put("is_default_sub_match_type", str2);
    }

    public static void LJIILJJIL(String str, Map map) {
        long jLongValue;
        GiftModeMetaV2 giftModeMetaV2LJJII;
        String str2;
        Long lLJIILIIL;
        if (!LIZIZ.contains(str)) {
            return;
        }
        String str3 = (String) map.get("only_gift_id");
        if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null) {
            giftModeMetaV2LJJII = interfaceC975810bV5LIZLLL.LJJII();
        } else {
            giftModeMetaV2LJJII = null;
        }
        if (!C156900it.LJIIIZ(giftModeMetaV2LJJII) && !C156900it.LJIIJJI(jLongValue)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        map.put("is_only_gift_community_gift", str2);
    }

    public static void LJIJJ(Map map, boolean z) {
        Map<Long, Long> mapLJJLJLI;
        Long l;
        String string;
        String string2;
        Map<Long, Long> mapLJJLJLI2;
        Long l2;
        String string3;
        Map<Long, Long> mapLJJLJLI3;
        Long l3;
        String string4;
        Map<Long, Long> mapLJJLJLI4;
        Long l4;
        String string5;
        Map<Long, Long> mapLJJLJLI5;
        Long l5;
        String str = LJIL;
        Object obj = ((LinkedHashMap) LJLJLLL).get(str);
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        map.put(str, obj);
        String str2 = LJJIIJ;
        if (!map.containsKey(str2)) {
            Object obj3 = ((LinkedHashMap) LJLJLLL).get(str2);
            if (obj3 == null) {
                obj3 = "";
            }
            map.put(str2, obj3);
        }
        String str3 = LJIIIZ;
        Object obj4 = ((LinkedHashMap) LJLJLLL).get(str3);
        if (obj4 == null) {
            obj4 = "";
        }
        map.put(str3, obj4);
        String str4 = LJIIJ;
        Object obj5 = ((LinkedHashMap) LJLJLLL).get(str4);
        if (obj5 == null) {
            obj5 = "";
        }
        map.put(str4, obj5);
        String str5 = LJIILL;
        Object obj6 = ((LinkedHashMap) LJLJLLL).get(str5);
        if (obj6 == null) {
            obj6 = "";
        }
        map.put(str5, obj6);
        Object obj7 = ((LinkedHashMap) LJLJLLL).get("right_user_id");
        if (obj7 == null) {
            obj7 = "";
        }
        map.put("right_user_id", obj7);
        Object obj8 = ((LinkedHashMap) LJLJLLL).get("request_id");
        if (obj8 == null) {
            obj8 = "";
        }
        map.put("request_id", obj8);
        String str6 = LJ;
        Object obj9 = ((LinkedHashMap) LJLJLLL).get(str6);
        if (obj9 == null) {
            obj9 = "";
        }
        map.put(str6, obj9);
        String str7 = LJJIIZI;
        Object obj10 = ((LinkedHashMap) LJLJLLL).get(str7);
        if (obj10 == null) {
            obj10 = "";
        }
        map.put(str7, obj10);
        String str8 = LJIILJJIL;
        Object obj11 = ((LinkedHashMap) LJLJLLL).get(str8);
        if (obj11 == null) {
            obj11 = "";
        }
        map.put(str8, obj11);
        String str9 = LJIIIIZZ;
        Object obj12 = ((LinkedHashMap) LJLJLLL).get(str9);
        if (obj12 == null) {
            obj12 = "";
        }
        map.put(str9, obj12);
        String str10 = LJFF;
        Object obj13 = ((LinkedHashMap) LJLJLLL).get(str10);
        if (obj13 == null) {
            obj13 = "";
        }
        map.put(str10, obj13);
        Object obj14 = ((LinkedHashMap) LJLJLLL).get("connection_inviter_id");
        if (obj14 == null) {
            obj14 = "";
        }
        map.put("connection_inviter_id", obj14);
        Object obj15 = ((LinkedHashMap) LJLJLLL).get("connection_invitee_id");
        if (obj15 == null) {
            obj15 = "";
        }
        map.put("connection_invitee_id", obj15);
        String str11 = (String) ((LinkedHashMap) LJLJLLL).get("pk_inviter_id");
        if (str11 == null) {
            str11 = "";
        }
        String str12 = (String) ((LinkedHashMap) LJLJLLL).get("pk_invitee_id");
        if (str12 == null) {
            str12 = "";
        }
        Object obj16 = ((LinkedHashMap) LJLJLLL).get("pk_invitee_list");
        if (obj16 == null) {
            obj16 = "";
        }
        map.put("pk_inviter_id", str11);
        map.put("pk_invitee_id", str12);
        map.put(LJJIFFI, obj16);
        String str13 = LJII;
        Object obj17 = ((LinkedHashMap) LJLJLLL).get(str13);
        if (obj17 == null) {
            obj17 = "";
        }
        map.put(str13, obj17);
        Object obj18 = ((LinkedHashMap) LJLJLLL).get("sub_match_type");
        if (obj18 == null) {
            obj18 = "";
        }
        map.put("sub_match_type", obj18);
        String str14 = LJJIII;
        Object obj19 = ((LinkedHashMap) LJLJLLL).get(str14);
        if (obj19 != null) {
            obj2 = obj19;
        }
        map.put(str14, obj2);
        String str15 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            try {
                if (C970370bMJ.LJIIIIZZ()) {
                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf2 == null || (mapLJJLJLI3 = interfaceC973730bRjYf2.LJJLJLI()) == null || (l3 = mapLJJLJLI3.get(1L)) == null || (string2 = l3.toString()) == null) {
                        string2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    map.put("inviter_pk_score", string2);
                    InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf22 != null && (mapLJJLJLI2 = interfaceC973730bRjYf22.LJJLJLI()) != null && (l2 = mapLJJLJLI2.get(2L)) != null && (string3 = l2.toString()) != null) {
                        str15 = string3;
                    }
                    map.put("invitee_pk_score", str15);
                    return;
                }
                InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf23 != null && (mapLJJLJLI = interfaceC973730bRjYf23.LJJLJLI()) != null && (l = mapLJJLJLI.get(Long.valueOf(CastLongProtector.parseLong(str11)))) != null && (string = l.toString()) != null) {
                    str15 = string;
                }
                map.put("inviter_pk_score", str15);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        try {
            InterfaceC973730bRj interfaceC973730bRjYf24 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf24 == null || (mapLJJLJLI5 = interfaceC973730bRjYf24.LJJLJLI()) == null || (l5 = mapLJJLJLI5.get(Long.valueOf(CastLongProtector.parseLong(str11)))) == null || (string4 = l5.toString()) == null) {
                string4 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("inviter_pk_score", string4);
            if (interfaceC973730bRjYf24 != null && (mapLJJLJLI4 = interfaceC973730bRjYf24.LJJLJLI()) != null && (l4 = mapLJJLJLI4.get(Long.valueOf(CastLongProtector.parseLong(str12)))) != null && (string5 = l4.toString()) != null) {
                str15 = string5;
            }
            map.put("invitee_pk_score", str15);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJ(java.util.Map r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJJ(java.util.Map, boolean):void");
    }

    public static void LJJI(String str, Map map) {
        long j;
        if (Intrinsics.LJFF(str, "livesdk_punish_end")) {
            j = LJLJJI;
        } else {
            j = LJLJI;
        }
        if (j == 0) {
            map.put(LJJJJIZL, CardStruct.IStatusCode.DEFAULT);
        } else {
            map.put(LJJJJJ, String.valueOf(j));
            map.put(LJJJJIZL, "1");
        }
        if (Intrinsics.LJFF(str, "livesdk_pk_end")) {
            LJLJJI = LJLJI;
            LJLJI = 0L;
        } else {
            if (!Intrinsics.LJFF(str, "livesdk_punish_end")) {
                return;
            }
            LJLJJI = 0L;
        }
    }

    public static void LJJII(Map map, boolean z) {
        boolean z2;
        Object obj;
        Object obj2;
        C973800bRq c973800bRqZ8;
        if (!LiveMatchCohostContentGuideEnabledSetting.INSTANCE.getValue()) {
            return;
        }
        String str = LJIIIIZZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        CharSequence charSequence = (CharSequence) linkedHashMap.get(str);
        boolean z3 = false;
        if (charSequence != null && charSequence.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            obj = "rematch";
        } else {
            obj = linkedHashMap.get(str);
        }
        String str2 = LJIL;
        CharSequence charSequence2 = (CharSequence) linkedHashMap.get(str2);
        if (charSequence2 == null || charSequence2.length() == 0) {
            z3 = true;
        }
        if (z3) {
            obj2 = "1";
        } else {
            obj2 = linkedHashMap.get(str2);
        }
        if (Intrinsics.LJFF(obj, "rematch") && Intrinsics.LJFF(obj2, "1")) {
            if (z) {
                c973800bRqZ8 = C915980Zwa.LIZIZ().z8();
            } else {
                c973800bRqZ8 = C915980Zwa.LJFF().z8();
            }
            if (c973800bRqZ8 != null) {
                map.put(LJJJI, c973800bRqZ8.LIZ);
                map.put(LJJJIL, c973800bRqZ8.LIZIZ);
                map.put(LJJJJ, c973800bRqZ8.LIZJ);
            }
        }
    }

    public static void LJJIIZ(String str, Map map) {
        Object obj;
        Object obj2;
        if (C163000js.LIZ() && Intrinsics.LJFF(str, "match_option")) {
            String str2 = "1";
            if (C163000js.LIZ()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("has_ai_comment", obj);
            if (C915980Zwa.LJ().jG()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_ai_comment_on", obj2);
            if (!C915980Zwa.LJ().IP1()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_share_perf_on", str2);
        }
    }

    public static void LJJIJ(List list, Map map) {
        List<Long> list2;
        Object next;
        Long lValueOf;
        Object next2;
        List<Long> list3;
        Object next3;
        Object next4;
        List<Long> list4;
        Object next5;
        List<Long> list5;
        Object next6;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                list2 = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((TeamUsersInfo) next).userIds.contains(Long.valueOf(LJJIJLIJ()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo = (TeamUsersInfo) next;
            if (teamUsersInfo != null) {
                lValueOf = Long.valueOf(teamUsersInfo.teamId);
            } else {
                lValueOf = null;
            }
            if (lValueOf == null || (lValueOf.longValue() != 1 && lValueOf.longValue() != 2)) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        long j = ((TeamUsersInfo) next2).teamId;
                        if (lValueOf != null && j == lValueOf.longValue()) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                TeamUsersInfo teamUsersInfo2 = (TeamUsersInfo) next2;
                if (teamUsersInfo2 != null) {
                    list3 = teamUsersInfo2.userIds;
                } else {
                    list3 = null;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next3 = it4.next();
                        long j2 = ((TeamUsersInfo) next3).teamId;
                        if (lValueOf == null || j2 != lValueOf.longValue()) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                TeamUsersInfo teamUsersInfo3 = (TeamUsersInfo) next3;
                if (teamUsersInfo3 != null) {
                    list2 = teamUsersInfo3.userIds;
                }
                if (list3 != null && !list3.isEmpty()) {
                    map.put(LJIIIZ, C13LP.LJJLIIIJ(list3, ",", null, null, 0, null, null, 62));
                    map.put(LJJIII, String.valueOf(list3.size()));
                }
                if (list2 != null && !list2.isEmpty()) {
                    map.put(LJIIJ, C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
                    return;
                }
                return;
            }
            Iterator it5 = list.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next4 = it5.next();
                    if (((TeamUsersInfo) next4).teamId == 1) {
                        break;
                    }
                } else {
                    next4 = null;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo4 = (TeamUsersInfo) next4;
            if (teamUsersInfo4 != null) {
                list4 = teamUsersInfo4.userIds;
            } else {
                list4 = null;
            }
            Iterator it6 = list.iterator();
            while (true) {
                if (it6.hasNext()) {
                    next5 = it6.next();
                    if (((TeamUsersInfo) next5).teamId == 2) {
                        break;
                    }
                } else {
                    next5 = null;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo5 = (TeamUsersInfo) next5;
            if (teamUsersInfo5 != null) {
                list5 = teamUsersInfo5.userIds;
            } else {
                list5 = null;
            }
            Iterator it7 = list.iterator();
            while (true) {
                if (it7.hasNext()) {
                    next6 = it7.next();
                    if (((TeamUsersInfo) next6).teamId == lValueOf.longValue()) {
                        break;
                    }
                } else {
                    next6 = null;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo6 = (TeamUsersInfo) next6;
            if (teamUsersInfo6 != null) {
                list2 = teamUsersInfo6.userIds;
            }
            if (list4 != null && !list4.isEmpty()) {
                map.put(LJIIIZ, C13LP.LJJLIIIJ(list4, ",", null, null, 0, null, null, 62));
            }
            if (list5 != null && !list5.isEmpty()) {
                map.put(LJIIJ, C13LP.LJJLIIIJ(list5, ",", null, null, 0, null, null, 62));
            }
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            map.put(LJJIII, String.valueOf(list2.size()));
        }
    }

    public static void LJJIJIIJI(Map map, boolean z) {
        InterfaceC973730bRj interfaceC973730bRjYf2;
        BattleSetting battleSettingLJIILIIL;
        Integer numValueOf;
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf22.LJIILIIL()) != null && (numValueOf = Integer.valueOf(battleSettingLJIILIIL.inviteType)) != null) {
            LJIIJ(numValueOf.intValue(), false, map);
        }
        if (z && (interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false)) != null) {
            long jLJJLIIIJ = interfaceC973730bRjYf2.LJJLIIIJ();
            if (jLJJLIIIJ > 0) {
                InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf23 != null) {
                    interfaceC973730bRjYf23.LIZIZ(0L);
                }
                map.put(LJJJZ, String.valueOf(C974520bT0.LIZ() - jLJJLIIIJ));
            }
        }
        map.put(LJJIJL, String.valueOf(C915980Zwa.LJII().js()));
    }

    public static void LJJIJIIJIL(List list, Map map) {
        String str = CardStruct.IStatusCode.DEFAULT;
        if (list != null) {
            map.put("team_member_cnts", String.valueOf(list.size()));
            if (LJLJL) {
                str = "1";
            }
            map.put("is_change_team_member", str);
            return;
        }
        map.put("team_member_cnts", CardStruct.IStatusCode.DEFAULT);
    }

    public static void LJJIJL(String str, Map map) {
        if (!LJLJJL.contains(str) || LJLLLL()) {
            return;
        }
        map.put("fans_club_level", String.valueOf(LJLLILLLL()));
        map.put("fans_club_status", String.valueOf(LJLLJ()));
    }

    public static String LJJJ(long j, long j2) {
        if (j > 0) {
            return String.valueOf(j2 - j);
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static Long LJLLL(CommunityHeartMeInfo communityHeartMeInfo, String str) {
        if (communityHeartMeInfo != null) {
            return Long.valueOf(communityHeartMeInfo.anchorCommunityLevel);
        }
        Long lValueOf = null;
        if (a0.LJJJIL(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("anchor_community_level")) {
                lValueOf = Long.valueOf(jSONObject.optLong("anchor_community_level"));
                return lValueOf;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolveAnchorCommunityLevel failed, infoStr=");
            sbLIZ.append(str);
            C20441214yg.LJ("MatchTraceCodeUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        return lValueOf;
    }

    public final void LJJJJIZL(DataChannel dataChannel, boolean z) {
        String str;
        HashMap map = new HashMap();
        LIZLLL(map, dataChannel, false);
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        map.put("action", str);
        LJLLLLLL("livesdk_pk_ai_comment_icon", CardStruct.IStatusCode.DEFAULT, EnumC944810ah5.MANUAL_PK.getType(), "", map);
    }

    public final void LJJJJLI(DataChannel dataChannel, String str) {
        HashMap map = new HashMap();
        LIZLLL(map, dataChannel, false);
        map.put("toast_style", str);
        LJLLLLLL("livesdk_pk_ai_comment_switch_toast", CardStruct.IStatusCode.DEFAULT, EnumC944810ah5.MANUAL_PK.getType(), "", map);
    }

    public final void LJJLIIIJL(List list, boolean z) {
        String str;
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        String str2 = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (string = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str2, string);
        LJIJ(this, linkedHashMap, false, false, false, 12);
        LJJIJ(list, linkedHashMap);
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        c917350Zyn.getClass();
        LJZ(this, "livesdk_pk_ranking_entrance_show", linkedHashMap, C917350Zyn.LIZIZ(enumC919170a1jXB0, size));
    }

    public final void LJJLIIIJLLLLLLLZ(DataChannel dataChannel, boolean z) {
        String string;
        List<C954460awe> value;
        MutableLiveData<List<C954460awe>> mutableLiveData;
        MutableLiveData<List<C954460awe>> mutableLiveData2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIJ(this, linkedHashMap, z, false, false, 12);
        LJJIIJ(linkedHashMap);
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        linkedHashMap.put("live_status", C915980Zwa.LIZLLL().pY0(dataChannel));
        linkedHashMap.put(LJIJJLI, String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        String str = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (interfaceC973730bRjYf2 == null || (string = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str, string);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(linkedHashMap);
        String str3 = LJIL;
        if (z) {
            str2 = "1";
        }
        linkedHashMap.put(str3, str2);
        LIZ(linkedHashMap);
        LJJIIZ("match_option", linkedHashMap);
        if (LJJJJ()) {
            C969470bKr c969470bKr = LJLJJLL;
            List<C954460awe> value2 = null;
            if (c969470bKr != null && (mutableLiveData2 = c969470bKr.LJ) != null) {
                value = mutableLiveData2.getValue();
            } else {
                value = null;
            }
            C969470bKr c969470bKr2 = LJLJJLL;
            if (c969470bKr2 != null && (mutableLiveData = c969470bKr2.LJFF) != null) {
                value2 = mutableLiveData.getValue();
            }
            LJJIIZI(value, value2, linkedHashMap);
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            LJZ(this, "livesdk_pk_option_click", linkedHashMap, C917350Zyn.LIZIZ(enumC919170a1jXB0, size));
            return;
        }
        LJZI(this, "livesdk_pk_option_click", linkedHashMap, "1v1");
    }

    public final void LJJLL(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put(LJIIIIZZ, str2);
        } else {
            LJJIIJ(linkedHashMap);
        }
        linkedHashMap.put(LJ, String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(linkedHashMap);
        LIZ(linkedHashMap);
        String label = C915980Zwa.LJI().LIZ().getAnchorType().getLabel();
        if (C915980Zwa.LJII().LLFFF()) {
            EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
            if (!Intrinsics.LJFF(label, enumC955660aya.getLabel())) {
                linkedHashMap.put("anchor_type", label);
            } else if (C915980Zwa.LJI().LIZ().LJJJIL() != enumC955660aya) {
                linkedHashMap.put("anchor_type", C915980Zwa.LJI().LIZ().LJJJIL().getLabel());
            }
        }
        linkedHashMap.put(LJI, String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
        LJZ(this, "livesdk_pk_guide_popup_show", linkedHashMap, str);
    }

    public final void LJLIIL(String str, boolean z) {
        String str2;
        C915980Zwa.LJFF().RY(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(LJIIIIZZ, str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_clickable", str2);
        if (Intrinsics.LJFF(str, "pk_icon") || Intrinsics.LJFF(str, "plaza_icon") || Intrinsics.LJFF(str, "league_rank_quick_match") || Intrinsics.LJFF(str, "rank_quick_match")) {
            linkedHashMap.put("icon_style", LJJIL(str));
        }
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LIZIZ(linkedHashMap);
        LJFF(linkedHashMap);
        LJI(linkedHashMap);
        LIZ(linkedHashMap);
        LJIILL(linkedHashMap);
        c955400ayA.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        if (C955580ayS.LJ != 0 && (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) || Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI))) {
            linkedHashMap.put(LJJIJIL, String.valueOf(C955580ayS.LJ));
        }
        if (Intrinsics.LJFF(str, "music_spotlight")) {
            linkedHashMap.put("enter_from", "music_spotlight_page");
            LiveMusicSpotlightSetting liveMusicSpotlightSetting = LiveMusicSpotlightSetting.INSTANCE;
            if (C500260Jjc.LJJIJ(liveMusicSpotlightSetting.getCreatorTypeName())) {
                String creatorTypeName = liveMusicSpotlightSetting.getCreatorTypeName();
                if (creatorTypeName == null) {
                    creatorTypeName = "";
                }
                linkedHashMap.put("music_anchor_type", creatorTypeName);
            }
        }
        LJLLLLLL("livesdk_pk_icon_show", "1", EnumC944810ah5.MANUAL_PK.getType(), "", linkedHashMap);
    }

    public final void LJLILLLLZI(boolean z, boolean z2) {
        boolean z3;
        List<TeamUsersInfo> listLJJJ;
        String str;
        String str2;
        String str3;
        List<Long> list;
        EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
        if ((EnumC964170bCJ.MATCH_START.compareTo(enumC964170bCJRY) <= 0 && enumC964170bCJRY.compareTo(EnumC964170bCJ.SETTLE_START) < 0) || EnumC964170bCJ.PUNISH_START.compareTo(enumC964170bCJRY) > 0 || enumC964170bCJRY.compareTo(EnumC964170bCJ.DRAW) >= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            listLJJJ = interfaceC973730bRjYf2.LJJJ();
        } else {
            listLJJJ = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJJIJ(listLJJJ, linkedHashMap);
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        if (listLJJJ != null) {
            for (TeamUsersInfo teamUsersInfo : listLJJJ) {
                InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf22 != null && teamUsersInfo.teamId == interfaceC973730bRjYf22.LJJJJJ() && (list = teamUsersInfo.userIds) != null) {
                    for (Long l : list) {
                        long jLJJIJLIJ = LJJIJLIJ();
                        if (l != null && l.longValue() == jLJJIJLIJ) {
                            linkedHashMap.put(LJJI, String.valueOf(LJJIJLIJ()));
                        } else {
                            linkedHashMap.put(LJJ, l.toString());
                        }
                    }
                }
            }
        }
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        if (!z3) {
            str = "disconnect_pk";
        } else {
            str = "disconnect_punish";
        }
        linkedHashMap.put("request_type", str);
        String str4 = LJIILLIIL;
        if (z) {
            str2 = "accept";
        } else {
            str2 = "reject";
        }
        linkedHashMap.put(str4, str2);
        if (z2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_turn_off", str3);
        LJIJ(this, linkedHashMap, false, false, false, 12);
        LJIL(this, linkedHashMap, true, 12);
        LJII(linkedHashMap, false);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        String str5 = LJJIIZI;
        Object obj = ((LinkedHashMap) LJLJLLL).get(str5);
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put(str5, obj);
        String str6 = LJJ;
        Object obj3 = ((LinkedHashMap) LJLJLLL).get(str6);
        if (obj3 != null) {
            obj2 = obj3;
        }
        linkedHashMap.put(str6, obj2);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        String strLIZIZ = (String) ((LinkedHashMap) LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        C973710bRh.LIZ(linkedHashMap);
        LJZ(this, "livesdk_pk_disconnect_received_click", linkedHashMap, strLIZIZ);
    }

    public static void LIZLLL(Map map, DataChannel dataChannel, boolean z) {
        Long lValueOf;
        Long lValueOf2;
        String str;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String str2 = LIZJ;
        Long lValueOf3 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        HashMap map2 = (HashMap) map;
        map2.put(str2, String.valueOf(lValueOf));
        String str3 = LJFF;
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        } else {
            lValueOf2 = null;
        }
        map2.put(str3, String.valueOf(lValueOf2));
        map2.put(LJ, String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        String str4 = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(z);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf3 = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
        }
        map2.put(str4, String.valueOf(lValueOf3));
        String str5 = LJJII;
        if (LJLLLL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        map2.put(str5, str);
        map2.put("live_status", C915980Zwa.LIZLLL().pY0(dataChannel));
    }

    public static void LJIIJ(int i, boolean z, Map map) {
        String str;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (!z) {
                        str = LJJLIL;
                    } else {
                        return;
                    }
                } else {
                    str = LJJLIIJ;
                }
            } else {
                str = LJJLIIIJLLLLLLLZ;
            }
        } else {
            str = LJJLIIIJLJLI;
        }
        if (str != null) {
            map.put(LJJJLZIJ, str);
        }
    }

    public static void LJIJJLI(boolean z, Map map, boolean z2) {
        Boolean boolValueOf;
        String str;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJJJJI());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        String str2 = LJIL;
        if (!zLJJJI && !z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put(str2, str);
        if (zLJJJI || z2) {
            String str3 = "not_draw";
            if (z) {
                BattleTeamResult battleTeamResult = C973890bRz.LIZJ;
                if (battleTeamResult != null && battleTeamResult.result == 2) {
                    str3 = "draw";
                }
                map.put("oncemore_type", str3);
            } else {
                C974450bSt c974450bSt = C973890bRz.LIZ;
                map.put("oncemore_type", "not_draw");
            }
        }
        LJJII(map, false);
    }

    public static void LJJIIZI(List list, List list2, Map map) {
        if (list != null && list2 != null) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null && interfaceC973730bRjYf2.LJJJJJ() == 2) {
                map.put(LJIIIZ, C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(125), 30));
                map.put(LJIIJ, C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(126), 30));
                map.put(LJJIII, String.valueOf(list2.size()));
            } else {
                map.put(LJIIIZ, C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(127), 30));
                map.put(LJIIJ, C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(128), 30));
                map.put(LJJIII, String.valueOf(list.size()));
            }
        }
    }

    public static void LJJJLL(long j, String str, boolean z) {
        long currentUserId;
        Long lValueOf;
        String str2;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        long ownerUserId = 0;
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = 0;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        }
        Pair[] pairArr = new Pair[3];
        boolean z2 = false;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        Long lValueOf2 = null;
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJL());
        } else {
            lValueOf = null;
        }
        pairArr[0] = new Pair("channel_id", String.valueOf(lValueOf));
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL());
        }
        pairArr[1] = new Pair("pk_id", String.valueOf(lValueOf2));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_opposite", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (C915980Zwa.LJFF().co0()) {
            mapLJIIJ.put("sub_match_type", C915980Zwa.LJFF().my());
        }
        String strValueOf = String.valueOf(j);
        if (currentUserId == ownerUserId) {
            z2 = true;
        }
        C01CC.LIZJ(str, strValueOf, mapLJIIJ, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIJ(java.util.List<? extends com.bytedance.android.livesdk.model.message.TeamUsersInfo> r23, boolean r24, X.EnumC973680bRe r25) {
        /*
            Method dump skipped, instruction units count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJJLIIJ(java.util.List, boolean, X.0bRe):void");
    }

    public final void LJJLIL(int i, String str, String str2) {
        String string;
        String str3;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if ((interfaceC973730bRjYf2 == null || interfaceC973730bRjYf2.er() <= 0) && LJLLILLLL <= 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put(LIZLLL, String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        String str4 = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (interfaceC973730bRjYf22 == null || (string = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put(str4, string);
        String str6 = LJJII;
        if (LJLLLL()) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        map.put(str6, str3);
        LJJIIJZLJL(map);
        LJIIZILJ(this, map, false, false, null, 14);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("role_notice_");
        sbLIZ.append(i);
        map.put("rule_show_type", C2188811AlT.LIZIZ(sbLIZ));
        map.put("task_period_type", str);
        map.put("pk_task_type", str2);
        map.put("pk_reward", "GIFT_MULTIPLE");
        String strLIZIZ = (String) ((LinkedHashMap) LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        if (C970370bMJ.LJII()) {
            str5 = "1";
        }
        LJLLLLLL("livesdk_pk_task_rule_show", str5, EnumC944810ah5.MANUAL_PK.getType(), strLIZIZ, map);
    }

    public final void LJJZZI(DataChannel dataChannel, String str, boolean z) {
        String string;
        Object obj;
        List<C954460awe> value;
        MutableLiveData<List<C954460awe>> mutableLiveData;
        MutableLiveData<List<C954460awe>> mutableLiveData2;
        ImageModel imageModel;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIJ(this, linkedHashMap, z, false, false, 12);
        LJJIIJ(linkedHashMap);
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        LJIIIIZZ(linkedHashMap);
        linkedHashMap.put("live_status", C915980Zwa.LIZLLL().pY0(dataChannel));
        linkedHashMap.put(LJIJJLI, String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        String str3 = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (interfaceC973730bRjYf2 == null || (string = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str3, string);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(linkedHashMap);
        String str5 = LJIL;
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str5, obj);
        List<GiftMode> listLIZLLL = C973890bRz.LIZLLL();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (listLIZLLL != null) {
            boolean z2 = false;
            for (GiftMode giftMode : listLIZLLL) {
                if (giftMode.labelText.length() > 0 || ((imageModel = giftMode.eventIconImage) != null && (str2 = imageModel.mUri) != null && str2.length() > 0)) {
                    arrayList.add(String.valueOf(giftMode.giftId));
                    z2 = true;
                }
                if (giftMode.labelText.length() > 0) {
                    arrayList2.add(giftMode.labelText);
                }
            }
            if (z2) {
                str4 = "1";
            }
        }
        linkedHashMap.put("is_label", str4);
        if (!arrayList.isEmpty()) {
            linkedHashMap.put("label_gift_id", C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, null, 56));
        }
        if (!arrayList2.isEmpty()) {
            linkedHashMap.put("label_text", C13LP.LJJLIIIJ(arrayList2, ",", e3.e, e3.f, 0, null, null, 56));
        }
        LJJIIZ(str, linkedHashMap);
        LIZ(linkedHashMap);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJII(linkedHashMap);
        if (LJJJJ()) {
            C969470bKr c969470bKr = LJLJJLL;
            List<C954460awe> value2 = null;
            if (c969470bKr != null && (mutableLiveData2 = c969470bKr.LJ) != null) {
                value = mutableLiveData2.getValue();
            } else {
                value = null;
            }
            C969470bKr c969470bKr2 = LJLJJLL;
            if (c969470bKr2 != null && (mutableLiveData = c969470bKr2.LJFF) != null) {
                value2 = mutableLiveData.getValue();
            }
            LJJIIZI(value, value2, linkedHashMap);
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            LJZ(this, "livesdk_pk_option_selection_page_show", linkedHashMap, C917350Zyn.LIZIZ(enumC919170a1jXB0, size));
            return;
        }
        LJZI(this, "livesdk_pk_option_selection_page_show", linkedHashMap, "1v1");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZIII(com.bytedance.ies.sdk.datachannel.DataChannel r14, java.lang.String r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJJZZIII(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, boolean):void");
    }

    public final void LJL(String str, boolean z, C955540ayO c955540ayO) {
        Boolean boolValueOf;
        EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = "during_pk";
        if (C915980Zwa.LJFF().co0()) {
            linkedHashMap.put("click_reason", "during_pk");
        } else if (LJJJIL()) {
            linkedHashMap.put("click_reason", "during_stage");
        } else if (LJJJI()) {
            linkedHashMap.put("click_reason", "during_beans");
        } else if (C915980Zwa.LJFF().fA2() || ((C915980Zwa.LIZIZ().Dn0().isCatchBean() && C915980Zwa.LIZIZ().JV1(false).isInviting()) || (C915980Zwa.LIZIZ().Dn0().isTakeTheStage() && C915980Zwa.LIZIZ().JV1(false).isInviting()))) {
            linkedHashMap.put("click_reason", "cancel_invite");
        } else {
            linkedHashMap.put("click_reason", "invite");
        }
        EnumC973640bRa enumC973640bRa = EnumC973640bRa.PK_GUIDE;
        boolean zLJFF = Intrinsics.LJFF(str, enumC973640bRa.getValue());
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if ((!zLJFF && !Intrinsics.LJFF(str, EnumC973640bRa.INDIVIDUAL_GUIDE.getValue()) && !Intrinsics.LJFF(str, EnumC973640bRa.MULTI_PK_GUIDE.getValue())) || enumC964170bCJRY.compareTo(EnumC964170bCJ.INVITED) < 0) {
            linkedHashMap.put("is_effective", "1");
        } else {
            linkedHashMap.put("is_effective", CardStruct.IStatusCode.DEFAULT);
        }
        if (C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.MATCH_START) < 0 || C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.MATCH_END) >= 0) {
            if (C915980Zwa.LJII().LLI() != EnumC950120ape.Linked && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
                str2 = "normal";
            } else {
                str2 = "during_connection";
            }
        }
        linkedHashMap.put("click_time", str2);
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        C955410ayB.LIZLLL(linkedHashMap, c955540ayO, false);
        LJJIIJZLJL(linkedHashMap);
        linkedHashMap.put(LJIIIIZZ, str);
        if (Intrinsics.LJFF(str, "pk_icon") || Intrinsics.LJFF(str, "plaza_icon") || Intrinsics.LJFF(str, "league_rank_quick_match") || Intrinsics.LJFF(str, "rank_quick_match") || Intrinsics.LJFF(str, enumC973640bRa.getValue()) || Intrinsics.LJFF(str, EnumC973640bRa.INDIVIDUAL_GUIDE.getValue()) || Intrinsics.LJFF(str, EnumC973640bRa.MULTI_PK_GUIDE.getValue())) {
            linkedHashMap.put("icon_style", LJJIL(str));
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LIZIZ(linkedHashMap);
        if (!z) {
            String str4 = LJJ;
            CharSequence charSequence = (CharSequence) linkedHashMap.get(str4);
            if ((charSequence == null || charSequence.length() == 0) && C915980Zwa.LJFF().co0()) {
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 != null) {
                    boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    linkedHashMap.put(str4, String.valueOf(LJJIJLIJ()));
                    linkedHashMap.put(LJJI, String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
                } else {
                    linkedHashMap.put(str4, String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
                    linkedHashMap.put(LJJI, String.valueOf(LJJIJLIJ()));
                }
            }
        }
        LJFF(linkedHashMap);
        LJI(linkedHashMap);
        LIZ(linkedHashMap);
        LJIILL(linkedHashMap);
        c955400ayA.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        if (C955580ayS.LJ != 0 && (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) || Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI))) {
            linkedHashMap.put(LJJIJIL, String.valueOf(C955580ayS.LJ));
        }
        if (Intrinsics.LJFF(str, "music_spotlight")) {
            linkedHashMap.put("enter_from", "music_spotlight_page");
            LiveMusicSpotlightSetting liveMusicSpotlightSetting = LiveMusicSpotlightSetting.INSTANCE;
            if (C500260Jjc.LJJIJ(liveMusicSpotlightSetting.getCreatorTypeName())) {
                String creatorTypeName = liveMusicSpotlightSetting.getCreatorTypeName();
                if (creatorTypeName == null) {
                    creatorTypeName = "";
                }
                linkedHashMap.put("music_anchor_type", creatorTypeName);
            }
        }
        linkedHashMap.put("pk_id", String.valueOf(C915980Zwa.LIZLLL().getBattleId()));
        C973710bRh.LIZ(linkedHashMap);
        if (z) {
            str3 = "1";
        }
        String str5 = str3;
        LJLLLLLL("livesdk_pk_click", str5, EnumC944810ah5.MANUAL_PK.getType(), C915980Zwa.LJFF().my(), linkedHashMap);
    }

    public final void LJLJJL(int i, boolean z, boolean z2) {
        String string;
        Object obj;
        Object obj2;
        boolean zLJII = C970370bMJ.LJII();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if ((interfaceC973730bRjYf2 == null || interfaceC973730bRjYf2.er() <= 0) && LJLLILLLL <= 0) {
            return;
        }
        HashMap map = new HashMap();
        LJJIIJZLJL(map);
        map.put(LIZLLL, String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        String str = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (interfaceC973730bRjYf22 == null || (string = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put(str, string);
        map.put("screen_height", String.valueOf(C465640INu.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context())));
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("pk_task_bar_location", obj);
        map.put("pk_task_bar_type", String.valueOf(i));
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_cqc_toast_show", obj2);
        String strLIZIZ = (String) ((LinkedHashMap) LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        if (zLJII) {
            str2 = "1";
        }
        LJLLLLLL("livesdk_pk_task_processbar_show", str2, EnumC944810ah5.MANUAL_PK.getType(), strLIZIZ, map);
    }

    public final void LJLJLJ(int i, boolean z, List<? extends TeamUsersInfo> list) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJJIIJZLJL(linkedHashMap);
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        if (i == 0) {
            str = "draw";
        } else {
            str = "not_draw";
        }
        linkedHashMap.put("oncemore_type", str);
        LJI(linkedHashMap);
        LIZ(linkedHashMap);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        LJJIII(linkedHashMap);
        LJJI("", linkedHashMap);
        C973710bRh.LIZ(linkedHashMap);
        if (z && C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            LJJIJ(list, linkedHashMap);
            C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
            C955400ayA.LJII(linkedHashMap);
            String strLIZIZ = (String) ((LinkedHashMap) LJLJLLL).get("sub_match_type");
            if (strLIZIZ == null) {
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                c917350Zyn.getClass();
                strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
            }
            LJZ(this, "livesdk_pk_oncemore_click", linkedHashMap, strLIZIZ);
            return;
        }
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        C955400ayA.LJII(linkedHashMap);
        linkedHashMap.put("right_user_id", String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
        LJZI(this, "livesdk_pk_oncemore_click", linkedHashMap, "1v1");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(java.util.Map r3, java.util.Map r4, java.lang.Long r5, java.lang.String r6) {
        /*
            if (r5 == 0) goto L31
            r5.longValue()
            if (r4 == 0) goto L31
            java.lang.Object r2 = r4.get(r5)
            com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo r2 = (com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo) r2
        Ld:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            java.lang.String r0 = "_league_ranking"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L2b
            com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection r0 = r2.leagueInfo
            if (r0 == 0) goto L2b
            com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText r0 = r0.displayText
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.content
            if (r0 != 0) goto L2d
        L2b:
            java.lang.String r0 = ""
        L2d:
            r3.put(r1, r0)
            return
        L31:
            r2 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJIILLIIL(java.util.Map, java.util.Map, java.lang.Long, java.lang.String):void");
    }

    public static void LJIL(C973660bRc c973660bRc, Map map, boolean z, int i) {
        boolean z2;
        Boolean boolValueOf;
        String str;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c973660bRc.getClass();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJJJJI());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        String str2 = LJIL;
        if (!zLJJJI) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put(str2, str);
        if (zLJJJI) {
            String str3 = "not_draw";
            if (z) {
                BattleTeamResult battleTeamResult = C973890bRz.LJ;
                if (battleTeamResult != null && battleTeamResult.result == 2) {
                    str3 = "draw";
                }
                map.put("oncemore_type", str3);
            } else {
                C974450bSt c974450bSt = C973890bRz.LIZ;
                map.put("oncemore_type", "not_draw");
            }
        }
        if (z2) {
            LJJII(map, false);
        }
    }

    public static void LJJLJLI(String str, String str2, String str3, int i) {
        C973660bRc c973660bRc = LIZ;
        if ((i & 2) != 0) {
            str2 = "try_now";
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 != null) {
            linkedHashMap.put(LJIIIIZZ, str3);
        } else {
            LJJIIJ(linkedHashMap);
        }
        linkedHashMap.put(LJ, String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        linkedHashMap.put("click_area", str2);
        LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(linkedHashMap);
        LIZ(linkedHashMap);
        String label = C915980Zwa.LJI().LIZ().getAnchorType().getLabel();
        if (C915980Zwa.LJII().LLFFF()) {
            EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
            if (!Intrinsics.LJFF(label, enumC955660aya.getLabel())) {
                linkedHashMap.put("anchor_type", label);
            } else if (C915980Zwa.LJI().LIZ().LJJJIL() != enumC955660aya) {
                linkedHashMap.put("anchor_type", C915980Zwa.LJI().LIZ().LJJJIL().getLabel());
            }
        }
        linkedHashMap.put(LJI, String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
        LJZ(c973660bRc, "livesdk_pk_guide_popup_click", linkedHashMap, str);
    }

    public static void LJZ(C973660bRc c973660bRc, String str, Map map, String str2) {
        c973660bRc.LJLLLLLL(str, "1", EnumC944810ah5.MANUAL_PK.getType(), str2, map);
    }

    public static void LJZI(C973660bRc c973660bRc, String str, Map map, String str2) {
        String type = EnumC944810ah5.MANUAL_PK.getType();
        c973660bRc.getClass();
        map.put(LJI, "2");
        c973660bRc.LJLLLLLL(str, CardStruct.IStatusCode.DEFAULT, type, str2, map);
    }

    public final void LJJJJLL(long j, long j2, long j3, boolean z) {
        String str;
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        String label = C915980Zwa.LJI().LIZ().getAnchorType().getLabel();
        if (C915980Zwa.LJII().LLFFF()) {
            EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
            if (!Intrinsics.LJFF(label, enumC955660aya.getLabel())) {
                linkedHashMap.put("anchor_type", label);
            } else if (C915980Zwa.LJI().LIZ().LJJJIL() != enumC955660aya) {
                linkedHashMap.put("anchor_type", C915980Zwa.LJI().LIZ().LJJJIL().getLabel());
            }
        }
        String str2 = LJJ;
        Object obj = ((LinkedHashMap) LJLJLLL).get(str2);
        String str3 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put(str2, obj);
        String str4 = LJJI;
        Object obj2 = ((LinkedHashMap) LJLJLLL).get(str4);
        if (obj2 == null) {
            obj2 = "";
        }
        linkedHashMap.put(str4, obj2);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_finish", str);
        linkedHashMap.put("task_target", String.valueOf(j));
        linkedHashMap.put("task_finish", String.valueOf(j2));
        linkedHashMap.put("recommend_gift_finish", String.valueOf(j3));
        String str5 = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (string = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str5, string);
        C1515210pX5.LIZLLL().getClass();
        Map mapLIZIZ = C1515210pX5.LIZIZ();
        if (mapLIZIZ == null) {
            mapLIZIZ = C2097608Jq.LJ();
        }
        String str6 = (String) mapLIZIZ.get("fake_region");
        String str7 = (String) mapLIZIZ.get("carrier_region");
        if (TextUtils.isEmpty(str6)) {
            str6 = str7;
        }
        if (!TextUtils.isEmpty(str6)) {
            str3 = str6;
            if (str6 == null) {
                "region mast not null".toString();
                throw new IllegalArgumentException("region mast not null");
            }
        }
        linkedHashMap.put("country", str3.toUpperCase(Locale.US));
        if (j2 != 0) {
            linkedHashMap.put("recommend_gift_contribution", String.valueOf((j3 * 1.0f) / (j2 * 1.0f)));
        } else {
            linkedHashMap.put("recommend_gift_contribution", CardStruct.IStatusCode.DEFAULT);
        }
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        String strLIZIZ = (String) ((LinkedHashMap) LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        if (C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            LJZ(this, "livesdk_pk_task_recommend_contribute", linkedHashMap, strLIZIZ);
        } else {
            LJZI(this, "livesdk_pk_task_recommend_contribute", linkedHashMap, "1v1");
        }
    }

    public final void LJJLJ(long j, List list, Map map, boolean z) {
        Object obj;
        Boolean boolValueOf;
        String string;
        Object obj2;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int size;
        Boolean boolValueOf4;
        Long lValueOf;
        Boolean boolValueOf5;
        LJLI = C974520bT0.LIZ();
        C946230ajN.LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        LJJIJ(list, linkedHashMap);
        String str = LJIILIIL;
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str, obj);
        Boolean boolValueOf6 = null;
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LJJIIJ(linkedHashMap);
            String str3 = LJIIIIZZ;
            if (Intrinsics.LJFF(linkedHashMap.get(str3), "plaza_icon")) {
                linkedHashMap.put(str3, "pk_icon");
            }
        }
        linkedHashMap.put(LJIIJJI, "manual_pk");
        linkedHashMap.put(LJIIL, C915980Zwa.LIZLLL().oE2());
        LIZJ(linkedHashMap, false);
        linkedHashMap.put(LJIJJLI, String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        String str4 = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 == null || (string = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str4, string);
        LJIJJLI(z, linkedHashMap, false);
        LJJIIJZLJL(linkedHashMap);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(linkedHashMap);
        linkedHashMap.put("time_stamp", String.valueOf(C974520bT0.LIZ()));
        InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf23 != null) {
            boolValueOf6 = Boolean.valueOf(interfaceC973730bRjYf23.LJIJJLI());
        }
        if (C500260Jjc.LJJJI(boolValueOf6)) {
            linkedHashMap.put("invite_to_success_dur", String.valueOf(C974520bT0.LIZ() - LJJZZI));
        }
        linkedHashMap.put(LJJIJ, CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put(LJJIJIIJI, CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put(LJJIIJZLJL, String.valueOf(C915980Zwa.LJI().LIZ().getTagType()));
        String str5 = LJJIIZ;
        if (C957990b2L.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL())) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str5, obj2);
        LJFF(linkedHashMap);
        LJI(linkedHashMap);
        LJIJ(this, linkedHashMap, false, false, false, 12);
        LIZIZ(linkedHashMap);
        LJJI("", linkedHashMap);
        InterfaceC973730bRj interfaceC973730bRjYf24 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf24 != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC973730bRjYf24.LJIJJLI());
        } else {
            boolValueOf2 = null;
        }
        LJJIJIIJI(linkedHashMap, C500260Jjc.LJJJI(boolValueOf2));
        C974450bSt c974450bSt = C973890bRz.LIZ;
        if (c974450bSt.LJIIJ && Intrinsics.LJFF("livesdk_connection_success", "livesdk_connection_success")) {
            C955400ayA c955400ayA = C955400ayA.LIZ;
            if (!C955400ayA.LJJLJ()) {
                linkedHashMap.put(LJJIJIIJIL, "activity_banner");
            }
            c974450bSt.LJIIJ = false;
        }
        long jLJIIJ = 0;
        if (Intrinsics.LJFF("livesdk_connection_success", "livesdk_connection_success") && C955580ayS.LJ != 0 && (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) || Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI))) {
            linkedHashMap.put(LJJIJIL, String.valueOf(C955580ayS.LJ));
        }
        if (!z) {
            InterfaceC973730bRj interfaceC973730bRjYf25 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf25 != null) {
                boolValueOf5 = Boolean.valueOf(interfaceC973730bRjYf25.LJIJJLI());
            } else {
                boolValueOf5 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf5)) {
                linkedHashMap.put(LJJ, String.valueOf(LJJIJLIJ()));
                linkedHashMap.put(LJJI, String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
            } else {
                linkedHashMap.put(LJJI, String.valueOf(LJJIJLIJ()));
                linkedHashMap.put(LJJ, String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
            }
            linkedHashMap.put("right_user_id", String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
            LJIILLIIL(linkedHashMap, map, Long.valueOf(j), "connected");
        } else {
            InterfaceC973730bRj interfaceC973730bRjYf26 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf26 != null) {
                boolValueOf3 = Boolean.valueOf(interfaceC973730bRjYf26.LJIJJLI());
            } else {
                boolValueOf3 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf3)) {
                jLJIIJ = LJJIJLIJ();
            } else {
                InterfaceC973730bRj interfaceC973730bRjYf27 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf27 != null) {
                    jLJIIJ = interfaceC973730bRjYf27.LJIIJ();
                }
            }
            linkedHashMap.put(LJJ, String.valueOf(jLJIIJ));
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            ArrayList arrayList = new ArrayList();
            for (C954460awe c954460awe : listLLILZLL) {
                if (c954460awe.LJ != jLJIIJ) {
                    arrayList.add(c954460awe);
                }
            }
            linkedHashMap.put(LJJIFFI, C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(130), 30));
        }
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        LJIILL(linkedHashMap);
        LJ(this, linkedHashMap, null, list, false, 10);
        linkedHashMap.put(LJII, C13LP.LJJLIIIJ(C915980Zwa.LJII().LLILZLL(true), ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(129), 30));
        int size2 = C915980Zwa.LJII().LLILZLL(true).size();
        linkedHashMap.put(LJI, String.valueOf(size2));
        if (list != null) {
            Iterator it2 = list.iterator();
            size = 0;
            while (it2.hasNext()) {
                size += ((TeamUsersInfo) it2.next()).userIds.size();
            }
        } else {
            size = 0;
        }
        if (size2 != size && size != 0) {
            linkedHashMap.put(LJI, String.valueOf(size));
        }
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        if (size != 0) {
            size2 = size;
        }
        c917350Zyn.getClass();
        String strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size2);
        linkedHashMap.put("sub_match_type", strLIZIZ);
        LJLJLLL = linkedHashMap;
        if (z) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            InterfaceC973730bRj interfaceC973730bRjYf28 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf28 != null) {
                boolValueOf4 = Boolean.valueOf(interfaceC973730bRjYf28.LJIJJLI());
            } else {
                boolValueOf4 = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf4)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("is_starter", str2);
            linkedHashMap2.put("cur_anchor_id", String.valueOf(LJJIJLIJ()));
            InterfaceC973730bRj interfaceC973730bRjYf29 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf29 != null) {
                lValueOf = Long.valueOf(interfaceC973730bRjYf29.LJIIJ());
            } else {
                lValueOf = null;
            }
            linkedHashMap2.put("multi_match_inviter_id", String.valueOf(lValueOf));
            linkedHashMap2.put(LJI, String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
            linkedHashMap2.put(LJII, C13LP.LJJLIIIJ(C915980Zwa.LJII().LLILZLL(true), ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(131), 30));
            LJLL = linkedHashMap2;
        }
        C973690bRf.LJ(linkedHashMap, null, true);
        C973690bRf.LIZJ(linkedHashMap);
        C150800hu.LIZ(linkedHashMap);
        C973710bRh.LIZ(linkedHashMap);
        if (z) {
            LJZ(this, "livesdk_connection_success", linkedHashMap, strLIZIZ);
        } else {
            LJZI(this, "livesdk_connection_success", linkedHashMap, strLIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(int r21, com.bytedance.ies.sdk.datachannel.DataChannel r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJLIIIL(int, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, boolean):void");
    }

    public final void LJLJI(int i, boolean z, boolean z2, List list) {
        String str;
        String str2;
        long jLongValue;
        String strLJJLIIIJ;
        List listLJJLIIIJILLIZJL;
        List<Long> list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        LJIL(this, linkedHashMap, z, 12);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        if (i == 0) {
            str = "disconnect_pk";
        } else {
            str = "disconnect_punish";
        }
        linkedHashMap.put("request_type", str);
        if (z2) {
            str2 = "disconnect";
        } else {
            str2 = "go_back";
        }
        linkedHashMap.put("selection", str2);
        LJIJ(this, linkedHashMap, false, false, false, 12);
        LJII(linkedHashMap, false);
        String str3 = LJJIIZI;
        Object obj = ((LinkedHashMap) LJLJLLL).get(str3);
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put(str3, obj);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        if (z) {
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    TeamUsersInfo teamUsersInfo = (TeamUsersInfo) it2.next();
                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf2 != null && teamUsersInfo.teamId == interfaceC973730bRjYf2.LJJJJJ() && (list2 = teamUsersInfo.userIds) != null) {
                        for (Long l : list2) {
                            long jLJJIJLIJ = LJJIJLIJ();
                            if (l != null && l.longValue() == jLJJIJLIJ) {
                                linkedHashMap.put(LJJ, String.valueOf(LJJIJLIJ()));
                            } else {
                                linkedHashMap.put(LJJI, l.toString());
                            }
                        }
                    }
                }
            }
            LJJIJ(list, linkedHashMap);
            if (!C955400ayA.LJJIJL) {
                C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
            }
            Map<String, String> map = LJLJLLL;
            String str4 = LJJ;
            String str5 = (String) ((LinkedHashMap) map).get(str4);
            if (str5 == null) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str5);
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            linkedHashMap.put(str4, str5);
            String str6 = (String) ((LinkedHashMap) LJLJLLL).get(LJJIFFI);
            if (str6 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str6, new String[]{","}, 0, 6)) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                while (it3.hasNext()) {
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) it3.next());
                    if (lLJIILIIL2 != null) {
                        arrayList.add(lLJIILIIL2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((Number) obj3).longValue() != jLongValue) {
                        arrayList2.add(obj3);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, AFwS229S0000000_2.get$arr$(599), 30);
            } else {
                strLJJLIIIJ = null;
            }
            String str7 = LJJIFFI;
            if (strLJJLIIIJ != null) {
                obj2 = strLJJLIIIJ;
            }
            linkedHashMap.put(str7, obj2);
            String strLIZIZ = (String) ((LinkedHashMap) LJLJLLL).get("sub_match_type");
            if (strLIZIZ == null) {
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                c917350Zyn.getClass();
                strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
            }
            C973710bRh.LIZ(linkedHashMap);
            LJZ(this, "livesdk_pk_disconnect_click", linkedHashMap, strLIZIZ);
            return;
        }
        String str8 = LJJ;
        Object obj4 = ((LinkedHashMap) LJLJLLL).get(str8);
        if (obj4 == null) {
            obj4 = "";
        }
        linkedHashMap.put(str8, obj4);
        String str9 = LJJI;
        Object obj5 = ((LinkedHashMap) LJLJLLL).get(str9);
        if (obj5 != null) {
            obj2 = obj5;
        }
        linkedHashMap.put(str9, obj2);
        if (!C955400ayA.LJJIJL) {
            C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        }
        C973710bRh.LIZ(linkedHashMap);
        LJZI(this, "livesdk_pk_disconnect_click", linkedHashMap, "1v1");
    }

    public final void LJJJJI(String str, C973720bRi c973720bRi, boolean z, String str2, String str3) {
        Long lValueOf;
        String string;
        String str4;
        List<Long> list;
        String string2;
        Object obj;
        String strValueOf;
        long jLJJZZI;
        long jEr;
        HashMap map = new HashMap();
        boolean zLJJJJ = LJJJJ();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put(LIZJ, String.valueOf(room.getOwnerUserId()));
            map.put(LJFF, room.getIdStr());
        }
        String str5 = LJ;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJL());
        } else {
            lValueOf = null;
        }
        map.put(str5, String.valueOf(lValueOf));
        String str6 = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 == null || (string = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put(str6, string);
        String str7 = LJJII;
        if (LJLLLL()) {
            str4 = "anchor";
        } else {
            str4 = "user";
        }
        map.put(str7, str4);
        String str8 = "1";
        if (z) {
            map.put("is_block", "1");
            map.put("block_reason", str2);
        }
        if (Intrinsics.LJFF(str, "end")) {
            if (C500260Jjc.LJJIIZ(str3)) {
                map.put("is_finish", CardStruct.IStatusCode.DEFAULT);
                map.put("fail_finish_reason", String.valueOf(str3));
            } else {
                map.put("is_finish", "1");
            }
        }
        if (c973720bRi.LJIIJJI <= 0) {
            InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf23 != null) {
                jEr = interfaceC973730bRjYf23.er();
            } else {
                jEr = 0;
            }
            c973720bRi.LJIIJJI = jEr;
        }
        if (c973720bRi.LJIIL <= 0) {
            InterfaceC973730bRj interfaceC973730bRjYf24 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf24 != null) {
                jLJJZZI = interfaceC973730bRjYf24.LJJZZI();
            } else {
                jLJJZZI = 0;
            }
            c973720bRi.LJIIL = jLJJZZI;
        }
        String str9 = LJI;
        if (zLJJJJ) {
            list = LJLLLL;
        } else {
            list = LJLLL;
        }
        map.put(str9, String.valueOf(list.size()));
        map.put("report_time", str);
        BattleAICommentaryMessage battleAICommentaryMessage = c973720bRi.LIZIZ;
        if (battleAICommentaryMessage != null) {
            long j = battleAICommentaryMessage.timestampOrigin;
            long j2 = c973720bRi.LJIIIZ;
            long j3 = c973720bRi.LJIIJ;
            map.put("strategy_extra_json", battleAICommentaryMessage.extra);
            map.put("sever_generate_timestamp", String.valueOf(j));
            long j4 = c973720bRi.LJIIJJI;
            long j5 = c973720bRi.LJIIL;
            long j6 = c973720bRi.LJI;
            long j7 = c973720bRi.LJII;
            int i = c973720bRi.LJIIIIZZ;
            long j8 = c973720bRi.LIZLLL;
            long j9 = c973720bRi.LJ;
            long j10 = c973720bRi.LJFF;
            map.put("sever_generate_pk_lap", LJJIZ(j5, j));
            map.put("sever_generate_pk_time", LJJJ(j4, j));
            if (j6 > 0) {
                map.put("start_pk_lap_real", LJJIZ(j5, c973720bRi.LJI));
                map.put("start_timestamp_real", String.valueOf(j6));
                map.put("start_pk_time_real", LJJJ(j4, j6));
            }
            if (j7 > 0) {
                map.put("end_timestamp", String.valueOf(j7));
                if (j6 > 0) {
                    strValueOf = String.valueOf(j7 - j6);
                } else {
                    strValueOf = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("audio_output_time_len_real", strValueOf);
            }
            if (i > 0) {
                map.put("is_lower_voice", "1");
                map.put("lower_voice_time_len", String.valueOf(i));
            }
            map.put("audio_content", battleAICommentaryMessage.subtitle);
            AudioMeta audioMeta = battleAICommentaryMessage.commentaryMeta;
            if (audioMeta == null || (string2 = Integer.valueOf(audioMeta.audioDurationMs).toString()) == null) {
                string2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("audio_output_time_len_expected", string2);
            if (battleAICommentaryMessage.isSharePerfOn) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_share_perf_on", obj);
            map.put("commentary_id", String.valueOf(battleAICommentaryMessage.commentaryId));
            map.put("sever_send_pk_lap", LJJIZ(j5, j2));
            map.put("sever_send_timestamp", String.valueOf(j2));
            map.put("sever_send_pk_time", LJJJ(j4, j2));
            map.put("client_receive_pk_lap", LJJIZ(j5, j3));
            map.put("client_receive_timestamp", String.valueOf(j3));
            map.put("client_receive_pk_time", LJJJ(j4, j3));
            map.put("generate_to_send_time", String.valueOf(j2 - j));
            map.put("send_to_receive_time", String.valueOf(j3 - j2));
            if (j6 > 0) {
                map.put("receive_to_start_time", String.valueOf(j6 - j3));
                if (j8 > 0 && j10 > 0 && j9 > 0) {
                    map.put("consume_to_start_time", String.valueOf(j6 - j8));
                    map.put("handle_data_to_start_time", String.valueOf(j6 - j9));
                    map.put("set_data_to_start_time", String.valueOf(j6 - j10));
                }
            }
        }
        String strLIZIZ = (String) ((LinkedHashMap) LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        if (!zLJJJJ) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        LJLLLLLL("livesdk_pk_ai_comment_audio_output", str8, EnumC944810ah5.MANUAL_PK.getType(), strLIZIZ, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZ(boolean r29, java.util.List<? extends com.bytedance.android.livesdk.model.message.TeamUsersInfo> r30, java.lang.Long r31, com.bytedance.android.livesdkapi.depend.model.live.Room r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJJJJZ(boolean, java.util.List, java.lang.Long, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }

    public final void LJJJLIIL(String str, String str2, List list, boolean z, boolean z2) {
        boolean z3;
        String strValueOf;
        List<Long> list2;
        String str3;
        BattleSetting battleSettingLJIILIIL;
        if (z2) {
            LJLLILLLL = C974520bT0.LIZ();
            C946230ajN.LIZJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long lValueOf = null;
        LJIIZILJ(this, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        String str4 = LJ;
        CharSequence charSequence = (CharSequence) linkedHashMap.get(str4);
        if (charSequence != null && !a0.LJJJIL(charSequence)) {
            z3 = false;
        } else {
            z3 = true;
        }
        Long lValueOf2 = null;
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (z3 || Intrinsics.LJFF(linkedHashMap.get(str4), CardStruct.IStatusCode.DEFAULT)) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJL());
            }
            linkedHashMap.put(str4, String.valueOf(lValueOf));
        }
        linkedHashMap.put("from_source", str2);
        if (z) {
            LJJIJ(list, linkedHashMap);
        } else {
            linkedHashMap.put("right_user_id", String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
        }
        String str6 = LJIILJJIL;
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL());
        }
        linkedHashMap.put(str6, String.valueOf(lValueOf2));
        String str7 = LJIJJLI;
        InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf23 == null || (battleSettingLJIILIIL = interfaceC973730bRjYf23.LJIILIIL()) == null || (strValueOf = Integer.valueOf(battleSettingLJIILIIL.duration).toString()) == null) {
            strValueOf = String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue());
        }
        linkedHashMap.put(str7, strValueOf);
        LJIJ(this, linkedHashMap, false, false, false, 12);
        LIZ(linkedHashMap);
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1()) {
            linkedHashMap.put("is_lineup_status", "1");
        } else {
            linkedHashMap.put("is_lineup_status", CardStruct.IStatusCode.DEFAULT);
        }
        if (z && LJLLLL.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(((TeamUsersInfo) it2.next()).userIds);
                }
            }
            LJLLLL = arrayList;
        }
        String str8 = LJI;
        if (z) {
            list2 = LJLLLL;
        } else {
            list2 = LJLLL;
        }
        linkedHashMap.put(str8, String.valueOf(list2.size()));
        String str9 = LJII;
        CharSequence charSequence2 = (CharSequence) linkedHashMap.get(str9);
        if (charSequence2 == null || charSequence2.length() == 0) {
            linkedHashMap.put(str9, C13LP.LJJLIIIJ(LJLLLL, ",", null, null, 0, null, null, 62));
        }
        LJJIJ(list, linkedHashMap);
        Object obj = "";
        if (z2) {
            linkedHashMap.put("sub_match_type", str);
            LJLJLLL.put("sub_match_type", str);
            Map<String, String> map = LJLJLLL;
            String str10 = LJJIII;
            Object obj2 = linkedHashMap.get(str10);
            if (obj2 == null) {
                obj2 = "1";
            }
            map.put(str10, (String) obj2);
            Map<String, String> map2 = LJLJLLL;
            String str11 = LJIIIZ;
            Object obj3 = linkedHashMap.get(str11);
            if (obj3 == null) {
                obj3 = "";
            }
            map2.put(str11, (String) obj3);
            Map<String, String> map3 = LJLJLLL;
            String str12 = LJIIJ;
            Object obj4 = linkedHashMap.get(str12);
            if (obj4 != null) {
                obj = obj4;
            }
            map3.put(str12, (String) obj);
        } else {
            Object obj5 = ((LinkedHashMap) LJLJLLL).get("sub_match_type");
            if (obj5 != null) {
                obj = obj5;
            }
            linkedHashMap.put("sub_match_type", obj);
        }
        C973710bRh.LIZ(linkedHashMap);
        if (z) {
            str5 = "1";
        }
        LJJIJL("livesdk_connection_transform", linkedHashMap);
        String str13 = LJIIJJI;
        if (z2) {
            str3 = "manual_pk";
        } else {
            str3 = "anchor";
        }
        linkedHashMap.put(str13, str3);
        linkedHashMap.put(LJIIL, C915980Zwa.LIZLLL().oE2());
        linkedHashMap.put(LJIILIIL, str5);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJJIIZI(C915980Zwa.LJI().LIZ().LJIILLIIL(), linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_transform");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        if (Intrinsics.LJFF("livesdk_connection_transform", "livesdk_connection_transform") && BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            c474500IjALIZ.LJJIJL();
            return;
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJLJLI(java.util.List<? extends com.bytedance.android.livesdk.model.message.TeamUsersInfo> r25, boolean r26, X.EnumC973680bRe r27, com.bytedance.ies.sdk.datachannel.DataChannel r28, java.util.Map<java.lang.String, java.lang.String> r29) {
        /*
            Method dump skipped, instruction units count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJJLIIIJLJLI(java.util.List, boolean, X.0bRe, com.bytedance.ies.sdk.datachannel.DataChannel, java.util.Map):void");
    }

    public final void LJLLLLLL(String str, String str2, String str3, String str4, Map map) {
        LJJIJL(str, map);
        map.put(LJIIJJI, str3);
        map.put(LJIIL, C915980Zwa.LIZLLL().oE2());
        map.put(LJIILIIL, str2);
        map.put("sub_match_type", str4);
        String str5 = LJI;
        CharSequence charSequence = (CharSequence) map.get(str5);
        if (charSequence == null || a0.LJJJIL(charSequence)) {
            map.put(str5, String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJJIIZI(C915980Zwa.LJI().LIZ().LJIILLIIL(), map);
        map.put("overload_score", ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL());
        LJII(map, false);
        LJIJ(this, map, false, false, false, 12);
        LJIILJJIL(str, map);
        if (CohostWithGuestPhase2EventTrackingOpt.INSTANCE.isEnabled()) {
            AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(485);
            CharSequence charSequence2 = (CharSequence) map.get("linker_mode");
            if (charSequence2 == null || charSequence2.length() == 0) {
                map.put("linker_mode", aFwS203S0000000_15.invoke());
            }
            AFwS203S0000000_15 aFwS203S0000000_152 = AFwS203S0000000_15.get$arr$(486);
            CharSequence charSequence3 = (CharSequence) map.get("both_guest_cnt");
            if (charSequence3 == null || charSequence3.length() == 0) {
                map.put("both_guest_cnt", aFwS203S0000000_152.invoke());
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        if (Intrinsics.LJFF("livesdk_connection_watch_duration", str) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(str)) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            c474500IjALIZ.LJJIJL();
            return;
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[EDGE_INSN: B:20:0x004b->B:21:0x004c BREAK  A[LOOP:0: B:16:0x0032->B:73:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C973660bRc r15, java.util.Map r16, java.util.List r17, java.util.List r18, boolean r19, int r20) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJ(X.0bRc, java.util.Map, java.util.List, java.util.List, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(X.C973660bRc r18, java.util.Map r19, boolean r20, boolean r21, X.EnumC972420bPc r22, int r23) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJIIZILJ(X.0bRc, java.util.Map, boolean, boolean, X.0bPc, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(X.C973660bRc r11, java.util.Map r12, boolean r13, boolean r14, boolean r15, int r16) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJIJ(X.0bRc, java.util.Map, boolean, boolean, boolean, int):void");
    }

    public final void LJJJJJ(DataChannel dataChannel, String str, String str2, String str3, String str4, boolean z) {
        HashMap map = new HashMap();
        LIZLLL(map, dataChannel, false);
        map.put("show_place", str);
        map.put("popup_enter_from", str2);
        map.put("popup_style", str3);
        if (z) {
            map.put("action", "click");
            map.put("button_name", str4);
        } else {
            map.put("action", "show");
        }
        LJLLLLLL("livesdk_pk_ai_comment_confirm_popup", CardStruct.IStatusCode.DEFAULT, EnumC944810ah5.MANUAL_PK.getType(), "", map);
    }

    public final void LJJJJL(String str, DataChannel dataChannel, boolean z, String str2, String str3, boolean z2) {
        String str4;
        HashMap map = new HashMap();
        map.put("popup_enter_from", str);
        LIZLLL(map, dataChannel, z2);
        if (z && str2 != null) {
            map.put("button_name", str2);
        }
        map.put("popup_style", str3);
        if (z) {
            str4 = "livesdk_pk_ai_comment_popup_click";
        } else {
            str4 = "livesdk_pk_ai_comment_popup_show";
        }
        LJLLLLLL(str4, CardStruct.IStatusCode.DEFAULT, EnumC944810ah5.MANUAL_PK.getType(), "", map);
    }

    public final void LJLJJLL(long j, boolean z, List<? extends TeamUsersInfo> list, LinkMicBattleMessage linkMicBattleMessage, C955540ayO c955540ayO, boolean z2, Map<Long, GiftGalleryBadgeInfo> map) {
        Integer numValueOf;
        Integer numValueOf2;
        String string;
        LJJZZIII = C974520bT0.LIZ();
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        Integer numValueOf3 = null;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.scene);
        } else {
            numValueOf = null;
        }
        LJL = numValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIZILJ(this, linkedHashMap, true, false, EnumC972420bPc.INVITEE, 4);
        LJJIIJZLJL(linkedHashMap);
        LJIJJLI(z, linkedHashMap, z2);
        linkedHashMap.put(LJIILJJIL, String.valueOf(linkMicBattleMessage.battleId));
        LJFF(linkedHashMap);
        LJI(linkedHashMap);
        LJIJ(this, linkedHashMap, z2, false, true, 4);
        String str = LJJIJIL;
        linkedHashMap.put(str, String.valueOf(C955580ayS.LJ));
        LIZ(linkedHashMap);
        LJJIIJ(linkedHashMap);
        LIZIZ(linkedHashMap);
        String str2 = "";
        LJJI("", linkedHashMap);
        LJIIJ(linkMicBattleMessage.battleSetting.inviteType, true, linkedHashMap);
        C973690bRf.LJ(linkedHashMap, null, false);
        LJ(this, linkedHashMap, null, null, false, 14);
        String str3 = LJJIZ;
        BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
        if (battleSetting2 != null && (string = Integer.valueOf(battleSetting2.scene).toString()) != null) {
            str2 = string;
        }
        linkedHashMap.put(str3, str2);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        if (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) || Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI)) {
            long j2 = C955580ayS.LJ;
            if (j2 != 0) {
                linkedHashMap.put(str, String.valueOf(j2));
            }
        }
        C973710bRh.LIZ(linkedHashMap);
        if (z) {
            LJJIJ(list, linkedHashMap);
            linkedHashMap.put("pk_inviter_id", String.valueOf(j));
            linkedHashMap.put("pk_invitee_id", String.valueOf(LJJIJLIJ()));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logReceiveInvite, isRematch=");
            sbLIZ.append(z2);
            sbLIZ.append(", inviteType=");
            sbLIZ.append(C915980Zwa.LJI().LIZ().LJIILLIIL());
            sbLIZ.append("， message inviteType=");
            BattleSetting battleSetting3 = linkMicBattleMessage.battleSetting;
            if (battleSetting3 != null) {
                numValueOf2 = Integer.valueOf(battleSetting3.inviteType);
            } else {
                numValueOf2 = null;
            }
            sbLIZ.append(numValueOf2);
            C20441214yg.LIZIZ("logReceiveInvite", C2188811AlT.LIZIZ(sbLIZ));
            C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
            C955400ayA.LJII(linkedHashMap);
            BattleSetting battleSetting4 = linkMicBattleMessage.battleSetting;
            if (battleSetting4 != null) {
                numValueOf3 = Integer.valueOf(battleSetting4.battleType);
            }
            EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(numValueOf3);
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            LJZ(this, "livesdk_connection_invited_received", linkedHashMap, C917350Zyn.LIZIZ(enumC919170a1jLIZ, size));
            return;
        }
        if (C915980Zwa.LJI().LJIIJ().LLJJJIL() != 0) {
            j = C915980Zwa.LJI().LJIIJ().LLJJJIL();
        }
        linkedHashMap.put("right_user_id", String.valueOf(j));
        linkedHashMap.put("pk_inviter_id", String.valueOf(j));
        linkedHashMap.put("pk_invitee_id", String.valueOf(LJJIJLIJ()));
        C955410ayB.LIZLLL(linkedHashMap, c955540ayO, false);
        C955400ayA.LJII(linkedHashMap);
        LJIIJJI(linkedHashMap);
        LJIILLIIL(linkedHashMap, map, Long.valueOf(j), "inviter");
        LJZI(this, "livesdk_connection_invited_received", linkedHashMap, "1v1");
    }

    public final void LJLJLLL(long j, List<C954460awe> list, List<C954460awe> list2, boolean z, boolean z2, String str, String str2, C955540ayO c955540ayO) {
        LJJZZI = C974520bT0.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJJIIZI(list, list2, linkedHashMap);
        LJJIIJ(linkedHashMap);
        LJIIZILJ(this, linkedHashMap, false, false, EnumC972420bPc.INVITER, 6);
        LJJIIJZLJL(linkedHashMap);
        linkedHashMap.put(LJIIJJI, "manual_pk");
        linkedHashMap.put(LJIIL, C915980Zwa.LIZLLL().oE2());
        String str3 = LJJLIIIJL;
        Intrinsics.LJFF(str2, str3);
        C955410ayB.LIZLLL(linkedHashMap, c955540ayO, false);
        linkedHashMap.put(LJIJJLI, String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        LJIJJLI(z, linkedHashMap, z2);
        linkedHashMap.put("invitee_status", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put(LJJ, String.valueOf(LJJIJLIJ()));
        linkedHashMap.put(LJJI, String.valueOf(j));
        LJIIIZ(linkedHashMap);
        LJFF(linkedHashMap);
        LJI(linkedHashMap);
        LJ(this, linkedHashMap, list, null, false, 12);
        LJJIJIIJIL(list, linkedHashMap);
        LJIIIIZZ(linkedHashMap);
        LJJI("", linkedHashMap);
        if (Intrinsics.LJFF(str2, LJJLIIIJJIZ) || Intrinsics.LJFF(str2, str3)) {
            linkedHashMap.put(LJJJLL, str2);
        }
        linkedHashMap.put("time_stamp", String.valueOf(C974520bT0.LIZ()));
        if (String.valueOf(j).equals(C915980Zwa.LJI().LIZ().LJLI())) {
            linkedHashMap.put(LJJIIJZLJL, String.valueOf(C915980Zwa.LJI().LIZ().getTagType()));
        } else {
            linkedHashMap.put(LJJIIJZLJL, CardStruct.IStatusCode.DEFAULT);
        }
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), c955540ayO, C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        LJIJ(this, linkedHashMap, z2, false, false, 12);
        long j2 = C955580ayS.LJ;
        if (j2 != 0) {
            linkedHashMap.put(LJJIJIL, String.valueOf(j2));
        }
        LIZ(linkedHashMap);
        LJIILL(linkedHashMap);
        C973690bRf.LJ(linkedHashMap, null, true);
        C955520ayM.LIZLLL(linkedHashMap);
        C973690bRf.LIZJ(linkedHashMap);
        C973710bRh.LIZ(linkedHashMap);
        if (z) {
            LJZ(this, "livesdk_connection_invite", linkedHashMap, str);
        } else {
            LJZI(this, "livesdk_connection_invite", linkedHashMap, "1v1");
        }
    }

    public final void LJJLI(boolean z, boolean z2, Long l, List<? extends TeamUsersInfo> list, long j, Map<Long, GiftGalleryBadgeInfo> map, boolean z3, String str, Integer num) {
        String string;
        String str2;
        String string2;
        BattleSetting battleSettingLJIILIIL;
        String strLIZIZ = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = LJJ;
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (l == null || (string = l.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str3, string);
        linkedHashMap.put(LJJI, String.valueOf(LJJIJLIJ()));
        if (z) {
            str2 = "accept";
        } else {
            str2 = "reject";
        }
        linkedHashMap.put("selection", str2);
        linkedHashMap.put("time_stamp", String.valueOf(C974520bT0.LIZ()));
        linkedHashMap.put("show_to_decide_dur", String.valueOf(C974520bT0.LIZ() - LJJZZIII));
        LJJIIJZLJL(linkedHashMap);
        LIZJ(linkedHashMap, z3);
        LJIIZILJ(this, linkedHashMap, true, false, EnumC972420bPc.INVITEE, 4);
        linkedHashMap.put(LJIJJLI, String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        linkedHashMap.put(LJJIIJZLJL, String.valueOf(C915980Zwa.LJI().LIZ().getTagType()));
        LJIJJLI(z2, linkedHashMap, z3);
        linkedHashMap.put(LJIILJJIL, String.valueOf(j));
        C915980Zwa.LJI().LIZ().LJIILLIIL();
        String str5 = LJJIIZ;
        if (C957990b2L.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL())) {
            str4 = "1";
        }
        linkedHashMap.put(str5, str4);
        if (!z2) {
            linkedHashMap.put("right_user_id", String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
        }
        LJFF(linkedHashMap);
        LJI(linkedHashMap);
        LJIJ(this, linkedHashMap, z3, false, true, 4);
        LJ(this, linkedHashMap, null, null, false, 14);
        LIZIZ(linkedHashMap);
        C973690bRf.LJ(linkedHashMap, null, false);
        String str6 = LJJIZ;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (battleSettingLJIILIIL = interfaceC973730bRjYf2.LJIILIIL()) == null || (string2 = Integer.valueOf(battleSettingLJIILIIL.scene).toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put(str6, string2);
        String str7 = LJJIJIL;
        linkedHashMap.put(str7, String.valueOf(C955580ayS.LJ));
        LIZ(linkedHashMap);
        if (num != null) {
            LJIIJ(num.intValue(), true, linkedHashMap);
        }
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        if (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) || Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI)) {
            long j2 = C955580ayS.LJ;
            if (j2 != 0) {
                linkedHashMap.put(str7, String.valueOf(j2));
            }
        }
        C955520ayM.LIZLLL(linkedHashMap);
        C973710bRh.LIZ(linkedHashMap);
        if (z2) {
            LJJIJ(list, linkedHashMap);
            C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
            C955400ayA.LJII(linkedHashMap);
            if (strLIZIZ == null || a0.LJJJIL(strLIZIZ)) {
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                c917350Zyn.getClass();
                strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
            }
            LJZ(this, "livesdk_connection_invited", linkedHashMap, strLIZIZ);
            return;
        }
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIILLIIL(linkedHashMap, map, l, "inviter");
        C955400ayA.LJII(linkedHashMap);
        LJZI(this, "livesdk_connection_invited", linkedHashMap, "1v1");
    }

    public static void LJJJJZI(Long l, boolean z, List list, long j, Map map, boolean z2, String str, Integer num, C955540ayO c955540ayO, int i) {
        Object obj;
        String strValueOf;
        String str2;
        String string;
        String string2;
        BattleSetting battleSettingLJIILIIL;
        C955540ayO c955540ayOLJIILLIIL = c955540ayO;
        boolean z3 = z2;
        C973660bRc c973660bRc = LIZ;
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            obj = "";
        } else {
            obj = null;
        }
        if ((i & 256) != 0) {
            num = null;
        }
        if ((i & 512) != 0) {
            c955540ayOLJIILLIIL = C915980Zwa.LJI().LIZ().LJIILLIIL();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJJIJ(list, linkedHashMap);
        LJIIZILJ(c973660bRc, linkedHashMap, true, false, EnumC972420bPc.INVITEE, 4);
        String str3 = LJII;
        Object obj2 = linkedHashMap.get("popup_uid_list");
        if (obj2 == null && (obj2 = linkedHashMap.get(str3)) == null) {
            obj2 = "";
        }
        linkedHashMap.put(str3, obj2);
        long j2 = LJJZZIII;
        if (j2 > 0) {
            strValueOf = String.valueOf(j2);
        } else {
            strValueOf = String.valueOf(C974520bT0.LIZ());
        }
        linkedHashMap.put("time_stamp", strValueOf);
        LJJIIJZLJL(linkedHashMap);
        LJIJJLI(z, linkedHashMap, z3);
        linkedHashMap.put(LJIILL, "invitee");
        linkedHashMap.put(LJJIIJZLJL, String.valueOf(C915980Zwa.LJI().LIZ().getTagType()));
        linkedHashMap.put(LJIILJJIL, String.valueOf(j));
        C915980Zwa.LJI().LIZ().LJIILLIIL();
        String str4 = LJJIIZ;
        if (C957990b2L.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL())) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str4, str2);
        LJIJ(c973660bRc, linkedHashMap, z3, false, true, 4);
        String str5 = LJJ;
        if (l == null || (string = l.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put(str5, string);
        linkedHashMap.put(LJJI, String.valueOf(LJJIJLIJ()));
        String str6 = LJJIJIL;
        linkedHashMap.put(str6, String.valueOf(C955580ayS.LJ));
        LIZ(linkedHashMap);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        if (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) || Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI)) {
            long j3 = C955580ayS.LJ;
            if (j3 != 0) {
                linkedHashMap.put(str6, String.valueOf(j3));
            }
        }
        LJIIIZ(linkedHashMap);
        LJIILLIIL(linkedHashMap, map, l, "inviter");
        LJFF(linkedHashMap);
        LIZIZ(linkedHashMap);
        linkedHashMap.put("sub_match_type", str);
        LJ(c973660bRc, linkedHashMap, null, null, false, 14);
        C973690bRf.LJ(linkedHashMap, null, false);
        String str7 = LJJIZ;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (battleSettingLJIILIIL = interfaceC973730bRjYf2.LJIILIIL()) == null || (string2 = Integer.valueOf(battleSettingLJIILIIL.scene).toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put(str7, string2);
        if (num != null) {
            LJIIJ(num.intValue(), true, linkedHashMap);
        }
        C955520ayM.LIZLLL(linkedHashMap);
        C973710bRh.LIZ(linkedHashMap);
        if (z) {
            if (obj == null) {
                obj = "";
            }
            linkedHashMap.put("reason", obj);
            C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
            C955400ayA.LJII(linkedHashMap);
            LJZ(c973660bRc, "livesdk_connected_popup_show", linkedHashMap, str);
        } else {
            C955410ayB.LIZLLL(linkedHashMap, c955540ayOLJIILLIIL, false);
            C955400ayA.LJII(linkedHashMap);
            LJZI(c973660bRc, "livesdk_connected_popup_show", linkedHashMap, "1v1");
        }
        LJLLJ = "";
    }

    public final void LJJLIIIJ(long j, boolean z, List<C954460awe> list, List<C954460awe> list2, long j2, long j3, boolean z2, String str, C955540ayO c955540ayO, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJJIIJZLJL(linkedHashMap);
        LJIIZILJ(this, linkedHashMap, false, false, EnumC972420bPc.INVITER, 6);
        LJIJ(this, linkedHashMap, z2, false, false, 12);
        linkedHashMap.put("pk_invitee_id", String.valueOf(j2));
        linkedHashMap.put("pk_inviter_id", String.valueOf(j3));
        linkedHashMap.put("click_type", "invite");
        linkedHashMap.put(LJIIJJI, "manual_pk");
        linkedHashMap.put(LJIIL, C915980Zwa.LIZLLL().oE2());
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJIIL(c955400ayA, linkedHashMap, null, false, 14);
        LJJIIZI(list, list2, linkedHashMap);
        LJJIIJ(linkedHashMap);
        linkedHashMap.put(LJIILJJIL, String.valueOf(j));
        LJIIIZ(linkedHashMap);
        LJFF(linkedHashMap);
        LJI(linkedHashMap);
        LJ(this, linkedHashMap, list, null, false, 12);
        LJIJJLI(z, linkedHashMap, z2);
        LJJI("", linkedHashMap);
        if (Intrinsics.LJFF(str2, LJJLIIIJJIZ) || Intrinsics.LJFF(str2, LJJLIIIJL)) {
            linkedHashMap.put(LJJJLL, str2);
        }
        Intrinsics.LJFF(str2, LJJLIIIJL);
        C955410ayB.LIZLLL(linkedHashMap, c955540ayO, false);
        if (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().getAnchorType().getLabel(), "invitee")) {
            linkedHashMap.put("enter_from", "");
        }
        long j4 = C955580ayS.LJ;
        if (j4 != 0) {
            linkedHashMap.put(LJJIJIL, String.valueOf(j4));
        }
        c955400ayA.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), c955540ayO, C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        LIZ(linkedHashMap);
        LJIILL(linkedHashMap);
        LIZIZ(linkedHashMap);
        LJJIJIIJIL(list, linkedHashMap);
        C973690bRf.LJ(linkedHashMap, null, true);
        C955520ayM.LIZLLL(linkedHashMap);
        C973690bRf.LIZJ(linkedHashMap);
        C150800hu.LIZ(linkedHashMap);
        C973710bRh.LIZ(linkedHashMap);
        if (z) {
            LJZ(this, "livesdk_connection_invite_send_success", linkedHashMap, str);
        } else {
            LJZI(this, "livesdk_connection_invite_send_success", linkedHashMap, "1v1");
        }
        LJLLJ = "";
    }

    public static void LJJJLZIJ(String str, List list, List list2, EnumC973640bRa enumC973640bRa, String str2, boolean z, EnumC973700bRg enumC973700bRg, boolean z2, boolean z3, boolean z4, ActivePlaybook activePlaybook, String str3, EnumC919170a1j enumC919170a1j, EnumC974980bTk enumC974980bTk, int i) {
        String str4;
        String str5;
        EnumC919170a1j enumC919170a1j2 = enumC919170a1j;
        String type = str3;
        ActivePlaybook activePlaybook2 = activePlaybook;
        boolean z5 = z4;
        C973660bRc c973660bRc = LIZ;
        EnumC974980bTk enumC974980bTk2 = null;
        if ((i & 8) != 0) {
            enumC973640bRa = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            enumC973700bRg = EnumC973700bRg.TEAMMATE_SELECTION;
        }
        if ((i & 128) != 0) {
            z2 = false;
        }
        if ((i & 256) != 0) {
            z3 = false;
        }
        if ((i & 512) != 0) {
            z5 = false;
        }
        if ((i & 1024) != 0) {
            activePlaybook2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            type = EnumC944810ah5.MANUAL_PK.getType();
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            enumC919170a1j2 = null;
        }
        if ((i & 8192) == 0) {
            enumC974980bTk2 = enumC974980bTk;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("report_time", str);
        linkedHashMap.put("panel_type", enumC973700bRg.getValue());
        if (enumC973640bRa != null) {
            linkedHashMap.put(LJIIIIZZ, enumC973640bRa.getValue());
        } else {
            LJJIIJ(linkedHashMap);
        }
        String str6 = "catch_bean";
        if (Intrinsics.LJFF(type, "catch_bean") || Intrinsics.LJFF(type, "take_stage")) {
            LJJIJIL(linkedHashMap);
        }
        LJJII(linkedHashMap, false);
        linkedHashMap.put(LJ, String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        LJJIIJZLJL(linkedHashMap);
        LJJIIZI(list, list2, linkedHashMap);
        LIZ(linkedHashMap);
        LJ(c973660bRc, linkedHashMap, list, null, false, 12);
        LJLJL = z;
        LJJIJIIJIL(list, linkedHashMap);
        Intrinsics.LJFF(str2, "2v2");
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        LJIIJJI(linkedHashMap);
        LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
        LJJI("", linkedHashMap);
        String label = C915980Zwa.LJI().LIZ().getAnchorType().getLabel();
        if (C915980Zwa.LJII().LLFFF()) {
            EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
            if (!Intrinsics.LJFF(label, enumC955660aya.getLabel())) {
                linkedHashMap.put("anchor_type", label);
            } else if (C915980Zwa.LJI().LIZ().LJJJIL() != enumC955660aya) {
                linkedHashMap.put("anchor_type", C915980Zwa.LJI().LIZ().LJJJIL().getLabel());
            }
        }
        if (z3) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_team_pair", str4);
        if (z2) {
            if (Intrinsics.LJFF(str2, "1v1")) {
                str5 = "1v1";
            } else {
                str5 = LJJLIIIJL;
            }
            linkedHashMap.put("invite_mode", str5);
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJII(linkedHashMap);
        C973690bRf.LJIILIIL(linkedHashMap, z5);
        C973690bRf.LJ(linkedHashMap, activePlaybook2, true);
        C973690bRf.LIZJ(linkedHashMap);
        C150800hu.LIZ(linkedHashMap);
        if (LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled() && enumC974980bTk2 != null) {
            linkedHashMap.put("show_reason", enumC974980bTk2.getValue());
        }
        LJIIL(linkedHashMap, enumC919170a1j2);
        C973710bRh.LIZ(linkedHashMap);
        if (z2 && Intrinsics.LJFF(str2, "2v2")) {
            LJZ(c973660bRc, "livesdk_group_pk_teammate_selection_click", linkedHashMap, str2);
            return;
        }
        if (!Intrinsics.LJFF(str2, "1v1") && C915980Zwa.LJII().LLILZLL(true).size() != 2) {
            c973660bRc.LJLLLLLL("livesdk_group_pk_teammate_selection_click", "1", type, str2, linkedHashMap);
            return;
        }
        if (!Intrinsics.LJFF(str2, "catch_bean")) {
            str6 = type;
        }
        linkedHashMap.put(LJI, "2");
        c973660bRc.LJLLLLLL("livesdk_group_pk_teammate_selection_click", CardStruct.IStatusCode.DEFAULT, str6, str2, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJZ(boolean r21, java.util.List r22, java.util.List r23, X.EnumC974980bTk r24, X.EnumC973640bRa r25, boolean r26, boolean r27, X.EnumC973700bRg r28, boolean r29, java.lang.String r30, java.lang.String r31, boolean r32, webcast.data.multi_guest_play.ActivePlaybook r33, X.EnumC919170a1j r34, int r35) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973660bRc.LJJJZ(boolean, java.util.List, java.util.List, X.0bTk, X.0bRa, boolean, boolean, X.0bRg, boolean, java.lang.String, java.lang.String, boolean, webcast.data.multi_guest_play.ActivePlaybook, X.0a1j, int):void");
    }
}
