package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0gN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163030gN3 extends AbstractC1163040gN4 {
    public final String LIZ;
    public final C056T LIZIZ;

    @Override // X.AbstractC1163040gN4
    public final String LIZ() {
        return "myna_behavior_statistics";
    }

    @Override // X.AbstractC1163040gN4
    public final Map<String, Object> LIZIZ(Map<String, ? extends Object> map) {
        HashMap map2 = new HashMap();
        map2.put("from", this.LIZ);
        map2.put("behavior", this.LIZIZ.getValue());
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    public C1163030gN3(String str, C056T c056t) {
        this.LIZ = str;
        this.LIZIZ = c056t;
    }
}
