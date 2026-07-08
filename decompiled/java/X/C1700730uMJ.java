package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700730uMJ {
    public final synchronized void LIZ(final Runnable runnable) {
        C15O7.LIZJ(new Callable() { // from class: X.0uMK
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("Settings$Companion@88cd.settingsExecutor$1$runInBackground$1");
                runnable.run();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("Settings$Companion@88cd.settingsExecutor$1$runInBackground$1");
                return unit;
            }
        });
    }

    public final synchronized void LIZIZ(long j, final Runnable runnable) {
        C786410Ut5.LJLIIL(j, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0uMI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Settings$Companion@88cd.settingsExecutor$1$schedule$1");
                try {
                    this.LL.LIZ(runnable);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Settings$Companion@88cd.settingsExecutor$1$schedule$1");
            }
        });
    }
}
