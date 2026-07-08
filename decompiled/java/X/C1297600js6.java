package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0js6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297600js6 extends AbstractC1297590js5 {
    public AbstractC1297590js5 LIZIZ;
    public AbstractC1297590js5 LIZJ;

    @Override // X.AbstractC1297590js5
    public final int LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // X.AbstractC1297590js5
    public final boolean LIZLLL() {
        return this.LIZIZ.LIZLLL();
    }

    public C1297600js6(int i) {
        super(i);
        this.LIZIZ = AbstractC1297590js5.LIZ(i);
        this.LIZJ = AbstractC1297590js5.LIZ(1);
    }

    @Override // X.AbstractC1297590js5
    public final void LIZJ(int i) {
        this.LIZIZ.LIZJ(i);
    }

    @Override // X.AbstractC1297590js5
    public final void LJFF(int i) {
        try {
            this.LIZIZ.LJFF(i);
        } catch (IllegalMonitorStateException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                this.LIZJ.LJFF(i);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public final void LJI(int i) {
        if (this.LIZIZ.LIZIZ() != i) {
            this.LIZJ = this.LIZIZ;
            this.LIZIZ = AbstractC1297590js5.LIZ(i);
        }
    }

    @Override // X.AbstractC1297590js5
    public final boolean LJ(long j, TimeUnit timeUnit) {
        return this.LIZIZ.LJ(j, timeUnit);
    }
}
