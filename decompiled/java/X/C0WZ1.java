package X;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: X.0WZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WZ1 {
    public static final boolean LIZ(C0WZ5 c0wz5, int i) {
        Float f;
        Map<Integer, Float> map = c0wz5.apiSampleRate;
        if ((map != null && (f = map.get(Integer.valueOf(i))) != null) || (f = c0wz5.defaultSampleRate) != null) {
            float fFloatValue = f.floatValue();
            if (fFloatValue > 0.0f) {
                if (fFloatValue >= 1.0f || ThreadLocalRandom.current().nextFloat() < fFloatValue) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
