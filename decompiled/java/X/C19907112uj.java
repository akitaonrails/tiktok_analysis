package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.12uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19907112uj {
    public static final Unsafe LIZ;
    public static final Class LIZIZ;
    public static final AbstractC19907512un LIZJ;
    public static final boolean LIZLLL;
    public static final long LJ;
    public static final boolean LJFF;

    public static Unsafe LJIIJ() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: X.12um
                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Object run() throws IllegalAccessException {
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
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logger.getLogger(C19907112uj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static Field LIZIZ() {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    static {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19907112uj.<clinit>():void");
    }

    public static void LIZ(Class cls) {
        if (LIZLLL) {
            LIZJ.LIZ.arrayIndexScale(cls);
        }
    }

    public static Object LJIIIIZZ(Class cls) {
        try {
            return LIZ.allocateInstance(cls);
        } catch (InstantiationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException(e);
        }
    }

    public static /* bridge */ /* synthetic */ void LJIIJJI(Throwable th) {
        Logger.getLogger(C19907112uj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIIZILJ(Class cls) {
        try {
            Class cls2 = LIZIZ;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    public static int LJIJI(Class cls) {
        if (LIZLLL) {
            return LIZJ.LIZ.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static double LJ(long j, Object obj) {
        return LIZJ.LIZ(j, obj);
    }

    public static float LJFF(long j, Object obj) {
        return LIZJ.LIZIZ(j, obj);
    }

    public static int LJI(long j, Object obj) {
        return LIZJ.LIZ.getInt(obj, j);
    }

    public static long LJII(long j, Object obj) {
        return LIZJ.LIZ.getLong(obj, j);
    }

    public static Object LJIIIZ(long j, Object obj) {
        return LIZJ.LIZ.getObject(obj, j);
    }

    public static /* bridge */ /* synthetic */ boolean LJIILL(long j, Object obj) {
        if (((byte) ((LIZJ.LIZ.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean LJIILLIIL(long j, Object obj) {
        if (((byte) ((LIZJ.LIZ.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIJ(long j, Object obj) {
        return LIZJ.LJI(j, obj);
    }

    public static void LIZJ(Object obj, long j, byte b) {
        Unsafe unsafe = LIZJ.LIZ;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void LIZLLL(Object obj, long j, byte b) {
        Unsafe unsafe = LIZJ.LIZ;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static void LJIIL(int i, long j, Object obj) {
        LIZJ.LIZ.putInt(obj, j, i);
    }

    public static void LJIILIIL(long j, long j2, Object obj) {
        LIZJ.LIZ.putLong(obj, j, j2);
    }

    public static void LJIILJJIL(long j, Object obj, Object obj2) {
        LIZJ.LIZ.putObject(obj, j, obj2);
    }
}
