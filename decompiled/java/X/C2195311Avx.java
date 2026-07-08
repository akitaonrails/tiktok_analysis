package X;

import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Avx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195311Avx extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;
    public final boolean LIZLLL;

    public static JSONObject LJII(InterfaceC2195321Avy interfaceC2195321Avy) throws JSONException {
        Number errorCode;
        String errorMsg;
        InterfaceC2195411Aw7 data;
        Number subErrorCode;
        JSONObject jSONObject = new JSONObject();
        Number number = 0;
        if (interfaceC2195321Avy == null || (errorCode = interfaceC2195321Avy.getErrorCode()) == null) {
            errorCode = number;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC2195321Avy != null && (subErrorCode = interfaceC2195321Avy.getSubErrorCode()) != null) {
            number = subErrorCode;
        }
        jSONObject.put("sub_error_code", number);
        if (interfaceC2195321Avy == null || (errorMsg = interfaceC2195321Avy.getErrorMsg()) == null) {
            errorMsg = "";
        }
        jSONObject.put("error_msg", errorMsg);
        Boolean boolIsSuccess = null;
        if (interfaceC2195321Avy != null) {
            data = interfaceC2195321Avy.getData();
        } else {
            data = null;
        }
        jSONObject.put("data", data);
        if (interfaceC2195321Avy != null) {
            boolIsSuccess = interfaceC2195321Avy.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) throws JSONException {
        super.LIZLLL(number, jSONObject);
        if (this.LIZLLL) {
            return C1385490m9r.LIZ(this, number);
        }
        if (jSONObject == null) {
            LJ(number, new JSONObject());
            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
        }
        Activity activity = this.LIZJ.get();
        if (activity == null) {
            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
        }
        activity.runOnUiThread(new ARunnableS67S0300000_34(this, jSONObject, number, 14));
        return C1504590pFx.LIZJ(new JSONObject());
    }

    public C2195311Avx(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7, boolean z) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
        this.LIZLLL = z;
    }
}
