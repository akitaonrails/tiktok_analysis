package androidx.work.impl.workers;

import X.AbstractC795160VHe;
import X.C0VGX;
import X.C0VI8;
import X.C134N;
import X.C786410Ut5;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements C0VGX {
    public final WorkerParameters LLILZLL;
    public final Object LLIZ;
    public volatile boolean LLIZLLLIL;
    public final C134N<AbstractC795160VHe> LLJ;
    public ListenableWorker LLJI;

    @Override // X.C0VGX
    public final void LJ(List<String> list) {
    }

    static {
        C0VI8.LIZIZ("ConstraintTrkngWrkr");
    }

    @Override // androidx.work.ListenableWorker
    public final boolean LIZIZ() {
        ListenableWorker listenableWorker = this.LLJI;
        return listenableWorker != null && listenableWorker.LIZIZ();
    }

    @Override // androidx.work.ListenableWorker
    public final void LIZLLL() {
        ListenableWorker listenableWorker = this.LLJI;
        if (listenableWorker == null || listenableWorker.LLILLL) {
            return;
        }
        this.LLJI.LJI();
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<AbstractC795160VHe> LJFF() {
        this.LLILLJJLI.LIZJ.execute(new ARunnableS113S0100000_13(this, 14));
        return this.LLJ;
    }

    @Override // X.C0VGX
    public final void LIZJ(List<String> list) {
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Constraints changed for %s", new Object[]{list});
        c0vi8LIZ.getClass();
        synchronized (this.LLIZ) {
            try {
                this.LLIZLLLIL = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.LLILZLL = workerParameters;
        this.LLIZ = new Object();
        this.LLIZLLLIL = false;
        this.LLJ = new C134N<>();
    }
}
