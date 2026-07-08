package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.08D5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08D5 {
    public static Handler LIZ(Looper looper) throws Throwable {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            Throwable cause = e4.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean LIZIZ(Handler handler, Runnable runnable, Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C786410Ut5.LJLIL(handler, runnable, obj, j);
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return C786410Ut5.LJLJLJ(handler, messageObtain, j);
    }
}
