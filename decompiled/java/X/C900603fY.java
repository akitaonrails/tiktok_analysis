package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C900603fY {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C900603fY(JSONObject jSONObject) {
        try {
            this.LIZ = jSONObject.optString("msg");
            this.LIZJ = jSONObject.optString("cashier_pre_check_type");
            this.LIZIZ = jSONObject.optString("cashier_pre_check_result");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ(e.toString());
        }
    }
}
