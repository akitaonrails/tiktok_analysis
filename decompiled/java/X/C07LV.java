package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07LV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07LV {
    public final Map<String, Object> LIZ;

    public C07LV(C07LU... c07luArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C07LU c07lu : c07luArr) {
            linkedHashMap.putAll(c07lu.LIZ());
        }
        this.LIZ = linkedHashMap;
    }
}
