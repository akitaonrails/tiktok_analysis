package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ITaskManagerConfig;
import com.ss.android.ugc.aweme.legoImp.TaskManagerConfigImpl;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BVK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVK {
    public static volatile C1BVK LIZJ;
    public boolean LIZ;
    public Executor LIZIZ;

    public static C1BVK LIZIZ() {
        if (LIZJ == null) {
            synchronized (C1BVK.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1BVK();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZ(Handler handler, final Callable<?> callable, int i) {
        Runnable runnable;
        ITaskManagerConfig iTaskManagerConfig;
        if (!this.LIZ) {
            Object objLIZ = C04TD.LIZ(ITaskManagerConfig.class, false);
            if (objLIZ != null) {
                iTaskManagerConfig = (ITaskManagerConfig) objLIZ;
            } else {
                if (C04TD.N1 == null) {
                    synchronized (ITaskManagerConfig.class) {
                        if (C04TD.N1 == null) {
                            C04TD.N1 = new TaskManagerConfigImpl();
                        }
                    }
                }
                iTaskManagerConfig = C04TD.N1;
            }
            if (iTaskManagerConfig != null) {
                this.LIZIZ = iTaskManagerConfig.LIZ().LIZ;
                this.LIZ = true;
            } else {
                throw new IllegalStateException("TaskManager not init");
            }
        }
        Executor executor = this.LIZIZ;
        if (handler == null) {
            final Message message = null;
            runnable = new Runnable(callable, message) { // from class: X.08lt
                public final Callable<?> LL;
                public final Message LLILLJJLI;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    Object objCall;
                    C1C7U.LIZ("TaskManager$AsyncRunnable@cd73.run");
                    try {
                        try {
                            objCall = this.LL.call();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            objCall = e;
                        }
                        Message message2 = this.LLILLJJLI;
                        if (message2 != null) {
                            message2.obj = objCall;
                            message2.sendToTarget();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TaskManager$AsyncRunnable@cd73.run");
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TaskManager[");
                    sbLIZ.append(this.LL.toString());
                    sbLIZ.append(e3.f);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LL = callable;
                    this.LLILLJJLI = message;
                }
            };
        } else {
            final Message messageObtainMessage = handler.obtainMessage(i);
            runnable = new Runnable(callable, messageObtainMessage) { // from class: X.08lt
                public final Callable<?> LL;
                public final Message LLILLJJLI;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    Object objCall;
                    C1C7U.LIZ("TaskManager$AsyncRunnable@cd73.run");
                    try {
                        try {
                            objCall = this.LL.call();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            objCall = e;
                        }
                        Message message2 = this.LLILLJJLI;
                        if (message2 != null) {
                            message2.obj = objCall;
                            message2.sendToTarget();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TaskManager$AsyncRunnable@cd73.run");
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TaskManager[");
                    sbLIZ.append(this.LL.toString());
                    sbLIZ.append(e3.f);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LL = callable;
                    this.LLILLJJLI = messageObtainMessage;
                }
            };
        }
        executor.execute(runnable);
    }
}
