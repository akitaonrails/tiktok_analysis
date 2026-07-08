package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZW extends AbstractC845940XGm<C0XZV> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C850780XZc LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        String str;
        if (!TextUtils.isEmpty(c0xga.LIZJ)) {
            if (c0xga.LIZJ.contains(C0XH1.LIZ("/passport/auth/bind_with_mobile_login/"))) {
                str = "passport_auth_bind_with_mobile_login_click";
            } else if (c0xga.LIZJ.contains(C0XH1.LIZ("/passport/auth/share_login/"))) {
                str = "passport_auth_share_login";
            } else {
                str = "passport_oauth_login_click";
            }
            C0XG9.LIZIZ(str, this.LIZJ.LIZ("platform"), "login", c0xga, null);
        }
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XZS.LIZIZ(this.LJIIIIZZ, jSONObject);
        C850780XZc c850780XZc = this.LJIIIIZZ;
        c850780XZc.LJIIIZ = jSONObject2;
        c850780XZc.LIZJ = jSONObject.optString("profile_key");
        C850780XZc c850780XZc2 = this.LJIIIIZZ;
        jSONObject.optString("shark_ticket");
        c850780XZc2.getClass();
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C850780XZc c850780XZc = this.LJIIIIZZ;
        C0XO3 c0xo3 = new C0XO3(jSONObject);
        c0xo3.LIZ();
        c850780XZc.LJFF = c0xo3;
        this.LJIIIIZZ.LJIIIZ = jSONObject;
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C0XZV c0xzv = new C0XZV(z, 1);
        if (z) {
            c0xzv.LJIIIZ = this.LJIIIIZZ.LJFF;
        } else {
            C850780XZc c850780XZc = this.LJIIIIZZ;
            c0xzv.LIZLLL = c850780XZc.LIZ;
            c0xzv.LJFF = c850780XZc.LIZIZ;
            c0xzv.LJIILIIL = c850780XZc.LIZJ;
        }
        c0xzv.LJII = this.LJIIIIZZ.LJIIIZ;
        return c0xzv;
    }

    public C0XZW(Context context, C845960XGo c845960XGo, C851240XaM c851240XaM) {
        super(context, c845960XGo, c851240XaM);
        this.LJIIIIZZ = new C850780XZc();
    }
}
