package X;

import Y.ARunnableS133S0100000_33;
import android.os.Handler;
import android.os.SystemClock;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1AfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184971AfH {
    public volatile long LIZ;
    public volatile long LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public volatile long LJFF;
    public long LJI;
    public volatile long LIZIZ = -1;
    public final C01GW LJII = C452501pT.LIZ(EnumC452301pR.NONE, AFwS224S0000000_33.get$arr$(585));
    public final ARunnableS133S0100000_33 LJIIIIZZ = new ARunnableS133S0100000_33(this, 100);
    public final ARunnableS133S0100000_33 LJIIIZ = new ARunnableS133S0100000_33(this, 101);

    public final void LIZ() {
        if (this.LIZLLL) {
            if (this.LJ) {
                this.LIZJ++;
            } else {
                this.LJ = true;
                this.LJFF = SystemClock.elapsedRealtime();
                C786410Ut5.LJJZZIII((Handler) this.LJII.getValue(), this.LJIIIIZZ);
            }
            C786410Ut5.LJLIIL(this.LJI, C0NBO.LIZIZ(), this.LJIIIZ);
        }
    }
}
