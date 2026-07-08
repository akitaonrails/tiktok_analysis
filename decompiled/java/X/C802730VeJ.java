package X;

import Y.ARunnableS113S0100000_13;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0VeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802730VeJ extends AbstractC802420Vdo {
    public final ARunnableS113S0100000_13 LJ;
    public final AtomicInteger LJFF;
    public long LJI;
    public long LJII;
    public volatile boolean LJIIIIZZ;

    public final void LJFF() {
        File[] fileArrListFiles;
        if (this.LJFF.decrementAndGet() > 0) {
            return;
        }
        if (this.LJII == 0) {
            C802620Ve8 c802620Ve8 = this.LIZ;
            int iMyPid = Process.myPid();
            long j = this.LIZJ;
            File file = null;
            if (c802620Ve8.LIZLLL.exists() && (fileArrListFiles = c802620Ve8.LIZLLL.listFiles(new C803510VfZ())) != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    if (C802620Ve8.LIZLLL(file2.getName()) == iMyPid && Math.abs(j - C802620Ve8.LIZJ(file2.getName())) <= 35000) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
            synchronized (this) {
                try {
                    this.LJII = LIZJ(file);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (this.LJII != 0) {
            C0VXF.postDelayed(new ARunnableS113S0100000_13(this, 25), 120000L);
        } else if (this.LJIIIIZZ) {
            C802430Vdp.LIZLLL(this);
            if (this.LJFF.decrementAndGet() < 0) {
                C2112008Pe.LJ(this.LIZIZ);
            }
        }
    }

    @Override // X.AbstractC802420Vdo
    public final boolean LIZIZ(boolean z) {
        if (z) {
            if (this.LJI != 0) {
                return true;
            }
            return false;
        }
        if (this.LJII != 0) {
            return true;
        }
        return false;
    }

    public C802730VeJ(C802620Ve8 c802620Ve8, C0VSJ c0vsj, long j, boolean z) {
        super(c802620Ve8, c0vsj, j, z);
        this.LJFF = new AtomicInteger(0);
        this.LJ = new ARunnableS113S0100000_13(this, 24);
    }

    @Override // X.AbstractC802420Vdo
    public final void LJ(long j, boolean z, C0VSJ c0vsj, int i, int i2) {
        if (this.LJFF.incrementAndGet() <= 0) {
            return;
        }
        if (z) {
            synchronized (this) {
                try {
                    this.LJI = j;
                } finally {
                }
            }
            if (this.LJII == 0) {
                C0VXF.postDelayed(this.LJ, 35000L);
            }
        } else {
            if (this.LJI != 0) {
                C0VXF.removeCallbacks(this.LJ);
            }
            synchronized (this) {
                try {
                    this.LJII = LIZJ(c0vsj);
                } finally {
                }
            }
        }
        LIZLLL(i, i2);
        if (c0vsj != null) {
            AbstractC802420Vdo.LIZ(c0vsj);
        }
        LJFF();
    }
}
