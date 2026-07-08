package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.08VG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VG extends FutureTask<Object> {
    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            get();
            throw null;
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            Object[] objArr = new Object[0];
            C08VH.LIZIZ(e.toString(), C08VH.LIZJ(objArr), objArr);
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw null;
        } catch (ExecutionException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("AsyncTask$NamedFutureTask@8fe9.run");
        C2188811AlT.LIZ().append("AsyncTask.run: ");
        throw null;
    }
}
