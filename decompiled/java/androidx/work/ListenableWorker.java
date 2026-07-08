package androidx.work;

import X.AbstractC795160VHe;
import X.C134N;
import X.C788790Uwv;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ListenableWorker {
    public final Context LL;
    public final WorkerParameters LLILLJJLI;
    public volatile boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public void LIZLLL() {
    }

    public abstract ListenableFuture<AbstractC795160VHe> LJFF();

    public final void LJI() {
        this.LLILLL = true;
        LIZLLL();
    }

    public ListenableFuture<C788790Uwv> LIZ() {
        C134N c134n = new C134N();
        c134n.LJIIJ(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c134n;
    }

    public boolean LIZIZ() {
        return this.LLILZIL;
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.LL = context;
                this.LLILLJJLI = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }
}
