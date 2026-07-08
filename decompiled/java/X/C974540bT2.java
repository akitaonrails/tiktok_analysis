package X;

import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.dataChannel.LiveStartEnterRoomTimeStampForMatch;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceIdentifyOptSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchIdentificationEventSampleRate;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTechMonitorCalibrationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.model.message.BattleInviteeGiftPermission;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.battle.BattleAcceptResponse;

/* JADX INFO: renamed from: X.0bT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974540bT2 extends C944730agx {
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static long LJIIL;
    public static long LJIILIIL;
    public static long LJIILJJIL;
    public static long LJIILL;
    public static long LJIILLIIL;
    public static long LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static long LJJ;
    public static long LJJI;
    public static C969470bKr LJJIFFI;
    public static InterfaceC420801kM LJJII;
    public static long LJJIJIIJIL;
    public static long LJJIJIL;
    public static long LJJIJL;
    public static long LJJIJLIJ;
    public static long LJJIL;
    public static long LJJIZ;
    public static long LJJJ;
    public static long LJJJI;
    public static final C974540bT2 LIZ = new C974540bT2();
    public static final double LIZIZ = LiveMatchIdentificationEventSampleRate.INSTANCE.getValue();
    public static final Map<String, List<C974600bT8>> LJJIII = new LinkedHashMap();
    public static final List<String> LJJIIJ = new ArrayList();
    public static final Map<String, List<C15FR>> LJJIIJZLJL = new LinkedHashMap();
    public static final C098J<Long, Integer> LJJIIZ = new C098J<>(2);
    public static final Set<String> LJJIIZI = C13LQ.LJLIIL(new String[]{"cut_short_msg", "punish_finish_msg", "cut_short_request", "finish_draw"});
    public static final Set<String> LJJIJ = C13LQ.LJLIIL(new String[]{"punish_request", "punish_finish_msg", "punish_cut_short_request"});
    public static final Set<String> LJJIJIIJI = C13LQ.LJLIIL(new String[]{"cut_short_msg", "cut_short_request", "punish_cut_short_request"});

    public static long LJJIIJZLJL(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long j3 = j2 - j;
            if (j3 > 0) {
                return j3;
            }
        }
        return 0L;
    }

    public static String LJJII() {
        String strJ3 = null;
        if (!LiveMatchTechMonitorCalibrationSetting.INSTANCE.isInviteeRequestFromPassingEnabled()) {
            return null;
        }
        String strLJJIJIIJI = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
        if (strLJJIJIIJI.length() == 0) {
            return null;
        }
        if (Intrinsics.LJFF(strLJJIJIIJI, "playbook_match")) {
            strLJJIJIIJI = "match_playbook";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_from", strLJJIJIIJI);
            strJ3 = C786410Ut5.J3(jSONObject);
            return strJ3;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildInviteTrackingExtraJson failed: ");
            sbLIZ.append(e);
            C20441214yg.LJ("livesdk_multi_match", C2188811AlT.LIZIZ(sbLIZ));
            return strJ3;
        }
    }

    public static void LJJIIJ() {
        Keva.getRepo("live_match").clear();
        C20441214yg.LIZIZ("pk_interrupt", "clearBattleInfo");
    }

    public static long LJJIIZ() {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (owner = room.getOwner()) == null) {
            return 0L;
        }
        return owner.getId();
    }

    public static long LJJIIZI() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    public final void LJJIL() {
        JSONObject jSONObject = new JSONObject();
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF(Scene.SCENE_SERVICE, "room_enter", jSONObject2);
        C0K04.LIZLLL(C915980Zwa.LJFF().xB0().getType(), "battle_type", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("identify_duration", C158B.LIZ() - LJJIJIIJIL, jSONObject3);
        LLIIZ(this, "battle_expired", jSONObject, jSONObject2, jSONObject3, false, null, 48);
    }

    public final void LLIFFJFJJ() {
        JSONObject jSONObject = new JSONObject();
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        c917350Zyn.getClass();
        C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (C500260Jjc.LJJJI(interfaceC973730bRjYf2 != null ? Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI()) : null)) {
            LLIIIILZ(this, "battle_inviter_start", jSONObject, 12);
        }
    }

    public final void LJL() {
        LJIIL = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        long jLIZ = C158B.LIZ() - LJIIIIZZ;
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("match_duration", jLIZ, jSONObject3);
        LLIIIJ("quit_approve_request", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJLIL() {
        LJIIJJI = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        long jLIZ = C158B.LIZ() - LJIIIIZZ;
        C0K04.LJ("match_duration", jLIZ, jSONObject);
        EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
        EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.MATCH_START;
        C0K04.LIZLLL(enumC964170bCJRY == enumC964170bCJ ? 0 : 1, "stage", jSONObject);
        C0K04.LIZLLL(C915980Zwa.LJFF().RY(false) == enumC964170bCJ ? 0 : 1, "stage", jSONObject2);
        LJIJJLI(jSONObject, false);
        C0K04.LJ("match_duration", jLIZ, jSONObject2);
        LLIIIJ("quit_request", jSONObject, jSONObject2, new JSONObject(), true, C915980Zwa.LJFF().xB0());
    }

    public final void LLIIJLIL() {
        LJIJJ = System.currentTimeMillis();
        if (LJIIZILJ == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("cost", LJIJJ - LJIJI, jSONObject);
        C0K04.LJ("total_cost", LJIJJ - LJIIZILJ, jSONObject);
        C0K04.LJFF(Scene.SCENE_SERVICE, "resume_after_crash", jSONObject);
        LJIJJ = 0L;
        LLIIIILZ(this, "resume_cohost_start", jSONObject, 12);
    }

    public final void LLIIL() {
        if (C915980Zwa.LJII().LJIL()) {
            LJIJJLI = System.currentTimeMillis();
            if (LJIIZILJ == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            C0K04.LJ("cost", LJIJJLI - LJIJJ, jSONObject);
            C0K04.LJ("total_cost", LJIJJLI - LJIIZILJ, jSONObject);
            LJIJJLI = 0L;
            LLIIIILZ(this, "resume_cohost_success", jSONObject, 12);
        }
    }

    public final void LLIILII() {
        LJIJI = System.currentTimeMillis();
        if (LJIIZILJ == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("cost", LJIJI - LJIJ, jSONObject);
        C0K04.LJ("total_cost", LJIJI - LJIIZILJ, jSONObject);
        LJIJI = 0L;
        LLIIIILZ(this, "resume_live_success", jSONObject, 12);
    }

    public final void LLIILZL() {
        LJIL = System.currentTimeMillis();
        if (LJIIZILJ == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("cost", System.currentTimeMillis() - LJIJJ, jSONObject);
        C0K04.LJ("total_cost", System.currentTimeMillis() - LJIIZILJ, jSONObject);
        LJIL = 0L;
        LLIIIILZ(this, "resume_match_success", jSONObject, 12);
    }

    public static void LJIILL(JSONObject jSONObject) {
        long currentUserId;
        String strU3;
        String str;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = 0;
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C915980Zwa.LJII().LLILZLL(true), ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(122), 30);
        boolean zIsAppBackground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground();
        C0K04.LJFF("uid_list", strLJJLIIIJ, jSONObject);
        C0K04.LJ("channel_id", C915980Zwa.LJI().LJIIJ().getChannelId(), jSONObject);
        C0K04.LJFF("current_user_id", C501590Jll.LIZ(), jSONObject);
        C0K04.LJ("current_anchor_id", LJJIIZ(), jSONObject);
        C0K04.LJ("room_id", LJJIIZI(), jSONObject);
        C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size(), "linked_count", jSONObject);
        C0K04.LJIIIZ(jSONObject, "is_background", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground());
        if (zIsAppBackground) {
            C0K04.LJ("background_duration", SystemClock.elapsedRealtime() - LJIILLIIL, jSONObject);
        }
        C0K04.LIZLLL(1, "is_sdk", jSONObject);
        C0K04.LIZLLL(C954660awy.LJII, "network_quality", jSONObject);
        C0K04.LJ("cur_bitrate", -1L, jSONObject);
        String str2 = "";
        C0K04.LJFF("bitrates", u.LJJIFFI(C13LP.LJJLIIIJ(C07PO.LIZ, null, null, null, 0, null, null, 63), " ", "", false), jSONObject);
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(currentUserId);
        if (c954460aweLLILL != null && (str = c954460aweLLILL.LJIIJJI) != null) {
            str2 = str;
        }
        C0K04.LJFF("link_mic_id", str2, jSONObject);
        C0K04.LJFF("overload_score", ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL(), jSONObject);
        C915980Zwa.LJII().jn1();
        C0K04.LIZLLL(1, "is_cross_arc_active", jSONObject);
        C0K04.LIZLLL(MultiHostCrossAdapterImpl.LLLIIIL ? 1 : 0, "is_cross_arc_enable", jSONObject);
        C0K04.LIZLLL(MultiHostCrossAdapterImpl.LLLIIL ? 1 : 0, "is_cross_arc_sdk_enable", jSONObject);
        if (MultiHostCrossAdapterImpl.LLLIIIL && MultiHostCrossAdapterImpl.LLLIIL) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null) {
                strU3 = interfaceC954180awCLJIIIZ.U3();
            } else {
                strU3 = null;
            }
            C0K04.LJFF("inner_channel_id", strU3, jSONObject);
            C915980Zwa.LJII().jn1();
            C0K04.LJ("group_channel_id", C915980Zwa.LJII().getChannelId(), jSONObject);
        }
        C985690bl1.LIZ.getClass();
        C0K04.LIZLLL(C985690bl1.LJ, "game_resource_status", jSONObject);
    }

    public static void LJIILLIIL(JSONObject jSONObject) {
        long jLongValue;
        C969470bKr c969470bKr = LJJIFFI;
        if (c969470bKr != null) {
            Long value = c969470bKr.LIZLLL.getValue();
            long jLJJJJJ = 0;
            if (value != null) {
                value.longValue();
                Long value2 = c969470bKr.LIZLLL.getValue();
                if (value2 != null) {
                    jLongValue = value2.longValue();
                } else {
                    jLongValue = 0;
                }
                C0K04.LJ("battle_id", jLongValue, jSONObject);
            }
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJJJJ = interfaceC973730bRjYf2.LJJJJJ();
            }
            C0K04.LJ("team_id", jLJJJJJ, jSONObject);
        }
        LJIILL(jSONObject);
    }

    public static void LJIIZILJ(JSONObject jSONObject) {
        long jLJJJJJ;
        if (LJJIFFI != null && !jSONObject.has("battle_id")) {
            C0K04.LJ("battle_id", C973890bRz.LIZ.LJLIIIL(), jSONObject);
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJJJJ = interfaceC973730bRjYf2.LJJJJJ();
        } else {
            jLJJJJJ = 0;
        }
        C0K04.LJ("team_id", jLJJJJJ, jSONObject);
        LJIILL(jSONObject);
    }

    public static final void LJJIFFI(JSONObject jSONObject) {
        long j;
        BattleSetting battleSettingLJIILIIL;
        C0K04.LIZLLL(C974520bT0.LIZIZ ? 1 : 0, "time_calibrated", jSONObject);
        C0K04.LJ("min_half_rtt", C974520bT0.LIZ, jSONObject);
        C0K04.LJ("time_before_calibrated", System.currentTimeMillis(), jSONObject);
        C0K04.LJ("time_after_calibrated", C974520bT0.LIZ(), jSONObject);
        C0K04.LJ("calibrated_diff", C974520bT0.LIZ() - System.currentTimeMillis(), jSONObject);
        C0K04.LJ("t3_current_diff_time", C974520bT0.LJ - C974520bT0.LJFF, jSONObject);
        C0K04.LJFF("calibrated_log_id", C974520bT0.LIZJ, jSONObject);
        C0K04.LJFF("calibrated_path", C974520bT0.LIZLLL, jSONObject);
        C0K04.LJ("calibrated_t3_time", C974520bT0.LJ, jSONObject);
        C0K04.LJ("calibrated_update_interval", System.currentTimeMillis() - C974520bT0.LJFF, jSONObject);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf2.LJIILIIL()) != null) {
            j = battleSettingLJIILIIL.startTimeMs;
        } else {
            j = 0;
        }
        C0K04.LJ("server_start_time", j, jSONObject);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LJJIJIL(String str) {
        switch (str.hashCode()) {
            case -1961629417:
                if (!str.equals("disconnect_cohost")) {
                    return -1;
                }
                return 103;
            case -1565981699:
                if (!str.equals("user_list_change")) {
                    return -1;
                }
                return 109;
            case -1472192797:
                if (!str.equals("finish_by_openmessage_timeout")) {
                    return -1;
                }
                return 107;
            case -1288967105:
                if (!str.equals("kickout_by_other")) {
                    return -1;
                }
                return 103;
            case -82177728:
                if (!str.equals("first_frame_timeout")) {
                    return -1;
                }
                return 103;
            case -22960785:
                if (!str.equals("user_offline")) {
                    return -1;
                }
                return 212;
            case 126616702:
                if (!str.equals("disconnect_pk")) {
                    return -1;
                }
                return 101;
            case 896262826:
                if (!str.equals("rtc_error")) {
                    return -1;
                }
                return 103;
            case 1317715082:
                if (!str.equals("linked_list_without_me")) {
                    return -1;
                }
                return 103;
            case 1621691062:
                if (!str.equals("finish_by_cancel")) {
                    return -1;
                }
                return 108;
            case 1725313488:
                if (!str.equals("end_live")) {
                    return -1;
                }
                return 110;
            case 1726074753:
                if (!str.equals("cut_short_msg")) {
                    return -1;
                }
                return 114;
            case 2044119787:
                if (!str.equals("normal_finish")) {
                    return -1;
                }
                return 106;
            default:
                return -1;
        }
    }

    public static void LJJIJL(LinkMicBattleMessage linkMicBattleMessage) {
        Integer numValueOf;
        String str;
        C974540bT2 c974540bT2 = LIZ;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        Boolean boolValueOf = null;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        } else {
            numValueOf = null;
        }
        boolean zLIZ = C959180b4G.LIZ(numValueOf);
        JSONObject jSONObject = new JSONObject();
        LJIJ(linkMicBattleMessage, jSONObject);
        LJIJJLI(jSONObject, zLIZ);
        JSONObject jSONObject2 = new JSONObject();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(zLIZ);
        if (interfaceC973730bRjYf2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI());
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        C0K04.LJFF("role_type", str, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("accept_message_fetch_cost", C158B.LIZ() - linkMicBattleMessage.baseMessage.createTime, jSONObject3);
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        c974540bT2.LLIIIZ("accept_message", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974540bT2.LJJIZ(java.lang.String):void");
    }

    public final void LJJJ(EnumC974360bSk enumC974360bSk) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("click_reason", enumC974360bSk.getType(), jSONObject2);
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        c917350Zyn.getClass();
        C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
        LLII(this, "battle_icon_click", jSONObject, jSONObject2, C915980Zwa.LJFF().xB0(), 8);
    }

    public final void LJJJI(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        LLIIZ(this, "battle_info_failed", jSONObject, jSONObject2, jSONObject3, false, null, 48);
    }

    public final void LJJJJ(String str) {
        LJJJI = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject2);
        LLIIZ(this, "battle_info_request", jSONObject, jSONObject2, null, false, C915980Zwa.LJFF().xB0(), 24);
    }

    public final void LJJJJJL(String str) {
        if (!LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject);
        EnumC974510bSz enumC974510bSz = EnumC974510bSz.CAPSULE;
        C0K04.LJFF("source", enumC974510bSz.getValue(), jSONObject);
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        C0K04.LJFF("source", enumC974510bSz.getValue(), jSONObject2);
        C0K04.LJFF("guide_type", str, jSONObject2);
        LLII(this, "battle_pk_guide_show", jSONObject, jSONObject2, C915980Zwa.LJFF().xB0(), 8);
    }

    public final void LJJJJL(BattleInfoResponse battleInfoResponse) {
        Long lValueOf;
        BattleTeamResult battleTeamResult;
        Map<Long, BattleTeamResult> map;
        Map<Long, BattleTeamUserArmies> map2;
        Map<Long, BattleTeamResult> map3;
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        long jLongValue2 = 0;
        if (battleInfoResponse != null) {
            Long l = battleInfoResponse.battleId;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C0K04.LJ("battle_id", jLongValue, jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        BattleTeamResult battleTeamResult2 = null;
        if (battleInfoResponse != null && battleInfoResponse.teamBattleResult != null) {
            Gson gson = C19748512Ol.LIZJ;
            if (battleInfoResponse != null) {
                map3 = battleInfoResponse.teamBattleResult;
            } else {
                map3 = null;
            }
            C0K04.LJFF("battle_result", GsonProtectorUtils.toJson(gson, map3), jSONObject);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (Room.isValid(room)) {
            if (room != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
            } else {
                lValueOf = null;
            }
        } else {
            lValueOf = 0L;
        }
        if (battleInfoResponse != null && (map2 = battleInfoResponse.teamArmies) != null) {
            for (Map.Entry<Long, BattleTeamUserArmies> entry : map2.entrySet()) {
                List<BattleTeamUser> list = entry.getValue().teamUsers;
                if (list != null) {
                    Iterator<BattleTeamUser> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            BattleTeamUser next = it2.next();
                            if (Intrinsics.LJFF(lValueOf, next.userId)) {
                                if (next != null) {
                                    jLongValue2 = entry.getKey().longValue();
                                }
                            }
                        }
                    }
                }
            }
        }
        long j = 1;
        if (jLongValue2 == 1) {
            j = 2;
        }
        if (battleInfoResponse != null && (map = battleInfoResponse.teamBattleResult) != null) {
            battleTeamResult = map.get(Long.valueOf(jLongValue2));
        } else {
            battleTeamResult = null;
            if (battleInfoResponse != null) {
            }
            LJJ(jSONObject, battleTeamResult, battleTeamResult2);
            C0K04.LJFF(Scene.SCENE_SERVICE, "room_enter", jSONObject);
            LLIIZ(this, "update_result", jSONObject, jSONObject2, jSONObject3, false, null, 48);
        }
        Map<Long, BattleTeamResult> map4 = battleInfoResponse.teamBattleResult;
        if (map4 != null) {
            battleTeamResult2 = map4.get(Long.valueOf(j));
        }
        LJJ(jSONObject, battleTeamResult, battleTeamResult2);
        C0K04.LJFF(Scene.SCENE_SERVICE, "room_enter", jSONObject);
        LLIIZ(this, "update_result", jSONObject, jSONObject2, jSONObject3, false, null, 48);
    }

    public final void LJJJLZIJ(LinkMicBattleMessage linkMicBattleMessage) {
        long jLJJJJJ;
        long jLIZIZ;
        long value;
        BattleSetting battleSettingLJIILIIL;
        JSONObject jSONObject = new JSONObject();
        LJIJ(linkMicBattleMessage, jSONObject);
        C0K04.LJ("client_and_server_diff_time", C963140bAe.LIZLLL, jSONObject);
        LJIJJLI(jSONObject, false);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        long jAbs = 0;
        if (interfaceC973730bRjYf2 != null) {
            jLJJJJJ = interfaceC973730bRjYf2.LJJJJJ();
        } else {
            jLJJJJJ = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<BattleTeamResult> list = linkMicBattleMessage.teamBattleResult;
        Long lValueOf = null;
        if (list != null) {
            int i = 0;
            for (BattleTeamResult battleTeamResult : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    BattleTeamResult battleTeamResult2 = battleTeamResult;
                    Long l = battleTeamResult2.teamId;
                    linkedHashMap.put(Long.valueOf(l != null ? l.longValue() : i2), battleTeamResult2);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        BattleTeamResult battleTeamResult3 = (BattleTeamResult) linkedHashMap.get(Long.valueOf(jLJJJJJ));
        if (C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_2V2) {
            long j = 1;
            if (jLJJJJJ == 1) {
                j = 2;
            }
            LJJ(jSONObject, battleTeamResult3, (BattleTeamResult) linkedHashMap.get(Long.valueOf(j)));
        } else {
            LJJ(jSONObject, battleTeamResult3, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        long j2 = linkMicBattleMessage.battleSetting.battleId;
        C0K04.LJ("message_battle_id", j2, jSONObject2);
        C0K04.LJ("message_battle_id", j2, jSONObject);
        List<BattleTeamResult> list2 = linkMicBattleMessage.teamBattleResult;
        if (list2 != null) {
            C0K04.LJFF("battle_result", GsonProtectorUtils.toJson(C19748512Ol.LIZJ, list2), jSONObject);
        }
        C0K04.LJFF(Scene.SCENE_SERVICE, "finish_msg", jSONObject);
        LLIIIJ("update_result", jSONObject, jSONObject2, jSONObject3, true, null);
        if (MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled()) {
            jLIZIZ = C974520bT0.LIZ();
        } else {
            jLIZIZ = C158B.LIZIZ();
        }
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf22.LJIILIIL()) != null) {
            lValueOf = Long.valueOf(((long) battleSettingLJIILIIL.duration) * 1000);
        }
        long j3 = jLIZIZ - LJJIJLIJ;
        if (lValueOf != null) {
            value = lValueOf.longValue();
        } else {
            value = LiveInteractBattleDurationSetting.INSTANCE.getValue() * 1000;
        }
        long j4 = j3 - value;
        if (j4 < 0) {
            jAbs = Math.abs(j4);
        }
        C0K04.LJ("battle_remain_millis", jAbs, jSONObject);
        C0K04.LJ("remainTime", C946230ajN.LJIIIIZZ, jSONObject);
        C0K04.LJFF("remainTimeString", C946230ajN.LJIIIZ, jSONObject);
        LJJIFFI(jSONObject);
        LLIIIJ("battle_finish_message", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
        LLIIIJ("settlement_message", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJJLIIIJ(int i) {
        long j;
        LIZJ = C158B.LIZ();
        if (C959180b4G.LIZ(Integer.valueOf(i))) {
            j = LJJI + 1;
        } else {
            j = 0;
        }
        LJJI = j;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        C0K04.LIZLLL(i, "invite_type", jSONObject);
        LJIJJLI(jSONObject, C959180b4G.LIZ(Integer.valueOf(i)));
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size() - 1, "invitee_count", jSONObject2);
        LLIIIJ("invite_request", jSONObject, jSONObject2, new JSONObject(), false, C915980Zwa.LJFF().xB0());
    }

    public final void LJJLIL(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            C0K04.LJFF("role_type", "anchor", jSONObject);
            C0K04.LJFF("role_type", "anchor", jSONObject2);
            LLII(this, "battle_load_widget", jSONObject, jSONObject2, null, 24);
        } else {
            C0K04.LJFF("role_type", "audience", jSONObject);
            C0K04.LJFF("role_type", "audience", jSONObject2);
            LLIIZ(this, "battle_load_widget", jSONObject, null, null, false, null, 44);
        }
    }

    public final void LJJLJLI(long j) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        LLIIIJ("orphan_battle_cancel_success", jSONObject, new JSONObject(), new JSONObject(), false, null);
    }

    public final void LJJLL(long j) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        LLIIIJ("orphan_battle_detected", jSONObject, new JSONObject(), new JSONObject(), false, null);
    }

    public final void LJJZZI(C470590Icr<Unit> c470590Icr) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (c470590Icr != null) {
            str = c470590Icr.LIZIZ;
        } else {
            str = null;
        }
        C0K04.LJFF("logid", str, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJ("cost", C158B.LIZ() - LJIILJJIL, jSONObject2);
        LLIIIJ("punish_finish_succeed", jSONObject, new JSONObject(), jSONObject2, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJLI(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        LLIIIJ("quit_approve_failed", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJLIIL(int i) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "quit_panel_click", jSONObject);
        C0K04.LIZLLL(i, "quit_action", jSONObject);
        LJIJJLI(jSONObject, false);
        LLIIIJ("quit_panel_click", jSONObject, new JSONObject(), new JSONObject(), true, C915980Zwa.LJFF().xB0());
    }

    public final void LL(String str) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("reason", str, jSONObject);
        LLIIIJ("send_invite_blocked_duplicate", jSONObject, new JSONObject(), new JSONObject(), false, null);
    }

    public final void LLF(LinkMicBattleMessage linkMicBattleMessage) {
        long jLIZIZ;
        Long lValueOf;
        long value;
        Integer numValueOf;
        BattleSetting battleSettingLJIILIIL;
        JSONObject jSONObject = new JSONObject();
        LJIJ(linkMicBattleMessage, jSONObject);
        C0K04.LJ("battle_id", linkMicBattleMessage.battleId, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled()) {
            jLIZIZ = C974520bT0.LIZ();
        } else {
            jLIZIZ = C158B.LIZIZ();
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        Integer numValueOf2 = null;
        if (interfaceC973730bRjYf2 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf2.LJIILIIL()) != null) {
            lValueOf = Long.valueOf(((long) battleSettingLJIILIIL.duration) * 1000);
        } else {
            lValueOf = null;
        }
        long j = jLIZIZ - LJJIJLIJ;
        if (lValueOf != null) {
            value = lValueOf.longValue();
        } else {
            value = 1000 * LiveInteractBattleDurationSetting.INSTANCE.getValue();
        }
        long j2 = j - value;
        long jAbs = 0;
        if (j2 > 0) {
            jAbs = Math.abs(j2);
        }
        C0K04.LJ("battle_remain_millis", jAbs, jSONObject);
        C0K04.LJ("remainTime", C946230ajN.LJIIIIZZ, jSONObject);
        C0K04.LJFF("remainTimeString", C946230ajN.LJIIIZ, jSONObject);
        LJJIFFI(jSONObject);
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.battleType);
        } else {
            numValueOf = null;
        }
        LLIIZ(this, "battle_finish_message", jSONObject, jSONObject2, jSONObject3, false, C918130a03.LIZ(numValueOf), 16);
        BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
        if (battleSetting2 != null) {
            numValueOf2 = Integer.valueOf(battleSetting2.battleType);
        }
        LLIIZ(this, "settlement_message", jSONObject, jSONObject2, jSONObject3, false, C918130a03.LIZ(numValueOf2), 16);
    }

    public final void LLFFF(LinkMicBattleMessage linkMicBattleMessage) {
        Integer numValueOf;
        C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        LJIJ(linkMicBattleMessage, jSONObject);
        C0K04.LJ("battle_id", linkMicBattleMessage.battleId, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.battleType);
        } else {
            numValueOf = null;
        }
        LLIIZ(this, "open_message", jSONObject, jSONObject2, jSONObject3, false, C918130a03.LIZ(numValueOf), 16);
    }

    public static void LJIJ(LinkMicBattleMessage linkMicBattleMessage, JSONObject jSONObject) {
        C0K04.LJ("battle_id", linkMicBattleMessage.battleId, jSONObject);
        C0K04.LJ("message_id", linkMicBattleMessage.baseMessage.messageId, jSONObject);
        C0K04.LIZLLL(linkMicBattleMessage.action, "message", jSONObject);
        C0K04.LJ("action_by_userId", linkMicBattleMessage.actionByUserId, jSONObject);
        C0K04.LJ("message_fetch_time", linkMicBattleMessage.timestamp, jSONObject);
        C0K04.LJ("message_create_time", linkMicBattleMessage.baseMessage.createTime, jSONObject);
    }

    public static void LJIJI(LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage, JSONObject jSONObject) {
        C0K04.LJ("battle_id", linkMicBattlePunishFinishMessage.battleId, jSONObject);
        C0K04.LJ("message_id", linkMicBattlePunishFinishMessage.baseMessage.messageId, jSONObject);
        C0K04.LJ("message_fetch_time", linkMicBattlePunishFinishMessage.timestamp, jSONObject);
        C0K04.LJ("message_create_time", linkMicBattlePunishFinishMessage.baseMessage.createTime, jSONObject);
        C0K04.LJ("action_by_userId", linkMicBattlePunishFinishMessage.opUid, jSONObject);
    }

    public static final void LJIJJ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    C0K04.LIZLLL(((Number) obj).intValue(), next, jSONObject2);
                } else if (obj instanceof Long) {
                    C0K04.LJ(next, ((Number) obj).longValue(), jSONObject2);
                } else if (obj instanceof String) {
                    C0K04.LJFF(next, (String) obj, jSONObject2);
                } else if (obj instanceof Boolean) {
                    C0K04.LJIIIZ(jSONObject2, next, ((Boolean) obj).booleanValue());
                } else {
                    jSONObject2.putOpt(next, obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZLLL("msg error: metric shouldn't set this type value, else adapt in this");
            }
        }
    }

    public static final void LJIJJLI(JSONObject jSONObject, boolean z) {
        String str;
        long jLJ = C978520bZS.LJ(z);
        if (jLJ != 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("is_gift_only", str, jSONObject);
        C0K04.LJ("only_gift_id", jLJ, jSONObject);
    }

    public static void LJIL(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!LiveMatchTechMonitorCalibrationSetting.INSTANCE.isRequestFromEnabled()) {
            return;
        }
        InterfaceC955780aym interfaceC955780aymLJIIJ = C915980Zwa.LJI().LJIIJ();
        String strLJIJJ = interfaceC955780aymLJIIJ.LJIJJ();
        if (strLJIJJ.length() == 0) {
            strLJIJJ = interfaceC955780aymLJIIJ.LJJIJIIJI();
        }
        EnumC973640bRa enumC973640bRaLJ = C925640aCA.LJ(strLJIJJ);
        if (enumC973640bRaLJ == EnumC973640bRa.OTHER_VALUE) {
            if (Intrinsics.LJFF(strLJIJJ, "playbook_match")) {
                strLJIJJ = "match_playbook";
            }
        } else {
            strLJIJJ = enumC973640bRaLJ.getValue();
        }
        C0K04.LJFF("request_from", strLJIJJ, jSONObject);
        C0K04.LJFF("request_from", strLJIJJ, jSONObject2);
    }

    public static String LJJIJIIJIL(int i, long j) {
        if (i != 101) {
            if (i != 103) {
                if (i != 211) {
                    if (i != 212) {
                        switch (i) {
                            case 106:
                                return "normal_finish";
                            case 107:
                                return "finish_by_openmessage_timeout";
                            case 108:
                                return "finish_by_cancel";
                            case 109:
                                return "user_list_change";
                            case 110:
                                return "end_live";
                            default:
                                return String.valueOf(i);
                        }
                    }
                    return "user_offline";
                }
                return "disconnect_pk";
            }
            if (j == 1) {
                return "disconnect_cohost";
            }
            if (j == 2) {
                return "kickout_by_other";
            }
            if (j == 6) {
                return "first_frame_timeout";
            }
            if (j == 7) {
                return "linked_list_without_me";
            }
            if (j == 4) {
                return "rtc_error";
            }
            if (j == 5) {
                return "leave_only_one";
            }
            return "other_finish_reason";
        }
        return "disconnect_pk";
    }

    public static void LJLJJI(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
        int i;
        long j;
        Integer numValueOf;
        C974540bT2 c974540bT2 = LIZ;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            i = battleSetting.inviteType;
        } else {
            i = 0;
        }
        if (C959180b4G.LIZ(Integer.valueOf(i))) {
            j = LJJI + 1;
        } else {
            j = 0;
        }
        LJJI = j;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("message_fetch_time", linkMicBattleMessage.timestamp, jSONObject);
        C0K04.LJ("message_create_time", linkMicBattleMessage.baseMessage.createTime, jSONObject);
        C0K04.LJ("battle_id", linkMicBattleMessage.battleId, jSONObject);
        C0K04.LJFF("role_type", "invitee", jSONObject);
        C0K04.LJIIIZ(jSONObject, "is_started", false);
        BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
        if (battleSetting2 != null) {
            numValueOf = Integer.valueOf(battleSetting2.inviteType);
        } else {
            numValueOf = null;
        }
        LJIJJLI(jSONObject, C959180b4G.LIZ(numValueOf));
        C0K04.LIZLLL(z ? 1 : 0, "is_first_invite", jSONObject);
        C0K04.LJ("action_by_userId", linkMicBattleMessage.actionByUserId, jSONObject);
        List<BattleInviteeGiftPermission> list = linkMicBattleMessage.inviteeGiftPermissionTypes;
        int i2 = 3;
        if (list != null) {
            for (BattleInviteeGiftPermission battleInviteeGiftPermission : list) {
                if (battleInviteeGiftPermission.userId == LJJIIZ()) {
                    i2 = battleInviteeGiftPermission.giftPermissionType;
                }
            }
        }
        C0K04.LIZLLL(i2, "gift_permission", jSONObject);
        C0K04.LJ("message_id", linkMicBattleMessage.baseMessage.messageId, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "invitee", jSONObject2);
        C0K04.LIZLLL(0, "is_accept", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("invite_message_fetch_cost", C158B.LIZ() - linkMicBattleMessage.baseMessage.createTime, jSONObject3);
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        c974540bT2.LLIIIZ("invite_message", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
    }

    public static void LJLJJL(int i, long j) {
        C974540bT2 c974540bT2 = LIZ;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        C0K04.LJIIIZ(jSONObject, "click_state", true);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(i, "selection", jSONObject2);
        C0K04.LJFF("role_type", "invitee", jSONObject2);
        C0K04.LJFF(Scene.SCENE_SERVICE, "normal", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("show_to_decide_dur", C158B.LIZ() - LJ, jSONObject3);
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        c974540bT2.LLIIIZ("receive_panel_click", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
    }

    public static void LLD(String str, EnumC919170a1j enumC919170a1j) {
        C974540bT2 c974540bT2 = LIZ;
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(0, "is_leave_room", jSONObject);
        C0K04.LJFF("source_string", str, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(!LJJIIZI.contains(str) ? 1 : 0, "stage", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        long jLIZ = C158B.LIZ() - LJJIJL;
        C0K04.LJ("match_duration", jLIZ, jSONObject3);
        C0K04.LJ("match_duration", jLIZ / 1000, jSONObject2);
        C975390bUP.LJIIJ(jSONObject, jSONObject3);
        LLIIZ(c974540bT2, "battle_finish", jSONObject, jSONObject2, jSONObject3, false, enumC919170a1j, 16);
    }

    public static void LLIIII(String str, boolean z) {
        long jLJJJJJL;
        long j;
        int i;
        int i2;
        BattleSetting battleSettingLJIILIIL;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
        } else {
            jLJJJJJL = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jLJJJJJL);
        sbLIZ.append(',');
        sbLIZ.append(currentUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf22.LJIILIIL()) != null) {
            j = battleSettingLJIILIIL.startTimeMs;
        } else {
            j = 0;
        }
        boolean zEnableScoreTrack = LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableScoreTrack();
        for (String str2 : ((LinkedHashMap) LJJIII).keySet()) {
            List<C974600bT8> list = (List) ((LinkedHashMap) LJJIII).get(str2);
            if (list != null) {
                for (C974600bT8 c974600bT8 : list) {
                    if (c974600bT8.LIZIZ > 0) {
                        C974540bT2 c974540bT2 = LIZ;
                        if (zEnableScoreTrack) {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            if (c974600bT8.LIZ != 0) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            C0K04.LIZLLL(i, "source", jSONObject);
                            C0K04.LIZLLL(0, "show", jSONObject);
                            C0K04.LJFF("unshow_reason", str, jSONObject);
                            C0K04.LJ("battle_id", jLJJJJJL, jSONObject2);
                            C0K04.LJ("user_id", currentUserId, jSONObject2);
                            C0K04.LJFF("distinct_key", strLIZIZ, jSONObject2);
                            if (c974600bT8.LIZ != 0) {
                                C0K04.LJFF("log_id", str2, jSONObject2);
                            }
                            long j2 = c974600bT8.LIZJ - j;
                            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                            C0K04.LJ("send_success_pk_time_sec", j2 / j3, jSONObject2);
                            C0K04.LJ("send_success_pk_time_sec", (c974600bT8.LIZJ - j) / j3, jSONObject3);
                            C0K04.LJ("send_to_now_dur", C974520bT0.LIZ() - c974600bT8.LIZJ, jSONObject2);
                            C0K04.LIZLLL(C20483515Dd.LIZ.LJ() ? 1 : 0, "client_downsampling", jSONObject2);
                            C0K04.LJ("battle_start_timestamp", j, jSONObject2);
                            C0K04.LJ("send_request_timestamp", c974600bT8.LIZLLL, jSONObject2);
                            C0K04.LJ("send_success_timestamp", c974600bT8.LIZJ, jSONObject2);
                            C0K04.LJ("receive_im_timestamp", c974600bT8.LJ, jSONObject2);
                            C0K04.LJ("im_publish_timestamp", c974600bT8.LJFF, jSONObject2);
                            C0K04.LJ("update_score_timestamp", c974600bT8.LJI, jSONObject2);
                            C0K04.LJ("send_request_pk_remain_time", c974600bT8.LJIIJJI, jSONObject2);
                            C0K04.LJ("send_success_pk_remain_time", c974600bT8.LJIIL, jSONObject2);
                            C0K04.LJ("receive_im_pk_remain_time", c974600bT8.LJIILIIL, jSONObject2);
                            C0K04.LJ("update_score_pk_remain_time", c974600bT8.LJIILJJIL, jSONObject2);
                            long jLJJIIJZLJL = LJJIIJZLJL(c974600bT8.LJII, c974600bT8.LJIIIIZZ);
                            long jLJJIIJZLJL2 = LJJIIJZLJL(c974600bT8.LJII, c974600bT8.LJIIIZ);
                            long jLJJIIJZLJL3 = LJJIIJZLJL(c974600bT8.LJIIIZ, c974600bT8.LJIIJ);
                            long jLJJIIJZLJL4 = LJJIIJZLJL(c974600bT8.LJIIIIZZ, c974600bT8.LJIIJ);
                            C0K04.LJ("send_request_to_success_cost", jLJJIIJZLJL, jSONObject3);
                            C0K04.LJ("send_request_to_success_cost", jLJJIIJZLJL, jSONObject2);
                            C0K04.LJ("send_request_to_receive_im_cost", jLJJIIJZLJL2, jSONObject3);
                            C0K04.LJ("send_request_to_receive_im_cost", jLJJIIJZLJL2, jSONObject2);
                            C0K04.LJ("receive_im_to_update_score_cost", jLJJIIJZLJL3, jSONObject3);
                            C0K04.LJ("receive_im_to_update_score_cost", jLJJIIJZLJL3, jSONObject2);
                            C0K04.LJ("send_success_to_update_score_cost", jLJJIIJZLJL4, jSONObject3);
                            C0K04.LJ("send_success_to_update_score_cost", jLJJIIJZLJL4, jSONObject2);
                            C970340bMG.LJIIJ("audience", jSONObject, jSONObject2);
                            C970340bMG.LJIIJJI(EnumC970360bMI.SENDER, "battle_score_update", jSONObject, jSONObject2, jSONObject3);
                        } else {
                            zEnableScoreTrack = false;
                            JSONObject jSONObject4 = new JSONObject();
                            JSONObject jSONObject5 = new JSONObject();
                            C0K04.LJ("user_id", currentUserId, jSONObject4);
                            C0K04.LJFF("distinct_key", strLIZIZ, jSONObject4);
                            if (c974600bT8.LIZ != 0) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            C0K04.LIZLLL(i2, "source", jSONObject4);
                            long j4 = c974600bT8.LIZJ - j;
                            long j5 = LSPassThroughRecordSizeConfig.DEFAULT;
                            C0K04.LJ("send_success_pk_time_sec", j4 / j5, jSONObject4);
                            C0K04.LJ("send_success_pk_time_sec", (c974600bT8.LIZJ - j) / j5, jSONObject5);
                            C0K04.LIZLLL(0, "show", jSONObject4);
                            C0K04.LJ("send_to_now_dur", C974520bT0.LIZ() - c974600bT8.LIZJ, jSONObject4);
                            C0K04.LIZLLL(C20483515Dd.LIZ.LJ() ? 1 : 0, "client_downsampling", jSONObject4);
                            if (c974600bT8.LIZ != 0) {
                                C0K04.LJFF("log_id", str2, jSONObject4);
                            }
                            C0K04.LJFF("unshow_reason", str, jSONObject4);
                            if (z) {
                                LLIIZ(c974540bT2, "battle_score_update", jSONObject4, jSONObject4, jSONObject5, false, null, 48);
                            } else {
                                C974480bSw.LIZ.LJJIIJZLJL("battle_score_update", jSONObject4, jSONObject4, jSONObject5);
                            }
                        }
                    }
                }
            }
        }
        ((LinkedHashMap) LJJIII).clear();
        ((ArrayList) LJJIIJ).clear();
        ((LinkedHashMap) LJJIIJZLJL).clear();
        ((ArrayList) C974480bSw.LIZJ).clear();
        if (zEnableScoreTrack) {
            C975390bUP.LJIIL("audience");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJIL(C470590Icr c470590Icr, String str) {
        int i;
        Long lValueOf;
        BattleTeamResult battleTeamResult;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("logid", c470590Icr.LIZIZ, jSONObject);
        int i2 = 0;
        LJIJJLI(jSONObject, false);
        BattleSetting battleSetting = ((BattleInfoResponse) c470590Icr.data).setting;
        if (battleSetting != null) {
            i = battleSetting.status;
        } else {
            i = 0;
        }
        C0K04.LIZLLL(i, "battle_status", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("cost", C158B.LIZ() - LJJJI, jSONObject3);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long jLongValue = 0;
        BattleTeamResult battleTeamResult2 = null;
        if (Room.isValid(room)) {
            if (room != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
            } else {
                lValueOf = null;
            }
        } else {
            lValueOf = 0L;
        }
        Map<Long, BattleTeamUserArmies> map = ((BattleInfoResponse) c470590Icr.data).teamArmies;
        if (map != null) {
            for (Map.Entry<Long, BattleTeamUserArmies> entry : map.entrySet()) {
                List<BattleTeamUser> list = entry.getValue().teamUsers;
                if (list != null) {
                    Iterator<BattleTeamUser> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            BattleTeamUser next = it2.next();
                            if (Intrinsics.LJFF(lValueOf, next.userId)) {
                                if (next != null) {
                                    jLongValue = entry.getKey().longValue();
                                }
                            }
                        }
                    }
                }
            }
        }
        long j = 1;
        if (jLongValue == 1) {
            j = 2;
        }
        Map<Long, BattleTeamResult> map2 = ((BattleInfoResponse) c470590Icr.data).teamBattleResult;
        if (map2 != null) {
            battleTeamResult = map2.get(Long.valueOf(jLongValue));
        } else {
            battleTeamResult = null;
        }
        Map<Long, BattleTeamResult> map3 = ((BattleInfoResponse) c470590Icr.data).teamBattleResult;
        if (map3 != null) {
            battleTeamResult2 = map3.get(Long.valueOf(j));
        }
        LJJ(jSONObject, battleTeamResult, battleTeamResult2);
        LJJ(jSONObject2, battleTeamResult, battleTeamResult2);
        BattleSetting battleSetting2 = ((BattleInfoResponse) c470590Icr.data).setting;
        if (battleSetting2 != null) {
            i2 = battleSetting2.status;
        }
        C0K04.LIZLLL(i2, "battle_status", jSONObject2);
        if (Intrinsics.LJFF(str, "audience_result")) {
            LJJIFFI(jSONObject);
        }
        LLIIZ(this, "battle_info_succeed", jSONObject, jSONObject2, jSONObject3, false, null, 48);
        Map<Long, BattleTeamResult> map4 = ((BattleInfoResponse) c470590Icr.data).teamBattleResult;
        if (map4 != null) {
            C0K04.LJFF("battle_result", GsonProtectorUtils.toJson(C19748512Ol.LIZJ, map4), jSONObject);
        }
        C0K04.LJFF(Scene.SCENE_SERVICE, "battle_info", jSONObject);
        LJJ(jSONObject2, battleTeamResult, battleTeamResult2);
        LLIIZ(this, "update_result", jSONObject, jSONObject2, jSONObject3, false, null, 48);
    }

    public final void LJJJJIZL(C470590Icr<Void> c470590Icr, String str) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("role_type", "anchor", jSONObject);
        if (c470590Icr != null) {
            C0K04.LJFF("logid", c470590Icr.LIZIZ, jSONObject);
        }
        C0K04.LIZLLL(1, "enable_battle", jSONObject);
        C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        long jLIZ = C158B.LIZ() - LJIILIIL;
        C0K04.LJ("cost", jLIZ, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJFF("role_type", "anchor", jSONObject3);
        C0K04.LJ("cost", jLIZ, jSONObject3);
        C0K04.LJIIIZ(jSONObject3, "is_match_button_opt", LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptMatchButton());
        C0K04.LJIIIZ(jSONObject3, "is_match_api_opt", C973510bRN.LIZIZ());
        LLII(this, "battle_permission_success", jSONObject, jSONObject3, null, 24);
    }

    public final void LJJJJLL(LinkMicBattleMessage linkMicBattleMessage, Boolean bool) {
        Integer numValueOf;
        String str;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        Boolean boolValueOf = null;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        } else {
            numValueOf = null;
        }
        boolean zLIZ = C959180b4G.LIZ(numValueOf);
        JSONObject jSONObject = new JSONObject();
        LJIJ(linkMicBattleMessage, jSONObject);
        LJIJJLI(jSONObject, zLIZ);
        JSONObject jSONObject2 = new JSONObject();
        ILiveMatchService iLiveMatchServiceLJFF = C915980Zwa.LJFF();
        if (bool != null) {
            zLIZ = bool.booleanValue();
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = iLiveMatchServiceLJFF.yf2(zLIZ);
        if (interfaceC973730bRjYf2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI());
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        C0K04.LJFF("role_type", str, jSONObject2);
        LLIIIZ("cancel_message", jSONObject, jSONObject2, new JSONObject(), false, C915980Zwa.LJFF().xB0());
    }

    public final void LJJJLL(long j, EnumC919210a1n enumC919210a1n) {
        int i;
        LJJIJIL = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("channel_id", j, jSONObject);
        if (enumC919210a1n == EnumC919210a1n.SUPPORT_MULTI) {
            i = 1;
        } else {
            i = 0;
        }
        C0K04.LIZLLL(i, "is_sdk", jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJ("cost", C158B.LIZ() - LJJIJIL, jSONObject2);
        LLIIZ(this, "coHost_identified", jSONObject, null, jSONObject2, false, null, 52);
    }

    public final void LJJJZ(int i, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(z ? 1 : 0, "cut_short", jSONObject2);
        C0K04.LIZLLL(z ? 1 : 0, "cut_short", jSONObject);
        C0K04.LIZLLL(i, "source", jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("match_duration", C158B.LIZ() - LJII, jSONObject3);
        LJIIIZ = C158B.LIZ();
        LLIIIJ("battle_finish_request", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJJLIIIJLJLI(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(z ? 1 : 0, "cut_short", jSONObject2);
        C0K04.LIZLLL(z ? 1 : 0, "cut_short", jSONObject);
        C0K04.LJFF("source", str, jSONObject);
        C0K04.LIZLLL(LJJIJIL(str), "reason", jSONObject);
        C0K04.LIZLLL(LJJIJIL(str), "reason", jSONObject2);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("match_duration", C158B.LIZ() - LJII, jSONObject3);
        LJIIIZ = C158B.LIZ();
        LLIIIJ("leave_linkmic_request", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJJLJ(long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        LLIIIJ("orphan_battle_cancel_failed", jSONObject, jSONObject2, new JSONObject(), false, null);
    }

    public final void LJJZ(Throwable th, boolean z) {
        JSONObject jSONObject = new JSONObject();
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        C0K04.LIZLLL(z ? 1 : 0, "cut_short", jSONObject2);
        LLIIIJ("punish_finish_failed", jSONObject, jSONObject2, new JSONObject(), true, C915980Zwa.LJFF().xB0());
    }

    public final void LJJZZIII(int i, boolean z) {
        LJIILJJIL = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJ("punish_duration", C158B.LIZ() - LJIIJ, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LIZLLL(z ? 1 : 0, "cut_short", jSONObject3);
        C0K04.LIZLLL(i, "source", jSONObject3);
        LLIIIJ("punish_finish_request", jSONObject, jSONObject3, jSONObject2, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJLIIIL(long j, C470590Icr<Unit> c470590Icr) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        C0K04.LJFF("logid", c470590Icr.LIZIZ, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("cost", C158B.LIZ() - LJIIL, jSONObject3);
        LLIIIJ("quit_approve_succeed", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJLILLLLZI(long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (th == null) {
            th = new Throwable();
        }
        LJJI(th, jSONObject, jSONObject2);
        LLIIIJ("quit_failed", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJLJI(long j, C470590Icr<Unit> c470590Icr) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        C0K04.LJFF("logid", c470590Icr.LIZIZ, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("cost", C158B.LIZ() - LJIIJJI, jSONObject3);
        LLIIIJ("quit_succeed", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJLJJLL(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("reason", str, jSONObject);
        C0K04.LJFF("role_type", "invitee", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        LJIJJLI(jSONObject2, z);
        LLIIIJ("receive_panel_dismiss", jSONObject2, jSONObject, new JSONObject(), false, C915980Zwa.LJFF().xB0());
    }

    public final void LJLJLJ(LinkMicBattleMessage linkMicBattleMessage, Boolean bool) {
        Integer numValueOf;
        boolean zBooleanValue;
        String str;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        Boolean boolValueOf = null;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        } else {
            numValueOf = null;
        }
        boolean zLIZ = C959180b4G.LIZ(numValueOf);
        ILiveMatchService iLiveMatchServiceLJFF = C915980Zwa.LJFF();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = zLIZ;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = iLiveMatchServiceLJFF.yf2(zBooleanValue);
        JSONObject jSONObject = new JSONObject();
        LJIJ(linkMicBattleMessage, jSONObject);
        LJIJJLI(jSONObject, zLIZ);
        JSONObject jSONObject2 = new JSONObject();
        if (interfaceC973730bRjYf2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI());
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        C0K04.LJFF("role_type", str, jSONObject2);
        C0K04.LIZLLL(C915980Zwa.LJFF().fA2() ? 1 : 0, "is_inviting", jSONObject2);
        LLIIIJ("reject_message", jSONObject, jSONObject2, new JSONObject(), false, C915980Zwa.LJFF().xB0());
    }

    public final void LJLLLLLL(int i, String str) {
        long jLJJJJJL;
        long jLJJJJJL2;
        String str2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
        } else {
            jLJJJJJL = 0;
        }
        C0K04.LJFF("connection_type", "match", jSONObject2);
        C0K04.LJ("battle_id", jLJJJJJL, jSONObject);
        if (jLJJJJJL <= 0) {
            return;
        }
        if (LJJIL > 0) {
            C0K04.LJ("duration", C158B.LIZ() - LJJIL, jSONObject);
        }
        boolean z = true;
        if (C915980Zwa.LJII().LLILZLL(true).size() <= 2) {
            z = false;
        }
        C0K04.LJIIIZ(jSONObject, "is_multi", z);
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            jLJJJJJL2 = interfaceC973730bRjYf22.LJJJJJL();
        } else {
            jLJJJJJL2 = 0;
        }
        C0K04.LJ("server_battle_id", jLJJJJJL2, jSONObject);
        C0K04.LJFF("current_state", C915980Zwa.LJFF().RY(false).name(), jSONObject);
        C0K04.LIZLLL(i, "failed_type", jSONObject);
        C0K04.LIZLLL(i, "fail_type", jSONObject);
        C0K04.LJFF("seiString", str, jSONObject);
        C0K04.LJ("channel_id", C915980Zwa.LJI().LJIIJ().getChannelId(), jSONObject);
        long jLJ = C978520bZS.LJ(false);
        if (jLJ != 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("is_gift_only", str2, jSONObject);
        C0K04.LJ("only_gift_id", jLJ, jSONObject);
        LLIIZ(this, "sei_identify_failed", jSONObject, jSONObject2, null, true, C915980Zwa.LJFF().xB0(), 8);
    }

    public final void LLFZ(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("case_type", str, jSONObject);
        if (z) {
            LLIIIJ("update_result_issue", jSONObject, new JSONObject(), new JSONObject(), true, null);
        } else {
            LLIIZ(this, "update_result_issue", jSONObject, null, null, false, null, 60);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJ(org.json.JSONObject r10, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult r11, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult r12) {
        /*
            if (r11 == 0) goto L8e
            int r0 = r11.result
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L8:
            java.lang.String r4 = "win"
            java.lang.String r9 = "none"
            java.lang.String r8 = "lost"
            java.lang.String r7 = "draw"
            r3 = 1
            r2 = 2
            if (r1 == 0) goto L8c
            int r0 = r1.intValue()
            if (r0 != r2) goto L7c
            r6 = r7
        L1b:
            java.lang.String r0 = "result"
            X.C0K04.LJFF(r0, r6, r10)
            if (r11 == 0) goto L29
            java.lang.String r5 = "left_team_score"
            long r0 = r11.totalScore
            X.C0K04.LJ(r5, r0, r10)
        L29:
            if (r12 == 0) goto L32
            java.lang.String r5 = "right_team_score"
            long r0 = r12.totalScore
            X.C0K04.LJ(r5, r0, r10)
        L32:
            java.lang.String r0 = "final_result"
            X.C0K04.LJFF(r0, r6, r10)
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r0 = X.C915980Zwa.LJFF()
            r1 = 0
            X.0bRj r0 = r0.yf2(r1)
            if (r0 == 0) goto L56
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult r0 = r0.LJIJI()
            if (r0 == 0) goto L56
            int r0 = r0.result
            if (r0 == 0) goto L51
            if (r0 == r3) goto L7a
            if (r0 == r2) goto L78
            r4 = r9
        L51:
            java.lang.String r0 = "current_result"
            X.C0K04.LJFF(r0, r4, r10)
        L56:
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r0 = X.C915980Zwa.LJFF()
            X.0bCJ r0 = r0.RY(r1)
            int[] r1 = X.C974590bT7.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L75
            if (r0 == r2) goto L72
            java.lang.String r1 = "other"
        L6c:
            java.lang.String r0 = "current_status"
            X.C0K04.LJFF(r0, r1, r10)
            return
        L72:
            java.lang.String r1 = "punishing"
            goto L6c
        L75:
            java.lang.String r1 = "linked"
            goto L6c
        L78:
            r4 = r7
            goto L51
        L7a:
            r4 = r8
            goto L51
        L7c:
            int r0 = r1.intValue()
            if (r0 != r3) goto L84
            r6 = r8
            goto L1b
        L84:
            int r0 = r1.intValue()
            if (r0 != 0) goto L8c
            r6 = r4
            goto L1b
        L8c:
            r6 = r9
            goto L1b
        L8e:
            r1 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974540bT2.LJJ(org.json.JSONObject, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult):void");
    }

    public static void LJJI(Throwable th, JSONObject jSONObject, JSONObject jSONObject2) {
        if (th instanceof C501520Jle) {
            C501520Jle c501520Jle = (C501520Jle) th;
            C0K04.LIZLLL(c501520Jle.getErrorCode(), "error_msg", jSONObject2);
            C0K04.LIZLLL(c501520Jle.getErrorCode(), "error_code", jSONObject);
        } else {
            C0K04.LIZLLL(-1, "error_msg", jSONObject2);
            C0K04.LIZLLL(-1, "error_code", jSONObject);
        }
        C0K04.LJFF("error_detail", th.getMessage(), jSONObject);
    }

    public static int LJJIJIIJI(int i, long j, Room room) {
        User owner;
        if (i == 104) {
            if (room != null && (owner = room.getOwner()) != null && j == owner.getId()) {
                if (C915980Zwa.LJI().LIZ().LJJIJLIJ()) {
                    return 110;
                }
                return 103;
            }
            return 109;
        }
        return i;
    }

    public static void LJLJL(LinkMicBattleMessage linkMicBattleMessage, boolean z, EnumC919170a1j enumC919170a1j) {
        Integer numValueOf;
        String str;
        C974540bT2 c974540bT2 = LIZ;
        LJ = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", linkMicBattleMessage.battleId, jSONObject);
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        } else {
            numValueOf = null;
        }
        LJIJJLI(jSONObject, C959180b4G.LIZ(numValueOf));
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "invitee", jSONObject2);
        if (z) {
            str = "invite_each_other";
        } else {
            str = "normal";
        }
        C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject2);
        String str2 = "invite";
        C0K04.LJFF("reason", "invite", jSONObject2);
        if (z) {
            str2 = "accept";
        }
        C0K04.LJFF("message_type", str2, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("prepare_duration", C158B.LIZ() - linkMicBattleMessage.baseMessage.createTime, jSONObject);
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        c974540bT2.LLIIIZ("receive_panel_show", jSONObject, jSONObject2, jSONObject3, false, enumC919170a1j);
    }

    public static void LLFII(EnumC973450bRH enumC973450bRH, EnumC974510bSz enumC974510bSz, int i) {
        String str;
        C974540bT2 c974540bT2 = LIZ;
        if ((i & 2) != 0) {
            enumC974510bSz = EnumC974510bSz.ICON;
        }
        if ((i & 4) != 0) {
            str = "";
        } else {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        C0K04.LJFF("reason", enumC973450bRH.getReason(), jSONObject);
        C0K04.LJFF("no_gift_permission_anchor", str, jSONObject);
        C0K04.LJ("in_punished_anchor", 0L, jSONObject);
        if (LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
            C0K04.LJFF("source", enumC974510bSz.getValue(), jSONObject);
            C0K04.LJFF("source", enumC974510bSz.getValue(), jSONObject2);
        }
        LLII(c974540bT2, "battle_icon_click_exit", jSONObject, jSONObject2, C915980Zwa.LJFF().xB0(), 8);
    }

    public final void LJJJJI(Throwable th, boolean z, boolean z2) {
        String str;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("role_type", "anchor", jSONObject);
        C0K04.LIZLLL(z ? 1 : 0, "enable_battle", jSONObject);
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("is_last_retry", str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        C0K04.LJFF("role_type", "anchor", jSONObject2);
        C0K04.LJ("cost", C158B.LIZ() - LJIILIIL, new JSONObject());
        LLII(this, "battle_permission_failed", jSONObject, jSONObject2, null, 24);
    }

    public final void LJJJJJ(String str, EnumC964160bCI enumC964160bCI, String str2) {
        if (!LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject);
        EnumC974510bSz enumC974510bSz = EnumC974510bSz.CAPSULE;
        C0K04.LJFF("source", enumC974510bSz.getValue(), jSONObject);
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        C0K04.LJFF("source", enumC974510bSz.getValue(), jSONObject2);
        C0K04.LJFF("guide_type", str, jSONObject2);
        C0K04.LJFF("click_result", enumC964160bCI.getValue(), jSONObject2);
        if (enumC964160bCI == EnumC964160bCI.BLOCKED && str2 != null && str2.length() != 0) {
            C0K04.LJFF("reason", str2, jSONObject2);
        }
        LLII(this, "battle_pk_guide_click", jSONObject, jSONObject2, C915980Zwa.LJFF().xB0(), 8);
    }

    public final void LJJJJZ(long j, String str, boolean z) {
        LIZLLL = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        C0K04.LJFF("role_type", "inviter", jSONObject);
        LJIJJLI(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("reason", str, jSONObject2);
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        LLIIIZ("cancel_request", jSONObject, jSONObject2, new JSONObject(), false, C915980Zwa.LJFF().xB0());
    }

    public final void LJJLI(long j, String str, boolean z) {
        int i;
        MutableLiveData<Long> mutableLiveData;
        Long value;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("teammate_id", j, jSONObject);
        LJIJJLI(jSONObject, z);
        C0K04.LJFF("action", str, jSONObject);
        C0K04.LJFF("role_type", "inviter", jSONObject);
        C0K04.LJ("gift_id", C978520bZS.LJ(z), jSONObject);
        JSONArray jSONArray = new JSONArray();
        long jLongValue = 0;
        if (j != 0) {
            jSONArray.put(j);
        }
        C0K04.LJI("teammate_uids", jSONArray, jSONObject);
        if (z) {
            i = 6;
        } else {
            i = 0;
        }
        C0K04.LIZLLL(i, "invite_type", jSONObject);
        try {
            C0K04.LIZLLL(C915980Zwa.LJFF().RY(false).ordinal(), "match_status", jSONObject);
            C0K04.LIZLLL(C915980Zwa.LJFF().RY(true).ordinal(), "rematch_status", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("match_status read failed in logInvitePanelClick: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJIIL("livesdk_multi_match", C2188811AlT.LIZIZ(sbLIZ));
        }
        C969470bKr c969470bKr = LJJIFFI;
        if (c969470bKr != null && (mutableLiveData = c969470bKr.LIZLLL) != null && (value = mutableLiveData.getValue()) != null) {
            jLongValue = value.longValue();
        }
        C0K04.LJ("battle_id", jLongValue, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        C0K04.LJFF("action", str, jSONObject2);
        LLIIIJ("invite_panel_click", jSONObject, jSONObject2, new JSONObject(), false, C915980Zwa.LJFF().xB0());
    }

    public final void LJJLIIIIJ(EnumC974650bTD enumC974650bTD, EnumC919170a1j enumC919170a1j, long j) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("teammate_id", 0L, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJ("prepare_invite_duration", j, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject3);
        C0K04.LJFF("reason", enumC974650bTD.getType(), jSONObject3);
        LLIIIJ("invite_panel_show", jSONObject, jSONObject3, jSONObject2, false, enumC919170a1j);
    }

    public final void LJJLIIIJJI(int i, long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "invite_type", jSONObject);
        C0K04.LIZLLL(1, "team_id", jSONObject);
        C0K04.LJFF("role_type", "inviter", jSONObject);
        C0K04.LJ("teammate_id", j, jSONObject);
        LJIJJLI(jSONObject, C959180b4G.LIZ(Integer.valueOf(i)));
        JSONObject jSONObject2 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size() - 1, "invitee_count", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("cost", C158B.LIZ() - LIZJ, jSONObject3);
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        LLIIIZ("invite_failed", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
    }

    public final void LJLLI(int i, long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        LJIJJLI(jSONObject, C959180b4G.LIZ(Integer.valueOf(i)));
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "invitee", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        LLIIIZ("reject_failed", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
    }

    public final void LJLLJ(boolean z, long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        LJIJJLI(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "invitee", jSONObject2);
        C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size() - 1, "invitee_count", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        LLIIIZ("reply_failed", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
        LLIIIZ("accept_failed", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
    }

    public final void LJLLL(int i, long j, boolean z) {
        String str;
        LJI = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        LJIJJLI(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "invitee", jSONObject2);
        if (i == 0) {
            str = "normal";
        } else {
            str = "invite_each_other";
        }
        C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject2);
        C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size() - 1, "invitee_count", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        LLIIIZ("reply_request", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
        LLIIIZ("accept_request", jSONObject, jSONObject2, jSONObject3, false, C915980Zwa.LJFF().xB0());
    }

    public final void LLI(int i, long j, Long l) {
        long jLongValue;
        List<C954460awe> list;
        JSONObject jSONObject = new JSONObject();
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        c917350Zyn.getClass();
        C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
        if (i != 101) {
            if (i != 106) {
                if (i != 211) {
                    if (i != 109) {
                        if (i == 110) {
                            C0K04.LJFF("source", "end_live", jSONObject);
                            LLIIIILZ(this, "positive_finish_battle", jSONObject, 12);
                            return;
                        }
                        return;
                    }
                    C0K04.LJFF("source", "user_list_change", jSONObject);
                    C0K04.LJFF("user_list_change_source", "im_list_change", jSONObject);
                    if (C954660awy.LJIIIZ.length() > 0) {
                        C0K04.LJFF("user_list_change_source", "first_frame_time_out", jSONObject);
                    }
                    C0K04.LJ("leave_uid", j, jSONObject);
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    C0K04.LJ("message_id", jLongValue, jSONObject);
                    C969470bKr c969470bKr = LJJIFFI;
                    if (c969470bKr != null && (list = c969470bKr.LIZJ) != null) {
                        if (list.size() >= 2) {
                            C0K04.LJ("other_uid1", ((C954460awe) ListProtector.get(list, 1)).LJ, jSONObject);
                        }
                        if (list.size() == 4) {
                            C0K04.LJ("other_uid2", ((C954460awe) ListProtector.get(list, 2)).LJ, jSONObject);
                            C0K04.LJ("other_uid3", ((C954460awe) ListProtector.get(list, 3)).LJ, jSONObject);
                        }
                    }
                    LLIIIILZ(this, "abnormal_finish_battle", jSONObject, 12);
                    return;
                }
                C0K04.LJFF("source", "disconnect_pk", jSONObject);
                LLIIIILZ(this, "positive_finish_battle", jSONObject, 12);
                return;
            }
            LLIIIILZ(this, "normal_finish_battle", jSONObject, 12);
            return;
        }
        C0K04.LJFF("source", "disconnect_pk", jSONObject);
        LLIIIILZ(this, "positive_finish_battle", jSONObject, 12);
    }

    public static void LJJIII(long j, String str, boolean z, boolean z2) {
        Long lValueOf;
        if (j == 0) {
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(',');
            sbLIZ.append(currentUserId);
            LJJIJ(j, C2188811AlT.LIZIZ(sbLIZ), z, z2);
            return;
        }
        LJJIJ(j, str, z, z2);
    }

    public static void LJJIJ(long j, String str, boolean z, boolean z2) {
        long jLJJJJJL;
        long j2;
        int i;
        int i2;
        BattleSetting battleSettingLJIILIIL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJJIII;
        if (linkedHashMap.get(str) != null) {
            List<C974600bT8> list = (List) linkedHashMap.get(str);
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
            } else {
                jLJJJJJL = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(jLJJJJJL);
            sbLIZ.append(',');
            sbLIZ.append(currentUserId);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf22 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf22.LJIILIIL()) != null) {
                j2 = battleSettingLJIILIIL.startTimeMs;
            } else {
                j2 = 0;
            }
            boolean zEnableScoreTrack = LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableScoreTrack();
            for (C974600bT8 c974600bT8 : list) {
                if (c974600bT8.LIZ == j && c974600bT8.LIZIZ > 0) {
                    C974540bT2 c974540bT2 = LIZ;
                    if (zEnableScoreTrack) {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        if (j != 0) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        C0K04.LIZLLL(i2, "source", jSONObject);
                        C0K04.LIZLLL(1, "show", jSONObject);
                        C0K04.LJ("battle_id", jLJJJJJL, jSONObject2);
                        C0K04.LJ("user_id", currentUserId, jSONObject2);
                        C0K04.LJFF("distinct_key", strLIZIZ, jSONObject2);
                        if (c974600bT8.LIZ != 0) {
                            C0K04.LJFF("log_id", str, jSONObject2);
                        }
                        long jLIZJ = C963140bAe.LIZJ() - c974600bT8.LIZJ;
                        C0K04.LJ("send_success_delay", jLIZJ, jSONObject2);
                        C0K04.LJ("send_success_delay", jLIZJ, jSONObject3);
                        long j3 = c974600bT8.LIZJ - j2;
                        long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
                        C0K04.LJ("send_success_pk_time_sec", j3 / j4, jSONObject2);
                        C0K04.LJ("send_success_pk_time_sec", (c974600bT8.LIZJ - j2) / j4, jSONObject3);
                        long jLIZJ2 = ((long) 301) - ((C963140bAe.LIZJ() - j2) / j4);
                        if (jLIZJ2 < 0) {
                            jLIZJ2 = 0;
                        }
                        C0K04.LJ("update_score_pk_time_sec", jLIZJ2, jSONObject2);
                        C0K04.LIZLLL(z2 ? 1 : 0, "is_compensation", jSONObject2);
                        C0K04.LIZLLL(C20483515Dd.LIZ.LJ() ? 1 : 0, "client_downsampling", jSONObject2);
                        C0K04.LJ("battle_start_timestamp", j2, jSONObject2);
                        C0K04.LJ("send_request_timestamp", c974600bT8.LIZLLL, jSONObject2);
                        C0K04.LJ("send_success_timestamp", c974600bT8.LIZJ, jSONObject2);
                        C0K04.LJ("receive_im_timestamp", c974600bT8.LJ, jSONObject2);
                        C0K04.LJ("im_publish_timestamp", c974600bT8.LJFF, jSONObject2);
                        C0K04.LJ("update_score_timestamp", c974600bT8.LJI, jSONObject2);
                        C0K04.LJ("send_request_pk_remain_time", c974600bT8.LJIIJJI, jSONObject2);
                        C0K04.LJ("send_success_pk_remain_time", c974600bT8.LJIIL, jSONObject2);
                        C0K04.LJ("receive_im_pk_remain_time", c974600bT8.LJIILIIL, jSONObject2);
                        C0K04.LJ("update_score_pk_remain_time", c974600bT8.LJIILJJIL, jSONObject2);
                        long jLJJIIJZLJL = LJJIIJZLJL(c974600bT8.LJII, c974600bT8.LJIIIIZZ);
                        long jLJJIIJZLJL2 = LJJIIJZLJL(c974600bT8.LJII, c974600bT8.LJIIIZ);
                        long jLJJIIJZLJL3 = LJJIIJZLJL(c974600bT8.LJIIIZ, c974600bT8.LJIIJ);
                        long jLJJIIJZLJL4 = LJJIIJZLJL(c974600bT8.LJIIIIZZ, c974600bT8.LJIIJ);
                        C0K04.LJ("send_request_to_success_cost", jLJJIIJZLJL, jSONObject3);
                        C0K04.LJ("send_request_to_success_cost", jLJJIIJZLJL, jSONObject2);
                        C0K04.LJ("send_request_to_receive_im_cost", jLJJIIJZLJL2, jSONObject3);
                        C0K04.LJ("send_request_to_receive_im_cost", jLJJIIJZLJL2, jSONObject2);
                        C0K04.LJ("receive_im_to_update_score_cost", jLJJIIJZLJL3, jSONObject3);
                        C0K04.LJ("receive_im_to_update_score_cost", jLJJIIJZLJL3, jSONObject2);
                        C0K04.LJ("send_success_to_update_score_cost", jLJJIIJZLJL4, jSONObject2);
                        C0K04.LJ("send_success_to_update_score_cost", jLJJIIJZLJL4, jSONObject3);
                        C970340bMG.LJIIJ("audience", jSONObject, jSONObject2);
                        C970340bMG.LJIIJJI(EnumC970360bMI.SENDER, "battle_score_update", jSONObject, jSONObject2, jSONObject3);
                    } else {
                        zEnableScoreTrack = false;
                        JSONObject jSONObject4 = new JSONObject();
                        JSONObject jSONObject5 = new JSONObject();
                        C0K04.LJ("user_id", currentUserId, jSONObject4);
                        C0K04.LJFF("distinct_key", strLIZIZ, jSONObject4);
                        if (j != 0) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        C0K04.LIZLLL(i, "source", jSONObject4);
                        C0K04.LJ("send_success_delay", C963140bAe.LIZJ() - c974600bT8.LIZJ, jSONObject4);
                        C0K04.LJ("send_success_delay", C963140bAe.LIZJ() - c974600bT8.LIZJ, jSONObject5);
                        long j5 = c974600bT8.LIZJ - j2;
                        long j6 = LSPassThroughRecordSizeConfig.DEFAULT;
                        C0K04.LJ("send_success_pk_time_sec", j5 / j6, jSONObject4);
                        C0K04.LJ("send_success_pk_time_sec", (c974600bT8.LIZJ - j2) / j6, jSONObject5);
                        long jLIZJ3 = ((long) 301) - ((C963140bAe.LIZJ() - j2) / j6);
                        if (jLIZJ3 < 0) {
                            jLIZJ3 = 0;
                        }
                        C0K04.LJ("update_score_pk_time_sec", jLIZJ3, jSONObject4);
                        C0K04.LIZLLL(1, "show", jSONObject4);
                        C0K04.LIZLLL(z2 ? 1 : 0, "is_compensation", jSONObject4);
                        C0K04.LIZLLL(C20483515Dd.LIZ.LJ() ? 1 : 0, "client_downsampling", jSONObject4);
                        if (c974600bT8.LIZ != 0) {
                            C0K04.LJFF("log_id", str, jSONObject4);
                        }
                        if (z) {
                            LLIIZ(c974540bT2, "battle_score_update", jSONObject4, jSONObject4, jSONObject5, false, null, 48);
                        } else {
                            C974480bSw.LIZ.LJJIIJZLJL("battle_score_update", jSONObject4, jSONObject4, jSONObject5);
                        }
                    }
                    c974600bT8.LIZIZ--;
                }
            }
            Iterator it2 = list.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                i3 += ((C974600bT8) it2.next()).LIZIZ;
            }
            if (i3 == 0) {
                LJJIII.remove(str);
            }
        }
    }

    public static void LJLJLLL(int i, long j, String str, boolean z) {
        C974540bT2 c974540bT2 = LIZ;
        LJFF = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "invite_type", jSONObject);
        C0K04.LJ("battle_id", j, jSONObject);
        C0K04.LJ("offline_uid", 0L, jSONObject);
        LJIJJLI(jSONObject, C959180b4G.LIZ(Integer.valueOf(i)));
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("reason", str, jSONObject2);
        C0K04.LJFF("role_type", "invitee", jSONObject2);
        if (z && LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
            C0K04.LJFF("is_auto_reject", "1", jSONObject2);
        }
        c974540bT2.LLIIIZ("reject_request", jSONObject, jSONObject2, new JSONObject(), false, C915980Zwa.LJFF().xB0());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LLIIIILZ(C974540bT2 c974540bT2, String str, JSONObject jSONObject, int i) {
        boolean z;
        boolean z2;
        long jLJJJJJL;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        long jLongValue = 0;
        if (z) {
            c974540bT2.getClass();
            LJIIZILJ(jSONObject);
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
            } else {
                jLJJJJJL = 0;
            }
            C0K04.LJ("battle_id", jLJJJJJL, jSONObject);
        } else {
            c974540bT2.getClass();
        }
        C0K04.LJFF("event_id", str, jSONObject);
        Iterator it2 = ((ArrayList) C07PO.LIZ).iterator();
        while (it2.hasNext()) {
            jLongValue += ((Number) it2.next()).longValue();
        }
        int size = ((ArrayList) C07PO.LIZ).size();
        if (size < 1) {
            size = 1;
        }
        C0K04.LJ("average_bitrate", jLongValue / ((long) size), jSONObject);
        C0K04.LIZLLL(C915980Zwa.LJII().LLFFF() ? 1 : 0, "is_sdk", jSONObject);
        if (C1078990eBV.LIZ("ttlive_client_match_interrupt_monitor", str)) {
            C1CC2.LJI("ttlive_client_match_interrupt_monitor", jSONObject, null, jSONObject);
            if (C915980Zwa.LJII().LLILZLL(true).size() <= 2 && Intrinsics.LJFF(jSONObject.optString("match_type"), "1v1")) {
                z2 = false;
            } else {
                z2 = true;
            }
            C962910bAH.LIZJ(str, jSONObject, null, null, z2, 1, true);
        }
        String strOptString = "";
        switch (str.hashCode()) {
            case -1741616610:
                if (str.equals("positive_finish_battle")) {
                    C0K04.LIZLLL(1, "is_positive_finish", jSONObject);
                    strOptString = "positive_finish_battle";
                }
                break;
            case -1551240937:
                if (str.equals("app_abnormal_exit")) {
                    C0K04.LIZLLL(1, "is_app_exit", jSONObject);
                    strOptString = jSONObject.optString("app_exit_reason", "");
                }
                break;
            case 200812077:
                if (str.equals("abnormal_finish_battle")) {
                    C0K04.LIZLLL(1, "is_abnormal_finish", jSONObject);
                    strOptString = jSONObject.optString("source", "");
                }
                break;
            case 1086223500:
                if (str.equals("normal_finish_battle")) {
                    C0K04.LIZLLL(1, "is_normal_finish", jSONObject);
                    strOptString = "normal_finish";
                }
                break;
        }
        if (strOptString.length() != 0) {
            C0K04.LJFF("finish_reason", strOptString, jSONObject);
            C0K04.LJFF("event_id", "battle_finished_timing", jSONObject);
            C1CC2.LJI("ttlive_client_match_interrupt_monitor", new JSONObject(), null, jSONObject);
            C962910bAH.LIZJ(str, jSONObject, null, null, !Intrinsics.LJFF(jSONObject.optString("match_type"), "1v1"), 1, false);
        }
    }

    public static void LLIL(int i, int i2, int i3, int i4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("screen_height", i);
            jSONObject.put("top", i2);
            jSONObject.put("width", i3);
            jSONObject.put("link_mic_height", i4);
            jSONObject.put("sum", i2 + i4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("room_id", LJJIIZI());
            C1CC2.LJI("ttlive_client_co_host_window_size_monitor", new JSONObject(), jSONObject, jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJJZI(long j, Throwable th, boolean z, EnumC919170a1j enumC919170a1j) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        LJIJJLI(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        LJJI(th, jSONObject, jSONObject2);
        LLIIIZ("cancel_failed", jSONObject, jSONObject2, jSONObject3, false, enumC919170a1j);
    }

    public final void LJJJLIIL(String str, C470590Icr<Unit> c470590Icr, boolean z, EnumC919170a1j enumC919170a1j) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("logid", c470590Icr.LIZIZ, jSONObject);
        LJIJJLI(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject2);
        C0K04.LJFF("reason", str, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("cost", C158B.LIZ() - LIZLLL, jSONObject3);
        LLIIIZ("cancel_succeed", jSONObject, jSONObject2, jSONObject3, false, enumC919170a1j);
    }

    public final void LJJL(long j, boolean z, int i, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(z ? 1 : 0, "cut_short", jSONObject);
        C0K04.LIZLLL(i, "source", jSONObject);
        C0K04.LJ("battle_id", j, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (th != null) {
            LJJI(th, jSONObject, jSONObject2);
        }
        LJJIFFI(jSONObject);
        LLIIIJ("battle_finish_failed", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    public final void LJJLIIIJLLLLLLLZ(long j, boolean z, int i, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(z ? 1 : 0, "cut_short", jSONObject);
        C0K04.LIZLLL(i, "source", jSONObject);
        C0K04.LJ("battle_id", j, jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (th != null) {
            LJJI(th, jSONObject, jSONObject2);
        }
        LJJIFFI(jSONObject);
        LLIIIJ("leave_linkmic_failed", jSONObject, jSONObject2, jSONObject3, true, C915980Zwa.LJFF().xB0());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIJ(long r13, boolean r15, java.lang.String r16, X.C470590Icr<webcast.api.battle.BattleLeaveLinkmicResponse.ResponseData> r17) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974540bT2.LJJLIIJ(long, boolean, java.lang.String, X.0Icr):void");
    }

    public static void LJJIJLIJ(EnumC975260bUC enumC975260bUC, int i, long j, int i2, EnumC919170a1j enumC919170a1j) {
        String str;
        EnumC919170a1j enumC919170a1jXB0 = enumC919170a1j;
        C974540bT2 c974540bT2 = LIZ;
        if (LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJFF("reason", enumC975260bUC.getValue(), jSONObject);
            C0K04.LJFF("role_type", "invitee", jSONObject);
            C0K04.LIZLLL(i, "invite_type", jSONObject);
            C0K04.LJ("battle_id", j, jSONObject);
            C0K04.LIZLLL(i2, "accept_scene", jSONObject);
            LJIJJLI(jSONObject, C959180b4G.LIZ(Integer.valueOf(i)));
            C0K04.LJFF("reason", enumC975260bUC.getValue(), jSONObject2);
            C0K04.LJFF("role_type", "invitee", jSONObject2);
            if (i2 == 0) {
                str = "normal";
            } else {
                str = "invite_each_other";
            }
            C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject2);
            if (enumC919170a1jXB0 == null) {
                enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            }
            c974540bT2.LLIIIZ("accept_request_blocked", jSONObject, jSONObject2, new JSONObject(), false, enumC919170a1jXB0);
        }
    }

    public static void LJJLIIIJILLIZJL(EnumC977680bY6 enumC977680bY6, int i, boolean z, EnumC919170a1j enumC919170a1j, int i2) {
        EnumC919170a1j enumC919170a1jXB0 = enumC919170a1j;
        C974540bT2 c974540bT2 = LIZ;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            enumC919170a1jXB0 = null;
        }
        if (LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJFF("reason", enumC977680bY6.getValue(), jSONObject);
            C0K04.LJFF("role_type", "inviter", jSONObject);
            C0K04.LIZLLL(i, "invite_type", jSONObject);
            LJIJJLI(jSONObject, z);
            try {
                C0K04.LIZLLL(C915980Zwa.LJFF().RY(false).ordinal(), "match_status", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("match_status read failed: ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJIIL("livesdk_multi_match", C2188811AlT.LIZIZ(sbLIZ));
            }
            C0K04.LJFF("reason", enumC977680bY6.getValue(), jSONObject2);
            C0K04.LJFF("role_type", "inviter", jSONObject2);
            C0K04.LJFF("action", "invite", jSONObject2);
            if (enumC919170a1jXB0 == null) {
                enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            }
            c974540bT2.LLIIIZ("invite_request_blocked", jSONObject, jSONObject2, new JSONObject(), false, enumC919170a1jXB0);
        }
    }

    public static void LJLL(EnumC975270bUD enumC975270bUD, int i, long j, String str, EnumC919170a1j enumC919170a1j) {
        EnumC919170a1j enumC919170a1jXB0 = enumC919170a1j;
        C974540bT2 c974540bT2 = LIZ;
        if (LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJFF("reason", enumC975270bUD.getValue(), jSONObject);
            C0K04.LJFF("role_type", "invitee", jSONObject);
            C0K04.LIZLLL(i, "invite_type", jSONObject);
            C0K04.LJ("battle_id", j, jSONObject);
            C0K04.LJFF("reject_reason", str, jSONObject);
            LJIJJLI(jSONObject, C959180b4G.LIZ(Integer.valueOf(i)));
            C0K04.LJFF("reason", enumC975270bUD.getValue(), jSONObject2);
            C0K04.LJFF("role_type", "invitee", jSONObject2);
            if (enumC919170a1jXB0 == null) {
                enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            }
            c974540bT2.LLIIIZ("reject_request_blocked", jSONObject, jSONObject2, new JSONObject(), false, enumC919170a1jXB0);
        }
    }

    public final void LJLLILLLL(int i, long j, String str, C470590Icr<Unit> c470590Icr, EnumC919170a1j enumC919170a1j) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "invite_type", jSONObject);
        C0K04.LJ("battle_id", j, jSONObject);
        C0K04.LJFF("logid", c470590Icr.LIZIZ, jSONObject);
        LJIJJLI(jSONObject, C959180b4G.LIZ(Integer.valueOf(i)));
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("reason", str, jSONObject2);
        C0K04.LJFF("role_type", "invitee", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("cost", C158B.LIZ() - LJFF, jSONObject3);
        LLIIIZ("reject_succeed", jSONObject, jSONObject2, jSONObject3, false, enumC919170a1j);
    }

    public final void LJLZ(long j, long j2, int i, String str, EnumC919170a1j enumC919170a1j) {
        String strLIZ;
        String str2 = str;
        if (j <= 0) {
            return;
        }
        long j3 = LJJIZ;
        if (j3 > 0 && j3 == j) {
            return;
        }
        LJJIL = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        C0K04.LJ("channel_id", j2, jSONObject);
        C0K04.LIZLLL(i, "method_scene_int", jSONObject);
        if (enumC919170a1j == null) {
            strLIZ = "none";
        } else {
            EnumC919170a1j.Companion.getClass();
            strLIZ = C917350Zyn.LIZ(enumC919170a1j);
        }
        C0K04.LJFF("sei_battle_type", strLIZ, jSONObject);
        C0K04.LJFF("current_state", C915980Zwa.LJFF().RY(false).name(), jSONObject);
        C0K04.LJFF("current_thread", C786410Ut5.u3().getName(), jSONObject);
        if (str2 == null) {
            str2 = "";
        }
        C0K04.LJFF("sei_string", str2, jSONObject);
        C0K04.LIZLLL(LiveMatchAudienceIdentifyOptSettings.INSTANCE.isArmiesFallBackEnable() ? 1 : 0, "heart_beat_optz", jSONObject);
        if (LJJIZ != j) {
            C0K04.LIZLLL(1, "is_first_sei", jSONObject);
        } else {
            C0K04.LIZLLL(0, "is_first_sei", jSONObject);
        }
        LJIJJLI(jSONObject, false);
        LJJIZ = j;
        LLIIZ(this, "sei_identify_start", jSONObject, null, null, false, enumC919170a1j, 28);
    }

    public static void LLII(C974540bT2 c974540bT2, String str, JSONObject jSONObject, JSONObject jSONObject2, EnumC919170a1j enumC919170a1j, int i) {
        JSONObject jSONObject3;
        boolean z;
        JSONObject jSONObject4 = jSONObject2;
        if ((i & 4) != 0) {
            jSONObject4 = new JSONObject();
        }
        if ((i & 8) != 0) {
            jSONObject3 = new JSONObject();
        } else {
            jSONObject3 = null;
        }
        if ((i & 16) != 0) {
            enumC919170a1j = null;
        }
        c974540bT2.getClass();
        LJIILLIIL(jSONObject);
        if (enumC919170a1j != null) {
            EnumC919170a1j.Companion.getClass();
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1j), jSONObject);
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1j), jSONObject4);
        } else {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            c917350Zyn.getClass();
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(C915980Zwa.LJFF().xB0()), jSONObject4);
        }
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LJFF("event_id", str, jSONObject4);
        LJIJJ(jSONObject3, jSONObject);
        if (C20483515Dd.LIZ.LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("eventId:");
            sbLIZ.append(str);
            sbLIZ.append(" extra:");
            sbLIZ.append(jSONObject);
            sbLIZ.append(" category:");
            sbLIZ.append(jSONObject4);
            C944240agA.LJFF("livesdk_multi_match", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C1078990eBV.LIZ("ttlive_client_anchor_match_entrance_monitor", str)) {
            C1CC2.LJI("ttlive_client_anchor_match_entrance_monitor", jSONObject4, jSONObject3, jSONObject);
            if (C915980Zwa.LJII().LLILZLL(true).size() <= 2 && Intrinsics.LJFF(jSONObject.optString("match_type"), "1v1")) {
                z = false;
            } else {
                z = true;
            }
            C962910bAH.LIZJ(str, jSONObject, jSONObject4, jSONObject3, z, 1, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122 A[PHI: r0
      0x0122: PHI (r0v21 com.bytedance.android.livesdk.model.message.battle.BattleSetting) = 
      (r0v19 com.bytedance.android.livesdk.model.message.battle.BattleSetting)
      (r0v30 com.bytedance.android.livesdk.model.message.battle.BattleSetting)
     binds: [B:67:0x0147, B:59:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI(long r20, java.lang.Long r22, int r23, com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r24, com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974540bT2.LJJJJLI(long, java.lang.Long, int, com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse, boolean):void");
    }

    public final void LJJLIIIJJIZ(int i, long j, C470590Icr<MultiInviteResponse> c470590Icr, long j2, String str, long j3) {
        long jLongValue;
        Long l;
        long jLJJJJJ = j;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(i, "invite_type", jSONObject);
        C0K04.LJ("teammate_id", jLJJJJJ, jSONObject);
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        if (enumC919170a1jXB0 == EnumC919170a1j.MATCH_TYPE_2V2) {
            C0K04.LIZLLL(1, "team_id", jSONObject);
        } else {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJJJJ = interfaceC973730bRjYf2.LJJJJJ();
            }
            C0K04.LJ("team_id", jLJJJJJ, jSONObject);
        }
        if (c470590Icr == null) {
            C0K04.LJ("battle_id", j2, jSONObject);
            C0K04.LJFF("logid", str, jSONObject);
            C0K04.LJ("invite_message_create_cost", j3 - LIZJ, jSONObject2);
        } else {
            MultiInviteResponse multiInviteResponse = c470590Icr.data;
            if (multiInviteResponse != null && (l = multiInviteResponse.battleId) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C0K04.LJ("battle_id", jLongValue, jSONObject);
            C0K04.LJFF("logid", c470590Icr.LIZIZ, jSONObject);
            C0K04.LJ("invite_message_create_cost", c470590Icr.extra.now - LIZJ, jSONObject2);
        }
        C0K04.LJFF("role_type", "inviter", jSONObject);
        LJIJJLI(jSONObject, C959180b4G.LIZ(Integer.valueOf(i)));
        C0K04.LJ("cost", C158B.LIZ() - LIZJ, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJFF("role_type", "inviter", jSONObject3);
        C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size() - 1, "invitee_count", jSONObject3);
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        LLIIIZ("invite_succeed", jSONObject, jSONObject3, jSONObject2, false, enumC919170a1jXB0);
    }

    public final void LLFF(long j, long j2, List<TeamUsersInfo> list, int i, List<BattleTeamUserArmies> list2, boolean z) {
        Long lValueOf;
        long jLongValue;
        LJJIJL = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("duration", LJJIJL - LJIILL, jSONObject);
        C0K04.LJ("remain_time", j, jSONObject);
        C0K04.LJ("remainTime", j, jSONObject);
        C0K04.LJ("battle_id", j2, jSONObject);
        if (list != null) {
            for (TeamUsersInfo teamUsersInfo : list) {
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 != null && teamUsersInfo.teamId == interfaceC973730bRjYf2.LJJJJJ()) {
                    for (Long l : teamUsersInfo.userIds) {
                        long jLJJIIZ = LJJIIZ();
                        if (l == null || l.longValue() != jLJJIIZ) {
                            C0K04.LJ("teammate_id", l.longValue(), jSONObject);
                        }
                    }
                }
            }
        }
        C0K04.LIZLLL(1 ^ (z ? 1 : 0), "stage", jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<BattleTeamUserArmies> it2 = list2.iterator();
        while (true) {
            lValueOf = null;
            if (it2.hasNext()) {
                BattleTeamUserArmies next = it2.next();
                Long l2 = next.teamId;
                InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf22 != null) {
                    lValueOf = Long.valueOf(interfaceC973730bRjYf22.LJJJJJ());
                }
                if (Intrinsics.LJFF(l2, lValueOf)) {
                    C0K04.LJ("left_team_score", next.teamTotalScore, jSONObject);
                } else {
                    C0K04.LJ("right_team_score", next.teamTotalScore, jSONObject);
                }
                List<BattleTeamUser> list3 = next.teamUsers;
                if (list3 != null) {
                    for (BattleTeamUser battleTeamUser : list3) {
                        Long l3 = battleTeamUser.userId;
                        long jLongValue2 = 0;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Long lValueOf2 = Long.valueOf(jLongValue);
                        Long l4 = battleTeamUser.score;
                        if (l4 != null) {
                            jLongValue2 = l4.longValue();
                        }
                        linkedHashMap.put(lValueOf2, Long.valueOf(jLongValue2));
                    }
                }
            } else {
                try {
                    break;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("Match Monitor", "logWatchMatchStart", e);
                }
            }
        }
        C0K04.LJFF("anchor_scores", new Gson().LJIILL(linkedHashMap), jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF(Scene.SCENE_SERVICE, C970460bMS.LIZ(i), jSONObject2);
        C0K04.LJ("identify_cost", LJJIJL - LJIILL, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0K04.LJ("duration", LJJIJL - LJIILL, jSONObject3);
        LJJIFFI(jSONObject);
        Map<String, String> map = C973660bRc.LJLJLLL;
        InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf23 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf23.LJJL());
        }
        map.put("channel_id", String.valueOf(lValueOf));
        LLIIZ(this, "battle_start", jSONObject, jSONObject2, jSONObject3, false, null, 48);
    }

    public final void LLIIIJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z, EnumC919170a1j enumC919170a1j) {
        boolean z2;
        Boolean boolValueOf;
        if (z) {
            LJIIZILJ(jSONObject);
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C0K04.LJFF("role_type", "inviter", jSONObject2);
            } else {
                C0K04.LJFF("role_type", "invitee", jSONObject2);
            }
        } else {
            LJIILLIIL(jSONObject);
        }
        if (enumC919170a1j != null) {
            EnumC919170a1j.Companion.getClass();
            C0K04.LJFF("match_type", C917350Zyn.LIZ(enumC919170a1j), jSONObject);
            C0K04.LJFF("match_type", C917350Zyn.LIZ(enumC919170a1j), jSONObject2);
            C0K04.LIZLLL(enumC919170a1j.getType(), "match_type_int", jSONObject);
        } else {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            c917350Zyn.getClass();
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(C915980Zwa.LJFF().xB0()), jSONObject2);
        }
        LJIL(jSONObject, jSONObject2);
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LJFF("event_id", str, jSONObject2);
        LJIJJ(jSONObject3, jSONObject);
        if (C20483515Dd.LIZ.LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("eventId:");
            sbLIZ.append(str);
            sbLIZ.append(" extra:");
            sbLIZ.append(jSONObject);
            sbLIZ.append(" category:");
            sbLIZ.append(jSONObject2);
            C944240agA.LJFF("livesdk_multi_match", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C1078990eBV.LIZ("ttlive_client_anchor_match_monitor", str)) {
            C1CC2.LJI("ttlive_client_anchor_match_monitor", jSONObject2, jSONObject3, jSONObject);
            if (C915980Zwa.LJII().LLILZLL(true).size() <= 2 && Intrinsics.LJFF(jSONObject.optString("match_type"), "1v1")) {
                z2 = false;
            } else {
                z2 = true;
            }
            C962910bAH.LIZJ(str, jSONObject, jSONObject2, jSONObject3, z2, 1, true);
        }
    }

    public final void LLIIIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z, EnumC919170a1j enumC919170a1j) {
        if (z) {
            LJIIZILJ(jSONObject);
        } else {
            LJIILLIIL(jSONObject);
        }
        if (enumC919170a1j != null) {
            EnumC919170a1j.Companion.getClass();
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1j), jSONObject);
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1j), jSONObject2);
        } else {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            c917350Zyn.getClass();
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
            C0K04.LJFF("match_type", C917350Zyn.LIZJ(C915980Zwa.LJFF().xB0()), jSONObject2);
        }
        LJIL(jSONObject, jSONObject2);
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LJFF("event_id", str, jSONObject2);
        LJIJJ(jSONObject3, jSONObject);
        if (C1078990eBV.LIZ("ttlive_client_anchor_match_monitor", str)) {
            C1CC2.LJI("ttlive_client_anchor_match_monitor", jSONObject2, jSONObject3, jSONObject);
            boolean z2 = true;
            if (C915980Zwa.LJII().LLILZLL(true).size() <= 2 && Intrinsics.LJFF(jSONObject.optString("match_type"), "1v1")) {
                z2 = false;
            }
            C962910bAH.LIZJ(str, jSONObject, jSONObject2, jSONObject3, z2, 1, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static void LJLLLL(boolean z, long j, C470590Icr c470590Icr, boolean z2, String str, long j2, int i) {
        boolean z3;
        BattleAcceptResponse.ResponseData responseData;
        long j3 = j2;
        String str2 = str;
        C974540bT2 c974540bT2 = LIZ;
        Boolean boolValueOf = null;
        if ((i & 4) != 0) {
            c470590Icr = null;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            z4 = false;
        }
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 32) != 0) {
            j3 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (c470590Icr != null && (responseData = (BattleAcceptResponse.ResponseData) c470590Icr.data) != null) {
            boolValueOf = Boolean.valueOf(responseData.isLastAccept);
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        if (c470590Icr == null) {
            C0K04.LJFF("logid", str2, jSONObject);
            C0K04.LJ("accept_message_create_cost", j3 - LJI, jSONObject2);
            z3 = z4;
        } else {
            C0K04.LJFF("logid", c470590Icr.LIZIZ, jSONObject);
            C0K04.LJ("accept_message_create_cost", c470590Icr.extra.now - LJI, jSONObject2);
            z3 = zLJJJI;
        }
        C098J<Long, Integer> c098j = LJJIIZ;
        Integer num = c098j.get(Long.valueOf(j));
        ?? r15 = z3;
        if (num != null) {
            r15 = z3;
            if (num.intValue() == 1) {
                r15 = 1;
            }
        }
        C0K04.LJ("battle_id", j, jSONObject);
        LJIJJLI(jSONObject, z);
        C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size() - 1, "invitee_count", jSONObject3);
        C0K04.LJFF("role_type", "invitee", jSONObject3);
        C0K04.LIZLLL(r15, "is_last_accept", jSONObject3);
        c098j.put(Long.valueOf(j), Integer.valueOf((int) r15));
        C0K04.LJ("cost", C158B.LIZ() - LJI, jSONObject2);
        c974540bT2.LLIIIZ("reply_succeed", jSONObject, jSONObject3, jSONObject2, false, C915980Zwa.LJFF().xB0());
        C0K04.LJ("rematch_count", LJJI, jSONObject);
        c974540bT2.LLIIIZ("accept_succeed", jSONObject, jSONObject3, jSONObject2, false, C915980Zwa.LJFF().xB0());
    }

    public final void LJZI(long j, long j2, boolean z, int i, boolean z2, boolean z3, EnumC919170a1j enumC919170a1j) {
        if (j <= 0) {
            return;
        }
        long j3 = LJJJ;
        if (j3 > 0 && j3 == j) {
            return;
        }
        LJJJ = j;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("battle_id", j, jSONObject);
        C0K04.LJ("channel_id", j2, jSONObject);
        C0K04.LJ("server_battle_id", j, jSONObject);
        C0K04.LIZLLL(i, "method_scene_int", jSONObject);
        if (C954660awy.LJIILIIL > 0 && !z2) {
            C0K04.LJ("cohost_to_match_enter_room_duration", C158B.LIZ() - C954660awy.LJIILIIL, jSONObject);
            C0K04.LJIIIZ(jSONObject, "isChangePosition", z3);
        }
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(LiveStartEnterRoomTimeStampForMatch.class);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0 && !z2) {
                C0K04.LJ("match_enter_room_duration", C158B.LIZ() - jLongValue, jSONObject);
            }
        }
        C974450bSt c974450bSt = C973890bRz.LIZ;
        if (c974450bSt.LJJIJLIJ > 0 && z2) {
            C0K04.LJ("cohost_to_match_open_duration", C158B.LIZ() - c974450bSt.LJJIJLIJ, jSONObject);
            C0K04.LJIIIZ(jSONObject, "isChangePosition", z3);
        }
        C954660awy.LJIILIIL = 0L;
        c974450bSt.LJJIJLIJ = 0L;
        C0K04.LJIIIZ(jSONObject, "hit_2v2_opt", z);
        C0K04.LJFF("current_thread", C786410Ut5.u3().getName(), jSONObject);
        C0K04.LJFF("current_state", C915980Zwa.LJFF().RY(false).name(), jSONObject);
        C0K04.LIZLLL(LiveMatchAudienceIdentifyOptSettings.INSTANCE.isArmiesFallBackEnable() ? 1 : 0, "heart_beat_optz", jSONObject);
        LJIJJLI(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (LJJIL > 0) {
            C0K04.LJ("duration", C158B.LIZ() - LJJIL, jSONObject3);
        }
        LLIIZ(this, "sei_identify_succeed", jSONObject, jSONObject2, jSONObject3, false, enumC919170a1j, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLIIZ(X.C974540bT2 r12, java.lang.String r13, org.json.JSONObject r14, org.json.JSONObject r15, org.json.JSONObject r16, boolean r17, X.EnumC919170a1j r18, int r19) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974540bT2.LLIIZ(X.0bT2, java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, boolean, X.0a1j, int):void");
    }
}
