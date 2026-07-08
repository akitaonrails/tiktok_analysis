package X;

import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Auy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2194701Auy extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;
    public final boolean LIZLLL;

    public static JSONObject LJII(InterfaceC2194711Auz interfaceC2194711Auz) throws JSONException {
        Number errorCode;
        Number subErrorCode;
        String errorMsg;
        String adId;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC2194711Auz != null) {
            errorCode = interfaceC2194711Auz.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC2194711Auz == null || (subErrorCode = interfaceC2194711Auz.getSubErrorCode()) == null) {
            subErrorCode = 0;
        }
        jSONObject.put("sub_error_code", subErrorCode);
        if (interfaceC2194711Auz != null) {
            errorMsg = interfaceC2194711Auz.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC2194711Auz != null) {
            adId = interfaceC2194711Auz.getAdId();
        } else {
            adId = null;
        }
        jSONObject.put("adId", adId);
        if (interfaceC2194711Auz != null) {
            boolIsSuccess = interfaceC2194711Auz.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
        super.LIZLLL(number, jSONObject);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle, input:");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        if (jSONObject == null) {
            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
        }
        Activity activity = this.LIZJ.get();
        if (activity == null) {
            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
        }
        activity.runOnUiThread(new ARunnableS67S0300000_34(this, jSONObject, number, 0));
        return C1504590pFx.LIZJ(new JSONObject());
    }

    public C2194701Auy(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7, boolean z) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
        this.LIZLLL = z;
    }
}
