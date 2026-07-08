package X;

import Y.ARunnableS56S0300000_23;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504580pFw extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC1504490pFn interfaceC1504490pFn) throws JSONException {
        Map<String, Object> response;
        Number httpCode;
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> header = null;
        if (interfaceC1504490pFn != null) {
            response = interfaceC1504490pFn.getResponse();
        } else {
            response = null;
        }
        jSONObject.put("response", response);
        if (interfaceC1504490pFn != null) {
            httpCode = interfaceC1504490pFn.getHttpCode();
        } else {
            httpCode = null;
        }
        jSONObject.put("httpCode", httpCode);
        if (interfaceC1504490pFn != null) {
            header = interfaceC1504490pFn.getHeader();
        }
        jSONObject.put("header", header);
        return jSONObject;
    }

    public C1504580pFw(WeakReference weakReference, AnonymousClass1520 anonymousClass1520) {
        super(anonymousClass1520);
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
        activity.runOnUiThread(new ARunnableS56S0300000_23(number, this, jSONObject, 25));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
