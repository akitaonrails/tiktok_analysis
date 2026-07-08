package X;

import Y.ARunnableS113S0100000_13;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0VeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802820VeS extends AbstractC802420Vdo {
    public ARunnableS113S0100000_13 LJ;
    public final AtomicInteger LJFF;

    @Override // X.AbstractC802420Vdo
    public final boolean LIZIZ(boolean z) {
        return false;
    }

    public final void LJFF() {
        if (this.LJFF.get() <= 0) {
            AbstractC802420Vdo.LIZ(new C0VSJ(this.LIZIZ, "anr_info.txt"));
            C0VXF.removeCallbacks(this.LJ);
            this.LJ = null;
            C802430Vdp.LIZLLL(this);
        }
    }

    public C802820VeS(C802620Ve8 c802620Ve8, C0VSJ c0vsj, long j, boolean z) {
        super(c802620Ve8, c0vsj, j, z);
        this.LJFF = new AtomicInteger(2);
    }

    @Override // X.AbstractC802420Vdo
    public final void LJ(long j, boolean z, C0VSJ c0vsj, int i, int i2) {
        if (this.LJFF.decrementAndGet() < 0) {
            return;
        }
        if (this.LJ == null) {
            ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 26);
            this.LJ = aRunnableS113S0100000_13;
            C0VXF.postDelayed(aRunnableS113S0100000_13, 120000L);
        }
        if (c0vsj != null && c0vsj.exists()) {
            LIZJ(c0vsj);
        }
        LIZLLL(i, i2);
        if (this.LIZIZ.exists() && !new C0VSJ(this.LIZIZ, "anr_info.txt").exists()) {
            C2112008Pe.LJII(new C0VSJ(this.LIZIZ, "anr_info.txt"), "silent anr no anr info");
        }
        LJFF();
    }
}
