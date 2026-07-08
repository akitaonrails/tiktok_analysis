package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.09B6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09B6 {
    public static Thread LIZ(Object obj) {
        Field field;
        Field declaredField;
        Thread thread;
        Object obj2;
        if (!(obj instanceof FutureTask)) {
            return null;
        }
        if (C09B5.LJIIL) {
            field = C09B5.LJIIJJI;
        } else {
            synchronized (C09B5.LJIILIIL) {
                try {
                    if (!C09B5.LJIIL) {
                        try {
                            declaredField = FutureTask.class.getDeclaredField("runner");
                            declaredField.setAccessible(true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            declaredField = null;
                        }
                        C09B5.LJIIJJI = declaredField;
                        C09B5.LJIIL = true;
                    }
                    field = C09B5.LJIIJJI;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        if (field == null) {
            return null;
        }
        try {
            obj2 = field.get(obj);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        if (obj2 instanceof Thread) {
            thread = (Thread) obj2;
        } else {
            thread = null;
        }
        if (thread == null || !ThreadMethodProxy.isAlive(thread)) {
            return null;
        }
        return thread;
    }
}
