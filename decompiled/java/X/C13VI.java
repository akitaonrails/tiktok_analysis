package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.13VI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13VI implements InterfaceC345370DgN {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC345370DgN
    public String LIZ() {
        return null;
    }

    @Override // X.InterfaceC345370DgN
    public abstract File LJIIIIZZ();

    public abstract long LJIIIZ(boolean z);

    public long LJIILIIL() {
        return LJIIJ(true);
    }

    @Override // X.InterfaceC345370DgN
    public final long LIZJ() {
        long jLJIILIIL = 0;
        if (this.LIZ.get()) {
            return 0L;
        }
        try {
            try {
                LJFF(true);
                jLJIILIIL = LJIILIIL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJIILJJIL(jLJIILIIL, true);
            return jLJIILIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIILJJIL(jLJIILIIL, true);
            throw th;
        }
    }

    @Override // X.InterfaceC345370DgN
    public final long LJI() {
        long jLJIIL = 0;
        if (this.LIZ.get()) {
            return 0L;
        }
        try {
            try {
                LJFF(true);
                jLJIIL = LJIIL(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJIILJJIL(jLJIIL, true);
            return jLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIILJJIL(jLJIIL, true);
            throw th;
        }
    }

    @Override // X.InterfaceC345370DgN
    public final long LIZIZ(boolean z) {
        long jLJIIIZ = 0;
        if (this.LIZ.get()) {
            return 0L;
        }
        try {
            try {
                LJFF(true);
                jLJIIIZ = LJIIIZ(z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJIILJJIL(jLJIIIZ, z);
            return jLJIIIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIILJJIL(jLJIIIZ, z);
            throw th;
        }
    }

    @Override // X.InterfaceC345370DgN
    public final long LJ(boolean z) {
        long jLJIIJJI = 0;
        if (this.LIZ.get()) {
            return 0L;
        }
        try {
            try {
                LJFF(true);
                jLJIIJJI = LJIIJJI(z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJIILJJIL(jLJIIJJI, z);
            return jLJIIJJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIILJJIL(jLJIIJJI, z);
            throw th;
        }
    }

    @Override // X.InterfaceC345370DgN
    public void LJFF(boolean z) {
        this.LIZ.set(true);
    }

    @Override // X.InterfaceC345370DgN
    public final long LJII(boolean z) {
        long jLJIIJ = 0;
        try {
            if (this.LIZ.get()) {
                return 0L;
            }
            try {
                LJFF(z);
                jLJIIJ = LJIIJ(z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJIILJJIL(jLJIIJ, z);
            return jLJIIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIILJJIL(jLJIIJ, z);
            throw th;
        }
    }

    public long LJIIJ(boolean z) {
        return LJ(z);
    }

    public long LJIIJJI(boolean z) {
        return LJIIL(z);
    }

    public long LJIIL(boolean z) {
        return LJIIIZ(z);
    }

    public void LJIILJJIL(long j, boolean z) {
        this.LIZ.set(false);
    }
}
