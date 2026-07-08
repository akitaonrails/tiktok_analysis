package X;

import com.bytedance.refcache.FileLocker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.08tJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2259908tJ {
    public static boolean LIZIZ() {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "stat_dict_size_opt", false) > 0;
    }

    public static long LIZ(File file) {
        if (file == null) {
            return 0L;
        }
        String absolutePath = file.getAbsolutePath();
        if (!FileLocker.LIZ) {
            return -1L;
        }
        return FileLocker._getTotalSpace(absolutePath);
    }
}
