package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZJ {
    public static int LIZ(String str) {
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static long LIZIZ(String str) {
        try {
            return CastLongProtector.parseLong(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0L;
        }
    }
}
