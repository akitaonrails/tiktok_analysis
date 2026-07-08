package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2161008dM {
    public static final C2161008dM LIZ = new C2161008dM();
    public static final Map<String, C0K5J> LIZIZ = new LinkedHashMap();

    public static long LIZ(Context context) {
        Object c098200Yq;
        long j;
        ActivityManager activityManager;
        if (context == null) {
            return 0L;
        }
        try {
            Object objH2 = C786410Ut5.H2(context, "activity");
            if ((objH2 instanceof ActivityManager) && (activityManager = (ActivityManager) objH2) != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0+UwS097FVyDiiDNbpDzYZHGLODbaBqB2DneRw==", null));
                j = memoryInfo.totalMem - memoryInfo.availMem;
            } else {
                j = 0;
            }
            c098200Yq = Long.valueOf(j);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        return ((Number) c098200Yq).longValue();
    }
}
