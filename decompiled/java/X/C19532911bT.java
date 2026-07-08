package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.11bT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19532911bT {
    public static void LJFF() {
        if (C19533411bY.LIZIZ) {
            return;
        }
        C19533411bY.LIZIZ = true;
        ConcurrentHashMap<String, String> concurrentHashMap = C19533411bY.LIZ;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(concurrentHashMap);
        C20684815ws.LJIILLIIL("voice_conversion_effect", c2344009Gk.LIZ);
        C2241008qG c2241008qG = new C2241008qG();
        String str = concurrentHashMap.get("total_duration");
        c2241008qG.LIZ.put("duration", Long.valueOf(str != null ? CastLongProtector.parseLong(str) : 0L));
        String str2 = concurrentHashMap.get("pipeline_error_stage");
        if (str2 == null) {
            str2 = "";
        }
        c2241008qG.LIZ.put("error_stage", str2);
        String str3 = concurrentHashMap.get("error_msg");
        c2241008qG.LIZ.put("error_detail", str3 != null ? str3 : "");
        String str4 = concurrentHashMap.get("error_code");
        c2241008qG.LIZ.put("error_code", Integer.valueOf(str4 != null ? CastIntegerProtector.parseInt(str4) : 0));
        C794240VDq.LIZJ("creative_tool_tt_voice_conversion", c2241008qG.LJ());
        concurrentHashMap.clear();
    }

    public static void LIZ(double d, String str) {
        C19533411bY.LIZ.put(str, String.valueOf(d));
    }

    public static void LIZIZ(int i, String str) {
        C19533411bY.LIZ.put(str, String.valueOf(i));
    }

    public static void LIZJ(long j, String str) {
        C19533411bY.LIZ.put(str, String.valueOf(j));
    }

    public static void LIZLLL(String str, String str2) {
        C19533411bY.LIZ.put(str, str2);
    }

    public static void LJ(int i, long j, double d, int i2, int i3, int i4, String str, String str2, String str3) {
        if (i != 10) {
            if (i != 20) {
                if (i != 40) {
                    if (i == 70) {
                        LIZJ(j, "download_duration");
                        LIZIZ(i2, "download_max_file_length");
                        LIZIZ(i4, "error_code");
                        LIZLLL("error_msg", str);
                        if (str3 != null) {
                            LIZLLL("error_sample", str3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LIZJ(j, "fetch_duration");
                LIZ(d, "changed_cache_rate");
                LIZIZ(i4, "error_code");
                LIZLLL("error_msg", str);
                LIZLLL("logid", str2);
                return;
            }
            LIZJ(j, "upload_duration");
            LIZ(d, "upload_cache_rate");
            LIZIZ(i2, "upload_max_file_length");
            LIZIZ(i4, "error_code");
            LIZLLL("error_msg", str);
            return;
        }
        LIZJ(j, "export_duration");
        LIZ(d, "extract_audio_cache_rate");
        LIZIZ(i2, "extract_max_file_length");
        LIZIZ(i3, "process_track");
        LIZIZ(i4, "error_code");
        LIZLLL("error_msg", str);
    }
}
