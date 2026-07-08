package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A48, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A48 {
    public static int LJIIJ;
    public static final C1A4D LJIIJJI = new Object() { // from class: X.1A4D
    };
    public final String LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final C1696760uFu LJFF;
    public final long LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + C1685910tyP.LJIIJ(this.LJI)) * 31) + this.LJII) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A48)) {
            return false;
        }
        C1A48 c1a48 = (C1A48) obj;
        if (Intrinsics.LJFF(this.LIZ, c1a48.LIZ) && C1668650tWZ.LIZJ(this.LIZIZ, c1a48.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, c1a48.LIZJ) && this.LIZLLL == c1a48.LIZLLL && this.LJ == c1a48.LJ && Intrinsics.LJFF(this.LJFF, c1a48.LJFF) && C1685910tyP.LJ(this.LJI, c1a48.LJI) && this.LJII == c1a48.LJII && this.LJIIIIZZ == c1a48.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public C1A48(String str, float f, float f2, float f3, float f4, C1696760uFu c1696760uFu, long j, int i, boolean z) {
        int i2;
        synchronized (LJIIJJI) {
            try {
                i2 = LJIIJ;
                LJIIJ = i2 + 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = c1696760uFu;
        this.LJI = j;
        this.LJII = i;
        this.LJIIIIZZ = z;
        this.LJIIIZ = i2;
    }
}
