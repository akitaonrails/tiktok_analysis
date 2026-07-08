package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.133O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C133O extends Number {
    public static final ThreadLocal<int[]> LLILLJJLI = new ThreadLocal<>();
    public static final Random LLILLL = new Random();
    public static final int LLILZ = Runtime.getRuntime().availableProcessors();
    public static final Unsafe LLILZIL;
    public static final long LLILZLL;
    public static final long LLIZ;
    public volatile transient C19918212wW[] LL;
    public volatile transient long base;
    public volatile transient int busy;

    static {
        try {
            Unsafe unsafeLIZLLL = LIZLLL();
            LLILZIL = unsafeLIZLLL;
            LLILZLL = unsafeLIZLLL.objectFieldOffset(C133O.class.getDeclaredField("base"));
            LLIZ = unsafeLIZLLL.objectFieldOffset(C133O.class.getDeclaredField("busy"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new Error(e);
        }
    }

    public final boolean LIZJ() {
        return LLILZIL.compareAndSwapInt(this, LLIZ, 0, 1);
    }

    public static Unsafe LIZLLL() {
        try {
            return Unsafe.getUnsafe();
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: X.12wD
                    public static Unsafe LIZ() throws IllegalAccessException {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }

                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() {
                        return LIZ();
                    }
                });
            } catch (PrivilegedActionException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
    }

    public final boolean LIZIZ(long j, long j2) {
        return LLILZIL.compareAndSwapLong(this, LLILZLL, j, j2);
    }
}
