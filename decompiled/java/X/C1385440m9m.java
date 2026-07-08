package X;

import Y.ARunnableS14S0500000_21;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385440m9m extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;
    public final WeakReference<InterfaceC1877250yx1> LIZLLL;
    public final boolean LJ;
    public final InterfaceC1877250yx1 LJFF;

    public static JSONObject LJII(InterfaceC1378550lyf interfaceC1378550lyf) throws JSONException {
        Number errorCode;
        String errorMsg;
        JSONObject jSONObject = new JSONObject();
        Boolean boolIsSuccess = null;
        if (interfaceC1378550lyf != null) {
            errorCode = interfaceC1378550lyf.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC1378550lyf != null) {
            errorMsg = interfaceC1378550lyf.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC1378550lyf != null) {
            boolIsSuccess = interfaceC1378550lyf.isSuccess();
        }
        jSONObject.put("is_success", boolIsSuccess);
        return jSONObject;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
        super.LIZLLL(number, jSONObject);
        if (this.LJ) {
            return C1385490m9r.LIZ(this, number);
        }
        if (jSONObject == null) {
            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
        }
        Activity activity = this.LIZJ.get();
        if (activity == null) {
            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
        }
        InterfaceC1877250yx1 interfaceC1877250yx1 = this.LIZLLL.get();
        if (interfaceC1877250yx1 == null) {
            interfaceC1877250yx1 = this.LJFF;
        }
        if (interfaceC1877250yx1 == null) {
            return C1504590pFx.LIZ(-1, null, "sparkViewDepend is null", new JSONObject());
        }
        activity.runOnUiThread(new ARunnableS14S0500000_21(this, jSONObject, activity, interfaceC1877250yx1, number, 2));
        return C1504590pFx.LIZJ(new JSONObject());
    }

    public C1385440m9m(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7, WeakReference<InterfaceC1877250yx1> weakReference2, boolean z) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
        this.LIZLLL = weakReference2;
        this.LJ = z;
        this.LJFF = weakReference2.get();
    }
}
