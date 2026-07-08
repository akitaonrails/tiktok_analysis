package X;

import Y.ARunnableS90S0200000_21;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397400mT4 extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC1397420mT6 interfaceC1397420mT6) throws JSONException {
        Boolean boolIsSuccess;
        JSONObject jSONObject = new JSONObject();
        String couponDiscount = null;
        if (interfaceC1397420mT6 != null) {
            boolIsSuccess = interfaceC1397420mT6.isSuccess();
        } else {
            boolIsSuccess = null;
        }
        jSONObject.put("is_success", boolIsSuccess);
        if (interfaceC1397420mT6 != null) {
            couponDiscount = interfaceC1397420mT6.getCouponDiscount();
        }
        jSONObject.put("coupon_discount", couponDiscount);
        return jSONObject;
    }

    public C1397400mT4(WeakReference weakReference, AnonymousClass1520 anonymousClass1520) {
        super(anonymousClass1520);
        this.LIZJ = weakReference;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
        super.LIZLLL(number, jSONObject);
        Activity activity = this.LIZJ.get();
        if (activity == null) {
            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
        }
        activity.runOnUiThread(new ARunnableS90S0200000_21(this, jSONObject, number, 41));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
