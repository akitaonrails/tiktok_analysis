package X;

import Y.ARunnableS132S0100000_32;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18hI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class ViewTreeObserverOnDrawListenerC21352618hI implements InterfaceExecutorC21352518hH, ViewTreeObserver.OnDrawListener, Runnable {
    public final long LL = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ ComponentActivity LLILZ;

    @Override // X.InterfaceExecutorC21352518hH
    public final void LJJIL() {
        this.LLILZ.getWindow().getDecorView().removeCallbacks(this);
        C786410Ut5.B3(this.LLILZ.getWindow().getDecorView().getViewTreeObserver(), this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.LLILLJJLI;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.LL) {
                this.LLILLL = false;
                this.LLILZ.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.LLILLJJLI = null;
        C21152817qA fullyDrawnReporter = this.LLILZ.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.LIZJ) {
            try {
                z = fullyDrawnReporter.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            this.LLILLL = false;
            this.LLILZ.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C786410Ut5.B3(this.LLILZ.getWindow().getDecorView().getViewTreeObserver(), this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ViewTreeObserverOnDrawListenerC21352618hI(ComponentActivity componentActivity) {
        this.LLILZ = componentActivity;
    }

    @Override // X.InterfaceExecutorC21352518hH
    public final void LJLJL(View view) {
        if (!this.LLILLL) {
            this.LLILLL = true;
            C786410Ut5.w3(view.getViewTreeObserver(), this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LLILLJJLI = runnable;
        View decorView = this.LLILZ.getWindow().getDecorView();
        if (this.LLILLL) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new ARunnableS132S0100000_32(this, 3));
    }
}
