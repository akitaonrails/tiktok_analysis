package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12862051o {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C703940RjM());

    public static final void LIZ(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C793770VBv.LJII("feed_platform_config_multi_scene_parse_error", jSONObject, null, null);
    }
}
