package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS56S0300000_23;
import Y.ARunnableS92S0200000_23;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0pXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515690pXr implements C0POE<Object> {
    public int LIZ;
    public final /* synthetic */ ExecutorService LIZIZ;
    public final /* synthetic */ C0POE LIZJ;
    public final /* synthetic */ C1515660pXo LIZLLL;

    @Override // X.C0POE
    public final void onComplete() {
        this.LIZIZ.submit(new ARunnableS123S0100000_23(this.LIZJ, 166));
    }

    @Override // X.C0POE
    public final void onFailed(Throwable th) {
        this.LIZIZ.submit(new ARunnableS92S0200000_23(this.LIZJ, th, 106));
    }

    @Override // X.C0POE
    public final void onNext(Object obj) {
        int size;
        C0PQA c0pqaLIZIZ = this.LIZLLL.LIZ.LIZIZ();
        C0PQA c0pqaLIZIZ2 = this.LIZLLL.LIZ.LIZIZ();
        synchronized (c0pqaLIZIZ2) {
            size = c0pqaLIZIZ2.LIZ.size();
        }
        this.LIZIZ.submit(new ARunnableS56S0300000_23(this, obj, c0pqaLIZIZ.LIZ(size - 1), 22));
    }

    public C1515690pXr(C1515660pXo c1515660pXo, ExecutorService executorService, C0POE c0poe) {
        this.LIZLLL = c1515660pXo;
        this.LIZIZ = executorService;
        this.LIZJ = c0poe;
    }
}
