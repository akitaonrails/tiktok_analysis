package X;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: X.087q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20664087q {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static Object LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static final Thread LJI = Looper.getMainLooper().getThread();
    public static C20665087r LJII;

    public static List<InterfaceC20666087s> LIZ() {
        C20665087r c20665087r = LJII;
        if (c20665087r != null) {
            return c20665087r.mObservers;
        }
        return null;
    }

    public static synchronized boolean LIZIZ() {
        Object obj;
        if (LIZ) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                try {
                    Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(Looper.class, "sObserver");
                    field.setAccessible(true);
                    obj = field.get(null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                }
                LIZJ = obj;
                if (obj != null) {
                    LIZLLL = LIZJ(obj.getClass(), "messageDispatchStarting", new Class[0]);
                    LJ = LIZJ(LIZJ.getClass(), "messageDispatched", Object.class, Message.class);
                    LJFF = LIZJ(LIZJ.getClass(), "dispatchingThrewException", Object.class, Message.class, Exception.class);
                }
                if (LIZLLL == null || LJ == null || LJFF == null) {
                    LIZJ = null;
                }
                LJII = (C20665087r) Class.forName("com.bytedance.observer.ObserverWrapper").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (LIZJ != null) {
                    System.out.println("LooperObserverMonitor.init: " + LIZJ);
                    LJII.setup(LIZJ);
                }
                C2204961BRm.a0(LIZJ(Looper.class, "setObserver", Class.forName("android.os.Looper$Observer")), null, new Object[]{LJII}, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++d6h9wTkZBo2LmKdUvRk4PLc5FANnBi/ABhs", null));
                LIZ = true;
                return LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZJ = null;
            }
        }
        LJII = new C20665087r();
        LIZJ = null;
        LIZIZ = true;
        LIZ = true;
        return LIZ;
    }

    public static Method LIZJ(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
