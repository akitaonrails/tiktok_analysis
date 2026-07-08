package X;

import com.bytedance.scene.Scene;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0a71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922450a71 {
    public static void LIZ(String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("content_starling_key", str);
        map.put(Scene.SCENE_SERVICE, str2);
        C0KX4.LIZ("livesdk_guest_microphone_occupied_toast_show", map, null, true);
    }
}
