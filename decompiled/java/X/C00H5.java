package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00H5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00H5 {
    public final Map<String, Integer> LIZ;
    public final int LIZIZ;
    public final Map<String, Float> LIZJ;

    public final int LIZ() {
        float fFloatValue = 0.0f;
        for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
            Object key = entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            Float f = (Float) ((LinkedHashMap) this.LIZJ).get(key);
            fFloatValue += iIntValue * (f != null ? f.floatValue() : 0.0f);
        }
        return C13LZ.LJ((int) ((fFloatValue / this.LIZIZ) * 100.0f), 0, 100);
    }

    public C00H5(Map<String, Integer> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            linkedHashMap.put(key, Integer.valueOf(iIntValue));
        }
        this.LIZ = linkedHashMap;
        int iLJZI = C13LP.LJZI(linkedHashMap.values());
        this.LIZIZ = iLJZI < 1 ? 1 : iLJZI;
        this.LIZJ = new LinkedHashMap();
    }

    public final synchronized int LIZIZ(float f, String str) {
        Integer num = (Integer) ((LinkedHashMap) this.LIZ).get(str);
        if (num != null) {
            num.intValue();
            float fFloatValue = 0.0f;
            float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
            Float f2 = (Float) ((LinkedHashMap) this.LIZJ).get(str);
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            }
            if (fLIZLLL > fFloatValue) {
                this.LIZJ.put(str, Float.valueOf(fLIZLLL));
            }
            return LIZ();
        }
        return LIZ();
    }
}
