package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792340V6i implements InterfaceC792300V6e {
    public static final boolean LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        String strOptString = jSONObject.optString("traceparent");
        if (TextUtils.isEmpty(strOptString)) {
            return false;
        }
        String[] strArrSplit = strOptString.split("-");
        if (strArrSplit.length <= 0) {
            return false;
        }
        byte b = CastByteProtector.parseByte(strArrSplit[strArrSplit.length - 1]);
        C792750V7x.LIZIZ().getClass();
        if ((b & 1) <= 0) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("single_point_only", 1);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
