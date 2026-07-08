package X;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1468, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1468 {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AnonymousClass1469> LIZJ = new ConcurrentHashMap<>();
    public static Function1<? super String, Boolean> LIZLLL;

    public static final void LIZ(String str) throws JSONException {
        int i;
        Long lRemove = LIZ.remove(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (lRemove != null) {
            long jLongValue = jUptimeMillis - lRemove.longValue();
            Long lRemove2 = LIZIZ.remove(str);
            long jCurrentThreadTimeMillis = 0;
            if (lRemove2 != null) {
                long jLongValue2 = lRemove2.longValue();
                if (jLongValue2 > 0) {
                    jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - jLongValue2;
                }
            }
            Function1<? super String, Boolean> function1 = LIZLLL;
            int i2 = 0;
            if (function1 != null && function1.invoke(str).booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            ConcurrentHashMap<String, AnonymousClass1469> concurrentHashMap = LIZJ;
            if (concurrentHashMap.get(str) != null) {
                i2 = 1;
            }
            AnonymousClass1469 anonymousClass1469 = new AnonymousClass1469(str, jLongValue, jCurrentThreadTimeMillis, i2, 0, i, 1, lRemove.longValue() - C202094145s.LJII, C786410Ut5.u3().getName());
            concurrentHashMap.put(str, anonymousClass1469);
            AnonymousClass1466.LIZ(anonymousClass1469, true);
        }
    }
}
