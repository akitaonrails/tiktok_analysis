package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01TR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01TR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TR(String str, JSONObject jSONObject) {
        super(0);
        this.LL = jSONObject;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        JSONObject jSONObject = this.LL;
        try {
            JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
            String strOptString = jSONObject2.optString("process_id");
            if (strOptString != null && strOptString.length() != 0) {
                for (Map.Entry entry : ((LinkedHashMap) C1862700yZY.LIZIZ(strOptString, C1862700yZY.LIZ)).entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str2 != null) {
                        jSONObject2.put(str, str2);
                    }
                }
            }
            jSONObject = jSONObject2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str3 = this.LLILLJJLI;
        C01TQ.LIZ.getClass();
        if (((Boolean) C01TS.LIZ.getValue()).booleanValue() && TakoEnterMethodListExperiment.LIZ(false) && C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            C23250099c.LIZLLL(C01TQ.LIZIZ, null, null, new C316301Kn(str3, null, jSONObject), 3);
        } else {
            C20684815ws.LJIJ(str3, jSONObject);
        }
        return Unit.LIZ;
    }
}
