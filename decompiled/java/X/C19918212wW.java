package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.12wW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19918212wW {
    public static final Unsafe UNSAFE;
    public static final long valueOffset;
    public volatile long p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public volatile long f221p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public volatile long f222p2;
    public volatile long p3;
    public volatile long p4;
    public volatile long p5;
    public volatile long p6;
    public volatile long q0;
    public volatile long q1;
    public volatile long q2;
    public volatile long q3;
    public volatile long q4;
    public volatile long q5;
    public volatile long q6;
    public volatile long value;

    static {
        try {
            Unsafe unsafeLIZLLL = C133O.LIZLLL();
            UNSAFE = unsafeLIZLLL;
            valueOffset = unsafeLIZLLL.objectFieldOffset(C19918212wW.class.getDeclaredField("value"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new Error(e);
        }
    }

    public C19918212wW(long j) {
        this.value = j;
    }

    public final boolean LIZ(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, valueOffset, j, j2);
    }
}
