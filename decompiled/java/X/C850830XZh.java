package X;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850830XZh extends AbstractC845940XGm<C850850XZj> {
    public static final /* synthetic */ int LJIIL = 0;
    public final C850860XZk LJIIIIZZ;
    public boolean LJIIIZ;
    public C0XO3 LJIIJ;
    public JSONObject LJIIJJI;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        String str;
        String str2;
        if (this.LJIIIZ) {
            str = "passport_mobile_reset_password";
            str2 = "mobile";
        } else {
            str = "passport_email_reset_password";
            str2 = "email";
        }
        C0XG9.LIZIZ(str, str2, "force_reset_pw", c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
        this.LJIIIIZZ.LJ = jSONObject2;
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIJ = C0XZS.LIZJ(jSONObject, jSONObject2);
        this.LJIIJJI = jSONObject2;
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        int i;
        if (this.LJIIIZ) {
            i = 1010;
        } else {
            i = 10002;
        }
        C850860XZk c850860XZk = this.LJIIIIZZ;
        JSONObject jSONObject = this.LJIIJJI;
        C850850XZj c850850XZj = new C850850XZj(z, i, c850860XZk, jSONObject, jSONObject.optString("captcha"), this.LJIIJ);
        if (!z) {
            c850850XZj.LIZLLL = c845980XGq.LIZIZ;
            String str = c845980XGq.LIZJ;
            if (str != null && str.length() > 0) {
                c850850XZj.LJFF = c845980XGq.LIZJ;
            } else {
                c850850XZj.LJFF = this.LJIIJJI.optString("description");
                return c850850XZj;
            }
        }
        return c850850XZj;
    }

    public C850830XZh(Context context, C845960XGo c845960XGo, C850860XZk c850860XZk, C850840XZi c850840XZi) {
        super(context, c845960XGo, c850840XZi);
        this.LJIIIIZZ = c850860XZk;
        this.LJIIJJI = new JSONObject();
    }
}
