package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13YG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13YG {
    public static final /* synthetic */ int LJ = 0;
    public C13BZ LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public void LIZJ() {
        this.LIZJ = true;
        synchronized (C13YE.LIZJ) {
            try {
                LJIILJJIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public abstract Function1<Object, Unit> LJ();

    public abstract boolean LJFF();

    public int LJII() {
        return 0;
    }

    public abstract Function1<Object, Unit> LJIIIIZZ();

    public abstract void LJIIJ();

    public abstract void LJIIJJI();

    public abstract void LJIIL();

    public abstract void LJIILIIL(C13YP c13yp);

    public abstract C13YG LJIJJ(Function1<Object, Unit> function1);

    public final void LIZ() {
        synchronized (C13YE.LIZJ) {
            try {
                LIZIZ();
                LJIILL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void LIZIZ() {
        C13YE.LIZLLL = C13YE.LIZLLL.LJ(LJI());
    }

    public final C13YG LJIIIZ() {
        C13YU<C13YG> c13yu = C13YE.LIZIZ;
        C13YG c13ygLIZ = c13yu.LIZ();
        c13yu.LIZIZ(this);
        return c13ygLIZ;
    }

    public final void LJIILJJIL() {
        int i = this.LIZLLL;
        if (i >= 0) {
            C13YE.LJIJJ(i);
            this.LIZLLL = -1;
        }
    }

    public C13BZ LIZLLL() {
        return this.LIZ;
    }

    public long LJI() {
        return this.LIZIZ;
    }

    public void LJIILL() {
        LJIILJJIL();
    }

    public static void LJIILLIIL(C13YG c13yg) {
        C13YE.LIZIZ.LIZIZ(c13yg);
    }

    public void LJIIZILJ(C13BZ c13bz) {
        this.LIZ = c13bz;
    }

    public void LJIJ(long j) {
        this.LIZIZ = j;
    }

    public void LJIJI(int i) {
        "Updating write count is not supported for this snapshot".toString();
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public C13YG(long j, C13BZ c13bz) {
        int iLIZ;
        long j2;
        int iNumberOfTrailingZeros;
        this.LIZ = c13bz;
        this.LIZIZ = j;
        C13YC c13yc = C13YE.LIZ;
        if (j != 0) {
            C13BZ c13bzLIZLLL = LIZLLL();
            long[] jArr = c13bzLIZLLL.LLILZ;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = c13bzLIZLLL.LLILLJJLI;
                if (j3 != 0) {
                    j2 = c13bzLIZLLL.LLILLL;
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = c13bzLIZLLL.LL;
                    if (j4 != 0) {
                        j2 = c13bzLIZLLL.LLILLL + ((long) 64);
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + ((long) iNumberOfTrailingZeros);
            }
            synchronized (C13YE.LIZJ) {
                try {
                    iLIZ = C13YE.LJFF.LIZ(j);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            iLIZ = -1;
        }
        this.LIZLLL = iLIZ;
    }
}
