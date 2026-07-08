package X;

import Y.ARunnableS96S0200000_27;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801770wzH extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;
    public final boolean LIZLLL;

    public static JSONObject LJII(InterfaceC1801760wzG interfaceC1801760wzG) throws JSONException {
        Number errorCode;
        String errorMsg;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC1801760wzG != null) {
            errorCode = interfaceC1801760wzG.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC1801760wzG != null) {
            errorMsg = interfaceC1801760wzG.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC1801760wzG != null) {
            boolIsSuccess = interfaceC1801760wzG.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
        super.LIZLLL(number, jSONObject);
        if (this.LIZLLL) {
            return C1385490m9r.LIZ(this, number);
        }
        if (jSONObject == null) {
            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
        }
        Activity activity = this.LIZJ.get();
        if (activity == null) {
            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
        }
        activity.runOnUiThread(new ARunnableS96S0200000_27(this, jSONObject, number, 30));
        return C1504590pFx.LIZJ(new JSONObject());
    }

    public C1801770wzH(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7, boolean z) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
        this.LIZLLL = z;
    }
}
