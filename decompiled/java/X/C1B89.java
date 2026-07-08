package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.segment.StreamClosedException;

/* JADX INFO: renamed from: X.1B89, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B89 implements InterfaceC2199941B8e, InterfaceC2200051B8p {
    public final int LIZ;
    public final int LIZIZ;
    public final Object LIZJ = new Object();
    public final Object LIZLLL = new Object();
    public C1B8I LJ;
    public C1B8I LJFF;
    public C1B8I LJI;
    public C1B8I LJII;
    public C1B8I LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public int LJIIJ;

    public final void LIZIZ() {
        this.LJIIIZ = true;
        synchronized (this.LIZJ) {
            try {
                this.LIZJ.notifyAll();
            } finally {
            }
        }
        synchronized (this.LIZLLL) {
            try {
                this.LIZLLL.notifyAll();
            } finally {
            }
        }
    }

    public final C1B8I LIZJ() {
        synchronized (this.LIZJ) {
            try {
                if (this.LJIIIZ) {
                    throw new StreamClosedException("obtain");
                }
                C1B8I c1b8i = this.LJ;
                if (c1b8i == null) {
                    int i = this.LJIIJ;
                    if (i < this.LIZ) {
                        this.LJIIJ = i + 1;
                        return new C1B8I(this.LIZIZ);
                    }
                    do {
                        this.LIZJ.wait();
                        if (this.LJIIIZ) {
                            throw new StreamClosedException("obtain");
                        }
                        c1b8i = this.LJ;
                    } while (c1b8i == null);
                }
                this.LJ = c1b8i.LIZLLL;
                if (c1b8i == this.LJFF) {
                    this.LJFF = null;
                }
                c1b8i.LIZLLL = null;
                return c1b8i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C1B8I LIZLLL() {
        C1B8I c1b8i;
        C1B8I c1b8i2 = this.LJIIIIZZ;
        if (c1b8i2 != null) {
            this.LJIIIIZZ = c1b8i2.LIZLLL;
            c1b8i2.LIZLLL = null;
            return c1b8i2;
        }
        synchronized (this.LIZLLL) {
            try {
                c1b8i = this.LJI;
                while (c1b8i == null) {
                    if (this.LJIIIZ) {
                        throw new StreamClosedException("read");
                    }
                    this.LIZLLL.wait();
                    c1b8i = this.LJI;
                }
                this.LJIIIIZZ = c1b8i.LIZLLL;
                this.LJII = null;
                this.LJI = null;
                c1b8i.LIZLLL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1b8i;
    }

    @Override // X.InterfaceC2199941B8e
    public final void LIZ(C1B8I c1b8i) {
        synchronized (this.LIZLLL) {
            try {
                C1B8I c1b8i2 = this.LJII;
                if (c1b8i2 == null) {
                    this.LJII = c1b8i;
                    this.LJI = c1b8i;
                    this.LIZLLL.notify();
                } else {
                    c1b8i2.LIZLLL = c1b8i;
                    this.LJII = c1b8i;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(C1B8I c1b8i) {
        synchronized (this.LIZJ) {
            try {
                C1B8I c1b8i2 = this.LJFF;
                if (c1b8i2 == null) {
                    this.LJFF = c1b8i;
                    this.LJ = c1b8i;
                } else {
                    c1b8i2.LIZLLL = c1b8i;
                    this.LJFF = c1b8i;
                }
                this.LIZJ.notify();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1B89(int i, int i2) {
        i = i < 64 ? 64 : i;
        i2 = i2 < 8192 ? 8192 : i2;
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
