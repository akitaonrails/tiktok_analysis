package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0osL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489950osL {
    public final Set<String> LIZ = new CopyOnWriteArraySet();

    public final void LIZ(JSONObject jSONObject) {
        ((CopyOnWriteArraySet) this.LIZ).clear();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dl");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    ((CopyOnWriteArraySet) this.LIZ).add(strOptString);
                }
            }
        }
    }

    public final void LIZIZ(Request request) {
        if (!C1489880osE.LJII(request.getPath(), this.LIZ)) {
            return;
        }
        Logger.debug();
        throw new C1489960osM();
    }
}
