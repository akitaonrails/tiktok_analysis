package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123450fLD {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static String LJ = "";

    public static String LIZ() {
        return LJ;
    }

    public static void LJIIIIZZ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_guide_show");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "message_received_to_show_duration");
        c474500IjALIZ.LJJII(str, "notification_type");
        c474500IjALIZ.LIZ();
        LIZ = 0L;
    }

    public static void LJIIIZ(C1123620fLU c1123620fLU) {
        boolean z;
        long j;
        long j2 = c1123620fLU.LJ;
        if (j2 != 0 && c1123620fLU.LJFF != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1123620fLU.LIZJ = 0;
            c1123620fLU.LIZLLL = "";
            j = c1123620fLU.LJFF - j2;
        } else {
            j = 0;
        }
        JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("guide_type", c1123620fLU.LIZIZ), new Pair("error_code", Integer.valueOf(c1123620fLU.LIZJ)), new Pair("error_message", c1123620fLU.LIZLLL)));
        JSONObject jSONObject2 = new JSONObject(C2097908Jt.LIZJ(new Pair("duration", Long.valueOf(j))));
        JSONObject jSONObject3 = new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("duration", Long.valueOf(j)), new Pair("popup_url", c1123620fLU.LIZ)));
        C1CC2.LIZJ("gift_guide_lynx_load", jSONObject, jSONObject2, jSONObject3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_guide_lynx_load");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
        c1123620fLU.LIZ = "";
        c1123620fLU.LJ = 0L;
        c1123620fLU.LJFF = 0L;
        c1123620fLU.LIZIZ = "";
        c1123620fLU.LIZJ = 0;
        c1123620fLU.LIZLLL = "";
    }

    public static final void LJ(long j, long j2) {
        long j3;
        long j4 = LIZIZ;
        if (j4 != 0) {
            j3 = j - j4;
        } else {
            j3 = -1;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_guide_client_ai_predict");
        c474500IjALIZ.LJJII(Long.valueOf(j), "client_ai_predict_start_timestamp");
        c474500IjALIZ.LJJII(Long.valueOf(j2 - j), "client_ai_predict_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j3), "duration_since_receive_message");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(EnumC1123510fLJ enumC1123510fLJ, EnumC1120830fGz enumC1120830fGz, Map<String, String> map) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_guide_bubble_close");
        c474500IjALIZ.LJJII(enumC1123510fLJ.getDesc$livegift_impl_release(), "close_reason");
        c474500IjALIZ.LJJII(C1123590fLR.LIZJ, "notification_type");
        c474500IjALIZ.LJJII(C1123590fLR.LIZIZ, "notification_request_id");
        c474500IjALIZ.LJJII(enumC1120830fGz.getDesc(), "show_reason");
        if (C2640010k.LIZIZ()) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJII(long j, String str, String str2) {
        JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("notification_type", C1123590fLR.LIZJ), new Pair("trigger_type", str), new Pair("avoid_reason", str2), new Pair("guide_is_showing", 1)));
        JSONObject jSONObject2 = new JSONObject(C2097908Jt.LIZJ(new Pair("interval_from_enter_room", Long.valueOf(j))));
        C1129310fUf.LIZ.getClass();
        JSONObject jSONObject3 = new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("notification_request_id", C1123590fLR.LIZIZ), new Pair("gift_list_log_id", C1129310fUf.LIZJ)));
        C1CC2.LIZJ("gift_guide_popup_avoid", jSONObject, jSONObject2, jSONObject3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_guide_popup_avoid");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(Long l, String str, int i, Map map) {
        String str2;
        long jUptimeMillis = SystemClock.uptimeMillis() - C1123130fKh.LIZIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_guide_bubble_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(C155200ic.LIZ(null));
        c474500IjALIZ.LJJII(C1123590fLR.LIZJ, "notification_type");
        c474500IjALIZ.LJJII(C1123590fLR.LIZIZ, "notification_request_id");
        c474500IjALIZ.LJJII(l, "gift_id");
        c474500IjALIZ.LJJII(str, "show_reason");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (C2640010k.LIZIZ()) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis), "message_received_to_show_duration");
        c474500IjALIZ.LJJII(((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0(), "is_multi");
        ILiveCompetitionExternalService iLiveCompetitionExternalService = (ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
        boolean zV91 = iLiveCompetitionExternalService.v91();
        boolean zKg2 = iLiveCompetitionExternalService.kg2();
        if (zV91 || zKg2) {
            iLiveCompetitionExternalService.Wz0(c474500IjALIZ);
        }
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ti2(), "sub_match_type");
        if (Intrinsics.LJFF(str, "user_level_up")) {
            c474500IjALIZ.LJJII(Integer.valueOf(i), "user_level");
        }
        if (map != null && (!map.isEmpty())) {
            c474500IjALIZ.LJJIIZI(map);
        }
        c474500IjALIZ.LIZ();
        LJIIIIZZ(C1123590fLR.LIZJ);
    }

    public static void LIZLLL(Long l, EnumC1120830fGz enumC1120830fGz, Map map, int i) {
        if ((i & 8) != 0) {
            map = null;
        }
        LIZJ(l, enumC1120830fGz.getDesc(), 0, map);
    }

    public static void LJIIJ(int i, int i2, int i3, int i4, int i5) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_match_item_use_bubble");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(C1128450fTH.LIZJ()), "pk_id");
        c474500IjALIZ.LJJII(Long.valueOf(C1128450fTH.LIZ.getChannelId()), "channel_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII("bubble", "bubble_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "current_item_available_cnts");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "current_boosting_gloves_available_cnts");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "current_magic_smokes_available_cnts");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "current_time_extending_available_cnts");
        c474500IjALIZ.LJJII(Integer.valueOf(i5), "current_hammer_available_cnts");
        c474500IjALIZ.LJJII(Integer.valueOf(C1128450fTH.LIZIZ().size()), "both_guest_cnt");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIJJI(long j, EnumC1123510fLJ enumC1123510fLJ, long j2, long j3, Boolean bool) {
        String desc$livegift_impl_release;
        String desc$livegift_impl_release2;
        String desc$livegift_impl_release3;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("gift_id", Long.valueOf(j));
        pairArr[1] = new Pair("close_reason", enumC1123510fLJ.getDesc$livegift_impl_release());
        pairArr[2] = new Pair("notification_type", C1123590fLR.LIZJ);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            desc$livegift_impl_release = EnumC1123510fLJ.LEFT_ROOM.getDesc$livegift_impl_release();
        } else {
            desc$livegift_impl_release = enumC1123510fLJ.getDesc$livegift_impl_release();
        }
        pairArr[3] = new Pair("detail_close_reason", desc$livegift_impl_release);
        JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIIIZZ(pairArr));
        JSONObject jSONObject2 = new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("actual_show_duration", Long.valueOf(j2)), new Pair("show_duration", Long.valueOf(j3))));
        Pair[] pairArr2 = new Pair[6];
        pairArr2[0] = new Pair("gift_id", Long.valueOf(j));
        pairArr2[1] = new Pair("close_reason", enumC1123510fLJ.getDesc$livegift_impl_release());
        pairArr2[2] = new Pair("notification_type", C1123590fLR.LIZJ);
        pairArr2[3] = new Pair("actual_show_duration", Long.valueOf(j2));
        pairArr2[4] = new Pair("show_duration", Long.valueOf(j3));
        if (Intrinsics.LJFF(bool, bool2)) {
            desc$livegift_impl_release2 = EnumC1123510fLJ.LEFT_ROOM.getDesc$livegift_impl_release();
        } else {
            desc$livegift_impl_release2 = enumC1123510fLJ.getDesc$livegift_impl_release();
        }
        pairArr2[5] = new Pair("detail_close_reason", desc$livegift_impl_release2);
        C1CC2.LIZJ("gift_guide_popup_close_show_duration", jSONObject, jSONObject2, new JSONObject(C2097608Jq.LJIIIIZZ(pairArr2)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_guide_popup_close_show_duration");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(enumC1123510fLJ.getDesc$livegift_impl_release(), "close_reason");
        c474500IjALIZ.LJJII(C1123590fLR.LIZJ, "notification_type");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "actual_show_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j3), "show_duration");
        if (Intrinsics.LJFF(bool, bool2)) {
            desc$livegift_impl_release3 = EnumC1123510fLJ.LEFT_ROOM.getDesc$livegift_impl_release();
        } else {
            desc$livegift_impl_release3 = enumC1123510fLJ.getDesc$livegift_impl_release();
        }
        c474500IjALIZ.LJJII(desc$livegift_impl_release3, "detail_close_reason");
        c474500IjALIZ.LIZ();
    }

    public static final void LJI(int i, int i2, long j, long j2, String str, boolean z) {
        long j3 = j2 - j;
        C1CC2.LIZJ("gift_guide_algo_exec", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("is_success", Integer.valueOf(z ? 1 : 0)), new Pair("duration_enter_from", str))), new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("execute_duration", Long.valueOf(j3)), new Pair("error_code", Integer.valueOf(i)), new Pair("target_show_duration", Integer.valueOf(i2)))), new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("is_success", Integer.valueOf(z ? 1 : 0)), new Pair("duration_enter_from", str), new Pair("execute_duration", Long.valueOf(j3)), new Pair("error_code", Integer.valueOf(i)), new Pair("target_show_duration", Integer.valueOf(i2)))));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_guide_algo_exec");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_success");
        c474500IjALIZ.LJJII(Long.valueOf(j3), "execute_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "duration_enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "target_show_duration");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(com.bytedance.ies.sdk.datachannel.DataChannel r12, long r13, boolean r15, java.lang.Integer r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21, java.lang.String r23, java.util.Map r24) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123450fLD.LJIIL(com.bytedance.ies.sdk.datachannel.DataChannel, long, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(com.bytedance.ies.sdk.datachannel.DataChannel r13, java.lang.String r14, long r15, X.EnumC1123510fLJ r17, boolean r18, long r19, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.Map<java.lang.String, ? extends java.lang.Object> r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123450fLD.LJFF(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, long, X.0fLJ, boolean, long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }
}
