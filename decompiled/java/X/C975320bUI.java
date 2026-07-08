package X;

import com.bytedance.android.livesdk.dataChannel.LiveStartEnterRoomTimeStampForMatch;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveSpeedChallengeExtraMonitorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeSyncSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bUI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975320bUI extends C0K04 {
    public static final JSONObject LIZ = new JSONObject();

    public static final void LJIIL(JSONObject jSONObject) throws JSONException {
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(LiveStartEnterRoomTimeStampForMatch.class);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                C0K04.LJ("watch_live_seconds", (C158B.LIZ() - jLongValue) / 1000, jSONObject);
            }
        }
        Iterator<String> itKeys = LIZ.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, LIZ.opt(next));
        }
    }

    public static void LJIILL(String str, JSONObject jSONObject) {
        C974480bSw.LIZ.LJIILL(jSONObject, C973890bRz.LIZ);
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LJIIIZ(jSONObject, "is_time_sync", MatchTimeSyncSetting.INSTANCE.getValue());
        if (C915980Zwa.LJII().LLFFF()) {
            C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size(), "anchors_count", jSONObject);
        } else {
            C0K04.LIZLLL(2, "anchors_count", jSONObject);
        }
        C1CC2.LJIIIIZZ("ttlive_client_anchor_match_bonus_monitor", 0, jSONObject);
    }

    public static void LJIILLIIL(String str, JSONObject jSONObject) {
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_client_audience_match_bonus_monitor")) {
            C974480bSw.LIZ.LJIILL(jSONObject, C973890bRz.LIZ);
            C0K04.LJFF("event_id", str, jSONObject);
            C0K04.LJIIIZ(jSONObject, "is_time_sync", true);
            if (C915980Zwa.LJII().LLFFF()) {
                C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size(), "anchors_count", jSONObject);
            } else {
                C0K04.LIZLLL(2, "anchors_count", jSONObject);
            }
            C1CC2.LJIIIIZZ("ttlive_client_audience_match_bonus_monitor", 0, jSONObject);
        }
    }

    public static void LJIIZILJ(String str, JSONObject jSONObject) {
        if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableBonusTrack()) {
            C0K04.LJFF("event_id", str, jSONObject);
            C1CC2.LJIIIIZZ("ttlive_client_match_bonus_sender_monitor", 0, jSONObject);
        }
    }

    public static final void LJIIJJI(String str, long j, JSONObject jSONObject) {
        if (LiveSpeedChallengeExtraMonitorSetting.INSTANCE.getValue()) {
            C0K04.LJ("match_left_time", j, jSONObject);
            C0K04.LJFF("pk_task_type", str, jSONObject);
            C0K04.LIZLLL(C915980Zwa.LJFF().xB0().getType(), "battle_type", jSONObject);
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            c917350Zyn.getClass();
            C0K04.LJFF("match_type", C917350Zyn.LIZ(enumC919170a1jXB0), jSONObject);
            C0K04.LJFF("both_guest_cnt", String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size()), jSONObject);
        }
        LJIIJ(jSONObject, str, null, 1020);
    }

    public static void LJIIJ(JSONObject jSONObject, String str, Integer num, int i) {
        long currentUserId;
        long jLJJJJJL;
        long ownerUserId;
        long jLJJL;
        int i2;
        int i3;
        BattleSetting battleSettingLJIILIIL;
        Integer numValueOf = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        long jLJJJJJL2 = 0;
        if ((i & 8) != 0) {
            currentUserId = UserService.getInstance().user().getCurrentUserId();
        } else {
            currentUserId = 0;
        }
        int i4 = 0;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
        } else {
            jLJJJJJL = 0;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        C0K04.LJ("battle_id", jLJJJJJL, jSONObject);
        C0K04.LJ("current_user_id", currentUserId, jSONObject);
        if (Room.isValid(room) && room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        C0K04.LJ("current_anchor_id", ownerUserId, jSONObject);
        if (interfaceC973730bRjYf2 != null) {
            jLJJL = interfaceC973730bRjYf2.LJJL();
        } else {
            jLJJL = 0;
        }
        C0K04.LJ("channel_id", jLJJL, jSONObject);
        C0K04.LIZLLL(listLLILZLL.size(), "linked_count", jSONObject);
        JSONArray jSONArray = new JSONArray();
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().LJ);
        }
        C0K04.LJI("uid_list", jSONArray, jSONObject);
        if (str != null && str.length() != 0) {
            C0K04.LJFF("pk_task_type", str, jSONObject);
        }
        if (num != null) {
            C0K04.LIZLLL(num.intValue(), "pk_task_type_num", jSONObject);
        }
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        c917350Zyn.getClass();
        C0K04.LJFF("match_type", C917350Zyn.LIZ(enumC919170a1jXB0), jSONObject);
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            jLJJJJJL2 = interfaceC973730bRjYf22.LJJJJJL();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jLJJJJJL2);
        sbLIZ.append('_');
        sbLIZ.append(currentUserId);
        C0K04.LJFF("distinct_key", C2188811AlT.LIZIZ(sbLIZ), jSONObject);
        if (interfaceC973730bRjYf2 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf2.LJIILIIL()) != null && (numValueOf = Integer.valueOf(battleSettingLJIILIIL.scene)) != null && numValueOf.intValue() == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C0K04.LIZLLL(i2, "is_team_pair", jSONObject);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        C0K04.LIZLLL(i3, "is_direct_match", jSONObject);
        if (C970370bMJ.LJIIIZ() && C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_1V1) {
            i4 = 1;
        }
        C0K04.LIZLLL(i4, "is_downgrade_1v1", jSONObject);
    }

    public static void LJIILIIL(long j, String str, long j2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("progress", j2, jSONObject);
        C0K04.LJIIIZ(jSONObject, "is_message", z2);
        LJIIJJI(str, j, jSONObject);
        if (z) {
            LJIILL("task_failed", jSONObject);
        } else {
            LJIILLIIL("task_failed", jSONObject);
        }
    }

    public static void LJIILJJIL(int i, long j, long j2, long j3, String str, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "both_succeed", jSONObject);
        C0K04.LJ("progress", j2, jSONObject);
        C0K04.LJ("target", j3, jSONObject);
        C0K04.LJIIIZ(jSONObject, "is_message", z2);
        LJIIJJI(str, j, jSONObject);
        if (z) {
            LJIILL("task_succeed", jSONObject);
        } else {
            LJIILLIIL("task_succeed", jSONObject);
        }
    }
}
