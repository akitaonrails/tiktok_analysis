package X;

import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2087408Fs {
    public static final ConcurrentHashMap<String, WeakReference<Typeface>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Typeface> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<C08GL, WeakReference<Typeface>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AtomicInteger> LIZLLL = new ConcurrentHashMap<>();

    public static void LIZ(int i, long j, String str) {
        try {
            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = LIZLLL;
            AtomicInteger atomicInteger = concurrentHashMap.get(str);
            if (atomicInteger == null) {
                concurrentHashMap.put(str, new AtomicInteger(1));
                return;
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            if (iIncrementAndGet > 2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", i);
                jSONObject.put("path", str);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("count", iIncrementAndGet);
                jSONObject2.put("size", j);
                C793770VBv.LJII("memory_typeface_dynamic", jSONObject, jSONObject2, null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
