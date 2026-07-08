package X;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VRO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VRO implements C0VRP {
    public final /* synthetic */ Context LIZ;

    public C0VRO(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("https://mon.tiktokv.com/monitor/appmonitor/v2/settings");
        arrayList2.add("https://mon.tiktokv.com/monitor/collect/");
        SDKMonitorUtils.setConfigUrl("1385", arrayList);
        SDKMonitorUtils.setDefaultReportUrl("1385", arrayList2);
        SDKMonitorUtils.initMonitor(C786410Ut5.N3(this.LIZ), "1385", C0VJT.LIZ(jSONObject), new C0VCZ() { // from class: X.07Rj
            @Override // X.C0VCZ
            public final String getSessionId() {
                return null;
            }

            @Override // X.C0VCZ
            public final Map<String, String> getCommonParams() {
                HashMap map = new HashMap();
                map.put("oversea", "1");
                return map;
            }
        });
    }
}
