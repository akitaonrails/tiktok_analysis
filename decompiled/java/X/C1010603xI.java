package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03xI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1010603xI {
    public static final Map<String, Object> LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            return linkedHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.get(next));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    public static final String LIZIZ(LaneParams laneParams) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<String, Object> entry : laneParams.entrySet()) {
            if (entry.getValue() != null) {
                sb.append("\n\t");
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(String.valueOf(entry.getValue()));
                sb.append(",");
            }
        }
        if (sb.length() > 1) {
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public static final void LIZJ(LaneParams laneParams, String str) {
        if (str == null) {
            return;
        }
        try {
            laneParams.withNotCheckParams(LIZ(str));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
