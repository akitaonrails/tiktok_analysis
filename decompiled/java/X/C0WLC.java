package X;

import Y.ARunnableS18S1200000_13;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0WLC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLC implements C0WON {
    public C0WLB LIZ;
    public final ExecutorService LIZIZ;

    @Override // X.C0WON
    public final boolean LIZ(C0WLA c0wla) {
        return false;
    }

    @Override // X.C0WON
    public final void LIZIZ(C0WLA c0wla) {
        ExecutorService executorService = this.LIZIZ;
        if (executorService != null) {
            executorService.execute(new ARunnableS18S1200000_13(c0wla, this, "CALLBACK", 12));
        }
    }

    @Override // X.C0WON
    public final void LIZJ(C0WLA c0wla) {
        ExecutorService executorService = this.LIZIZ;
        if (executorService != null) {
            executorService.execute(new ARunnableS18S1200000_13(c0wla, this, "RETURN", 12));
        }
    }

    public C0WLC(C0WLB c0wlb, ExecutorService executorService) {
        this.LIZ = c0wlb;
        this.LIZIZ = executorService;
    }
}
