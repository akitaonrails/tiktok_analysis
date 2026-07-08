package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1B75, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B75 extends C1B74 {
    public static final String LLJ = C1B75.class.getSimpleName();

    @Override // X.C1B74, X.C1B7F
    public final void LIZIZ() {
        this.LLILLL = true;
        this.LLILZIL = false;
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(LLJ, "onStartCommandOnMainThread", "Run");
        }
    }

    @Override // X.C1B74, X.C1B7F
    public final void LJ() {
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(LLJ, "onStartCommand", "Run");
        }
        LJI();
    }

    @Override // X.C1B74
    public final void LJII(Context context, ServiceConnection serviceConnection) {
        try {
            C786410Ut5.s3(context, new Intent(context, (Class<?>) DownloadService.class));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ();
            ExecutorService executorServiceLJI = C2199681B7e.LJI();
            if (executorServiceLJI != null) {
                executorServiceLJI.execute(new ARunnableS131S0100000_31(this, 145));
            }
        }
    }
}
