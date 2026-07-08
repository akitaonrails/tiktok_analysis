package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09mA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2470409mA {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final List<StackTraceElement> LJ;
    public final int LJFF;

    public static String LIZ(List<StackTraceElement> list) {
        int i;
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        int i2 = size / 2;
        if (size > 128) {
            int i3 = (size - 128) / 2;
            i = i2 + (size - i3);
            i2 -= i3;
        } else {
            i = i2;
        }
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("traceSize: ");
            sbLIZ.append(size);
            C792910V8n.LIZLLL("APM-Alloc-ReportInfo", C2188811AlT.LIZIZ(sbLIZ));
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append("at ");
            sb.append(ListProtector.get(list, i4));
            sb.append("\n");
        }
        if (size > 128) {
            sb.append("... skip ");
            sb.append(size - 128);
            sb.append(" lines\n");
        }
        while (i < size) {
            sb.append("at ");
            sb.append(ListProtector.get(list, i));
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }

    public final JSONObject LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("object_class", this.LIZ);
            jSONObject2.put("count", this.LIZIZ);
            jSONObject2.put("size", this.LIZJ);
            jSONObject2.put("exception_type", this.LJFF);
            String strLIZ = LIZ(this.LJ);
            jSONObject2.put("stack", strLIZ);
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stacks: ");
                sbLIZ.append(strLIZ);
                C792910V8n.LIZLLL("APM-Alloc-ReportInfo", C2188811AlT.LIZIZ(sbLIZ));
            }
            jSONObject.put("alloc_scene", this.LIZLLL);
            jSONObject2.put("filters", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C2470409mA(String str, int i, List list, int i2, int i3, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LJFF = i3;
        this.LIZLLL = str2;
        this.LJ = list;
    }
}
