package X;

import Y.ARunnableS61S0300000_28;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ysE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874280ysE extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC1874250ysB interfaceC1874250ysB) throws JSONException {
        Number errorCode;
        String errorMsg;
        String value;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC1874250ysB != null) {
            errorCode = interfaceC1874250ysB.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC1874250ysB != null) {
            errorMsg = interfaceC1874250ysB.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC1874250ysB != null) {
            value = interfaceC1874250ysB.getValue();
        } else {
            value = null;
        }
        jSONObject.put("value", value);
        if (interfaceC1874250ysB != null) {
            boolIsSuccess = interfaceC1874250ysB.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    public C1874280ysE(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7) {
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
        activity.runOnUiThread(new ARunnableS61S0300000_28(this, jSONObject, number, 7));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
