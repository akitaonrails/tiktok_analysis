package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.1BWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BWQ implements Thread.UncaughtExceptionHandler {
    public static final C1BWR LIZJ = new C08UT<C1BWQ>() { // from class: X.1BWR
        @Override // X.C08UT
        public final Object LIZ() {
            return new C1BWQ();
        }
    };
    public final CopyOnWriteArraySet<C1BWS> LIZ = new CopyOnWriteArraySet<>();
    public final Thread.UncaughtExceptionHandler LIZIZ = Thread.getDefaultUncaughtExceptionHandler();

    public C1BWQ() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Iterator<C1BWS> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LIZIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
