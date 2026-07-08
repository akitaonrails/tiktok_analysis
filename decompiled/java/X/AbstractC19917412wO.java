package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.12wO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19917412wO {
    public final Unsafe LIZ;

    public abstract void LIZJ(byte[] bArr, long j, long j2, long j3);

    public abstract boolean LIZLLL(long j, Object obj);

    public abstract byte LJ(long j);

    public abstract byte LJFF(long j, Object obj);

    public abstract double LJI(long j, Object obj);

    public abstract float LJII(long j, Object obj);

    public abstract Object LJIIJJI(Field field);

    public abstract void LJIILIIL(long j, Object obj, boolean z);

    public abstract void LJIILJJIL(Object obj, long j, byte b);

    public abstract void LJIILL(Object obj, long j, double d);

    public abstract void LJIILLIIL(Object obj, long j, float f);

    public abstract boolean LJIJJLI();

    public boolean LJIJJ() {
        Unsafe unsafe = this.LIZ;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C19917512wP.LJIIZILJ(th);
            return false;
        }
    }

    public AbstractC19917412wO(Unsafe unsafe) {
        this.LIZ = unsafe;
    }

    public final int LIZ(Class<?> cls) {
        return this.LIZ.arrayBaseOffset(cls);
    }

    public final int LIZIZ(Class<?> cls) {
        return this.LIZ.arrayIndexScale(cls);
    }

    public final long LJIIL(Field field) {
        return this.LIZ.objectFieldOffset(field);
    }

    public final int LJIIIIZZ(long j, Object obj) {
        return this.LIZ.getInt(obj, j);
    }

    public final long LJIIIZ(long j, Object obj) {
        return this.LIZ.getLong(obj, j);
    }

    public final Object LJIIJ(long j, Object obj) {
        return this.LIZ.getObject(obj, j);
    }

    public final void LJIIZILJ(int i, long j, Object obj) {
        this.LIZ.putInt(obj, j, i);
    }

    public final void LJIJ(long j, long j2, Object obj) {
        this.LIZ.putLong(obj, j, j2);
    }

    public final void LJIJI(long j, Object obj, Object obj2) {
        this.LIZ.putObject(obj, j, obj2);
    }
}
