package X;

import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195371Aw3 extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;
    public final boolean LIZLLL;

    public static JSONObject LJII(InterfaceC2195381Aw4 interfaceC2195381Aw4) throws JSONException {
        Number errorCode;
        String errorMsg;
        Number subErrorCode;
        InterfaceC2195431Aw9 data;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC2195381Aw4 != null) {
            errorCode = interfaceC2195381Aw4.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC2195381Aw4 != null) {
            errorMsg = interfaceC2195381Aw4.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC2195381Aw4 == null || (subErrorCode = interfaceC2195381Aw4.getSubErrorCode()) == null) {
            subErrorCode = 0;
        }
        jSONObject.put("sub_error_code", subErrorCode);
        if (interfaceC2195381Aw4 != null) {
            data = interfaceC2195381Aw4.getData();
        } else {
            data = null;
        }
        jSONObject.put("data", data);
        if (interfaceC2195381Aw4 != null) {
            boolIsSuccess = interfaceC2195381Aw4.isSuccess();
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
        activity.runOnUiThread(new ARunnableS67S0300000_34(this, jSONObject, number, 12));
        return C1504590pFx.LIZJ(new JSONObject());
    }

    public C2195371Aw3(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7, boolean z) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
        this.LIZLLL = z;
    }
}
