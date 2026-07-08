package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveThreadPoolOptSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823800WTi {
    public static final List<InterfaceC823860WTo> LIZ = new ArrayList();
    public static final C823810WTj LIZIZ = new C823810WTj(null);
    public static final C823810WTj LIZJ = new C823810WTj(null);
    public static final C823810WTj LIZLLL = new C823810WTj(null);
    public static final Object LJ;

    static {
        new AtomicLong(System.currentTimeMillis());
        LJ = new Object();
    }

    public static void LIZ(String str, String str2) {
        C823810WTj c823810WTj;
        synchronized (LJ) {
            try {
                if (Intrinsics.LJFF(str2, "io")) {
                    c823810WTj = LIZJ;
                } else if (Intrinsics.LJFF(str2, "computation")) {
                    c823810WTj = LIZLLL;
                } else {
                    c823810WTj = LIZIZ;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(':');
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (c823810WTj.LJ.size() < 256) {
                    c823810WTj.LJ.add(strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(long j, long j2, String str, String str2) {
        C823810WTj c823810WTj;
        LiveThreadPoolOptSetting.ThreadPoolOptConfig value = LiveThreadPoolOptSetting.getValue();
        if (!value.enableLogReport) {
            return;
        }
        if (j2 > value.longRunningTaskThresholdMs) {
            LIZ(str, str2);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        if (Math.random() > 0.05d) {
            return;
        }
        synchronized (LJ) {
            try {
                if (Intrinsics.LJFF(str2, "io")) {
                    c823810WTj = LIZJ;
                } else if (Intrinsics.LJFF(str2, "computation")) {
                    c823810WTj = LIZLLL;
                } else {
                    c823810WTj = LIZIZ;
                }
                long jMin = Math.min(j, 65535L);
                if (jMin > c823810WTj.LIZ) {
                    c823810WTj.LIZ = jMin;
                }
                c823810WTj.LIZIZ = Math.min(c823810WTj.LIZIZ + j, 65535L);
                c823810WTj.LIZJ = Math.min(c823810WTj.LIZJ + 1, 65535L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
