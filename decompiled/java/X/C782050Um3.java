package X;

import com.bytedance.android.live.broadcast.api.PerceptionAppealApi;
import com.bytedance.scene.Scene;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Um3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782050Um3 {
    public static final /* synthetic */ C782050Um3 LIZ = new C782050Um3();

    public static C11NZ LIZ(C782090Um7 c782090Um7) {
        HashMap<String, String> map = new HashMap<>();
        map.put(Scene.SCENE_SERVICE, String.valueOf(c782090Um7.LIZ));
        map.put("room_id", String.valueOf(c782090Um7.LIZIZ));
        map.put("punish_id", String.valueOf(c782090Um7.LIZJ));
        map.put("punish_type", c782090Um7.LIZLLL);
        C480460Ism.LIZ().getClass();
        return ((PerceptionAppealApi) C480460Ism.LIZLLL(PerceptionAppealApi.class)).perceptionAppeal(map);
    }
}
