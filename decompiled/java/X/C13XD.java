package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13XD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13XD extends AbstractC20444214zA {
    public final String LJI;

    public C13XD(String str, boolean z) {
        String string;
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "user");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "name");
            if (jSONObject.isNull("displayName")) {
                string = null;
            } else {
                string = JSONObjectProtectorUtils.getString(jSONObject, "displayName");
            }
            C13XF c13xf = new C13XF(string2, string, null);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", bundle);
            C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str, bundle);
            C786410Ut5.LJJIJ(bundle, "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", bundle2);
            C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str, bundle2);
            C786410Ut5.LJJIJ(bundle2, "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            super(bundle, bundle2, false, c13xf, null, z);
            this.LJI = str;
            if (C1212290heV.LIZ(str)) {
                return;
            }
            "requestJson must not be empty, and must be a valid JSON".toString();
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException("user.name must be defined in requestJson");
        }
    }
}
