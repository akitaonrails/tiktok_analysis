package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08Ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2113408Ps {
    public static final Field LIZ;
    public static final Field LIZIZ;

    static {
        try {
            LIZ = Class.forName("android.content.ContextWrapper").getDeclaredField("mBase");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            LIZIZ = Class.forName("android.app.ContextImpl").getDeclaredField("mSharedPrefsPaths");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
