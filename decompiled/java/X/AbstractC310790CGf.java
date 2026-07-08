package X;

import Y.ARunnableS104S0100000_4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0CGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC310790CGf extends C310800CGg {
    public final LinkedList<C310810CGh> LIZJ;
    public final AtomicBoolean LIZLLL;
    public final AtomicBoolean LJ;

    public AbstractC310790CGf(boolean z) {
        super(z);
        this.LIZJ = new LinkedList<>();
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new AtomicBoolean(false);
    }

    @Override // X.C310800CGg
    public final void LIZJ(long j, String str) {
        if (this.LJ.get()) {
            super.LIZJ(j, str);
            return;
        }
        if (this.LIZLLL.compareAndSet(false, true)) {
            C823050WQl.LJ().schedule(new ARunnableS104S0100000_4(this, 54), 15000L, TimeUnit.MILLISECONDS);
        }
        synchronized (this.LIZJ) {
            try {
                if (this.LJ.get()) {
                    super.LIZJ(j, str);
                } else {
                    this.LIZJ.add(new C310810CGh(str, j));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
