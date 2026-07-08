package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857110Xjp extends C09AY implements Function0<Map<String, String>> {
    public C857110Xjp() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        Map mapLIZ = C1656650tDD.LIZ();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(mapLIZ.size(), "num_of_loaded_components");
        int i = 0;
        for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
            String str = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            i += (int) jLongValue;
            c0lab.LIZIZ(jLongValue, str);
        }
        c0lab.LIZ(i, "duration_of_loaded_components");
        return c0lab.LIZ;
    }
}
