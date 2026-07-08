package X;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: renamed from: X.12eM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19805612eM {
    public long LIZ;
    public long LIZIZ;
    public final C19809912f3 LIZJ;
    public final /* synthetic */ C19809512ez LIZLLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.12f3] */
    public C19805612eM(C19809512ez c19809512ez) {
        this.LIZLLL = c19809512ez;
        final C19804712eD c19804712eD = c19809512ez.LIZ;
        this.LIZJ = new AbstractC19809612f0(c19804712eD) { // from class: X.12f3
            @Override // X.AbstractC19809612f0
            public final void LIZJ() {
                C19805612eM c19805612eM = this.LJ;
                c19805612eM.LIZLLL.LJ();
                c19805612eM.LIZLLL.LIZ.LJIILIIL.getClass();
                c19805612eM.LIZ(SystemClock.elapsedRealtime(), false, false);
                C19806012eQ c19806012eQLJIIIIZZ = c19805612eM.LIZLLL.LIZ.LJIIIIZZ();
                c19805612eM.LIZLLL.LIZ.LJIILIIL.getClass();
                c19806012eQLJIIIIZZ.LJIIJJI(SystemClock.elapsedRealtime());
            }
        };
        c19809512ez.LIZ.LJIILIIL.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZ = jElapsedRealtime;
        this.LIZIZ = jElapsedRealtime;
    }

    public final boolean LIZ(long j, boolean z, boolean z2) {
        this.LIZLLL.LJ();
        this.LIZLLL.LJIIJJI();
        if (this.LIZLLL.LIZ.LJFF()) {
            C19811012fE c19811012fE = this.LIZLLL.LIZIZ().LJIILLIIL;
            this.LIZLLL.LIZ.LJIILIIL.getClass();
            c19811012fE.LIZIZ(System.currentTimeMillis());
        }
        long j2 = j - this.LIZ;
        if (!z && j2 < 1000) {
            this.LIZLLL.LJIILJJIL().LJIILIIL.LIZ(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.LIZIZ;
            this.LIZIZ = j;
        }
        this.LIZLLL.LJIILJJIL().LJIILIIL.LIZ(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        C19803112dx.LJJIJLIJ(this.LIZLLL.LJIIIIZZ().LJIIZILJ(!this.LIZLLL.LIZ.LJI.LJIL()), bundle, true);
        if (!z2) {
            this.LIZLLL.LJII().LJJJIL("auto", "_e", bundle);
        }
        this.LIZ = j;
        LIZ();
        LIZIZ(C19817012gC.LJJJLIIL.LIZ(null).longValue());
        return true;
    }
}
