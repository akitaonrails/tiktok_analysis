package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524700pmO {
    public static final /* synthetic */ int LJ = 0;
    public final boolean LIZ;
    public JSONObject LIZIZ;
    public String LIZJ;
    public int LIZLLL;

    public final C1525120pn4 LIZIZ() throws JSONException {
        JSONObject jSONObject = this.LIZIZ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = this.LIZJ;
        jSONObject.put("errMsg", TextUtils.isEmpty(str) ? "" : String.valueOf(str));
        int i = this.LIZLLL;
        if (i != 0) {
            jSONObject.put("errNo", i);
        }
        return new C1525120pn4(jSONObject, this.LIZ);
    }

    public C1524700pmO(String str, String str2) {
        boolean z;
        if (str2 == "fail") {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
    }

    public final void LIZ(Object obj, String str) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new JSONObject();
        }
        try {
            this.LIZIZ.put(str, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
