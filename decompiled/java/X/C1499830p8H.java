package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0p8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499830p8H {
    public final ReentrantLock LIZ;
    public final Condition LIZIZ;

    public C1499830p8H() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
    }
}
