package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050270dRB extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C1050260dRA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050270dRB(C1050260dRA c1050260dRA) {
        super(0);
        this.LL = c1050260dRA;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        try {
            String str = (String) this.LL.LLJILJIL.getValue();
            if (str != null) {
                return Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(str), "partnerScence"));
            }
            return null;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
