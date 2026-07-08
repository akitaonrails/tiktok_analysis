package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08FQ {
    public static String LIZ() {
        Map<String, ConfigItem> map = C2502809rO.LIZ;
        n nVar = new n();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            Object objLJIIJJI = C0C59.LJ().LJIIJJI((String) entry.getKey(), false);
            if (objLJIIJJI instanceof Number) {
                nVar.LJJIII((Number) objLJIIJJI, str);
            } else if (objLJIIJJI instanceof Boolean) {
                nVar.LJJII((Boolean) objLJIIJJI, str);
            } else if (objLJIIJJI instanceof String) {
                nVar.LJJIIJ(str, (String) objLJIIJJI);
            } else if (objLJIIJJI instanceof Character) {
                nVar.LJJIFFI(str, objLJIIJJI == null ? m.LL : new q(objLJIIJJI));
            } else if (objLJIIJJI instanceof k) {
                nVar.LJJIFFI(str, (k) objLJIIJJI);
            } else if (objLJIIJJI == null) {
                nVar.LJJIFFI(str, null);
            }
        }
        return nVar.toString();
    }
}
