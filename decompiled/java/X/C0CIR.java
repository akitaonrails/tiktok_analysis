package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0CIR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIR {
    public final Keva LIZ = Keva.getRepo("special_plus_keva");

    public final Effect LIZIZ() {
        String string = this.LIZ.getString("special_plus_effect", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (Effect) GsonProtectorUtils.fromJson(o.LIZIZ, string, Effect.class);
    }

    public final HashMap<String, Integer> LIZ(String str) {
        String string = "";
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            string = this.LIZ.getString("effect_video_plus_transformations_map_tab_fyp", "");
        } else if (Intrinsics.LJFF(str, "homepage_follow")) {
            string = this.LIZ.getString("effect_video_plus_transformations_map_tab_following", "");
        }
        HashMap<String, Integer> map = new HashMap<>();
        if (TextUtils.isEmpty(string)) {
            return map;
        }
        for (Map.Entry entry : ((HashMap) GsonProtectorUtils.fromJson(o.LIZIZ, string, HashMap.class)).entrySet()) {
            map.put(entry.getKey().toString(), Integer.valueOf((int) ((Double) entry.getValue()).doubleValue()));
        }
        return map;
    }

    public final void LIZJ(HashMap<String, Integer> map, String str) {
        String json = GsonProtectorUtils.toJson(o.LIZIZ, map);
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            this.LIZ.storeString("effect_video_plus_transformations_map_tab_fyp", json);
        } else {
            if (!Intrinsics.LJFF(str, "homepage_follow")) {
                return;
            }
            this.LIZ.storeString("effect_video_plus_transformations_map_tab_following", json);
        }
    }
}
