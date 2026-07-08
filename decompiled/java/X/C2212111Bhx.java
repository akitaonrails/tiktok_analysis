package X;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212111Bhx implements InterfaceC1031140cwK {
    public final SharedPreferences LIZ;
    public final SharedPreferences.Editor LIZIZ;

    public final void LIZ() {
        this.LIZIZ.apply();
    }

    public final void LIZIZ() {
        this.LIZIZ.commit();
    }

    public C2212111Bhx(Context context) {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "splash_ad_sp");
        this.LIZ = sharedPreferencesLIZJ;
        this.LIZIZ = sharedPreferencesLIZJ.edit();
        C2212291BiF.LIZLLL().LJIIIIZZ("service_splash_kv_type", 0, new JSONObject(), new JSONObject());
    }

    public final InterfaceC1031140cwK LIZJ(long j, String str) {
        this.LIZIZ.putLong(str, j);
        return this;
    }
}
