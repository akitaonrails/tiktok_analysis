package X;

import android.os.Debug;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0QsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684030QsL {
    public static volatile C577410Mkl LIZ;
    public static volatile boolean LIZIZ;

    public static C577410Mkl LIZ() {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            return new C577410Mkl(((long) memoryInfo.dalvikPss) * 1024, ((long) memoryInfo.nativePss) * 1024, ((long) memoryInfo.getTotalPss()) * 1024, System.currentTimeMillis());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MemoryGainPerformanceMonitor get instant memory :");
            sbLIZ.append(e);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MemoryGainPerformanceMonitor get instant memory :");
            sbLIZ2.append(e2);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }
}
