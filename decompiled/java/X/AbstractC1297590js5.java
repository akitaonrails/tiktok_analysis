package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0js5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1297590js5 {
    public final int LIZ;

    public abstract void LIZJ(int i);

    public abstract boolean LIZLLL();

    public abstract boolean LJ(long j, TimeUnit timeUnit);

    public abstract void LJFF(int i);

    public int LIZIZ() {
        return this.LIZ;
    }

    public AbstractC1297590js5(int i) {
        this.LIZ = i;
    }

    public static AbstractC1297590js5 LIZ(final int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create ABLock type: ");
        sbLIZ.append(i);
        C1471660oOq.LIZJ("ABLock", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 0) {
            return new AbstractC1297590js5(i) { // from class: X.0js7
                public final ReentrantLock LIZIZ = new ReentrantLock();

                @Override // X.AbstractC1297590js5
                public final boolean LIZLLL() {
                    return this.LIZIZ.tryLock();
                }

                @Override // X.AbstractC1297590js5
                public final void LIZJ(int i3) {
                    this.LIZIZ.lock();
                }

                @Override // X.AbstractC1297590js5
                public final void LJFF(int i3) {
                    this.LIZIZ.unlock();
                }

                @Override // X.AbstractC1297590js5
                public final boolean LJ(long j, TimeUnit timeUnit) {
                    return this.LIZIZ.tryLock(j, timeUnit);
                }
            };
        }
        if (i == 1) {
            return new AbstractC1297590js5(i) { // from class: X.0jWW
                @Override // X.AbstractC1297590js5
                public final void LIZJ(int i3) {
                }

                @Override // X.AbstractC1297590js5
                public final boolean LIZLLL() {
                    return true;
                }

                @Override // X.AbstractC1297590js5
                public final boolean LJ(long j, TimeUnit timeUnit) {
                    return true;
                }

                @Override // X.AbstractC1297590js5
                public final void LJFF(int i3) {
                }
            };
        }
        if (i == 2) {
            return new AbstractC1297590js5(i) { // from class: X.0jWO
                public final ReentrantReadWriteLock.ReadLock LIZIZ;
                public final ReentrantReadWriteLock.WriteLock LIZJ;

                @Override // X.AbstractC1297590js5
                public final boolean LIZLLL() {
                    return this.LIZIZ.tryLock();
                }

                {
                    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
                    this.LIZIZ = reentrantReadWriteLock.readLock();
                    this.LIZJ = reentrantReadWriteLock.writeLock();
                }

                @Override // X.AbstractC1297590js5
                public final void LIZJ(int i3) {
                    if (i3 == 1) {
                        this.LIZIZ.lock();
                    } else {
                        if (i3 != 2) {
                            return;
                        }
                        this.LIZJ.lock();
                    }
                }

                @Override // X.AbstractC1297590js5
                public final void LJFF(int i3) {
                    if (i3 == 1) {
                        this.LIZIZ.unlock();
                    } else {
                        if (i3 != 2) {
                            return;
                        }
                        this.LIZJ.unlock();
                    }
                }

                @Override // X.AbstractC1297590js5
                public final boolean LJ(long j, TimeUnit timeUnit) {
                    return this.LIZIZ.tryLock(j, timeUnit);
                }
            };
        }
        final int i3 = 0;
        return new AbstractC1297590js5(i3) { // from class: X.0js7
            public final ReentrantLock LIZIZ = new ReentrantLock();

            @Override // X.AbstractC1297590js5
            public final boolean LIZLLL() {
                return this.LIZIZ.tryLock();
            }

            @Override // X.AbstractC1297590js5
            public final void LIZJ(int i32) {
                this.LIZIZ.lock();
            }

            @Override // X.AbstractC1297590js5
            public final void LJFF(int i32) {
                this.LIZIZ.unlock();
            }

            @Override // X.AbstractC1297590js5
            public final boolean LJ(long j, TimeUnit timeUnit) {
                return this.LIZIZ.tryLock(j, timeUnit);
            }
        };
    }
}
