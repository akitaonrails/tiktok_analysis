package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08GJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GJ {
    public static final LinkedHashMap<String, Pair<Long, Long>> LIZ = new LinkedHashMap<>(10, 0.75f, true);
    public static final LinkedHashMap<String, Boolean> LIZIZ = new LinkedHashMap<>(10, 0.75f, true);

    public static void LIZ(long j, String str) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = LIZ;
            synchronized (linkedHashMap) {
                try {
                    linkedHashMap.put(str, new Pair<>(Long.valueOf(j), 0L));
                    linkedHashMap.get(str);
                    if (linkedHashMap.size() > 10) {
                        Iterator<Map.Entry<String, Pair<Long, Long>>> it2 = linkedHashMap.entrySet().iterator();
                        it2.next();
                        it2.remove();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
