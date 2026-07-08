package X;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199111B4z extends AbstractC845940XGm {
    public C1B53 LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_mobile_get_qrcode", null, null, c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C1B53 c1b53 = new C1B53(true);
        this.LJIIIIZZ = c1b53;
        c1b53.LJII = jSONObject;
        jSONObject2.optString("qrcode");
        this.LJIIIIZZ.LJIIIZ = jSONObject2.optString("qrcode_index_url");
        this.LJIIIIZZ.LJIIJ = jSONObject2.optString("token");
        C1B53 c1b532 = this.LJIIIIZZ;
        jSONObject2.optString("app_name");
        c1b532.getClass();
        C1B53 c1b533 = this.LJIIIIZZ;
        jSONObject2.optString("web_name");
        c1b533.getClass();
        C1B53 c1b534 = this.LJIIIIZZ;
        jSONObject2.optLong("expire_time");
        c1b534.getClass();
        C1B53 c1b535 = this.LJIIIIZZ;
        jSONObject2.optBoolean("is_frontier");
        c1b535.getClass();
        C1B53 c1b536 = this.LJIIIIZZ;
        jSONObject2.optJSONObject("frontier_params");
        c1b536.getClass();
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C1B53 c1b53 = this.LJIIIIZZ;
        if (c1b53 == null) {
            c1b53 = new C1B53(z);
        } else {
            c1b53.LIZIZ = z;
        }
        if (!z) {
            c1b53.LIZLLL = c845980XGq.LIZIZ;
            c1b53.LJFF = c845980XGq.LIZJ;
        }
        return c1b53;
    }

    public C2199111B4z(Context context, C845960XGo c845960XGo, AbstractC1703710uR7 abstractC1703710uR7) {
        super(context, c845960XGo, abstractC1703710uR7);
    }
}
