package X;

import android.net.TrafficStats;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1966707n7 {
    public static final Method LIZ;
    public static final Method LIZIZ;

    static {
        try {
            LIZ = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            LIZIZ = TrafficStats.class.getMethod("clearThreadStatsUid", new Class[0]);
        } catch (NoSuchMethodException | SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Unable to get TrafficStats methods", e);
        }
    }

    public static void LIZ() {
        try {
            C2204961BRm.a0(LIZIZ, null, new Object[0], new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjiYJA3vvTau373R5nWds=", null));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e2);
        }
    }

    public static void LIZIZ(int i) {
        try {
            C2204961BRm.a0(LIZ, null, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjiYJA3vvTau373R5nWds=", null));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e2);
        }
    }
}
