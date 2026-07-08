package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XBQ implements C0XD6 {
    public final Context LIZ;
    public C844770XBz LIZIZ;

    public C0XBQ(Context context) {
        this.LIZ = context;
    }

    @Override // X.C0XD6
    public final void LIZ(C0XBN c0xbn) {
        if (this.LIZIZ == null) {
            return;
        }
        c0xbn.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", c0xbn.LL);
            jSONObject.put("iid", c0xbn.LLILLJJLI);
            jSONObject.put("openudid", c0xbn.LLILLL);
            jSONObject.put("cliend_udid", c0xbn.LLILZ);
            jSONObject.put("ssid", c0xbn.LLILZIL);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        if (this.LIZIZ.LJJIIZ) {
            C810670Vr7.LIZJ(this.LIZ, 0, "ug_install_op_pref").edit().putString("install_info", strJ3).apply();
        }
        C824230WUz.LIZ(this.LIZ).LIZJ(this.LIZIZ.LIZ(), "install_info", strJ3);
    }
}
