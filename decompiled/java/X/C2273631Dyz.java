package X;

import android.os.Process;
import com.bytedance.otis.resource.psi.proc.MainSchedNative;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Dyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273631Dyz {
    public static final C2273631Dyz LJJIJL = new C2273631Dyz();
    public final Object LIZ = new Object();
    public long LIZIZ = 0;
    public long LIZJ = 0;
    public long LIZLLL = 0;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public boolean LJIIJ = false;
    public long LJIIJJI = 0;
    public long LJIIL = -1;
    public long LJIILIIL = 0;
    public long LJIILJJIL = -1;
    public long LJIILL = 0;
    public long LJIILLIIL = -1;
    public long LJIIZILJ = -1;
    public long LJIJ = -1;
    public long LJIJI = -1;
    public long LJIJJ = 0;
    public long LJIJJLI = 0;
    public long LJIL = 0;
    public long LJJ = 0;
    public volatile long LJJI = 5000000;
    public final int LJJIFFI;
    public final C2273661Dz2 LJJII;
    public volatile boolean LJJIII;
    public volatile C08NV LJJIIJ;
    public final long[] LJJIIJZLJL;
    public volatile long LJJIIZ;
    public volatile long LJJIIZI;
    public volatile long LJJIJ;
    public volatile long LJJIJIIJI;
    public volatile long LJJIJIIJIL;
    public volatile boolean LJJIJIL;

    public static long LIZLLL(long j, long j2) {
        if (j < 0 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    public final void LJII() {
        synchronized (this.LIZ) {
            try {
                this.LJ = -1L;
                this.LJFF = -1L;
                this.LJI = -1L;
                this.LJII = -1L;
                this.LJIIIIZZ = -1L;
                this.LJIIIZ = -1L;
                this.LJIIJ = false;
                this.LJIIL = -1L;
                this.LJIILLIIL = -1L;
                this.LJIILJJIL = -1L;
                this.LJIIZILJ = -1L;
                this.LJIJ = -1L;
                this.LJIJI = -1L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C2273631Dyz() {
        int iMyPid = Process.myPid();
        this.LJJIFFI = iMyPid;
        this.LJJII = new C2273661Dz2(iMyPid);
        this.LJJIII = false;
        this.LJJIIJZLJL = new long[3];
        this.LJJIIZ = 0L;
        this.LJJIIZI = 0L;
        this.LJJIJ = 0L;
        this.LJJIJIIJI = 0L;
        this.LJJIJIIJIL = 0L;
        this.LJJIJIL = false;
    }

    public final void LJ() throws Throwable {
        long j;
        long j2;
        long j3;
        long j4;
        long jNanoTime = System.nanoTime();
        if (LJI(this.LJJIIJZLJL)) {
            long[] jArr = this.LJJIIJZLJL;
            j2 = jArr[0];
            j = jArr[1];
        } else {
            j = -1;
            j2 = -1;
        }
        this.LJJIJ++;
        synchronized (this.LIZ) {
            try {
                long j5 = this.LJIIL;
                try {
                    if (j5 > 0) {
                        if (jNanoTime > j5) {
                            j3 = jNanoTime - j5;
                            if (j3 > 0) {
                                this.LJIIJJI += j3;
                            }
                        } else {
                            j3 = 0;
                        }
                        long j6 = this.LJIILJJIL;
                        if (j6 >= 0 && j >= j6) {
                            this.LJIILIIL += j - j6;
                        }
                        long j7 = this.LJIILLIIL;
                        if (j7 < 0 || j2 < j7) {
                            j4 = -1;
                        } else {
                            j4 = j2 - j7;
                            this.LJIILL += j4;
                        }
                        int i = (this.LJIIZILJ > 0L ? 1 : (this.LJIIZILJ == 0L ? 0 : -1));
                        int i2 = (this.LJIJ > 0L ? 1 : (this.LJIJ == 0L ? 0 : -1));
                        int i3 = (this.LJIJI > 0L ? 1 : (this.LJIJI == 0L ? 0 : -1));
                        if (j3 >= this.LJJI) {
                            this.LJIL++;
                            if (j4 >= 0) {
                                this.LJIJJ += Math.max(0L, j3 - j4);
                            }
                        } else {
                            this.LJJ++;
                            if (j4 >= 0) {
                                this.LJIJJLI += Math.max(0L, j3 - j4);
                            }
                        }
                    } else if (this.LJ <= 0 || !this.LJIIJ) {
                        this.LJJIJIIJIL++;
                    } else {
                        LIZIZ(jNanoTime, j2, j);
                    }
                    this.LJIIL = -1L;
                    this.LJIILJJIL = -1L;
                    this.LJIILLIIL = -1L;
                    this.LJIIZILJ = -1L;
                    this.LJIJ = -1L;
                    this.LJIJI = -1L;
                    this.LJ = jNanoTime;
                    this.LJFF = j2;
                    this.LJI = j;
                    this.LJII = -1L;
                    this.LJIIIIZZ = -1L;
                    this.LJIIIZ = -1L;
                    this.LJIIJ = false;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void LJFF() {
        long j;
        long j2;
        long jNanoTime = System.nanoTime();
        if (LJI(this.LJJIIJZLJL)) {
            long[] jArr = this.LJJIIJZLJL;
            j = jArr[0];
            j2 = jArr[1];
        } else {
            j = -1;
            j2 = -1;
        }
        this.LJJIIZI++;
        synchronized (this.LIZ) {
            try {
                long j3 = this.LJ;
                if (j3 > 0) {
                    if (jNanoTime > j3) {
                        this.LIZIZ += jNanoTime - j3;
                    }
                    long j4 = this.LJFF;
                    if (j4 >= 0 && j >= j4) {
                        this.LIZJ += j - j4;
                    }
                    long j5 = this.LJI;
                    if (j5 >= 0 && j2 >= j5) {
                        this.LIZLLL += j2 - j5;
                    }
                    int i = (this.LJII > 0L ? 1 : (this.LJII == 0L ? 0 : -1));
                    int i2 = (this.LJIIIIZZ > 0L ? 1 : (this.LJIIIIZZ == 0L ? 0 : -1));
                    int i3 = (this.LJIIIZ > 0L ? 1 : (this.LJIIIZ == 0L ? 0 : -1));
                    this.LJ = -1L;
                    this.LJFF = -1L;
                    this.LJI = -1L;
                    this.LJII = -1L;
                    this.LJIIIIZZ = -1L;
                    this.LJIIIZ = -1L;
                    this.LJIIJ = false;
                } else {
                    this.LJJIJIIJI++;
                }
                this.LJIIL = jNanoTime;
                this.LJIILJJIL = j2;
                this.LJIILLIIL = j;
                this.LJIIZILJ = -1L;
                this.LJIJ = -1L;
                this.LJIJI = -1L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2273611Dyx LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2273631Dyz.LJIIIIZZ():X.1Dyx");
    }

    public final boolean LJI(long[] jArr) {
        if (this.LJJIII && MainSchedNative.LIZLLL(this.LJJIFFI, jArr)) {
            return true;
        }
        C08NV c08nv = this.LJJIIJ;
        if (c08nv == null) {
            synchronized (this) {
                try {
                    c08nv = this.LJJIIJ;
                    if (c08nv == null) {
                        c08nv = new C08NV(this.LJJIFFI);
                        this.LJJIIJ = c08nv;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C2097208Jm c2097208JmLIZ = c08nv.LIZ();
        if (c2097208JmLIZ == null) {
            return false;
        }
        jArr[0] = c2097208JmLIZ.LIZ;
        jArr[1] = c2097208JmLIZ.LIZIZ;
        return true;
    }

    public final void LIZIZ(long j, long j2, long j3) {
        long j4;
        long j5 = this.LJ;
        if (j > j5) {
            j4 = j - j5;
        } else {
            j4 = 0;
        }
        long jLIZLLL = LIZLLL(this.LJFF, j2);
        long jLIZLLL2 = LIZLLL(this.LJI, j3);
        this.LJJIIZI++;
        if (j4 > 0) {
            this.LJIIJJI += j4;
        }
        if (jLIZLLL >= 0) {
            this.LJIILL += jLIZLLL;
        }
        if (jLIZLLL2 >= 0) {
            this.LJIILIIL += jLIZLLL2;
        }
        if (j4 >= this.LJJI) {
            this.LJIL++;
            if (jLIZLLL >= 0) {
                this.LJIJJ += Math.max(0L, j4 - jLIZLLL);
                return;
            }
            return;
        }
        this.LJJ++;
        if (jLIZLLL < 0) {
            return;
        }
        this.LJIJJLI += Math.max(0L, j4 - jLIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[Catch: all -> 0x00f5, DONT_GENERATE, TryCatch #1 {all -> 0x00f5, blocks: (B:14:0x0023, B:18:0x0041, B:32:0x007c, B:19:0x0050, B:23:0x005a), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x00f3, TRY_ENTER, TryCatch #0 {all -> 0x00f3, blocks: (B:35:0x007f, B:40:0x009d, B:42:0x00b0, B:44:0x00b2, B:48:0x00d3, B:49:0x00ee, B:47:0x00c3, B:51:0x00f0), top: B:65:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2273651Dz1 LIZJ(X.C2214701Bm8 r38, X.C2214701Bm8 r39, boolean r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2273631Dyz.LIZJ(X.1Bm8, X.1Bm8, boolean):X.1Dz1");
    }

    public final void LIZ(C2214701Bm8 c2214701Bm8, long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j - c2214701Bm8.LIZ;
        long jLIZLLL = LIZLLL(c2214701Bm8.LIZIZ, j2);
        long jLIZLLL2 = LIZLLL(c2214701Bm8.LIZJ, j3);
        this.LJJIIZI++;
        this.LJJIJ++;
        this.LJIIJJI += j7;
        if (jLIZLLL >= 0) {
            this.LJIILL += jLIZLLL;
        }
        if (jLIZLLL2 >= 0) {
            this.LJIILIIL += jLIZLLL2;
        }
        if (j7 >= this.LJJI) {
            this.LJIL++;
            if (jLIZLLL >= 0) {
                this.LJIJJ += Math.max(0L, j7 - jLIZLLL);
                return;
            }
            return;
        }
        this.LJJ++;
        if (jLIZLLL < 0) {
            return;
        }
        this.LJIJJLI += Math.max(0L, j7 - jLIZLLL);
    }
}
