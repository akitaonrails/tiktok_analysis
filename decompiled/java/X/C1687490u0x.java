package X;

import androidx.lifecycle.Lifecycle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0u0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687490u0x {
    public final Map<String, String> LIZ;
    public long LIZIZ;
    public long LIZJ;

    public C1687490u0x(Lifecycle lifecycle, Map<String, String> map) {
        this.LIZ = map;
    }

    public static void LIZ(C1687490u0x c1687490u0x, Map map, long j) throws JSONException {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1687490u0x.getClass();
        JSONObject jSONObject = new JSONObject();
        C1862330yYx.LIZ.getClass();
        C1862330yYx.LLII(jSONObject, map);
        jSONObject.put("duration", j);
        c20235014FoLIZ.LIZIZ("tikbot_detail_page_stay_duration", jSONObject);
    }
}
