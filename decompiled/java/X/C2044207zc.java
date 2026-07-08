package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2044207zc {
    public static final Field LIZ;

    static {
        try {
            Field fieldLIZ = C1958607lo.LIZ(Looper.class, "mLogging");
            LIZ = fieldLIZ;
            if (fieldLIZ != null) {
                fieldLIZ.setAccessible(true);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
