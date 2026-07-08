package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.08KI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KI {
    public static final Object LIZ;

    static {
        Object objInvoke;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            objInvoke = null;
        }
        LIZ = objInvoke;
        if (objInvoke != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            try {
                try {
                    Method method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                    if (method != null) {
                        C2204961BRm.a0(method, objInvoke, new Object[]{new Throwable()}, new C0WZX("dzBzEgU1UM3QUBkiSh+JaTG5e2b1JNAJO79Lkna3zY/9", null));
                    }
                } catch (ThreadDeath e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw e3;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    public static String LIZ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void LIZIZ(Throwable th) throws Throwable {
        if (!(th instanceof RuntimeException) && !(th instanceof Error)) {
        } else {
            throw th;
        }
    }
}
