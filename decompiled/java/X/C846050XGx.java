package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846050XGx extends AbstractC845940XGm<C846060XGy> {
    public static final /* synthetic */ int LJIIJJI = 0;
    public JSONObject LJIIIIZZ;
    public JSONObject LJIIIZ;
    public C0XO3 LJIIJ;

    @Override // X.AbstractC845940XGm
    public final /* bridge */ /* synthetic */ void LJ(C0XGA c0xga) {
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = jSONObject2;
        this.LJIIIZ = jSONObject;
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = jSONObject;
        this.LJIIIZ = jSONObject2;
        if (!TextUtils.isEmpty(this.LIZLLL.LJI) && this.LJIIIZ.optLong("user_id", 0L) > 0) {
            C0XO3 c0xo3 = new C0XO3(jSONObject);
            c0xo3.LIZ();
            this.LJIIJ = c0xo3;
        }
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C846060XGy c846060XGy = new C846060XGy(z);
        if (!z) {
            c846060XGy.LIZLLL = c845980XGq.LIZIZ;
            c846060XGy.LJFF = c845980XGq.LIZJ;
        } else {
            c846060XGy.LJIIIZ = this.LJIIJ;
        }
        c846060XGy.LJII = this.LJIIIIZZ;
        c846060XGy.LJIILJJIL = this.LJIIIZ;
        if (z) {
            c845980XGq.LIZ.getClass();
        }
        return c846060XGy;
    }

    public C846050XGx(Context context, C845960XGo c845960XGo, AbstractC846040XGw<C846060XGy> abstractC846040XGw) {
        super(context, c845960XGo, abstractC846040XGw);
    }

    public static C845960XGo LJIIJJI(String str, Map<String, String> map, Map<String, String> map2, boolean z) {
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = str;
        if (map != null) {
            HashMap map3 = (HashMap) map;
            if (!map3.isEmpty()) {
                if (c846070XGz.LIZJ == null) {
                    c846070XGz.LIZJ = new ArrayList();
                }
                for (Map.Entry entry : map3.entrySet()) {
                    ((ArrayList) c846070XGz.LIZJ).add(new C845840XGc((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        c846070XGz.LIZLLL(map2);
        if (z) {
            return c846070XGz.LIZIZ();
        }
        return c846070XGz.LJFF();
    }
}
