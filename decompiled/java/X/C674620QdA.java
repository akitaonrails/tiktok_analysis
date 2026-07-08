package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0QdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674620QdA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C674630QdB c674630QdB) {
        Map<String, Object> mapLIZ = c674630QdB.LIZ();
        Long l = c674630QdB.LJII;
        if (l != null) {
            mapLIZ.put("audio_duration_ms", Long.valueOf(l.longValue()));
        }
        EnumC674660QdE enumC674660QdE = c674630QdB.LJIIIIZZ;
        if (enumC674660QdE != null) {
            mapLIZ.put("end_reason", enumC674660QdE.getReason());
        }
        C1421105hJ.LIZJ("tiktokec_voice_recording_end", mapLIZ);
    }

    public static void LIZJ(C674630QdB c674630QdB) {
        Map<String, Object> mapLIZ = c674630QdB.LIZ();
        String str = c674630QdB.LJIIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        mapLIZ.put("original_text", str);
        String str3 = c674630QdB.LJIILL;
        if (str3 != null) {
            str2 = str3;
        }
        mapLIZ.put("edited_text", str2);
        C1421105hJ.LIZJ("tiktokec_voice_text_edit", mapLIZ);
    }

    public static void LIZLLL(C674630QdB c674630QdB) {
        Map<String, Object> mapLIZ = c674630QdB.LIZ();
        Long l = c674630QdB.LJII;
        if (l != null) {
            mapLIZ.put("audio_duration_ms", Long.valueOf(l.longValue()));
        }
        Long l2 = c674630QdB.LJIIIZ;
        if (l2 != null) {
            mapLIZ.put("loading_duration_ms", Long.valueOf(l2.longValue()));
        }
        Integer num = c674630QdB.LJIIJ;
        if (num != null) {
            mapLIZ.put("is_error", Integer.valueOf(num.intValue()));
        }
        String str = c674630QdB.LJIIJJI;
        if (str != null) {
            mapLIZ.put("error_text", str);
        }
        String str2 = c674630QdB.LJIIL;
        if (str2 != null) {
            mapLIZ.put("original_text", str2);
        }
        Integer num2 = c674630QdB.LJIILIIL;
        if (num2 != null) {
            mapLIZ.put("error_code", Integer.valueOf(num2.intValue()));
        }
        String str3 = c674630QdB.LJIILJJIL;
        if (str3 != null) {
            mapLIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        }
        C1421105hJ.LIZJ("tiktokec_voice_text_result", mapLIZ);
    }

    public static String LJ(C0QUT c0qut) {
        if (c0qut != null) {
            int i = C672670Qa1.LIZ[c0qut.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "search_mid_page";
                }
                return "";
            }
            return "search_sug_page";
        }
        return "";
    }

    public static void LIZ(C0QUT c0qut, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", "fixed");
        linkedHashMap.put("search_entrance_type", LJ(c0qut));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C1421105hJ.LIZJ("ai_search_keyboard_fixed_show", linkedHashMap);
    }
}
