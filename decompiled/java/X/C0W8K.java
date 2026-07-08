package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W8K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8K {
    public static Bundle LIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null) {
                    String str2 = next;
                    C786410Ut5.LJJJI(str2, jSONObject.getString(str2), bundle);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            return bundle;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new Bundle();
        }
    }
}
