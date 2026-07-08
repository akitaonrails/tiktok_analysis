package X;

import Y.ARunnableS60S0300000_27;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801000wy2 extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC1796870wrN interfaceC1796870wrN) throws JSONException {
        Number errorCode;
        String errorMsg;
        Boolean canReceiveReward;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC1796870wrN != null) {
            errorCode = interfaceC1796870wrN.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC1796870wrN != null) {
            errorMsg = interfaceC1796870wrN.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC1796870wrN != null) {
            canReceiveReward = interfaceC1796870wrN.getCanReceiveReward();
        } else {
            canReceiveReward = null;
        }
        jSONObject.put("canReceiveReward", canReceiveReward);
        if (interfaceC1796870wrN != null) {
            boolIsSuccess = interfaceC1796870wrN.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    public C1801000wy2(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7) {
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
        activity.runOnUiThread(new ARunnableS60S0300000_27(this, jSONObject, activity, number, 15));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
