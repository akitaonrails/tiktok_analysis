package X;

import Y.ARunnableS35S0400000_27;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801060wy8 extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC1801070wy9 interfaceC1801070wy9) throws JSONException {
        Number numberIsSubscribed;
        Number errorCode;
        String errorMsg;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC1801070wy9 != null) {
            numberIsSubscribed = interfaceC1801070wy9.isSubscribed();
        } else {
            numberIsSubscribed = null;
        }
        jSONObject.put("isSubscribed", numberIsSubscribed);
        if (interfaceC1801070wy9 != null) {
            errorCode = interfaceC1801070wy9.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC1801070wy9 != null) {
            errorMsg = interfaceC1801070wy9.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC1801070wy9 != null) {
            boolIsSuccess = interfaceC1801070wy9.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    public C1801060wy8(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7) {
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
        activity.runOnUiThread(new ARunnableS35S0400000_27(this, jSONObject, activity, number, 3));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
