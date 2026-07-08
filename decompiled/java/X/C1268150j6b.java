package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268150j6b extends AbstractC1268060j6S implements Serializable {
    public ArrayList<C1268270j6n> channels;
    public boolean needReport;

    public String toString() {
        StringBuilder sb = new StringBuilder("TTLHUpdateVideoStrategyParamsCommand{");
        ArrayList<C1268270j6n> arrayList = this.channels;
        if (arrayList == null || arrayList.isEmpty()) {
            sb.append("channels=null");
        } else {
            sb.append("channels={");
            boolean z = true;
            for (C1268270j6n c1268270j6n : this.channels) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(c1268270j6n);
                z = false;
            }
            sb.append("}");
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.UPDATE_VIDEO_STRATEGY_PARAMS;
    }

    public static C1268150j6b fromHaspMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        boolean z;
        try {
            C1268150j6b c1268150j6b = new C1268150j6b();
            c1268150j6b.channels = new ArrayList<>();
            c1268150j6b.parseReportMap(map, map2);
            map2.put("command", "updateEncParams");
            if (((Long) map.get("is_report")).longValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            c1268150j6b.needReport = z;
            if (map.get("channels") instanceof List) {
                List list = (List) map.get("channels");
                for (int i = 0; i < list.size(); i++) {
                    Object obj = list.get(i);
                    if (obj instanceof Map) {
                        JSONObject jSONObject = new JSONObject((Map) obj);
                        C1268250j6l c1268250j6l = new C1268250j6l(jSONObject.optInt("perf_fps", -1), jSONObject.optInt("perf_width", -1), jSONObject.optInt("perf_height", -1));
                        C1268250j6l c1268250j6l2 = new C1268250j6l(jSONObject.optInt("net_fps", -1), jSONObject.optInt("net_width", -1), jSONObject.optInt("net_height", -1));
                        int iOptInt = jSONObject.optInt("final_fps", -1);
                        int iOptInt2 = jSONObject.optInt("final_width", -1);
                        int iOptInt3 = jSONObject.optInt("final_height", -1);
                        int iOptInt4 = jSONObject.optInt("min_bps", -1);
                        int iOptInt5 = jSONObject.optInt("max_bps", -1);
                        int iOptInt6 = jSONObject.optInt("min_request_bps", -1);
                        C1268250j6l c1268250j6l3 = new C1268250j6l(iOptInt, iOptInt2, iOptInt3);
                        c1268150j6b.channels.add(new C1268270j6n(jSONObject.optInt("channel_index", -1), jSONObject.optInt("final_bps", -1), c1268250j6l, c1268250j6l2, c1268250j6l3, iOptInt4, iOptInt5, iOptInt6));
                    }
                }
            }
            return c1268150j6b;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
