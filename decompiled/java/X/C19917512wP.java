package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.12wP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19917512wP {
    public static final Unsafe LIZ;
    public static final Class<?> LIZIZ;
    public static final AbstractC19917412wO LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final long LJFF;
    public static final long LJI;
    public static final boolean LJII;

    public static Unsafe LJIILLIIL() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: X.12wB
                public static Unsafe LIZ() throws IllegalAccessException {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }

                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Unsafe run() {
                    return LIZ();
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    static {
        /*
            sun.misc.Unsafe r4 = LJIILLIIL()
            X.C19917512wP.LIZ = r4
            java.lang.Class<?> r0 = X.C19915512w5.LIZ
            X.C19917512wP.LIZIZ = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r2 = LJFF(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r1 = LJFF(r0)
            if (r4 == 0) goto La2
            boolean r0 = X.C19915512w5.LIZ()
            if (r0 == 0) goto L9c
            if (r2 == 0) goto L94
            X.12wS r3 = new X.12wS
            r3.<init>(r4)
        L25:
            X.C19917512wP.LIZJ = r3
            r2 = 0
            if (r3 != 0) goto L8f
            r0 = 0
        L2b:
            X.C19917512wP.LIZLLL = r0
            if (r3 != 0) goto L8a
            r0 = 0
        L30:
            X.C19917512wP.LJ = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = LIZIZ(r0)
            long r0 = (long) r0
            X.C19917512wP.LJFF = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            LIZIZ(r0)
            LIZJ(r0)
            java.lang.Class<int[]> r0 = int[].class
            LIZIZ(r0)
            LIZJ(r0)
            java.lang.Class<long[]> r0 = long[].class
            LIZIZ(r0)
            LIZJ(r0)
            java.lang.Class<float[]> r0 = float[].class
            LIZIZ(r0)
            LIZJ(r0)
            java.lang.Class<double[]> r0 = double[].class
            LIZIZ(r0)
            LIZJ(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            LIZIZ(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            LIZJ(r0)
            java.lang.reflect.Field r0 = LIZLLL()
            if (r0 == 0) goto L87
            if (r3 == 0) goto L87
            long r0 = r3.LJIIL(r0)
        L79:
            X.C19917512wP.LJI = r0
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r0) goto L84
            r2 = 1
        L84:
            X.C19917512wP.LJII = r2
            return
        L87:
            r0 = -1
            goto L79
        L8a:
            boolean r0 = r3.LJIJJ()
            goto L30
        L8f:
            boolean r0 = r3.LJIJJLI()
            goto L2b
        L94:
            if (r1 == 0) goto La2
            X.12wR r3 = new X.12wR
            r3.<init>(r4)
            goto L25
        L9c:
            X.12wQ r3 = new X.12wQ
            r3.<init>(r4)
            goto L25
        La2:
            r3 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19917512wP.<clinit>():void");
    }

    public static Field LIZLLL() {
        Field declaredField;
        Field declaredField2;
        if (C19915512w5.LIZ()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static <T> T LIZ(Class<T> cls) {
        try {
            return (T) LIZ.allocateInstance(cls);
        } catch (InstantiationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException(e);
        }
    }

    public static int LIZIZ(Class<?> cls) {
        if (LJ) {
            return LIZJ.LIZ(cls);
        }
        return -1;
    }

    public static void LIZJ(Class cls) {
        if (LJ) {
            LIZJ.LIZIZ(cls);
        }
    }

    public static boolean LJFF(Class<?> cls) {
        if (!C19915512w5.LIZ()) {
            return false;
        }
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

    public static byte LJII(long j) {
        return LIZJ.LJ(j);
    }

    public static void LJIIZILJ(Throwable th) {
        Logger logger = Logger.getLogger(C19917512wP.class.getName());
        Level level = Level.WARNING;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("platform method missing - proto runtime falling back to safer methods: ");
        sbLIZ.append(th);
        logger.log(level, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static long LJIJ(Field field) {
        return LIZJ.LJIIL(field);
    }

    public static boolean LJI(long j, Object obj) {
        return LIZJ.LIZLLL(j, obj);
    }

    public static byte LJIIIIZZ(long j, byte[] bArr) {
        return LIZJ.LJFF(LJFF + j, bArr);
    }

    public static byte LJIIIZ(long j, Object obj) {
        return (byte) ((LJIILIIL((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte LJIIJ(long j, Object obj) {
        return (byte) ((LJIILIIL((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static double LJIIJJI(long j, Object obj) {
        return LIZJ.LJI(j, obj);
    }

    public static float LJIIL(long j, Object obj) {
        return LIZJ.LJII(j, obj);
    }

    public static int LJIILIIL(long j, Object obj) {
        return LIZJ.LJIIIIZZ(j, obj);
    }

    public static long LJIILJJIL(long j, Object obj) {
        return LIZJ.LJIIIZ(j, obj);
    }

    public static Object LJIILL(long j, Object obj) {
        return LIZJ.LJIIJ(j, obj);
    }

    public static void LJIJI(byte[] bArr, byte b, long j) {
        LIZJ.LJIILJJIL(bArr, LJFF + j, b);
    }

    public static void LJIJJ(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iLJIILIIL = LJIILIIL(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        LJIL(((255 & b) << i) | (iLJIILIIL & (~(255 << i))), j2, obj);
    }

    public static void LJIJJLI(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        LJIL(((255 & b) << i) | (LJIILIIL(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void LJIL(int i, long j, Object obj) {
        LIZJ.LJIIZILJ(i, j, obj);
    }

    public static void LJJ(long j, long j2, Object obj) {
        LIZJ.LJIJ(j, j2, obj);
    }

    public static void LJJI(long j, Object obj, Object obj2) {
        LIZJ.LJIJI(j, obj, obj2);
    }

    public static void LJ(byte[] bArr, long j, long j2, long j3) {
        LIZJ.LIZJ(bArr, j, j2, j3);
    }
}
