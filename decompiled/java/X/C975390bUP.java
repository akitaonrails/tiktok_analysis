package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bUP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975390bUP extends C0K04 {
    public static int LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static long LJIIIIZZ;
    public static C975470bUX LJIIIZ;

    public static String LJIIJJI() {
        String str = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (str != null) {
            return str;
        }
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        c917350Zyn.getClass();
        return C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975390bUP.LJIIL(java.lang.String):void");
    }

    public static void LJIIJ(JSONObject jSONObject, JSONObject jSONObject2) {
        C975470bUX c975470bUX;
        int i;
        if (LiveMatchScoreTrackSetting.INSTANCE.enableTrack() && (c975470bUX = LJIIIZ) != null && (i = c975470bUX.LIZIZ) > 0) {
            C0K04.LJ("score_update_delay", c975470bUX.LIZJ / ((long) i), jSONObject2);
            C0K04.LJ("score_message_delay", c975470bUX.LIZLLL / ((long) c975470bUX.LIZIZ), jSONObject2);
            C0K04.LJ("client_score_update_delay", c975470bUX.LJ / ((long) c975470bUX.LIZIZ), jSONObject2);
            C0K04.LIZLLL(c975470bUX.LIZIZ, "score_update_count", jSONObject);
        }
    }

    public static void LJIILIIL(String str, List list, C975410bUR c975410bUR) {
        String strLIZ;
        int i;
        String str2;
        String str3;
        Long lValueOf;
        String string;
        long jLJJJJJ;
        boolean z;
        EnumC919170a1j enumC919170a1jLJIIIZ;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (interfaceC973730bRjYf2 != null && (enumC919170a1jLJIIIZ = interfaceC973730bRjYf2.LJIIIZ()) != null) {
            EnumC919170a1j.Companion.getClass();
            strLIZ = C917350Zyn.LIZ(enumC919170a1jLJIIIZ);
        } else {
            strLIZ = "unknown";
        }
        ArrayList arrayList = new ArrayList();
        boolean zEnableScoreTrack = LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableScoreTrack();
        int value = 0;
        for (EnumC975430bUT enumC975430bUT : (ArrayList) list) {
            value += enumC975430bUT.getValue();
            arrayList.add(enumC975430bUT.getValueStr());
            if (zEnableScoreTrack) {
                LIZ = enumC975430bUT.getValue() | LIZ;
            }
        }
        if (C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.PUNISH_START) >= 0) {
            i = 1;
        } else {
            i = 0;
        }
        C0K04.LJFF("event_id", "score_abnormal_check", jSONObject);
        C973660bRc c973660bRc = C973660bRc.LIZ;
        if (C973660bRc.LJLLLL()) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        C0K04.LJFF("user_type", str2, jSONObject);
        C0K04.LJFF("match_type", strLIZ, jSONObject);
        C0K04.LJFF("sub_match_type", LJIIJJI(), jSONObject);
        C0K04.LJFF("check_source", str, jSONObject);
        C0K04.LIZLLL(i, "is_during_punishing", jSONObject);
        C0K04.LIZLLL(value, "abnormal_scene_code", jSONObject);
        if (SettingsManager.INSTANCE.getBooleanValue("live_match_score_optimize_enable", false)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("is_match_score_optimize", str3, jSONObject);
        C0K04.LJFF("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()), jSONObject2);
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C0K04.LJFF("anchor_id", String.valueOf(C974540bT2.LJJIIZ()), jSONObject2);
        C0K04.LJFF("room_id", String.valueOf(C974540bT2.LJJIIZI()), jSONObject2);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJL());
        } else {
            lValueOf = null;
        }
        C0K04.LJFF("channel_id", String.valueOf(lValueOf), jSONObject2);
        if (interfaceC973730bRjYf2 == null || (string = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("pk_id", string, jSONObject2);
        if (interfaceC973730bRjYf2 != null) {
            jLJJJJJ = interfaceC973730bRjYf2.LJJJJJ();
        } else {
            jLJJJJJ = 0;
        }
        C0K04.LJ("team_id", jLJJJJJ, jSONObject2);
        C0K04.LJFF("match_type", strLIZ, jSONObject2);
        C0K04.LJ("pk_remain_time", C946230ajN.LJIIIIZZ, jSONObject2);
        C0K04.LIZLLL(value, "abnormal_scene_code", jSONObject2);
        C0K04.LJFF("abnormal_scene_list", arrayList.toString(), jSONObject2);
        C0K04.LIZLLL(i, "is_during_punishing", jSONObject2);
        synchronized (c975410bUR) {
            C0K04.LJFF("data_team_scores", C975410bUR.LJIIIIZZ().toString(), jSONObject2);
            C0K04.LJFF("data_team_quit_scores", c975410bUR.LIZIZ.toString(), jSONObject2);
            C0K04.LJFF("data_anchor_scores", c975410bUR.LIZJ.toString(), jSONObject2);
            C0K04.LJFF("cached_data_team_scores", c975410bUR.LJI.toString(), jSONObject2);
            C0K04.LJFF("ui_team_scores", c975410bUR.LIZLLL.toString(), jSONObject2);
            C0K04.LJFF("ui_anchor_scores", c975410bUR.LJ.toString(), jSONObject2);
            C0K04.LJFF("ui_anchor_rank", c975410bUR.LJFF.toString(), jSONObject2);
            C0K04.LJFF("ui_anchor_linkmic_pos", c975410bUR.LJII.toString(), jSONObject2);
            C0K04.LJFF("ui_anchor_linkmic_pos_start", c975410bUR.LJIIIIZZ.toString(), jSONObject2);
            C0K04.LJFF("ui_anchor_score_unshow", c975410bUR.LJIIIZ.toString(), jSONObject2);
            C0K04.LJFF("team_anchors", c975410bUR.LJIIJ.toString(), jSONObject2);
            C0K04.LJFF("pk_result", c975410bUR.LJIILIIL, jSONObject2);
        }
        C1CC2.LJI("ttlive_client_match_exception_monitor", jSONObject, jSONObject3, jSONObject2);
        if (C915980Zwa.LJII().LLILZLL(true).size() <= 2 && Intrinsics.LJFF(jSONObject2.optString("match_type"), "1v1")) {
            z = false;
        } else {
            z = true;
        }
        C962910bAH.LIZJ("score_abnormal_check", jSONObject2, jSONObject, jSONObject3, z, 1, true);
    }
}
