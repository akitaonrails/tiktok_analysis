package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.13ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20162913ut {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, int i3, boolean z, String str) {
        String str2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        HashMap map = new HashMap();
        map.put("step", str);
        map.put(Scene.SCENE_SERVICE, String.valueOf(1));
        map.put("message_type", String.valueOf(i));
        map.put("element", String.valueOf(i2));
        map.put("action_type", String.valueOf(i3));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("handled", str2);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("tiktokec_rd_live_message_step", map);
    }
}
