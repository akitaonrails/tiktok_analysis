package X;

import Y.ARunnableS56S0300000_23;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504700pG8 extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC1504660pG4 interfaceC1504660pG4) throws JSONException {
        Number errorCode;
        String errorMsg;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC1504660pG4 != null) {
            errorCode = interfaceC1504660pG4.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC1504660pG4 != null) {
            errorMsg = interfaceC1504660pG4.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC1504660pG4 != null) {
            boolIsSuccess = interfaceC1504660pG4.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    public C1504700pG8(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
        super.LIZLLL(number, jSONObject);
        if (jSONObject == null) {
            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
        }
        Activity activity = this.LIZJ.get();
        if (activity == null) {
            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
        }
        activity.runOnUiThread(new ARunnableS56S0300000_23(number, this, jSONObject, 15));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
