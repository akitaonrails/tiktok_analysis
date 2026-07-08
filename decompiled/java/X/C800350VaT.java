package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C800350VaT {
    public static final long LIZLLL = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public static C800350VaT LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C800350VaT(JSONObjectProtectorUtils.getString(jSONObject, "token"), JSONObjectProtectorUtils.getString(jSONObject, "appVersion"), JSONObjectProtectorUtils.getLong(jSONObject, "timestamp"));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return new C800350VaT(str, null, 0L);
    }

    public C800350VaT(String str, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
    }
}
