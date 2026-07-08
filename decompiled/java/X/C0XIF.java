package X;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XIF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XIF extends AbstractC845940XGm<C0XIG> {
    public static final /* synthetic */ int LJIIJ = 0;
    public C0XIG LJIIIIZZ;
    public final SharedPreferences LJIIIZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_account_info", null, null, c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XIG c0xig = new C0XIG(false);
        this.LJIIIIZZ = c0xig;
        c0xig.LJII = jSONObject2;
        if (jSONObject.has("name")) {
            C0XIG c0xig2 = this.LJIIIIZZ;
            jSONObject.optString("name");
            c0xig2.getClass();
        } else {
            if (!jSONObject.has("error_name")) {
                return;
            }
            C0XIG c0xig3 = this.LJIIIIZZ;
            jSONObject.optString("error_name");
            c0xig3.getClass();
        }
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XIG c0xig = new C0XIG(true);
        this.LJIIIIZZ = c0xig;
        c0xig.LJII = jSONObject;
        c0xig.LJIIIZ = C0XZS.LIZJ(jSONObject, jSONObject2);
        if (jSONObject2.has("device_migrate_time")) {
            this.LJIIIZ.edit().putLong("device_migrate_time", jSONObject2.optLong("device_migrate_time", 0L)).apply();
        }
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C0XIG c0xig = this.LJIIIIZZ;
        if (c0xig == null) {
            c0xig = new C0XIG(z);
        } else {
            c0xig.LIZIZ = z;
        }
        if (!z) {
            c0xig.LIZLLL = c845980XGq.LIZIZ;
            c0xig.LJFF = c845980XGq.LIZJ;
        }
        return c0xig;
    }

    public C0XIF(Context context, C845960XGo c845960XGo, C0XIE c0xie) {
        super(context, c845960XGo, c0xie);
        this.LJIIIZ = C810670Vr7.LIZJ(C786410Ut5.N3(context), 0, "account_info_device_info");
    }
}
