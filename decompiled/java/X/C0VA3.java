package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VA3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VA3 extends AbstractC793260V9w {
    public boolean LIZIZ;
    public long LIZJ;
    public C0VA2 LIZLLL;
    public final Map<Long, C0VAB> LJ;
    public final Map<Long, C0VA2> LJFF;
    public final C0VA8 LJI;
    public C0VA4 LJII;
    public final C0VAF LJIIIIZZ;
    public C0VAG LJIIIZ;
    public final Map<Long, C0VAE> LJIIJ;
    public final Map<Long, C0VAD> LJIIJJI;
    public final C0VA7 LJIIL;
    public C0VA5 LJIILIIL;
    public final ArrayList<Long> LJIILJJIL;

    public final synchronized void LIZ() {
        if (this.LIZIZ) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((C0VA1) this.LIZ).LJFF.getClass();
            if (((C0VA1) this.LIZ).LJFF.LIZ) {
                LIZIZ(jElapsedRealtime);
            }
            ((C0VA1) this.LIZ).LJFF.getClass();
            this.LIZJ = jElapsedRealtime;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(long r22) {
        /*
            Method dump skipped, instruction units count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VA3.LIZIZ(long):void");
    }

    public C0VA3(Context context, C0V9Z c0v9z) {
        super(context, c0v9z);
        new C0VAC() { // from class: X.0VAB
        };
        this.LIZLLL = new C0VA2();
        this.LJ = new HashMap();
        this.LJFF = new HashMap();
        this.LJI = new C0VA8();
        this.LJII = new C0VA4();
        this.LJIIIIZZ = new C0VAF();
        this.LJIIIZ = new C0VAG();
        this.LJIIJ = new HashMap();
        this.LJIIJJI = new HashMap();
        this.LJIIL = new C0VA7();
        this.LJIILIIL = new C0VA5();
        this.LJIILJJIL = new ArrayList<>();
    }
}
