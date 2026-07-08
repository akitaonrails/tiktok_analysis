package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0o3W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458440o3W {
    public static final C1458440o3W LIZ = new C1458440o3W();
    public static final Map<String, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("zip_scenario", "server_zip_scenario"), new Pair("recommend_cost", "recommend_cost_time"), new Pair("music_server_cost", "music_server_cost_time"), new Pair("has_content_emb", "has_content_emb"), new Pair("has_local_content_emb", "has_local_content_emb"));

    public static void LIZ(C0LAB c0lab, String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                    linkedHashMap.put(next, string);
                    Map<String, String> map = LIZIZ;
                    if (map.containsKey(next)) {
                        c0lab.LJ(map.get(next), string);
                    }
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void LJ(Integer num, Integer num2, long j) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("time_cost_ms", Long.valueOf(j));
        if (num != null) {
            num.intValue();
            c543670LTx.LIZIZ(num, "photo_to_video_assets_count");
        }
        if (num2 != null) {
            num2.intValue();
            c543670LTx.LIZIZ(num2, "music_type");
        }
        C1637890six.LJ("ies_ai_recommend_request_monitor", 0, c543670LTx.LJ());
    }

    public static void LIZIZ(long j, int i, String str, String str2, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, "type");
        c0lab.LJ("upload_type", str);
        c0lab.LIZIZ(j, "time");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        if (i != 1) {
            c0lab.LJFF("is_force", z);
        }
        c0lab.LJ("is_login", String.valueOf(C0CHQ.LIZ().getAccountService().isLogin()));
        C20684815ws.LJIILLIIL("tool_performance_ai_music_panel_request", c0lab.LIZ);
    }

    public static void LIZJ(String str, Integer num, int i, String str2, Integer num2, long j, IMusicRequestParam iMusicRequestParam, String str3, boolean z, Long l, String str4, String str5, String str6) {
        boolean z2;
        if (!C301630Bs1.LIZ()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        String creationId = iMusicRequestParam.getCreationId();
        c0lab.LJ("shoot_way", iMusicRequestParam.getShootWay());
        c0lab.LJ("content_source", iMusicRequestParam.getContentSource());
        c0lab.LJ("content_type", iMusicRequestParam.getContentType());
        c0lab.LJ("enter_from", iMusicRequestParam.getEnterFrom());
        c0lab.LJ("creation_id", iMusicRequestParam.getCreationId());
        c0lab.LIZIZ(j, "time_cost_ms");
        c0lab.LIZ(i, "zip_scenario");
        boolean z3 = true;
        c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (z) {
            c0lab.LIZ(1, "pre_request");
        }
        if (num != null) {
            c0lab.LIZ(num.intValue(), "error_code");
        }
        if (str != null) {
            c0lab.LJ("error_info", str);
        }
        if (l != null) {
            long jLongValue = l.longValue();
            c0lab.LIZIZ(jLongValue, "wait_frame_upload_duration");
            if (j > jLongValue) {
                c0lab.LIZIZ(j - jLongValue, "time_cost_ms_without_wait_frame_upload");
            }
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                c0lab.LJ("zip_url", str2);
            }
            if (creationId != null) {
                C1458370o3P c1458370o3P = C1458370o3P.LIZ;
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1458370o3P.getClass();
                c0lab.LJ("zipuri_type", C1458370o3P.LJIIZILJ(creationId, z2));
            }
        }
        if (C123100dR.LIZ(str4)) {
            c0lab.LJ("understanding_key", str4);
            c0lab.LJ("understanding_type", "cloud_understanding");
        } else if (C123100dR.LIZ(str2)) {
            if (str2 != null) {
                c0lab.LJ("understanding_type", "tos_uri");
            }
            c0lab.LJ("understanding_type", "tos_uri");
        } else {
            c0lab.LJ("understanding_type", "demotion");
        }
        if (C1458780o44.LIZ()) {
            c0lab.LJ("carry_local_emb", str6);
        }
        if (C2252008s2.LIZ()) {
            c0lab.LIZ(C123100dR.LIZ(str5) ? 1 : 0, "has_frame_file");
        }
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "music_count");
        }
        if (str2 != null && str2.length() > 0) {
            c0lab.LJ("zip_url", str2);
            if (creationId != null) {
                C1458370o3P c1458370o3P2 = C1458370o3P.LIZ;
                if (i != 0) {
                    z3 = false;
                }
                c1458370o3P2.getClass();
                c0lab.LJ("zipuri_type", C1458370o3P.LJIIZILJ(creationId, z3));
            }
        }
        LIZ(c0lab, str3);
        C20684815ws.LJIILLIIL("monitor_ies_ai_recommend_request_monitor", c0lab.LIZ);
    }

    public static void LJFF(long j, Integer num, Integer num2, boolean z, String str, Integer num3, IMusicRequestParam iMusicRequestParam, String str2, String str3, boolean z2, Long l, String str4, String str5, String str6, String str7) {
        if (!C301630Bs1.LIZ()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        String creationId = iMusicRequestParam.getCreationId();
        c0lab.LJ("shoot_way", iMusicRequestParam.getShootWay());
        c0lab.LJ("content_source", iMusicRequestParam.getContentSource());
        c0lab.LJ("content_type", iMusicRequestParam.getContentType());
        c0lab.LJ("creation_id", creationId);
        c0lab.LIZIZ(j, "time_cost_ms");
        c0lab.LIZ(z ? 1 : 0, "zip_scenario");
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (z2) {
            c0lab.LIZ(1, "pre_request");
        }
        if (!z && str != null && creationId != null) {
            C1458370o3P.LIZ.getClass();
            C1458370o3P.LJIILL = new Pair<>(creationId, str);
        }
        if (str3 != null) {
            c0lab.LJ("music_id", str3);
        }
        String enterFrom = iMusicRequestParam.getEnterFrom();
        if (enterFrom != null) {
            c0lab.LJ("enter_from", enterFrom);
        }
        if (num != null) {
            num.intValue();
            c0lab.LIZ(num.intValue(), "photo_to_video_assets_count");
        }
        if (num2 != null) {
            num2.intValue();
            c0lab.LIZ(num2.intValue(), "music_type");
        }
        if (C123100dR.LIZ(str4)) {
            c0lab.LJ("understanding_key", str4);
            c0lab.LJ("understanding_type", "cloud_understanding");
        } else if (C123100dR.LIZ(str)) {
            if (str != null && str.length() > 0) {
                c0lab.LJ("zip_url", str);
                if (creationId != null) {
                    C1458370o3P c1458370o3P = C1458370o3P.LIZ;
                    boolean z3 = !z;
                    c1458370o3P.getClass();
                    c0lab.LJ("zipuri_type", C1458370o3P.LJIIZILJ(creationId, z3));
                }
            }
            c0lab.LJ("understanding_type", "tos_uri");
        } else {
            c0lab.LJ("understanding_type", "demotion");
        }
        if (C1458780o44.LIZ()) {
            c0lab.LJ("carry_local_emb", str7);
        }
        if (C2252008s2.LIZ()) {
            c0lab.LIZ(C123100dR.LIZ(str6) ? 1 : 0, "has_frame_file");
        }
        if (l != null) {
            long jLongValue = l.longValue();
            c0lab.LIZIZ(jLongValue, "wait_frame_upload_duration");
            if (j > jLongValue) {
                c0lab.LIZIZ(j - jLongValue, "time_cost_ms_without_wait_frame_upload");
            }
        }
        if (num3 != null) {
            c0lab.LIZ(num3.intValue(), "music_count");
        }
        if (str5.length() > 0) {
            c0lab.LJ("log_id", str5);
        }
        LIZ(c0lab, str2);
        C20684815ws.LJIILLIIL("monitor_ies_ai_recommend_request_monitor", c0lab.LIZ);
    }
}
