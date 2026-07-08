package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0VMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C796640VMw {
    public final long[] LIZ;
    public final boolean[] LIZIZ;
    public final int[] LIZJ;
    public boolean LIZLLL;

    public final int[] LIZ() {
        synchronized (this) {
            try {
                if (!this.LIZLLL) {
                    return null;
                }
                int length = this.LIZ.length;
                for (int i = 0; i < length; i++) {
                    boolean z = this.LIZ[i] > 0;
                    boolean[] zArr = this.LIZIZ;
                    if (z != zArr[i]) {
                        this.LIZJ[i] = z ? 1 : 2;
                    } else {
                        this.LIZJ[i] = 0;
                    }
                    zArr[i] = z;
                }
                this.LIZLLL = false;
                return (int[]) this.LIZJ.clone();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C796640VMw(int i) {
        long[] jArr = new long[i];
        this.LIZ = jArr;
        boolean[] zArr = new boolean[i];
        this.LIZIZ = zArr;
        this.LIZJ = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public final boolean LIZIZ(int... iArr) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.LIZ;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.LIZLLL = true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final boolean LIZJ(int... iArr) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.LIZ;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.LIZLLL = true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
