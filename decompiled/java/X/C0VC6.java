package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VC6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC6 {
    public static final ConcurrentHashMap<Long, Long> LIZIZ = new ConcurrentHashMap<>();
    public static C793800VBy LIZJ;
    public static C0VBD LIZLLL;
    public volatile boolean LIZ;

    public final synchronized void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        LIZJ = new C793800VBy(C0VC2.LJFF(), C0VC2.LIZIZ());
        C0VC3 c0vc3 = C793880VCg.LIZ;
        c0vc3.LIZJ = LIZJ;
        c0vc3.LIZ();
        C793810VBz c793810VBz = C793890VCh.LIZ;
        c793810VBz.getClass();
        C793980VCq.LIZ.LIZ(c793810VBz);
    }

    public final void LIZIZ(JSONObject jSONObject, long j) {
        JSONObject jSONObject2;
        JSONObject jSONObjectLIZ = jSONObject;
        try {
            if (!C793930VCl.LIZ.LIZIZ((int) j, jSONObjectLIZ)) {
                return;
            }
            ConcurrentHashMap<Long, Long> concurrentHashMap = LIZIZ;
            if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
                C0VC4 c0vc4LIZJ = C0VC4.LIZJ();
                synchronized (C0VC5.class) {
                    jSONObject2 = C0VC5.LIZIZ.get(Long.valueOf(j));
                }
                concurrentHashMap.put(Long.valueOf(j), Long.valueOf(c0vc4LIZJ.LIZLLL(jSONObject2, j)));
            }
            LIZ();
            try {
                if (JSONObjectProtectorUtils.getJSONObject(jSONObjectLIZ, "_debug_self") == null) {
                    jSONObjectLIZ.put("_debug_self", new JSONObject());
                }
                new JSONObject().put("sdk_report_from", "apm6");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C0VBD c0vbd = LIZLLL;
            if (c0vbd != null) {
                try {
                    jSONObjectLIZ = c0vbd.LIZ(jSONObjectLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            LIZJ.LJ(jSONObjectLIZ, j, LIZIZ.get(Long.valueOf(j)).longValue());
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C0VCY.LIZIZ("record", th2);
        }
    }
}
