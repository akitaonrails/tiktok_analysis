package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.performance.PerformanceController;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309870kBt {
    public final String LIZ;
    public final HashMap<String, Long> LIZIZ = new HashMap<>();
    public boolean LIZJ;

    public final JavaOnlyMap LIZJ() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.LIZJ) {
            return javaOnlyMap;
        }
        javaOnlyMap.putString("pipelineOrigin", this.LIZ);
        javaOnlyMap.putMap("timestampMap", JavaOnlyMap.from(this.LIZIZ));
        return javaOnlyMap;
    }

    public C1309870kBt(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(String str) {
        if (this.LIZJ) {
            return;
        }
        this.LIZIZ.put(str, Long.valueOf(PerformanceController.LJIIIZ()));
    }

    public static C1309870kBt LIZ(String str, String str2, boolean z) {
        C1309870kBt c1309870kBt = new C1309870kBt(str);
        c1309870kBt.LIZJ = z;
        if (z) {
            return c1309870kBt;
        }
        long jLJIIIZ = PerformanceController.LJIIIZ();
        if (!c1309870kBt.LIZJ) {
            c1309870kBt.LIZIZ.put("pipelineStart", Long.valueOf(jLJIIIZ));
        }
        if (!c1309870kBt.LIZJ) {
            c1309870kBt.LIZIZ.put(str2, Long.valueOf(jLJIIIZ));
        }
        return c1309870kBt;
    }
}
