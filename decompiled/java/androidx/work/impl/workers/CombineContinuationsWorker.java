package androidx.work.impl.workers;

import X.AbstractC795160VHe;
import X.C795180VHg;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes10.dex */
public class CombineContinuationsWorker extends Worker {
    @Override // androidx.work.Worker
    public final AbstractC795160VHe LJII() {
        return new C795180VHg(this.LLILLJJLI.LIZIZ);
    }

    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
