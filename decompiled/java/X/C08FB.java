package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: X.08FB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08FB {
    public static final Map<String, String> LIZ;

    static {
        Map<String, String> mapEmptyMap;
        try {
            Field declaredField = C08ED.class.getDeclaredField("LIZ");
            declaredField.setAccessible(true);
            mapEmptyMap = (Map) declaredField.get(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mapEmptyMap = Collections.emptyMap();
        }
        LIZ = mapEmptyMap;
    }
}
