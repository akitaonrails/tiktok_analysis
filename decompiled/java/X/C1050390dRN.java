package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050390dRN extends C09AY implements Function0<String> {
    public final /* synthetic */ C1050360dRK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050390dRN(C1050360dRK c1050360dRK) {
        super(0);
        this.LL = c1050360dRK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        try {
            JSONObject jSONObject = (JSONObject) this.LL.LLJIJIL.getValue();
            if (jSONObject != null) {
                return JSONObjectProtectorUtils.getString(jSONObject, "anchorData");
            }
            return null;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
