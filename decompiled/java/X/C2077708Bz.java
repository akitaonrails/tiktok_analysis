package X;

import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.08Bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2077708Bz {
    public static long LIZ;
    public static Method LIZIZ;

    public static boolean LIZ() throws Throwable {
        try {
            if (LIZIZ == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean zBooleanValue = false;
        try {
            if (LIZIZ == null) {
                LIZ = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                LIZIZ = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            zBooleanValue = ((Boolean) LIZIZ.invoke(null, Long.valueOf(LIZ))).booleanValue();
            return zBooleanValue;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (!(e2 instanceof InvocationTargetException)) {
                return zBooleanValue;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
    }
}
