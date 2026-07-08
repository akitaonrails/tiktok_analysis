package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247811CyR {
    public static final Map<String, Class> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put("enable_body_beauty", Boolean.class);
        map.put("enable_light_soft", Boolean.class);
        map.put("enable_anti_shake", Boolean.class);
        map.put("video_path", String.class);
        map.put("body_beauty_level", Integer.class);
        map.put("enable_dim_light_quality", Boolean.class);
        map.put("enable_ai_night_video", Boolean.class);
        map.put("enable_video_stabilization", Boolean.class);
        map.put("enable_super_Stabilization", Boolean.class);
        map.put("enable_video_hdr", Boolean.class);
        map.put("video_fps", int[].class);
        map.put("aperture", Float.class);
        map.put("flash_mode", Integer.class);
        map.put("face_detect", Integer.class);
        map.put("exposure_compensation", Integer.class);
    }

    public static boolean LIZ(Object obj, String str) {
        Map<String, Class> map = LIZ;
        if (((HashMap) map).containsKey(str)) {
            if (obj == null || obj.getClass() == ((HashMap) map).get(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
