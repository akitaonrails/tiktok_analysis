package X;

import android.graphics.Paint;
import android.os.Build;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0F2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383670F2n {
    public static final List<String> LIZ;
    public static final Paint LIZIZ;
    public static final LockC821580WKu LIZJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0WKu] */
    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098");
        LIZ = listLJIIJJI;
        LIZIZ = new Paint(6);
        listLJIIJJI.contains(Build.MODEL);
        LIZJ = new Lock() { // from class: X.0WKu
            @Override // java.util.concurrent.locks.Lock
            public final void lock() {
            }

            @Override // java.util.concurrent.locks.Lock
            public final void lockInterruptibly() {
            }

            @Override // java.util.concurrent.locks.Lock
            public final boolean tryLock() {
                return true;
            }

            @Override // java.util.concurrent.locks.Lock
            public final boolean tryLock(long j, TimeUnit timeUnit) {
                return true;
            }

            @Override // java.util.concurrent.locks.Lock
            public final void unlock() {
            }

            @Override // java.util.concurrent.locks.Lock
            public final Condition newCondition() {
                throw new UnsupportedOperationException("Should not be called");
            }
        };
    }
}
