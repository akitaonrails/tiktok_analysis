package androidx.work;

import X.AbstractC795160VHe;
import X.C134N;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Worker extends ListenableWorker {
    public C134N<AbstractC795160VHe> LLILZLL;

    public abstract AbstractC795160VHe LJII();

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<AbstractC795160VHe> LJFF() {
        this.LLILZLL = new C134N<>();
        this.LLILLJJLI.LIZJ.execute(new ARunnableS113S0100000_13(this, 12));
        return this.LLILZLL;
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
