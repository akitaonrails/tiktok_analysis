package X;

import com.bytedance.otis.resource.thread.ThreadStatusNative;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08M6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08M6 {
    public static final C0VSJ LIZ;
    public static final boolean LIZIZ;

    static {
        C0VSJ c0vsj = new C0VSJ("/proc/self/task");
        LIZ = c0vsj;
        new C0VSJ("/proc/self/limits");
        if (c0vsj.exists() && c0vsj.isDirectory() && c0vsj.canRead()) {
            LIZIZ = true;
        }
    }

    public static int LIZIZ() {
        int length = 0;
        if (!LIZIZ) {
            return 0;
        }
        try {
            File[] fileArrListFiles = LIZ.listFiles();
            if (fileArrListFiles != null) {
                length = fileArrListFiles.length;
                return length;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return length;
    }

    public static Map LIZ(long j) {
        HashMap map = new HashMap();
        try {
            ThreadStatusNative.getAllThreadCpuTime(map, j);
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return map;
        }
    }
}
