package X;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZZ extends AbstractC845940XGm<C0XZV> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C850790XZd LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_auth_login_only", this.LIZJ.LIZ("platform"), null, c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XZS.LIZIZ(this.LJIIIIZZ, jSONObject);
        C850790XZd c850790XZd = this.LJIIIIZZ;
        c850790XZd.LJIIIZ = jSONObject2;
        c850790XZd.LIZJ = jSONObject.optString("profile_key");
        C850790XZd c850790XZd2 = this.LJIIIIZZ;
        jSONObject.optString("shark_ticket");
        c850790XZd2.getClass();
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C850790XZd c850790XZd = this.LJIIIIZZ;
        C0XO3 c0xo3 = new C0XO3(jSONObject);
        c0xo3.LIZ();
        c850790XZd.LJFF = c0xo3;
        this.LJIIIIZZ.LJIIIZ = jSONObject;
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C0XZV c0xzv = new C0XZV(z, 1);
        if (z) {
            c0xzv.LJIIIZ = this.LJIIIIZZ.LJFF;
        } else {
            C850790XZd c850790XZd = this.LJIIIIZZ;
            c0xzv.LJIILIIL = c850790XZd.LIZJ;
            c0xzv.LIZLLL = c850790XZd.LIZ;
            c0xzv.LJFF = c850790XZd.LIZIZ;
        }
        c0xzv.LJII = this.LJIIIIZZ.LJIIIZ;
        return c0xzv;
    }

    public C0XZZ(Context context, C845960XGo c845960XGo, C851240XaM c851240XaM) {
        super(context, c845960XGo, c851240XaM);
        this.LJIIIIZZ = new C850790XZd();
    }
}
