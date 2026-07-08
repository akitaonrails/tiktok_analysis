package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorSampleRateDefaultSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorSampleRateOptSetting;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0aAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924630aAX extends C944730agx {
    public static final C924630aAX LIZ = new C924630aAX();
    public static final long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static final C01GW LJIIIZ;

    static {
        System.currentTimeMillis();
        LIZIZ = System.currentTimeMillis();
        LIZJ = System.currentTimeMillis();
        System.currentTimeMillis();
        LIZLLL = System.currentTimeMillis();
        LJ = System.currentTimeMillis();
        LJFF = System.currentTimeMillis();
        LJI = System.currentTimeMillis();
        LJII = System.currentTimeMillis();
        LJIIIIZZ = System.currentTimeMillis();
        LJIIIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(494));
    }

    public static C969360bKg LJIILLIIL() {
        return (C969360bKg) LJIIIZ.getValue();
    }

    public static final void LJIJJLI() {
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            LIZ.LJJJLIIL(0, "apply_click", new JSONObject(), false);
        }
    }

    public static final void LJJJJZI() {
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("is_anchor", CardStruct.IStatusCode.DEFAULT, jSONObject);
            LIZ.LJJJLIIL(0, "anchor_turn_off_multi_guest", jSONObject, false);
        }
    }

    public static String LJIIZILJ() {
        return C924810aAp.LJ().LJIIIZ ? "multiGuest" : "normal_live";
    }

    public static String LJIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_LinkInRoomMonitor_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJIL(String str) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("response", str, jSONObject);
        long jCurrentTimeMillis = System.currentTimeMillis() - LJII;
        C0K04.LJ("cost", jCurrentTimeMillis, jSONObject);
        C924630aAX c924630aAX = LIZ;
        c924630aAX.LJJJLIIL(0, "apply_succeed", jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        c924630aAX.LJIIJJI(jSONObject2, false);
        C0K04.LJFF("record_id", str, jSONObject2);
        C0K04.LJFF("live_type", LJIIZILJ(), jSONObject2);
        C969360bKg c969360bKgLJIILLIIL = LJIILLIIL();
        c969360bKgLJIILLIIL.LIZIZ(jSONObject2);
        c969360bKgLJIILLIIL.LIZJ(str, "apply_succeed", jSONObject, C2097908Jt.LIZJ(new Pair("duration", Long.valueOf(jCurrentTimeMillis))));
    }

    public static final void LJJ(int i) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("type", String.valueOf(i), jSONObject);
        LIZ.LJJJLIIL(0, "disconnect_popup_click", jSONObject, true);
    }

    public static final void LJJII(long j) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("guest_user_id", j, jSONObject);
        LIZ.LJJJLIIL(0, "invite_request", jSONObject, true);
        LJFF = System.currentTimeMillis();
    }

    public static final void LJJIII(long j) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("guest_user_id", j, jSONObject);
        long jCurrentTimeMillis = System.currentTimeMillis() - LJFF;
        C0K04.LJ("cost", jCurrentTimeMillis, jSONObject);
        C0K04.LJFF("guest_linkmic_id", "", jSONObject);
        C924630aAX c924630aAX = LIZ;
        LJIILL(Long.valueOf(j), "", jSONObject);
        C0K04.LJ("invite_service_timestamp", C963140bAe.LIZIZ() - jCurrentTimeMillis, jSONObject);
        c924630aAX.LJJJLIIL(0, "invite_succeed", jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        c924630aAX.LJIIJJI(jSONObject2, true);
        C0K04.LJFF("record_id", "", jSONObject2);
        C0K04.LJFF("live_type", LJIIZILJ(), jSONObject2);
        C969360bKg c969360bKgLJIILLIIL = LJIILLIIL();
        c969360bKgLJIILLIIL.LIZIZ(jSONObject2);
        c969360bKgLJIILLIIL.LIZJ("", "invite_succeed", jSONObject, C2097908Jt.LIZJ(new Pair("duration", Long.valueOf(jCurrentTimeMillis))));
    }

    public static final void LJJIJ(int i) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("type", String.valueOf(i), jSONObject);
        LIZ.LJJJLIIL(0, "leave_popup_click", jSONObject, false);
    }

    public static final void LJJIJIIJI(int i) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "request_source", jSONObject);
        LIZ.LJJJLIIL(0, "leave_request", jSONObject, false);
        LJIIIIZZ = System.currentTimeMillis();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(i, "request_source", jSONObject2);
        LJIILLIIL().LIZJ(C924810aAp.LJ().LIZLLL(), "leave_request", jSONObject2, null);
    }

    public static final void LJJIJIIJIL(int i) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("cost", System.currentTimeMillis() - LJIIIIZZ, jSONObject);
        C0K04.LIZLLL(i, "request_source", jSONObject);
        LIZ.LJJJLIIL(0, "leave_succeed", jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(i, "request_source", jSONObject2);
        LJIILLIIL().LIZJ(C924810aAp.LJ().LIZLLL(), "leave_succeed", jSONObject2, null);
    }

    public static void LJJIZ(boolean z) {
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("reached_source", "", jSONObject);
            LIZ.LJJJLIIL(0, "reach_max_link_mic_number", jSONObject, z);
        }
    }

    public static final void LJJJJJ(boolean z) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("rtc_ext_info", C924810aAp.LJ().LJIILLIIL, jSONObject);
        String str = C924810aAp.LJ().LJIIZILJ;
        if (str == null) {
            str = "";
        }
        C0K04.LJFF("rtc_ext_info_map", str, jSONObject);
        LIZ.LJJJLIIL(0, "rtc_init_start", jSONObject, z);
    }

    public static final void LJJJJJL(boolean z) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C924810aAp.LJ().getClass();
        LIZ.LJJJLIIL(0, "rtc_init_succeed", jSONObject, z);
    }

    public static void LJJJJL(boolean z) {
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LIZLLL(0, "guest_pre_push_time_mills", jSONObject);
            LIZ.LJJJLIIL(0, "rtc_push_stream", jSONObject, z);
            LJIILLIIL().LIZJ(C924810aAp.LJ().LIZLLL(), "rtc_push_stream", C00Y6.LIZ(jSONObject), null);
        }
    }

    public static final void LJIJJ(Throwable th, boolean z) {
        int i;
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        C0K04.LIZLLL(i, "anchor_check_permission_status", jSONObject);
        C924630aAX c924630aAX = LIZ;
        if (th != null) {
            C944730agx.LJIIL(th, jSONObject);
        }
        c924630aAX.LJJJLIIL(0, "anchor_check_permission", jSONObject, true);
    }

    public static final void LJJIFFI(long j, Throwable th) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("guest_user_id", j, jSONObject);
        C0K04.LJ("cost", System.currentTimeMillis() - LJFF, jSONObject);
        C924630aAX c924630aAX = LIZ;
        C944730agx.LJIIL(th, jSONObject);
        c924630aAX.LJJJLIIL(1, "invite_failed", jSONObject, true);
    }

    public static final void LJJIIZI(int i, Throwable th) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "request_source", jSONObject);
        C924630aAX c924630aAX = LIZ;
        C944730agx.LJIIL(th, jSONObject);
        C0K04.LJ("cost", System.currentTimeMillis() - LJIIIIZZ, jSONObject);
        c924630aAX.LJJJLIIL(1, "leave_failed", jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(i, "request_source", jSONObject2);
        C944730agx.LJIIL(th, jSONObject2);
        LJIILLIIL().LIZJ(C924810aAp.LJ().LIZLLL(), "leave_failed", jSONObject2, null);
    }

    public static final void LJJIJIL(Throwable th, boolean z) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C924630aAX c924630aAX = LIZ;
        C944730agx.LJIIL(th, jSONObject);
        C0K04.LJ("cost", System.currentTimeMillis() - LIZIZ, jSONObject);
        c924630aAX.LJJJLIIL(1, "list_failed", jSONObject, z);
    }

    public static final void LJJIJL(List<? extends LinkPlayerInfo> list, boolean z) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("response", list.toString(), jSONObject);
        C0K04.LJ("cost", System.currentTimeMillis() - LIZIZ, jSONObject);
        LIZ.LJJJLIIL(0, "list_succeed", jSONObject, z);
    }

    public static void LJJJI(long j, Long l) {
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJ("reply_status", j, jSONObject);
            C0K04.LJFF("guest_linkmic_id", "", jSONObject);
            C924630aAX c924630aAX = LIZ;
            LJIILL(l, "", jSONObject);
            c924630aAX.LJJJLIIL(0, "reply_request", jSONObject, false);
            LJI = System.currentTimeMillis();
            LJIILLIIL().LIZJ(C924810aAp.LJ().LIZLLL(), "reply_request", jSONObject, null);
        }
    }

    public static void LJJJIL(long j, long j2) {
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJ("reply_status", j, jSONObject);
            long jCurrentTimeMillis = System.currentTimeMillis() - LJI;
            C0K04.LJ("cost", jCurrentTimeMillis, jSONObject);
            C924630aAX c924630aAX = LIZ;
            LJIILL(Long.valueOf(j2), "", jSONObject);
            c924630aAX.LJJJLIIL(0, "reply_succeed", jSONObject, false);
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJ("reply_status", j, jSONObject);
            LJIILLIIL().LIZJ(C924810aAp.LJ().LIZLLL(), "reply_succeed", jSONObject2, C2097908Jt.LIZJ(new Pair("duration", Long.valueOf(jCurrentTimeMillis))));
        }
    }

    public static final void LJJJJI(String str, boolean z) {
        Long lLJJJJIZL;
        long j;
        long jCurrentTimeMillis;
        int i;
        String strLIZLLL;
        long[] jArr;
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable() && (lLJJJJIZL = C930540aK4.LJJJJIZL(str)) != null) {
            long jLongValue = lLJJJJIZL.longValue();
            if (jLongValue > 0) {
                JSONObject jSONObject = new JSONObject();
                C0K04.LJ("guest_user_id", jLongValue, jSONObject);
                C0K04.LJFF("guest_linkmic_id", str, jSONObject);
                C924630aAX c924630aAX = LIZ;
                LJIILL(Long.valueOf(jLongValue), str, jSONObject);
                C925000aB8 c925000aB8 = C924810aAp.LJ().LJIJ;
                int iBinarySearch = Arrays.binarySearch(c925000aB8.LL, 0, c925000aB8.LLILLL, jLongValue);
                if (iBinarySearch >= 0 && (jArr = c925000aB8.LLILLJJLI) != null) {
                    j = jArr[iBinarySearch];
                } else {
                    j = 0;
                }
                if (!C924810aAp.LJ().LJIJJ) {
                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                    C924810aAp.LJ().LJIJJ = true;
                    i = 1;
                } else {
                    jCurrentTimeMillis = 0;
                    i = 0;
                }
                C0K04.LJ("cost", jCurrentTimeMillis, jSONObject);
                C0K04.LJFF("first_joined", String.valueOf(i), jSONObject);
                c924630aAX.LJJJLIIL(0, "rtc_first_frame_render", jSONObject, z);
                JSONObject jSONObject2 = new JSONObject();
                C0K04.LJFF("first_joined", String.valueOf(i), jSONObject2);
                C969360bKg c969360bKgLJIILLIIL = LJIILLIIL();
                if (z) {
                    strLIZLLL = str;
                } else {
                    strLIZLLL = C924810aAp.LJ().LIZLLL();
                }
                c969360bKgLJIILLIIL.LIZJ(strLIZLLL, "rtc_first_frame_render", jSONObject2, null);
                if (j > 0) {
                    JSONObject jSONObjectLIZ = C00Y6.LIZ(jSONObject);
                    C1CC3 c1cc3 = C1CC2.LIZ;
                    if (c1cc3 != null) {
                        c1cc3.LJIIJJI("ttlive_client_guest_link_first_frame", jCurrentTimeMillis, jSONObjectLIZ);
                    }
                    if (z) {
                        LJIILLIIL().LIZ(1, str);
                    }
                }
            }
        }
    }

    public static final void LJJJJLI(String str, boolean z) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("request_source", str, jSONObject);
        LIZ.LJJJLIIL(0, "rtc_stop", jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("request_source", str, jSONObject2);
        LJIILLIIL().LIZJ(C924810aAp.LJ().LIZLLL(), "rtc_stop", jSONObject2, null);
    }

    public static void LJIILL(Long l, String str, JSONObject jSONObject) {
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C0K04.LJ("remote_user_id", jLongValue, jSONObject);
        if (str == null) {
            str = "";
        }
        C0K04.LJFF("remote_linkmic_id", str, jSONObject);
    }

    public static final void LJJIIJZLJL(long j, String str, String str2) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("guest_user_id", j, jSONObject);
        C0K04.LJFF("request_source", str, jSONObject);
        C0K04.LJFF("guest_linkmic_id", str2, jSONObject);
        C924630aAX c924630aAX = LIZ;
        LJIILL(Long.valueOf(j), str2, jSONObject);
        c924630aAX.LJJJLIIL(0, "kick_out_request", jSONObject, true);
        LIZLLL = System.currentTimeMillis();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("request_source", str, jSONObject2);
        LJIILLIIL().LIZJ(str2, "kick_out_request", jSONObject2, null);
    }

    public static final void LJJIIZ(long j, String str, String str2) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("guest_user_id", j, jSONObject);
        C0K04.LJFF("request_source", str, jSONObject);
        C0K04.LJFF("guest_linkmic_id", str2, jSONObject);
        C0K04.LJ("cost", System.currentTimeMillis() - LIZLLL, jSONObject);
        C924630aAX c924630aAX = LIZ;
        LJIILL(Long.valueOf(j), str2, jSONObject);
        c924630aAX.LJJJLIIL(0, "kick_out_succeed", jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("request_source", str, jSONObject2);
        LJIILLIIL().LIZJ(str2, "kick_out_succeed", jSONObject2, null);
    }

    public static void LJJJ(Throwable th, long j, long j2) {
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJ("error_code", 101L, jSONObject);
            C0K04.LJFF("code", "101", jSONObject);
            C0K04.LJ("reply_status", j, jSONObject);
            C0K04.LJ("cost", System.currentTimeMillis() - LJI, jSONObject);
            C924630aAX c924630aAX = LIZ;
            C944730agx.LJIIL(th, jSONObject);
            LJIILL(Long.valueOf(j2), "", jSONObject);
            LJIILLIIL().LIZJ(C924810aAp.LJ().LIZLLL(), "reply_failed", C00Y6.LIZ(jSONObject), null);
            c924630aAX.LJJJLIIL(1, "reply_failed", jSONObject, false);
        }
    }

    public static final void LJJJJ(int i, String str, boolean z) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("error_code", 104L, jSONObject);
        C0K04.LJFF("code", "104", jSONObject);
        C0K04.LJ("error_msg", i, jSONObject);
        C0K04.LJFF("error_detail", str, jSONObject);
        C924630aAX c924630aAX = LIZ;
        C969360bKg c969360bKgLJIILLIIL = LJIILLIIL();
        String strLIZLLL = C924810aAp.LJ().LIZLLL();
        String str2 = "";
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        c969360bKgLJIILLIIL.LIZJ(strLIZLLL, "rtc_error", C00Y6.LIZ(jSONObject), null);
        String strLIZLLL2 = C924810aAp.LJ().LIZLLL();
        if (strLIZLLL2 != null) {
            str2 = strLIZLLL2;
        }
        c969360bKgLJIILLIIL.LIZ(2, str2);
        c924630aAX.LJJJLIIL(0, "rtc_error", jSONObject, z);
    }

    public static final void LJJJJIZL(int i, String str, boolean z) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "errCode", jSONObject);
        C0K04.LJFF("errMsg", str, jSONObject);
        LIZ.LJJJLIIL(0, "rtc_init_failed", jSONObject, z);
    }

    public static final void LJJJJLL(Long l, String str, boolean z) {
        long jLongValue;
        String str2;
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C0K04.LJ("guest_user_id", jLongValue, jSONObject);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C0K04.LJFF("guest_linkmic_id", str2, jSONObject);
        C924630aAX c924630aAX = LIZ;
        LJIILL(l, str, jSONObject);
        c924630aAX.LJJJLIIL(0, "rtc_user_joined", jSONObject, z);
        LJIILLIIL().LIZJ(str, "rtc_user_joined", null, null);
    }

    public final void LJIJI(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2, String str) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        String strLJIJ = LJIJ(1456);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorChangeSetting oldSetting:");
        sbLIZ.append(multiLiveAnchorPanelSettings);
        sbLIZ.append(", newSetting:");
        sbLIZ.append(multiLiveAnchorPanelSettings2);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLJIJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        JSONObject jSONObject = new JSONObject();
        LJIIJJI(jSONObject, true);
        C0K04.LJFF("old_setting", String.valueOf(multiLiveAnchorPanelSettings), jSONObject);
        C0K04.LJFF("new_setting", String.valueOf(multiLiveAnchorPanelSettings2), jSONObject);
        C0K04.LJFF("source", str, jSONObject);
        LJJJLIIL(0, "anchor_change_multilive_anchor_setting", jSONObject, true);
    }

    public final void LJJI(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2, String str) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        String strLJIJ = LJIJ(1478);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuestParseSetting oldSetting:");
        sbLIZ.append(multiLiveAnchorPanelSettings);
        sbLIZ.append(", newSetting:");
        sbLIZ.append(multiLiveAnchorPanelSettings2);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLJIJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        JSONObject jSONObject = new JSONObject();
        LJIIJJI(jSONObject, false);
        C0K04.LJFF("old_setting", String.valueOf(multiLiveAnchorPanelSettings), jSONObject);
        C0K04.LJFF("new_setting", String.valueOf(multiLiveAnchorPanelSettings2), jSONObject);
        C0K04.LJFF("source", str, jSONObject);
        LJJJLIIL(0, "guest_parse_multilive_anchor_setting", jSONObject, false);
    }

    public final void LJJIJLIJ(boolean z, Map map, boolean z2) {
        String strLIZJ;
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        String strLJIJ = LJIJ(1498);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multi guest icon behavior, isShow: ");
        sbLIZ.append(z);
        sbLIZ.append(", isGray:");
        sbLIZ.append(z2);
        sbLIZ.append(", ");
        sbLIZ.append(map);
        C1AZW.LJIIJ(12, strLJIJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        JSONObject jSONObject = new JSONObject();
        LJIIJJI(jSONObject, false);
        C0K04.LIZLLL(z ? 1 : 0, "isShow", jSONObject);
        C0K04.LIZLLL(z2 ? 1 : 0, "is_gray", jSONObject);
        if (map == null || (strLIZJ = C1516000pYM.LIZJ(map)) == null) {
            strLIZJ = "";
        }
        C0K04.LJFF("extra", strLIZJ, jSONObject);
        LJJJLIIL(0, "multi_guest_icon_behavior", jSONObject, false);
    }

    public static final void LJJIIJ(Throwable th, String str, String str2, long j) {
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("guest_user_id", j, jSONObject);
        C0K04.LJFF("request_source", str, jSONObject);
        C0K04.LJFF("guest_linkmic_id", str2, jSONObject);
        C924630aAX c924630aAX = LIZ;
        LJIILL(Long.valueOf(j), str2, jSONObject);
        C944730agx.LJIIL(th, jSONObject);
        C0K04.LJ("cost", System.currentTimeMillis() - LIZLLL, jSONObject);
        c924630aAX.LJJJLIIL(1, "kick_out_failed", jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("request_source", str, jSONObject2);
        C944730agx.LJIIL(th, jSONObject2);
        LJIILLIIL().LIZJ(str2, "kick_out_failed", jSONObject2, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x048c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJIL(com.bytedance.ies.sdk.datachannel.DataChannel r21, java.lang.String r22, X.EnumC918970a1P r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924630aAX.LJJIL(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, X.0a1P, boolean):java.lang.String");
    }

    public static final void LJJJJZ(long j, Long l, String str, boolean z) {
        long jLongValue;
        String str2;
        if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C0K04.LJ("guest_user_id", jLongValue, jSONObject);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C0K04.LJFF("guest_linkmic_id", str2, jSONObject);
        C0K04.LJ("leave_reason", j, jSONObject);
        C924630aAX c924630aAX = LIZ;
        LJIILL(l, str, jSONObject);
        c924630aAX.LJJJLIIL(0, "rtc_user_leaved", jSONObject, z);
        LJIILLIIL().LIZJ(str, "rtc_user_leaved", null, null);
    }

    public final void LJJJLIIL(int i, String str, JSONObject jSONObject, boolean z) {
        String str2;
        double value;
        C0K04.LJFF("event_id", str, jSONObject);
        if (!z) {
            C0K04.LJFF("join_channel_removed", CardStruct.IStatusCode.DEFAULT, jSONObject);
        }
        LJIIJJI(jSONObject, z);
        C0K04.LJFF("report_id", String.valueOf(C924810aAp.LJ().LJJI), jSONObject);
        C924810aAp.LJ().LJJI++;
        if (z) {
            str2 = "ttlive_client_multi_guest_anchor_monitor";
        } else {
            str2 = "ttlive_client_multi_guest_audience_monitor";
        }
        if (MultiGuestSlardarMonitorSampleRateOptSetting.INSTANCE.isEnable() && Intrinsics.LJFF(str, "audience_init_multi_guest_failed")) {
            value = 0.5d;
        } else {
            value = MultiGuestSlardarMonitorSampleRateDefaultSetting.INSTANCE.getValue();
        }
        if (!Intrinsics.LJFF("ttlive_client_multi_guest_anchor_monitor", str2) || SlardarSampleSetting.INSTANCE.isReport(str2, value)) {
            if (Intrinsics.LJFF("ttlive_client_multi_guest_audience_monitor", str2) && !SlardarSampleSetting.INSTANCE.isReport(str2, value)) {
                return;
            }
            C501590Jll.LJFF(jSONObject);
            C1CC2.LJIIIIZZ(str2, i, jSONObject);
        }
    }
}
