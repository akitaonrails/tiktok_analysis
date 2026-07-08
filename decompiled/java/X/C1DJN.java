package X;

import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1DJN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DJN {
    public static final Map<String, Class> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put("facing", Integer.class);
        map.put("device_support_wide_angle_mode", Integer.class);
        map.put("device_support_antishake_mode", Integer.class);
        map.put("device_support_ai_night_video", Integer.class);
        map.put("support_light_soft", Boolean.class);
        map.put("support_wide_angle", Boolean.class);
        map.put("support_telephoto", Boolean.class);
        map.put("support_body_beauty", Boolean.class);
        map.put("support_anti_shake", Boolean.class);
        map.put("support_fps_480", Boolean.class);
        map.put("support_fps_120", Boolean.class);
        map.put("support_fps_60", Boolean.class);
        map.put("support_preview_sizes", ArrayList.class);
        map.put("support_picture_sizes", ArrayList.class);
        map.put("camera_preview_size", TEFrameSizei.class);
        map.put("camera_focus_parameters", TEFocusParameters.class);
        map.put("camera_torch_supported", Boolean.class);
        map.put("support_video_sizes", ArrayList.class);
        map.put("camera_support_fps_range", ArrayList.class);
        map.put("device_should_use_shader_zoom", Boolean.class);
        map.put("device_support_multicamera_zoom", Boolean.class);
    }
}
