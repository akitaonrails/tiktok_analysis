package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.133S, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C133S extends C133U {
    public static final Unsafe LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final long LIZLLL;
    public static final long LJ;
    public static final long LJFF;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: X.12wE
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException {
                        Unsafe unsafe2 = C133S.LIZ;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            } catch (PrivilegedActionException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        try {
            LIZJ = unsafe.objectFieldOffset(C133Z.class.getDeclaredField("LLILLL"));
            LIZIZ = unsafe.objectFieldOffset(C133Z.class.getDeclaredField("LLILLJJLI"));
            LIZLLL = unsafe.objectFieldOffset(C133Z.class.getDeclaredField("LL"));
            LJ = unsafe.objectFieldOffset(C133W.class.getDeclaredField("LIZ"));
            LJFF = unsafe.objectFieldOffset(C133W.class.getDeclaredField("LIZIZ"));
            LIZ = unsafe;
        } catch (NoSuchFieldException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new RuntimeException(e3);
        }
    }

    @Override // X.C133U
    public final C133W LIZIZ(AbstractC199487133l abstractC199487133l) {
        C133W c133w;
        C133W c133w2 = C133W.LIZJ;
        do {
            c133w = abstractC199487133l.LLILLL;
            if (c133w2 == c133w) {
                break;
            }
        } while (!LJI(abstractC199487133l, c133w, c133w2));
        return c133w;
    }

    @Override // X.C133U
    public final C199498133w LIZ(AbstractC199487133l abstractC199487133l, C199498133w c199498133w) {
        C199498133w c199498133w2;
        do {
            c199498133w2 = abstractC199487133l.LLILLJJLI;
            if (c199498133w == c199498133w2) {
                break;
            }
        } while (!LJ(abstractC199487133l, c199498133w2, c199498133w));
        return c199498133w2;
    }

    @Override // X.C133U
    public final void LIZJ(C133W c133w, C133W c133w2) {
        LIZ.putObject(c133w, LJFF, c133w2);
    }

    @Override // X.C133U
    public final void LIZLLL(C133W c133w, Thread thread) {
        LIZ.putObject(c133w, LJ, thread);
    }

    @Override // X.C133U
    public final boolean LJ(C133Z c133z, C199498133w c199498133w, C199498133w c199498133w2) {
        return C133R.LIZ(LIZ, c133z, LIZIZ, c199498133w, c199498133w2);
    }

    @Override // X.C133U
    public final boolean LJFF(C133Z c133z, Object obj, Object obj2) {
        return C133R.LIZ(LIZ, c133z, LIZLLL, obj, obj2);
    }

    @Override // X.C133U
    public final boolean LJI(C133Z c133z, C133W c133w, C133W c133w2) {
        return C133R.LIZ(LIZ, c133z, LIZJ, c133w, c133w2);
    }
}
