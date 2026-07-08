package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.1B3X, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3X {
    public static final /* synthetic */ int LIZ = 0;

    public static C1B3J LIZ(Bundle bundle) {
        String value;
        String string;
        String string2;
        String strLIZ = C2198601B3a.LIZ(bundle);
        if (bundle == null || (value = bundle.getString("_bytedance_params_response_type")) == null) {
            value = C0TIZ.CODE.getValue();
        }
        if (bundle == null || (string = bundle.getString("_bytedance_params_source")) == null) {
            string = "native_v2";
        }
        String string3 = null;
        if (bundle != null) {
            string3 = bundle.getString("_bytedance_params_code_challenge");
            string2 = bundle.getString("_bytedance_params_redirect_uri");
        } else {
            string2 = null;
        }
        return new C1B3J(strLIZ, value, string, string3, string2);
    }
}
