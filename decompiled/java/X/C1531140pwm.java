package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531140pwm {
    public static boolean LIZ(File file, C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv) {
        if (!Intrinsics.LJFF(c1532710pzJ.LIZLLL, File.class)) {
            try {
                if (!file.isFile()) {
                    return false;
                }
                if (AbstractC19994813Le.Default.nextFloat() <= 0.33f) {
                    if (file.length() <= 0) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error occurs when checking file ");
                    sbLIZ.append(file.getAbsolutePath());
                    sbLIZ.append(", ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    c1532470pyv.LIZIZ(6, C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
            }
        }
        return file.exists();
    }
}
