package X;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XBJ extends C0XB9 {
    public final C844770XBz LJ;
    public final C844630XBl LJFF;

    @Override // X.C0XB9
    public final boolean LIZ(JSONObject jSONObject) throws JSONException {
        SharedPreferences sharedPreferencesLIZ = this.LJFF.LIZ(this.LJ);
        String deviceId = ((C0XBK) C0XBH.LIZ(C0XBK.class, String.valueOf(this.LJ.LIZ))).getDeviceId();
        String string = sharedPreferencesLIZ.getString("bd_did", null);
        String string2 = sharedPreferencesLIZ.getString("install_id", null);
        String string3 = sharedPreferencesLIZ.getString("ssid", null);
        C2123908Tt.LJFF("install_id", string2, jSONObject);
        C2123908Tt.LJFF("device_id", deviceId, jSONObject);
        C2123908Tt.LJFF("ssid", string3, jSONObject);
        C2123908Tt.LJFF("bd_did", string, jSONObject);
        return true;
    }

    @Override // X.C0XB9
    public final void LIZIZ(JSONObject jSONObject) {
        jSONObject.remove("bd_did");
        jSONObject.remove("install_id");
        jSONObject.remove("ssid");
        jSONObject.remove("device_id");
    }

    public C0XBJ(C844770XBz c844770XBz, C844630XBl c844630XBl) {
        this.LJ = c844770XBz;
        this.LJFF = c844630XBl;
    }
}
