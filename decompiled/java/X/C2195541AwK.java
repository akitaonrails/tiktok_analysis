package X;

import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195541AwK extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC2195551AwL interfaceC2195551AwL) throws JSONException {
        Number errorCode;
        String errorMsg;
        Boolean boolIsSufficient;
        InterfaceC2195571AwN data;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC2195551AwL != null) {
            errorCode = interfaceC2195551AwL.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC2195551AwL != null) {
            errorMsg = interfaceC2195551AwL.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        JSONObject jSONObject2 = new JSONObject();
        if (interfaceC2195551AwL != null && (data = interfaceC2195551AwL.getData()) != null) {
            boolIsSufficient = data.isSufficient();
        } else {
            boolIsSufficient = null;
        }
        jSONObject2.put("is_sufficient", boolIsSufficient);
        jSONObject.put("data", jSONObject2);
        if (interfaceC2195551AwL != null) {
            boolIsSuccess = interfaceC2195551AwL.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    public C2195541AwK(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7) {
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
        activity.runOnUiThread(new ARunnableS67S0300000_34(this, jSONObject, number, 15));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
