package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC2081208Di implements Callable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    public /* synthetic */ CallableC2081208Di(int i, boolean z, int i2) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.LL;
        boolean z = this.LLILLJJLI;
        int i2 = this.LLILLL;
        C1C7U.LIZ("AwemeEmptyMonitorUtils@abd8.monitorRequest$1L");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("request", "request");
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("curCount", i2);
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C794240VDq.LIZJ("aweme_favorite_list_data_log", jSONObject2);
        C1C7U.LIZIZ("AwemeEmptyMonitorUtils@abd8.monitorRequest$1L");
        return null;
    }
}
