package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0fEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119370fEd {
    public static final C822660WOy LIZJ = new C822660WOy(4);
    public static C1119370fEd LIZLLL;
    public boolean LIZ;
    public Executor LIZIZ;

    public static synchronized C1119370fEd LIZIZ() {
        if (LIZLLL == null) {
            LIZLLL = new C1119370fEd();
        }
        return LIZLLL;
    }

    public final void LIZ(final Handler handler, final Callable callable, final int i) {
        if (this.LIZ) {
            this.LIZIZ.execute(new Runnable() { // from class: X.05eW
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TaskManager@325f.async$1");
                    try {
                        Handler handler2 = handler;
                        if (handler2 == null) {
                            try {
                                callable.call();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            Message messageObtainMessage = handler2.obtainMessage(i);
                            try {
                                messageObtainMessage.obj = callable.call();
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                messageObtainMessage.obj = e2;
                            }
                            C786410Ut5.LJLJJL(handler, messageObtainMessage);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TaskManager@325f.async$1");
                }
            });
            return;
        }
        throw new IllegalStateException("TaskManager not init");
    }
}
