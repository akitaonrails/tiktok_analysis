package X;

import android.os.SystemClock;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0rHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582370rHP implements InterfaceC1582440rHW {
    public static final C054G LJIIIIZZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ).plus(new C2502509rL(CoroutineExceptionHandler.LJJLIL, 6)));
    public final InterfaceC1582410rHT LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL = Long.MIN_VALUE;
    public C1582380rHQ LJ;
    public C1893007bE LJFF;
    public C1892907bD LJI;
    public C1582400rHS LJII;

    @Override // X.InterfaceC1582440rHW
    public final synchronized void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = C1150504el.LIZ().LJJII;
        this.LJII = new C1582400rHS(this.LIZ.LIZLLL(), jElapsedRealtime, jCurrentTimeMillis, this.LIZ.LIZIZ(), j, this.LIZ.LJ(), this.LIZ.LIZ());
        LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1582440rHW
    public final synchronized void LIZ() {
        String message;
        InterfaceC1582420rHU interfaceC1582420rHU;
        C1582380rHQ c1582380rHQ = this.LJ;
        if (c1582380rHQ == null) {
            this.LJII = null;
            return;
        }
        this.LJ = null;
        C1893007bE c1893007bE = this.LJFF;
        if (c1893007bE == null) {
            c1893007bE = new C1893007bE(null, true);
        }
        this.LJFF = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - c1582380rHQ.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C1150504el.LIZ().LJJII;
        int iLIZ = this.LIZ.LIZ();
        boolean z = c1893007bE.LIZ;
        Throwable th = c1893007bE.LIZIZ;
        int code = (z || !(th instanceof InterfaceC1582420rHU) || (interfaceC1582420rHU = (InterfaceC1582420rHU) th) == null) ? -1 : interfaceC1582420rHU.getCode();
        if (z || th == 0 || (message = th.getMessage()) == null) {
            message = "";
        }
        C23250099c.LIZLLL(LJIIIIZZ, null, null, new C1582350rHN(this, jCurrentTimeMillis, j, iLIZ, c1582380rHQ, jElapsedRealtime, z, code, message, null), 3);
    }

    public final void LIZJ() {
        C1892907bD c1892907bD;
        C1582400rHS c1582400rHS = this.LJII;
        if (c1582400rHS == null || (c1892907bD = this.LJI) == null) {
            return;
        }
        this.LJII = null;
        this.LJI = null;
        long j = c1582400rHS.LIZLLL;
        if (j != this.LIZLLL) {
            this.LIZIZ = 0;
            this.LIZJ = 0L;
            this.LIZLLL = j;
        }
        long j2 = this.LIZJ;
        long j3 = j2 == 0 ? 0L : c1582400rHS.LIZIZ - j2;
        long j4 = c1582400rHS.LIZIZ;
        this.LIZJ = j4;
        int i = this.LIZIZ + 1;
        this.LIZIZ = i;
        long j5 = c1582400rHS.LIZ;
        long j6 = c1582400rHS.LIZJ;
        int i2 = c1582400rHS.LJ;
        int i3 = c1582400rHS.LJFF;
        C1582390rHR c1582390rHR = new C1582390rHR(j5, j4, j6, i, j3, j, i2, i3, c1582400rHS.LJI);
        Integer num = c1892907bD.LIZ;
        this.LJ = new C1582380rHQ(j5, j3, i, i2, i3, j, num);
        C23250099c.LIZLLL(LJIIIIZZ, null, null, new C1582360rHO(this, c1582390rHR, num, null), 3);
    }

    public C1582370rHP(C1567360qtC c1567360qtC) {
        this.LIZ = c1567360qtC;
    }
}
