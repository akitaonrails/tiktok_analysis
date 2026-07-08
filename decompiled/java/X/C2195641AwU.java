package X;

import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195641AwU extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;
    public final WeakReference<InterfaceC1877250yx1> LIZLLL;
    public final boolean LJ;
    public final InterfaceC1877250yx1 LJFF;

    public static JSONObject LJII(InterfaceC2195651AwV interfaceC2195651AwV) throws JSONException {
        if (interfaceC2195651AwV == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_code", interfaceC2195651AwV.getAuthCode());
        jSONObject.put("scopes", interfaceC2195651AwV.getScopes());
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, interfaceC2195651AwV.getStatus());
        jSONObject.put("error_code", interfaceC2195651AwV.getErrorCode());
        jSONObject.put("error_msg", interfaceC2195651AwV.getErrorMsg());
        return jSONObject;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
        super.LIZLLL(number, jSONObject);
        if (jSONObject == null) {
            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
        }
        Activity activity = this.LIZJ.get();
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS67S0300000_34(this, jSONObject, number, 22));
        }
        return C1504590pFx.LIZJ(new JSONObject());
    }

    public C2195641AwU(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7, WeakReference<InterfaceC1877250yx1> weakReference2, boolean z) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
        this.LIZLLL = weakReference2;
        this.LJ = z;
        this.LJFF = weakReference2.get();
    }
}
