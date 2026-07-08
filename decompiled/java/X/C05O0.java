package X;

import Y.AfS171S0100000_2;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05O0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05O0 {
    public final InterfaceC497601wk LIZ;
    public final long LIZIZ;
    public final Function0<Unit> LIZJ;
    public final boolean LIZLLL;
    public volatile long LJ;
    public volatile long LJFF;
    public AnonymousClass0956 LJI;
    public C11JF LJII;

    public final void LIZ() {
        if (this.LJ == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJ;
        if (jElapsedRealtime < this.LIZIZ) {
            AnonymousClass0956 anonymousClass0956 = this.LJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJI = C23250099c.LIZLLL(this.LIZ, null, null, new C1344505Nz(this, jElapsedRealtime, null), 3);
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LJI = null;
        C11JF c11jf = this.LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJII = null;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LIZJ.invoke();
    }

    public final void LIZIZ() {
        if (this.LJII == null) {
            this.LJII = C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS171S0100000_2(this, 40));
        }
        if (this.LJ == 0) {
            this.LJ = SystemClock.elapsedRealtime();
        }
        if (!C1906580ziK.LJI()) {
            LIZ();
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LIZLLL || this.LJFF != 0) {
            return;
        }
        this.LJFF = this.LJ;
    }

    public C05O0(C054G c054g, long j, Function0 function0, boolean z) {
        this.LIZ = c054g;
        this.LIZIZ = j;
        this.LIZJ = function0;
        this.LIZLLL = z;
    }
}
