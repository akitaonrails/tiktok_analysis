package X;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.12uK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19904612uK {
    public final Unsafe LIZ;

    public abstract double LIZ(long j, Object obj);

    public abstract void LIZLLL(long j, Object obj, boolean z);

    public abstract void LJ(Object obj, long j, byte b);

    public abstract void LJFF(Object obj, long j, double d);

    public abstract void LJI(Object obj, long j, float f);

    public abstract float LJII(long j, Object obj);

    public abstract boolean LJIIIIZZ(long j, Object obj);

    public AbstractC19904612uK(Unsafe unsafe) {
        this.LIZ = unsafe;
    }

    public final int LJIIIZ(long j, Object obj) {
        return this.LIZ.getInt(obj, j);
    }

    public final long LJIIJ(long j, Object obj) {
        return this.LIZ.getLong(obj, j);
    }

    public final void LIZIZ(int i, long j, Object obj) {
        this.LIZ.putInt(obj, j, i);
    }

    public final void LIZJ(long j, long j2, Object obj) {
        this.LIZ.putLong(obj, j, j2);
    }
}
