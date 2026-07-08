package X;

import com.bytedance.scene.Scene;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0XW8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XW8 {
    public static C11KZ LIZ(String str, String str2, C0XWB c0xwb) {
        HashMap map = new HashMap();
        map.put("user_id", str);
        map.put("aid", String.valueOf(1233));
        map.put("cloud_token", str2);
        map.put(Scene.SCENE_SERVICE, String.valueOf(c0xwb.getServerCode()));
        map.put("client_rec", "");
        return AbstractC19483511Kn.LJ(new C0XWS("/passport/cloud_token/login/", map));
    }
}
