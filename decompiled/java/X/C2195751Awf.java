package X;

import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Awf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195751Awf extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC2195741Awe interfaceC2195741Awe) throws JSONException {
        Number errorCode;
        String errorMsg;
        Number subErrorCode;
        Boolean boolIsSuccess;
        String tradeOrderId;
        InterfaceC2195881Aws data;
        InterfaceC2195881Aws data2;
        JSONObject jSONObject = new JSONObject();
        String subscriptionId = null;
        if (interfaceC2195741Awe != null) {
            errorCode = interfaceC2195741Awe.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC2195741Awe != null) {
            errorMsg = interfaceC2195741Awe.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        if (interfaceC2195741Awe == null || (subErrorCode = interfaceC2195741Awe.getSubErrorCode()) == null) {
            subErrorCode = 0;
        }
        jSONObject.put("sub_error_code", subErrorCode);
        if (interfaceC2195741Awe != null) {
            boolIsSuccess = interfaceC2195741Awe.isSuccess();
        } else {
            boolIsSuccess = null;
        }
        jSONObject.put("is_success", boolIsSuccess);
        JSONObject jSONObject2 = new JSONObject();
        if (interfaceC2195741Awe != null && (data2 = interfaceC2195741Awe.getData()) != null) {
            tradeOrderId = data2.getTradeOrderId();
        } else {
            tradeOrderId = null;
        }
        jSONObject2.put("trade_order_id", tradeOrderId);
        if (interfaceC2195741Awe != null && (data = interfaceC2195741Awe.getData()) != null) {
            subscriptionId = data.getSubscriptionId();
        }
        jSONObject2.put("subscription_id", subscriptionId);
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    public C2195751Awf(WeakReference weakReference, AnonymousClass1520 anonymousClass1520) {
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
        activity.runOnUiThread(new ARunnableS67S0300000_34(this, jSONObject, number, 11));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
