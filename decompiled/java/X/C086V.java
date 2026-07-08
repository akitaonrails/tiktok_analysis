package X;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.086V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086V {
    public static final Method LIZ;
    public static final Field LIZIZ;
    public static final Field LIZJ;
    public static final Field LIZLLL;
    public static final Method LJ;
    public static final Field LJFF;

    static {
        try {
            LIZ = C1961107mD.LIZIZ(Message.class, "recycleUnchecked", new Class[0]);
            LIZIZ = C1961107mD.LIZ(Message.class, "flags");
            LIZJ = C1961107mD.LIZ(Message.class, "next");
            LIZLLL = C1961107mD.LIZ(Looper.class, "mLogging");
            LJ = C1961107mD.LIZIZ(MessageQueue.class, "next", new Class[0]);
            LJFF = C1961107mD.LIZ(MessageQueue.class, "mMessages");
            if (Build.VERSION.SDK_INT >= 29) {
                Class<?> cls = Class.forName(C1961107mD.LIZ(Looper.class, "sObserver").getType().getName());
                C1961107mD.LIZIZ(cls, "messageDispatchStarting", new Class[0]);
                C1961107mD.LIZIZ(cls, "messageDispatched", Object.class, Message.class);
                C1961107mD.LIZIZ(cls, "dispatchingThrewException", Object.class, Message.class, Exception.class);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LIZ(Message message) {
        try {
            Field field = LIZIZ;
            field.set(message, Integer.valueOf(((Integer) field.get(message)).intValue() & (-2)));
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void LIZIZ(Message message) {
        try {
            LIZ.invoke(message, new Object[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
