package X;

import android.content.Context;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XH3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XH3 extends AbstractC845940XGm<C0XZV> {
    public static final List<Integer> LJIIIZ;
    public C0XO3 LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    static {
        new C0XH5();
        LJIIIZ = C1697810uHb.LJIIJJI(404, 500, 502, 503, 504, 17007);
    }

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) throws JSONException {
        String str;
        Map<String, String> map;
        JSONObject jSONObject = new JSONObject();
        C845960XGo c845960XGo = this.LIZJ;
        if (c845960XGo != null && (map = c845960XGo.LIZJ) != null) {
            str = map.get("target_region");
        } else {
            str = null;
        }
        jSONObject.put("request_target_region", str);
        C0XG9.LIZIZ("passport_one_tap_login_result", null, null, c0xga, jSONObject);
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = C0XZS.LIZJ(jSONObject, jSONObject2);
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C0XZV c0xzv = new C0XZV(z, -1);
        if (z) {
            c0xzv.LJIIIZ = this.LJIIIIZZ;
            return c0xzv;
        }
        c0xzv.LIZLLL = c845980XGq.LIZIZ;
        c0xzv.LJFF = c845980XGq.LIZJ;
        return c0xzv;
    }

    public C0XH3(Context context, C845960XGo c845960XGo, AbstractC846040XGw<C0XZV> abstractC846040XGw) {
        super(context, c845960XGo, abstractC846040XGw);
    }
}
