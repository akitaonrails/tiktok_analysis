package X;

import android.content.Context;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199101B4y extends AbstractC845940XGm {
    public C1B54 LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_mobile_check_qrconnect", null, null, c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.LJIIIIZZ = new C1B54(true);
        jSONObject2.optString("qrcode");
        this.LJIIIIZZ.LJIILJJIL = jSONObject2.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C1B54 c1b54 = this.LJIIIIZZ;
        jSONObject2.optString("app_name");
        c1b54.getClass();
        C1B54 c1b542 = this.LJIIIIZZ;
        jSONObject2.optString("web_name");
        c1b542.getClass();
        C1B54 c1b543 = this.LJIIIIZZ;
        jSONObject2.optString("qrcode_index_url");
        c1b543.getClass();
        C1B54 c1b544 = this.LJIIIIZZ;
        jSONObject2.optString("token");
        c1b544.getClass();
        C1B54 c1b545 = this.LJIIIIZZ;
        jSONObject2.optString("redirect_url");
        c1b545.getClass();
        C1B54 c1b546 = this.LJIIIIZZ;
        jSONObject2.optString("extra");
        c1b546.getClass();
        C1B54 c1b547 = this.LJIIIIZZ;
        jSONObject2.optInt("scan_app_id");
        c1b547.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("user_data");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.put("data", jSONObjectOptJSONObject);
            this.LJIIIIZZ.LJIIIZ = C0XZS.LIZJ(jSONObject, jSONObjectOptJSONObject);
        }
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C1B54 c1b54 = this.LJIIIIZZ;
        if (c1b54 == null) {
            c1b54 = new C1B54(z);
        } else {
            c1b54.LIZIZ = z;
        }
        if (!z) {
            c1b54.LIZLLL = c845980XGq.LIZIZ;
            c1b54.LJFF = c845980XGq.LIZJ;
        }
        return c1b54;
    }

    public C2199101B4y(Context context, C845960XGo c845960XGo, AbstractC1703720uR8 abstractC1703720uR8) {
        super(context, c845960XGo, abstractC1703720uR8);
    }
}
