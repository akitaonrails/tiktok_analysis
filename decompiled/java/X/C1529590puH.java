package X;

import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0puH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529590puH {
    public static final C1537060q6K LIZ = new C1537060q6K();
    public static final C01GW<Map<String, C1051630dTN>> LIZIZ = C452501pT.LIZIZ(new C1519440pdu());
    public static final C01GW<Handler> LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, new C1084050eJf());
    public static List<String> LIZLLL;
    public static List<String> LJ;
    public static final boolean LJFF;
    public static final boolean LJI;
    public static final C01GW<Set<String>> LJII;
    public static final C01GW<Boolean> LJIIIIZZ;

    static {
        Object c098200Yq;
        Object c098200Yq2;
        C1532960pzi.LIZJ(550000L, new Runnable() { // from class: X.0doH
            public static void LIZ() throws JSONException {
                if (C1535630q41.LJIJJLI) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    C1537060q6K c1537060q6K = C1529590puH.LIZ;
                    Iterator it2 = C1537060q6K.LJFF().entrySet().iterator();
                    int size = 0;
                    int i = 0;
                    while (it2.hasNext()) {
                        for (Map.Entry<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> entry : ((C1051630dTN) ((Map.Entry) it2.next()).getValue()).LJIIJ.snapshot().entrySet()) {
                            size += entry.getValue().size();
                            Iterator<T> it3 = entry.getValue().iterator();
                            int i2 = 0;
                            while (it3.hasNext()) {
                                if (((SoftReference) it3.next()).get() != null) {
                                    i2++;
                                }
                            }
                            i += i2;
                            if (i2 > 1) {
                                jSONObject.put(entry.getKey(), i2);
                            }
                        }
                    }
                    jSONObject.put("total_count", size);
                    jSONObject.put("valid_count", i);
                    jSONObject.put("released_count", size - i);
                    jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                    jSONObject.put("optimize_type", "prerender");
                    C1520360pfO c1520360pfO = new C1520360pfO("HybridCachePoolStatus");
                    c1520360pfO.LIZLLL = jSONObject;
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    C1520080pew.LIZ(null, c1520360pfO.LIZ());
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreloadTool$Companion@21ce.1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreloadTool$Companion@21ce.1");
            }
        });
        try {
            Object objLIZIZ = C1535630q41.LIZIZ("clean_cache_when_memory_insufficient");
            c098200Yq = objLIZIZ instanceof Boolean ? (Boolean) objLIZIZ : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        LJFF = bool != null ? bool.booleanValue() : false;
        try {
            Object objLIZIZ2 = C1535630q41.LIZIZ("release_out_of_date_cache_for_preload");
            c098200Yq2 = objLIZIZ2 instanceof Boolean ? (Boolean) objLIZIZ2 : null;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Boolean bool2 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        LJI = bool2 != null ? bool2.booleanValue() : false;
        LJII = C452501pT.LIZIZ(new C1532770pzP());
        LJIIIIZZ = C452501pT.LIZIZ(new C1532780pzQ());
    }
}
