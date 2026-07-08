package X;

import X.C1BU1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.1BTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205491BTn<T extends C1BU1> extends AbstractC2205581BTw<T> {
    public final InterfaceC2205541BTs<T> LIZIZ;
    public final C603820NmG<Integer, Set<? extends InterfaceC1177120gjm<T>>> LIZJ = new C603820NmG<>(5);
    public final ReadWriteLock LIZLLL = new ReentrantReadWriteLock();
    public final Executor LJ = C807400Vlq.LIZ();

    @Override // X.InterfaceC2205541BTs
    public final void LIZIZ() {
        this.LIZIZ.LIZIZ();
        this.LIZJ.LJIIIZ(-1);
    }

    @Override // X.InterfaceC2205541BTs
    public final int LJ() {
        return this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC2205541BTs
    public final Collection<T> getItems() {
        return this.LIZIZ.getItems();
    }

    public C2205491BTn(C2205481BTm c2205481BTm) {
        this.LIZIZ = c2205481BTm;
    }

    @Override // X.InterfaceC2205541BTs
    public final boolean LIZLLL(Collection<T> collection) {
        boolean zLIZLLL = this.LIZIZ.LIZLLL(collection);
        if (zLIZLLL) {
            this.LIZJ.LJIIIZ(-1);
        }
        return zLIZLLL;
    }

    @Override // X.InterfaceC2205541BTs
    public final Set<? extends InterfaceC1177120gjm<T>> LJI(float f) {
        int i = (int) f;
        Set<? extends InterfaceC1177120gjm<T>> setLJII = LJII(i);
        final int i2 = i + 1;
        if (this.LIZJ.LIZJ(Integer.valueOf(i2)) == null) {
            this.LJ.execute(new Runnable(i2) { // from class: X.08Ko
                public final int LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreCachingAlgorithmDecorator$PrecacheRunnable@494f.run");
                    try {
                        try {
                            Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        this.LLILLJJLI.LJII(this.LL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreCachingAlgorithmDecorator$PrecacheRunnable@494f.run");
                }

                {
                    this.LL = i2;
                }
            });
        }
        final int i3 = i - 1;
        if (this.LIZJ.LIZJ(Integer.valueOf(i3)) == null) {
            this.LJ.execute(new Runnable(i3) { // from class: X.08Ko
                public final int LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreCachingAlgorithmDecorator$PrecacheRunnable@494f.run");
                    try {
                        try {
                            Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        this.LLILLJJLI.LJII(this.LL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreCachingAlgorithmDecorator$PrecacheRunnable@494f.run");
                }

                {
                    this.LL = i3;
                }
            });
        }
        return setLJII;
    }

    public final Set<? extends InterfaceC1177120gjm<T>> LJII(int i) {
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        Set<? extends InterfaceC1177120gjm<T>> setLIZJ = this.LIZJ.LIZJ(Integer.valueOf(i));
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
        if (setLIZJ == null) {
            ((ReentrantReadWriteLock) this.LIZLLL).writeLock().lock();
            setLIZJ = this.LIZJ.LIZJ(Integer.valueOf(i));
            if (setLIZJ == null) {
                setLIZJ = this.LIZIZ.LJI(i);
                this.LIZJ.LIZLLL(Integer.valueOf(i), setLIZJ);
            }
            ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
        }
        return setLIZJ;
    }

    @Override // X.InterfaceC2205541BTs
    public final boolean LIZ(T t, T t2) {
        boolean zLIZ = this.LIZIZ.LIZ(t, t2);
        if (zLIZ) {
            this.LIZJ.LJIIIZ(-1);
        }
        return zLIZ;
    }
}
