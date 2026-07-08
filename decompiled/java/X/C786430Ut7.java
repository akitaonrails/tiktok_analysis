package X;

import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Ut7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786430Ut7 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile Field LIZLLL;
    public static volatile Field LJ;
    public static final Set<String> LIZJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static volatile boolean LJFF = false;

    public static void LIZ() {
        if (LJFF) {
            return;
        }
        synchronized (C786430Ut7.class) {
            try {
                if (LJFF) {
                    return;
                }
                try {
                    Field declaredField = HandlerThread.class.getDeclaredField("mTid");
                    declaredField.setAccessible(true);
                    LIZLLL = declaredField;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZLLL = null;
                }
                try {
                    Field declaredField2 = HandlerThread.class.getDeclaredField("mPriority");
                    declaredField2.setAccessible(true);
                    LJ = declaredField2;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    LJ = null;
                }
                LJFF = true;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }
}
