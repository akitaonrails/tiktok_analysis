package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0clu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024680clu {
    public final C1023950ckj LIZ = new LinkedHashMap<String, Float>() { // from class: X.0ckj
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Float> entry) {
            if (size() > 20) {
                return true;
            }
            return false;
        }
    };
    public String LIZIZ;

    public final void LIZ(float f) {
        Float f2 = get(this.LIZIZ);
        if (f2 == null || f2.floatValue() < f) {
            put(this.LIZIZ, Float.valueOf(f));
        }
    }
}
