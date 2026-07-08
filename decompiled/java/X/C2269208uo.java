package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2269208uo {
    public static final C2269208uo LIZ = new C2269208uo();
    public static volatile String LIZIZ = "";
    public static Pair<String, String> LIZJ;

    public static void LIZ(int i, String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(0, "error_code");
        c0lab.LJ("error_domain", str);
        c0lab.LJ("error_message", str2);
        c0lab.LIZIZ(0L, "extraction_time");
        c0lab.LIZ(i, "target_size");
        C20684815ws.LJIILLIIL("tools_mix_material_frame_extraction_error", c0lab.LIZ);
    }

    public static void LIZJ(int i, long j, int i2, String str, String str2) {
        Integer num;
        if (str2 == null) {
            if (i == EnumC2268208ue.FAIL.ordinal()) {
                num = 1;
            } else if (i == EnumC2268208ue.TIMEOUT_CANCEL.ordinal()) {
                num = 0;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                LIZ.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", str);
                c0lab.LIZ(iIntValue, "failure_status");
                C20684815ws.LJIILLIIL("tools_mix_material_feature_extraction_fallback", c0lab.LIZ);
            }
        }
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("creation_id", str);
        c0lab2.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab2.LIZIZ(j, "waiting_duration_ms");
        c0lab2.LIZ(i2, "selected_upload_assets");
        C20684815ws.LJIILLIIL("tools_mix_material_music_zipuri_reused", c0lab2.LIZ);
    }

    public static void LIZLLL(int i, int i2, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str);
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i2, "error_code");
        c0lab.LJ("error_message", str2);
        c0lab.LJ("error_domain", str3);
        C20684815ws.LJIILLIIL("tools_mix_material_tos_preprocess", c0lab.LIZ);
    }

    public static void LIZIZ(String str, long j, long j2, long j3, int i, int i2, Long l, String str2, String str3) {
        long jLongValue;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str);
        c0lab.LIZIZ(j, "fetch_token_duration_ms");
        c0lab.LIZIZ(j2, "upload_duration_ms");
        c0lab.LIZIZ(j3, "total_duration_ms");
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i2, "upload_frame_count");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c0lab.LIZIZ(jLongValue, "error_code");
        if (str2 == null) {
            str2 = "unknown error";
        }
        c0lab.LJ("error_message", str2);
        if (str3 == null) {
            str3 = "unknown";
        }
        c0lab.LJ("error_domain", str3);
        C20684815ws.LJIILLIIL("tools_mix_material_frame_upload_complete", c0lab.LIZ);
    }
}
