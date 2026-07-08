package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0zSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896870zSf {
    public boolean LIZ;
    public long LIZIZ;
    public Map<String, String> LIZJ;

    public final void LIZ() {
        if (this.LIZ) {
            this.LIZ = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ;
            Map linkedHashMap = this.LIZJ;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put("duration", String.valueOf(jElapsedRealtime));
            C1894320zOY.LIZ.getClass();
            C01U6.LIZJ(new AwS555S0100000_11(new HashMap(linkedHashMap), (HashMap<String, String>) 1475));
            this.LIZJ = null;
        }
    }
}
