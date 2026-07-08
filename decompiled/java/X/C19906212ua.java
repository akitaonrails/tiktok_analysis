package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.12ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19906212ua {
    public static final Unsafe LIZ;
    public static final Class<?> LIZIZ;
    public static final AbstractC19904612uK LIZJ;
    public static final boolean LIZLLL;
    public static final long LJ;
    public static final boolean LJFF;

    public static Unsafe LJII() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: X.12ub
                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sun.misc.Unsafe] */
                @Override // java.security.PrivilegedExceptionAction
                public final /* synthetic */ Unsafe run() throws IllegalAccessException {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static Field LJIILL() {
        Field declaredField;
        Field declaredField2;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    static {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19906212ua.<clinit>():void");
    }

    public static <T> T LIZIZ(Class<T> cls) {
        try {
            return (T) LIZ.allocateInstance(cls);
        } catch (InstantiationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException(e);
        }
    }

    public static /* synthetic */ void LJ(Throwable th) {
        Logger.getLogger(C19906212ua.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static int LJI(Class<?> cls) {
        if (LIZLLL) {
            return LIZJ.LIZ.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void LJIIIZ(Class cls) {
        if (LIZLLL) {
            LIZJ.LIZ.arrayIndexScale(cls);
        }
    }

    public static boolean LJIILIIL(Class<?> cls) {
        try {
            Class<?> cls2 = LIZIZ;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static double LIZ(long j, Object obj) {
        return LIZJ.LIZ(j, obj);
    }

    public static float LJFF(long j, Object obj) {
        return LIZJ.LJII(j, obj);
    }

    public static int LJIIIIZZ(long j, Object obj) {
        return LIZJ.LJIIIZ(j, obj);
    }

    public static long LJIIJJI(long j, Object obj) {
        return LIZJ.LJIIJ(j, obj);
    }

    public static Object LJIILJJIL(long j, Object obj) {
        return LIZJ.LIZ.getObject(obj, j);
    }

    public static boolean LJIILLIIL(long j, Object obj) {
        return LIZJ.LJIIIIZZ(j, obj);
    }

    public static void LIZJ(int i, long j, Object obj) {
        LIZJ.LIZIZ(i, j, obj);
    }

    public static void LIZLLL(long j, Object obj, Object obj2) {
        LIZJ.LIZ.putObject(obj, j, obj2);
    }

    public static void LJIIJ(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iLJIIIIZZ = LJIIIIZZ(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        LIZJ(((255 & b) << i) | (iLJIIIIZZ & (~(255 << i))), j2, obj);
    }

    public static void LJIIL(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        LIZJ(((255 & b) << i) | (LJIIIIZZ(j2, obj) & (~(255 << i))), j2, obj);
    }
}
