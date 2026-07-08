package X;

import X.InterfaceC1477220oXo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N9X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0N9X<T extends InterfaceC1477220oXo> {
    public final List<T> LIZ;
    public final List<T> LIZIZ;
    public final String LIZJ = null;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("input_quality_type", LIZIZ(this.LIZ));
            jSONObject.put("output_quality_type", LIZIZ(this.LIZIZ));
            jSONObject.put("filters", this.LIZJ);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static String LIZIZ(List list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            sb.append(((InterfaceC1477220oXo) ListProtector.get(list, 0)).getQualityType());
            for (int i = 1; i < list.size(); i++) {
                sb.append(",");
                sb.append(((InterfaceC1477220oXo) ListProtector.get(list, i)).getQualityType());
            }
        }
        return sb.toString();
    }

    public C0N9X(List list, List list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
