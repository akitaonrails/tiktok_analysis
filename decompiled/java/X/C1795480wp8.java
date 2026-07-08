package X;

import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1795480wp8 extends AbstractC1796070wq5<C0VCC> {
    public static final C0VCC LIZ() {
        JSONObject jSONObject = new JSONObject();
        C1795500wpA c1795500wpA = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ;
        final C844640XBm c844640XBm = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZIZ;
        try {
            jSONObject.put("device_id", c1795500wpA.LIZLLL);
            jSONObject.put("host_aid", c844640XBm.LIZ);
            jSONObject.put("sdk_version", "1.0");
            jSONObject.put("channel", c844640XBm.LJ);
            jSONObject.put("app_version", c844640XBm.LIZIZ);
            jSONObject.put("update_version_code", c844640XBm.LIZLLL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(c1795500wpA.LIZJ) ? "https://mon.isnssdk.com/monitor" : c1795500wpA.LIZJ);
        sb.append("/monitor/appmonitor/v2/settings");
        SDKMonitorUtils.setConfigUrl("4108", Collections.singletonList(sb.toString()));
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://mon.isnssdk.com/monitor/collect/");
        arrayList.add("https://i.isnssdk.com/monitor/collect/");
        SDKMonitorUtils.setDefaultReportUrl("4108", arrayList);
        SDKMonitorUtils.initMonitor(((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ, "4108", jSONObject, new C0VCZ() { // from class: X.0XBn
            @Override // X.C0VCZ
            public final String getSessionId() {
                return null;
            }

            @Override // X.C0VCZ
            public final Map<String, String> getCommonParams() {
                HashMap map = new HashMap();
                if (c844640XBm.LJI) {
                    map.put("oversea", "1");
                    return map;
                }
                map.put("oversea", CardStruct.IStatusCode.DEFAULT);
                return map;
            }
        });
        return SDKMonitorUtils.getInstance("4108");
    }
}
