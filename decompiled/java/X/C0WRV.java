package X;

import Y.ARunnableS82S0200000_13;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WRV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WRV {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(long j, String str) throws JSONException {
        if (!C823240WRe.LIZ().LIZ(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", str);
        jSONObject.put("sdk_version", "6.22.0.1-bugfix");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("total_cost", j);
        C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS82S0200000_13(jSONObject2, (Object) null, 85));
    }
}
